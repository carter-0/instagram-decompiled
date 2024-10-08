package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;
import java.io.IOException;

/* renamed from: X.5Bg  reason: invalid class name and case insensitive filesystem */
public abstract class C282065Bg {
    public static C282075Bi parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            FBBioLinkSocialContextType fBBioLinkSocialContextType = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("display_text".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("magnitude".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("social_context_type".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    fBBioLinkSocialContextType = (FBBioLinkSocialContextType) FBBioLinkSocialContextType.A01.get(str);
                    if (fBBioLinkSocialContextType == null) {
                        fBBioLinkSocialContextType = FBBioLinkSocialContextType.UNRECOGNIZED;
                    }
                }
                r10.A0z();
            }
            if (str2 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("display_text", "FBBioLinkSocialContextImpl");
            } else if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("magnitude", "FBBioLinkSocialContextImpl");
            } else if (fBBioLinkSocialContextType != null || !(r10 instanceof 0c9)) {
                return new C282075Bi(fBBioLinkSocialContextType, str2, num.intValue());
            } else {
                ((0c9) r10).A03.A00("social_context_type", "FBBioLinkSocialContextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
