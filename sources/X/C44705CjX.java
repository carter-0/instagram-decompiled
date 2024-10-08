package X;

import java.io.IOException;

/* renamed from: X.CjX  reason: case insensitive filesystem */
public abstract class C44705CjX {
    public static C66221kr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66221kr r1 = new C66221kr();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("fundraiser_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A02 = A0l;
                } else if ("fundraiser_name".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A03 = A0l2;
                } else if ("fundraiser_attribution".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A00 = A0l3;
                } else if ("details".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(1235).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
