package X;

import android.content.Context;

public abstract class Ri6 {
    public static final boolean A00(Context context) {
        String A03;
        0xm A00 = AnonymousClass0xl.A00(C61170le.A00);
        AnonymousClass3RV A02 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02();
        0qQ.A07(A02);
        SRS srs = new SRS(context, A02, AnonymousClass458.A00, AnonymousClass3RA.A00(context));
        if (A00.A00.getInt("latest_push_token_registration_status", 0) == 2 || (A03 = srs.A03("com.instagram.android")) == null || A03.length() == 0) {
            return true;
        }
        return false;
    }
}
