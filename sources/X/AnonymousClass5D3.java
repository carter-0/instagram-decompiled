package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager$Observer;
import com.instagram.realtimeclient.RealtimeClientManager$ObserverProvider;

/* renamed from: X.5D3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5D3 implements RealtimeClientManager$ObserverProvider {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 0Ka A01;

    public /* synthetic */ AnonymousClass5D3(UserSession userSession, 0Ka r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final RealtimeClientManager$Observer get(UserSession userSession) {
        0Ka r2 = this.A01;
        UserSession userSession2 = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        return (RealtimeClientManager$Observer) r2.AXH(userSession2);
    }
}
