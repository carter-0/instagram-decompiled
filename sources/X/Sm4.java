package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ExecutorService;

public final class Sm4 implements C13418TZz {
    public final C11210SFk A00;
    public final QuickPerformanceLogger A01;
    public final ExecutorService A02;

    public Sm4(C11210SFk sFk, QuickPerformanceLogger quickPerformanceLogger, ExecutorService executorService) {
        if (sFk != null) {
            this.A00 = sFk;
            if (quickPerformanceLogger != null) {
                this.A01 = quickPerformanceLogger;
                this.A02 = executorService;
                return;
            }
            throw AnonymousClass7TE.A0z("qpl == null");
        }
        throw AnonymousClass7TE.A0z("client == null");
    }
}
