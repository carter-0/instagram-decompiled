package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GJl  reason: case insensitive filesystem */
public final class C52220GJl implements Runnable {
    public final /* synthetic */ GD6 A00;
    public final /* synthetic */ Integer A01;

    public C52220GJl(GD6 gd6, Integer num) {
        this.A00 = gd6;
        this.A01 = num;
    }

    public final void run() {
        int A002;
        GD6 gd6 = this.A00;
        if (182.A06(0Tu.A05, gd6.A09, 36323427480579225L)) {
            C52009GBg gBg = gd6.A0A;
            List A0I = gBg.A0I();
            ArrayList<C267324bN> A1C = AnonymousClass7TE.A1C();
            for (Object next : A0I) {
                if (((C267324bN) next).A01 == C295365o2.GHOST) {
                    A1C.add(next);
                }
            }
            for (C267324bN A0T : A1C) {
                gBg.A0T(A0T, true);
            }
            return;
        }
        Integer num = this.A01;
        if (num != null) {
            A002 = num.intValue();
        } else if (gd6.A05.A1Y) {
            A002 = 0;
        } else {
            A002 = GD6.A00(gd6) - 1;
        }
        C52009GBg gBg2 = gd6.A0A;
        C267324bN A0E = gBg2.A0E(A002);
        if (A0E.A01 == C295365o2.GHOST) {
            gBg2.A0T(A0E, true);
        }
    }
}
