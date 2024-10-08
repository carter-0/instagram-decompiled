package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;

public abstract class OQR {
    public static final String A00(1Xj r3, String str) {
        String str2;
        C258223yf A1L;
        List BxQ;
        0qQ.A0B(r3, 1);
        int ordinal = SocialContextType.BLEND_MEDIA_SUGGESTED_BY.ordinal();
        if (ordinal == 1) {
            str2 = "BLEND";
        } else if (ordinal != 15) {
            str2 = null;
        } else {
            str2 = "SPOTLIGHT";
        }
        if (!0qQ.A0K(str2, str) || (A1L = r3.A1L()) == null || (BxQ = A1L.BxQ()) == null) {
            return null;
        }
        return DbT.A0z(",", BxQ, C74096Poz.A00);
    }

    public static final boolean A01(C74248Prc prc, 1bp r6, 2Dm r7) {
        AnonymousClass7TG.A1T(r7, r6, prc);
        List<DirectThreadKey> C6L = r6.C6L();
        0qQ.A07(C6L);
        if (!(C6L instanceof Collection) || !C6L.isEmpty()) {
            for (DirectThreadKey directThreadKey : C6L) {
                0qQ.A0A(directThreadKey);
                0qQ.A0B(directThreadKey, 3);
                if (2Dr.A03((2Dr) r7, directThreadKey) != null) {
                    C254703su BRx = r7.BRx(directThreadKey, r6.Aqm(), r6.A06());
                    if (BRx == null || BRx.A0g() == null) {
                        return true;
                    }
                } else {
                    String str = ((C66656MaP) prc).A02;
                    if (!"upload_failed_permanent".equals(str) && !"upload_failed_transient".equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
