package X;

import java.util.EnumSet;

public final class TGN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ST3 A01;

    public TGN(ST3 st3, int i) {
        this.A01 = st3;
        this.A00 = i;
    }

    public final void run() {
        try {
            ST3 st3 = this.A01;
            EnumSet enumSet = ST3.A0c;
            SRA sra = st3.A0E;
            int i = this.A00;
            try {
                synchronized (sra) {
                    S5H s5h = sra.A0I;
                    if (s5h.A00.A0Y.equals(AnonymousClass05K.A0C)) {
                        SRA.A02(sra, new C10938S1r(new SNX(RFZ.PUBACK), new S0O(i), (Object) null), sra.A01);
                    }
                }
            } catch (Throwable th) {
                S5H s5h2 = sra.A0I;
                C8947RGw A002 = C8947RGw.A00(th);
                C8889REg rEg = C8889REg.PUBACK;
                ST3 st32 = s5h2.A00;
                if (st32.A0Y != AnonymousClass05K.A0N) {
                    ST3.A03(st32, rEg, A002, th);
                }
                th.getMessage();
            }
        } catch (Throwable th2) {
            ST3 st33 = this.A01;
            EnumSet enumSet2 = ST3.A0c;
            st33.A0F.A02(th2);
            ST3.A03(st33, C8889REg.PUBACK, C8947RGw.A00(th2), th2);
        }
    }
}
