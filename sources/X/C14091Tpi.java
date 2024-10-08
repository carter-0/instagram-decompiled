package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Tpi  reason: case insensitive filesystem */
public abstract class C14091Tpi {
    public static final C18593Vuk A00 = new C14092Tpj(Arrays.asList(new C18593Vuk[]{new Object(), new Object()}));

    public static Drawable A00(Context context, X5u x5u, X5v x5v, X5w x5w) {
        C18593Vuk vuk = A00;
        Integer Bsv = x5u.Bsv();
        int A01 = vuk.A01((x5u.ordinal() << 8) | (Bsv.intValue() << 24) | (x5w.ordinal() << 5) | x5v.ordinal());
        if (A01 != 0) {
            return context.getDrawable(A01);
        }
        String A002 = C18593Vuk.A00(context.getResources(), x5v, x5w, Bsv, x5u.toString());
        int Bwk = x5v.Bwk();
        return AnonymousClass2dd.A00.A06(context.getResources(), A002, Bwk, Bwk, 160);
    }

    public static Drawable A01(Context context, X5v x5v, X5w x5w, String str) {
        X5u A02 = A00.A02(AnonymousClass05K.A0C, str);
        if (A02 != null) {
            return A00(context, A02, x5v, x5w);
        }
        String A002 = C18593Vuk.A00(context.getResources(), x5v, x5w, x5w.Bsv(), str);
        int Bwk = x5v.Bwk();
        return AnonymousClass2dd.A00.A06(context.getResources(), A002, Bwk, Bwk, 160);
    }

    public static XDU A03(String str) {
        return (XDU) A00.A02(AnonymousClass05K.A0C, str.replace("-", "_").toUpperCase(Locale.ROOT));
    }

    public static Integer A04(X5u x5u, X5v x5v, X5w x5w) {
        int A01;
        C18593Vuk vuk = A00;
        if (x5u == null) {
            A01 = 0;
        } else {
            A01 = vuk.A01((x5u.ordinal() << 8) | (x5u.Bsv().intValue() << 24) | (x5w.ordinal() << 5) | x5v.ordinal());
        }
        return Integer.valueOf(A01);
    }

    public static Integer A05(String str) {
        String str2;
        String str3;
        String str4;
        String[] split = str.split("_");
        int length = split.length;
        if (length == 3) {
            str4 = split[0];
            str2 = split[1];
            str3 = split[2];
        } else if (length == 4) {
            str4 = split[0].concat("_").concat(split[1]);
            str2 = split[2];
            str3 = split[3];
        } else if (length != 5) {
            return null;
        } else {
            str4 = split[0].concat("_").concat(split[1]).concat("_").concat(split[2]);
            str2 = split[3];
            str3 = split[4];
        }
        String replace = str4.replace("-", "_");
        Locale locale = Locale.ROOT;
        return A04(XDU.valueOf(replace.toUpperCase(locale)), GOg.valueOf(002.A0R("SIZE_", str3)), C52337GOf.valueOf(str2.toUpperCase(locale)));
    }

    public static Drawable A02(Context context, String str) {
        int intValue;
        Integer A05 = A05(str);
        if (A05 == null || (intValue = A05.intValue()) == 0) {
            return null;
        }
        return context.getDrawable(intValue);
    }
}
