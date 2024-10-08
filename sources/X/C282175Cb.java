package X;

import java.io.IOException;

/* renamed from: X.5Cb  reason: invalid class name and case insensitive filesystem */
public abstract class C282175Cb {
    public static C282185Cc parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("editing_locked_message".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("is_editing_locked".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                } else if ("max_num_addresses".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("max_num_edits".equals(A0q)) {
                    num2 = Integer.valueOf(r8.A1D());
                } else if ("num_edits".equals(A0q)) {
                    num3 = Integer.valueOf(r8.A1D());
                }
                r8.A0z();
            }
            return new C282185Cc(bool, num, num2, num3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
