package X;

/* renamed from: X.Qff  reason: case insensitive filesystem */
public final class C8035Qff extends SRc {
    public final int A00;
    public final int A01;
    public final int[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8035Qff(String str, int[] iArr, int i, int i2, int i3, boolean z, boolean z2) {
        super(i, z, z2);
        0qQ.A0B(iArr, 6);
        this.A00 = i2;
        if (str != null) {
            this.A05.A0B(str);
        }
        this.A02 = iArr;
        this.A01 = i3;
        this.A04.put(i, str);
    }
}
