package shadow.step.homework2codelabs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Counter
 */

class Example1 : AppCompatActivity() {

    private lateinit var btnToast: Button
    private lateinit var btnCount: Button
    private lateinit var btnZero: Button
    private lateinit var tvCount: TextView
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example1)
        //widgets
        btnToast = findViewById(R.id.button1)
        btnCount = findViewById(R.id.button2)
        btnZero = findViewById(R.id.button3)
        tvCount = findViewById(R.id.show_count)
        answersExample1()
    }
    /**
     * mini test
     */
    private fun answersExample1(){
        val question1 = """What is the name of the layout file for the main activity?"""
        val question2 = """What is the name of the string resource that specifies the application's name?"""
        val question3 = """Which tool do you use to create a new emulator?"""
        val question4 = """Assume that your app includes this logging statement Log.i?"""

        val answers = arrayOf("activity_main.xml", "app_name", "AVD Manager", "Info")
        Log.d("questions", question1 + " answer is: ${answers[0]}" )
        Log.d("questions", question2 + " answer is: ${answers[1]}" )
        Log.d("questions", question3 + " answer is: ${answers[2]}" )
        Log.d("questions", question4 + " answer is: ${answers[3]}" )
    }

    fun showToast(view: View) {
        Toast.makeText(this, "Hello Toast!!!", Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        tvCount.text = mCount.toString()
        btnZero.setBackgroundColor(Color.MAGENTA)
    }

    fun reset(view: View) {
        if (mCount > 0){
            mCount = 0
            tvCount.text = mCount.toString()
            btnZero.setBackgroundColor(Color.GRAY)
        }
    }
}