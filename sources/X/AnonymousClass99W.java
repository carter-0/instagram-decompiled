package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99W implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r11, C3740097u r12) {
        Throwable th;
        C3739997t r122 = (C3739997t) r12;
        if (r122.A05.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                AnonymousClass99E r1 = (AnonymousClass99E) AnonymousClass972.A00(r122.A02, C3738397d.A00(), AnonymousClass99E.DEFAULT_INSTANCE);
                if (r1.version_ == 0) {
                    C384439hK r0 = r1.aesCtrKey_;
                    C384439hK r5 = r0;
                    if (r0 == null) {
                        r0 = C384439hK.DEFAULT_INSTANCE;
                    }
                    if (r0.version_ == 0) {
                        C3740898c r02 = r1.hmacKey_;
                        C3740898c r4 = r02;
                        if (r02 == null) {
                            r02 = C3740898c.DEFAULT_INSTANCE;
                        }
                        if (r02.version_ == 0) {
                            C384439hK r03 = r5;
                            if (r5 == null) {
                                r03 = C384439hK.DEFAULT_INSTANCE;
                            }
                            int A02 = r03.keyValue_.A02();
                            if (A02 == 16 || A02 == 24 || A02 == 32) {
                                Integer valueOf = Integer.valueOf(A02);
                                C3740898c r04 = r4;
                                if (r4 == null) {
                                    r04 = C3740898c.DEFAULT_INSTANCE;
                                }
                                int A022 = r04.keyValue_.A02();
                                if (A022 >= 16) {
                                    Integer valueOf2 = Integer.valueOf(A022);
                                    if (r5 == null) {
                                        r5 = C384439hK.DEFAULT_INSTANCE;
                                    }
                                    C21212XOz xOz = r5.params_;
                                    if (xOz == null) {
                                        xOz = C21212XOz.DEFAULT_INSTANCE;
                                    }
                                    int i = xOz.ivSize_;
                                    if (i < 12 || i > 16) {
                                        th = new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i)}));
                                    } else {
                                        Integer valueOf3 = Integer.valueOf(i);
                                        C3740898c r05 = r4;
                                        if (r4 == null) {
                                            r05 = C3740898c.DEFAULT_INSTANCE;
                                        }
                                        C384379hE r06 = r05.params_;
                                        if (r06 == null) {
                                            r06 = C384379hE.DEFAULT_INSTANCE;
                                        }
                                        int i2 = r06.tagSize_;
                                        if (i2 >= 10) {
                                            Integer valueOf4 = Integer.valueOf(i2);
                                            if (r4 == null) {
                                                r4 = C3740898c.DEFAULT_INSTANCE;
                                            }
                                            C384379hE r07 = r4.params_;
                                            if (r07 == null) {
                                                r07 = C384379hE.DEFAULT_INSTANCE;
                                            }
                                            C3742498s A00 = C3742498s.A00(r07.hash_);
                                            if (A00 == null) {
                                                A00 = C3742498s.UNRECOGNIZED;
                                            }
                                            AnonymousClass99S A002 = C3743899g.A00(AnonymousClass99Q.A00(A00), AnonymousClass99Q.A01(r122.A01), valueOf, valueOf2, valueOf3, valueOf4);
                                            C384439hK r08 = r1.aesCtrKey_;
                                            if (r08 == null) {
                                                r08 = C384439hK.DEFAULT_INSTANCE;
                                            }
                                            byte[] A04 = r08.keyValue_.A04();
                                            C375049Ca.A00(r11);
                                            C375079Cd A01 = C375079Cd.A01(r11, A04);
                                            C3740898c r09 = r1.hmacKey_;
                                            if (r09 == null) {
                                                r09 = C3740898c.DEFAULT_INSTANCE;
                                            }
                                            byte[] A042 = r09.keyValue_.A04();
                                            C375049Ca.A00(r11);
                                            C375079Cd A012 = C375079Cd.A01(r11, A042);
                                            Integer num = r122.A04;
                                            if (A002.A00 != A01.A00.A00.length) {
                                                th = new GeneralSecurityException("AES key size mismatch");
                                            } else if (A002.A01 == A012.A00.A00.length) {
                                                if (A002.A00()) {
                                                    if (num == null) {
                                                        th = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                                    }
                                                } else if (num != null) {
                                                    th = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                                                }
                                                return new AnonymousClass99M(A002, C393219w5.A00(A002, num), A01, A012, num);
                                            } else {
                                                th = new GeneralSecurityException("HMAC key size mismatch");
                                            }
                                        } else {
                                            th = new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i2)}));
                                        }
                                    }
                                } else {
                                    th = new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(A022)}));
                                }
                            } else {
                                th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A02)}));
                            }
                        } else {
                            th = new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                        }
                    } else {
                        th = new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }
}
