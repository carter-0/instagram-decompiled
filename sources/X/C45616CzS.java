package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.venue.LocationDict;
import java.io.IOException;

/* renamed from: X.CzS  reason: case insensitive filesystem */
public abstract class C45616CzS {
    public static AnonymousClass3I7 parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str2 = null;
            Float f = null;
            Float f2 = null;
            LocationDict locationDict = null;
            String str3 = null;
            String str4 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str5 = null;
            String str6 = null;
            MultiAuthorStoryType multiAuthorStoryType = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("challenge_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("lat".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r15);
                } else if ("lng".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r15);
                } else if ("location_dict".equals(A17)) {
                    locationDict = AnonymousClass41Q.parseFromJson(r15);
                } else if (C41845B3m.A19(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("profile_pic_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r15);
                } else if ("profile_pic_username".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("short_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    multiAuthorStoryType = (MultiAuthorStoryType) MultiAuthorStoryType.A01.get(str);
                    if (multiAuthorStoryType == null) {
                        multiAuthorStoryType = MultiAuthorStoryType.A0Y;
                    }
                }
                r15.A0z();
            }
            if (str4 != null || !(r15 instanceof 0c9)) {
                return new AnonymousClass3I7(multiAuthorStoryType, simpleImageUrl, locationDict, f, f2, str2, str3, str4, str5, str6);
            }
            AnonymousClass7TF.A1L("pk", r15, "ReelMasOwnerClientDict");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass3I7 r3) {
        r2.A0c();
        String str = r3.A05;
        if (str != null) {
            r2.A0R("challenge_id", str);
        }
        Float f = r3.A03;
        if (f != null) {
            r2.A0O("lat", f.floatValue());
        }
        Float f2 = r3.A04;
        if (f2 != null) {
            r2.A0O("lng", f2.floatValue());
        }
        LocationDict locationDict = r3.A02;
        if (locationDict != null) {
            r2.A0q("location_dict");
            AnonymousClass41Q.A00(r2, locationDict);
        }
        String str2 = r3.A06;
        if (str2 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
        String str3 = r3.A07;
        if (str3 != null) {
            r2.A0R("pk", str3);
        }
        ImageUrl imageUrl = r3.A01;
        if (imageUrl != null) {
            r2.A0q("profile_pic_url");
            16h.A01(r2, imageUrl);
        }
        String str4 = r3.A08;
        if (str4 != null) {
            r2.A0R("profile_pic_username", str4);
        }
        String str5 = r3.A09;
        if (str5 != null) {
            r2.A0R("short_name", str5);
        }
        MultiAuthorStoryType multiAuthorStoryType = r3.A00;
        if (multiAuthorStoryType != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, multiAuthorStoryType.A00);
        }
        r2.A0Z();
    }
}
