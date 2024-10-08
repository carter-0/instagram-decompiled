package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aq0  reason: case insensitive filesystem */
public final /* synthetic */ class C41202Aq0 implements Runnable {
    public final /* synthetic */ AnonymousClass9Tu A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ Bitmap[] A03;

    public /* synthetic */ C41202Aq0(AnonymousClass9Tu r1, ArrayList arrayList, CountDownLatch countDownLatch, Bitmap[] bitmapArr) {
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
            int i = r6.A02;
            if (i <= 0) {
                i = r6.A0I.A0C;
            }
            int i2 = r6.A01;
            if (i2 <= 0) {
                i2 = r6.A0I.A0A;
            }
            bitmapArr[0] = AnonymousClass9UO.A00(i, i2);
        } catch (Exception e) {
            arrayList.add(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
