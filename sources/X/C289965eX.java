package X;

import java.io.IOException;

/* renamed from: X.5eX  reason: invalid class name and case insensitive filesystem */
public abstract class C289965eX {
    public static C376619Ir parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("limit".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("control_title".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("limit", "NFTruncationConfig");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C376619Ir(num.intValue(), str);
            } else {
                ((0c9) r8).A03.A00("control_title", "NFTruncationConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
