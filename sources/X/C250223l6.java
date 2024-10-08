package X;

import java.io.IOException;

/* renamed from: X.3l6  reason: invalid class name and case insensitive filesystem */
public abstract class C250223l6 {
    public static C250233l7 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Boolean bool = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("channel_name".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("ig_channel_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("invite_link".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("number_of_members".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("should_skip_channel_suffix_bool".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                }
                r8.A0z();
            }
            return new C250233l7(bool, num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
