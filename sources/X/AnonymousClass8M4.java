package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.8M4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8M4 implements C62320sa {
    public final /* synthetic */ AnonymousClass8LU A00;
    public final /* synthetic */ C354188Kz A01;

    public /* synthetic */ AnonymousClass8M4(AnonymousClass8LU r1, C354188Kz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object invoke() {
        AnonymousClass8LU r2 = this.A00;
        C354188Kz r7 = this.A01;
        AnonymousClass8M1 r3 = r2.A0v;
        if (r3 == null) {
            return null;
        }
        C354428Lz r8 = r2.A0n;
        AnonymousClass80G r11 = r2.A04;
        ViewGroup viewGroup = r2.A0X;
        AnonymousClass861 r1 = r2.A0y;
        0qQ.A0B(r7, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(viewGroup, 3);
        0qQ.A0B(r1, 4);
        C376429Hy A002 = AnonymousClass9T9.A00(r7.A05, 1.0f);
        if (!r3.A0G() && C39899AIg.A04((AnonymousClass831) r3.A04.A0F.A02())) {
            AnonymousClass8M1.A03(A002, (C376429Hy) null, r3, (Integer) null, true);
            C376429Hy r12 = new C376429Hy(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
            Context context = viewGroup.getContext();
            0qQ.A07(context);
            C380379Xt r122 = r8.A02;
            if (r122 == null) {
                r122 = new C380379Xt(context);
                r8.A02 = r122;
            }
            r122.setShowGuide(false);
            viewGroup.removeView(r122);
            viewGroup.addView(r122);
            r11.A09(new C58799Ixk(4, r7, r8, viewGroup, r12, r11, r122));
        }
        if (r3.A0G()) {
            return null;
        }
        for (C352348Cz DBP : r2.A0f.A1u) {
            DBP.DBP(true);
        }
        return null;
    }
}
