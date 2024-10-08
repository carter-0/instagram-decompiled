package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.9AE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AE implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r6, C3740097u r7) {
        Throwable th;
        C3739997t r72 = (C3739997t) r7;
        if (r72.A05.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                AnonymousClass99C r3 = (AnonymousClass99C) AnonymousClass972.A00(r72.A02, C3738397d.A00(), AnonymousClass99C.DEFAULT_INSTANCE);
                if (r3.version_ == 0) {
                    int A02 = r3.keyValue_.A02();
                    if (A02 == 16 || A02 == 32) {
                        Integer valueOf = Integer.valueOf(A02);
                        AnonymousClass9AF A00 = AnonymousClass9A9.A00(r72.A01);
                        if (valueOf != null) {
                            AnonymousClass9AB r4 = new AnonymousClass9AB(A00, valueOf.intValue());
                            byte[] A04 = r3.keyValue_.A04();
                            C375049Ca.A00(r6);
                            C375079Cd A01 = C375079Cd.A01(r6, A04);
                            Integer num = r72.A04;
                            if (r4.A00 == A01.A00.A00.length) {
                                if (r4.A00()) {
                                    if (num == null) {
                                        th = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                    }
                                } else if (num != null) {
                                    th = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                                }
                                return new AnonymousClass9A6(r4, C393239w7.A00(r4, num), A01, num);
                            }
                            th = new GeneralSecurityException("Key size mismatch");
                        } else {
                            th = new GeneralSecurityException("Key size is not set");
                        }
                    } else {
                        th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A02)}));
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }
}
