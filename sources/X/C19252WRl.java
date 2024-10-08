package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WRl  reason: case insensitive filesystem */
public final class C19252WRl implements C46215DQt {
    public final long A00;
    public final Handler A01 = new Handler();
    public final C46215DQt A02;

    public C19252WRl(C46215DQt dQt, TimeUnit timeUnit) {
        this.A02 = dQt;
        this.A00 = timeUnit.toMillis(250);
    }

    public final void DUK(Object obj) {
        long j = this.A00;
        Handler handler = this.A01;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C20295Wok(this, this.A02, obj), j);
    }

    public final void onComplete() {
        this.A02.onComplete();
        this.A01.removeCallbacksAndMessages((Object) null);
    }

    public final void onError(Throwable th) {
        this.A02.onError(th);
        this.A01.removeCallbacksAndMessages((Object) null);
    }
}
