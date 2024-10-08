package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Rh6  reason: case insensitive filesystem */
public abstract class C9810Rh6 {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        FragmentActivity fragmentActivity;
        T7I t7i;
        char c;
        String str;
        String[] strArr;
        AnonymousClass6Tm r8 = r10;
        Object A0p = DbT.A0p(r10, 4);
        if (A0p instanceof String) {
            String str2 = (String) A0p;
            if (str2.equals("MEDIA_PICKER")) {
                Context context = C308206Td.A09(r9).A00;
                c = 0;
                if (1DL.A07(context, SL9.A00(context))) {
                    SL9.A02(context, r9, r10);
                    return null;
                }
                fragmentActivity = DbU.A0H(r9).getActivity();
                if (fragmentActivity != null) {
                    t7i = new T7I(2, fragmentActivity, context, r8, r9);
                    strArr = new String[1];
                    str = SL9.A00(context);
                }
            } else if (str2.equals("CAMERA")) {
                Context context2 = C308206Td.A09(r9).A00;
                c = 0;
                str = "android.permission.CAMERA";
                if (1DL.A07(context2, str)) {
                    SL9.A01(context2, r9, r10);
                } else {
                    fragmentActivity = DbU.A0H(r9).getActivity();
                    if (fragmentActivity != null) {
                        t7i = new T7I(1, fragmentActivity, context2, r8, r9);
                        strArr = new String[1];
                    }
                }
            }
            strArr[c] = str;
            1DL.A04(fragmentActivity, t7i, strArr);
            return null;
        }
        return null;
    }
}
