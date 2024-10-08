package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.42q  reason: invalid class name and case insensitive filesystem */
public final class C2596742q implements AnonymousClass0lh {
    public final Handler A00;
    public final C2596942s A01 = new C2596942s();
    public final C2596942s A02 = new C2596942s();
    public final 17i A03;
    public final Set A04 = new HashSet();
    public final Handler.Callback A05;
    public final 1Ng A06;
    public final 1wn A07;
    public final C2596842r A08;

    public C2596742q(1Ng r4, C2596842r r5, 17i r6) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r6, 2);
        this.A06 = r4;
        this.A03 = r6;
        this.A08 = r5;
        AnonymousClass4BU r2 = new AnonymousClass4BU(this);
        this.A05 = r2;
        this.A00 = new Handler(Looper.getMainLooper(), r2);
        AnonymousClass4BV r1 = new AnonymousClass4BV(this);
        this.A07 = r1;
        r4.A01(r1, 2Kb.class);
    }

    public static final void A00(C2596742q r4, C299305uu r5, C299305uu r6, int i) {
        C67292MlR mlR;
        C2596942s r3 = r4.A01;
        C67292MlR mlR2 = (C67292MlR) r3.A00(r5);
        if (mlR2 == null) {
            C2596942s r1 = new C2596942s();
            r1.A01(r6, Integer.valueOf(i));
            mlR = new C67292MlR(r5, r1);
        } else {
            0qQ.A0B(r6, 1);
            C2596942s r12 = new C2596942s(mlR2.A02);
            r12.A01(r6, Integer.valueOf(i));
            mlR = new C67292MlR(mlR2.A01, r12);
        }
        0qQ.A0A(mlR);
        r3.A01(r5, mlR);
        for (C74339PtF DrC : r4.A04) {
            DrC.DrC(mlR);
        }
    }

    public final void onSessionWillEnd() {
        C2596942s r1 = this.A01;
        r1.A02.clear();
        r1.A01.clear();
        this.A04.clear();
        this.A06.A02(this.A07, 2Kb.class);
    }
}
