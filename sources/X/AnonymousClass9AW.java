package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AW implements AnonymousClass986 {
    public final AnonymousClass983 E1t(C3740097u r6) {
        C39880ADc aDc;
        C384459hM r4 = ((AnonymousClass98E) r6).A00;
        String str = r4.typeUrl_;
        if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                String str2 = ((XP1) AnonymousClass972.A00(r4.value_, C3738397d.A00(), XP1.DEFAULT_INSTANCE)).keyUri_;
                AnonymousClass98D A0F = r4.A0F();
                int ordinal = A0F.ordinal();
                if (ordinal == 1) {
                    aDc = C39880ADc.A02;
                } else if (ordinal == 3) {
                    aDc = C39880ADc.A01;
                } else {
                    throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", A0F.A01()));
                }
                return new AnonymousClass9AV(aDc, str2);
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException(002.A0R("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str));
        }
    }
}
