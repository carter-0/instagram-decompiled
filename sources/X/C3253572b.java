package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.72b  reason: invalid class name and case insensitive filesystem */
public final class C3253572b {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public View.OnClickListener A05;
    public C322776wO A06;
    public CharSequence A07;
    public CharSequence A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
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
    public boolean A0P;
    public boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C3253572b r5 = (C3253572b) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A0Q == r5.A0Q && this.A0M == r5.A0M && this.A03 == r5.A03 && this.A0O == r5.A0O && this.A0N == r5.A0N && this.A0L == r5.A0L && this.A0P == r5.A0P && this.A04 == r5.A04 && this.A0H == r5.A0H && this.A0K == r5.A0K && this.A0I == r5.A0I && this.A0J == r5.A0J && this.A0G == r5.A0G && this.A0F == r5.A0F && 0qQ.A0K(this.A0D, r5.A0D) && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A0B, r5.A0B) && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A08, r5.A08) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A09, r5.A09))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[28];
        System.arraycopy(new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A0D, this.A0B, this.A07, this.A0A, this.A08, null, this.A0C, this.A09, false, Boolean.valueOf(this.A0Q), null, true, Boolean.valueOf(this.A0M), Integer.valueOf(this.A03), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0N), Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0P), Integer.valueOf(this.A04), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0G)}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{Boolean.valueOf(this.A0F)}, 0, objArr, 27, 1);
        return Arrays.hashCode(objArr);
    }
}
