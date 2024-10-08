package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.2vo  reason: invalid class name and case insensitive filesystem */
public final class C233492vo extends AnonymousClass0T0 implements C233502vp {
    public final C67241sS A00;
    public final Boolean A01;
    public final Float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final List A0H;

    public final C233492vo FGd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C233492vo) {
                C233492vo r5 = (C233492vo) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A03;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A04;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A05;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.A0H;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.A06;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A07;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num6 = this.A08;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.A09;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.A0A;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.A0B;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.A0C;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        C67241sS r0 = this.A00;
        int hashCode13 = (hashCode12 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Integer num11 = this.A0D;
        int hashCode14 = (hashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.A0E;
        int hashCode15 = (hashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.A0F;
        int hashCode16 = (hashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.A0G;
        int hashCode17 = (hashCode16 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Float f = this.A02;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode17 + i;
    }

    public final Integer AmE() {
        return this.A03;
    }

    public final Integer Aq8() {
        return this.A04;
    }

    public final Integer Aq9() {
        return this.A05;
    }

    public final List AyQ() {
        return this.A0H;
    }

    public final Integer BDP() {
        return this.A06;
    }

    public final Integer BDQ() {
        return this.A07;
    }

    public final Integer BPI() {
        return this.A08;
    }

    public final Integer BT4() {
        return this.A09;
    }

    public final Integer BT5() {
        return this.A0A;
    }

    public final Integer BT8() {
        return this.A0B;
    }

    public final Integer Bde() {
        return this.A0C;
    }

    public final C67241sS BiM() {
        return this.A00;
    }

    public final Integer Bka() {
        return this.A0D;
    }

    public final Integer Bkb() {
        return this.A0E;
    }

    public final Integer Bs2() {
        return this.A0F;
    }

    public final Integer C4M() {
        return this.A0G;
    }

    public final Float C7J() {
        return this.A02;
    }

    public final Boolean CWw() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientGapRulesClientDict", C45099CqH.A00(this));
    }

    public C233492vo(C67241sS r2, Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, List list) {
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A0H = list;
        this.A06 = num4;
        this.A07 = num5;
        this.A01 = bool;
        this.A08 = num6;
        this.A09 = num7;
        this.A0A = num8;
        this.A0B = num9;
        this.A0C = num10;
        this.A00 = r2;
        this.A0D = num11;
        this.A0E = num12;
        this.A0F = num13;
        this.A0G = num14;
        this.A02 = f;
    }
}
