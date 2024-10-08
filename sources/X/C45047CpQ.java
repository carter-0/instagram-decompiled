package X;

import java.io.IOException;

/* renamed from: X.CpQ  reason: case insensitive filesystem */
public abstract class C45047CpQ {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.CvY] */
    public static C45392CvY parseFromJson(16F r7) {
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
                if ("destination".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    Integer[] A00 = AnonymousClass05K.A00(4);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = C66579MXk.A00(36);
                                    break;
                                case 2:
                                    str = AnonymousClass000.A00(4047);
                                    break;
                                case 3:
                                    str = "";
                                    break;
                                default:
                                    str = "external_link";
                                    break;
                            }
                            if (!str.equals(A0l)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A0N;
                        }
                    }
                    obj.A01 = num;
                } else if ("default_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r7);
                } else if ("cta_text".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r7);
                } else if ("secondary_text".equals(A17)) {
                    obj.A00 = C49152EqJ.parseFromJson(r7);
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
