package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeClientManager$MessageDeliveryCallback;

/* renamed from: X.7Gu  reason: invalid class name and case insensitive filesystem */
public final class C328927Gu implements 0lm {
    public long A00;
    public long A01;
    public String A02;
    public final Handler A03;
    public final C60640iu A04;
    public final RealtimeClientManager$MessageDeliveryCallback A05;
    public final RealtimeClientManager A06;
    public final Handler.Callback A07;
    public final UserSession A08;
    public final C61410nE A09;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C328927Gu(C60640iu r4, UserSession userSession, C61410nE r6, RealtimeClientManager realtimeClientManager) {
        C328947Gw r2 = new C328947Gw(this);
        this.A07 = r2;
        this.A01 = 10000;
        this.A05 = new C328957Gx(this);
        this.A09 = r6;
        this.A08 = userSession;
        this.A04 = r4;
        this.A06 = realtimeClientManager;
        this.A03 = new Handler(Looper.getMainLooper(), r2);
    }

    public C328927Gu() {
    }
}
