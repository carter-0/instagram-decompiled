package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class S1Z {
    public final int A00 = 2SP.A01.A03();
    public final QuickPerformanceLogger A01;
    public final C262224Cq A02;

    public final void A00(RLJ rlj, String str) {
        AnonymousClass7TF.A1H(str, rlj);
        C262224Cq r0 = this.A02;
        AnonymousClass7TE.A1Z(new C59842JaI(rlj, this, str, (AnonymousClass4D7) null, 0), r0);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4Cc, X.38Q] */
    public S1Z() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A02 = 19E.A02(new AnonymousClass38Q(newSingleThreadExecutor));
        this.A01 = QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
