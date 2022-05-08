package Java1;

public class Task2_4_18 {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] mainArr = new StringBuilder[roles.length];
        String shift = "\n";
        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder roleTemp = new StringBuilder();
        StringBuilder phraseTemp = new StringBuilder();
        int countString = 0; //счетчик символа в строке
        int numberRole = 0; //номер элемента основного массива с ролью

        //Записываем роли в итоговый массив. С ":" и отступом
        for (int n = 0; n < mainArr.length; n++) {
            mainArr[n] = new StringBuilder(roles[n]);
            mainArr[n] = mainArr[n].append(":").append(shift);
        }

        // переход на строку
        for (int i = 0; i < textLines.length; i++) {
            countString = 0;
            roleTemp.delete(0, roleTemp.length());
            phraseTemp.delete(0, phraseTemp.length());

            //собираем имя
            while (textLines[i].charAt(countString) != ':') {
                roleTemp.append(textLines[i].charAt(countString));
                countString++;
            }
            countString++;

            //сопоставляем имя
            for (numberRole = 0; numberRole < roles.length; numberRole++) {

                //сравниваем имя из roles(mainArr) с получившимся
                if (roles[numberRole].equalsIgnoreCase(roleTemp.toString())) {
                    break;
                }
            }

            //собираем фразу
            while (countString < textLines[i].length()) {
                phraseTemp.append(textLines[i].charAt(countString));
                countString++;

            }

            //добавляем номер строки
            mainArr[numberRole] = mainArr[numberRole].append(i + 1).append(")");

            // добавляем фразу и переходы
            mainArr[numberRole] = mainArr[numberRole].append(phraseTemp).append(shift);
        }

        //заполняем строку
        for (int m = 0; m < mainArr.length; m++) {
            resultBuilder.append(mainArr[m]).append(shift);
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] printTextPerRole = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, printTextPerRole));
    }

}

