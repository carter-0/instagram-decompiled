package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DeP  reason: case insensitive filesystem */
public final class C46402DeP {
    public final UserSession A00;

    public C46402DeP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str) {
        0xY A0N;
        String str2;
        0qQ.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1574224499) {
            if (hashCode != -773734548) {
                if (hashCode == 1949671265 && str.equals("IG_LOGOUT_UPSELL")) {
                    A0N = AnonymousClass7TF.A0N(this.A00);
                    str2 = "fx_cal_has_migrated_client_impression_to_server_logout_upsell";
                } else {
                    return;
                }
            } else if (str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                A0N = AnonymousClass7TF.A0N(this.A00);
                str2 = "fx_cal_has_migrated_client_impression_to_server_profile_photo_change_chaining_upsell";
            } else {
                return;
            }
        } else if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            A0N = AnonymousClass7TF.A0N(this.A00);
            str2 = "fx_cal_has_migrated_client_impression_to_server_feed_crossposting_upsell";
        } else {
            return;
        }
        DbW.A1L(A0N, str2);
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        2IS A04 = C41845B3m.A04();
        A04.A04("upsell_name", str);
        C239113Fa r3 = new C239113Fa(A04, C47087DqO.class, "FxIgLogImpressionsForACUpsell", true);
        C363088j4.A00(this.A00).ATL(FS0.A00, FSW.A00, r3);
    }

    public final boolean A02(String str) {
        0xa A0q;
        String str2;
        0qQ.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1574224499) {
            if (hashCode != -773734548) {
                if (hashCode != 1949671265 || !str.equals("IG_LOGOUT_UPSELL")) {
                    return false;
                }
                A0q = AnonymousClass7TE.A0q(this.A00);
                str2 = "fx_cal_has_migrated_client_impression_to_server_logout_upsell";
            } else if (!str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                return false;
            } else {
                A0q = AnonymousClass7TE.A0q(this.A00);
                str2 = "fx_cal_has_migrated_client_impression_to_server_profile_photo_change_chaining_upsell";
            }
        } else if (!str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            return false;
        } else {
            A0q = AnonymousClass7TE.A0q(this.A00);
            str2 = "fx_cal_has_migrated_client_impression_to_server_feed_crossposting_upsell";
        }
        return A0q.getBoolean(str2, false);
    }
}
