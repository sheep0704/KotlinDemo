package com.sdk.immqy.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * 测试 Kotlin
 * @author Karl-dujinyang
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()//初始化
        testValue()//赋值和事件
    }

    private fun testValue() {
        btnWs!!.setOnClickListener {
            tvWs!!.text = "I'm immqy"
            edtWs!!.setText("Karl-dujinyang")
        }
    }

    private var btnWs: Button? = null
    private var tvWs: TextView? = null
    private var edtWs: EditText? = null

    private fun initView() {
        btnWs = this.findViewById(R.id.btn_hw) as Button
        tvWs = this.findViewById(R.id.tx_hw) as TextView
        edtWs = this.findViewById(R.id.edt_hw) as EditText
    }


}
