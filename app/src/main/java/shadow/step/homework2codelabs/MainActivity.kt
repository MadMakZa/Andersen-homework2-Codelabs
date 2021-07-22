package shadow.step.homework2codelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "Hello from MainActivity onCreate()")
        init()

    }
    private fun init(){
        answersExample1()
    }

    /**
     * Example 1
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

}