package Java1;

public class Task2_4_18 {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] mainArr = new StringBuilder[roles.length];
        String shift = "\n";
        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder roleTemp = new StringBuilder();
        StringBuilder phraseTemp = new StringBuilder();
        int countString = 0; //������� ������� � ������
        int numberRole = 0; //����� �������� ��������� ������� � �����

        //���������� ���� � �������� ������. � ":" � ��������
        for (int n = 0; n < mainArr.length; n++) {
            mainArr[n] = new StringBuilder(roles[n]);
            mainArr[n] = mainArr[n].append(":").append(shift);
        }

        // ������� �� ������
        for (int i = 0; i < textLines.length; i++) {
            countString = 0;
            roleTemp.delete(0, roleTemp.length());
            phraseTemp.delete(0, phraseTemp.length());

            //�������� ���
            while (textLines[i].charAt(countString) != ':') {
                roleTemp.append(textLines[i].charAt(countString));
                countString++;
            }
            countString++;

            //������������ ���
            for (numberRole = 0; numberRole < roles.length; numberRole++) {

                //���������� ��� �� roles(mainArr) � ������������
                if (roles[numberRole].equalsIgnoreCase(roleTemp.toString())) {
                    break;
                }
            }

            //�������� �����
            while (countString < textLines[i].length()) {
                phraseTemp.append(textLines[i].charAt(countString));
                countString++;

            }

            //��������� ����� ������
            mainArr[numberRole] = mainArr[numberRole].append(i + 1).append(")");

            // ��������� ����� � ��������
            mainArr[numberRole] = mainArr[numberRole].append(phraseTemp).append(shift);
        }

        //��������� ������
        for (int m = 0; m < mainArr.length; m++) {
            resultBuilder.append(mainArr[m]).append(shift);
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {

        String[] roles = {"����������", "����� ���������", "������� ����������", "���� �����"};
        String[] printTextPerRole = {"����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.", "����� ���������: ��� �������?", "������� ����������: ��� �������?", "����������: ������� �� ����������, ���������. � ��� � ��������� ������������.", "����� ���������: ��� �� ��!", "������� ����������: ��� �� ���� ������, ��� �����!", "���� �����: ������� ����! ��� � � ��������� ������������!"};

        System.out.println(printTextPerRole(roles, printTextPerRole));
    }

}

