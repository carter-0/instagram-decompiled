package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.37U  reason: invalid class name */
public final class AnonymousClass37U implements AnonymousClass0lh {
    public int A00;
    public int A01;
    public boolean A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final UserSession A04;
    public final Map A05 = new LinkedHashMap();
    public final Map A06 = new LinkedHashMap();

    public AnonymousClass37U(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
    }

    public final void onSessionWillEnd() {
    }
}
