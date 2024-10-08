package X;

import android.os.SystemClock;

public final class USK extends C11471SaZ {
    public final int A00;
    public final /* synthetic */ C18592Vuj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public USK(Q6H q6h, C18592Vuj vuj, int i) {
        super(q6h);
        this.A01 = vuj;
        this.A00 = i;
    }

    public final void A00(long j) {
        C20876X2c x2c;
        C18592Vuj vuj = this.A01;
        if (vuj.A0I) {
            0I1.A04("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        0fc.A01(8192, "dispatchNonBatchedUIOperations", 861343727);
        while (true) {
            try {
                if (16 - ((System.nanoTime() - j) / 1000000) < ((long) this.A00)) {
                    break;
                }
                synchronized (vuj.A0O) {
                    try {
                        if (!vuj.A0D.isEmpty()) {
                            x2c = (C20876X2c) vuj.A0D.pollFirst();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                x2c.AT8();
                vuj.A01 += SystemClock.uptimeMillis() - uptimeMillis;
            } catch (Exception e) {
                th = e;
                vuj.A0I = true;
            } catch (Throwable th2) {
                0fc.A00(8192, 482656739);
                throw th2;
            }
        }
        0fc.A00(8192, 1833486735);
        C18592Vuj.A00(vuj);
        S9B.A00().A02(this, RFI.DISPATCH_UI);
        return;
        throw th;
    }
}
