package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9wk  reason: invalid class name and case insensitive filesystem */
public abstract class C393629wk {
    public static C381549bw parseFromJson(16F r19) {
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            Integer num = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            Float f = null;
            ArrayList arrayList = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("image_versions2".equals(A17)) {
                    imageInfoImpl = 1dH.parseFromJson(r2);
                } else if ("media_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("original_height".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if ("original_width".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if ("video_duration".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r2);
                } else if ("video_versions".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            C381859ch parseFromJson = C393649wm.parseFromJson(r2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r2.A0z();
            }
            if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2, "ThemeVideoBackground");
            } else if (num == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_type", r2, "ThemeVideoBackground");
            } else if (num2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_height", r2, "ThemeVideoBackground");
            } else if (num3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_width", r2, "ThemeVideoBackground");
            } else if (f != null || !(r2 instanceof 0c9)) {
                return new C381549bw(imageInfoImpl, str, arrayList, f.floatValue(), num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L("video_duration", r2, "ThemeVideoBackground");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
