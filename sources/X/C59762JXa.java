package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JXa  reason: case insensitive filesystem */
public abstract class C59762JXa {
    public static final Integer A00(UserSession userSession) {
        if ((!AnonymousClass7TE.A0q(userSession).getBoolean("clips_has_acknowledged_v2_nux", false)) || JTR.A0w(userSession) != AnonymousClass05K.A01 || AnonymousClass7TE.A0q(userSession).getBoolean("clips_remix_camera_nux_content_viewed", false)) {
            return null;
        }
        return AnonymousClass05K.A0Y;
    }

    public static final Integer A01(UserSession userSession, boolean z) {
        Integer num;
        0qQ.A0B(userSession, 0);
        if (z || AnonymousClass7TE.A0q(userSession).getBoolean("clips_has_acknowledged_v2_nux", false) || JTS.A0e(userSession) != (num = AnonymousClass05K.A01) || AnonymousClass7TF.A0Q(userSession).A07() != 0) {
            return null;
        }
        if (JTS.A0e(userSession) != num || AnonymousClass7TE.A0q(userSession).getBoolean("clips_remix_camera_nux_content_viewed", false)) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }

    public static final void A02(UserSession userSession, Integer num) {
        0xY r1;
        String str;
        0qQ.A0B(userSession, 0);
        int A03 = C51967G9n.A03(num, 1);
        if (!(A03 == 2 || A03 == 1)) {
            if (A03 == 0) {
                0xY A0N = AnonymousClass7TF.A0N(userSession);
                A0N.E5T("clips_has_acknowledged_v2_nux", true);
                A0N.apply();
            } else if (A03 != 3) {
                if (A03 != 4) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            r1 = AnonymousClass7TF.A0N(userSession);
            str = "clips_remix_camera_nux_content_viewed";
            r1.E5T(str, true);
            r1.apply();
        }
        r1 = AnonymousClass7TF.A0N(userSession);
        str = "clips_has_acknowledged_v2_nux";
        r1.E5T(str, true);
        r1.apply();
    }
}
