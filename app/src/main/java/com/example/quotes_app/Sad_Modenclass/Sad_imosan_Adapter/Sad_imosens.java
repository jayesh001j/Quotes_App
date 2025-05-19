package com.example.quotes_app.Sad_Modenclass.Sad_imosan_Adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_app.R;
import com.example.quotes_app.Sad_Modenclass.Sad_moden_class;
import com.example.quotes_app.databinding.ActivitySadImosensBinding;

import java.util.ArrayList;

public class Sad_imosens extends AppCompatActivity {

    RecyclerView risi2;
    ArrayList<Sad_moden_class> list;
    ActivitySadImosensBinding binding;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySadImosensBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        risi2 = binding.risi2;
        list = new ArrayList<>();

        String QUOTE_TEXT = getIntent().getStringExtra("QUOTE_TEXT");



        risi2.setHasFixedSize(true);
        risi2.setLayoutManager(new LinearLayoutManager(this));

        Sad_Adapter sadAdapter = new Sad_Adapter(this, list);
        risi2.setAdapter(sadAdapter);

        populateListBasedOnQuoteText(QUOTE_TEXT);
    }

    void populateListBasedOnQuoteText(String quoteText) {

        if (quoteText != null) {
            switch (quoteText) {
                case "Sad":
                    list.add(new Sad_moden_class(R.drawable.s1, "A smile is happiness you'll find right under your nose.", "-Tom Wilson"));
                    list.add(new Sad_moden_class(R.drawable.s1, "Because of your smile, you make life more beautiful.", "-Thich Nhat Hanh"));
                    list.add(new Sad_moden_class(R.drawable.s1, "A smile is the best makeup any girl can wear.", "- Marilyn Monroe"));
                    list.add(new Sad_moden_class(R.drawable.s1, "I am not getting better but at" + "Least I haven’t killed myself", "- Marilyn"));
                    list.add(new Sad_moden_class(R.drawable.s1, "“I’m constantly in awe of the work ethic of the human heart It keeps beating though it’s broken”", "- Laura Chouette"));
                    list.add(new Sad_moden_class(R.drawable.s1, "“But love has a way of revealing itself in the most explicit manner", "- Raw Thoughts"));
                    list.add(new Sad_moden_class(R.drawable.s1, "Blessed are you for having cried.", "-Rathnakumar"));
                    list.add(new Sad_moden_class(R.drawable.s1, "Darkness strikes horror in their heart.", "- Charcuterie "));
                    break;

                case "Alone":
                    list.add(new Sad_moden_class(R.drawable.s2, "Peril, loneliness, an uncertain future, are not oppressive", "-Brontë"));
                    list.add(new Sad_moden_class(R.drawable.s2, "Music was my refuge. I could crawl into the space between", "-Angelou"));
                    list.add(new Sad_moden_class(R.drawable.s2, "All I ever wanted was to reach out and touch another human being", "-Tahereh"));
                    list.add(new Sad_moden_class(R.drawable.s2, "I would rather sit on a pumpkin and have it all to myself, than be", "-Thoreau"));
                    list.add(new Sad_moden_class(R.drawable.s2, "Hope is important because it can make the present", "-Nhất Hạnh"));
                    list.add(new Sad_moden_class(R.drawable.s2, "I wish I could show you when you are lonely or in darkness", "-Hafiz"));
                    list.add(new Sad_moden_class(R.drawable.s2, "Being solitary is being alone well: being alone", "-Koller"));
                    list.add(new Sad_moden_class(R.drawable.s2, "surprise to finally discover how unlonely being alone can be", "-Ellen"));
                    break;


                case "Motivation":
                    list.add(new Sad_moden_class(R.drawable.background_m, "To live is the rarest thing in the world. Most people exist, that is all.", "-Oscar Wilde"));
                    list.add(new Sad_moden_class(R.drawable.background_m, "That it will never come again is what makes life so sweet.", "-Dickinson"));
                    list.add(new Sad_moden_class(R.drawable.background_m, "It is never too late to be what you might have been.", "-George"));
                    list.add(new Sad_moden_class(R.drawable.background_m, "To be yourself in a world that is constantly trying", "-Emerson"));
                    list.add(new Sad_moden_class(R.drawable.background_m, "'Pain is inevitable. Suffering is optional.", "-Murakami"));
                    list.add(new Sad_moden_class(R.drawable.background_m, "Be kind, for everyone you meet is fighting a hard battle.", "-Shakespeare"));
                    break;

                case "Love":
                    list.add(new Sad_moden_class(R.drawable.s3, "Love has nothing to do with what you are expecting to get–only.", "-Katharine"));
                    list.add(new Sad_moden_class(R.drawable.s3, "Love is patient, love is kind. It does not envy, it does not boast.", "-Corinthians"));
                    list.add(new Sad_moden_class(R.drawable.s3, "The only thing we never get enough of is love; and the only..", "-Henry Miller"));
                    list.add(new Sad_moden_class(R.drawable.s3, "TNobody has ever measured, even poets, how much a heart can hold.", "-Zelda Fitzgerald"));
                    list.add(new Sad_moden_class(R.drawable.s3, "I am grateful that you were born, that your love is mine..", "- Mark Twain"));
                    list.add(new Sad_moden_class(R.drawable.s3, "Have enough courage to trust love one more time and always one more time..", "- Maya Angelou"));
                    break;

                case "Attitude":
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "A happy person is not a person in a certain set of circumstances", "-J. Peter"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "Anger is always more harmful than the insult that caused it.", "-Chinese Proverb"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "He who flings mud, loses a lot of ground.", "-Anonymous"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "A fool gives full vent to his anger, but a wise man keeps himself under control", "-Proverbs 29:11"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "Anger helps strengthen out a problem like a fan helps straighten.", "-Susan Mancotte"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "We can shoot rockets into space but we can’t cure anger or discontent", "-Susan Mancotte"));
                    break;

                case "Angry":
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "Read, read, read. Read everything – trash, classics, good and bad", "-William"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, "A good writer possesses not only his own spirit but also", "-Nietzsche"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " For a writer life consists of either writing or thinking about writing.", "-Ionesco"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " Anger makes you smaller, while forgiveness forces you to grow beyond what you were.", "-Carter-Scott"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " Holding on to anger, resentment and hurt only gives you tense muscles, a headach.", "-Joan Lunden"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " When you feel “dog tired” at night, it may be because you growled all day.", "-Anonymous"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " Anger is never without a reason, but seldom a good one..", "- Benjamin Franklin"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " Anger makes dull men witty, but it keeps them poor.", "- Elizabeth I"));
                    list.add(new Sad_moden_class(R.drawable.attitude_b, " Never get angry. Never make a threat. Reason with people.", "-  Chinese Proverb"));
                    break;

                case "Gym":
                    list.add(new Sad_moden_class(R.drawable.gym_b, "The strongest principle of growth lies in the human choice", "-developing"));
                    list.add(new Sad_moden_class(R.drawable.gym_b, "If there's a book that you want to read, but it hasn't been.", "-Toni Morrison"));
                    list.add(new Sad_moden_class(R.drawable.gym_b, "Do not hoard what seems good for a later place in the book", "-Annie Dillard"));
                    list.add(new Sad_moden_class(R.drawable.gym_b, "You can always edit a bad page. You can't edit a blank page", "-Jodi Picoult"));
                    list.add(new Sad_moden_class(R.drawable.gym_b, "You don't start out writing good stuff. You start out writing", "- Octavia E. Butler"));
                    list.add(new Sad_moden_class(R.drawable.gym_b, "I am not at all in a humour for writing; I must write on until.", "- Jane Austen"));
                    break;

                case "Cute":
                    list.add(new Sad_moden_class(R.drawable.s7, "Trust our heart if the seas catch fire, live by love though ", "-E. E. Cummings"));
                    list.add(new Sad_moden_class(R.drawable.s7, "Maybe it's not about having a beautiful day, but about finding beautiful", "- Anna White"));
                    list.add(new Sad_moden_class(R.drawable.s7, "Keep away from people who try to belittle your ambitions", "- Mark Twain"));
                    list.add(new Sad_moden_class(R.drawable.s7, "Don't bend; don't water it down; don't try to make it ", "- Franz Kafka"));
                    list.add(new Sad_moden_class(R.drawable.s7, "I hope that in this year to come, you make mistakes. Because if you are making mistakes", "- Neil Gaiman"));
                    list.add(new Sad_moden_class(R.drawable.s7, "Focus more on your desire than on your doubt, and the dream will take care of itself.", "- Mark Twain"));
                    list.add(new Sad_moden_class(R.drawable.s7, "he strongest principle of growth lies in the human choice", "- George Eliot"));
                    break;

                case "Creative":
                    list.add(new Sad_moden_class(R.drawable.s8, "We are what we repeatedly do. Excellence, then, is not an act, but a habit", "-Aristotle"));
                    list.add(new Sad_moden_class(R.drawable.s8, "If I waited for perfection, I would never write a word.'", "-Anne Frank"));
                    list.add(new Sad_moden_class(R.drawable.s8, "I want to taste and glory in each day, and never be afraid to experience pain.", "-Sylvia Plath"));
                    list.add(new Sad_moden_class(R.drawable.s8, "The most common way people give up their power is by thinking they don't have any.", "- Alice Walker"));
                    list.add(new Sad_moden_class(R.drawable.s8, "I can be changed by what happens to me. But I refuse to be reduced by it.", "-Maya Angelou"));
                    list.add(new Sad_moden_class(R.drawable.s8, "One day I will find the right words, and they will be simple.", "-Jack Kerouac"));
                    break;

                case "Aswsome":
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "“your thoughts don’t change, your results won’t change.", "-Stephen"));
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "Amateurs sit and wait for inspiration, the rest of us just get up and go to work", "-King"));
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "Life is tough my darling, but so are you", "-Henry"));
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "Appreciation is a wonderful thing. It makes what is excellent", "-Voltaire"));
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "We are all broken, that's how the light gets in.", "-Hemingway"));
                    list.add(new Sad_moden_class(R.drawable.aswsome_b, "Don't let your happiness depend on something you may lose.", "-power Lewis"));
                    break;

            }
        }
    }
}
