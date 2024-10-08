package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.W9z  reason: case insensitive filesystem */
public final class C18861W9z implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C19475WaN A01;
    public final /* synthetic */ C316166lD A02;
    public final /* synthetic */ String A03;

    public C18861W9z(UserSession userSession, C19475WaN waN, C316166lD r3, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = waN;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(543100387);
        UserSession userSession = this.A00;
        LTM.A02(new 0xG(this.A03), userSession, "DONOR_DUPLICATE_PROMPT");
        C19475WaN waN = this.A01;
        C18688Vwm.A02(this.A02.A00(), 28D.A2s, userSession, waN, true);
        AnonymousClass0fD.A0C(1210381716, A05);
    }
}
