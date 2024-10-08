package X;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.Locale;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.T8v  reason: case insensitive filesystem */
public class C12826T8v implements Closeable {
    public static final Map A07 = AnonymousClass7TE.A1E();
    public double A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04 = 2147483647L;
    public long A05 = -2147483648L;
    public final String A06;

    public C12826T8v(String str) {
        this.A06 = str;
    }

    public static void A00(C12826T8v t8v) {
        t8v.A01 = 0;
        t8v.A00 = 0.0d;
        t8v.A02 = 0;
        t8v.A04 = 2147483647L;
        t8v.A05 = -2147483648L;
    }

    public final void close() {
        if (!(this instanceof C8510Qw6)) {
            long j = this.A02;
            if (j != 0) {
                long A0P = AnonymousClass7TE.A0P(SystemClock.elapsedRealtimeNanos()) - j;
                long A0P2 = AnonymousClass7TE.A0P(SystemClock.elapsedRealtimeNanos());
                long j2 = this.A03;
                if (j2 != 0 && A0P2 - j2 >= 1000000) {
                    A00(this);
                }
                this.A03 = A0P2;
                int i = this.A01 + 1;
                this.A01 = i;
                double d = this.A00 + ((double) A0P);
                this.A00 = d;
                long min = Math.min(this.A04, A0P);
                this.A04 = min;
                long max = Math.max(this.A05, A0P);
                this.A05 = max;
                if (i % 50 == 0) {
                    String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", new Object[]{this.A06, Long.valueOf(A0P), Integer.valueOf(i), Long.valueOf(min), Long.valueOf(max), Integer.valueOf((int) (d / ((double) i)))});
                    C11143SBy.A00();
                }
                if (this.A01 % CameraCapturer.OPEN_CAMERA_DELAY_MS == 0) {
                    A00(this);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Did you forget to call start()?");
        }
    }
}
