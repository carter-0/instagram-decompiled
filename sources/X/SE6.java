package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

public final class SE6 {
    public ExecutorService A00;
    public final File A01;

    public SE6(AnonymousClass1BJ r3, ExecutorService executorService) {
        0qQ.A0B(executorService, 2);
        File file = null;
        try {
            file = r3.AXT((1LJ) null, 384226697);
        } catch (Exception unused) {
        }
        this.A00 = executorService;
        this.A01 = file;
    }

    public static final File A00(SE6 se6, String str) {
        File file = se6.A01;
        if (file == null) {
            return null;
        }
        StringBuilder A0n = AnonymousClass7TF.A0n("callSummaryInfo");
        A0n.append('.');
        A0n.append(str);
        return JTO.A0s(file, AnonymousClass7TF.A0l(".callsum", A0n));
    }
}
