package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.9A3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9A3 implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r6, C3740097u r7) {
        Throwable th;
        C3739997t r72 = (C3739997t) r7;
        if (r72.A05.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                AnonymousClass99D r3 = (AnonymousClass99D) AnonymousClass972.A00(r72.A02, C3738397d.A00(), AnonymousClass99D.DEFAULT_INSTANCE);
                if (r3.version_ == 0) {
                    int A02 = r3.keyValue_.A02();
                    if (A02 == 16 || A02 == 24 || A02 == 32) {
                        Integer valueOf = Integer.valueOf(A02);
                        XP0 xp0 = r3.params_;
                        if (xp0 == null) {
                            xp0 = XP0.DEFAULT_INSTANCE;
                        }
                        int i = xp0.ivSize_;
                        if (i == 12 || i == 16) {
                            C3743599d A00 = C3743499c.A00(C3745799z.A00(r72.A01), Integer.valueOf(i), valueOf);
                            byte[] A04 = r3.keyValue_.A04();
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
                                return new C3745599x(A00, C393229w6.A00(A00, num), A01, num);
                            }
                            th = new GeneralSecurityException("Key size mismatch");
                        } else {
                            th = new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i)}));
                        }
                    } else {
                        th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A02)}));
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }
}
