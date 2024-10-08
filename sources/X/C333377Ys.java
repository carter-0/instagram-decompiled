package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ys  reason: invalid class name and case insensitive filesystem */
public final class C333377Ys extends C331647Ru {
    public final UserSession A00;
    public final String A01;
    public final C62320sa A02;
    public final C62320sa A03;

    public final void A05(View view) {
        FC8.A01().A00();
        Bundle A002 = Q21.A00(new 0eP(C273654mx.A00(461), this.A03), new 0eP("origin", this.A01));
        C54119Gzo gzo = new C54119Gzo();
        gzo.setArguments(A002);
        new C331127Pr(this.A00).A00().A02((Activity) this.A02.invoke(), gzo);
    }

    public final boolean A08() {
        return 0qQ.A0K(this.A01, AnonymousClass000.A00(649));
    }

    public C333377Ys(UserSession userSession, C331627Rs r2, String str, C62320sa r4, C62320sa r5) {
        super(r2);
        this.A02 = r4;
        this.A00 = userSession;
        this.A03 = r5;
        this.A01 = str;
    }
}
