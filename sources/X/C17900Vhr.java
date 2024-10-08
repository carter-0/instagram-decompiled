package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Vhr  reason: case insensitive filesystem */
public final class C17900Vhr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04 = new HashSet();
    public final UserSession A05;

    public C17900Vhr(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A03 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A02 = r2.getModuleName();
    }

    public final synchronized void A00() {
        synchronized (this) {
            Set set = this.A04;
            if (set.contains(528295024)) {
                02m.A0p.markerEnd(528295024, 2);
                set.remove(528295024);
            }
        }
    }
}
