package X;

import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Cz6  reason: case insensitive filesystem */
public abstract class C45594Cz6 {
    public static MediaVCRTappableData parseFromJson(16F r21) {
        16F r4 = r21;
        0qQ.A0B(r4, 0);
        try {
            Boolean bool = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            User user = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Float f2 = null;
            String str7 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("can_viewer_link_back_to_original_media_from_vcr".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("end_background_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if (C41845B3m.A1R(A17)) {
                    f = AnonymousClass7TF.A0U(r4);
                } else if ("original_comment_author".equals(A17)) {
                    user = C41845B3m.A0a(r4, false);
                } else if ("original_comment_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("original_comment_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("original_media_code".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("original_media_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("start_background_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if (C41845B3m.A1U(A17)) {
                    f2 = AnonymousClass7TF.A0U(r4);
                } else if ("text_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            if (bool == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_viewer_link_back_to_original_media_from_vcr", r4, "MediaVCRTappableData");
            } else if (user == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_comment_author", r4, "MediaVCRTappableData");
            } else if (str2 == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_comment_id", r4, "MediaVCRTappableData");
            } else if (str3 == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_comment_text", r4, "MediaVCRTappableData");
            } else if (str5 != null || !(r4 instanceof 0c9)) {
                return new MediaVCRTappableData(user, f, f2, str, str2, str3, str4, str5, str6, str7, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("original_media_id", r4, "MediaVCRTappableData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, MediaVCRTappableData mediaVCRTappableData, boolean z) {
        if (z) {
            r2.A0c();
        }
        r2.A0S("can_viewer_link_back_to_original_media_from_vcr", mediaVCRTappableData.A0A);
        String str = mediaVCRTappableData.A03;
        if (str != null) {
            r2.A0R("end_background_color", str);
        }
        C41846B3n.A0w(r2, mediaVCRTappableData.A01);
        User user = mediaVCRTappableData.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, "original_comment_author");
        }
        String str2 = mediaVCRTappableData.A04;
        if (str2 != null) {
            r2.A0R("original_comment_id", str2);
        }
        String str3 = mediaVCRTappableData.A05;
        if (str3 != null) {
            r2.A0R("original_comment_text", str3);
        }
        String str4 = mediaVCRTappableData.A06;
        if (str4 != null) {
            r2.A0R("original_media_code", str4);
        }
        String str5 = mediaVCRTappableData.A07;
        if (str5 != null) {
            r2.A0R("original_media_id", str5);
        }
        String str6 = mediaVCRTappableData.A08;
        if (str6 != null) {
            r2.A0R("start_background_color", str6);
        }
        C41846B3n.A0x(r2, mediaVCRTappableData.A02);
        String str7 = mediaVCRTappableData.A09;
        if (str7 != null) {
            r2.A0R("text_color", str7);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
