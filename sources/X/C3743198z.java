package X;

import java.security.GeneralSecurityException;

/* renamed from: X.98z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3743198z implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r7, C3740097u r8) {
        GeneralSecurityException generalSecurityException;
        C3739997t r82 = (C3739997t) r8;
        if (r82.A05.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                C3740898c r5 = (C3740898c) AnonymousClass972.A00(r82.A02, C3738397d.A00(), C3740898c.DEFAULT_INSTANCE);
                if (r5.version_ == 0) {
                    Integer valueOf = Integer.valueOf(r5.keyValue_.A02());
                    C384379hE r0 = r5.params_;
                    C384379hE r2 = r0;
                    if (r0 == null) {
                        r0 = C384379hE.DEFAULT_INSTANCE;
                    }
                    Integer valueOf2 = Integer.valueOf(r0.tagSize_);
                    C3742398r r1 = C3742098o.A00;
                    if (r2 == null) {
                        r2 = C384379hE.DEFAULT_INSTANCE;
                    }
                    C3742498s A00 = C3742498s.A00(r2.hash_);
                    if (A00 == null) {
                        A00 = C3742498s.UNRECOGNIZED;
                    }
                    C3742798v A002 = AnonymousClass991.A00((C3742598t) r1.A01(A00), (C3742298q) C3742098o.A01.A01(r82.A01), valueOf, valueOf2);
                    byte[] A04 = r5.keyValue_.A04();
                    C375049Ca.A00(r7);
                    C375079Cd A01 = C375079Cd.A01(r7, A04);
                    Integer num = r82.A04;
                    if (A002.A00 == A01.A00.A00.length) {
                        if (A002.A00()) {
                            if (num == null) {
                                generalSecurityException = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                            }
                        } else if (num != null) {
                            generalSecurityException = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        return new AnonymousClass98Z(A002, C393269wA.A00(A002, num), A01, num);
                    }
                    generalSecurityException = new GeneralSecurityException("Key size mismatch");
                } else {
                    generalSecurityException = new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw generalSecurityException;
            } catch (AnonymousClass9GO | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }
}
