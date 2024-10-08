package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3745099s implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r5) {
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C384349hB r1 = (C384349hB) AnonymousClass972.A00(r3.value_, C3738397d.A00(), C384349hB.DEFAULT_INSTANCE);
                if (r1.version_ == 0) {
                    int i = r1.keySize_;
                    if (i == 16 || i == 24 || i == 32) {
                        return AnonymousClass99Z.A00(C3744899q.A00(r3.A0F()), Integer.valueOf(i));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str));
        }
    }
}
