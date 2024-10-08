package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2r9  reason: invalid class name */
public final class AnonymousClass2r9 implements C229802oH {
    public final UserSession A00;
    public final 2el A01;
    public final C229932oe A02 = new C229932oe();
    public final C231202rA A03;
    public final AnonymousClass4DU A04;

    public final void A9R(AnonymousClass3O9 r5, C242803Vz r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        String id = r5.getId();
        if (id != null) {
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r2 = new C2354830a(r5, r6, id);
            r2.A00(this.A03);
            this.A02.A01(r2.A01(), id);
        }
    }

    public final void EBq(View view, AnonymousClass3O9 r13) {
        C242803Vz r3;
        0qQ.A0B(r13, 0);
        View view2 = view;
        0qQ.A0B(view, 1);
        String id = r13.getId();
        if (id != null) {
            2el r1 = this.A01;
            C229932oe r2 = this.A02;
            r1.A05(view, r2.A00(id));
            C55780HnF hnF = new C55780HnF(this.A00, this.A04);
            Object obj = r2.A00(id).A04;
            if (obj instanceof C242803Vz) {
                r3 = (C242803Vz) obj;
            } else {
                r3 = null;
            }
            DHK dhk = (DHK) r13;
            0qQ.A0B(dhk, 1);
            String str = dhk.A00.A06;
            if (str != null) {
                GAN gan = new GAN(view2, hnF.A03, "feed_engagement_unit", hnF.A01.getModuleName(), str);
                1Ua A002 = 1UX.A00(view.getContext(), hnF.A00);
                0qQ.A07(A002);
                hnF.A02.A00(new C55513Hiv(A002), new C57520Ic8(hnF, dhk, r3), gan);
            }
        }
    }

    public AnonymousClass2r9(UserSession userSession, 2el r3, AnonymousClass4DU r4) {
        this.A00 = userSession;
        this.A04 = r4;
        this.A01 = r3;
        this.A03 = new C231202rA(userSession);
    }
}
