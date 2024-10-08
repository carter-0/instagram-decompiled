package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* renamed from: X.UpJ  reason: case insensitive filesystem */
public final class C16132UpJ extends V4R {
    public static final boolean A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            return 1DL.A05(activity, "android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public final AnonymousClass4OB A01(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return super.A01(context);
        }
        if (AnonymousClass0oH.A01(context)) {
            return AnonymousClass4OB.GRANTED;
        }
        return AnonymousClass4OB.DENIED;
    }

    public final void A02(Activity activity, VVI vvi) {
        if (Build.VERSION.SDK_INT >= 33) {
            super.A02(activity, vvi);
            return;
        }
        C277014uI r2 = vvi.A01;
        C308276Tl r1 = new C308276Tl();
        r1.A01(C66579MXk.A00(366));
        C299275ur.A00(vvi.A00, r1.A00(), r2);
    }
}
