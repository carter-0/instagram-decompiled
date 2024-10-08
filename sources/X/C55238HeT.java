package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.HeT  reason: case insensitive filesystem */
public abstract class C55238HeT {
    /* JADX WARNING: type inference failed for: r0v37, types: [X.5sM, java.lang.Object] */
    public static void A00(Context context, Rect rect, Rect rect2, UserSession userSession, AnonymousClass4DU r13, AnonymousClass3OA r14, Float f, Float f2, Float f3, Float f4, Float f5, String str, String str2, float f6, float f7) {
        C254523sc A03 = C254513sb.A03(userSession, r14.A0K, r13, "gesture");
        String str3 = str;
        A03.A7M = str3;
        float A01 = 0nA.A01(context, (float) rect.left);
        float A012 = 0nA.A01(context, (float) rect.top);
        float A013 = 0nA.A01(context, (float) rect.right);
        float A014 = 0nA.A01(context, (float) rect.bottom);
        0jB A0k = C51965G9l.A0k();
        A0k.A04(C271774jZ.A6w, str2);
        A0k.A04(C271774jZ.A8o, Float.valueOf(A01));
        A0k.A04(C271774jZ.A8p, Float.valueOf(A012));
        A0k.A04(C271774jZ.A8l, Float.valueOf(A013));
        A0k.A04(C271774jZ.A8m, Float.valueOf(A014));
        A03.A0u = A0k;
        float A015 = 0nA.A01(context, (float) rect2.left);
        float A016 = 0nA.A01(context, (float) rect2.top);
        float A017 = 0nA.A01(context, (float) rect2.right);
        float A018 = 0nA.A01(context, (float) rect2.bottom);
        0jB A0k2 = C51965G9l.A0k();
        A0k2.A04(C271774jZ.A7N, Float.valueOf(A015));
        A0k2.A04(C271774jZ.A7O, Float.valueOf(A016));
        A0k2.A04(C271774jZ.A7L, Float.valueOf(A017));
        A0k2.A04(C271774jZ.A7M, Float.valueOf(A018));
        A03.A0r = A0k2;
        float f8 = f6;
        float f9 = f7;
        if (f == null || f2 == null || f3 == null || f4 == null || (!str3.equals("swipe_left") && !str3.equals("swipe_right"))) {
            A03.A2V = Double.valueOf((double) 0nA.A01(context, f8));
            A03.A2W = Double.valueOf((double) 0nA.A01(context, f9));
        } else {
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            float floatValue3 = f3.floatValue();
            float floatValue4 = f4.floatValue();
            ? obj = new Object();
            obj.A02 = f8;
            obj.A03 = f9;
            obj.A00 = floatValue;
            obj.A01 = floatValue2;
            obj.A04 = floatValue3;
            obj.A05 = floatValue4;
            A03.A12 = obj;
        }
        if (f5 != null) {
            A03.A01 = (double) f5.floatValue();
        }
        XWx.A00(AnonymousClass0kN.A01(r13, userSession), A03, r13);
    }
}
