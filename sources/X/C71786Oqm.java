package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Oqm  reason: case insensitive filesystem */
public final class C71786Oqm implements C74540PwZ {
    public final OT7 AL4(Context context, C74299PsY psY) {
        0qQ.A0B(context, 0);
        0rm A11 = C51965G9l.A11();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        11Z.A02(new C73377Pba(context, psY, countDownLatch, A11));
        countDownLatch.await();
        Object obj = A11.A00;
        0qQ.A0A(obj);
        return (OT7) obj;
    }
}
