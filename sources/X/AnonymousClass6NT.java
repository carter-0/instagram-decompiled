package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.6NT  reason: invalid class name */
public final class AnonymousClass6NT implements Executor {
    public final /* synthetic */ AnonymousClass6NS A00;

    public AnonymousClass6NT(AnonymousClass6NS r1) {
        this.A00 = r1;
    }

    public final void execute(Runnable runnable) {
        Handler A002 = C276984uE.A00();
        Object obj = this.A00.A01;
        A002.removeCallbacksAndMessages(obj);
        A002.postAtTime(runnable, obj, 0);
    }
}
