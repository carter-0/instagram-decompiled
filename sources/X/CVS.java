package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CVS {
    public static BE3 parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str2 = null;
            ArrayList arrayList = null;
            String str3 = null;
            AudioBrowserCategoryType audioBrowserCategoryType = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("category_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    audioBrowserCategoryType = (AudioBrowserCategoryType) AudioBrowserCategoryType.A01.get(str);
                    if (audioBrowserCategoryType == null) {
                        audioBrowserCategoryType = AudioBrowserCategoryType.UNRECOGNIZED;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("preview_items".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C42059BFm parseFromJson = CbW.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11, "CategoryData");
            } else if (arrayList == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("preview_items", r11, "CategoryData");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new BE3(audioBrowserCategoryType, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r11, "CategoryData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
