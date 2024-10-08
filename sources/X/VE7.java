package X;

import com.instagram.guides.model.GuideItemAttachment;
import java.io.IOException;

public abstract class VE7 {
    public static GuideItemAttachment parseFromJson(16F r4) {
        C16511UwC uwC;
        0qQ.A0B(r4, 0);
        try {
            GuideItemAttachment guideItemAttachment = new GuideItemAttachment();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("account".equals(A17)) {
                    guideItemAttachment.A03 = C41845B3m.A0a(r4, false);
                } else if ("place".equals(A17)) {
                    guideItemAttachment.A02 = C44950Cnk.parseFromJson(r4);
                } else if (AnonymousClass000.A00(3783).equals(A17)) {
                    guideItemAttachment.A01 = C44912Cn2.parseFromJson(r4);
                }
                r4.A0z();
            }
            if (guideItemAttachment.A03 != null) {
                uwC = C16511UwC.ACCOUNT;
            } else if (guideItemAttachment.A02 != null) {
                uwC = C16511UwC.PLACE;
            } else if (guideItemAttachment.A01 != null) {
                uwC = C16511UwC.PRODUCT;
            } else {
                uwC = C16511UwC.UNKNOWN;
            }
            guideItemAttachment.A00 = uwC;
            return guideItemAttachment;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
