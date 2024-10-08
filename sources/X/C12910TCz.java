package X;

/* renamed from: X.TCz  reason: case insensitive filesystem */
public final class C12910TCz implements Runnable {
    public final /* synthetic */ STN A00;

    public C12910TCz(STN stn) {
        this.A00 = stn;
    }

    public final void run() {
        C13828Thz thz = this.A00.A05;
        if (thz != null) {
            thz.cancel();
        }
    }
}
