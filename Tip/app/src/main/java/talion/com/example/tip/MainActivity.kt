package talion.com.example.tip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import talion.com.example.tip.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculate.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val cost = binding.input1.text.toString().toDouble()

        val option = binding.radioGroup.checkedRadioButtonId
        val percent: Double
        when (option)
        {
            R.id.option_perfect -> percent = 0.2
            R.id.option_pretty_good -> percent = 0.15
            else -> percent = 0.1
        }

        var tipAmount = cost*percent;
        tipAmount = if (binding.switchRoundUp.isChecked) ceil(tipAmount) else tipAmount
        val tipMoney = NumberFormat.getCurrencyInstance().format(tipAmount)

        binding.result.text = getString(R.string.tip_amount, tipMoney)
    }
}