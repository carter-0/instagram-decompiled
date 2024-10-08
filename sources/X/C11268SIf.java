package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.SIf  reason: case insensitive filesystem */
public class C11268SIf {
    @Deprecated
    public static final C11268SIf A0A;
    public static final C11268SIf A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C10976S3k A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableMap A08;
    public final ImmutableSet A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11268SIf sIf = (C11268SIf) obj;
            if (this.A02 != sIf.A02 || this.A01 != sIf.A01 || !this.A07.equals(sIf.A07) || !this.A04.equals(sIf.A04) || !this.A05.equals(sIf.A05) || !this.A03.equals(sIf.A03) || !this.A06.equals(sIf.A06) || this.A00 != sIf.A00 || !this.A08.equals(sIf.A08) || !this.A09.equals(sIf.A09)) {
                return false;
            }
        }
        return true;
    }

    static {
        C11268SIf sIf = new C11268SIf(new S50());
        A0B = sIf;
        A0A = sIf;
    }

    public C11268SIf(S50 s50) {
        this.A02 = s50.A02;
        this.A01 = s50.A01;
        this.A07 = s50.A07;
        this.A04 = s50.A04;
        this.A05 = s50.A05;
        this.A03 = s50.A03;
        this.A06 = s50.A06;
        this.A00 = s50.A00;
        this.A08 = ImmutableMap.copyOf(s50.A08);
        this.A09 = ImmutableSet.A03(s50.A09);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.A09, AnonymousClass7TF.A07(this.A08, G9w.A02(AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A05, Pxi.A03(AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A07, (((1871669920 + this.A02) * 31) + this.A01) * 31) * 31) * 31, Integer.MAX_VALUE)))), this.A00) * 31 * 31 * 31));
    }
}
