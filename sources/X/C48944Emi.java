package X;

import android.content.Context;

/* renamed from: X.Emi  reason: case insensitive filesystem */
public abstract class C48944Emi {
    public static final int A00(Context context, EWR ewr) {
        EWR ewr2;
        int A02 = DbU.A02(ewr, 1);
        if (A02 == 0) {
            ewr2 = EWR.DEFAULT;
        } else if (A02 == 1) {
            ewr2 = EWR.ON_MEDIA;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return 2Yu.A0H(context, ewr2.A01);
    }
}
