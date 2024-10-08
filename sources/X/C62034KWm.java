package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.KWm  reason: case insensitive filesystem */
public final class C62034KWm extends C252733pa {
    public final UserSession A00;
    public final HashMap A01;
    public final HashMap A02;
    public final HashMap A03 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C58179Inj(this, 22));
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final Map A09;

    public final void A00(String str, String str2) {
        String str3 = str;
        Long A10 = AnonymousClass7TE.A10(str);
        if (A10 != null) {
            long longValue = A10.longValue();
            HashMap hashMap = this.A01;
            C262204Co r0 = (C262204Co) hashMap.get(str);
            if (r0 == null || !r0.isActive()) {
                hashMap.put(str, C51966G9m.A1L(new C66149MEc(this, str3, str2, (AnonymousClass4D7) null, 2, longValue), this.A01));
            }
        }
    }

    public C62034KWm(UserSession userSession) {
        super("FriendMap", AnonymousClass43D.A00(1067112572));
        this.A00 = userSession;
        0sm A0E = 0Yt.A0E();
        this.A09 = A0E;
        02z A012 = 106.A01(A0E);
        this.A05 = A012;
        this.A07 = 10b.A03(A012);
        this.A02 = AnonymousClass7TE.A1E();
        02z A0q = JTQ.A0q();
        this.A06 = A0q;
        this.A08 = 10b.A03(A0q);
        this.A01 = AnonymousClass7TE.A1E();
    }
}
