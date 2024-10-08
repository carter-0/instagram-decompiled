package X;

import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import java.io.IOException;

public abstract class Cb8 {
    public static OpenInspirationHubCommandImpl parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            XDTCreatorInspirationHubType xDTCreatorInspirationHubType = null;
            while (r4.A1J() != 16L.A09) {
                if ("target_tab".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    xDTCreatorInspirationHubType = (XDTCreatorInspirationHubType) XDTCreatorInspirationHubType.A01.get(str);
                    if (xDTCreatorInspirationHubType == null) {
                        xDTCreatorInspirationHubType = XDTCreatorInspirationHubType.UNRECOGNIZED;
                    }
                }
                r4.A0z();
            }
            return new OpenInspirationHubCommandImpl(xDTCreatorInspirationHubType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
