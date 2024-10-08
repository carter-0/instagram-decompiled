package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import java.io.IOException;

/* renamed from: X.Czm  reason: case insensitive filesystem */
public abstract class C45636Czm {
    public static C42082BGl parseFromJson(16F r25) {
        String str;
        16F r2 = r25;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            BIZ biz = null;
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
                String A0q = r2.A0q();
                if (C41846B3n.A1a(r2, A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (C41845B3m.A1X(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if (C41845B3m.A1Z(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if (C41845B3m.A1S(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if (C273654mx.A00(270).equals(A0q)) {
                    biz = C44856Cm7.parseFromJson(r2);
                } else if (C41845B3m.A1R(A0q)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A1G(A0q)) {
                    f2 = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A17(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if (C41845B3m.A1T(A0q)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1M(A0q)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1N(A0q)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1P(A0q)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1O(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if (C41845B3m.A1K(A0q)) {
                    f3 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A1U(A0q)) {
                    f4 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A1a(A0q)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1b(A0q)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if (C41845B3m.A1I(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if (C41845B3m.A1F(A0q)) {
                    f5 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A15(A0q)) {
                    f6 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A16(A0q)) {
                    f7 = C41846B3n.A0f(r2);
                } else {
                    f8 = C41847B3o.A11(r2, f8, A0q);
                }
                r2.A0z();
            }
            return new C42082BGl(stickerTraySurface, subscriptionStickerDict, biz, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C42082BGl bGl) {
        r3.A0c();
        C41846B3n.A13(r3, bGl.A0G);
        C41846B3n.A16(r3, bGl.A0H);
        C41846B3n.A17(r3, bGl.A0I);
        C41846B3n.A15(r3, bGl.A0J);
        BIZ biz = bGl.A02;
        if (biz != null) {
            r3.A0q(C273654mx.A00(270));
            r3.A0c();
            String str = biz.A00;
            if (str != null) {
                r3.A0R("find_location_text", str);
            }
            String str2 = biz.A01;
            if (str2 != null) {
                r3.A0R("link", str2);
            }
            r3.A0Z();
        }
        C41846B3n.A0w(r3, bGl.A03);
        C41846B3n.A0u(r3, bGl.A04);
        C41846B3n.A0y(r3, bGl.A0K);
        C41846B3n.A0o(r3, bGl.A0B);
        C41846B3n.A0l(r3, bGl.A0C);
        C41846B3n.A0m(r3, bGl.A0D);
        C41846B3n.A0n(r3, bGl.A0E);
        C41846B3n.A12(r3, bGl.A0L);
        C41846B3n.A0v(r3, bGl.A05);
        C41846B3n.A0x(r3, bGl.A06);
        C41846B3n.A0p(r3, bGl.A0F);
        C41846B3n.A0k(r3, bGl.A01);
        C41846B3n.A0j(r3, bGl.A00);
        C41846B3n.A0t(r3, bGl.A07);
        C41846B3n.A0q(r3, bGl.A08);
        C41846B3n.A0r(r3, bGl.A09);
        C41846B3n.A0s(r3, bGl.A0A);
        r3.A0Z();
    }
}
