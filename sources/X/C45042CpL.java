package X;

import java.io.IOException;

/* renamed from: X.CpL  reason: case insensitive filesystem */
public abstract class C45042CpL {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cvl] */
    public static C45405Cvl parseFromJson(16F r7) {
        Integer num;
        String str;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r7);
                } else if ("destination".equals(A17)) {
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
                        if (1 - num.intValue() != 0) {
                            str = "product_description_link";
                        } else {
                            str = "about_this_shop_link";
                        }
                        if (str.equals(A0l)) {
                            break;
                        }
                        i++;
                    }
                    obj.A03 = num;
                } else if ("shop_info".equals(A17)) {
                    obj.A02 = C45086Cq4.parseFromJson(r7);
                } else if ("secondary_link".equals(A17)) {
                    obj.A00 = C45047CpQ.parseFromJson(r7);
                } else if ("description_content".equals(A17)) {
                    obj.A01 = C45084Cq1.parseFromJson(r7);
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
