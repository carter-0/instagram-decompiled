package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Y3d  reason: case insensitive filesystem */
public final class C22421Y3d implements Runnable {
    public final /* synthetic */ AnonymousClass6UF A00;
    public final /* synthetic */ C11202SFc A01;
    public final /* synthetic */ QLS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Y1Q A04;
    public final /* synthetic */ Y1Q A05;
    public final /* synthetic */ Y1Q A06;

    public C22421Y3d(AnonymousClass6UF r1, C11202SFc sFc, QLS qls, String str, Y1Q y1q, Y1Q y1q2, Y1Q y1q3) {
        this.A00 = r1;
        this.A06 = y1q;
        this.A02 = qls;
        this.A01 = sFc;
        this.A03 = str;
        this.A05 = y1q2;
        this.A04 = y1q3;
    }

    public final void run() {
        Y1Q y1q;
        try {
            y1q = this.A06;
            y1q.A00 = this.A02.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            y1q = this.A06;
            y1q.A00 = null;
        }
        AnonymousClass6UF r2 = this.A00;
        synchronized (r2) {
            r2.A00 |= 2;
            AnonymousClass6UF.A00(r2, this.A01, this.A05.A00, y1q.A00, this.A04.A00, this.A03);
        }
    }
}
