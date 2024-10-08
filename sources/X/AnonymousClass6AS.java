package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6AS  reason: invalid class name */
public final class AnonymousClass6AS {
    public final int getEligibilityOverrideFromSharedPreferences(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        AnonymousClass4kA A00 = AnonymousClass4k9.A00(userSession);
        return ((Number) A00.A0C.CDM(A00, AnonymousClass4kA.A0c[1])).intValue();
    }

    public final int A00(UserSession userSession) {
        AnonymousClass4kA A00 = AnonymousClass4k9.A00(userSession);
        int intValue = ((Number) A00.A0C.CDM(A00, AnonymousClass4kA.A0c[1])).intValue();
        if (intValue == -1) {
            return (int) ((Number) 2HM.A00(userSession).A1V.getValue()).longValue();
        }
        return intValue;
    }
}
