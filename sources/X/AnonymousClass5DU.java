package X;

import java.io.IOException;

/* renamed from: X.5DU  reason: invalid class name */
public abstract class AnonymousClass5DU {
    public static AnonymousClass5DV parseFromJson(16F r10) {
        String A01;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r7 = 16L.A09;
                A01 = Dbk.A01(22, 8, 111);
                if (A1J == r7) {
                    break;
                }
                String A0q = r10.A0q();
                r10.A1J();
                if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("profile_pic_url".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (A01.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (bool == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("is_verified", "CutoutStickerUserImpl");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass5DV(bool.booleanValue(), str2, str);
            } else {
                ((0c9) r10).A03.A00(A01, "CutoutStickerUserImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, AnonymousClass5DV r5) {
        r4.A0c();
        r4.A0S("is_verified", r5.A02);
        String str = r5.A00;
        if (str != null) {
            r4.A0R("profile_pic_url", str);
        }
        String str2 = r5.A01;
        if (str2 != null) {
            r4.A0R(Dbk.A01(22, 8, 111), str2);
        }
        r4.A0Z();
    }
}
