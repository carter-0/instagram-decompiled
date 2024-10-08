package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6oK  reason: invalid class name and case insensitive filesystem */
public final class C318066oK {
    public final UserSession A00;

    public C318066oK(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(C61082JwK jwK, C317846nw r9, C317866ny r10, Integer num, Integer num2, Integer num3, String str, String str2, AnonymousClass4D7 r16) {
        boolean z;
        String A0D;
        String A0R;
        UserSession userSession = this.A00;
        0qQ.A0B(r10, 1);
        0qQ.A0B(r9, 2);
        C317856nx r2 = C317846nw.A01;
        if (jwK != null) {
            z = jwK.A01;
        } else {
            z = false;
        }
        String A002 = r2.A00(r9, r10, userSession, z);
        1NY r22 = new 1NY(userSession, -2);
        r22.A08(AnonymousClass05K.A0N);
        r22.A07 = num;
        0qQ.A0B(A002, 2);
        if (num == AnonymousClass05K.A00) {
            A0R = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("creatives/sticker_pack//");
            sb.append(userSession.A06);
            sb.append('/');
            if (num3 == null) {
                sb.append(A002);
            } else {
                sb.append(A002);
                sb.append('/');
                sb.append(num3);
            }
            String obj = sb.toString();
            if (str2 == null) {
                A0D = "";
            } else {
                A0D = 002.A0D(str2, '/');
            }
            A0R = 002.A0R(obj, A0D);
        }
        r22.A0A = A0R;
        r22.A0A("creatives/sticker_pack/");
        r22.A9m("sticker_pack_id", A002);
        r22.A9m("surface", r10.A00);
        r22.A0O((15p) null, C61294K1h.class, C64033LJx.class, false);
        if (num3 != null) {
            r22.A0C("page_size", num3.intValue());
        }
        if (num2 != null) {
            r22.A0C("item_cursor", num2.intValue());
        }
        if (jwK != null && jwK.A01) {
            r22.A9m("user_ids", jwK.A00.toString());
        }
        if (str != null) {
            r22.A9m("avatar_owner_id", str);
        }
        return r22.A0M().A02(r16, -5, 3, false);
    }
}
