package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C331227Qb {
    public static final void A00(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        1Au.A00(userSession).A13("ai_agent_assistant_disclaimer_accepted", z);
    }

    public static final void A01(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        1Au.A00(userSession).A13("ai_agent_character_disclaimer_accepted", z);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        0qQ.A0B("ai_agent_assistant_disclaimer_accepted", 0);
        return A00.A01.getBoolean("ai_agent_assistant_disclaimer_accepted", false);
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        0qQ.A0B("ai_agent_character_disclaimer_accepted", 0);
        return A00.A01.getBoolean("ai_agent_character_disclaimer_accepted", false);
    }
}
