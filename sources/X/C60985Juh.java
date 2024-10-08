package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.Juh  reason: case insensitive filesystem */
public final class C60985Juh extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C278114wI A03;
    public final C45366Cv8 A04;
    public final L7F A05;
    public final L5K A06;
    public final String A07;
    public final List A08;
    public final Set A09;
    public final Set A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60985Juh) {
                C60985Juh juh = (C60985Juh) obj;
                if (!(this.A02 == juh.A02 && 0qQ.A0K(this.A08, juh.A08) && this.A01 == juh.A01 && this.A0E == juh.A0E && 0qQ.A0K(this.A07, juh.A07) && this.A0B == juh.A0B && this.A0J == juh.A0J && this.A0G == juh.A0G && this.A0F == juh.A0F && this.A03 == juh.A03 && 0qQ.A0K(this.A09, juh.A09) && 0qQ.A0K(this.A0A, juh.A0A) && this.A00 == juh.A00 && this.A0D == juh.A0D && this.A0C == juh.A0C && 0qQ.A0K(this.A06, juh.A06) && 0qQ.A0K(this.A05, juh.A05) && 0qQ.A0K(this.A04, juh.A04) && this.A0H == juh.A0H && this.A0I == juh.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A02 * 31;
        boolean z = this.A0E;
        int A092 = AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A08, i) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31)));
        int A072 = AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A09(this.A0F, A092) + AnonymousClass7TG.A0C(this.A03)) * 31);
        int A093 = AnonymousClass7TF.A09(this.A0D, (AnonymousClass7TF.A07(this.A0A, A072) + this.A00) * 31);
        return DbS.A06(this.A0I, AnonymousClass7TF.A09(this.A0H, (((((AnonymousClass7TF.A09(this.A0C, A093) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31));
    }

    public C60985Juh(C278114wI r2, C45366Cv8 cv8, L7F l7f, L5K l5k, String str, List list, Set set, Set set2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A02 = i;
        this.A08 = list;
        this.A01 = i2;
        this.A0E = z;
        this.A07 = str;
        this.A0B = z2;
        this.A0J = z3;
        this.A0G = z4;
        this.A0F = z5;
        this.A03 = r2;
        this.A09 = set;
        this.A0A = set2;
        this.A00 = i3;
        this.A0D = z6;
        this.A0C = z7;
        this.A06 = l5k;
        this.A05 = l7f;
        this.A04 = cv8;
        this.A0H = z8;
        this.A0I = z9;
    }
}
