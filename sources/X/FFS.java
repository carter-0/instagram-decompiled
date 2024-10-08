package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.common.dextricks.Constants;

public abstract class FFS {
    public static Intent A00(Context context, Integer num, String str) {
        Uri parse;
        Uri.Builder buildUpon;
        String str2;
        Intent flags = new Intent("android.intent.action.VIEW").setFlags(268435456);
        if (num.intValue() != 0) {
            buildUpon = DbW.A07("https://maps.google.com/maps");
            str2 = "daddr";
        } else {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (packageManager.queryIntentActivities(flags, Constants.LOAD_RESULT_PGO_ATTEMPTED).isEmpty()) {
                parse = 0cp.A03("https://maps.google.com/maps");
            } else {
                LruCache lruCache = 0cp.A00;
                parse = Uri.parse("geo:0,0");
            }
            buildUpon = parse.buildUpon();
            str2 = "q";
        }
        flags.setData(DbV.A08(buildUpon, str2, str));
        return flags;
    }

    public static void A03(Context context, String str, String str2, String str3) {
        String A0R;
        String str4 = "";
        if (str2 == null) {
            A0R = str4;
        } else {
            A0R = 002.A0R(", ", str2);
        }
        if (str3 != null) {
            str4 = 002.A0R(", ", str3);
        }
        0kR.A0D(context, A00(context, AnonymousClass05K.A00, 002.A0g(str, A0R, str4)));
    }

    public static void A01(Context context, double d, double d2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(d);
        A1A.append(", ");
        A1A.append(d2);
        A02(context, (DialogInterface.OnDismissListener) null, A00(context, AnonymousClass05K.A00, A1A.toString()));
    }

    public static void A02(Context context, DialogInterface.OnDismissListener onDismissListener, Intent intent) {
        C358248ab A0Y = DbS.A0Y(context);
        C50025FJk A00 = C50025FJk.A00(context, intent, 33);
        A0Y.A08(2131969036);
        A0Y.A0I(A00, 2131968921);
        A0Y.A0C(A00);
        A0Y.A0r(true);
        A0Y.A0f(onDismissListener);
        DbT.A1V(A0Y);
    }
}
