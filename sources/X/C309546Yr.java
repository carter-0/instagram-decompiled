package X;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.6Yr  reason: invalid class name and case insensitive filesystem */
public final class C309546Yr {
    public Dialog A00 = null;
    public Boolean A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final boolean A04;

    public static void A00(Activity activity, Uri uri, AnonymousClass0iw r14, UserSession userSession, X8P x8p, C309546Yr r17, VZP vzp, C232682uF r19, String str, String str2, String str3, String str4, String str5, String str6) {
        long j;
        Long A0n;
        C309546Yr r9 = r17;
        Dialog dialog = r9.A00;
        if (dialog == null || !dialog.isShowing()) {
            Activity activity2 = activity;
            C358248ab r3 = new C358248ab(activity);
            r3.A05 = str;
            r3.A0s(false);
            r3.A0q(str2);
            String str7 = str5;
            Uri uri2 = uri;
            AnonymousClass0iw r7 = r14;
            UserSession userSession2 = userSession;
            VZP vzp2 = vzp;
            C232682uF r11 = r19;
            if (uri != null) {
                String str8 = str3;
                if (!TextUtils.isEmpty(str8)) {
                    r3.A0Y(new W53(activity2, uri2, r7, userSession2, r9, vzp2, r11, str7), C358278ae.BLUE_BOLD, str8, false);
                }
            }
            X8P x8p2 = x8p;
            String str9 = str4;
            if (str4 != null) {
                r3.A0W(new W54(r14, userSession, x8p, r17, vzp, r19, str6, str7), C358278ae.BLUE_BOLD, str9, true);
            }
            r3.A0C(new C18830W4s(x8p2, r9));
            r3.A0B(new W4W(x8p2, r9));
            r3.A0f(new W5a(r14, userSession, x8p, r17, vzp, r19, str7));
            Dialog A022 = r3.A02();
            r9.A00 = A022;
            AnonymousClass0fN.A00(A022);
            r9.A02 = true;
            r9.A03 = false;
            x8p2.DkP();
            if (vzp != null) {
                0wc r2 = vzp2.A01;
                0Aj A002 = r2.A00(r2.A00, "instagram_content_advisory_shown");
                A002.AAJ("category_id", vzp2.A03);
                Hashtag hashtag = vzp2.A02;
                String id = hashtag.getId();
                if (id == null || (A0n = 00y.A0n(10, id)) == null) {
                    j = 0;
                } else {
                    j = A0n.longValue();
                }
                A002.A9F("hashtag_id", Long.valueOf(j));
                String name = hashtag.getName();
                if (name == null) {
                    name = "";
                }
                A002.AAJ("hashtag_name", name);
                A002.AAJ("hashtag_follow_status", C281965Ag.A02(hashtag));
                A002.AAJ("hashtag_feed_type", vzp2.A04);
                A002.A9F("tab_index", Long.valueOf(vzp2.A00));
                A002.Cgf();
                return;
            }
            0xF A003 = r11.E4k().A00();
            0xI A004 = 0xI.A00(r14, "instagram_content_advisory_shown");
            A004.A0C("category_id", str7);
            A004.A04(A003);
            if (userSession != null) {
                C60510iO.A00(userSession).EFq(A004);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static void A01(AnonymousClass0iw r3, UserSession userSession, C309546Yr r5, VZP vzp, C232682uF r7, String str, String str2) {
        long j;
        Long A0n;
        if (!r5.A04) {
            return;
        }
        if (vzp != null) {
            0wc r2 = vzp.A01;
            0Aj A002 = r2.A00(r2.A00, "instagram_content_advisory_action");
            A002.AAJ("category_id", vzp.A03);
            A002.AAJ("action", str2);
            Hashtag hashtag = vzp.A02;
            String id = hashtag.getId();
            if (id == null || (A0n = 00y.A0n(10, id)) == null) {
                j = 0;
            } else {
                j = A0n.longValue();
            }
            A002.A9F("hashtag_id", Long.valueOf(j));
            String name = hashtag.getName();
            if (name == null) {
                name = "";
            }
            A002.AAJ("hashtag_name", name);
            A002.AAJ("hashtag_follow_status", C281965Ag.A02(hashtag));
            A002.AAJ("hashtag_feed_type", vzp.A04);
            A002.A9F("tab_index", Long.valueOf(vzp.A00));
            A002.Cgf();
            return;
        }
        0xF A003 = r7.E4k().A00();
        0xI A004 = 0xI.A00(r3, "instagram_content_advisory_action");
        A004.A0C("action", str2);
        A004.A0C("category_id", str);
        A004.A04(A003);
        if (userSession != null) {
            C60510iO.A00(userSession).EFq(A004);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C309546Yr(boolean z) {
        this.A04 = z;
    }
}
