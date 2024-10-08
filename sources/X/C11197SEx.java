package X;

import android.net.ConnectivityManager;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.SEx  reason: case insensitive filesystem */
public final class C11197SEx {
    public static final C9826Rho A03 = new Object();
    public static volatile C11197SEx A04;
    public final ConnectivityManager.NetworkCallback A00 = new C7355Q6k(this, 1);
    public final NetworkSession A01;
    public volatile boolean A02;

    public C11197SEx(NetworkSession networkSession) {
        this.A01 = networkSession;
    }
}
