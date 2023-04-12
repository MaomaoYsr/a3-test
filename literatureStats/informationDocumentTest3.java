package literatureStats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class informationDocumentTest3 {

        private InformationDocument<FrequencyDocument> infoDoc;

        @BeforeEach
        public void setUp() throws InstantiationException, IllegalAccessException {
                infoDoc = new InformationDocument<>(FrequencyDocument.class, "input/macbeth.txt");
        }

        @Test
        public void testGetTopNWordsEnumerated() {
                List<String> expectedTopNWords = Arrays.asList(" 919\tthe\n", " 638\tand\n", " 482\tof\n");

                List<String> topNWords = infoDoc.getTopNWordsEnumerated(3, SortingOrder.DESCENDING);

                assertEquals(expectedTopNWords, topNWords, "The top N words should match the expected list.");
        }
}
