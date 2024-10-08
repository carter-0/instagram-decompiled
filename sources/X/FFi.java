package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;

public abstract class FFi {
    public static final String A00 = 0mp.A06("https://mtouch.%s", new Object[]{PreferenceManager.getDefaultSharedPreferences(C60960kU.A00).getString("com.instagram.common.api.facebook.FacebookURLBuilder.KEY_FACEBOOK_ENDPOINT", IGPixelRequestBuffer.URL_PREFIX)});

    public static void A01(Context context, AnonymousClass0iw r10, UserSession userSession, String str, String str2, String str3) {
        A02(context, r10, userSession, str, str2, str3, (String) null, (String) null, false);
    }

    public static void A02(Context context, AnonymousClass0iw r12, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        AnonymousClass0vF r0 = C71332ca.A01;
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        do {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(C71332ca.A02.nextInt(62)));
            i++;
        } while (i < 16);
        String obj = sb.toString();
        Context context2 = context;
        String A002 = A00(context.getPackageManager());
        String str7 = "msite";
        AnonymousClass0iw r6 = r12;
        UserSession userSession2 = userSession;
        String str8 = str;
        if (A002 != null) {
            boolean equals = A002.equals("com.facebook.lite");
            if (equals) {
                str3 = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(A002);
            if (launchIntentForPackage != null) {
                if (!TextUtils.isEmpty(str3)) {
                    Intent A09 = DbX.A09(str3);
                    if (!packageManager.queryIntentActivities(A09, 65600).isEmpty()) {
                        launchIntentForPackage = A09;
                    }
                }
                launchIntentForPackage.putExtra("funlid", obj).putExtra("source_surface", str).putExtra("dest_intended_surface", "fb_homepage").putExtra("android.intent.extra.REFERRER", "android-app://com.instagram.android");
                0kR.A09(context, launchIntentForPackage);
            } else {
                0wb.A03("FamilyBridgesUtil", "Falling back to msite in openFacebookApp().");
                if (!TextUtils.isEmpty(str2)) {
                    if (str2 == null || str2.isEmpty()) {
                        str2 = A00;
                    }
                    0kR.A0D(context, new Intent("android.intent.action.VIEW", DbV.A08(DbW.A07(str2), "funlid", obj)));
                }
            }
            str7 = equals ? "android_fblite" : "android_fb4a";
        } else {
            if (str2 == null || str2.isEmpty()) {
                if (0oI.A0F(context)) {
                    0oI.A07(context, "com.facebook.katana", str);
                    str7 = "app_store";
                } else {
                    z = true;
                    str2 = A00;
                }
            }
            Uri A08 = DbV.A08(DbW.A07(str2), "funlid", obj);
            if (z) {
                SUL sul = new SUL(context, userSession, 2EG.A1l, A08.toString());
                if (r12 != null) {
                    str6 = r12.getModuleName();
                } else {
                    str6 = null;
                }
                sul.A0S = str6;
                sul.A0A();
            } else {
                0kR.A0D(context, new Intent("android.intent.action.VIEW", A08));
            }
        }
        C71332ca.A01.ATE(new EIM(context2, r6, userSession2, str8, str7, obj, str4, str5));
    }

    public static String A00(PackageManager packageManager) {
        for (1G4 r1 : AnonymousClass1G3.A02()) {
            String str = r1.A01;
            if (("com.facebook.katana".equals(str) || "com.facebook.wakizashi".equals(str) || "com.facebook.lite".equals(str)) && 0oI.A0I(packageManager, str)) {
                return str;
            }
        }
        return null;
    }
}
