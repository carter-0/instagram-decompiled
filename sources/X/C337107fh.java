package X;

import com.facebook.ui.emoji.model.Emoji;

/* renamed from: X.7fh  reason: invalid class name and case insensitive filesystem */
public abstract class C337107fh {
    public static boolean A02(String str) {
        if (str != null) {
            int length = str.length();
            if (C337117fj.A00.A01(str, 0, length) != length) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int A00(int[] iArr, int i) {
        if (i > 0 && i < 11) {
            int[] iArr2 = iArr;
            if (i > 1) {
                if (iArr[1] == 65039) {
                    i--;
                } else {
                    System.arraycopy(iArr, 1, iArr, 2, i - 1);
                }
            }
            iArr[1] = 127995;
            if (iArr[i] != 65039) {
                i++;
            }
            C253133qG r6 = C337117fj.A00;
            int[] iArr3 = r6.A01;
            int i2 = r6.A00;
            if (r6.A03(iArr3, iArr2, 0, i2, 0, i) == i) {
                return i;
            }
            if (i >= 6 && i < iArr2.length - 1) {
                int i3 = i + 1;
                iArr2[i] = 127995;
                if (r6.A03(iArr3, iArr2, 0, i2, 0, i3) == i3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static boolean A01(String str) {
        int i;
        int[] A02 = Emoji.A02();
        int A00 = Emoji.A00(str, A02);
        if (A00 <= 1 || (i = A02[1]) < 127995 || i > 127999) {
            int A002 = A00(A02, A00);
            Emoji.A01.ECR(A02);
            if (A002 < 0) {
                return false;
            }
        } else {
            Emoji.A01.ECR(A02);
        }
        return true;
    }
}
