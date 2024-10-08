package X;

import java.io.IOException;

/* renamed from: X.4s1  reason: invalid class name and case insensitive filesystem */
public abstract class C275834s1 {
    public static C275844s2 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("connected_user_id".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("harm_type".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new C275844s2(str2, str);
            }
            ((0c9) r7).A03.A00("harm_type", "PASTISHarmInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
