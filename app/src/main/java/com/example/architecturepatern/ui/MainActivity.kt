package com.example.architecturepatern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.architecturepatern.FakeApiService
import com.example.architecturepatern.FakeDataBase
import com.example.architecturepatern.R

import com.example.architecturepatern.databinding.ActivityMainBinding
import com.example.architecturepatern.model.User
import com.example.architecturepatern.model.Wisdom
import com.example.architecturepatern.presenter.MainPresenter
import com.example.architecturepatern.viewModel.MainViewModel

class MainActivity : AppCompatActivity()  /*IMainView*/ {
    lateinit var binding: ActivityMainBinding

    //private val mainPresenter = MainPresenter()
    private val viewModel: MainViewModel by viewModels()
    val api = FakeApiService()
    val database = FakeDataBase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
       // setContentView(binding.root)
        setUp()

        //       fetchUserInfo()
    }

    /*override fun onUserInfoSuccess(user: User) {
        binding.textUserName.text = user.userName
    }

    override fun onWisdomSuccess(wisdom: Wisdom) {

        binding.apply {
            textViewDate.text =wisdom.publishDate
            textViewContent.text = wisdom.content
        }

    }*/

    private fun setUp() {

        viewModel.getUserInfo()

        // mainPresenter.view = this
        // mainPresenter.getUserInfo()
        binding.buttonFetchWisdom.setOnClickListener {
            viewModel.getAWisdom()
            //   mainPresenter.getAWisdom()
        }
        viewModel.currentUser.observe(this) {

            binding.textUserName.text = it.userName
        }

        viewModel.wisdom.observe(this) {

            binding.apply {

                textViewDate.text = it.publishDate
                textViewContent.text = it.content
            }
        }
    }

    /*  fun fetchAWisdom(view: View) {
          val result = api.getRandomWisdom()
          binding.apply {

              textViewDate.text = result.publishDate
              textViewContent.text = result.content
          }

      }

      private fun fetchUserInfo() {

          val result = database.getCurrentUser()
          binding.textUserName.text = result.userName
      }*/
}