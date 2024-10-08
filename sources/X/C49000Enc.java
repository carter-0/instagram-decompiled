package X;

import java.io.IOException;

/* renamed from: X.Enc  reason: case insensitive filesystem */
public abstract class C49000Enc {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.EbO, java.lang.Object] */
    public static C48243EbO parseFromJson(16F r12) {
        String A00;
        String A002;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(565);
                A002 = AnonymousClass000.A00(784);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if ("is_pending_review".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if (A002.equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r12);
                } else if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("disclaimer_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (bool == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_pending_review", r12, "UserForEditing.ProfileEditParam");
            } else if (bool2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r12, "UserForEditing.ProfileEditParam");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "UserForEditing.ProfileEditParam");
            } else if (str2 != null || !(r12 instanceof 0c9)) {
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                ? obj = new Object();
                obj.A02 = booleanValue;
                obj.A03 = booleanValue2;
                obj.A00 = str;
                obj.A01 = str2;
                return obj;
            } else {
                AnonymousClass7TF.A1L("disclaimer_text", r12, "UserForEditing.ProfileEditParam");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
