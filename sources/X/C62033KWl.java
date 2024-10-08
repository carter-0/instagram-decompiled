package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.KWl  reason: case insensitive filesystem */
public final class C62033KWl extends C252733pa {
    public final UserSession A00;
    public final HashMap A01;
    public final HashMap A02;
    public final HashMap A03 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new MMC(this, 7));
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final Map A09;

    public final void A00(String str, String str2) {
        HashMap hashMap = this.A01;
        String str3 = str;
        C262204Co r0 = (C262204Co) hashMap.get(str);
        if (r0 == null || !r0.isActive()) {
            hashMap.put(str, C51966G9m.A1L(new MFe((Object) this, str2, str3, (AnonymousClass4D7) null, 7), this.A01));
        }
    }

    public C62033KWl(UserSession userSession) {
        super("ContentNotesReactions", AnonymousClass43D.A00(1613739908));
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
