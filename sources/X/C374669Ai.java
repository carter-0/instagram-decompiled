package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C374669Ai implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r4, C3740097u r5) {
        C3739997t r52 = (C3739997t) r5;
        if (r52.A05.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                C3741698k r2 = (C3741698k) AnonymousClass972.A00(r52.A02, C3738397d.A00(), C3741698k.DEFAULT_INSTANCE);
                if (r2.version_ == 0) {
                    C384429hJ r1 = r2.params_;
                    if (r1 == null) {
                        r1 = C384429hJ.DEFAULT_INSTANCE;
                    }
                    return C374609Ac.A00(C374619Ad.A00(r1, r52.A01), r52.A04);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                sb.append(r2);
                throw new GeneralSecurityException(sb.toString());
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
    }
}
