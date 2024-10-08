package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.Oar  reason: case insensitive filesystem */
public final class C71072Oar {
    public static final C71072Oar A00 = new Object();

    public static final SharedPreferences A00(Context context, Integer num) {
        0qQ.A0B(context, 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass7TG.A0m(num, "app_widget_id_", AnonymousClass7TE.A1A()), 0);
        0qQ.A07(sharedPreferences);
        return sharedPreferences;
    }

    public final String A02(Context context, Integer num) {
        0qQ.A0B(context, 0);
        return A00(context, num).getString(AnonymousClass7TG.A0m(num, "com.instagram.direct.appwidget.USER_ID", AnonymousClass7TE.A1A()), (String) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0Js] */
    public static final void A01(0Jp r3, String str) {
        if (str != null) {
            09i.A0A.A0A(new Object(), (0Jv) null, r3, str);
        }
    }
}
