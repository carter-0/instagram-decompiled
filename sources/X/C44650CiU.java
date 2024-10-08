package X;

import java.io.IOException;

/* renamed from: X.CiU  reason: case insensitive filesystem */
public abstract class C44650CiU {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cw1, java.lang.Object] */
    public static C45421Cw1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("note_igid".equals(A17)) {
                    obj.A00 = r4.A0y();
                } else if ("sticker_id".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("is_random".equals(A17)) {
                    obj.A06 = r4.A0d();
                } else if (C41845B3m.A1P(A17)) {
                    obj.A07 = r4.A0d();
                } else if (AnonymousClass000.A00(1620).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("note_text".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A01 = 16W.parseFromJson(r4);
                } else if ("gif_url".equals(A17)) {
                    obj.A02 = AnonymousClass53C.parseFromJson(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
