package X;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7kR  reason: invalid class name and case insensitive filesystem */
public abstract class C339947kR {
    public static final List A01() {
        return 03t.A0J(new AnonymousClass886[]{AnonymousClass886.A0H, AnonymousClass886.A0B, AnonymousClass886.A09, AnonymousClass886.A0M, AnonymousClass886.A0L});
    }

    public static final String A00(float f) {
        NumberFormat instance = NumberFormat.getInstance(Locale.getDefault());
        0qQ.A07(instance);
        instance.setMaximumFractionDigits(1);
        instance.setMinimumFractionDigits(1);
        String format = instance.format(Float.valueOf(f));
        0qQ.A07(format);
        return format;
    }
}
