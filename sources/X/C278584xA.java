package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import java.io.IOException;

/* renamed from: X.4xA  reason: invalid class name and case insensitive filesystem */
public abstract class C278584xA {
    public static C257763xv parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = null;
            Boolean bool = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("ig_pbia_profile_and_browse_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    iGPBIAProfileBrowseTypeEnum = (IGPBIAProfileBrowseTypeEnum) IGPBIAProfileBrowseTypeEnum.A01.get(str);
                    if (iGPBIAProfileBrowseTypeEnum == null) {
                        iGPBIAProfileBrowseTypeEnum = IGPBIAProfileBrowseTypeEnum.UNRECOGNIZED;
                    }
                } else if ("should_render_dimmer".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                }
                r5.A0z();
            }
            return new C257763xv(iGPBIAProfileBrowseTypeEnum, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
