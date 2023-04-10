package literatureStats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class informationDocumentTest1 {
    private InformationDocument<FrequencyDocumentPG> infoDoc;

    @BeforeEach
    public void setUp() throws InstantiationException, IllegalAccessException {
        infoDoc = new InformationDocument<>(FrequencyDocumentPG.class, "input/macbeth.txt");
    }

    @Test
    public void testGetTopNWordsDescendingPG() {
        List<String> topNWords = infoDoc.getTopNWords(25, SortingOrder.DESCENDING);
        String[] expectedTopWords = new String[]{"the", "and", "to", "i", "of", "macbeth", "a", "that", "d", "in", "you", "s", "my", "is", "not", "with", "it", "his", "be", "he", "have", "your", "but", "our", "what"};
        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i));
        }
    }
    @Test
    public void testGetTopNWordsReversedPG() {
        List<String> topNWords = infoDoc.getTopNWords(25, SortingOrder.REVERSED);
        String[] expectedTopWords = new String[]{"the", "and", "to", "i", "of", "macbeth", "a", "that", "d", "in", "you", "s", "my", "is", "not", "with", "it", "his", "be", "he", "have", "your", "but", "our", "what"};
        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i));
        }
    }
    @Test
    public void testGetTopNWordsAscendingPG() {
        List<String> topNWords = infoDoc.getTopNWords(25, SortingOrder.ASCENDING);
        String[] expectedTopWords = new String[]{"cancel", "hall", "pretend", "imperfect", "commends", "unprovokes", "legs", "warrant", "sake", "untitled", "hemlock", "temper", "statute", "poorly", "pronounc", "perseverance", "turk", "gold", "pies", "commission", "quiet", "reigns", "elves", "address", "salt"};
        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i));
        }
    }

    @Test
    public void testGetTopNWordsNotReversedPG() {
        List<String> topNWords = infoDoc.getTopNWords(25, SortingOrder.NOT_REVERSED);
        String[] expectedTopWords = new String[]{"cancel", "hall", "pretend", "imperfect", "commends", "unprovokes", "legs", "warrant", "sake", "untitled", "hemlock", "temper", "statute", "poorly", "pronounc", "perseverance", "turk", "gold", "pies", "commission", "quiet", "reigns", "elves", "address", "salt"};
        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i));
        }
    }
    @Test
    public void testGetTopNFrequencyWordsAscendingPG() {
        List<FrequencyWord> topNWords1 = infoDoc.getTopNFrequencyWords(25, SortingOrder.ASCENDING);
        String[] expectedTopWords = new String[]{"cancel", "hall", "pretend", "imperfect", "commends", "unprovokes", "legs", "warrant", "sake", "untitled", "hemlock", "temper", "statute", "poorly", "pronounc", "perseverance", "turk", "gold", "pies", "commission", "quiet", "reigns", "elves", "address", "salt"};
        int[] expectedTopFrequencies = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < topNWords1.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords1.get(i).getNormalised());
            assertEquals(expectedTopFrequencies[i], topNWords1.get(i).getCount());
        }
    }

        @Test
        public void testGetTopNFrequencyWordsDescendingPG() {
            List<FrequencyWord> topNWords = infoDoc.getTopNFrequencyWords(25, SortingOrder.DESCENDING);
            String[] expectedTopWords1 = new String[]{"the", "and", "to", "i", "of", "macbeth", "a", "that", "d", "in", "you", "s", "my", "is", "not", "with", "it", "his", "be", "he", "have", "your", "but", "our", "what"};
            int[] expectedTopFrequencies1 = new int[]{730, 571, 384, 380, 358, 287, 277, 238, 237, 231, 206, 202, 192, 189, 165, 159, 153, 151, 141, 124, 123, 122, 121, 119, 116};

            for (int i = 0; i < topNWords.size(); i++) {
                assertEquals(expectedTopWords1[i], topNWords.get(i).getNormalised());
                assertEquals(expectedTopFrequencies1[i], topNWords.get(i).getCount());
            }
        }
    @Test
    public void testGetTopNFrequencyWordsReversedPG() {
        List<FrequencyWord> topNWords = infoDoc.getTopNFrequencyWords(25, SortingOrder.REVERSED);
        String[] expectedTopWords1 = new String[]{"the", "and", "to", "i", "of", "macbeth", "a", "that", "d", "in", "you", "s", "my", "is", "not", "with", "it", "his", "be", "he", "have", "your", "but", "our", "what"};
        int[] expectedTopFrequencies1 = new int[]{730, 571, 384, 380, 358, 287, 277, 238, 237, 231, 206, 202, 192, 189, 165, 159, 153, 151, 141, 124, 123, 122, 121, 119, 116};

        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords1[i], topNWords.get(i).getNormalised());
            assertEquals(expectedTopFrequencies1[i], topNWords.get(i).getCount());
        }
    }
    @Test
    public void testGetTopNFrequencyWordsNotReversedPG() {
        List<FrequencyWord> topNWords = infoDoc.getTopNFrequencyWords(25, SortingOrder.NOT_REVERSED);
        String[] expectedTopWords2 = new String[]{"cancel", "hall", "pretend", "imperfect", "commends", "unprovokes", "legs", "warrant", "sake", "untitled", "hemlock", "temper", "statute", "poorly", "pronounc", "perseverance", "turk", "gold", "pies", "commission", "quiet", "reigns", "elves", "address", "salt"};
        int[] expectedTopFrequencies2 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords2[i], topNWords.get(i).getNormalised());
            assertEquals(expectedTopFrequencies2[i], topNWords.get(i).getCount());
        }
    }
}



