package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.LDv  reason: case insensitive filesystem */
public final class C63935LDv {
    public 2Cn A00 = new KH1((Object) this, 15);
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;

    public C63935LDv(Context context, AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        0qQ.A0B(context, 1);
        C51973G9u.A0r(3, r4, str, str2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r4;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void A00(C3018260f r6) {
        0qQ.A0B(r6, 0);
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A01;
            if (!1DL.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C64729Lh6 lh6 = new C64729Lh6(7, new MB7(22, r6, this), this);
                JTO.A1Z(context);
                JTP.A11((Activity) context, lh6, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        try {
            C290815g0 A002 = MB7.A00(r6, this, 23);
            A002.A00 = this.A00;
            1ES.A03(A002);
        } catch (Exception unused) {
        }
    }
}
