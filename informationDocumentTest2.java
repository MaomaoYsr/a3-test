package literatureStats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class informationDocumentTest2 {
    private InformationDocument<FrequencyDocument> infoDoc;

    @BeforeEach
    public void setUp() throws InstantiationException, IllegalAccessException {
        infoDoc = new InformationDocument<>(FrequencyDocument.class, "input/macbeth.txt");
    }

    @Test
    public void testGetTopNFrequencyWordsDescending() {
        List<FrequencyWord> topNWords = infoDoc.getTopNFrequencyWords(25, SortingOrder.DESCENDING);
        String[] expectedTopWords = new String[]{"the", "and", "of", "to", "i", "a", "in", "macbeth", "you", "that", "d", "s", "is", "with", "not", "my", "it", "be", "this", "his", "for", "your", "have", "he", "all"};
        int[] expectedTopFrequencies = new int[]{919, 638, 482, 466, 380, 336, 292, 291, 281, 253, 238, 211, 211, 206, 193, 192, 168, 160, 151, 151, 137, 131, 130, 127, 126};

        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i).getNormalised());
            assertEquals(expectedTopFrequencies[i], topNWords.get(i).getCount());
        }
    }
    @Test
    public void testGetTopNFrequencyWordsAscending() {
        List<FrequencyWord> topNWords = infoDoc.getTopNFrequencyWords(25, SortingOrder.ASCENDING);
        String[] expectedTopWords = new String[]{"cancel", "hall", "pretend", "imperfect", "commends", "unprovokes", "legs", "warrant", "sake", "untitled", "hemlock", "temper", "statute", "poorly", "accessible", "pronounc", "perseverance", "turk", "elect", "gold", "pies", "commission", "quiet", "reigns", "elves"};
        int[] expectedTopFrequencies = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < topNWords.size(); i++) {
            assertEquals(expectedTopWords[i], topNWords.get(i).getNormalised());
            assertEquals(expectedTopFrequencies[i], topNWords.get(i).getCount());
        }
    }
}