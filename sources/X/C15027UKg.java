package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.UKg  reason: case insensitive filesystem */
public final class C15027UKg extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C266444Yx A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15027UKg) {
                C15027UKg uKg = (C15027UKg) obj;
                if (!0qQ.A0K(this.A06, uKg.A06) || !0qQ.A0K(this.A04, uKg.A04) || this.A00 != uKg.A00 || this.A01 != uKg.A01 || !0qQ.A0K(this.A02, uKg.A02) || !0qQ.A0K(this.A03, uKg.A03) || !0qQ.A0K(this.A07, uKg.A07) || this.A05 != uKg.A05 || this.A08 != uKg.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        C266444Yx r1 = this.A02;
        int A072 = AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(r1, ((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
        int intValue = this.A05.intValue();
        if (1 != intValue) {
            str = "PARAGRAPH";
        } else {
            str = "LIST";
        }
        return DbS.A06(this.A08, C51971G9r.A0F(str, intValue, A072));
    }

    public C15027UKg(C266444Yx r1, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, List list, int i, int i2, boolean z) {
        this.A06 = str;
        this.A04 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = imageUrl2;
        this.A07 = list;
        this.A05 = num;
        this.A08 = z;
    }
}
