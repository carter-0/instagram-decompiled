package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.NrB  reason: case insensitive filesystem */
public abstract class C69727NrB {
    public static final void A00(2LV r4, Object obj) {
        Class BTf = r4.BTf();
        0qQ.A07(BTf);
        Class<?> cls = obj.getClass();
        if (!BTf.isAssignableFrom(cls)) {
            String format = String.format(Locale.US, "Expected McfRef object of type '%s' but actual was '%s'", Arrays.copyOf(new Object[]{BTf, cls}, 2));
            0qQ.A07(format);
            throw AnonymousClass7TE.A0z(format);
        }
    }
}
