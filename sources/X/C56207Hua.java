package X;

import java.io.IOException;

/* renamed from: X.Hua  reason: case insensitive filesystem */
public final class C56207Hua {
    public static C54046GyV parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("ad_id".equals(A17)) {
                    r5.A03 = AnonymousClass7TF.A0Z(r6);
                } else if ("content".equals(A17)) {
                    r5.A00 = HTD.parseFromJson(r6);
                } else if (AnonymousClass000.A00(163).equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0S(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            Long l = r5.A03;
            0qQ.A0A(l);
            long longValue = l.longValue();
            C53278GlQ glQ = r5.A00;
            Boolean bool = r5.A02;
            0qQ.A0A(bool);
            r5.A01 = new C53263GlB(glQ, longValue, bool.booleanValue());
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
