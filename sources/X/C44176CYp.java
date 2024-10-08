package X;

import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import java.io.IOException;

/* renamed from: X.CYp  reason: case insensitive filesystem */
public abstract class C44176CYp {
    public static BF5 parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("cardType".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    iGClickToMessagingCardTypeEnum = (IGClickToMessagingCardTypeEnum) IGClickToMessagingCardTypeEnum.A01.get(str);
                    if (iGClickToMessagingCardTypeEnum == null) {
                        iGClickToMessagingCardTypeEnum = IGClickToMessagingCardTypeEnum.UNRECOGNIZED;
                    }
                } else if ("icebreakerDisclaimerText".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new BF5(iGClickToMessagingCardTypeEnum, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
