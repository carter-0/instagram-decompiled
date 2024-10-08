package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;

/* renamed from: X.985  reason: invalid class name */
public final /* synthetic */ class AnonymousClass985 implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r6) {
        C384459hM r4 = ((AnonymousClass98E) r6).A00;
        String str = r4.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                C384369hD r1 = (C384369hD) AnonymousClass972.A00(r4.value_, C3738397d.A00(), C384369hD.DEFAULT_INSTANCE);
                if (r1.version_ == 0) {
                    int i = r1.keySize_;
                    if (i == 32 || i == 48 || i == 64) {
                        Integer valueOf = Integer.valueOf(i);
                        AnonymousClass98D A0F = r4.A0F();
                        Map map = C3740297w.A04;
                        if (map.containsKey(A0F)) {
                            AnonymousClass98C r2 = (AnonymousClass98C) map.get(A0F);
                            if (valueOf == null) {
                                throw new GeneralSecurityException("Key size is not set");
                            } else if (r2 != null) {
                                return new AnonymousClass981(r2, valueOf.intValue());
                            } else {
                                throw new GeneralSecurityException(AnonymousClass000.A00(1056));
                            }
                        } else {
                            throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", A0F.A01()));
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(i)}));
                    }
                } else {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesSivParameters.parseParameters: ", str));
        }
    }
}
