package X;

import java.io.IOException;

/* renamed from: X.CUx  reason: case insensitive filesystem */
public abstract class C44080CUx {
    public static BDv parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            C257593xe r4 = null;
            String str2 = null;
            String str3 = null;
            BDw bDw = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("app_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("bloks_data".equals(A17)) {
                    r4 = C45662D0m.parseFromJson(r8);
                } else if ("bloks_sticker_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("sticker_data".equals(A17)) {
                    bDw = CV0.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new BDv(bDw, r4, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
