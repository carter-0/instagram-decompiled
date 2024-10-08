package X;

import java.io.IOException;

/* renamed from: X.Kra  reason: case insensitive filesystem */
public abstract class C63107Kra {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.LFS] */
    public static LFS parseFromJson(16F r7) {
        Integer num;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("enabled".equals(A17)) {
                    obj.A05 = r7.A0d();
                } else if ("is_account_linked".equals(A17)) {
                    obj.A06 = r7.A0d();
                } else if ("account_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r7);
                } else if ("posting_type".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r7);
                } else if ("page_name".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r7);
                } else if ("reels_share_to_facebook".equals(A17)) {
                    obj.A08 = r7.A0d();
                } else if ("reels_destination_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r7);
                } else if ("reels_cross_app_share_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    Integer[] A00 = AnonymousClass05K.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(C63425Kwl.A00(num), A0l)) {
                            break;
                        }
                        i++;
                    }
                    obj.A00 = num;
                } else if ("reels_cross_app_share_fb_validation_check_bypass".equals(A17)) {
                    obj.A07 = r7.A0d();
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
