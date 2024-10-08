package X;

import java.io.IOException;

public final class F6E {
    public static C47343Dvd parseFromJson(16F r7) {
        Integer num;
        String str;
        0qQ.A0B(r7, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("action".equals(A17)) {
                    String A1Q = r7.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "AUTO_CONFIRMED";
                                    break;
                                case 2:
                                    str = "UNKNOWN";
                                    break;
                                default:
                                    str = "SMS_SENT";
                                    break;
                            }
                            if (!str.equalsIgnoreCase(A1Q)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A0C;
                        }
                    }
                    r0.A01 = num;
                } else if ("phone_verification_settings".equals(A17)) {
                    r0.A00 = C48968En6.parseFromJson(r7);
                } else {
                    1XY.A01(r7, r0, A17);
                }
                r7.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
