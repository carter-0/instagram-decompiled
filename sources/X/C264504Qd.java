package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.4Qd  reason: invalid class name and case insensitive filesystem */
public final class C264504Qd extends C264514Qe {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray A0E;
    public final SparseBooleanArray A0F;

    public static void A00(C264504Qd r2) {
        r2.A0C = true;
        r2.A06 = false;
        r2.A07 = true;
        r2.A05 = false;
        r2.A09 = true;
        r2.A02 = false;
        r2.A03 = false;
        r2.A00 = false;
        r2.A01 = false;
        r2.A08 = true;
        r2.A0B = true;
        r2.A0D = false;
        r2.A04 = true;
        r2.A0A = false;
    }

    public final /* bridge */ /* synthetic */ C264514Qe A02(int i, int i2, boolean z) {
        super.A02(i, i2, true);
        return this;
    }

    public final void A0A(Context context) {
        super.A03(context, true);
    }

    public final void A09(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A0F;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public C264504Qd(C264484Qb r7) {
        this.A06 = r7.A06;
        this.A05 = r7.A05;
        this.A04 = r7.A04;
        this.A03 = r7.A03;
        this.A0A = r7.A0A;
        this.A09 = r7.A09;
        this.A08 = r7.A08;
        this.A07 = r7.A07;
        this.A0F = r7.A0F;
        this.A0E = r7.A0E;
        this.A0Q = r7.A0Q;
        this.A0M = r7.A0M;
        this.A0D = r7.A0D;
        this.A0L = r7.A0L;
        this.A0I = r7.A0I;
        this.A0B = r7.A0B;
        this.A02 = r7.A02;
        this.A01 = r7.A01;
        this.A0J = r7.A0J;
        this.A0K = r7.A0K;
        this.A0C = r7.A0C;
        this.A00 = r7.A00;
        this.A0P = r7.A0P;
        this.A0O = r7.A0O;
        this.A0N = r7.A0N;
        this.A0H = new HashSet(r7.A0H);
        this.A0G = new HashMap(r7.A0G);
        this.A0C = r7.A0E;
        this.A06 = r7.A08;
        this.A07 = r7.A09;
        this.A05 = r7.A07;
        this.A09 = r7.A0B;
        this.A02 = r7.A04;
        this.A03 = r7.A05;
        this.A00 = r7.A02;
        this.A01 = r7.A03;
        this.A08 = r7.A0A;
        this.A0B = r7.A0D;
        this.A0D = r7.A0F;
        this.A04 = r7.A06;
        this.A0A = r7.A0C;
        SparseArray sparseArray = r7.A00;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A0E = sparseArray2;
        this.A0F = r7.A01.clone();
    }

    public final /* bridge */ /* synthetic */ C264514Qe A04(String str) {
        super.A04(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ C264514Qe A05(String[] strArr) {
        super.A05(strArr);
        return this;
    }

    public final /* bridge */ /* synthetic */ C264514Qe A06(String[] strArr) {
        super.A06(strArr);
        return this;
    }

    @Deprecated
    public C264504Qd() {
        this.A0E = new SparseArray();
        this.A0F = new SparseBooleanArray();
        A00(this);
    }
}
