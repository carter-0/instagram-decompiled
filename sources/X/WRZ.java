package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public final class WRZ implements AnonymousClass1FD {
    public static final WRZ A00 = new WRZ();

    public final /* bridge */ /* synthetic */ Object invoke(16F r5) {
        String A1P;
        String A1P2;
        0qQ.A0B(r5, 0);
        C61037Jvb jvb = new C61037Jvb((String) null, 7, 19);
        if (r5.A11() != 16L.A0D) {
            throw new IOException("JSON string for RingGlyph should start with a left brace");
        }
        while (r5.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r5);
            if (A17 != null) {
                int hashCode = A17.hashCode();
                if (hashCode == -877823861) {
                    if (A17.equals("image_url")) {
                        if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                            jvb.A00 = A1P;
                        }
                    }
                    0KC.A0C("RingGlyphJsonHelper", C13988Tno.A0g(A17));
                } else if (hashCode != 3373707) {
                    if (hashCode == 473808408 && A17.equals(AnonymousClass000.A00(306))) {
                        jvb.A01 = C13989Tnp.A0o(r5);
                    }
                    0KC.A0C("RingGlyphJsonHelper", C13988Tno.A0g(A17));
                } else {
                    if (A17.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                        if (!(r5.A11() == 16L.A0G || (A1P2 = r5.A1P()) == null)) {
                            jvb.A02 = A1P2;
                        }
                    }
                    0KC.A0C("RingGlyphJsonHelper", C13988Tno.A0g(A17));
                }
                r5.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return jvb;
    }
}
