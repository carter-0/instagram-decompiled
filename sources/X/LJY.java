package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class LJY {
    public static AnonymousClass8VT parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            AnonymousClass8VT r0 = new AnonymousClass8VT();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("existing_to_reel_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l, 0);
                    r0.A00 = A0l;
                } else if ("source".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l2, 0);
                    r0.A02 = A0l2;
                } else if ("new_reel_title".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r6);
                } else if ("cover_crop_rect".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            arrayList.add(new Float(r6.A0U()));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A03 = arrayList;
                } else if ("is_adding_to_highlight".equals(A17)) {
                    r0.A04 = r6.A0d();
                }
                r6.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass8VT r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("existing_to_reel_id", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("source", str2);
        }
        String str3 = r3.A01;
        if (str3 != null) {
            r2.A0R("new_reel_title", str3);
        }
        if (r3.A03 != null) {
            16P.A03(r2, "cover_crop_rect");
            for (Number number : r3.A03) {
                if (number != null) {
                    r2.A0f(number.floatValue());
                }
            }
            r2.A0Y();
        }
        r2.A0S("is_adding_to_highlight", r3.A04);
        r2.A0Z();
    }
}
