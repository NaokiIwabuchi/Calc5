package iwabuchi.naoki.techacademy.calc5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                button1.setOnClickListener(this)

            }

            override fun onClick(v: View?) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", 10)
                intent.putExtra("VALUE2", 20)
                startActivity(intent)
            }
        }


