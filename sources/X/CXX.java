package X;

import com.instagram.api.schemas.FBTagType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CXX {
    public static BEj parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            FBTagType fBTagType = null;
            BFX bfx = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (AnonymousClass000.A00(1082).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("fb_tag_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    fBTagType = (FBTagType) FBTagType.A01.get(str);
                    if (fBTagType == null) {
                        fBTagType = FBTagType.UNRECOGNIZED;
                    }
                } else if ("fb_user".equals(A17)) {
                    bfx = CaX.parseFromJson(r11);
                } else if ("position".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            arrayList.add(AnonymousClass7TF.A0U(r11));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("tag_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (arrayList == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("position", r11, "FBUserTagInfoDict");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new BEj(fBTagType, bfx, bool, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("tag_id", r11, "FBUserTagInfoDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
