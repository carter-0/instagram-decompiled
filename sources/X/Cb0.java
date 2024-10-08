package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Cb0 {
    public static NotePogVideoDict parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("image_versions2".equals(A17)) {
                    imageInfoImpl = 1dH.parseFromJson(r12);
                } else if ("pk".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("video_versions".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            VideoVersion parseFromJson = 1rY.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r12, "NotePogVideoDict");
            } else if (imageInfoImpl == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_versions2", r12, "NotePogVideoDict");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("pk", r12, "NotePogVideoDict");
            } else if (arrayList != null || !(r12 instanceof 0c9)) {
                return new NotePogVideoDict(imageInfoImpl, str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("video_versions", r12, "NotePogVideoDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
