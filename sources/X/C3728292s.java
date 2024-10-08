package X;

import com.instagram.common.session.UserSession;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.92s  reason: invalid class name and case insensitive filesystem */
public final class C3728292s implements 0lm {
    public final UserSession A00;
    public final C3728392t A01 = new C3728392t(this);
    public final Comparator A02 = C3728492u.A00;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C377209Ky(this, 14));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C377209Ky(this, 15));

    public final synchronized List A00() {
        List list;
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            list = ((C363368jb) this.A04.getValue()).A04;
        } else {
            list = 0sn.A00;
        }
        return list;
    }

    public final void onUserSessionWillEnd(boolean z) {
        ((C363368jb) this.A04.getValue()).A01();
    }

    public C3728292s(UserSession userSession) {
        this.A00 = userSession;
    }
}
