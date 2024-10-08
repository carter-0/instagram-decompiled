package X;

/* renamed from: X.PYW  reason: case insensitive filesystem */
public final class C73192PYW implements Runnable {
    public final /* synthetic */ NVX A00;
    public final /* synthetic */ NIM A01;

    public C73192PYW(NVX nvx, NIM nim) {
        this.A00 = nvx;
        this.A01 = nim;
    }

    public final void run() {
        NVX nvx = this.A00;
        DbW.A0T(nvx.getSession()).A02(nvx.requireActivity(), this.A01);
    }
}
