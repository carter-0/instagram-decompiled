package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.Vuk  reason: case insensitive filesystem */
public abstract class C18593Vuk {
    public static String A00(Resources resources, X5v x5v, X5w x5w, Integer num, String str) {
        String str2;
        float f = resources.getDisplayMetrics().density;
        0qQ.A0B(str, 0);
        String A00 = C16777V5k.A00(str, "_", "-");
        String obj = x5w.toString();
        Locale locale = Locale.US;
        String upperCase = obj.toUpperCase(locale);
        0qQ.A0B(upperCase, 0);
        String A002 = C16777V5k.A00(upperCase, "_", "-");
        try {
            if (1 - num.intValue() != 0) {
                str2 = "instagram";
            } else {
                str2 = "meta_brand_design_system_icons_raster";
            }
            String format = String.format(locale, "%s?set=%s&name=%s&density=%.1f&variant=%s&size=%d", new Object[]{"https://lookaside.facebook.com/assets/key/", str2, A00, Float.valueOf(f), A002, Integer.valueOf(x5v.Bwk())});
            if (!TextUtils.isEmpty((CharSequence) null)) {
                return 002.A0R(format, (String) null);
            }
            return format;
        } catch (NullPointerException e) {
            0KC.A07(C18593Vuk.class, "caught float formatting bug with density == %s ", e, new Object[]{Float.valueOf(f).toString()});
            throw e;
        }
    }

    public int A01(int i) {
        for (C18593Vuk A01 : ((C14092Tpj) this).A00) {
            int A012 = A01.A01(i);
            if (A012 != 0) {
                return A012;
            }
        }
        return 0;
    }

    public X5u A02(Integer num, String str) {
        AnonymousClass7TG.A1N(num, str);
        for (C18593Vuk A02 : ((C14092Tpj) this).A00) {
            X5u A022 = A02.A02(num, str);
            if (A022 != null) {
                return A022;
            }
        }
        return null;
    }
}
