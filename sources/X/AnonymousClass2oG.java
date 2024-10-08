package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2oG  reason: invalid class name */
public final class AnonymousClass2oG implements C229802oH {
    public final UserSession A00;
    public final 2el A01;
    public final C229932oe A02 = new C229932oe();
    public final AnonymousClass4DU A03;
    public final C229892oa A04;
    public final AnonymousClass2oM A05;
    public final C229952og A06;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.2oN, java.lang.Object] */
    public AnonymousClass2oG(Context context, AnonymousClass0iw r10, UserSession userSession, 2el r12, C249763kK r13) {
        C229952og r0;
        0qQ.A0B(r13, 2);
        this.A00 = userSession;
        this.A01 = r12;
        AnonymousClass2oI r1 = new AnonymousClass2oI(r10, userSession, r13);
        AnonymousClass2oJ r5 = new AnonymousClass2oJ(r1);
        this.A03 = r5;
        this.A05 = new AnonymousClass2oM(r1);
        1Bk r3 = C229232n3.A00(userSession).A00.A01;
        0qQ.A07(r3);
        Context context2 = context;
        this.A04 = new C229892oa(context2, r3, userSession, r5, AnonymousClass2oO.A00(userSession), new Object());
        if (182.A06(0Tu.A05, userSession, 36320670111769358L)) {
            r0 = new C57287IVw(new C230482ph(userSession, new C230462pf(userSession, new C57355IYm(r5, r13), new C230442pd(), C230432pc.FEED), C230472pg.NETEGO));
        } else {
            r0 = new C229942of();
        }
        this.A06 = r0;
    }

    public final void A9R(AnonymousClass3O9 r6, C242803Vz r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        if (r6.getId() != null) {
            boolean A062 = 182.A06(0Tu.A05, this.A00, 36318913470536434L);
            AnonymousClass3UH r4 = (AnonymousClass3UH) r6;
            String str = r4.A0F;
            if (str == null) {
                str = "";
            }
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r3 = new C2354830a(r4, r7, str);
            if (A062) {
                C229892oa r02 = this.A04;
                r02.A00 = r6;
                r3.A00(r02);
            }
            r3.A00(this.A05);
            this.A06.Csi(r3);
            C229932oe r2 = this.A02;
            String str2 = r4.A0F;
            if (str2 == null) {
                str2 = "";
            }
            r2.A01(r3.A01(), str2);
        }
    }

    public final void EBq(View view, AnonymousClass3O9 r5) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(view, 1);
        if (r5.getId() != null) {
            2el r2 = this.A01;
            C229932oe r1 = this.A02;
            String id = r5.getId();
            if (id != null) {
                r2.A05(view, r1.A00(id));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
