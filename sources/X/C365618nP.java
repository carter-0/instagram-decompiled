package X;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8nP  reason: invalid class name and case insensitive filesystem */
public final class C365618nP implements Runnable {
    public final /* synthetic */ C365578nL A00;
    public final /* synthetic */ 2JF A01;

    public C365618nP(C365578nL r1, 2JF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        2JF r2 = this.A01;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C365578nL r3 = this.A00;
        boolean z = false;
        for (String str : r3.A01.A02) {
            if (0g7.A00().A01(0gR.A00(str)) != AnonymousClass05K.A0C) {
                arrayList.add(str);
                z = true;
            }
        }
        if (z) {
            C365668nU r8 = new C365668nU(r3, r2);
            C365678nV r7 = new C365678nV(arrayList, arrayList2);
            AnonymousClass0JR r9 = r2.A08;
            long now = r9.now() - r2.A00;
            if (now < 0) {
                try {
                    Thread.sleep(-now);
                } catch (InterruptedException e) {
                    0KC.A0F("GooglePlayDownloader", "Interrupted while waiting between subsequent download attempts", e);
                }
            }
            r2.A00 = r9.now();
            AnonymousClass9GD Ex7 = r2.A0B.Ex7(r7);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Executor executor = r2.A0D;
            Ex7.A08(r8, executor);
            Ex7.A08(new AW7(this, countDownLatch), executor);
            try {
                countDownLatch.await(30, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            if (!Ex7.A0D()) {
                synchronized (r8.A02) {
                    r8.A00 = true;
                }
                r3.A00.A00(new Exception(002.A0R("Never received a response from Google downloading modules: ", r7.toString())));
            }
        } else {
            r3.A00.A01(new AnonymousClass94A((Exception) null, (Integer) null, 1));
        }
        synchronized (r2) {
            r2.A04 = false;
            2JF.A01(r2);
        }
    }
}
