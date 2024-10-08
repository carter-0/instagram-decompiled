package X;

import java.io.IOException;

/* renamed from: X.CpM  reason: case insensitive filesystem */
public abstract class C45043CpM {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Ct9] */
    public static Ct9 parseFromJson(16F r8) {
        String str;
        Integer num;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                if ("destination".equals(AnonymousClass7TE.A17(r8))) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    0qQ.A0B(str, 0);
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str2 = "influencer_posts";
                                    break;
                                case 2:
                                    str2 = "featured_product_medias";
                                    break;
                                default:
                                    str2 = "related_posts";
                                    break;
                            }
                            if (!str2.equals(str)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                    }
                    obj.A00 = num;
                }
                r8.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
