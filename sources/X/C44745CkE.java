package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CkE  reason: case insensitive filesystem */
public abstract class C44745CkE {
    public static AnonymousClass5FS parseFromJson(16F r32) {
        String A00;
        String str;
        16F r10 = r32;
        0qQ.A0B(r10, 0);
        try {
            Boolean bool = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool2 = null;
            Long l = null;
            Boolean bool3 = null;
            Integer num = null;
            Long l2 = null;
            String str2 = null;
            BIR bir = null;
            User user = null;
            String str3 = null;
            GuideTypeStr guideTypeStr = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r12 = 16L.A09;
                A00 = C273654mx.A00(287);
                if (A1J == r12) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("can_viewer_reshare".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if (C41845B3m.A1Q(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if ("is_draft".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r10);
                } else if ("mixed_cover_media".equals(A17)) {
                    bir = D1H.parseFromJson(r10);
                } else if ("num_items".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("owner".equals(A17)) {
                    user = C41845B3m.A0a(r10, false);
                } else if (C41845B3m.A1E(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    guideTypeStr = (GuideTypeStr) GuideTypeStr.A01.get(str);
                    if (guideTypeStr == null) {
                        guideTypeStr = GuideTypeStr.UNRECOGNIZED;
                    }
                } else {
                    l2 = C41847B3o.A14(r10, l2, A17, "updated_timestamp");
                }
                r10.A0z();
            }
            if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_viewer_reshare", r10, "GuideSummary");
            } else if (bool2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "GuideSummary");
            } else if (l == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10, "GuideSummary");
            } else if (bool3 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_draft", r10, "GuideSummary");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_items", r10, "GuideSummary");
            } else if (user == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("owner", r10, "GuideSummary");
            } else if (guideTypeStr == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r10, "GuideSummary");
            } else if (l2 != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass5FS(guideTypeStr, bir, user, str2, str3, num.intValue(), l.longValue(), l2.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L("updated_timestamp", r10, "GuideSummary");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
