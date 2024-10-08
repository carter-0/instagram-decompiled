package X;

/* renamed from: X.FsV  reason: case insensitive filesystem */
public final class C51337FsV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47492E4w A01;

    public C51337FsV(C47492E4w e4w, int i) {
        this.A01 = e4w;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A00.scrollBy(0, this.A00);
    }
}
