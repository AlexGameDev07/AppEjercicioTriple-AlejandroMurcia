package alejandro.murcia.appejerciciosdeclasealejandromurcia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_first_exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_exercise)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtFechaNacimiento = findViewById<EditText>(R.id.txtBase)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularArea)
        val lbEdad = findViewById<TextView>(R.id.lbEdad)

        btnCalcular.setOnClickListener {
            val objEdad = Edad()
            val edad = objEdad.CalcularEdad(txtFechaNacimiento.text.toString().toInt())
            lbEdad.text = "Tu edad es: $edad años"
        }


    }
}