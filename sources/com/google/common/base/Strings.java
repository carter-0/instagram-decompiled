package com.google.common.base;

import X.002;
import X.C66581MXm;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static String A00(String str, Object... objArr) {
        int length;
        String valueOf = String.valueOf(str);
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
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, 002.A0R("Exception during lenientFormat for ", A0T), e);
                    str2 = 002.A11("<", A0T, " threw ", C66581MXm.A0y(e), ">");
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A15 = Pxe.A15(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A15.append(valueOf, i3, indexOf);
            A15.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A15.append(valueOf, i3, length2);
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
