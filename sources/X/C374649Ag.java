package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Ag  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C374649Ag implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r5) {
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return C374619Ad.A00((C384429hJ) AnonymousClass972.A00(r3.value_, C3738397d.A00(), C384429hJ.DEFAULT_INSTANCE), r3.A0F());
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str));
        }
    }
}
