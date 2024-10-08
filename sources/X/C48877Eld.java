package X;

import android.content.Context;

/* renamed from: X.Eld  reason: case insensitive filesystem */
public abstract class C48877Eld {
    public static final boolean A00(Context context, String str, boolean z, boolean z2) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, str);
        int length = str.length() - (A1U ? 1 : 0);
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            int i2 = length;
            if (!z3) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z3) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z3 = true;
            } else {
                i++;
            }
        }
        int length2 = Dba.A0c(str, length, i).length();
        if (length2 > 100) {
            C59689JTv.A03(context, DbW.A0h(context, 100, 2131960586), "direct_thread_title_change_error_too_long", 0);
            return false;
        } else if (z || length2 != 0 || z2) {
            return A1U;
        } else {
            return false;
        }
    }
}
