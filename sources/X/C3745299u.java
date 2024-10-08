package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.99u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3745299u implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r6, C3740097u r7) {
        Throwable th;
        C3739997t r72 = (C3739997t) r7;
        if (r72.A05.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C3740998d r2 = (C3740998d) AnonymousClass972.A00(r72.A02, C3738397d.A00(), C3740998d.DEFAULT_INSTANCE);
                if (r2.version_ == 0) {
                    int A02 = r2.keyValue_.A02();
                    if (A02 == 16 || A02 == 24 || A02 == 32) {
                        C3743299a A00 = AnonymousClass99Z.A00(C3744899q.A00(r72.A01), Integer.valueOf(A02));
                        byte[] A04 = r2.keyValue_.A04();
                        C375049Ca.A00(r6);
                        C375079Cd A01 = C375079Cd.A01(r6, A04);
                        Integer num = r72.A04;
                        if (A00.A01 == A01.A00.A00.length) {
                            if (A00.A00()) {
                                if (num == null) {
                                    th = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                }
                            } else if (num != null) {
                                th = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            }
                            return new C3744599n(A00, AnonymousClass9DQ.A00(A00, num), A01, num);
                        }
                        th = new GeneralSecurityException("Key size mismatch");
                    } else {
                        th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A02)}));
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }
}
