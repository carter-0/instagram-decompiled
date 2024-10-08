package androidx.test.internal.util;

import X.AnonymousClass7TE;
import X.JTT;
import X.Pxf;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public abstract class Checks {
    public static final ThreadChecker A00;

    static {
        ThreadChecker threadChecker;
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            JTT.A1U(A1C, it);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (A1C.isEmpty()) {
            threadChecker = new ThreadChecker() {
            };
        } else if (A1C.size() == 1) {
            threadChecker = (ThreadChecker) A1C.get(0);
        } else {
            throw Pxf.A0Y("Found more than one %s implementations.", new Object[]{cls.getName()});
        }
        A00 = threadChecker;
    }
}
