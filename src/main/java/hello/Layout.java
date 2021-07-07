package hello;

public class Layout {
    public static String createLayout(){
        String cssLayout = "<style>" +
                "p, h1 {" +
                "    color: #17D4FE;\n" +
                "    font-size: 60px;\n" +
                "    font-family: Tourney;\n" +
                "    letter-spacing: 7px;\n" +
                "    text-align: center;\n" +
                "}" +
                "body {\n" +
                "  background: black;\n" +
                "}" +

                "</style>";
        return cssLayout;
    }
}
