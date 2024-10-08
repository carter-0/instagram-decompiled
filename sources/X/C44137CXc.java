package X;

import java.io.IOException;

/* renamed from: X.CXc  reason: case insensitive filesystem */
public abstract class C44137CXc {
    public static C42034BEl parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("length".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("offset".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                } else if ("profile_deeplink".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("profile_www_link".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("length", r12, "FbMentionedUserDataImpl");
            } else if (num2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("offset", r12, "FbMentionedUserDataImpl");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("profile_deeplink", r12, "FbMentionedUserDataImpl");
            } else if (str2 != null || !(r12 instanceof 0c9)) {
                return new C42034BEl(num.intValue(), num2.intValue(), str, str2);
            } else {
                AnonymousClass7TF.A1L("profile_www_link", r12, "FbMentionedUserDataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
