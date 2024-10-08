package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99U implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r11) {
        C384459hM r2 = ((AnonymousClass98E) r11).A00;
        String str = r2.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C384399hG r1 = (C384399hG) AnonymousClass972.A00(r2.value_, C3738397d.A00(), C384399hG.DEFAULT_INSTANCE);
                C384449hL r0 = r1.hmacKeyFormat_;
                C384449hL r4 = r0;
                if (r0 == null) {
                    r0 = C384449hL.DEFAULT_INSTANCE;
                }
                if (r0.version_ == 0) {
                    C384409hH r02 = r1.aesCtrKeyFormat_;
                    C384409hH r5 = r02;
                    if (r02 == null) {
                        r02 = C384409hH.DEFAULT_INSTANCE;
                    }
                    int i = r02.keySize_;
                    if (i == 16 || i == 24 || i == 32) {
                        Integer valueOf = Integer.valueOf(i);
                        C384449hL r03 = r4;
                        if (r4 == null) {
                            r03 = C384449hL.DEFAULT_INSTANCE;
                        }
                        int i2 = r03.keySize_;
                        if (i2 >= 16) {
                            Integer valueOf2 = Integer.valueOf(i2);
                            if (r5 == null) {
                                r5 = C384409hH.DEFAULT_INSTANCE;
                            }
                            C21212XOz xOz = r5.params_;
                            if (xOz == null) {
                                xOz = C21212XOz.DEFAULT_INSTANCE;
                            }
                            int i3 = xOz.ivSize_;
                            if (i3 < 12 || i3 > 16) {
                                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i3)}));
                            }
                            Integer valueOf3 = Integer.valueOf(i3);
                            C384449hL r04 = r4;
                            if (r4 == null) {
                                r04 = C384449hL.DEFAULT_INSTANCE;
                            }
                            C384379hE r05 = r04.params_;
                            if (r05 == null) {
                                r05 = C384379hE.DEFAULT_INSTANCE;
                            }
                            int i4 = r05.tagSize_;
                            if (i4 >= 10) {
                                Integer valueOf4 = Integer.valueOf(i4);
                                if (r4 == null) {
                                    r4 = C384449hL.DEFAULT_INSTANCE;
                                }
                                C384379hE r06 = r4.params_;
                                if (r06 == null) {
                                    r06 = C384379hE.DEFAULT_INSTANCE;
                                }
                                C3742498s A00 = C3742498s.A00(r06.hash_);
                                if (A00 == null) {
                                    A00 = C3742498s.UNRECOGNIZED;
                                }
                                return C3743899g.A00(AnonymousClass99Q.A00(A00), AnonymousClass99Q.A01(r2.A0F()), valueOf, valueOf2, valueOf3, valueOf4);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i4)}));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(i2)}));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str));
        }
    }
}
