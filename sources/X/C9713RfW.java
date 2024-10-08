package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.RfW  reason: case insensitive filesystem */
public abstract class C9713RfW {
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
                    String A0T = 002.A0T(C66581MXm.A0y(str2), Pxf.A0h(str2), '@');
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0T), e);
                    str2 = 002.A11("<", A0T, " threw ", C66581MXm.A0y(e), ">");
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A15 = Pxe.A15(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A15.append(str, i3, indexOf);
            A15.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A15.append(str, i3, length2);
        if (i < length) {
            int A07 = Pxg.A07(" [", A15, objArr, i);
            while (A07 < length) {
                A07 = Pxg.A07(", ", A15, objArr, A07);
            }
            A15.append(']');
        }
        return A15.toString();
    }
}
