package X;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: X.7wu  reason: invalid class name and case insensitive filesystem */
public abstract class C347497wu {
    public static 2Yd A00(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return 2Yd.A00(C363508jq.A00(context));
        }
        Object A01 = A01(context);
        if (A01 == null) {
            return 2Yd.A01;
        }
        LocaleList A00 = C347507wv.A00(A01);
        2Yd r0 = 2Yd.A01;
        return new 2Yd(new 2Ye(A00));
    }

    public static Object A01(Context context) {
        return context.getSystemService("locale");
    }
}
