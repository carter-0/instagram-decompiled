package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99J implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r7, C3740097u r8) {
        Throwable th;
        C3739997t r82 = (C3739997t) r8;
        if (r82.A05.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                AnonymousClass99A r5 = (AnonymousClass99A) AnonymousClass972.A00(r82.A02, C3738397d.A00(), AnonymousClass99A.DEFAULT_INSTANCE);
                if (r5.version_ == 0) {
                    int A02 = r5.keyValue_.A02();
                    if (A02 == 16 || A02 == 32) {
                        Integer valueOf = Integer.valueOf(A02);
                        C384329h9 r0 = r5.params_;
                        if (r0 == null) {
                            r0 = C384329h9.DEFAULT_INSTANCE;
                        }
                        int i = r0.tagSize_;
                        if (i < 10 || 16 < i) {
                            th = new GeneralSecurityException(002.A0O("Invalid tag size for AesCmacParameters: ", i));
                        } else {
                            AnonymousClass994 A00 = AnonymousClass993.A00(AnonymousClass99F.A00(r82.A01), valueOf, Integer.valueOf(i));
                            byte[] A04 = r5.keyValue_.A04();
                            C375049Ca.A00(r7);
                            C375079Cd A01 = C375079Cd.A01(r7, A04);
                            Integer num = r82.A04;
                            if (A00.A00 == A01.A00.A00.length) {
                                if (A00.A00()) {
                                    if (num == null) {
                                        th = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                    }
                                } else if (num != null) {
                                    th = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                                }
                                return new AnonymousClass998(A00, C393259w9.A00(A00, num), A01, num);
                            }
                            th = new GeneralSecurityException("Key size mismatch");
                        }
                    } else {
                        th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(A02 * 8)}));
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }
}
