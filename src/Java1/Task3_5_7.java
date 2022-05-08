package Java1;

public class Task3_5_7 {

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    interface TextAnalyzer {
        Label processText(String text);
    }


    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer i : analyzers) {
            if (i.processText(text) != Label.OK) {
                return i.processText(text);
            }
        }
        return Label.OK;
    }

    abstract class KeywordAnalyzer implements TextAnalyzer {

        private String[] keywords;


        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            for (String i : getKeywords()) {
                if (text.contains(i)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

     public class SpamAnalyzer extends KeywordAnalyzer {

        private final String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    public class NegativeTextAnalyzer extends KeywordAnalyzer {

        private final String[] keywords = new String[]{":(", "=(", ":|"};

        public NegativeTextAnalyzer() {
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }

    }

    public class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            } else {
                return Label.OK;
            }
        }

    }

    public static void main(String[] args) {

//        String[] badWords = {"������", "������"};
//        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
//        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
//        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(25);
//        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
//        Task3_5_7 textFilters = new Task3_5_7();
//        System.out.println(textFilters.checkLabels(analyzers, "������� ����� ��� �����.")); //������� ��
//        System.out.println(textFilters.checkLabels(analyzers, "������ ����� ��� �����, ��� ��� ��� :( ����.")); //NEGATIVE_TEXT �� ��������
//        System.out.println(textFilters.checkLabels(analyzers, "������ ����� ��� �����, ������ ������.")); //SPAM �� ����� �����, ������ �� �����, ������-��� � ������� �����
//        System.out.println(textFilters.checkLabels(analyzers, "� ��� ���, ��� �� ������ �������� � ������������. �� ��, ������..."));//TOO_LONG ������-��� ����� 25 ��������

    }

}
