package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IIg  reason: case insensitive filesystem */
public final class C56937IIg implements C254293sF {
    public final AnonymousClass2oW A00 = AnonymousClass2oW.IG_GENERIC;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final Integer A03;
    public final String A04;
    public final C229872oT A05;
    public final boolean A06;

    public C56937IIg(UserSession userSession, AnonymousClass4DU r3, C229872oT r4, Integer num, String str, boolean z) {
        0qQ.A0B(r4, 1);
        this.A05 = r4;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = num;
        this.A06 = z;
    }

    public final void DzO(C254353sL r4, Boolean bool, String str) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A06;
        }
        if (z) {
            0nY.A00().ATE(new C292945jm(new C57847IhQ(r4, this)));
        }
    }
}
