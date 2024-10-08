package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Cqk  reason: case insensitive filesystem */
public abstract class C45126Cqk {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cvu, java.lang.Object] */
    public static C45414Cvu parseFromJson(16F r6) {
        Integer num;
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            16L A11 = r6.A11();
            16L r3 = 16L.A0D;
            if (A11 != r3) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return obj;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if ("creation_time".equals(A17)) {
                    obj.A00 = r6.A0y();
                } else {
                    HashMap hashMap = null;
                    if (AnonymousClass000.A00(3919).equals(A17)) {
                        obj.A04 = AnonymousClass7TG.A0l(r6);
                    } else if (AnonymousClass000.A00(3909).equals(A17)) {
                        obj.A03 = AnonymousClass7TG.A0l(r6);
                    } else if ("radio_type".equals(A17)) {
                        obj.A02 = AnonymousClass7TG.A0l(r6);
                    } else if (AnonymousClass000.A00(3920).equals(A17)) {
                        String A1Q = r6.A1Q();
                        if (A1Q.equals("MEDIA")) {
                            num = AnonymousClass05K.A00;
                        } else if (A1Q.equals("PRODUCT")) {
                            num = AnonymousClass05K.A01;
                        } else if (A1Q.equals("LOCATION")) {
                            num = AnonymousClass05K.A0C;
                        } else if (A1Q.equals("EFFECT")) {
                            num = AnonymousClass05K.A0N;
                        } else {
                            throw new IllegalArgumentException(A1Q);
                        }
                        obj.A01 = num;
                    } else if ("params".equals(A17)) {
                        if (r6.A11() == r3) {
                            hashMap = AnonymousClass7TE.A1E();
                            while (r6.A1J() != r4) {
                                C41847B3o.A1M(r6, hashMap);
                            }
                        }
                        obj.A05 = hashMap;
                    }
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
