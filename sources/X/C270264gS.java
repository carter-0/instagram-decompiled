package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4gS  reason: invalid class name and case insensitive filesystem */
public final class C270264gS implements C61110lV, AnonymousClass0lh {
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet();
    public final Set A03 = new LinkedHashSet();
    public final UserSession A04;

    public C270264gS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        14i.A04(15Y.A02, this, false, true);
    }

    public final boolean A00(String str) {
        if (this.A01) {
            return true;
        }
        if (str == null) {
            return !this.A00;
        }
        boolean z = this.A00;
        Set set = this.A02;
        boolean z2 = !set.isEmpty();
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (!z2) {
            return true;
        }
        if (!set.contains(str)) {
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        this.A04.A03(getClass());
        this.A00 = false;
        this.A01 = false;
        this.A02.clear();
        this.A03.clear();
        14i.A07(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(329156507);
        this.A01 = true;
        AnonymousClass0fD.A0A(625602775, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1975075835, AnonymousClass0fD.A03(1523841925));
    }
}
