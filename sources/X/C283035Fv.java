package X;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: X.5Fv  reason: invalid class name and case insensitive filesystem */
public final class C283035Fv implements Runnable {
    public final Context A00;
    public final C283005Fp A01;
    public final C283015Ft A02;
    public final AnonymousClass3DG A03;
    public final C2379539x A04 = new Object();
    public final AnonymousClass38N A05;

    static {
        AnonymousClass389.A01("WorkForegroundRunnable");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39y, X.39x, java.lang.Object] */
    public final void run() {
        if (!this.A03.A0J || Build.VERSION.SDK_INT >= 31) {
            this.A04.A07((Object) null);
            return;
        }
        ? obj = new Object();
        Executor executor = ((AnonymousClass38M) this.A05).A02;
        executor.execute(new TEs(this, obj));
        obj.addListener(new TEt(this, obj), executor);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.39x, java.lang.Object] */
    public C283035Fv(Context context, C283005Fp r3, C283015Ft r4, AnonymousClass3DG r5, AnonymousClass38N r6) {
        this.A00 = context;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r6;
    }
}
