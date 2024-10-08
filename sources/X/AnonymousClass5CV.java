package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.io.IOException;

/* renamed from: X.5CV  reason: invalid class name */
public abstract class AnonymousClass5CV {
    public static AnonymousClass5CW parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str2 = null;
            IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("label".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("placement".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    iGAdTransparencyDisclaimerPlacement = (IGAdTransparencyDisclaimerPlacement) IGAdTransparencyDisclaimerPlacement.A01.get(str);
                    if (iGAdTransparencyDisclaimerPlacement == null) {
                        iGAdTransparencyDisclaimerPlacement = IGAdTransparencyDisclaimerPlacement.UNRECOGNIZED;
                    }
                }
                r5.A0z();
            }
            return new AnonymousClass5CW(iGAdTransparencyDisclaimerPlacement, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
