package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Mb9  reason: case insensitive filesystem */
public final class C66702Mb9 extends AnonymousClass0T0 implements C232262tL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C61081JwJ A07;
    public final C74541Pwa A08;
    public final C66754Mbz A09;
    public final C66776McM A0A;
    public final C66694Mb1 A0B;
    public final C69600Noi A0C;
    public final C66693Mb0 A0D;
    public final C254923tH A0E;
    public final N5L A0F;
    public final DcN A0G;
    public final DirectShareTarget A0H;
    public final DirectThreadKey A0I;
    public final C254743sy A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66702Mb9) {
                C66702Mb9 mb9 = (C66702Mb9) obj;
                if (!(0qQ.A0K(this.A0M, mb9.A0M) && 0qQ.A0K(this.A0N, mb9.A0N) && 0qQ.A0K(this.A0O, mb9.A0O) && this.A0j == mb9.A0j && this.A0e == mb9.A0e && this.A0k == mb9.A0k && 0qQ.A0K(this.A0I, mb9.A0I) && 0qQ.A0K(this.A0J, mb9.A0J) && 0qQ.A0K(this.A0H, mb9.A0H) && this.A0E == mb9.A0E && this.A01 == mb9.A01 && this.A02 == mb9.A02 && this.A0n == mb9.A0n && 0qQ.A0K(this.A0G, mb9.A0G) && 0qQ.A0K(this.A0F, mb9.A0F) && Float.compare(this.A00, mb9.A00) == 0 && this.A0l == mb9.A0l && this.A0m == mb9.A0m && 0qQ.A0K(this.A0B, mb9.A0B) && 0qQ.A0K(this.A0A, mb9.A0A) && 0qQ.A0K(this.A0D, mb9.A0D) && 0qQ.A0K(this.A0C, mb9.A0C) && 0qQ.A0K(this.A07, mb9.A07) && 0qQ.A0K(this.A09, mb9.A09) && 0qQ.A0K(this.A0R, mb9.A0R) && this.A03 == mb9.A03 && this.A0c == mb9.A0c && 0qQ.A0K(this.A0L, mb9.A0L) && this.A0b == mb9.A0b && this.A05 == mb9.A05 && 0qQ.A0K(this.A0S, mb9.A0S) && this.A0h == mb9.A0h && this.A06 == mb9.A06 && 0qQ.A0K(this.A08, mb9.A08) && 0qQ.A0K(this.A0Q, mb9.A0Q) && 0qQ.A0K(this.A0K, mb9.A0K) && this.A0f == mb9.A0f && this.A0g == mb9.A0g && this.A0Y == mb9.A0Y && this.A0a == mb9.A0a && this.A0Z == mb9.A0Z && this.A0U == mb9.A0U && this.A0X == mb9.A0X && this.A0V == mb9.A0V && this.A04 == mb9.A04 && this.A0T == mb9.A0T && 0qQ.A0K(this.A0P, mb9.A0P) && this.A0W == mb9.A0W && this.A0d == mb9.A0d && this.A0i == mb9.A0i)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        DirectShareTarget directShareTarget = this.A0H;
        String A082 = directShareTarget.A08();
        if (A082 != null) {
            return A082;
        }
        String A092 = directShareTarget.A09();
        0qQ.A07(A092);
        return A092;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0H, AnonymousClass7TF.A07(this.A0J, AnonymousClass7TF.A07(this.A0I, AnonymousClass7TF.A09(this.A0k, AnonymousClass7TF.A09(this.A0e, AnonymousClass7TF.A09(this.A0j, (((AnonymousClass7TE.A0O(this.A0M) + AnonymousClass7TG.A0E(this.A0N)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31))))));
        int A092 = AnonymousClass7TF.A09(this.A0l, AnonymousClass7TF.A00((((AnonymousClass7TF.A09(this.A0n, (((AnonymousClass7TF.A07(this.A0E, A072) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31, this.A00));
        int A073 = AnonymousClass7TF.A07(this.A0A, (AnonymousClass7TF.A09(this.A0m, A092) + AnonymousClass7TG.A0C(this.A0B)) * 31);
        int A074 = AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(this.A0D, A073) + AnonymousClass7TG.A0C(this.A0C)) * 31));
        int A093 = AnonymousClass7TF.A09(this.A0h, AnonymousClass7TF.A07(this.A0S, AnonymousClass7TF.A01(this.A05, AnonymousClass7TF.A09(this.A0b, AnonymousClass7TF.A08(this.A0L, AnonymousClass7TF.A09(this.A0c, (AnonymousClass7TF.A07(this.A0R, A074) + this.A03) * 31))))));
        int A094 = AnonymousClass7TF.A09(this.A0X, AnonymousClass7TF.A09(this.A0U, AnonymousClass7TF.A09(this.A0Z, AnonymousClass7TF.A09(this.A0a, AnonymousClass7TF.A09(this.A0Y, AnonymousClass7TF.A09(this.A0g, AnonymousClass7TF.A09(this.A0f, (((((AnonymousClass7TF.A01(this.A06, A093) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0Q)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31)))))));
        boolean z = this.A0T;
        return DbS.A06(this.A0i, AnonymousClass7TF.A09(this.A0d, AnonymousClass7TF.A09(this.A0W, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A09(this.A0V, A094) + this.A04) * 31) + C41845B3m.A00(this.A0P)) * 31)));
    }

    public C66702Mb9(C61081JwJ jwJ, C74541Pwa pwa, C66754Mbz mbz, C66776McM mcM, C66694Mb1 mb1, C69600Noi noi, C66693Mb0 mb0, C254923tH r12, N5L n5l, DcN dcN, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, C254743sy r17, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, float f, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        List list4 = list;
        0qQ.A0B(list4, 25);
        String str7 = str4;
        0qQ.A0B(str7, 28);
        List list5 = list2;
        0qQ.A0B(list5, 31);
        this.A0M = str;
        this.A0N = str2;
        this.A0O = str3;
        this.A0j = z;
        this.A0e = z2;
        this.A0k = z3;
        this.A0I = directThreadKey;
        this.A0J = r17;
        this.A0H = directShareTarget;
        this.A0E = r12;
        this.A01 = i;
        this.A02 = i2;
        this.A0n = z4;
        this.A0G = dcN;
        this.A0F = n5l;
        this.A00 = f;
        this.A0l = z5;
        this.A0m = z6;
        this.A0B = mb1;
        this.A0A = mcM;
        this.A0D = mb0;
        this.A0C = noi;
        this.A07 = jwJ;
        this.A09 = mbz;
        this.A0R = list4;
        this.A03 = i3;
        this.A0c = z7;
        this.A0L = str7;
        this.A0b = z8;
        this.A05 = j;
        this.A0S = list5;
        this.A0h = z9;
        this.A06 = j2;
        this.A08 = pwa;
        this.A0Q = list3;
        this.A0K = str5;
        this.A0f = z10;
        this.A0g = z11;
        this.A0Y = z12;
        this.A0a = z13;
        this.A0Z = z14;
        this.A0U = z15;
        this.A0X = z16;
        this.A0V = z17;
        this.A04 = i4;
        this.A0T = z18;
        this.A0P = str6;
        this.A0W = z19;
        this.A0d = z20;
        this.A0i = z21;
    }
}
