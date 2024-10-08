package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99c  reason: invalid class name and case insensitive filesystem */
public abstract class C3743499c {
    public static C3743599d A00(C3743399b r3, Integer num, Integer num2) {
        if (num2 == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (num != null) {
            return new C3743599d(r3, num2.intValue(), num.intValue());
        } else {
            throw new GeneralSecurityException("IV size is not set");
        }
    }
}
