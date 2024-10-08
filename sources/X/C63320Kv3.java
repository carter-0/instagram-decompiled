package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kv3  reason: case insensitive filesystem */
public abstract class C63320Kv3 {
    public static C61220JzD parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            C61219JzC jzC = null;
            String str4 = null;
            MediaKitSectionType mediaKitSectionType = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("accounts".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41846B3n.A1E(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("insights".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C61217JzA parseFromJson = C63315Kuy.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_posts".equals(A17)) {
                    jzC = C63318Kv1.parseFromJson(r14);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    mediaKitSectionType = (MediaKitSectionType) MediaKitSectionType.A01.get(str);
                    if (mediaKitSectionType == null) {
                        mediaKitSectionType = MediaKitSectionType.UNRECOGNIZED;
                    }
                }
                r14.A0z();
            }
            if (str3 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, "MediaKitSection");
            } else if (str4 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r14, "MediaKitSection");
            } else if (mediaKitSectionType != null || !(r14 instanceof 0c9)) {
                return new C61220JzD(jzC, mediaKitSectionType, str2, str3, str4, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r14, "MediaKitSection");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
