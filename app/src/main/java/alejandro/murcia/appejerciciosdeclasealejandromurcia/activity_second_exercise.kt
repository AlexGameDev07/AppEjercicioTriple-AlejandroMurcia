package alejandro.murcia.appejerciciosdeclasealejandromurcia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_second_exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_exercise)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtBase = findViewById<EditText>(R.id.txtBase)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnCalArea = findViewById<Button>(R.id.btnCalcularArea)
        val lbArea = findViewById<TextView>(R.id.lbÁrea)

        val objArea = Area()
        btnCalArea.setOnClickListener {
            val Area = objArea.CalcularArea(txtBase.text.toString().toDouble(), txtAltura.text.toString().toDouble())
            lbArea.text = "El área de su triángulo es: $Area"
        }
    }
}