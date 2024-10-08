package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ewx  reason: case insensitive filesystem */
public final class C49518Ewx {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(C49518Ewx ewx, boolean z) {
        synchronized (ewx) {
            ewx.A01 = z;
        }
    }
}
