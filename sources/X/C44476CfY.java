package X;

import java.io.IOException;

/* renamed from: X.CfY  reason: case insensitive filesystem */
public abstract class C44476CfY {
    public static C42099BHc parseFromJson(16F r17) {
        16F r1 = r17;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Float f3 = null;
            Float f4 = null;
            C42098BHb bHb = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                if (C41846B3n.A1a(r1, A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if (C41845B3m.A1R(A0q)) {
                    f = AnonymousClass7TF.A0U(r1);
                } else if (C41845B3m.A1G(A0q)) {
                    f2 = AnonymousClass7TF.A0U(r1);
                } else if (C41845B3m.A1T(A0q)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if (C41845B3m.A1M(A0q)) {
                    num2 = AnonymousClass7TF.A0X(r1);
                } else if (C41845B3m.A1N(A0q)) {
                    num3 = AnonymousClass7TF.A0X(r1);
                } else if (C41845B3m.A1P(A0q)) {
                    num4 = AnonymousClass7TF.A0X(r1);
                } else if (C41845B3m.A1K(A0q)) {
                    f3 = AnonymousClass7TF.A0U(r1);
                } else if (C41845B3m.A1U(A0q)) {
                    f4 = AnonymousClass7TF.A0U(r1);
                } else if ("whatsapp_sticker".equals(A0q)) {
                    bHb = C44474CfW.parseFromJson(r1);
                } else if (C41845B3m.A1F(A0q)) {
                    f5 = AnonymousClass7TF.A0U(r1);
                } else if (C41845B3m.A15(A0q)) {
                    f6 = C41846B3n.A0f(r1);
                } else if (C41845B3m.A16(A0q)) {
                    f7 = C41846B3n.A0f(r1);
                } else {
                    f8 = C41847B3o.A11(r1, f8, A0q);
                }
                r1.A0z();
            }
            return new C42099BHc(bHb, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
