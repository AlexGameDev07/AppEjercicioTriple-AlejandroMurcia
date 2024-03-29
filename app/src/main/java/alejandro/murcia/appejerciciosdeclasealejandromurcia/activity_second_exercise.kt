package alejandro.murcia.appejerciciosdeclasealejandromurcia

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.content.Context
import android.view.WindowManager
import androidx.fragment.app.Fragment

class activity_second_exercise : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_exercise)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

/***-Helpers-***********************************************************************************/
        //The following methods are used for hide the keyboard at the screen
        fun AppCompatActivity.hideKeyboard() {
            val view = this.currentFocus
            if (view != null) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        }

        fun Fragment.hideKeyboard() {
            val activity = this.activity
            if (activity is AppCompatActivity) {
                activity.hideKeyboard()
            }
        }
/***-Main_Code-********************************************************************************/
        val txtBase = findViewById<EditText>(R.id.txtNum)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnCalArea = findViewById<Button>(R.id.btnComprobar)
        val lbArea = findViewById<TextView>(R.id.lbÁrea)

        val objArea = Area()
        btnCalArea.setOnClickListener {

            try {
                hideKeyboard()
                if (txtBase.text.isNotEmpty() == true && txtAltura.text.isNotEmpty()) {
                    val Area = objArea.CalcularArea(
                        txtBase.text.toString().toDouble(),
                        txtAltura.text.toString().toDouble()
                    )
                    lbArea.text = "El área de su triángulo es: $Area"
                } else {
                    Toast.makeText(
                        this@activity_second_exercise,
                        "Campos vacíos",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } catch (ex: Exception) {
                Toast.makeText(this@activity_second_exercise, ex.message, Toast.LENGTH_SHORT).show()

            }


        }


    }
}