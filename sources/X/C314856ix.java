package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6ix  reason: invalid class name and case insensitive filesystem */
public final class C314856ix {
    public final UserSession A00;

    public C314856ix(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Integer num, Integer num2, String str, String str2, boolean z) {
        String str3;
        String str4;
        0wc A02 = AnonymousClass0kN.A02(this.A00);
        0Aj A002 = A02.A00(A02.A00, "avatar_upsell_action");
        if (A002.isSampled()) {
            0eP r7 = new 0eP("surface", str);
            0eP r6 = new 0eP(AnonymousClass000.A00(92), str2);
            if (num.intValue() != 0) {
                str3 = "auto_migration";
            } else {
                str3 = "manual_migration";
            }
            0eP r4 = new 0eP("stage", str3);
            0eP r3 = new 0eP("has_avatar", String.valueOf(z));
            if (num2.intValue() != 0) {
                str4 = "dismiss";
            } else {
                str4 = "open_editor";
            }
            A002.A9H("extra_client_data", 0Yt.A06(new 0eP[]{r7, r6, r4, r3, new 0eP("action_type", str4)}));
            A002.Cgf();
        }
    }

    public final void A01(Integer num, String str, String str2, boolean z) {
        String str3;
        0wc A02 = AnonymousClass0kN.A02(this.A00);
        0Aj A002 = A02.A00(A02.A00, "avatar_upsell_impression");
        if (A002.isSampled()) {
            0eP r6 = new 0eP("surface", str);
            0eP r4 = new 0eP(AnonymousClass000.A00(92), str2);
            if (num.intValue() != 0) {
                str3 = "auto_migration";
            } else {
                str3 = "manual_migration";
            }
            A002.A9H("extra_client_data", 0Yt.A06(new 0eP[]{r6, r4, new 0eP("stage", str3), new 0eP("has_avatar", String.valueOf(z))}));
            A002.Cgf();
        }
    }
}
