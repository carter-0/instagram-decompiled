package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.309  reason: invalid class name */
public final class AnonymousClass309 extends C235412zs {
    public Runnable A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final UserSession A02;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        View view = (View) this.A00.get(r11.A03);
        if (view instanceof C267924cT) {
            C267924cT r2 = (C267924cT) view;
            float CFe = r12.CFe(r11);
            UserSession userSession = this.A02;
            0Tu r7 = 0Tu.A05;
            double A002 = 182.A00(r7, userSession, 37157660453306431L);
            double d = (double) CFe;
            if (d >= A002) {
                if (!r2.isPlaying()) {
                    double A003 = 182.A00(r7, userSession, 37157660453371968L);
                    if (A003 <= 0.0d) {
                        r2.EIx();
                    } else if (this.A00 == null) {
                        C57840IhJ ihJ = new C57840IhJ(r2, this);
                        this.A00 = ihJ;
                        this.A01.postDelayed(ihJ, (long) (A003 * 1000.0d));
                    }
                }
            } else if (d >= A002 || CFe <= 0.0f) {
                Runnable runnable = this.A00;
                if (runnable != null) {
                    this.A01.removeCallbacks(runnable);
                    this.A00 = null;
                }
                r2.stop();
            } else {
                Runnable runnable2 = this.A00;
                if (runnable2 != null) {
                    this.A01.removeCallbacks(runnable2);
                    this.A00 = null;
                }
                r2.pause();
            }
        }
    }

    public AnonymousClass309(UserSession userSession, Map map) {
        super(map);
        this.A02 = userSession;
    }
}
