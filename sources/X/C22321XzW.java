package X;

import java.security.GeneralSecurityException;

/* renamed from: X.XzW  reason: case insensitive filesystem */
public final class C22321XzW implements AnonymousClass986 {
    public final int A00;

    public C22321XzW(int i) {
        this.A00 = i;
    }

    public final AnonymousClass983 E1t(C3740097u r5) {
        int i = this.A00;
        C384459hM r3 = ((AnonymousClass98E) r5).A00;
        String str = r3.typeUrl_;
        if (i != 0) {
            if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                try {
                    XP3 xp3 = (XP3) AnonymousClass972.A00(r3.value_, C3738397d.A00(), XP3.DEFAULT_INSTANCE);
                    AnonymousClass98D A0F = r3.A0F();
                    XP6 xp6 = xp3.params_;
                    if (xp6 == null) {
                        xp6 = XP6.DEFAULT_INSTANCE;
                    }
                    return C22022Xsy.A01(xp6, A0F);
                } catch (AnonymousClass9GO e) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
                }
            } else {
                throw AnonymousClass7TF.A0W("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", str);
            }
        } else if (str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                XP4 xp4 = (XP4) AnonymousClass972.A00(r3.value_, C3738397d.A00(), XP4.DEFAULT_INSTANCE);
                AnonymousClass98D A0F2 = r3.A0F();
                XP5 xp5 = xp4.params_;
                if (xp5 == null) {
                    xp5 = XP5.DEFAULT_INSTANCE;
                }
                return C22021Xsx.A00(xp5, A0F2);
            } catch (AnonymousClass9GO e2) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
            }
        } else {
            throw AnonymousClass7TF.A0W("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", str);
        }
    }
}
