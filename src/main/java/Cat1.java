public class Cat1 {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] catArt = {
                "\u001B[38;2;255;206;158m _______________________________________________\u001B[0m",
                "\u001B[38;2;255;206;158m          ('''')      )     (\u001B[0m",
                "\u001B[38;2;255;206;158m           `--'      .`_.=._'.\u001B[0m",
                "\u001B[38;2;255;206;158m                 --..__::Y::__..--\u001B[0m",
                "\u001B[38;2;255;206;158m                __..---' A `---..__\u001B[0m",
                "\u001B[38;2;255;206;158m                    :`-=9 9=-':\u001B[0m",
                "\u001B[38;2;255;206;158m                    (`._:|:_.')\u001B[0m",
                "\u001B[38;2;255;206;158m                    |\"/  `  \\\"|\u001B[0m",
                "\u001B[38;2;255;206;158m                    |/       \\|\u001B[0m"
        };

        for (String line : catArt) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
