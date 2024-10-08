package X;

import java.util.List;

public final class UKG extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C16559UxB A04;
    public Integer A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKG) {
                UKG ukg = (UKG) obj;
                if (!(this.A04 == ukg.A04 && 0qQ.A0K(this.A06, ukg.A06) && this.A07 == ukg.A07 && this.A08 == ukg.A08 && this.A02 == ukg.A02 && this.A01 == ukg.A01 && this.A03 == ukg.A03 && this.A00 == ukg.A00 && this.A05 == ukg.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = (((((((AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A06, AnonymousClass7TE.A0K(this.A04)))) + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + this.A00) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "PRODUCT_COLLECTION";
                break;
            case 2:
                str = "PROFILE_SHOP";
                break;
            case 3:
                str = "PROFILE_SHOP_RECONSIDERATION";
                break;
            case 4:
                str = "RELATED_PRODUCTS";
                break;
            case 5:
                str = "SAVED_PRODUCTS_COLLECTION";
                break;
            case 6:
                str = "SHOPPING_CART";
                break;
            case 7:
                str = "SHOPPING_HOME_PRODUCT_HSCROLL";
                break;
            case 8:
                str = "TAGGED_PRODUCTS";
                break;
            case 9:
                str = "VISUAL_SEARCH";
                break;
            default:
                str = "FEED_PRODUCT_PIVOTS";
                break;
        }
        return A09 + str.hashCode() + intValue;
    }
}
