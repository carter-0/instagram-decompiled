package X;

/* renamed from: X.Aoi  reason: case insensitive filesystem */
public final class C41122Aoi implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 0sL A01;
    public final /* synthetic */ boolean A02;

    public C41122Aoi(String str, 0sL r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = str;
    }

    public final void run() {
        this.A01.invoke(Boolean.valueOf(this.A02), this.A00);
    }
}
