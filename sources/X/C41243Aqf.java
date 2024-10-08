package X;

/* renamed from: X.Aqf  reason: case insensitive filesystem */
public final class C41243Aqf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C371638yj A02;
    public final /* synthetic */ C371648yk A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C41243Aqf(C371638yj r1, C371648yk r2, String str, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A04 = str;
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
    }

    public final void run() {
        C390669re r2;
        C371638yj r6 = this.A02;
        C312336eF r5 = r6.A04;
        String str = this.A04;
        boolean z = this.A05;
        int i = this.A01;
        if (i < 0 || i >= C390669re.values().length) {
            r2 = C390669re.Text;
        } else {
            r2 = C390669re.values()[i];
        }
        A6V a6v = new A6V(r2, str, this.A00, z);
        C371648yk r0 = this.A03;
        if (r0 == null) {
            r0 = r6;
        }
        r5.DCT(a6v, r0);
    }
}
