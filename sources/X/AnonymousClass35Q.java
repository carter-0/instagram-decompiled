package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.35Q  reason: invalid class name */
public final class AnonymousClass35Q {
    public View A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public AnonymousClass35Q(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r5) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = C227942kP.A00(r5);
    }
}
