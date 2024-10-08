package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectPreview;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4Hf  reason: invalid class name and case insensitive filesystem */
public abstract class C263064Hf {
    public static EffectPreview parseFromJson(16F r21) {
        16F r0 = r21;
        0qQ.A0B(r0, 0);
        try {
            if (r0.A11() != 16L.A0D) {
                r0.A0z();
                return null;
            }
            AttributionUserImpl attributionUserImpl = null;
            String str = null;
            EffectActionSheet effectActionSheet = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ImageUrl imageUrl = null;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            String str8 = null;
            EffectThumbnailImageDict effectThumbnailImageDict = null;
            String str9 = null;
            while (r0.A1J() != 16L.A09) {
                String A0q = r0.A0q();
                r0.A1J();
                if ("attribution_user".equals(A0q)) {
                    attributionUserImpl = C255703ua.parseFromJson(r0);
                } else if ("device_position".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r0.A1P();
                    }
                } else if ("effect_action_sheet".equals(A0q)) {
                    effectActionSheet = C263084Hn.parseFromJson(r0);
                } else if ("effect_id".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r0.A1P();
                    }
                } else if ("failure_code".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r0.A1P();
                    }
                } else if (TraceFieldType.FailureReason.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r0.A1P();
                    }
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r0.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    imageUrl = 16h.A00(r0);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r0.A1P();
                    }
                } else if ("is_age_restricted".equals(A0q)) {
                    bool = Boolean.valueOf(r0.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r0.A1P();
                    }
                } else if ("save_status".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r0.A1P();
                    }
                } else if ("thumbnail_image".equals(A0q)) {
                    effectThumbnailImageDict = C263074Hk.parseFromJson(r0);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r0.A1P();
                    }
                }
                r0.A0z();
            }
            if (attributionUserImpl == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00("attribution_user", "EffectPreview");
            } else if (str6 == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "EffectPreview");
            } else if (str7 == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "EffectPreview");
            } else if (str8 != null || !(r0 instanceof 0c9)) {
                return new EffectPreview(attributionUserImpl, imageUrl, effectActionSheet, effectThumbnailImageDict, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
            } else {
                ((0c9) r0).A03.A00("save_status", "EffectPreview");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, EffectPreview effectPreview) {
        r3.A0c();
        AttributionUser attributionUser = effectPreview.A00;
        if (attributionUser != null) {
            r3.A0q("attribution_user");
            C255703ua.A00(r3, attributionUser.F0a());
        }
        String str = effectPreview.A05;
        if (str != null) {
            r3.A0R("device_position", str);
        }
        EffectActionSheet effectActionSheet = effectPreview.A02;
        if (effectActionSheet != null) {
            r3.A0q("effect_action_sheet");
            r3.A0c();
            List<String> list = effectActionSheet.A00;
            if (list != null) {
                16P.A03(r3, "primary_actions");
                for (String str2 : list) {
                    if (str2 != null) {
                        r3.A0t(str2);
                    }
                }
                r3.A0Y();
            }
            List<String> list2 = effectActionSheet.A01;
            if (list2 != null) {
                16P.A03(r3, "secondary_actions");
                for (String str3 : list2) {
                    if (str3 != null) {
                        r3.A0t(str3);
                    }
                }
                r3.A0Y();
            }
            r3.A0Z();
        }
        String str4 = effectPreview.A06;
        if (str4 != null) {
            r3.A0R("effect_id", str4);
        }
        String str5 = effectPreview.A07;
        if (str5 != null) {
            r3.A0R("failure_code", str5);
        }
        String str6 = effectPreview.A08;
        if (str6 != null) {
            r3.A0R(TraceFieldType.FailureReason, str6);
        }
        String str7 = effectPreview.A09;
        if (str7 != null) {
            r3.A0R("formatted_clips_media_count", str7);
        }
        ImageUrl imageUrl = effectPreview.A01;
        if (imageUrl != null) {
            r3.A0q("icon_url");
            16h.A01(r3, imageUrl);
        }
        String str8 = effectPreview.A0A;
        if (str8 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
        }
        Boolean bool = effectPreview.A04;
        if (bool != null) {
            r3.A0S("is_age_restricted", bool.booleanValue());
        }
        String str9 = effectPreview.A0B;
        if (str9 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
        }
        String str10 = effectPreview.A0C;
        if (str10 != null) {
            r3.A0R("save_status", str10);
        }
        EffectThumbnailImageDict effectThumbnailImageDict = effectPreview.A03;
        if (effectThumbnailImageDict != null) {
            r3.A0q("thumbnail_image");
            r3.A0c();
            ImageUrl imageUrl2 = effectThumbnailImageDict.A00;
            if (imageUrl2 != null) {
                r3.A0q("uri");
                16h.A01(r3, imageUrl2);
            }
            r3.A0Z();
        }
        String str11 = effectPreview.A0D;
        if (str11 != null) {
            r3.A0R(DialogModule.KEY_TITLE, str11);
        }
        r3.A0Z();
    }
}
