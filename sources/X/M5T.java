package X;

import java.util.Iterator;

public final class M5T implements Runnable {
    public final /* synthetic */ Ls3 A00;

    public M5T(Ls3 ls3) {
        this.A00 = ls3;
    }

    public final void run() {
        double d;
        try {
            Ls3 ls3 = this.A00;
            LEF lef = ls3.A03;
            AnonymousClass3Q2 r0 = lef.A03;
            if (r0 != null) {
                AnonymousClass3QC r1 = r0.A6G.A00;
                synchronized (r1) {
                    d = r1.A02;
                }
            } else {
                d = 0.0d;
            }
            ls3.A00 = (int) ((C62692Kks.A00(lef.A02) * lef.A00) + (d * 75.0d));
            Iterator A1G = AnonymousClass7TE.A1G(ls3.A04);
            while (A1G.hasNext()) {
                ((AnonymousClass3M8) AnonymousClass7TF.A0a(A1G)).A0B(ls3);
            }
            if (ls3.A00 < 100) {
                ls3.A02.postDelayed(this, 1000);
            }
        } catch (Throwable th) {
            Ls3 ls32 = this.A00;
            if (ls32.A00 < 100) {
                ls32.A02.postDelayed(this, 1000);
            }
            throw th;
        }
    }
}
