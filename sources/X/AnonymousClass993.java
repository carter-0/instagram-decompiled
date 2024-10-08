package X;

import java.security.GeneralSecurityException;

/* renamed from: X.993  reason: invalid class name */
public abstract class AnonymousClass993 {
    public static AnonymousClass994 A00(AnonymousClass992 r3, Integer num, Integer num2) {
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (num2 != null) {
            return new AnonymousClass994(r3, num.intValue(), num2.intValue());
        } else {
            throw new GeneralSecurityException("tag size not set");
        }
    }
}
