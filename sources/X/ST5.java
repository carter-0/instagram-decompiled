package X;

import android.text.TextUtils;
import android.util.Log;

public abstract class ST5 {
    public final C11381SQt A00;

    public static final void A0B(ST5 st5, String str, int i) {
        A0A(st5, (Object) null, (Object) null, (Object) null, str, i);
    }

    public final void A0D(Object obj, Object obj2, String str) {
        A0A(this, obj, obj2, (Object) null, str, 5);
    }

    public final void A0E(String str, Object obj) {
        A0A(this, obj, (Object) null, (Object) null, str, 2);
    }

    public final void A0F(String str, Object obj) {
        A0A(this, obj, (Object) null, (Object) null, str, 3);
    }

    public final void A0G(String str, Object obj) {
        A0A(this, obj, (Object) null, (Object) null, str, 5);
    }

    public final void A0H(String str, Object obj) {
        A0A(this, obj, (Object) null, (Object) null, str, 6);
    }

    public static String A08(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj.toString();
        }
        if (obj == Boolean.TRUE) {
            return "true";
        }
        return "false";
    }

    public static String A09(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String A08 = A08(obj);
        String A082 = A08(obj2);
        String A083 = A08(obj3);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (!TextUtils.isEmpty(str)) {
            A1A.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A08)) {
            A1A.append(str2);
            A1A.append(A08);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(A082)) {
            A1A.append(str2);
            A1A.append(A082);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(A083)) {
            A1A.append(str3);
            A1A.append(A083);
        }
        return A1A.toString();
    }

    public static final void A0A(ST5 st5, Object obj, Object obj2, Object obj3, String str, int i) {
        C8485QvX qvX;
        C11381SQt sQt = st5.A00;
        if (sQt == null || (qvX = sQt.A0C) == null) {
            A0C(obj, obj2, obj3, str, i);
            return;
        }
        A0C(obj, obj2, obj3, str, i);
        if (i >= 5) {
            qvX.A0L(obj, obj2, obj3, str, i);
        }
    }

    public static void A0C(Object obj, Object obj2, Object obj3, String str, int i) {
        String str2 = (String) SDN.A0D.A00;
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, A09(str, obj, obj2, obj3));
        }
    }

    public ST5(C11381SQt sQt) {
        AnonymousClass3Qk.A02(sQt);
        this.A00 = sQt;
    }
}
