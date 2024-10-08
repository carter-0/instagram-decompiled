package X;

import com.facebook.blescan.BleScanOperation;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Y3e  reason: case insensitive filesystem */
public final class C22422Y3e implements Runnable {
    public final /* synthetic */ BleScanOperation A00;
    public final /* synthetic */ AnonymousClass6UF A01;
    public final /* synthetic */ C11202SFc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Y1Q A04;
    public final /* synthetic */ Y1Q A05;
    public final /* synthetic */ Y1Q A06;

    public C22422Y3e(BleScanOperation bleScanOperation, AnonymousClass6UF r2, C11202SFc sFc, String str, Y1Q y1q, Y1Q y1q2, Y1Q y1q3) {
        this.A01 = r2;
        this.A04 = y1q;
        this.A00 = bleScanOperation;
        this.A02 = sFc;
        this.A03 = str;
        this.A05 = y1q2;
        this.A06 = y1q3;
    }

    public final void run() {
        Y1Q y1q;
        try {
            y1q = this.A04;
            y1q.A00 = this.A00.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            y1q = this.A04;
            y1q.A00 = null;
        }
        AnonymousClass6UF r2 = this.A01;
        synchronized (r2) {
            r2.A00 |= 4;
            AnonymousClass6UF.A00(r2, this.A02, this.A05.A00, this.A06.A00, y1q.A00, this.A03);
        }
    }
}
