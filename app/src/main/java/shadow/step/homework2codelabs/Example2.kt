package shadow.step.homework2codelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 *
 */
class Example2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example2)
        answersExample2()
    }
    /**
     * Test
     */
    private fun answersExample2(){
        val question1 = """How many views can you use within a ScrollView?"""
        val question2 = """Which XML attribute do you use in a LinearLayout to show views side by side?"""
        val question3 = """Which XML attribute do you use to define the width of the LinearLayout inside the scrolling view?"""

        val answers = arrayOf("As many as you need", "horizontal", "AVD Manager", "wrap_content")
        Log.d("questions", question1 + " answer is: ${answers[0]}" )
        Log.d("questions", question2 + " answer is: ${answers[1]}" )
        Log.d("questions", question3 + " answer is: ${answers[2]}" )
    }
}