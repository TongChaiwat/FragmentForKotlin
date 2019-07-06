package com.example.fragmentforkotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.*

class FM1 : Fragment() {

    private lateinit var name: String
    private var age: Int = 0

    companion object {
        fun newInstance(name: String, age: Int): FM1 {
            val fragment = FM1()
            val args = Bundle()
            args.putString("name", name)
            args.putInt("age", age)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        name = arguments?.getString("name", "") ?: "t"
        age = arguments?.getInt("age", 0) ?: 88
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_name.text = name
        tv_age.text = age.toString()
        et_1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        btn_1.setOnClickListener {
            tv_name2.text = et_1.text.toString()
        }
    }
}