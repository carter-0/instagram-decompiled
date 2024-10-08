package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.MgD  reason: case insensitive filesystem */
public final class C66979MgD extends Handler {
    public final int A00 = 566770968;
    public final long A01;
    public final long A02;
    public final long A03;
    public final LightweightQuickPerformanceLogger A04;
    public final boolean A05;

    public final void handleMessage(Message message) {
        long j;
        long j2;
        Object obj;
        01c A032;
        Message message2 = message;
        0qQ.A0B(message2, 0);
        removeMessages(0);
        removeMessages(1);
        removeMessages(2);
        int i = message2.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (this.A05 && (obj = message2.obj) != null) {
                j2 = AnonymousClass7TE.A0R(obj);
                long uptimeMillis = SystemClock.uptimeMillis();
                long j3 = this.A02;
                long j4 = j3 + j2;
                01c r7 = C278374wm.A06;
                synchronized (r7) {
                    A032 = r7.A03();
                }
                int A002 = A032.A00();
                int i2 = 0;
                while (true) {
                    if (i2 >= A002) {
                        break;
                    }
                    long longValue = ((Number) A032.A04(i2)).longValue();
                    if (longValue < j2 || longValue >= j4) {
                        i2++;
                    } else if (uptimeMillis - j2 < this.A01) {
                        j = this.A03;
                    }
                }
                if (uptimeMillis - j2 >= j3 + this.A03) {
                    this.A04.markerAnnotate(this.A00, "extended_trace", true);
                }
            }
            this.A04.markerEnd(this.A00, 2);
            return;
        }
        Object obj2 = message2.obj;
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Long");
        long A0R = AnonymousClass7TE.A0R(obj2);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        int i3 = this.A00;
        lightweightQuickPerformanceLogger.markerStart(i3);
        lightweightQuickPerformanceLogger.markerAnnotate(i3, "time_since_foreground_millis", A0R);
        lightweightQuickPerformanceLogger.markerAnnotate(i3, "apl", true);
        boolean z = this.A05;
        j = this.A02;
        if (z) {
            j2 = SystemClock.uptimeMillis();
        } else {
            sendEmptyMessageDelayed(1, j);
            return;
        }
        sendMessageDelayed(obtainMessage(1, Long.valueOf(j2)), j);
    }

    public C66979MgD(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, long j, long j2, long j3, boolean z) {
        super(Looper.getMainLooper());
        this.A04 = lightweightQuickPerformanceLogger;
        this.A02 = j;
        this.A05 = z;
        this.A03 = j2;
        this.A01 = j3;
    }
}
