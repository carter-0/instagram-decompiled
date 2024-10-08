package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

public final class GZG extends AnonymousClass0T0 {
    public String A00;
    public String A01;
    public final int A02;
    public final Double A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final C62320sa A0A;
    public final C62320sa A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final long A0F;
    public final Integer A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GZG) {
                GZG gzg = (GZG) obj;
                if (this.A0G != gzg.A0G || !0qQ.A0K(this.A01, gzg.A01) || this.A0E != gzg.A0E || !0qQ.A0K(this.A07, gzg.A07) || this.A0F != gzg.A0F || !0qQ.A0K(this.A00, gzg.A00) || !0qQ.A0K(this.A04, gzg.A04) || !0qQ.A0K(this.A09, gzg.A09) || !0qQ.A0K(this.A0B, gzg.A0B) || !0qQ.A0K(this.A0A, gzg.A0A) || !0qQ.A0K(this.A08, gzg.A08) || this.A02 != gzg.A02 || this.A0D != gzg.A0D || this.A0C != gzg.A0C || !0qQ.A0K(this.A03, gzg.A03) || !0qQ.A0K(this.A05, gzg.A05) || !0qQ.A0K(this.A06, gzg.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A0G.intValue();
        switch (intValue) {
            case 1:
                str = "EMBEDDED_CTA";
                break;
            case 2:
                str = "ATTACHED_MODULE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        int A082 = AnonymousClass7TF.A08(this.A01, C51968G9o.A0F(str, intValue));
        long j = this.A0F;
        return ((((AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, ((((((((((((((C51972G9s.A07(j, (AnonymousClass7TF.A09(this.A0E, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + this.A02) * 31)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public GZG(Double d, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, C62320sa r12, C62320sa r13, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A0G = num;
        this.A01 = str;
        this.A0E = z;
        this.A07 = str2;
        this.A0F = j;
        this.A00 = str3;
        this.A04 = num2;
        this.A09 = list;
        this.A0B = r12;
        this.A0A = r13;
        this.A08 = str4;
        this.A02 = i;
        this.A0D = z2;
        this.A0C = z3;
        this.A03 = d;
        this.A05 = num3;
        this.A06 = num4;
    }
}
