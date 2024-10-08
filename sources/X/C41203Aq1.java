package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aq1  reason: case insensitive filesystem */
public final /* synthetic */ class C41203Aq1 implements Runnable {
    public final /* synthetic */ AnonymousClass9Tu A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ Bitmap[] A03;

    public /* synthetic */ C41203Aq1(AnonymousClass9Tu r1, ArrayList arrayList, CountDownLatch countDownLatch, Bitmap[] bitmapArr) {
        this.A00 = r1;
        this.A03 = bitmapArr;
        this.A01 = arrayList;
        this.A02 = countDownLatch;
    }

    public final void run() {
        AnonymousClass9Tu r6 = this.A00;
        Bitmap[] bitmapArr = this.A03;
        ArrayList arrayList = this.A01;
        CountDownLatch countDownLatch = this.A02;
        try {
            C346037uU r1 = (C346037uU) r6.A0O.get(0);
            0JA.A03(r1, "glSurfaceOutput is null");
            r1.ClT();
            C11354SOn sOn = r6.A0I;
            bitmapArr[0] = AnonymousClass9UO.A00(sOn.A0C, sOn.A0A);
        } catch (Exception e) {
            arrayList.add(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
