package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.5DT  reason: invalid class name */
public abstract class AnonymousClass5DT {
    public static AnonymousClass5DX parseFromJson(16F r23) {
        16F r0 = r23;
        0qQ.A0B(r0, 0);
        try {
            Boolean bool = null;
            if (r0.A11() != 16L.A0D) {
                r0.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            String str3 = null;
            AnonymousClass5DV r9 = null;
            String str4 = null;
            AnonymousClass5DV r10 = null;
            String str5 = null;
            Float f = null;
            String str6 = null;
            String str7 = null;
            while (r0.A1J() != 16L.A09) {
                String A0q = r0.A0q();
                r0.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r0.A1P();
                    }
                } else if ("image_height".equals(A0q)) {
                    num = Integer.valueOf(r0.A1D());
                } else if ("image_width".equals(A0q)) {
                    num2 = Integer.valueOf(r0.A1D());
                } else if ("is_save_allowed".equals(A0q)) {
                    bool = Boolean.valueOf(r0.A0d());
                } else if ("is_saved".equals(A0q)) {
                    bool2 = Boolean.valueOf(r0.A0d());
                } else if ("is_trending".equals(A0q)) {
                    bool3 = Boolean.valueOf(r0.A0d());
                } else if ("media_url".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r0.A1P();
                    }
                } else if ("source_media_id".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r0.A1P();
                    }
                } else if ("source_media_owner".equals(A0q)) {
                    r9 = AnonymousClass5DU.parseFromJson(r0);
                } else if ("source_media_username".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r0.A1P();
                    }
                } else if ("sticker_creator".equals(A0q)) {
                    r10 = AnonymousClass5DU.parseFromJson(r0);
                } else if ("sticker_creator_username".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r0.A1P();
                    }
                } else if ("sticker_duration".equals(A0q)) {
                    f = new Float(r0.A0U());
                } else if ("sticker_type".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r0.A1P();
                    }
                } else if ("strong_id__".equals(A0q)) {
                    if (r0.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r0.A1P();
                    }
                }
                r0.A0z();
            }
            if (str == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "CutoutStickerImpl");
            } else if (bool == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00("is_save_allowed", "CutoutStickerImpl");
            } else if (str2 == null && (r0 instanceof 0c9)) {
                ((0c9) r0).A03.A00("media_url", "CutoutStickerImpl");
            } else if (str6 != null || !(r0 instanceof 0c9)) {
                return new AnonymousClass5DX(r9, r10, bool2, bool3, f, num, num2, str, str2, str3, str4, str5, str6, str7, bool.booleanValue());
            } else {
                ((0c9) r0).A03.A00("sticker_type", "CutoutStickerImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
