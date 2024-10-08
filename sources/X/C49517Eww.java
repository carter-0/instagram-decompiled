package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eww  reason: case insensitive filesystem */
public final class C49517Eww {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(C49517Eww eww, boolean z) {
        synchronized (eww) {
            eww.A01 = z;
        }
    }
}
