package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.6Sv  reason: invalid class name and case insensitive filesystem */
public final class C308126Sv extends ThreadLocal {
    public final /* synthetic */ String A00;

    public C308126Sv(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
