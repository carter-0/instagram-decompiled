package X;

import java.util.List;

public final class INB implements AnonymousClass1GR {
    public final int A00;
    public final Object A01;

    public INB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D58(AnonymousClass1QW r14, AnonymousClass2ZK r15) {
        Object value;
        if (this.A00 == 0) {
            AnonymousClass7TF.A1H(r14, r15);
            05G r2 = ((C54439HDr) this.A01).A07;
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C53384GnG.A00((JV7) null, (C53384GnG) value, (JRG) null, AnonymousClass05K.A0C, (List) null, 1023, false, false, false, false)));
        }
    }

    public final void DEO(C268654dm r3, AnonymousClass1QW r4) {
        String str;
        if (this.A00 == 0) {
            0qQ.A0B(r3, 1);
            C54439HDr hDr = (C54439HDr) this.A01;
            1XP r0 = (1XP) r3.A00();
            if (r0 != null) {
                str = r0.getErrorMessage();
            } else {
                str = null;
            }
            C54439HDr.A02(hDr, str);
        }
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r5, AnonymousClass1QW r6, AnonymousClass2ZK r7) {
        if (this.A00 == 0) {
            C43818CEk cEk = (C43818CEk) r5;
            0qQ.A0B(cEk, 2);
            C54439HDr hDr = (C54439HDr) this.A01;
            C53323Gm9 gm9 = cEk.A02;
            if (gm9 == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            1E4.A00(hDr.A02);
            C54439HDr.A01(gm9, hDr, true, false, true);
        }
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DeX() {
        if (this.A00 != 0) {
            ((AnonymousClass540) this.A01).AVX("feed_parsing_test");
        }
    }

    public final /* synthetic */ void Den() {
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }
}
