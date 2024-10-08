package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9BR  reason: invalid class name */
public final class AnonymousClass9BR implements C61110lV {
    public static AnonymousClass9BR A01;
    public UserSession A00;

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.FGw] */
    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1144498802);
        ? obj = new Object();
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        0Tu r10 = 0Tu.A05;
        0no.A00().A01(new EI0(userSession, obj), 182.A01(r10, userSession, 36606409991263663L) * 1000);
        ? obj2 = new Object();
        UserSession userSession2 = this.A00;
        String str = userSession2.A06;
        0no.A00().A01(new EIB(userSession2, obj2, str), 182.A01(r10, userSession2, 36606409991263663L) * 1000);
        AnonymousClass0fD.A0A(884229422, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1233192743, AnonymousClass0fD.A03(1838180671));
    }
}
