package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.4o2  reason: invalid class name and case insensitive filesystem */
public abstract class C274294o2 {
    public static C274394oF parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("display_url".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("favicon_url".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r12);
                } else if ("image_url".equals(A0q)) {
                    simpleImageUrl2 = 16h.A00(r12);
                } else if ("raw_url".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str2 == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00("raw_url", "LinkPreviewAttachment");
            } else if (str4 != null || !(r12 instanceof 0c9)) {
                return new C274394oF(simpleImageUrl, simpleImageUrl2, str, str2, str3, str4);
            } else {
                ((0c9) r12).A03.A00("url", "LinkPreviewAttachment");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
