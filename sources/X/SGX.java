package X;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public final class SGX {
    public static final SGX A00 = new Object();
    public static final ImmutableSet A01;

    public final String A00(String str, BigDecimal bigDecimal) {
        int length = str.length();
        if (AnonymousClass7TF.A1S(length, 3)) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Pxh.A0w());
            currencyInstance.setCurrency(Currency.getInstance(str));
            char minusSign = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getMinusSign();
            String format = currencyInstance.format(bigDecimal);
            0qQ.A07(format);
            String A12 = DbV.A12(format);
            if (!00p.A0k(A12, "(", false) || !00p.A0i(A12, ")", false)) {
                return A12;
            }
            return 002.A0D(00p.A0g(00p.A0g(A12, "(", "", false), ")", "", false), minusSign);
        }
        throw AnonymousClass7TE.A0w(Strings.A00("Invalid currency length: %d for currencyCode: %s", Integer.valueOf(length), str));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SGX, java.lang.Object] */
    static {
        ImmutableSet A002 = ImmutableSet.A00(new Locale("ar", "AR"), new Locale("he", "IL"));
        0qQ.A07(A002);
        A01 = A002;
    }
}
