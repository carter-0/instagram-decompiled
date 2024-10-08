package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.Wh3  reason: case insensitive filesystem */
public final class C19875Wh3 implements Comparable {
    public final int A00;
    public final String A01;
    public final BigDecimal A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C19875Wh3 wh3 = (C19875Wh3) obj;
            if (!this.A01.equals(wh3.A01) || !this.A02.equals(wh3.A02) || this.A00 != wh3.A00) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A01 */
    public final int compareTo(C19875Wh3 wh3) {
        17k.A0E(this.A01.equals(wh3.A01));
        17k.A0E(AnonymousClass7TF.A1S(this.A00, wh3.A00));
        return this.A02.compareTo(wh3.A02);
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, this.A02);
    }

    public final String toString() {
        BigDecimal bigDecimal = this.A02;
        int i = this.A00;
        String str = this.A01;
        0qQ.A0B(bigDecimal, 0);
        Currency instance = Currency.getInstance(str);
        0qQ.A07(instance);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(AnonymousClass1Q2.A02());
        currencyInstance.setCurrency(instance);
        double d = (double) i;
        double longValue = ((double) bigDecimal.longValue()) / d;
        int log10 = (int) Math.log10(d);
        currencyInstance.setMinimumFractionDigits(log10);
        currencyInstance.setMaximumFractionDigits(log10);
        currencyInstance.setRoundingMode(RoundingMode.HALF_UP);
        String format = currencyInstance.format(longValue);
        0qQ.A07(format);
        return format;
    }

    public C19875Wh3(String str, BigDecimal bigDecimal, int i) {
        this.A01 = str;
        this.A02 = bigDecimal;
        this.A00 = i;
    }

    public static C19875Wh3 A00(CurrencyAmountInfo currencyAmountInfo) {
        return new C19875Wh3(currencyAmountInfo.getCurrency(), new BigDecimal(currencyAmountInfo.getAmountWithOffset()), currencyAmountInfo.BXp().intValue());
    }
}
