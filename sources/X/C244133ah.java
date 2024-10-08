package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ah  reason: invalid class name and case insensitive filesystem */
public final class C244133ah implements AnonymousClass2TE, C251213mk {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public 2Tn A0K;
    public 2Tn A0L;
    public 2Tn A0M;
    public 2Tn A0N;
    public 2Tn A0O;
    public 2Tn A0P;
    public C244703bc A0Q;
    public C243573Zh A0R;
    public C390999sB A0S;
    public C244413b9 A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;

    public final void A0L(C244143ai r3, float f) {
        0qQ.A0B(r3, 0);
        this.A0I |= 67108864;
        2Tn r0 = this.A0K;
        if (r0 == null) {
            r0 = new 2Tn();
        }
        r0.A03(r3, f);
        this.A0K = r0;
    }

    public final void A0M(C244143ai r3, float f) {
        0qQ.A0B(r3, 0);
        this.A0I |= 16777216;
        2Tn r0 = this.A0M;
        if (r0 == null) {
            r0 = new 2Tn();
        }
        r0.A03(r3, f);
        this.A0M = r0;
    }

    public final void A0N(C244143ai r3, float f) {
        0qQ.A0B(r3, 0);
        this.A0I |= 4194304;
        2Tn r0 = this.A0O;
        if (r0 == null) {
            r0 = new 2Tn();
        }
        r0.A03(r3, f);
        this.A0O = r0;
    }

    public final void A0O(C244143ai r3, int i) {
        0qQ.A0B(r3, 0);
        this.A0I |= 33554432;
        2Tn r1 = this.A0L;
        if (r1 == null) {
            r1 = new 2Tn();
        }
        r1.A03(r3, (float) i);
        this.A0L = r1;
    }

    public final void A0P(C244143ai r3, int i) {
        0qQ.A0B(r3, 0);
        this.A0I |= 2097152;
        2Tn r1 = this.A0P;
        if (r1 == null) {
            r1 = new 2Tn();
        }
        r1.A03(r3, (float) i);
        this.A0P = r1;
    }

    public final void E1a(C244143ai r3, int i) {
        0qQ.A0B(r3, 0);
        this.A0I |= DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        2Tn r1 = this.A0N;
        if (r1 == null) {
            r1 = new 2Tn();
        }
        r1.A03(r3, (float) i);
        this.A0N = r1;
    }

    public final void A00(float f) {
        this.A0I |= Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        this.A00 = f;
    }

    public final void A01(float f) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        this.A01 = f;
    }

    public final void A02(float f) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        this.A02 = f;
    }

    public final void A03(float f) {
        this.A0I |= Constants.LOAD_RESULT_PGO;
        this.A03 = f;
    }

    public final void A04(float f) {
        this.A0I |= Constants.LOAD_RESULT_PGO_ATTEMPTED;
        this.A04 = f;
    }

    public final void A05(float f) {
        this.A0I |= 128;
        this.A05 = f;
    }

    public final void A06(float f) {
        this.A0I |= C249703kE.FLAG_MOVED;
        this.A06 = f;
    }

    public final void A07(float f) {
        this.A0I |= 32;
        this.A07 = f;
    }

    public final void A08(float f) {
        this.A0I |= 512;
        this.A08 = f;
    }

    public final void A09(float f) {
        this.A0I |= 8;
        this.A09 = f;
    }

    public final void A0A(float f) {
        this.A0I |= 2;
        this.A0A = f;
    }

    public final void A0B(int i) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        this.A0B = i;
    }

    public final void A0C(int i) {
        this.A0I |= 64;
        this.A0D = i;
    }

    public final void A0D(int i) {
        this.A0I |= 4096;
        this.A0Q = new C244703bc(i);
    }

    public final void A0E(int i) {
        this.A0I |= 1024;
        this.A0E = i;
    }

    public final void A0F(int i) {
        this.A0I |= 16;
        this.A0F = i;
    }

    public final void A0G(int i) {
        this.A0I |= 256;
        this.A0G = i;
    }

    public final void A0H(int i) {
        this.A0I |= 4;
        this.A0H = i;
    }

    public final void A0I(int i) {
        this.A0I |= 1;
        this.A0J = i;
    }

    public final void A0J(C243573Zh r2) {
        this.A0I |= 8192;
        this.A0R = r2;
    }

    public final void A0K(C244143ai r3) {
        this.A0I |= 134217728;
        List list = this.A0U;
        if (list == null) {
            list = new ArrayList(2);
        }
        list.add(r3);
        this.A0U = list;
    }

    public final void A0Q(C390999sB r1, int i) {
        this.A0S = r1;
        this.A0C = i;
    }

    public final void A0R(C244413b9 r3) {
        this.A0I |= Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
        this.A0T = r3;
    }

    public final void A0S(boolean z) {
        this.A0I |= 268435456;
        this.A0V = z;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        C244133ah r4 = (C244133ah) obj;
        if (equals(r4) || (r4 != null && this.A0I == r4.A0I && this.A0J == r4.A0J && Float.compare(r4.A0A, this.A0A) == 0 && this.A0H == r4.A0H && Float.compare(r4.A09, this.A09) == 0 && this.A0F == r4.A0F && Float.compare(r4.A07, this.A07) == 0 && this.A0D == r4.A0D && Float.compare(r4.A05, this.A05) == 0 && this.A0G == r4.A0G && Float.compare(r4.A08, this.A08) == 0 && this.A0E == r4.A0E && Float.compare(r4.A06, this.A06) == 0 && Float.compare(r4.A01, this.A01) == 0 && Float.compare(r4.A03, this.A03) == 0 && Float.compare(r4.A04, this.A04) == 0 && this.A0B == r4.A0B && Float.compare(r4.A02, this.A02) == 0 && Float.compare(r4.A00, this.A00) == 0 && this.A0V == r4.A0V && this.A0W == r4.A0W && 0qQ.A0K(this.A0Q, r4.A0Q) && this.A0R == r4.A0R && this.A0T == r4.A0T && C245173cR.A01(this.A0P, r4.A0P) && C245173cR.A01(this.A0L, r4.A0L) && C245173cR.A01(this.A0K, r4.A0K) && C245173cR.A01(this.A0N, r4.A0N) && C245173cR.A01(this.A0M, r4.A0M) && C245173cR.A01(this.A0O, r4.A0O) && 0qQ.A0K(this.A0U, r4.A0U) && 0qQ.A0K(this.A0S, r4.A0S) && 0qQ.A0K(Integer.valueOf(this.A0C), Integer.valueOf(r4.A0C)))) {
            return true;
        }
        return false;
    }
}
