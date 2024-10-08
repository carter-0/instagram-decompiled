package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2IO  reason: invalid class name */
public final class AnonymousClass2IO {
    public static final long A04 = 0;
    public final AnonymousClass2IM A00;
    public final AtomicInteger A01;
    public final AtomicReference A02;
    public final /* synthetic */ 2IL A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IO(2IL r1) {
        this();
        this.A03 = r1;
    }

    public AnonymousClass2IO() {
        this.A00 = new AnonymousClass2IM(A04);
        this.A02 = new AtomicReference();
        this.A01 = new AtomicInteger(0);
    }
}
