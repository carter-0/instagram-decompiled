package X;

import android.content.Context;

/* renamed from: X.S0m  reason: case insensitive filesystem */
public final class C10911S0m {
    public final Context A00;

    public final boolean A00(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        int i = length - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= i) {
            int i3 = i;
            if (!z) {
                i3 = i2;
            }
            boolean A13 = Dbc.A13(str, i3);
            if (z) {
                if (!A13) {
                    break;
                }
                i--;
            } else if (!A13) {
                z = true;
            } else {
                i2++;
            }
        }
        if (Dba.A0c(str, i, i2).length() != 0) {
            return C253833rU.A03(str);
        }
        return false;
    }

    public C10911S0m(Context context) {
        this.A00 = context;
    }
}
