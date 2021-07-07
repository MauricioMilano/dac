package hello;

public class Clock {
    public Clock(){

    }
    public String geraRelogioHTML(){
        String html ="<div id=\"MyClockDisplay\" class=\"clock\" onload=\"showTime()\"></div>\n";
        String css = "<style>body {\n" +
                "    background: black;\n" +
                "}\n" +
                "\n" +
                ".clock {\n" +
                "    position: absolute;\n" +
                "    top: 50%;\n" +
                "    left: 50%;\n" +
                "    transform: translateX(-50%) translateY(-50%);\n" +
                "    color: #17D4FE;\n" +
                "    font-size: 60px;\n" +
                "    font-family: Orbitron;\n" +
                "    letter-spacing: 7px;\n" +
                "   \n" +
                "\n" +
                "\n" +
                "}" +
                "\n" +
                "</style>";
        String javascript = "<script>function showTime(){\n" +
                "    var date = new Date();\n" +
                "    var h = date.getHours(); // 0 - 23\n" +
                "    var m = date.getMinutes(); // 0 - 59\n" +
                "    var s = date.getSeconds(); // 0 - 59\n" +
                "    var session = \"AM\";\n" +
                "    \n" +
                "    if(h == 0){\n" +
                "        h = 12;\n" +
                "    }\n" +
                "    \n" +
                "    if(h > 12){\n" +
                "        h = h - 12;\n" +
                "        session = \"PM\";\n" +
                "    }\n" +
                "    \n" +
                "    h = (h < 10) ? \"0\" + h : h;\n" +
                "    m = (m < 10) ? \"0\" + m : m;\n" +
                "    s = (s < 10) ? \"0\" + s : s;\n" +
                "    \n" +
                "    var time = h + \":\" + m + \":\" + s + \" \" + session;\n" +
                "    document.getElementById(\"MyClockDisplay\").innerText = time;\n" +
                "    document.getElementById(\"MyClockDisplay\").textContent = time;\n" +
                "    \n" +
                "    setTimeout(showTime, 1000);\n" +
                "    \n" +
                "}\n" +
                "\n" +
                "showTime();" +
                "</script>";
        return html+css+javascript;
    }
}
