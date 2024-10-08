package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.GbB  reason: case insensitive filesystem */
public abstract class C52699GbB {
    public static final AnonymousClass2WD A01(Context context, C52706GbJ gbJ, C52703GbF gbF, CharSequence charSequence, 0sP r14, long j) {
        int A03 = DbW.A03(2, gbF, gbJ);
        return new AnonymousClass2WD(new C52704GbG(gbF, charSequence), new AnonymousClass2WG(C51967G9n.A0W(C52713GbQ.A00, A03, false), (C62320sa) null, new C58769IxG(10, gbJ, r14, gbF, context), j));
    }

    public static final int A00(C52715GbS gbS, Integer num, boolean z) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 131073;
        }
        if ((i & 15) == 1) {
            int ordinal = gbS.ordinal();
            if (ordinal == 1) {
                i = (i & -32769) | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            } else if (ordinal == 2) {
                i = (i | Constants.LOAD_RESULT_PGO) & -524289;
            }
        }
        if (z) {
            return i & -131073;
        }
        return i;
    }
}
