package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class T90 implements Closeable, AnonymousClass07Y, C13971TmZ {
    public static final C10268RpS A05 = new C10268RpS("MobileVisionBase", "");
    public final C10902S0c A00;
    public final AnonymousClass9GD A01;
    public final R2v A02;
    public final Executor A03;
    public final AtomicBoolean A04 = JTQ.A0k();

    @OnLifecycleEvent(07T.ON_DESTROY)
    public synchronized void close() {
        if (!this.A04.getAndSet(true)) {
            this.A00.A00();
            R2v r2v = this.A02;
            Executor executor = this.A03;
            if (r2v.A02.get() > 0) {
                r2v.A00.A02(new THM(new C365498nD(), r2v), executor);
            } else {
                throw Pxe.A0i();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Rxb, java.lang.Object] */
    public T90(C11332SNl sNl, R2v r2v, SJS sjs, Executor executor) {
        RJB rjb;
        this.A02 = r2v;
        C10902S0c s0c = new C10902S0c();
        this.A00 = s0c;
        this.A03 = executor;
        r2v.A02.incrementAndGet();
        AnonymousClass9GD A012 = r2v.A01(s0c.A00, C13157TNp.A00, executor);
        A012.A0A(SzB.A00, AnonymousClass9GH.A00);
        this.A01 = A012;
        ? obj = new Object();
        if (sjs.A01()) {
            rjb = RJB.TYPE_THICK;
        } else {
            rjb = RJB.TYPE_THIN;
        }
        obj.A01 = rjb;
        obj.A03 = new C10611Rv5((S4P) null, (C10756Rxa) null, new S42(RJA.LATIN));
        C10612Rv6 rv6 = new C10612Rv6(obj, 1);
        RJJ.A01.execute(new C13064TJu(XSa.A04, sNl, rv6, C11332SNl.A00(sNl)));
    }
}
