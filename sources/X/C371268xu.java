package X;

/* renamed from: X.8xu  reason: invalid class name and case insensitive filesystem */
public final class C371268xu implements Runnable {
    public final /* synthetic */ C371238xr A00;
    public final /* synthetic */ boolean A01;

    public C371268xu(C371238xr r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        C371228xq r0 = this.A00.A04;
        boolean z = this.A01;
        C3730593v r1 = r0.A00.A03;
        if (r1 != null) {
            int i = 2;
            if (z) {
                i = 1;
            }
            r1.updateOutputRouteState(i);
        }
    }
}
