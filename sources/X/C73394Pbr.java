package X;

/* renamed from: X.Pbr  reason: case insensitive filesystem */
public final class C73394Pbr implements Runnable {
    public final /* synthetic */ C74438Put A00;
    public final /* synthetic */ C68080Mzl A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public C73394Pbr(C74438Put put, C68080Mzl mzl, Boolean bool, Integer num, boolean z) {
        this.A01 = mzl;
        this.A00 = put;
        this.A03 = num;
        this.A02 = bool;
        this.A04 = z;
    }

    public final void run() {
        C68080Mzl mzl = this.A01;
        C68080Mzl.A00(this.A00, mzl, this.A02, this.A03, this.A04);
    }
}
