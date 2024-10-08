package X;

import java.io.IOException;

/* renamed from: X.8rt  reason: invalid class name and case insensitive filesystem */
public final class C367988rt {
    public static C367978rs parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                String str = null;
                if ("avatar_revision_id".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    r2.A03 = str;
                } else if ("avatar_version_info".equals(A0q)) {
                    r2.A00 = C368308sP.parseFromJson(r8);
                } else if ("config_hash".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    r2.A04 = str;
                } else if ("requested_sticker_refresh".equals(A0q)) {
                    r2.A02 = Boolean.valueOf(r8.A0d());
                } else if ("sticker_pack_id".equals(A0q)) {
                    if (r8.A11() != 16L.A0G) {
                        str = r8.A1P();
                    }
                    r2.A05 = str;
                } else {
                    1XY.A01(r8, r2, A0q);
                }
                r8.A0z();
            }
            String str2 = r2.A03;
            C368318sQ r4 = r2.A00;
            0qQ.A0A(r4);
            String str3 = r2.A04;
            Boolean bool = r2.A02;
            0qQ.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            String str4 = r2.A05;
            0qQ.A0A(str4);
            r2.A01 = new C368328sR(r4, str2, str3, str4, booleanValue);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
