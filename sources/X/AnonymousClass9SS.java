package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9SS  reason: invalid class name */
public final class AnonymousClass9SS {
    public Runnable A00;
    public final Activity A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final UserSession A03;
    public final WeakReference A04;

    public final boolean A01() {
        UserSession userSession = this.A03;
        1Av A002 = 1Au.A00(userSession);
        if (AnonymousClass7TG.A1a(A002, A002.A3o, 1Av.A8a, 338) || !182.A06(0Tu.A05, userSession, 36320880565101482L)) {
            return false;
        }
        return true;
    }

    public AnonymousClass9SS(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A04 = new WeakReference(activity);
    }

    public final void A00(C62320sa r12) {
        Activity activity;
        int i;
        Activity activity2;
        if (A01()) {
            UserSession userSession = this.A03;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36320880564970408L)) {
                activity = this.A01;
                i = 2131962931;
            } else if (182.A06(r5, userSession, 36320880564904871L)) {
                activity = this.A01;
                i = 2131962932;
            } else {
                return;
            }
            String string = activity.getString(i);
            if (string != null) {
                Context context = activity;
                if (182.A06(r5, userSession, 36323547739598079L)) {
                    context = 2Yn.A01(activity);
                }
                C358248ab r52 = new C358248ab(context);
                r52.A0j(activity.getDrawable(R.drawable.ig_illustrations_illo_camera_roll_reels_refresh));
                r52.A09(2131962934);
                r52.A0q(string);
                r52.A0V((DialogInterface.OnClickListener) null, C358278ae.BLUE_BOLD, AnonymousClass7TE.A16(activity, 2131968772), activity.getString(2131962933), true);
                r52.A0f(new I9B(r12, 1));
                r52.A0s(true);
                Dialog A022 = r52.A02();
                WeakReference weakReference = this.A04;
                if (weakReference.get() != null && (activity2 = (Activity) weakReference.get()) != null && !activity2.isFinishing()) {
                    Runnable runnable = this.A00;
                    if (runnable == null) {
                        this.A00 = new C41032AnG(A022, this);
                    } else {
                        this.A02.removeCallbacks(runnable);
                    }
                    Handler handler = this.A02;
                    Runnable runnable2 = this.A00;
                    if (runnable2 == null) {
                        0qQ.A0F("dialogNuxRunnable");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    handler.postDelayed(runnable2, 200);
                    1Av A002 = 1Au.A00(userSession);
                    AnonymousClass7TF.A1J(A002, A002.A3o, 1Av.A8a, 338, true);
                }
            }
        }
    }
}
