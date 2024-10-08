package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.2f3  reason: invalid class name and case insensitive filesystem */
public final class C225872f3 implements C225882f4 {
    public Object A00;
    public CountDownLatch A01 = new CountDownLatch(1);
    public final /* synthetic */ long A02;
    public final /* synthetic */ 1NH A03;

    public C225872f3(1NH r3, long j) {
        this.A03 = r3;
        this.A02 = j;
    }

    public final void DCn(Exception exc) {
        this.A01.countDown();
    }

    public final void onResult(Object obj) {
        this.A01.countDown();
        this.A00 = obj;
    }
}
