package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.4yt  reason: invalid class name and case insensitive filesystem */
public abstract class C279594yt {
    public static HashtagImpl parseFromJson(16F r19) {
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Boolean bool3 = null;
            String str2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num3 = null;
            String str3 = null;
            Boolean bool6 = null;
            ImageUrl imageUrl = null;
            String str4 = null;
            String str5 = null;
            Boolean bool7 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("allow_following".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("allow_muting_story".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("follow_status".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("following".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("formatted_media_count".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("hide_use_hashtag_button".equals(A0q)) {
                    bool3 = Boolean.valueOf(r2.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("is_eligible_for_survey".equals(A0q)) {
                    bool4 = Boolean.valueOf(r2.A0d());
                } else if ("is_local".equals(A0q)) {
                    bool5 = Boolean.valueOf(r2.A0d());
                } else if ("media_count".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("non_violating".equals(A0q)) {
                    bool6 = Boolean.valueOf(r2.A0d());
                } else if ("profile_pic_url".equals(A0q)) {
                    imageUrl = 16h.A00(r2);
                } else if ("search_result_subtitle".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("search_subtitle".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("use_default_avatar".equals(A0q)) {
                    bool7 = Boolean.valueOf(r2.A0d());
                }
                r2.A0z();
            }
            return new HashtagImpl(imageUrl, bool, bool2, bool3, bool4, bool5, bool6, bool7, num, num2, num3, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, HashtagImpl hashtagImpl) {
        r2.A0c();
        Boolean bool = hashtagImpl.A01;
        if (bool != null) {
            r2.A0S("allow_following", bool.booleanValue());
        }
        Boolean bool2 = hashtagImpl.A02;
        if (bool2 != null) {
            r2.A0S("allow_muting_story", bool2.booleanValue());
        }
        Integer num = hashtagImpl.A08;
        if (num != null) {
            r2.A0P("follow_status", num.intValue());
        }
        Integer num2 = hashtagImpl.A09;
        if (num2 != null) {
            r2.A0P("following", num2.intValue());
        }
        String str = hashtagImpl.A0B;
        if (str != null) {
            r2.A0R("formatted_media_count", str);
        }
        Boolean bool3 = hashtagImpl.A03;
        if (bool3 != null) {
            r2.A0S("hide_use_hashtag_button", bool3.booleanValue());
        }
        String str2 = hashtagImpl.A0C;
        if (str2 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        Boolean bool4 = hashtagImpl.A04;
        if (bool4 != null) {
            r2.A0S("is_eligible_for_survey", bool4.booleanValue());
        }
        Boolean bool5 = hashtagImpl.A05;
        if (bool5 != null) {
            r2.A0S("is_local", bool5.booleanValue());
        }
        Integer num3 = hashtagImpl.A0A;
        if (num3 != null) {
            r2.A0P("media_count", num3.intValue());
        }
        String str3 = hashtagImpl.A0D;
        if (str3 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        Boolean bool6 = hashtagImpl.A06;
        if (bool6 != null) {
            r2.A0S("non_violating", bool6.booleanValue());
        }
        ImageUrl imageUrl = hashtagImpl.A00;
        if (imageUrl != null) {
            r2.A0q("profile_pic_url");
            16h.A01(r2, imageUrl);
        }
        String str4 = hashtagImpl.A0E;
        if (str4 != null) {
            r2.A0R("search_result_subtitle", str4);
        }
        String str5 = hashtagImpl.A0F;
        if (str5 != null) {
            r2.A0R("search_subtitle", str5);
        }
        Boolean bool7 = hashtagImpl.A07;
        if (bool7 != null) {
            r2.A0S("use_default_avatar", bool7.booleanValue());
        }
        r2.A0Z();
    }
}
