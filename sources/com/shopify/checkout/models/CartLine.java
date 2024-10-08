package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20530WtB;
import X.C255463uA;
import X.C66579MXk;
import X.Pxd;
import X.VJ6;
import X.Wt3;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class CartLine {
    public static final C255463uA[] A07 = {null, null, null, null, null, null, new AnonymousClass409(C20530WtB.A00)};
    public static final Companion Companion = new Object();
    public final int A00;
    public final CartLineImage A01;
    public final Money A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final class Companion {
        public final C255463uA serializer() {
            return Wt3.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartLine) {
                CartLine cartLine = (CartLine) obj;
                if (!0qQ.A0K(this.A03, cartLine.A03) || !0qQ.A0K(this.A04, cartLine.A04) || !0qQ.A0K(this.A01, cartLine.A01) || this.A00 != cartLine.A00 || !0qQ.A0K(this.A05, cartLine.A05) || !0qQ.A0K(this.A02, cartLine.A02) || !0qQ.A0K(this.A06, cartLine.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CartLine(CartLineImage cartLineImage, Money money, String str, String str2, String str3, List list, int i, int i2) {
        if (56 != (i & 56)) {
            VJ6.A00(Wt3.A01, i, 56);
            throw AnonymousClass00P.createAndThrow();
        }
        if ((i & 1) != 0) {
            this.A03 = str;
        }
        if ((i & 2) != 0) {
            this.A04 = str2;
        }
        if ((i & 4) != 0) {
            this.A01 = cartLineImage;
        }
        this.A00 = i2;
        this.A05 = str3;
        this.A02 = money;
        if ((i & 64) != 0) {
            this.A06 = list;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A05, ((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31)) + AnonymousClass7TE.A0L(this.A06);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartLine(merchandiseId=");
        sb.append(this.A03);
        sb.append(Pxd.A00(48));
        sb.append(this.A04);
        sb.append(", image=");
        sb.append(this.A01);
        sb.append(", quantity=");
        sb.append(this.A00);
        sb.append(C66579MXk.A00(192));
        sb.append(this.A05);
        sb.append(", price=");
        sb.append(this.A02);
        sb.append(", discounts=");
        return AnonymousClass7TG.A0n(this.A06, sb);
    }
}
