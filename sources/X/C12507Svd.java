package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.Svd  reason: case insensitive filesystem */
public final class C12507Svd implements C2818759x {
    public static final AnonymousClass2hV A03 = new SzZ(10);
    public final ListenableFuture A00;
    public final AnonymousClass2hV A01;
    public final Map A02 = Pxf.A0w();

    public final void A9U(AnonymousClass5A7 r4) {
        T0K t0k = new T0K(r4, this.A01);
        this.A02.put(r4, t0k);
        C255183ti.A04(t0k, this.A00, 1Lf.A01);
    }

    public final void AOY(AnonymousClass5A7 r3) {
        T0K t0k = (T0K) this.A02.remove(r3);
        if (t0k != null) {
            t0k.A00.set((Object) null);
        }
    }

    public C12507Svd(AnonymousClass2hV r2, ListenableFuture listenableFuture) {
        this.A00 = listenableFuture;
        this.A01 = r2;
    }
}
