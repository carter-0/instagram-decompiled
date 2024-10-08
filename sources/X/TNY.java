package X;

import com.instagram.analytics.analytics2.IgAnalytics2TaskBasedUploader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class TNY implements Callable {
    public final /* synthetic */ C251963nx A00;
    public final /* synthetic */ C251953nw A01;
    public final /* synthetic */ IgAnalytics2TaskBasedUploader A02;

    public TNY(C251963nx r1, C251953nw r2, IgAnalytics2TaskBasedUploader igAnalytics2TaskBasedUploader) {
        this.A02 = igAnalytics2TaskBasedUploader;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            AtomicInteger atomicInteger = IgAnalytics2TaskBasedUploader.A01;
            int i = atomicInteger.get();
            AtomicInteger atomicInteger2 = IgAnalytics2TaskBasedUploader.A02;
            if (i <= atomicInteger2.get()) {
                return this.A02.A00(this.A01, 0, 0);
            }
            0KC.A0P("IgAnalytics2TaskBasedUploader", "Rejecting upload callback. %d requests started out of %d", new Object[]{Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get())});
            throw JTO.A0u("Too many concurrent requests");
        } catch (IOException e) {
            this.A00.A00(e);
            throw e;
        }
    }
}
