package X;

/* renamed from: X.LxM  reason: case insensitive filesystem */
public final class C65645LxM implements C66461MSp {
    public final /* synthetic */ C293505kq A00;
    public final /* synthetic */ K66 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C65645LxM(C293505kq r1, K66 k66, String str, String str2, boolean z) {
        this.A01 = k66;
        this.A04 = z;
        this.A02 = str;
        this.A00 = r1;
        this.A03 = str2;
    }

    public final void afterSelection(boolean z) {
        K66 k66 = this.A01;
        if (k66.getRootActivity() != null) {
            boolean z2 = this.A04;
            K66.A0D(this.A00, k66, this.A02, this.A03, z2);
        }
    }
}
