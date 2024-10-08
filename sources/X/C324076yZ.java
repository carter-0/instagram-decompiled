package X;

/* renamed from: X.6yZ  reason: invalid class name and case insensitive filesystem */
public final class C324076yZ implements Runnable {
    public final /* synthetic */ C322126vI A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ boolean A02;

    public C324076yZ(C322126vI r1, 0sP r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        boolean z = false;
        if (this.A02 != this.A00.A03) {
            z = true;
        }
        this.A01.invoke(Boolean.valueOf(z));
    }
}
