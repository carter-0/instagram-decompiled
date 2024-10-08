package X;

import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.JuT  reason: case insensitive filesystem */
public final class C60971JuT extends AnonymousClass0T0 {
    public final C60896JtG A00;
    public final ShoppingReconFeedEndpoint A01;
    public final Integer A02;
    public final String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C13999To1(this, 33));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C13999To1(this, 34));
    public final C62320sa A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final 0sP A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60971JuT) {
                C60971JuT juT = (C60971JuT) obj;
                if (!0qQ.A0K(this.A01, juT.A01) || !0qQ.A0K(this.A03, juT.A03) || this.A0A != juT.A0A || !0qQ.A0K(this.A00, juT.A00) || this.A02 != juT.A02 || !0qQ.A0K(this.A08, juT.A08) || !0qQ.A0K(this.A09, juT.A09) || !0qQ.A0K(this.A07, juT.A07) || !0qQ.A0K(this.A06, juT.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A03)) * 31));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "AnyWithFallbackDiskCache";
                break;
            case 2:
                str = "NetworkOnly";
                break;
            default:
                str = "AnyWithPrimaryDiskCache";
                break;
        }
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A08, C51971G9r.A0F(str, intValue, A072)))));
    }

    public C60971JuT(C60896JtG jtG, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, String str, C62320sa r7, C62320sa r8, C62320sa r9, 0sP r10, boolean z) {
        this.A01 = shoppingReconFeedEndpoint;
        this.A03 = str;
        this.A0A = z;
        this.A00 = jtG;
        this.A02 = num;
        this.A08 = r7;
        this.A09 = r10;
        this.A07 = r8;
        this.A06 = r9;
    }
}
