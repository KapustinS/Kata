package Java1;

import java.util.Arrays;

public class Task3_5_6 {

    public static class AsciiCharSequence implements CharSequence {

        byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = array;
        }

        @Override
        public String toString() {
            return new String(array);
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public CharSequence subSequence(int start, int end) {

            return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
        }

        @Override
        public char charAt(int index) {

            return (char) array[index];
        }

    }
}

