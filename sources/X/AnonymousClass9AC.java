package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.9AC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AC implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r5) {
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                C384359hC r1 = (C384359hC) AnonymousClass972.A00(r3.value_, C3738397d.A00(), C384359hC.DEFAULT_INSTANCE);
                if (r1.version_ == 0) {
                    int i = r1.keySize_;
                    if (i == 16 || i == 32) {
                        Integer valueOf = Integer.valueOf(i);
                        AnonymousClass9AF A00 = AnonymousClass9A9.A00(r3.A0F());
                        if (valueOf != null) {
                            return new AnonymousClass9AB(A00, valueOf.intValue());
                        }
                        throw new GeneralSecurityException("Key size is not set");
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str));
        }
    }
}
