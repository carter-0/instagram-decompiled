package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Atl  reason: case insensitive filesystem */
public final /* synthetic */ class C41425Atl implements C62320sa {
    public final /* synthetic */ C357068Wi A00;

    public /* synthetic */ C41425Atl(C357068Wi r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C357068Wi r8 = this.A00;
        AnonymousClass817 r0 = r8.A0F;
        String str = r0.A01;
        String str2 = r0.A00;
        C39891ADp aDp = C39891ADp.A00;
        aDp.A01("sink", "story");
        aDp.A00();
        FIT fit = new FIT(r8, str, str2, 0);
        AnonymousClass8BA r1 = r8.A0A;
        r1.A0Z();
        if (!C357068Wi.A04(fit, r8)) {
            if (!(!AnonymousClass8BA.A0L(r1))) {
                C357068Wi.A02(r8, str, str2);
            } else {
                AfQ afQ = new AfQ(r8, str, str2);
                UserSession userSession = r8.A06;
                C367188qK r2 = new C367188qK(userSession);
                LEO A002 = C63435Kwv.A00(r8.A02, AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON, userSession);
                A002.A05 = afQ;
                A002.A0A = str;
                AnonymousClass4DH r02 = r8.A03;
                0qQ.A0B(r02, 0);
                A002.A01 = r02;
                r2.A01((C376569Im) null, A002, new AfT(r8, str, str2));
            }
        }
        return C60340gF.A00;
    }
}
