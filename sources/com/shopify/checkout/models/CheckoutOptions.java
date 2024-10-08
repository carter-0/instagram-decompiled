package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20525Wt6;
import X.C255463uA;
import X.C258643zP;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class CheckoutOptions {
    public static final C255463uA[] A04 = {null, null, null, C258643zP.A00("com.shopify.checkout.models.ThemeOptions", ThemeOptions.values())};
    public static final Companion Companion = new Object();
    public final Authentication A00;
    public final Defaults A01;
    public final ThemeOptions A02;
    public final boolean A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20525Wt6.A00;
        }
    }

    public CheckoutOptions(Authentication authentication, Defaults defaults, ThemeOptions themeOptions) {
        this.A01 = defaults;
        this.A00 = authentication;
        this.A03 = false;
        this.A02 = themeOptions;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutOptions) {
                CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
                if (!0qQ.A0K(this.A01, checkoutOptions.A01) || !0qQ.A0K(this.A00, checkoutOptions.A00) || this.A03 != checkoutOptions.A03 || this.A02 != checkoutOptions.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A01) * 31)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutOptions(defaults=");
        sb.append(this.A01);
        sb.append(", auth=");
        sb.append(this.A00);
        sb.append(", shouldInjectJS=");
        sb.append(this.A03);
        sb.append(", theme=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }

    public /* synthetic */ CheckoutOptions(Authentication authentication, Defaults defaults, ThemeOptions themeOptions, int i, boolean z) {
        if (2 != (i & 2)) {
            VJ6.A00(C20525Wt6.A01, i, 2);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = (i & 1) == 0 ? null : defaults;
        this.A00 = authentication;
        if ((i & 4) == 0) {
            this.A03 = false;
        } else {
            this.A03 = z;
        }
        if ((i & 8) == 0) {
            this.A02 = ThemeOptions.LIGHT;
        } else {
            this.A02 = themeOptions;
        }
    }
}
