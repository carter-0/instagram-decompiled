package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.T6w  reason: case insensitive filesystem */
public final class C12786T6w implements C74383Pty {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ String[] A01;

    public final /* synthetic */ void DCq(String str, int i, String str2) {
        0qQ.A0B(str, 1);
        0KC.A0O("MediaSaver", "Failed to fetch media from media store", new Object[]{str});
        this.A00.countDown();
    }

    public C12786T6w(CountDownLatch countDownLatch, String[] strArr) {
        this.A00 = countDownLatch;
        this.A01 = strArr;
    }

    public final void Dog(String str, boolean z) {
        this.A01[0] = str;
        this.A00.countDown();
    }
}
