package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CbU {
    public static C61111JxN parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str3 = null;
            AudioBrowserPlaylistType audioBrowserPlaylistType = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("alacorn_session_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("display_image".equals(A17)) {
                    simpleImageUrl = 16h.A00(r14);
                } else if ("icon_url".equals(A17)) {
                    simpleImageUrl2 = 16h.A00(r14);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if (AnonymousClass000.A00(3751).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    audioBrowserPlaylistType = (AudioBrowserPlaylistType) AudioBrowserPlaylistType.A01.get(str);
                    if (audioBrowserPlaylistType == null) {
                        audioBrowserPlaylistType = AudioBrowserPlaylistType.UNRECOGNIZED;
                    }
                } else if ("preview_items".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C61112JxO parseFromJson = C44248Cbj.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (str3 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, "PlaylistData");
            } else if (str5 != null || !(r14 instanceof 0c9)) {
                return new C61111JxN(audioBrowserPlaylistType, simpleImageUrl, simpleImageUrl2, str2, str3, str4, str5, arrayList);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r14, "PlaylistData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
