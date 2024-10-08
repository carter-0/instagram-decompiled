package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.OLg  reason: case insensitive filesystem */
public final class C70786OLg {
    public Integer A00;
    public final UserSession A01;
    public final O7V A02;
    public final 1P0 A03 = new NMI((Object) this, 19);
    public final AnonymousClass4D6 A04;
    public final String A05;
    public final List A06 = AnonymousClass7TE.A1I("message_content");

    public C70786OLg(UserSession userSession, AnonymousClass4D6 r4, O7V o7v, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = r4;
        this.A02 = o7v;
        this.A05 = str;
    }

    public final void A00(int i) {
        Map A0w = AnonymousClass7TF.A0w("message_content", String.valueOf(i));
        this.A00 = AnonymousClass05K.A01;
        AnonymousClass4D6 r3 = this.A04;
        1OC A002 = OQ7.A00(this.A01, this.A05, this.A06, A0w);
        A002.A00 = this.A03;
        r3.schedule(A002);
    }
}
