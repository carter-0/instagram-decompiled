package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4u4  reason: invalid class name and case insensitive filesystem */
public final class C276884u4 implements C276894u5 {
    public final C276954uB A00 = C276944uA.A00;
    public final C276934u9 A01 = new C276924u8();
    public final C276904u6 A02 = C276904u6.A05.A00();
    public final QuickPerformanceLogger A03;

    public final C14533Txt A00(int i, int i2, long j) {
        boolean z;
        boolean z2;
        C276954uB r7 = this.A00;
        long now = r7.now();
        2Hy r0 = 2Hy.A04;
        AtomicLong atomicLong = r0.A03;
        long A002 = HSB.A00(now, atomicLong.get(), atomicLong.get());
        if (A002 != -1) {
            z = false;
            z2 = false;
        } else if (now - j > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            A002 = now - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            z = true;
            z2 = true;
        } else {
            A002 = j;
            z = true;
            z2 = false;
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        0qQ.A0A(quickPerformanceLogger);
        C276904u6 r9 = this.A02;
        C14533Txt txt = new C14533Txt(r7, this.A01, r9, quickPerformanceLogger, r0.A00, i, i2, now, A002, true, true);
        txt.CmG("using_backup_start_time", z);
        txt.CmG("using_capped_backup_start_time", z2);
        r9.A00(txt);
        return txt;
    }

    public final C276954uB C3g() {
        return this.A00;
    }

    public C276884u4(QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = quickPerformanceLogger;
    }

    public final G8K Exe(String str, int i, int i2, long j) {
        C14533Txt A002 = A00(i, i2, j);
        if (str != null) {
            A002.CmF("app_id", str);
        }
        return A002;
    }

    public final G8K Exf(int i, int i2, long j) {
        return A00(i, i2, j);
    }
}
