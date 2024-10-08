package X;

import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import java.io.IOException;

/* renamed from: X.4rg  reason: invalid class name and case insensitive filesystem */
public abstract class C275684rg {
    public static C275694rj parseFromJson(16F r5) {
        String str;
        String str2;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            MoreInfoFacepilePositionType moreInfoFacepilePositionType = null;
            MoreInfoFacepileSizeType moreInfoFacepileSizeType = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("position".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    moreInfoFacepilePositionType = (MoreInfoFacepilePositionType) MoreInfoFacepilePositionType.A01.get(str2);
                    if (moreInfoFacepilePositionType == null) {
                        moreInfoFacepilePositionType = MoreInfoFacepilePositionType.UNRECOGNIZED;
                    }
                } else if ("size".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    moreInfoFacepileSizeType = (MoreInfoFacepileSizeType) MoreInfoFacepileSizeType.A01.get(str);
                    if (moreInfoFacepileSizeType == null) {
                        moreInfoFacepileSizeType = MoreInfoFacepileSizeType.UNRECOGNIZED;
                    }
                }
                r5.A0z();
            }
            return new C275694rj(moreInfoFacepilePositionType, moreInfoFacepileSizeType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
