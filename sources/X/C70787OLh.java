package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.OLh  reason: case insensitive filesystem */
public final class C70787OLh {
    public Integer A00;
    public final UserSession A01;
    public final O7U A02;
    public final 1P0 A03 = new NMI((Object) this, 20);
    public final AnonymousClass4D6 A04;
    public final String A05;
    public final List A06 = AnonymousClass7TE.A1I("reshared_content");

    public C70787OLh(UserSession userSession, AnonymousClass4D6 r4, O7U o7u, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = r4;
        this.A02 = o7u;
        this.A05 = str;
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        Map A0w = AnonymousClass7TF.A0w("reshared_content", str);
        this.A00 = AnonymousClass05K.A01;
        AnonymousClass4D6 r3 = this.A04;
        1OC A002 = OQ7.A00(this.A01, this.A05, this.A06, A0w);
        A002.A00 = this.A03;
        r3.schedule(A002);
    }
}
