package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.9A1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9A1 implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r6) {
        C384459hM r4 = ((AnonymousClass98E) r6).A00;
        String str = r4.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C384419hI r3 = (C384419hI) AnonymousClass972.A00(r4.value_, C3738397d.A00(), C384419hI.DEFAULT_INSTANCE);
                int i = r3.keySize_;
                if (i == 16 || i == 24 || i == 32) {
                    Integer valueOf = Integer.valueOf(i);
                    XP0 xp0 = r3.params_;
                    if (xp0 == null) {
                        xp0 = XP0.DEFAULT_INSTANCE;
                    }
                    int i2 = xp0.ivSize_;
                    if (i2 == 12 || i2 == 16) {
                        return C3743499c.A00(C3745799z.A00(r4.A0F()), Integer.valueOf(i2), valueOf);
                    }
                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i2)}));
                }
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str));
        }
    }
}
