package X;

import java.util.Locale;

public abstract class SCR {
    public static final byte[] A00 = {0, 0, 0, 1};
    public static final String[] A01 = {"", "A", "B", "C"};

    public static String A00(int[] iArr, int i, int i2, int i3, int i4, boolean z) {
        String str = A01[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        char c = 'L';
        if (z) {
            c = 'H';
        }
        StringBuilder A16 = Pxe.A16(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", new Object[]{str, valueOf, valueOf2, Character.valueOf(c), Integer.valueOf(i4)}));
        int i5 = 6;
        while (true) {
            if (iArr[i5 - 1] != 0) {
                int i6 = 0;
                do {
                    A16.append(String.format(".%02X", AnonymousClass7TF.A1b(iArr[i6])));
                    i6++;
                } while (i6 < i5);
                break;
            }
            i5--;
            if (i5 <= 0) {
                break;
            }
        }
        return A16.toString();
    }
}
