package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.FEf  reason: case insensitive filesystem */
public final class C49907FEf {
    public static final C49907FEf A00 = new Object();

    public static final void A00(Context context, String str, String str2) {
        0qQ.A0B(context, 0);
        if (A00.A01(context)) {
            if (str != null) {
                Uri A09 = DbT.A09(str);
                String str3 = "com.facebook.wakizashi";
                if (context.getPackageManager().getLaunchIntentForPackage(str3) == null) {
                    str3 = "com.facebook.katana";
                }
                Intent intent = new Intent("android.intent.action.VIEW").setData(A09).setPackage(str3);
                0qQ.A07(intent);
                0kR.A0A(context, intent);
            }
        } else if (str2 != null) {
            try {
                0kR.A0F(context, DbT.A09(str2));
            } catch (NullPointerException | SecurityException unused) {
            }
        }
    }

    public final boolean A01(Context context) {
        0qQ.A0B(context, 0);
        if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.wakizashi") == null && context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null) {
            return false;
        }
        return true;
    }
}
