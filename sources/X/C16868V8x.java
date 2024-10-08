package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.V8x  reason: case insensitive filesystem */
public abstract class C16868V8x {
    public static final String A00(AnonymousClass6Tm r8) {
        String format;
        Object A03 = r8.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        Object A032 = r8.A03(1);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance((String) A03));
        String A00 = new 11S("\\D").A00((String) A032, "");
        if (A00.length() <= 0) {
            A00 = "0";
        }
        double parseDouble = Double.parseDouble(A00) / Math.pow(10.0d, (double) currencyInstance.getCurrency().getDefaultFractionDigits());
        if (parseDouble > 0.0d) {
            format = currencyInstance.format(parseDouble);
        } else {
            format = currencyInstance.format(0.0d);
        }
        if (parseDouble > 2.147483646E9d) {
            return C51967G9n.A0q(format, 0, format.length() - 1);
        }
        return format;
    }
}
