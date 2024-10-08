package X;

import android.text.TextUtils;

/* renamed from: X.S9z  reason: case insensitive filesystem */
public abstract class C11098S9z {
    public static final boolean A00(C8946RGo rGo, String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || C8946RGo.EMPTY == rGo || !TextUtils.isDigitsOnly(str) || length < rGo.A01 || length > rGo.A00) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int charAt = str.charAt((length - 1) - i2) - '0';
            if (i2 % 2 != 0 && (charAt = charAt * 2) > 9) {
                charAt = (charAt - 10) + 1;
            }
            i += charAt;
        }
        return i % 10 == 0;
    }

    public static final boolean A01(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return A00(C8946RGo.A06.A02(str), str);
    }
}
