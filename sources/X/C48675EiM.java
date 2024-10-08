package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EiM  reason: case insensitive filesystem */
public abstract class C48675EiM {
    public static final EVH A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Number number;
        boolean z = false;
        Object A01 = r7.A01();
        EVH evh = null;
        if ((A01 instanceof Number) && (number = (Number) A01) != null) {
            int intValue = number.intValue();
            UserSession A0Z = DbT.A0Z(r6);
            if (intValue == 0) {
                evh = EVH.STORY_COMMENTS_AUDIENCE_CONTROL_EVERYONE;
            } else if (intValue == 1) {
                evh = EVH.STORY_COMMENTS_AUDIENCE_CONTROL_MUTUALS;
            } else if (intValue == 2) {
                evh = EVH.STORY_COMMENTS_AUDIENCE_CONTROL_DISABLED;
            }
            1Av A00 = 1Au.A00(A0Z);
            if (evh != null && evh == EVH.STORY_COMMENTS_AUDIENCE_CONTROL_DISABLED) {
                z = true;
            }
            0xY A0p = AnonymousClass7TE.A0p(A00);
            A0p.E5T("has_story_comments_global_setting_disabled", z);
            A0p.apply();
        }
        return evh;
    }
}
