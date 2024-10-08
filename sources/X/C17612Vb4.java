package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vb4  reason: case insensitive filesystem */
public final class C17612Vb4 {
    public final C276954uB A00 = new C18974WFb(this);
    public final C276934u9 A01 = new C18975WFc(this);
    public final C276904u6 A02;
    public final AnonymousClass0JR A03;
    public final QuickPerformanceLogger A04;
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final 0Gb mFbErrorReporter;

    public C17612Vb4(0Gb r3, QuickPerformanceLogger quickPerformanceLogger) {
        C276904u6 A002;
        this.A04 = quickPerformanceLogger;
        this.A03 = new AnonymousClass0HP(new AnonymousClass2P2());
        this.mFbErrorReporter = r3;
        synchronized (C276904u6.class) {
            A002 = C276904u6.A05.A00();
        }
        this.A02 = A002;
    }
}
