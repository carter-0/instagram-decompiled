package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2os  reason: invalid class name and case insensitive filesystem */
public final class C230072os implements C229802oH {
    public final 2el A00;
    public final C229932oe A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C230082ot A05;
    public final C230112ow A06;
    public final C230102ov A07;
    public final C229952og A08;

    public final void A9R(AnonymousClass3O9 r7, C242803Vz r8) {
        UserSession userSession = this.A03;
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession, 36318913469946605L);
        String id = r7.getId();
        id.getClass();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r3 = new C2354830a(r7, r8, id);
        r3.A00(this.A07);
        if (A062) {
            r3.A00(this.A05);
        }
        if (r7.B5J() == 1UQ.A0z && 182.A06(r2, userSession, 36326339469457118L)) {
            r3.A00(this.A06);
        }
        this.A08.Csi(r3);
        C229932oe r22 = this.A01;
        String id2 = r7.getId();
        id2.getClass();
        r22.A01(r3.A01(), id2);
    }

    public final void EBq(View view, AnonymousClass3O9 r5) {
        2el r2 = this.A00;
        C229932oe r1 = this.A01;
        String id = r5.getId();
        id.getClass();
        r2.A05(view, r1.A00(id));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2oN, java.lang.Object] */
    public C230072os(Context context, AnonymousClass0iw r11, UserSession userSession, 2el r13, C249763kK r14) {
        C229952og r0;
        this.A00 = r13;
        this.A03 = userSession;
        this.A02 = context;
        AnonymousClass2oI r1 = new AnonymousClass2oI(r11, userSession, r14);
        AnonymousClass2oJ r6 = new AnonymousClass2oJ(r1);
        this.A04 = r6;
        1Bk r4 = C229232n3.A00(userSession).A00.A01;
        0qQ.A07(r4);
        this.A05 = new C230082ot(context, r4, userSession, r6, AnonymousClass2oO.A00(userSession), new Object());
        this.A07 = new C230102ov(r1);
        this.A06 = new C230112ow(userSession);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r14, 1);
        if (182.A06(0Tu.A05, userSession, 36320670111769358L)) {
            r0 = new C57287IVw(new C230482ph(userSession, new C230462pf(userSession, new C57354IYl(r6, r14), new C230442pd(), C230432pc.FEED), C230472pg.NETEGO));
        } else {
            r0 = new C230122ox();
        }
        this.A08 = r0;
        this.A01 = new C229932oe();
    }
}
