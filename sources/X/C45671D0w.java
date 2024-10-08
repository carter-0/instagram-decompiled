package X;

import java.io.IOException;

/* renamed from: X.D0w  reason: case insensitive filesystem */
public abstract class C45671D0w {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.77X] */
    public static AnonymousClass77X parseFromJson(16F r4) {
        GV8 gv8;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("clip".equals(A17)) {
                    obj.A01 = 1Xj.A00(r4);
                } else if ("emoji_reaction".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("ad".equals(A17)) {
                    obj.A00 = C41939B7q.parseFromJson(r4);
                } else if ("media_share_type".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            C41938B7p b7p = obj.A00;
            if (b7p != null) {
                b7p.A02();
                if (b7p.A02().size() == 0) {
                    gv8 = null;
                } else {
                    gv8 = b7p.A01();
                }
                obj.A02 = gv8;
                if (gv8 != null) {
                    obj.A01 = gv8.A0K;
                }
            }
            if (obj.A01 != null) {
                return obj;
            }
            0wb.A04("DirectClipShare_media_isNull", "media is expected to be non-null", 1);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass77X r3) {
        r2.A0c();
        if (r3.A01 != null) {
            r2.A0q("clip");
            1Xj r1 = r3.A01;
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r2, r1);
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R("emoji_reaction", str);
        }
        if (r3.A00 != null) {
            r2.A0q("ad");
            C41939B7q.A00(r2, r3.A00);
        }
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0R("media_share_type", str2);
        }
        r2.A0Z();
    }
}
