package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.38M  reason: invalid class name */
public final class AnonymousClass38M implements AnonymousClass38N {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass38P A01;
    public final Executor A02 = new AnonymousClass38O(this);
    public final AnonymousClass4CZ A03;

    public final /* synthetic */ void ATP(Runnable runnable) {
        this.A01.execute(runnable);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4CZ, X.38Q] */
    public AnonymousClass38M(Executor executor) {
        AnonymousClass38P r1 = new AnonymousClass38P(executor);
        this.A01 = r1;
        this.A03 = new AnonymousClass38Q(r1);
    }
}
