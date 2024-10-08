package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.991  reason: invalid class name */
public abstract class AnonymousClass991 {
    public static C3742798v A00(C3742598t r3, C3742298q r4, Integer num, Integer num2) {
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (num2 == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (r3 == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (r4 != null) {
            int intValue = num.intValue();
            if (intValue >= 16) {
                int intValue2 = num2.intValue();
                if (intValue2 >= 10) {
                    if (r3 == C3742598t.A01) {
                        if (intValue2 > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue2)}));
                        }
                    } else if (r3 == C3742598t.A02) {
                        if (intValue2 > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue2)}));
                        }
                    } else if (r3 == C3742598t.A03) {
                        if (intValue2 > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue2)}));
                        }
                    } else if (r3 == C3742598t.A04) {
                        if (intValue2 > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue2)}));
                        }
                    } else if (r3 != C3742598t.A05) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    } else if (intValue2 > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue2)}));
                    }
                    return new C3742798v(r3, r4, intValue, intValue2);
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue2)}));
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{num}));
        } else {
            throw new GeneralSecurityException("variant is not set");
        }
    }
}
