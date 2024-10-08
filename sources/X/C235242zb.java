package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zb  reason: invalid class name and case insensitive filesystem */
public final class C235242zb extends C234532y8 {
    public final AnonymousClass4DU A00;
    public final C235272ze A01;
    public final C235302zh A02;
    public final C235252zc A03;
    public final C235292zg A04;

    public final void Csj(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (AnonymousClass3WX.A02(r3, this.A00)) {
            r2.A00(this.A03);
            r2.A00(this.A04);
        }
    }

    public C235242zb(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r6) {
        this.A00 = r6;
        C229252n5 r2 = C229232n3.A00(userSession).A00;
        1Bk r1 = r2.A00;
        0qQ.A07(r1);
        this.A03 = new C235252zc(fragmentActivity, r1, userSession, r6);
        1Bk r12 = r2.A01;
        0qQ.A07(r12);
        this.A01 = new C235272ze(fragmentActivity, r12, userSession, r6);
        this.A04 = new C235292zg(userSession, r6);
        this.A02 = new C235302zh(userSession, r6);
    }
}
