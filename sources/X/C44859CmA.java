package X;

import java.io.IOException;

/* renamed from: X.CmA  reason: case insensitive filesystem */
public abstract class C44859CmA {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cuv, java.lang.Object] */
    public static C45353Cuv parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media_or_ad".equals(A17)) {
                    obj.A00 = 1Xj.A00(r3);
                } else if ("follow_hashtag_info".equals(A17)) {
                    obj.A01 = C279594yt.parseFromJson(r3);
                } else if ("brs_severity".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
