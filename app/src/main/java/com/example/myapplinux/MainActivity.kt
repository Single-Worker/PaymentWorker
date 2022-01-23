package com.example.myapplinux

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplinux.databinding.ActivityMainBinding
import kotlin.math.max


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonResult.setOnClickListener {

            when (bindingClass.edValue.text.toString()) {
                Constance.CLEANER -> {
                    val tempText = "Получите Вашу ${Constance.CLEANER_PAYMENT}"
                    if (bindingClass.edPassword.text.toString() == Constance.CLEANER_PASSWORD)
                        bindingClass.tvResult.text = tempText
                    else
                        bindingClass.tvResult.text = "В доступе оказано"
                }
                Constance.ENGINEER -> {
                    val tempText = "Получите Ваши ${Constance.ENGINEER_PAYMENT}"
                    if (bindingClass.edPassword.text.toString() == Constance.ENGINEER_PASSWORD)
                    bindingClass.tvResult.text = tempText
                    else
                        bindingClass.tvResult.text = "В доступе оказано"
                }
                Constance.DIRECTOR -> {
                    val tempText = "Получите Ваши ${Constance.DIRECTOR_PAYMENT}"
                    if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD)
                    bindingClass.tvResult.text = tempText
                    else
                        bindingClass.tvResult.text = "В доступе оказано"
                }
                else -> {
                    bindingClass.tvResult.text = "нет такого работника"
                }
            }
            bindingClass.tvResult.visibility = View.VISIBLE
        }
    }
}