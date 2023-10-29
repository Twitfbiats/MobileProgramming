package talion.com.example.list_affirmations.datasource

import talion.com.example.list_affirmations.R
import talion.com.example.list_affirmations.model.Affirmations

class DataSource
{

    fun data(): List<Affirmations>
    {
        return listOf<Affirmations>(Affirmations(R.string.affirmation1)
        ,Affirmations(R.string.affirmation2)
        ,Affirmations(R.string.affirmation3)
        ,Affirmations(R.string.affirmation4)
        ,Affirmations(R.string.affirmation5)
        ,Affirmations(R.string.affirmation6)
        ,Affirmations(R.string.affirmation7)
        ,Affirmations(R.string.affirmation8)
        ,Affirmations(R.string.affirmation9)
        ,Affirmations(R.string.affirmation10))
    }
}