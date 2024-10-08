package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.CWg  reason: case insensitive filesystem */
public abstract class C44115CWg {
    public static CreatorViewerContextCTAImpl parseFromJson(16F r11) {
        String str;
        String str2;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            CreatorViewerContextCTAType creatorViewerContextCTAType = null;
            CreatorViewerContextCTATarget creatorViewerContextCTATarget = null;
            FormattedStringImpl formattedStringImpl = null;
            String str3 = null;
            String str4 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("context_cta_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                    creatorViewerContextCTAType = (CreatorViewerContextCTAType) CreatorViewerContextCTAType.A01.get(str2);
                    if (creatorViewerContextCTAType == null) {
                        creatorViewerContextCTAType = CreatorViewerContextCTAType.UNRECOGNIZED;
                    }
                } else if ("cta_target".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    creatorViewerContextCTATarget = (CreatorViewerContextCTATarget) CreatorViewerContextCTATarget.A01.get(str);
                    if (creatorViewerContextCTATarget == null) {
                        creatorViewerContextCTATarget = CreatorViewerContextCTATarget.UNRECOGNIZED;
                    }
                } else if ("extended_text".equals(A17)) {
                    formattedStringImpl = C44152CXr.parseFromJson(r11);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (creatorViewerContextCTAType == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context_cta_type", r11, "CreatorViewerContextCTAImpl");
            } else if (str4 != null || !(r11 instanceof 0c9)) {
                return new CreatorViewerContextCTAImpl(creatorViewerContextCTATarget, creatorViewerContextCTAType, formattedStringImpl, str3, str4);
            } else {
                AnonymousClass7TF.A1L("text", r11, "CreatorViewerContextCTAImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
