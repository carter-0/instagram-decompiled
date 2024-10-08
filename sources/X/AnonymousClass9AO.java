package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AO implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r4, C3740097u r5) {
        C3739997t r52 = (C3739997t) r5;
        if (r52.A05.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                AnonymousClass99B r1 = (AnonymousClass99B) AnonymousClass972.A00(r52.A02, C3738397d.A00(), AnonymousClass99B.DEFAULT_INSTANCE);
                if (r1.version_ == 0) {
                    C3743999h A00 = AnonymousClass9AK.A00(r52.A01);
                    byte[] A04 = r1.keyValue_.A04();
                    C375049Ca.A00(r4);
                    return AnonymousClass9AI.A00(A00, C375079Cd.A01(r4, A04), r52.A04);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (AnonymousClass9GO unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }
}
