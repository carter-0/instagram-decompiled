package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Cc  reason: invalid class name and case insensitive filesystem */
public final class C327767Cc {
    public final AvatarPrivacySettingsRepository A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final C331877Su A03;
    public final AvatarReactionsRepository A04;

    public final boolean A00(List list, int i, boolean z) {
        C61081JwJ jwJ;
        0qQ.A0B(list, 1);
        if (0sr.A1P(new Integer[]{1003, 47}).contains(Integer.valueOf(i)) && !z && 0qQ.A0K(this.A01.A01.A00, C299715vi.A00)) {
            UserSession userSession = this.A03.A00;
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36322624321628458L) && ((i != 47 || 182.A06(r4, userSession, 36322624321890605L)) && (!((Collection) this.A04.A0C.getValue()).isEmpty()) && (jwJ = this.A00.A00) != null)) {
                int ordinal = ((C48126EWs) jwJ.A00).ordinal();
                if (ordinal == 1) {
                    return true;
                }
                if (ordinal == 3) {
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return true;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((User) it.next()).A29()) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ C327767Cc(UserSession userSession) {
        C331877Su r4 = new C331877Su(userSession);
        AvatarReactionsRepository A002 = C331867Sr.A00(userSession);
        AvatarPrivacySettingsRepository A003 = AnonymousClass7T8.A00(userSession);
        AvatarStore A004 = 25x.A00(userSession);
        0qQ.A0B(A002, 3);
        0qQ.A0B(A003, 4);
        0qQ.A0B(A004, 5);
        this.A02 = userSession;
        this.A03 = r4;
        this.A04 = A002;
        this.A00 = A003;
        this.A01 = A004;
    }
}
