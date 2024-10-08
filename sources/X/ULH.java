package X;

import java.util.List;

public final class ULH extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public C15031UKk A06;
    public C16537Uwh A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    public ULH(C16537Uwh uwh) {
        this.A09 = null;
        this.A07 = uwh;
        this.A0B = false;
        this.A0J = false;
        this.A0N = false;
        this.A0M = false;
        this.A0L = false;
        this.A0K = false;
        this.A0C = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A0A = null;
        this.A04 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = 0.0f;
        this.A05 = 0;
        this.A0G = false;
        this.A0H = false;
        this.A0F = false;
        this.A0I = false;
        this.A0D = false;
        this.A08 = null;
        this.A06 = null;
        this.A0E = false;
        this.A0O = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULH) {
                ULH ulh = (ULH) obj;
                if (!(0qQ.A0K(this.A09, ulh.A09) && this.A07 == ulh.A07 && this.A0B == ulh.A0B && this.A0J == ulh.A0J && this.A0N == ulh.A0N && this.A0M == ulh.A0M && this.A0L == ulh.A0L && this.A0K == ulh.A0K && this.A0C == ulh.A0C && Float.compare(this.A01, ulh.A01) == 0 && Float.compare(this.A00, ulh.A00) == 0 && 0qQ.A0K(this.A0A, ulh.A0A) && Float.compare(this.A04, ulh.A04) == 0 && Float.compare(this.A02, ulh.A02) == 0 && Float.compare(this.A03, ulh.A03) == 0 && this.A05 == ulh.A05 && this.A0G == ulh.A0G && this.A0H == ulh.A0H && this.A0F == ulh.A0F && this.A0I == ulh.A0I && this.A0D == ulh.A0D && 0qQ.A0K(this.A08, ulh.A08) && 0qQ.A0K(this.A06, ulh.A06) && this.A0E == ulh.A0E && this.A0O == ulh.A0O)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A07(this.A07, AnonymousClass7TG.A0E(this.A09) * 31)))))));
        int A093 = AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0G, (AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00((AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0C, A092), this.A01), this.A00) + AnonymousClass7TG.A0C(this.A0A)) * 31, this.A04), this.A02), this.A03) + this.A05) * 31))));
        return DbS.A06(this.A0O, AnonymousClass7TF.A09(this.A0E, (((AnonymousClass7TF.A09(this.A0D, A093) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A06)) * 31));
    }

    public ULH() {
        this(C16537Uwh.USER_ADDED);
    }
}
