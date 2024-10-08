package X;

import android.os.Handler;
import android.os.Message;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7nJ  reason: invalid class name and case insensitive filesystem */
public final class C341657nJ implements Handler.Callback {
    public C341567nA A00;
    public final Handler A01;
    public final /* synthetic */ C341647nI A02;

    private void A00(int i, String str, int i2) {
        if (i2 == 4) {
            this.A02.A04.A03.A02();
        }
        C391719tX r2 = new C391719tX(i, String.format((Locale) null, "%s, msg %s", new Object[]{str, C341647nI.A00(i2)}));
        C341627nG r1 = this.A02.A04;
        r2.A01(r1.A03());
        r1.A04(r2);
    }

    public C341657nJ(Handler handler, C341567nA r2, C341647nI r3) {
        this.A02 = r3;
        this.A01 = handler;
        this.A00 = r2;
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        Object obj = message2.obj;
        CountDownLatch countDownLatch = new CountDownLatch(2);
        String A002 = C341647nI.A00(i);
        if (this.A01.post(new C378699Qw(new C378709Qx(this, A002, countDownLatch), this, obj, A002, countDownLatch, i))) {
            try {
                if (!countDownLatch.await(10, TimeUnit.SECONDS)) {
                    if (countDownLatch.getCount() == 2) {
                        A00(20002, "Timeout while waiting for operation to start executing", i);
                    } else if (countDownLatch.getCount() == 1) {
                        A00(20001, "Timeout while waiting for operation to finish", i);
                    }
                }
            } catch (InterruptedException e) {
                C341567nA r3 = this.A00;
                C341647nI r1 = this.A02;
                long hashCode = (long) r1.hashCode();
                r3.Cjw(new C382309dU(e), "recording_controller_error", "RecordingControllerImpl", r1.A04.A02(), "high", A002, hashCode);
                throw new RuntimeException("Message thread was interrupted");
            }
        } else {
            A00(20003, "Couldn't pass operation to queue, most likely it is exiting", i);
        }
        if (i == 5) {
            C341647nI r2 = this.A02;
            C341447mt.A02(r2.A00, false, true);
            C341447mt.A02(r2.A01, false, true);
        }
        return true;
    }
}
