package com.company;

public class SimpleDotCom {
    // объявляем целочисленный массив для хранения адреса ячеек.
    int[] locationCells;

    // Объявляем переменную типа int для хранения количества попаданий. = 0
    int numOfHits = 0;

    // Объявляем сеттер setLocationCells(), который принимает целочисленный массив
    // Хранящий адрес трех ячеек в виде переменных типа int.
    public void setLocationCells (int[] locs){
        locationCells = locs;
    }

    // Объявляем метод checkLocationCells(), который принимает ход пользователя в качестве параметра String (1,2,3..),
    // проверяет его и возвращает результат: "Попал", "Мимо" или "Потопил".
    public String checkYourSelf (String stringGuess){

        // Получаем ход пользователя в виде строкового параметра и преобразуем в int.
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells){
            // Сравниваем ход пользователя с местоположением клетки.
            // Если угадал
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        // Если количество попаданий равно 3. Возвращаем "Потопил".
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }

        // Иначе "Мимо".
        System.out.println(result);

        return result;
    }
}
