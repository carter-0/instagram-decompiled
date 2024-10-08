package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import java.io.IOException;

/* renamed from: X.Cdu  reason: case insensitive filesystem */
public abstract class C44374Cdu {
    public static BGZ parseFromJson(16F r25) {
        String str;
        16F r2 = r25;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            C42072BGa bGa = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f = null;
            Float f2 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str7 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if (AnonymousClass000.A00(2610).equals(A17)) {
                    bGa = C45631Czh.parseFromJson(r2);
                } else if ("attribution".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (C41845B3m.A1X(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if (C41845B3m.A1Z(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if (C41845B3m.A1S(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if (C41845B3m.A1R(A17)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A1G(A17)) {
                    f2 = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A17(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if (C41845B3m.A1T(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1M(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1N(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1P(A17)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1O(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if (C41845B3m.A1K(A17)) {
                    f3 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A1U(A17)) {
                    f4 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A1a(A17)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1b(A17)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if (C41845B3m.A1I(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if (C41845B3m.A1F(A17)) {
                    f5 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A15(A17)) {
                    f6 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A16(A17)) {
                    f7 = C41846B3n.A0f(r2);
                } else {
                    f8 = C41847B3o.A11(r2, f8, A17);
                }
                r2.A0z();
            }
            return new BGZ(stickerTraySurface, bGa, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
