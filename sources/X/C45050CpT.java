package X;

import java.io.IOException;

/* renamed from: X.CpT  reason: case insensitive filesystem */
public abstract class C45050CpT {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv6, java.lang.Object] */
    public static C45364Cv6 parseFromJson(16F r7) {
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
                if (C41845B3m.A1A(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r7);
                } else if ("alignment".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "center";
                                    break;
                                case 2:
                                    str = "end";
                                    break;
                                default:
                                    str = "start";
                                    break;
                            }
                            if (!str.equals(A0l)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                    }
                    obj.A00 = num;
                } else if ("should_transition_on_variant_switch".equals(A17)) {
                    obj.A02 = r7.A0d();
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
