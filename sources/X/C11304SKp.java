package X;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.SKp  reason: case insensitive filesystem */
public abstract class C11304SKp {
    public static String A01(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            A1A.append("-");
            A1A.append(locale.getCountry().toLowerCase(locale));
        }
        return A1A.toString();
    }

    public static void A02(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Qon, java.lang.Object] */
    public static C8337Qon A00(C8485QvX qvX, String str) {
        AnonymousClass3Qk.A02(qvX);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map A00 = C11161SCv.A00(new URI(Pxh.A0m("?", str)));
            ? obj = new Object();
            obj.A05 = DbT.A11("utm_content", A00);
            obj.A03 = DbT.A11("utm_medium", A00);
            obj.A00 = DbT.A11("utm_campaign", A00);
            obj.A02 = DbT.A11("utm_source", A00);
            obj.A04 = DbT.A11("utm_term", A00);
            obj.A01 = DbT.A11("utm_id", A00);
            obj.A06 = DbT.A11("anid", A00);
            obj.A07 = DbT.A11("gclid", A00);
            obj.A08 = DbT.A11("dclid", A00);
            obj.A09 = DbT.A11("aclid", A00);
            return obj;
        } catch (URISyntaxException e) {
            qvX.A0G("No valid campaign data found", e);
            return null;
        }
    }
}
