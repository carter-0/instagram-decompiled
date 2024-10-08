package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import java.io.IOException;

public abstract class V83 {
    public static UNQ parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            AnonymousClass3HX r5 = null;
            ProfileGridItemTypeEnum profileGridItemTypeEnum = null;
            1Xj r4 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("highlight".equals(A17)) {
                    r5 = AnonymousClass3HR.parseFromJson(r6);
                } else if ("item_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    profileGridItemTypeEnum = (ProfileGridItemTypeEnum) ProfileGridItemTypeEnum.A01.get(str);
                    if (profileGridItemTypeEnum == null) {
                        profileGridItemTypeEnum = ProfileGridItemTypeEnum.UNRECOGNIZED;
                    }
                } else if ("media".equals(A17)) {
                    r4 = 1Xj.A00(r6);
                }
                r6.A0z();
            }
            return new UNQ(profileGridItemTypeEnum, r4, r5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
