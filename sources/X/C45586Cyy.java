package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cyy  reason: case insensitive filesystem */
public final class C45586Cyy {
    public static C43814CEg parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("anonymous_user_count".equals(A17)) {
                    r2.A03 = AnonymousClass7TF.A0X(r11);
                } else {
                    ArrayList arrayList = null;
                    if ("disclaimer_text".equals(A17)) {
                        r2.A07 = AnonymousClass7TG.A0l(r11);
                    } else if ("media_info".equals(A17)) {
                        r2.A02 = 1Xj.A00(r11);
                    } else if ("post_impression_count".equals(A17)) {
                        r2.A04 = AnonymousClass7TF.A0X(r11);
                    } else if ("special_empty_state".equals(A17)) {
                        r2.A00 = CYC.parseFromJson(r11);
                    } else if ("th_like_count".equals(A17)) {
                        r2.A05 = AnonymousClass7TF.A0X(r11);
                    } else if ("user_count".equals(A17)) {
                        r2.A06 = AnonymousClass7TF.A0X(r11);
                    } else if ("users".equals(A17)) {
                        if (r11.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r11.A1J() != 16L.A08) {
                                C41846B3n.A1E(r11, arrayList);
                            }
                        }
                        r2.A08 = arrayList;
                    } else {
                        1XY.A01(r11, r2, A17);
                    }
                }
                r11.A0z();
            }
            Integer num = r2.A03;
            String str = r2.A07;
            r2.A01 = new N5F(r2.A00, r2.A02, num, r2.A04, r2.A05, r2.A06, str, r2.A08);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
