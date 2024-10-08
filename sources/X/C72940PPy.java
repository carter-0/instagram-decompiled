package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.PPy  reason: case insensitive filesystem */
public final class C72940PPy implements 0Jv {
    public final /* synthetic */ C72939PPx A00;
    public final /* synthetic */ CountDownLatch A01;

    public C72940PPy(C72939PPx pPx, CountDownLatch countDownLatch) {
        this.A01 = countDownLatch;
        this.A00 = pPx;
    }

    public final /* bridge */ /* synthetic */ void AId(Object obj) {
        this.A01.countDown();
        AnonymousClass1HI.A02.Eym(new C68678NSk(this.A00));
    }
}
