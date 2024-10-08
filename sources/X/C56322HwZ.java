package X;

import java.io.IOException;

/* renamed from: X.HwZ  reason: case insensitive filesystem */
public final class C56322HwZ {
    public static C54070Gyt parseFromJson(16F r8) {
        HMR hmr;
        Integer num;
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            C54070Gyt gyt = new C54070Gyt();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("is_offensive".equals(A17)) {
                    gyt.A04 = r8.A0d();
                } else if ("bully_classifier".equals(A17) || "hate_classifier".equals(A17) || "sexual_classifier".equals(A17) || "spam_classifier".equals(A17)) {
                    r8.A0U();
                } else if (AnonymousClass000.A00(3603).equals(A17)) {
                    gyt.A00 = r8.A0y();
                } else if (C66579MXk.A00(173).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    0qQ.A0B(str2, 0);
                    gyt.A03 = str2;
                } else if ("tiered_level".equals(A17)) {
                    String A1Q = r8.A1Q();
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
                            str = "LEVEL_1";
                        } else {
                            str = "LEVEL_2";
                        }
                        if (str.equals(A1Q)) {
                            break;
                        }
                        i++;
                    }
                    gyt.A02 = num;
                } else if (AnonymousClass000.A00(393).equals(A17)) {
                    String A1Q2 = r8.A1Q();
                    HMR[] values = HMR.values();
                    int length2 = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            hmr = null;
                            break;
                        }
                        hmr = values[i2];
                        if (0qQ.A0K(hmr.A00, A1Q2)) {
                            break;
                        }
                        i2++;
                    }
                    gyt.A01 = hmr;
                } else {
                    1XY.A01(r8, gyt, A17);
                }
                r8.A0z();
            }
            return gyt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
