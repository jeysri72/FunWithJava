package java.fun;

import java.util.Random;

public class Story {
    public static void main(String[] args) {

        String[] sentenceStarter = {"About 100 years ago", " In the 20 BC", "Once upon a time"};
        String[] character = {" there lived a king.", " there was a man named Jack.",
                " there lived a farmer."};
        String[] time = {" One day", " One full-moon night"};
        String[] storyPlot = {" he was passing by", " he was going for a picnic to "};
        String[] place = {" the mountains", " the garden"};
        String[] secondCharacter = {" he saw a man", " he saw a young lady"};
        String[] age = {" who seemed to be in late 20s", " who seemed very old and feeble"};
        String[] work = {" searching something.", " digging a well on roadside."};

        Random random = new Random();
// Selecting an item from each list and concatenating them.
        System.out.print(sentenceStarter[random.nextInt(sentenceStarter.length) ] +
                character [ random.nextInt(character.length)] +
                time[random.nextInt(time.length)] +
                storyPlot[random.nextInt(storyPlot.length)] +
                place[random.nextInt(place.length)]  +
                secondCharacter[random.nextInt(secondCharacter.length)] +
                age[random.nextInt(age.length)] +
                work[random.nextInt(work.length)] );
    }
}
