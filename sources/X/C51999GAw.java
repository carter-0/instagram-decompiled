package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GAw  reason: case insensitive filesystem */
public final class C51999GAw extends C230622pv {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C267324bN r7 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r7, gDe);
        AnonymousClass4DU r5 = this.A01;
        C254523sc A04 = C254513sb.A04(r7, r5, "time_spent");
        A04.A0B(j);
        A04.A7F = String.valueOf(j);
        UserSession userSession = this.A00;
        A04.A0K(userSession, r7.A06());
        A04.A6L = this.A02;
        String str = r7.A06().A0c;
        if (str != null) {
            A04.A5X = str;
        }
        if (182.A06(0Tu.A06, userSession, 36330067499958708L)) {
            C52058GDe.A08(r7, gDe, userSession, j);
        }
        C233822wX.A0H(userSession, A04, r5);
    }

    public C51999GAw(UserSession userSession, AnonymousClass4DU r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = userSession;
    }
}
