package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;

/* renamed from: X.989  reason: invalid class name */
public final /* synthetic */ class AnonymousClass989 implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r7, C3740097u r8) {
        Throwable th;
        C3739997t r82 = (C3739997t) r8;
        if (r82.A05.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                AnonymousClass97Q r5 = (AnonymousClass97Q) AnonymousClass972.A00(r82.A02, C3738397d.A00(), AnonymousClass97Q.DEFAULT_INSTANCE);
                if (r5.version_ == 0) {
                    int A02 = r5.keyValue_.A02();
                    if (A02 == 32 || A02 == 48 || A02 == 64) {
                        Integer valueOf = Integer.valueOf(A02);
                        AnonymousClass98D r2 = r82.A01;
                        Map map = C3740297w.A04;
                        if (map.containsKey(r2)) {
                            AnonymousClass98C r1 = (AnonymousClass98C) map.get(r2);
                            if (valueOf == null) {
                                th = new GeneralSecurityException("Key size is not set");
                            } else if (r1 != null) {
                                AnonymousClass981 r4 = new AnonymousClass981(r1, valueOf.intValue());
                                byte[] A04 = r5.keyValue_.A04();
                                C375049Ca.A00(r7);
                                C375079Cd A01 = C375079Cd.A01(r7, A04);
                                Integer num = r82.A04;
                                if (r4.A00 == A01.A00.A00.length) {
                                    if (r4.A00()) {
                                        if (num == null) {
                                            th = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                                        }
                                    } else if (num != null) {
                                        th = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                                    }
                                    return new AnonymousClass97N(r4, C375099Cg.A00(r4, num), A01, num);
                                }
                                th = new GeneralSecurityException("Key size mismatch");
                            } else {
                                th = new GeneralSecurityException(AnonymousClass000.A00(1056));
                            }
                        } else {
                            throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
                        }
                    } else {
                        th = new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(A02)}));
                    }
                } else {
                    th = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw th;
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
    }
}
