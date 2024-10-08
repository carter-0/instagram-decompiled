package X;

import java.io.IOException;

/* renamed from: X.4dh  reason: invalid class name and case insensitive filesystem */
public final class C268614dh extends 0ng {
    public final /* synthetic */ 1Qe A00;
    public final /* synthetic */ 1QS A01;
    public final /* synthetic */ 1Lt A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C268614dh(1Qe r2, 1QS r3, 1Lt r4) {
        super(553);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void run() {
        1Qe r3 = this.A00;
        1QS r2 = this.A01;
        r3.A04(r2, new IOException("RequestCacheServiceLayer: no content"));
        this.A02.A01.markerEnd(r2, 3);
    }
}
