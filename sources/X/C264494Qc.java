package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Qc  reason: invalid class name and case insensitive filesystem */
public class C264494Qc {
    @Deprecated
    public static final C264494Qc A0R;
    public static final C264494Qc A0S;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ImmutableMap A0G;
    public final ImmutableSet A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public C264494Qc(HashMap hashMap, HashSet hashSet, List list, List list2, List list3, List list4, List list5) {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0A = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = list5;
        this.A0D = 0;
        this.A0L = list4;
        this.A0I = list;
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = list2;
        this.A0K = list3;
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = ImmutableMap.copyOf(hashMap);
        this.A0H = ImmutableSet.A03(hashSet);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C264494Qc r5 = (C264494Qc) obj;
            if (!(this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A0A == r5.A0A && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A07 == r5.A07 && this.A0Q == r5.A0Q && this.A0F == r5.A0F && this.A0E == r5.A0E && this.A0M.equals(r5.A0M) && this.A0D == r5.A0D && this.A0L.equals(r5.A0L) && this.A0I.equals(r5.A0I) && this.A0B == r5.A0B && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A0J.equals(r5.A0J) && this.A0K.equals(r5.A0K) && this.A0C == r5.A0C && this.A00 == r5.A00 && this.A0P == r5.A0P && this.A0O == r5.A0O && this.A0N == r5.A0N && this.A0G.equals(r5.A0G) && this.A0H.equals(r5.A0H))) {
                return false;
            }
        }
        return true;
    }

    static {
        List list = 0sn.A00;
        C264494Qc r0 = new C264494Qc(new HashMap(), new HashSet(), list, list, list, list, list);
        A0S = r0;
        A0R = r0;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.A06 + 31) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0Q ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + this.A0M.hashCode()) * 31) + this.A0D) * 31) + this.A0L.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31) + this.A0J.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0C) * 31) + this.A00) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + this.A0G.hashCode()) * 31) + this.A0H.hashCode();
    }

    public C264494Qc(C264514Qe r2) {
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A0A = r2.A0A;
        this.A09 = r2.A09;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A0F = r2.A0F;
        this.A0E = r2.A0E;
        this.A0Q = r2.A0Q;
        this.A0M = r2.A0M;
        this.A0D = r2.A0D;
        this.A0L = r2.A0L;
        this.A0I = r2.A0I;
        this.A0B = r2.A0B;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A0J = r2.A0J;
        this.A0K = r2.A0K;
        this.A0C = r2.A0C;
        this.A00 = r2.A00;
        this.A0P = r2.A0P;
        this.A0O = r2.A0O;
        this.A0N = r2.A0N;
        this.A0G = ImmutableMap.copyOf(r2.A0G);
        this.A0H = ImmutableSet.A03(r2.A0H);
    }
}
