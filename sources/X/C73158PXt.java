package X;

/* renamed from: X.PXt  reason: case insensitive filesystem */
public final class C73158PXt implements Runnable {
    public final /* synthetic */ C307706Rd A00;
    public final /* synthetic */ String A01;

    public C73158PXt(C307706Rd r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final void run() {
        this.A00.A01.remove(this.A01);
    }
}
