package X;

import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.api.schemas.ProfilePictureImpl;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* renamed from: X.3ua  reason: invalid class name and case insensitive filesystem */
public abstract class C255703ua {
    public static AttributionUserImpl parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ProfilePictureImpl profilePictureImpl = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("instagram_user_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("profile_picture".equals(A0q)) {
                    profilePictureImpl = C255713ub.parseFromJson(r9);
                } else if (Dbk.A01(22, 8, 111).equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new AttributionUserImpl(profilePictureImpl, bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, AttributionUserImpl attributionUserImpl) {
        r4.A0c();
        String str = attributionUserImpl.A02;
        if (str != null) {
            r4.A0R("instagram_user_id", str);
        }
        Boolean bool = attributionUserImpl.A01;
        if (bool != null) {
            r4.A0S("is_verified", bool.booleanValue());
        }
        ProfilePicture profilePicture = attributionUserImpl.A00;
        if (profilePicture != null) {
            r4.A0q("profile_picture");
            ProfilePictureImpl F8C = profilePicture.F8C();
            r4.A0c();
            ImageUrl imageUrl = F8C.A00;
            if (imageUrl != null) {
                r4.A0q("uri");
                16h.A01(r4, imageUrl);
            }
            r4.A0Z();
        }
        String str2 = attributionUserImpl.A03;
        if (str2 != null) {
            r4.A0R(Dbk.A01(22, 8, 111), str2);
        }
        r4.A0Z();
    }
}
