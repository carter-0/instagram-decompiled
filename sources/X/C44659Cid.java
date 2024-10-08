package X;

import java.io.IOException;

/* renamed from: X.Cid  reason: case insensitive filesystem */
public abstract class C44659Cid {
    public static C45278Cth parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r3 = 16L.A09;
                A00 = C273654mx.A00(3490);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (!"user_igid".equals(A17)) {
                    l = C41847B3o.A14(r8, l, A17, A00);
                } else if (r8.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r8.A1P();
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("user_igid", r8, "ClipWatchedActionLog");
            } else if (l != null || !(r8 instanceof 0c9)) {
                return new C45278Cth(str, l.longValue());
            } else {
                AnonymousClass7TF.A1L(A00, r8, "ClipWatchedActionLog");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
