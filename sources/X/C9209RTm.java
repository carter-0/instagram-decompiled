package X;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.RTm  reason: case insensitive filesystem */
public abstract class C9209RTm {
    public static TO7 A00(C13880Tj1 tj1, String str, ThreadFactory threadFactory, int i, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            return new TO7(new ThreadPoolExecutor(i, i2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new TOR(tj1, str, threadFactory, z)));
        }
        throw AnonymousClass7TF.A0W("Name must be non-null and non-empty, but given: ", str);
    }
}
