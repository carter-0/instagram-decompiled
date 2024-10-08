package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.55E  reason: invalid class name */
public final class AnonymousClass55E implements C13907Tl7 {
    public Runnable A00;
    public final Context A01;
    public final UserSession A02;
    public final Handler A03;

    public AnonymousClass55E(Context context, Handler handler, UserSession userSession) {
        0qQ.A0B(handler, 3);
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = handler;
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final void onStart(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A03.removeCallbacks(runnable);
        }
    }

    public final void onStop(AnonymousClass07Z r7) {
        0qQ.A0B(r7, 0);
        C12932TDv tDv = new C12932TDv(this);
        this.A00 = tDv;
        this.A03.postDelayed(tDv, TimeUnit.SECONDS.toMillis(182.A01(0Tu.A05, this.A02, 36601999059325333L)));
    }
}
