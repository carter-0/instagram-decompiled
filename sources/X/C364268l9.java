package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.8l9  reason: invalid class name and case insensitive filesystem */
public final class C364268l9 {
    public static C364268l9 A08;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Handler A06 = new Handler(Looper.getMainLooper(), new C364278lA(this));
    public final C3496981j A07 = new C3496981j();

    public static synchronized C364268l9 A00() {
        C364268l9 r0;
        synchronized (C364268l9.class) {
            r0 = A08;
            if (r0 == null) {
                r0 = new C364268l9();
                A08 = r0;
            }
        }
        return r0;
    }

    public static void A01(C364268l9 r4, int i, long j) {
        if (!r4.A07.A00.isEmpty()) {
            Handler handler = r4.A06;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }

    public final void A02() {
        long j = this.A02;
        if (j == 0) {
            this.A02 = SystemClock.elapsedRealtime();
            A01(this, 5, this.A00);
            return;
        }
        A01(this, 3, j);
        this.A02 = SystemClock.elapsedRealtime();
    }

    public final void A03() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A01(this, 4, this.A00);
            return;
        }
        A01(this, 2, j);
        this.A01 = SystemClock.elapsedRealtime();
    }
}
