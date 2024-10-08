package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ddg  reason: case insensitive filesystem */
public final class C46364Ddg {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(C46364Ddg ddg, boolean z) {
        synchronized (ddg) {
            ddg.A01 = z;
        }
    }
}
