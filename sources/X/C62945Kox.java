package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Kox  reason: case insensitive filesystem */
public abstract class C62945Kox {
    public final C60284Jig A00() {
        AnonymousClass0eM r0;
        if (this instanceof C62265Kcz) {
            r0 = ((C62265Kcz) this).A00;
        } else {
            r0 = ((C62264Kcy) this).A00;
        }
        return (C60284Jig) r0.getValue();
    }

    public final void A01() {
        C60284Jig A00 = A00();
        if (A00.A02 == C313666go.BROADCASTER) {
            AnonymousClass7TF.A1O(A00.A0A.A0H, true);
        }
        LRD lrd = A00.A08.A00;
        C63896LAz lAz = lrd.A00;
        if (lAz != null && lAz.A01) {
            1Ng A002 = AnonymousClass1Nd.A00(lAz.A02);
            A002.A02(lAz.A04, C62167KbP.class);
            A002.A02(lAz.A07, C62171KbT.class);
            A002.A02(lAz.A06, C62170KbS.class);
            A002.A02(lAz.A05, C62169KbR.class);
            lAz.A01 = false;
        }
        lrd.A00 = null;
        C262204Co r0 = A00.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        A00.A00 = null;
        A00.A09.A00.Epw((Object) null);
        C262204Co r02 = A00.A01;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        A00.A01 = null;
    }
}
