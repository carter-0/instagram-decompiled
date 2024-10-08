package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.RfY  reason: case insensitive filesystem */
public abstract class C9715RfY {
    public static String A00(String str, Object... objArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            String str2 = objArr[i2];
            if (str2 == null) {
                str2 = "null";
            } else {
                try {
                    str2 = str2.toString();
                } catch (Exception e) {
                    String A0y = C66581MXm.A0y(str2);
                    String A0h = Pxf.A0h(str2);
                    StringBuilder A15 = Pxe.A15(Pxf.A09(A0y) + 1, Pxf.A09(A0h));
                    A15.append(A0y);
                    A15.append('@');
                    String A0l = AnonymousClass7TF.A0l(A0h, A15);
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    int length2 = A0l.length();
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", Pxg.A0l(length2, "Exception during lenientFormat for ", A0l), e);
                    String A0y2 = C66581MXm.A0y(e);
                    StringBuilder A152 = Pxe.A15(length2 + 9, Pxf.A09(A0y2));
                    A152.append("<");
                    A152.append(A0l);
                    A152.append(" threw ");
                    A152.append(A0y2);
                    str2 = AnonymousClass7TF.A0l(">", A152);
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length3 = str.length();
        StringBuilder A153 = Pxe.A15(length3, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A153.append(str, i3, indexOf);
            A153.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A153.append(str, i3, length3);
        if (i < length) {
            int A07 = Pxg.A07(" [", A153, objArr, i);
            while (A07 < length) {
                A07 = Pxg.A07(", ", A153, objArr, A07);
            }
            A153.append(']');
        }
        return A153.toString();
    }
}
