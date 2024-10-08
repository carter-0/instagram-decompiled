package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2;
import com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2;
import java.util.List;

public final class F3K {
    public final AnonymousClass4HW A00 = C335967dq.A00(C59822JZw.A00);
    public final UserSession A01;
    public final C49237Erg A02;

    public final Object A01(C51887G6c g6c, AnonymousClass4D7 r9) {
        User A012 = AnonymousClass0t1.A01.A01(this.A01);
        AnonymousClass4HW r0 = this.A00;
        QuietModeRepository$updateQuietMode$2 quietModeRepository$updateQuietMode$2 = new QuietModeRepository$updateQuietMode$2(A012, g6c, this, (AnonymousClass4D7) null, true);
        C60340gF r2 = C60340gF.A00;
        Object A002 = r0.A00(r2, r9, quietModeRepository$updateQuietMode$2);
        if (A002 != 1Hj.A02) {
            return r2;
        }
        return A002;
    }

    public final Object A00(G7S g7s, Long l, Long l2, List list, AnonymousClass4D7 r22, long j, long j2, boolean z, boolean z2) {
        User A012 = AnonymousClass0t1.A01.A01(this.A01);
        AnonymousClass4HW r0 = this.A00;
        QuietModeRepository$updateQuietModeWithWindows$2 quietModeRepository$updateQuietModeWithWindows$2 = new QuietModeRepository$updateQuietModeWithWindows$2(A012, g7s, this, l, l2, list, (AnonymousClass4D7) null, j, j2, z, z2);
        C60340gF r2 = C60340gF.A00;
        Object A002 = r0.A00(r2, r22, quietModeRepository$updateQuietModeWithWindows$2);
        if (A002 != 1Hj.A02) {
            return r2;
        }
        return A002;
    }

    public F3K(UserSession userSession, C49237Erg erg) {
        this.A01 = userSession;
        this.A02 = erg;
    }
}
