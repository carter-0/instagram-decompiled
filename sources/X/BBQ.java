package X;

import com.instagram.api.schemas.ProductPivotsButton;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ShoppingPivotItemType;
import java.util.List;

public final class BBQ extends AnonymousClass0T0 {
    public final ProductPivotsButton A00;
    public final ProductPivotsSourceMediaType A01;
    public final C67241sS A02;
    public final ShoppingPivotItemType A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBQ) {
                BBQ bbq = (BBQ) obj;
                if (!0qQ.A0K(this.A00, bbq.A00) || !0qQ.A0K(this.A04, bbq.A04) || !0qQ.A0K(this.A02, bbq.A02) || !0qQ.A0K(this.A0A, bbq.A0A) || !0qQ.A0K(this.A06, bbq.A06) || this.A03 != bbq.A03 || !0qQ.A0K(this.A0B, bbq.A0B) || !0qQ.A0K(this.A07, bbq.A07) || !0qQ.A0K(this.A08, bbq.A08) || this.A01 != bbq.A01 || !0qQ.A0K(this.A09, bbq.A09) || !0qQ.A0K(this.A05, bbq.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public BBQ(ProductPivotsButton productPivotsButton, ProductPivotsSourceMediaType productPivotsSourceMediaType, C67241sS r3, ShoppingPivotItemType shoppingPivotItemType, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A00 = productPivotsButton;
        this.A04 = num;
        this.A02 = r3;
        this.A0A = list;
        this.A06 = str;
        this.A03 = shoppingPivotItemType;
        this.A0B = list2;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = productPivotsSourceMediaType;
        this.A09 = str4;
        this.A05 = num2;
    }
}
