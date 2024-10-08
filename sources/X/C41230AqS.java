package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;

/* renamed from: X.AqS  reason: case insensitive filesystem */
public final /* synthetic */ class C41230AqS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AWU A01;
    public final /* synthetic */ C367908rl A02;
    public final /* synthetic */ ListenableFuture A03;
    public final /* synthetic */ Object A04;

    public /* synthetic */ C41230AqS(AWU awu, C367908rl r2, ListenableFuture listenableFuture, Object obj, int i) {
        this.A02 = r2;
        this.A04 = obj;
        this.A00 = i;
        this.A01 = awu;
        this.A03 = listenableFuture;
    }

    public final void run() {
        C367908rl r3 = this.A02;
        Object obj = this.A04;
        int i = this.A00;
        AWU awu = this.A01;
        try {
            r3.A06(awu, this.A03, obj, i);
        } catch (Throwable th) {
            C367698rQ.A0N.log(Level.WARNING, "Exception thrown during refresh", th);
            awu.A01.setException(th);
        }
    }
}
