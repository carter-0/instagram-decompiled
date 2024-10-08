package X;

import java.io.IOException;

/* renamed from: X.F5w  reason: case insensitive filesystem */
public final class C49763F5w {
    public static Dw7 parseFromJson(16F r8) {
        Integer num;
        String str;
        Integer num2;
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (AnonymousClass000.A00(1780).equals(A17)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    Integer[] A00 = AnonymousClass05K.A00(9);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num2 = A00[i];
                            if (!0qQ.A0K(C48935EmZ.A00(num2), A1Q)) {
                                i++;
                            }
                        } else {
                            num2 = AnonymousClass05K.A1F;
                        }
                    }
                    r1.A01 = num2;
                } else if ("tos_version".equals(A17)) {
                    String A1Q2 = r8.A1Q();
                    Integer[] A002 = AnonymousClass05K.A00(3);
                    int length2 = A002.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            num = A002[i2];
                            switch (num.intValue()) {
                                case 1:
                                    str = "row";
                                    break;
                                case 2:
                                    str = "unknown";
                                    break;
                                default:
                                    str = "eu";
                                    break;
                            }
                            if (!str.equals(A1Q2)) {
                                i2++;
                            }
                        } else {
                            num = AnonymousClass05K.A0C;
                        }
                    }
                    r1.A02 = num;
                } else if (C66579MXk.A00(40).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r8);
                } else if ("contents".equals(A17)) {
                    r1.A00 = C48931EmV.parseFromJson(r8);
                } else if ("gdpr_s".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r8);
                } else {
                    1XY.A01(r8, r1, A17);
                }
                r8.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
