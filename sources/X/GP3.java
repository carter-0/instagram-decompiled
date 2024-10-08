package X;

import com.instagram.common.session.UserSession;

public abstract class GP3 {
    public static final GP4 A00(UserSession userSession, Integer num) {
        Integer num2;
        int i;
        boolean z;
        long A06;
        0xa A0o;
        String str;
        C247353gC A00 = C247333gA.A00(userSession);
        if (num.intValue() != 1) {
            num2 = AnonymousClass05K.A0C;
            AnonymousClass0eM r2 = A00.A07;
            i = 0;
            z = C51968G9o.A0o(r2).getBoolean("content_note_has_tapped_to_reply", false);
            A06 = DbW.A06(C51968G9o.A0o(r2), "content_note_tap_to_reply_nux_last_shown_timestamp");
            A0o = C51968G9o.A0o(r2);
            str = "content_note_tap_to_reply_nux_shown_count";
        } else {
            num2 = AnonymousClass05K.A01;
            AnonymousClass0eM r22 = A00.A07;
            i = 0;
            z = C51968G9o.A0o(r22).getBoolean("content_note_has_double_tapped_to_like", false);
            A06 = DbW.A06(C51968G9o.A0o(r22), "content_note_double_tap_to_like_nux_last_shown_timestamp");
            A0o = C51968G9o.A0o(r22);
            str = "content_note_double_tap_to_like_nux_shown_count";
        }
        return new GP4(num2, A0o.getInt(str, i), A06, z);
    }
}
