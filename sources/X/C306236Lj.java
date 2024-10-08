package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Lj  reason: invalid class name and case insensitive filesystem */
public final class C306236Lj extends C230622pv {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C310666bQ A02;

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C250973mM r6 = (C250973mM) obj;
        C306176Ld r15 = (C306176Ld) obj2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r15, 1);
        C255773uh r5 = r15.A01;
        AnonymousClass4DU r3 = this.A01;
        UserSession userSession = this.A00;
        C254523sc A022 = GTA.A02(userSession, r3, r5, "segment_time_spent");
        A022.A0B(j);
        A022.A0X(r6.A0H.A17);
        A022.A4A = Long.valueOf((long) r15.A00);
        AnonymousClass3PI.A07(A022, r5, r6, this.A02, r15.A02, -1, false);
        C233822wX.A0I(userSession, A022, r3, AnonymousClass05K.A01);
    }

    public C306236Lj(C310666bQ r2) {
        this.A02 = r2;
        this.A00 = r2.A01;
        this.A01 = r2.A02;
    }
}
