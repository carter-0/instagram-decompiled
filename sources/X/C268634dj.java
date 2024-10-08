package X;

import android.net.NetworkInfo;
import com.facebook.tigon.appnetsessionid.SessionIdGenerator;
import com.instagram.common.session.UserSession;

/* renamed from: X.4dj  reason: invalid class name and case insensitive filesystem */
public final class C268634dj implements C61110lV, AnonymousClass0lh, AnonymousClass0qK {
    public final SessionIdGenerator A00 = new SessionIdGenerator();
    public final UserSession A01;

    public final synchronized void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1312821224);
        this.A00.onBackground();
        AnonymousClass0fD.A0A(-747039300, A03);
    }

    public final synchronized void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-459785917);
        this.A00.onForeground();
        AnonymousClass0fD.A0A(991462570, A03);
    }

    public final synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        this.A00.onNetworkChange();
    }

    public final synchronized void onSessionWillEnd() {
        14i.A06(this);
        C61940qJ.A00(this);
    }

    public C268634dj(UserSession userSession) {
        this.A01 = userSession;
    }
}
