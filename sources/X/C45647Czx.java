package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Czx  reason: case insensitive filesystem */
public abstract class C45647Czx {
    public static BH9 parseFromJson(16F r25) {
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
            Float f = null;
            Float f2 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str7 = null;
            C42132BIl bIl = null;
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
                } else if (C273654mx.A00(89).equals(A0q)) {
                    bIl = C44935CnV.parseFromJson(r2);
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
            return new BH9(stickerTraySurface, subscriptionStickerDict, bIl, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BH9 bh9) {
        r2.A0c();
        C41846B3n.A13(r2, bh9.A0G);
        C41846B3n.A16(r2, bh9.A0H);
        C41846B3n.A17(r2, bh9.A0I);
        C41846B3n.A15(r2, bh9.A0J);
        C41846B3n.A0w(r2, bh9.A03);
        C41846B3n.A0u(r2, bh9.A04);
        C41846B3n.A0y(r2, bh9.A0K);
        C41846B3n.A0o(r2, bh9.A0B);
        C41846B3n.A0l(r2, bh9.A0C);
        C41846B3n.A0m(r2, bh9.A0D);
        C41846B3n.A0n(r2, bh9.A0E);
        C41846B3n.A12(r2, bh9.A0L);
        C42132BIl bIl = bh9.A02;
        if (bIl != null) {
            r2.A0q(C273654mx.A00(89));
            r2.A0c();
            ProductDetailsProductItemDict productDetailsProductItemDict = bIl.A00;
            if (productDetailsProductItemDict != null) {
                r2.A0q("product");
                C275404q6.A00(r2, productDetailsProductItemDict);
            }
            r2.A0Z();
        }
        C41846B3n.A0v(r2, bh9.A05);
        C41846B3n.A0x(r2, bh9.A06);
        C41846B3n.A0p(r2, bh9.A0F);
        C41846B3n.A0k(r2, bh9.A01);
        C41846B3n.A0j(r2, bh9.A00);
        C41846B3n.A0t(r2, bh9.A07);
        C41846B3n.A0q(r2, bh9.A08);
        C41846B3n.A0r(r2, bh9.A09);
        C41846B3n.A0s(r2, bh9.A0A);
        r2.A0Z();
    }
}
