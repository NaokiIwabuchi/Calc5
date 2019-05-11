package iwabuchi.naoki.techacademy.calc5


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getIntExtra("VALUE1",0)
       // val value1 = intent.getIntExtra("VALUE2",0)
      //  val value1 = intent.getIntExtra("VALUE3",0)
      //  val value1 = intent.getIntExtra("VALUE4",0)

         tv1.text ="$(value1)"

        }
    }





