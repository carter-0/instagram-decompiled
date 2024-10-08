package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9AY implements AnonymousClass98A {
    public final AnonymousClass97G E1r(C375049Ca r5, C3740097u r6) {
        GeneralSecurityException generalSecurityException;
        C39880ADc aDc;
        C3739997t r62 = (C3739997t) r6;
        if (r62.A05.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                C3741798l r2 = (C3741798l) AnonymousClass972.A00(r62.A02, C3738397d.A00(), C3741798l.DEFAULT_INSTANCE);
                if (r2.version_ == 0) {
                    XP1 xp1 = r2.params_;
                    if (xp1 == null) {
                        xp1 = XP1.DEFAULT_INSTANCE;
                    }
                    String str = xp1.keyUri_;
                    AnonymousClass98D r22 = r62.A01;
                    int ordinal = r22.ordinal();
                    if (ordinal == 1) {
                        aDc = C39880ADc.A02;
                    } else if (ordinal == 3) {
                        aDc = C39880ADc.A01;
                    } else {
                        generalSecurityException = new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r22.A01()));
                    }
                    return AnonymousClass9AR.A00(new AnonymousClass9AV(aDc, str), r62.A04);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("KmsAeadKey are only accepted with version 0, got ");
                sb.append(r2);
                generalSecurityException = new GeneralSecurityException(sb.toString());
                throw generalSecurityException;
            } catch (AnonymousClass9GO e) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
    }
}
