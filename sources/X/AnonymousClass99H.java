package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99H implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r7) {
        C384459hM r5 = ((AnonymousClass98E) r7).A00;
        String str = r5.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C384389hF r4 = (C384389hF) AnonymousClass972.A00(r5.value_, C3738397d.A00(), C384389hF.DEFAULT_INSTANCE);
                int i = r4.keySize_;
                if (i == 16 || i == 32) {
                    Integer valueOf = Integer.valueOf(i);
                    C384329h9 r0 = r4.params_;
                    if (r0 == null) {
                        r0 = C384329h9.DEFAULT_INSTANCE;
                    }
                    int i2 = r0.tagSize_;
                    if (i2 < 10 || 16 < i2) {
                        throw new GeneralSecurityException(002.A0O("Invalid tag size for AesCmacParameters: ", i2));
                    }
                    return AnonymousClass993.A00(AnonymousClass99F.A00(r5.A0F()), valueOf, Integer.valueOf(i2));
                }
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str));
        }
    }
}
