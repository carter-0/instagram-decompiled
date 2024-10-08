package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Aq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C374749Aq implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r5) {
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (((C384339hA) AnonymousClass972.A00(r3.value_, C3738397d.A00(), C384339hA.DEFAULT_INSTANCE)).version_ == 0) {
                    return new C3744299k(C374729Ao.A00(r3.A0F()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
        }
    }
}
