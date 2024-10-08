package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AM implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r5) {
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                AnonymousClass972.A00(r3.value_, C3738397d.A00(), C21211XOy.DEFAULT_INSTANCE);
                return new C3744099i(AnonymousClass9AK.A00(r3.A0F()));
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
        }
    }
}
