package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.V8w  reason: case insensitive filesystem */
public abstract class C16867V8w {
    public static final String A00(AnonymousClass6Tm r6) {
        String A0g = DbY.A0g(r6);
        Object A02 = r6.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.Number");
        double A00 = JTO.A00(A02);
        int A04 = DbW.A04(r6.A00(), "null cannot be cast to non-null type kotlin.Number");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance(A0g));
        currencyInstance.setMinimumFractionDigits(A04);
        return currencyInstance.format(A00);
    }
}
