package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

public abstract class FEC {
    public static final String A00 = 002.A0R(C10065Rm2.A01, "profile/");

    public static void A00(Context context, AnonymousClass0iw r10, UserSession userSession, Long l, String str) {
        String formatStrLocaleSafe;
        String A0R;
        if (l != null) {
            if (!TextUtils.isEmpty((CharSequence) null)) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info&ref=%s", l, (Object) null);
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info", l);
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(A00);
            A1A.append(l);
            if (TextUtils.isEmpty((CharSequence) null)) {
                A0R = "";
            } else {
                A0R = 002.A0R("?ref=", (String) null);
            }
            FFi.A02(context, r10, userSession, str, formatStrLocaleSafe, AnonymousClass7TF.A0l(A0R, A1A), (String) null, (String) null, true);
        }
    }

    public static void A01(Context context, AnonymousClass0iw r8, UserSession userSession, String str, String str2) {
        String A0R;
        String A0R2;
        String replace = str.replace("https://www.facebook.com/profile.php?id=", A00);
        if (TextUtils.isEmpty(str2)) {
            A0R = "";
        } else {
            A0R = 002.A0R("?ref=", str2);
        }
        String A0R3 = 002.A0R(replace, A0R);
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession, 36320120357003300L)) {
            Uri.Builder A07 = DbW.A07(A0R3);
            A07.appendQueryParameter("scroll_to_posts", "true");
            A0R3 = A07.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            A0R2 = "";
        } else {
            A0R2 = 002.A0R("&ref=", str2);
        }
        FFi.A01(context, r8, userSession2, "ig_direct", 002.A0R(str, A0R2), A0R3);
    }
}
