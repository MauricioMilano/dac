package hello;

public class Layout {
    public static String createLayout(){
        String cssLayout = "<style>" +
                "p, h1 {" +
                "    color: #17D4FE;\n" +
                "    font-size: 60px;\n" +
                "    font-family: Indie Flower;\n" +
                "    letter-spacing: 7px;\n" +
                "    text-align: center;\n" +
                "}" +
                "body {\n" +
                "  background: black;\n" +
                "}" +

                "</style>";
        return cssLayout;
    }
    public static String importFonts(){
       return "<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
                "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
                "<link href=\"https://fonts.googleapis.com/css2?family=Tourney:wght@100&display=swap\" rel=\"stylesheet\">" +
               "<link href=\"https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap\" rel=\"stylesheet\">";
    }
}
