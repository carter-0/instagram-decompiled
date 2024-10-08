package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Locale;

/* renamed from: X.De2  reason: case insensitive filesystem */
public final class C46383De2 {
    public final UserSession A00;
    public final AnonymousClass4D6 A01;

    public C46383De2(UserSession userSession, AnonymousClass4D6 r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public static final String A00(C46383De2 de2) {
        UserSession userSession = de2.A00;
        String str = "";
        for (String str2 : AnonymousClass0BO.A00(userSession).BNy((String) null)) {
            if (!0qQ.A0K(str2, userSession.A06)) {
                if (str.length() > 0) {
                    str = 002.A0C(str, ',');
                }
                str = 002.A0R(str, str2);
            }
        }
        return str;
    }

    public final void A01(1P0 r4, Integer num) {
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("business/account/set_onboarding_checklist_manual_status/");
        String A002 = C48742EjR.A00(num);
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        DbX.A1M(A0a, "checklist_item_key", DbT.A12(locale, A002));
        1OC A0M = A0a.A0M();
        if (r4 != null) {
            A0M.A00 = r4;
        }
        this.A01.schedule(A0M);
    }

    public final void A02(1P0 r5, String str) {
        AnonymousClass4D6 r3 = this.A01;
        1NY A0b = AnonymousClass7TG.A0b(this.A00);
        A0b.A0A("business/account/get_onboarding_checklist/");
        A0b.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0b.A9m("logged_in_user_ids", A00(this));
        A0b.A0Q(De9.class, De8.class);
        DbW.A1E(A0b, r5, r3);
    }
}
