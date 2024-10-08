package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IUp  reason: case insensitive filesystem */
public final class C57254IUp implements JOI {
    public final 1Ng A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final AnonymousClass3W1 A03;
    public final String A04;
    public final boolean A05;

    public final void DlP(ClickableSpan clickableSpan, View view, String str, String str2) {
        AnonymousClass7TF.A1C(str, 0, str2);
        1Xj r3 = this.A02;
        1Ng r0 = this.A00;
        String str3 = this.A04;
        AnonymousClass3W1 r4 = this.A03;
        r0.A00(new C240343Kn(this.A01, r3, r4, str3, str, str2, this.A05));
    }

    public C57254IUp(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4, String str, boolean z) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = z;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }
}
