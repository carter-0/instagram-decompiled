package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Vd  reason: invalid class name and case insensitive filesystem */
public final class C332467Vd {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass0eK A03;
    public final boolean A04;
    public final AnonymousClass0eK A05;

    public C332467Vd(AnonymousClass0iw r2, 0wc r3, UserSession userSession, AnonymousClass0eK r5, AnonymousClass0eK r6, boolean z) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r3, 3);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r5;
        this.A03 = r6;
        this.A04 = z;
    }

    public static final C333517Zg A00(C332467Vd r0) {
        Object obj = r0.A05.get();
        0qQ.A07(obj);
        return (C333517Zg) obj;
    }

    public static final void A01(C332467Vd r2, AnonymousClass2Ep r3) {
        Object obj = r2.A03.get();
        0qQ.A07(obj);
        ((C332807Wl) obj).Cqf(r3, A00(r2).C6l().EtG());
    }

    public static final void A02(C332467Vd r3, C254793t3 r4) {
        Object obj = r3.A03.get();
        0qQ.A07(obj);
        ((C332807Wl) obj).Cqg(r4, A00(r3).C6l().C6Q().A08, A00(r3).C6l().EtG());
    }
}
