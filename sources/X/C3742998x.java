package X;

import java.security.GeneralSecurityException;

/* renamed from: X.98x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3742998x implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r7) {
        C384459hM r5 = ((AnonymousClass98E) r7).A00;
        String str = r5.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                C384449hL r2 = (C384449hL) AnonymousClass972.A00(r5.value_, C3738397d.A00(), C384449hL.DEFAULT_INSTANCE);
                int i = r2.version_;
                if (i == 0) {
                    Integer valueOf = Integer.valueOf(r2.keySize_);
                    C384379hE r0 = r2.params_;
                    C384379hE r22 = r0;
                    if (r0 == null) {
                        r0 = C384379hE.DEFAULT_INSTANCE;
                    }
                    Integer valueOf2 = Integer.valueOf(r0.tagSize_);
                    C3742398r r1 = C3742098o.A00;
                    if (r22 == null) {
                        r22 = C384379hE.DEFAULT_INSTANCE;
                    }
                    C3742498s A00 = C3742498s.A00(r22.hash_);
                    if (A00 == null) {
                        A00 = C3742498s.UNRECOGNIZED;
                    }
                    return AnonymousClass991.A00((C3742598t) r1.A01(A00), (C3742298q) C3742098o.A01.A01(r5.A0F()), valueOf, valueOf2);
                }
                throw new GeneralSecurityException(002.A0O("Parsing HmacParameters failed: unknown Version ", i));
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str));
        }
    }
}
