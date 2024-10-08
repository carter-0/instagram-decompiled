package X;

import android.app.Application;
import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4xm  reason: invalid class name and case insensitive filesystem */
public final class C278944xm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final C278934xl A04;
    public final 2Pm A05;
    public final 2Pm A06;
    public final 2Pn A07;
    public final C278924xk A08;
    public final Executor A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final boolean A0B;

    public static void A00(C278944xm r4, CharSequence charSequence, String str, String str2, int i, int i2, int i3, long j, long j2) {
        2Pm r42 = r4.A06;
        if (r42 != null) {
            EventBuilder A002 = 2Pm.A00(r42, str, "compression_failed", System.currentTimeMillis());
            A002.annotate("attempt_number", i);
            A002.annotate("hprof_id", charSequence.toString());
            A002.annotate("original_file_size", j);
            A002.annotate(TraceFieldType.CompressionType, i2);
            A002.annotate("compression_level", i3);
            A002.annotate("time_spent_compressing_ms", (int) j2);
            A002.annotate("reason", str2);
            A002.report();
        }
    }

    public C278944xm(Application application, C278934xl r4, C278924xk r5, Executor executor, int i, int i2, int i3, boolean z) {
        2Pm r0;
        2Pn r02;
        this.A08 = r5;
        this.A09 = executor;
        this.A04 = r4;
        this.A03 = application.getApplicationContext();
        2QF A002 = 2QF.A00();
        synchronized (A002) {
            r0 = A002.A0D;
        }
        this.A06 = r0;
        2QF A003 = 2QF.A00();
        synchronized (A003) {
            r02 = A003.A0E;
        }
        this.A07 = r02;
        this.A05 = 2QF.A00().A0C;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = z;
    }
}
