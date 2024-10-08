package X;

import com.instagram.analytics.analytics2.IgAnalytics2TaskBasedUploader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class T7W implements 1NU {
    public final /* synthetic */ C251963nx A00;

    public T7W(C251963nx r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        0qQ.A0B(obj, 0);
        try {
            AtomicInteger atomicInteger = IgAnalytics2TaskBasedUploader.A01;
            atomicInteger.incrementAndGet();
            2ZL r0 = (2ZL) new 1QY((AnonymousClass1O9) null).then(obj);
            atomicInteger.decrementAndGet();
            return r0;
        } catch (IOException e) {
            this.A00.A00(e);
            throw e;
        } catch (Throwable th) {
            IgAnalytics2TaskBasedUploader.A01.decrementAndGet();
            throw th;
        }
    }
}
