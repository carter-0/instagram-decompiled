package X;

import java.io.IOException;

/* renamed from: X.5eY  reason: invalid class name and case insensitive filesystem */
public abstract class C289975eY {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5eZ, java.lang.Object] */
    public static C289985eZ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if (!"comments".equals(A0q) && !"likes".equals(A0q) && !"usertags".equals(A0q) && !"relationships".equals(A0q) && !"requests".equals(A0q) && !"photos_of_you".equals(A0q) && !"campaign_notifications".equals(A0q) && !"story_mentions".equals(A0q)) {
                    if ("double_toasting".equals(A0q)) {
                        r3.A0d();
                    } else if (!"shopping_notification".equals(A0q) && !"tab_count".equals(A0q)) {
                    }
                    r3.A0z();
                }
                r3.A1D();
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
