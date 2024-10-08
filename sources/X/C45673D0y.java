package X;

import java.io.IOException;

/* renamed from: X.D0y  reason: case insensitive filesystem */
public abstract class C45673D0y {
    public static AnonymousClass9JI parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            1Xj r6 = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("media".equals(A17)) {
                    r6 = 1Xj.A0h.A0C(r11, true, true);
                } else if (C41845B3m.A1A(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("post_share_source".equals(A17)) {
                    String A1P = r11.A1P();
                    Integer[] A00 = AnonymousClass05K.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(C44734Ck2.A00(num), A1P)) {
                            break;
                        }
                        i++;
                    }
                } else if ("carousel_share_child_media_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("media_share_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (r6 != null || !(r11 instanceof 0c9)) {
                return new AnonymousClass9JI(r6, num, str, str2, str3);
            }
            AnonymousClass7TF.A1L("media", r11, "DirectMediaShare");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(AnonymousClass9JI r2, 17Z r3) {
        r3.A0c();
        1Xj r1 = (1Xj) r2.A00;
        if (r1 != null) {
            r3.A0q("media");
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r3, r1);
        }
        C41846B3n.A0z(r3, r2.A04);
        Integer num = (Integer) r2.A01;
        if (num != null) {
            r3.A0R("post_share_source", C44734Ck2.A00(num));
        }
        String str = r2.A02;
        if (str != null) {
            r3.A0R("carousel_share_child_media_id", str);
        }
        String str2 = r2.A03;
        if (str2 != null) {
            r3.A0R("media_share_type", str2);
        }
        r3.A0Z();
    }
}
