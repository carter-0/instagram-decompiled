package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99g  reason: invalid class name and case insensitive filesystem */
public abstract class C3743899g {
    public static AnonymousClass99S A00(C3743699e r1, C3743799f r2, Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            throw new GeneralSecurityException("AES key size is not set");
        } else if (num2 == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        } else if (num3 == null) {
            throw new GeneralSecurityException("iv size is not set");
        } else if (num4 != null) {
            int intValue = num4.intValue();
            if (r1 == C3743699e.A01) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                }
            } else if (r1 == C3743699e.A02) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                }
            } else if (r1 == C3743699e.A03) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                }
            } else if (r1 == C3743699e.A04) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                }
            } else if (r1 != C3743699e.A05) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            } else if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
            }
            return new AnonymousClass99S(r1, r2, num.intValue(), num2.intValue(), num3.intValue(), intValue);
        } else {
            throw new GeneralSecurityException("tag size is not set");
        }
    }
}
