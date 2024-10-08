package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import java.util.List;

/* renamed from: X.Dri  reason: case insensitive filesystem */
public final class C47167Dri extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final ThemeViewModelDelegate A03;
    public final C242243Te A04;
    public final C327857Cl A05;
    public final C254793t3 A06;
    public final C254743sy A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final String A0S;
    public final List A0T;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47167Dri) {
                C47167Dri dri = (C47167Dri) obj;
                if (!(0qQ.A0K(this.A06, dri.A06) && 0qQ.A0K(this.A0C, dri.A0C) && 0qQ.A0K(this.A07, dri.A07) && 0qQ.A0K(this.A0B, dri.A0B) && this.A0P == dri.A0P && 0qQ.A0K(this.A0D, dri.A0D) && 0qQ.A0K(this.A0E, dri.A0E) && 0qQ.A0K(this.A0S, dri.A0S) && 0qQ.A0K(this.A0T, dri.A0T) && this.A0F == dri.A0F && this.A0L == dri.A0L && this.A01 == dri.A01 && 0qQ.A0K(this.A03, dri.A03) && 0qQ.A0K(this.A02, dri.A02) && 0qQ.A0K(this.A0A, dri.A0A) && this.A0O == dri.A0O && this.A0K == dri.A0K && this.A0I == dri.A0I && this.A0H == dri.A0H && this.A0N == dri.A0N && this.A0M == dri.A0M && this.A0Q == dri.A0Q && this.A0R == dri.A0R && 0qQ.A0K(this.A09, dri.A09) && this.A0G == dri.A0G && 0qQ.A0K(this.A08, dri.A08) && 0qQ.A0K(this.A04, dri.A04) && this.A00 == dri.A00 && this.A05 == dri.A05 && this.A0J == dri.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A07(this.A0T, AnonymousClass7TF.A08(this.A0S, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A07(this.A0D, AnonymousClass7TF.A09(this.A0P, ((((((AnonymousClass7TG.A0C(this.A06) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31))))));
        ThemeViewModelDelegate themeViewModelDelegate = this.A03;
        int A093 = AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0O, (((AnonymousClass7TF.A07(themeViewModelDelegate, (AnonymousClass7TF.A09(this.A0L, A092) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31)))))));
        boolean z = this.A0G;
        return DbS.A06(this.A0J, AnonymousClass7TF.A07(this.A05, (((((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A09(this.A0R, A093) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A00) * 31));
    }

    public C47167Dri(ImageUrl imageUrl, ThemeViewModelDelegate themeViewModelDelegate, C242243Te r6, C327857Cl r7, C254793t3 r8, C254743sy r9, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        List list4 = list3;
        List list5 = list2;
        AnonymousClass7TF.A1G(list5, 7, list4);
        0qQ.A0B(r7, 29);
        this.A06 = r8;
        this.A0C = str;
        this.A07 = r9;
        this.A0B = str2;
        this.A0P = z;
        this.A0D = list;
        this.A0E = list5;
        this.A0S = str3;
        this.A0T = list4;
        this.A0F = z2;
        this.A0L = z3;
        this.A01 = i;
        this.A03 = themeViewModelDelegate;
        this.A02 = imageUrl;
        this.A0A = str4;
        this.A0O = z4;
        this.A0K = z5;
        this.A0I = z6;
        this.A0H = z7;
        this.A0N = z8;
        this.A0M = z9;
        this.A0Q = z10;
        this.A0R = z11;
        this.A09 = str5;
        this.A0G = z12;
        this.A08 = str6;
        this.A04 = r6;
        this.A00 = i2;
        this.A05 = r7;
        this.A0J = z13;
    }
}
