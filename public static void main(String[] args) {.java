    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] commandArray = command.split(" ");

        if (commandArray.length == 1) {
            if (commandArray[0].equals("start")) {
                start(1);
            } else {
                System.out.println("Ошибка: Неверное количество игроков");
            }
        } else if (commandArray.length == 2) {
            try {
                int players = Integer.parseInt(commandArray[1]);
                if (players >= 2 && players <= 4) {
                    start(players);
                } else {
                    System.out.println("Ошибка: Неверное количество игроков");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверное количество игроков");
            }
        } else {
            System.out.println("Ошибка: Неверное количество игроков");
        }
    }

    private static void start(int players) {
        String[] colors = {"R", "G", "B", "W"};
        String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] cards = new String[40];
        int index = 0;
        for (String color : colors) {
            for (String value : values) {
                cards[index] = color + value;
                index++;
            }
        }

        for (int i = cards.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random()  (i + 1));
            String temp = cardsi;
            cardsi = cardsrandomIndex;
            cardsrandomIndex = temp;
        }

        for (int i = 0; i < players; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(cardsi * 4 + j);
                if (j < 3) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}