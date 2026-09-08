package Session06;

public class TextProcessor {
    public static void main(String[] args) {
        //countAndPrintWords("Here goes nothing");
        //reverseText("Ahmed");
        addSpaces("HereGoesNothing");
    }

    public static void countAndPrintWords(String text) {
        String[] words = text.split("");
        System.out.println(String.format("Your Text Contains %d words", words.length));

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseText(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

    }

    public static void addSpaces(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i = 1; i < modifiedText.length(); i++) {
            if (Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }


        }
        System.out.println(modifiedText);

    }
}