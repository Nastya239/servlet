package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates reply based on random selection from the initial list of replies
 *
 * @author Anna Khasanova
 */
public class DefaultReplyGenerator implements ReplyGenerator {
    
    private List<String> answers = new ArrayList<String>();
    
    public DefaultReplyGenerator() {
    	answers.add("It's good idea");
        answers.add("You can try...");
        answers.add("No, don't do it");
        answers.add("Yes, of course");
        answers.add("You can, but sooo carefully");
        answers.add("Your question has been sent to the FSB. Wait for you drove");
        }
    
    
   // @Override
    public String generate() {
        Random random = new Random();
        int selected = random.nextInt(answers.size());
        return answers.get(selected);
    }
}
