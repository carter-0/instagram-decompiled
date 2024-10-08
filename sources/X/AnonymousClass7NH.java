package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7NH  reason: invalid class name */
public final class AnonymousClass7NH {
    public final 0wc A00;
    public final Set A01 = new LinkedHashSet();
    public final C62320sa A02;

    public static final String A00(AnonymousClass5FV r1) {
        C69859NtN ntN = C69859NtN.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal == 5) {
            return "love_avatar_power_up";
        }
        if (ordinal == 6) {
            return "angry_avatar_power_up";
        }
        if (ordinal == 7) {
            return "laugh_avatar_power_up";
        }
        if (ordinal != 8) {
            return "unknown_avatar_power_up";
        }
        return "cry_avatar_power_up";
    }

    public /* synthetic */ AnonymousClass7NH(UserSession userSession, C62320sa r3) {
        0wc A022 = AnonymousClass0kN.A02(userSession);
        this.A02 = r3;
        this.A00 = A022;
    }
}
