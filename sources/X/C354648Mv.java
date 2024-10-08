package X;

import java.util.Iterator;

/* renamed from: X.8Mv  reason: invalid class name and case insensitive filesystem */
public final class C354648Mv extends 2YL {
    public final C354658Mw A00;
    public final AnonymousClass80W A01;
    public final 0V2 A02;
    public final 05G A03;
    public final C61770pa A04;
    public final AnonymousClass0Ud A05;

    public /* synthetic */ C354648Mv(AnonymousClass80W r4) {
        C354658Mw r1 = new C354658Mw();
        0qQ.A0B(r4, 1);
        this.A01 = r4;
        this.A00 = r1;
        02z A012 = 106.A01(C354678My.A00);
        this.A03 = A012;
        this.A05 = 10b.A03(A012);
        05D A013 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A02 = A013;
        this.A04 = new 0V1((C262204Co) null, A013);
    }

    public static final void A01(C354648Mv r3, int i) {
        C354658Mw r2 = r3.A00;
        r2.A00 = i;
        C61047Jvl A022 = r3.A02(i);
        if (A022 != null) {
            C354668Mx r1 = (C354668Mx) A022.A01;
            0qQ.A0B(r1, 0);
            r2.A01 = r1;
        }
        05G r22 = r3.A03;
        do {
        } while (!r22.AIY(r22.getValue(), new C387719mf(i)));
    }

    public final C61047Jvl A02(int i) {
        Object obj;
        Iterator it = this.A00.A04.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C61047Jvl) obj).A00 == i) {
                break;
            }
        }
        return (C61047Jvl) obj;
    }

    public static final void A00(C391879tp r5, C354648Mv r6) {
        1Eo.A05(AnonymousClass12T.A00.A04, new MH1(r5, r6, (AnonymousClass4D7) null, 12), C318116oQ.A00(r6));
    }
}
