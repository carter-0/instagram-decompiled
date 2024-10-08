package X;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: X.5Th  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285935Th implements Executor {
    public final /* synthetic */ Choreographer A00;

    public /* synthetic */ C285935Th(Choreographer choreographer) {
        this.A00 = choreographer;
    }

    public final void execute(Runnable runnable) {
        this.A00.postFrameCallback(new C11466SaU(runnable));
    }
}
