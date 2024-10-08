package X;

import java.io.IOException;

/* renamed from: X.V8b  reason: case insensitive filesystem */
public abstract class C16846V8b {
    public static C274424oI parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str = null;
            String str2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (C273654mx.A00(594).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(595).equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(596).equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(597).equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(721).equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(782).equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(783).equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r13);
                } else if (C273654mx.A00(872).equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r13);
                } else if ("parent_post_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("parent_post_pk".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new C274424oI(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
