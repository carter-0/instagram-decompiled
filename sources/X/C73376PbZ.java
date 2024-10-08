package X;

/* renamed from: X.PbZ  reason: case insensitive filesystem */
public final class C73376PbZ implements Runnable {
    public final /* synthetic */ C74438Put A00;
    public final /* synthetic */ C68080Mzl A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;

    public C73376PbZ(C74438Put put, C68080Mzl mzl, Boolean bool, Integer num) {
        this.A01 = mzl;
        this.A00 = put;
        this.A03 = num;
        this.A02 = bool;
    }

    public final void run() {
        this.A01.E2w(this.A00, this.A02, this.A03);
    }
}
