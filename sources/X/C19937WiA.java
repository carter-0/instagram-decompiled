package X;

/* renamed from: X.WiA  reason: case insensitive filesystem */
public final class C19937WiA implements Runnable {
    public final /* synthetic */ UHR A00;

    public C19937WiA(UHR uhr) {
        this.A00 = uhr;
    }

    public final void run() {
        UHR uhr = this.A00;
        if (uhr.A00) {
            C249803kO it = UHR.A00(uhr).A09.iterator();
            while (it.hasNext()) {
                it.next();
                System.currentTimeMillis();
            }
            uhr.A00.postDelayed(this, 10000);
        }
    }
}
