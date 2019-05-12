package iwabuchi.naoki.techacademy.calc5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val intent = Intent(this, SecondActivity::class.java)


        if (ed1.text.isEmpty() || ed2.text.isEmpty()) {

              Snackbar.make(v, "数値を入れてください", Snackbar.LENGTH_INDEFINITE)
        }

        //     findViewById(R.id.button)
        //     toastMessage = "数値を入力してください"
        //   var VALUUE = value2
        //     R.id.button1 -> intent.putExtra("VALUE2")
        //     R.id.button2 -> intent.putExtra("VALUE2")
        //     R.id.button3 -> intent.putExtra("VALUE2")
        //     R.id.button4 -> intent.putExtra("VALUE2")

     else {
            val a: Double = ed1.text.toString().toDouble()
            val b: Double = ed2.text.toString().toDouble()

            when (v.id) {
                R.id.button1 -> intent.putExtra("VALUE1", a + b)
                R.id.button2 -> intent.putExtra("VALUE1", a - b)
                R.id.button3 -> intent.putExtra("VALUE1", a * b)
                R.id.button4 -> intent.putExtra("VALUE1", a / b)
            }


            startActivity(intent)

        }}}



