package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.WSl  reason: case insensitive filesystem */
public final class C19278WSl implements C232262tL {
    public final int A00;
    public final ProductCardSubtitleType A01;
    public final C16675UzB A02;
    public final Vz5 A03;
    public final ULC A04;
    public final C3251571g A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final Set A0A;

    public /* synthetic */ C19278WSl(ProductCardSubtitleType productCardSubtitleType, C16675UzB uzB, Vz5 vz5, ULC ulc, C3251571g r8, String str, String str2, Set set, int i, int i2) {
        String str3;
        List list = null;
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 64) != 0 ? null : str2;
        productCardSubtitleType = (i2 & 128) != 0 ? null : productCardSubtitleType;
        set = (i2 & 256) != 0 ? null : set;
        if ((i2 & 512) != 0) {
            str3 = String.valueOf(i);
        } else {
            str3 = null;
        }
        if ((i2 & 4096) != 0) {
            Uw7 uw7 = Uw7.A02;
            list = 0sr.A1P(new Uw7[]{uw7, uw7});
        }
        C51969G9p.A1N(uzB, 2, str3);
        0qQ.A0B(list, 13);
        this.A05 = r8;
        this.A02 = uzB;
        this.A04 = ulc;
        this.A00 = i;
        this.A03 = vz5;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = productCardSubtitleType;
        this.A0A = set;
        this.A06 = str3;
        this.A09 = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19278WSl) {
            C19278WSl wSl = (C19278WSl) obj;
            if (!0qQ.A0K(this.A05, wSl.A05) || this.A02 != wSl.A02 || !0qQ.A0K(this.A04, wSl.A04) || this.A00 != wSl.A00 || this.A01 != wSl.A01 || !0qQ.A0K(this.A0A, wSl.A0A) || !0qQ.A0K(this.A06, wSl.A06) || !0qQ.A0K(this.A09, wSl.A09)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0T(this.A02.name(), this.A06, '_');
    }

    public final int hashCode() {
        C3251571g r2 = this.A05;
        C16675UzB uzB = this.A02;
        ULC ulc = this.A04;
        Integer valueOf = Integer.valueOf(this.A00);
        ProductCardSubtitleType productCardSubtitleType = this.A01;
        Set set = this.A0A;
        String str = this.A06;
        Boolean A0u = AnonymousClass7TE.A0u();
        return Arrays.hashCode(new Object[]{r2, uzB, ulc, valueOf, null, productCardSubtitleType, set, str, A0u, A0u, this.A09, null, null, null, null});
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
