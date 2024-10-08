package androidx.recyclerview.widget;

import X.2Rw;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3BB;
import X.AnonymousClass3MX;
import X.AnonymousClass52S;
import X.AnonymousClass972;
import X.AnonymousClass9ND;
import X.C11042S7b;
import X.C17903Vhu;
import X.C238093An;
import X.C252553pI;
import X.C252563pJ;
import X.C266524Zi;
import X.C339907kM;
import X.C65835M1b;
import X.C70793OLo;
import X.C7216Pzk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends C252553pI implements C252563pJ {
    public int A00;
    public int A01 = 2;
    public int A02;
    public int A03 = -1;
    public int A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A05;
    public int A06 = -1;
    public AnonymousClass3BB A07;
    public AnonymousClass3BB A08;
    public C11042S7b A09 = new Object();
    public SavedState A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = true;
    public int[] A0G;
    public AnonymousClass9ND[] A0H;
    public BitSet A0I;
    public boolean A0J = false;
    public final Rect A0K = new Rect();
    public final C70793OLo A0L;
    public final Runnable A0M = new C65835M1b(this);
    public final C17903Vhu A0N = new C17903Vhu(this);

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(64);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public List A04;
        public boolean A05;
        public boolean A06;
        public boolean A07;
        public int[] A08;
        public int[] A09;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A02);
            if (this.A02 > 0) {
                parcel.writeIntArray(this.A09);
            }
            parcel.writeInt(this.A01);
            if (this.A01 > 0) {
                parcel.writeIntArray(this.A08);
            }
            parcel.writeInt(this.A07 ? 1 : 0);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeList(this.A04);
        }
    }

    public static int A0D(AnonymousClass3AW r8, StaggeredGridLayoutManager staggeredGridLayoutManager) {
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = staggeredGridLayoutManager;
        if (staggeredGridLayoutManager.A0T() == 0) {
            return 0;
        }
        AnonymousClass3BB r3 = staggeredGridLayoutManager.A07;
        boolean z = staggeredGridLayoutManager.A0F;
        boolean z2 = !z;
        return C266524Zi.A02(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), r3, staggeredGridLayoutManager2, r8, z, staggeredGridLayoutManager.A0E);
    }

    public final void A1R(AnonymousClass3AN r2, AnonymousClass3AW r3) {
        A0H(r2, r3, true);
    }

    public final void A1S(AnonymousClass3AW r2) {
        this.A03 = -1;
        this.A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A0A = null;
        this.A0N.A00();
    }

    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        A0K(this, i, i2, 1);
    }

    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        A0K(this, i, i2, 2);
    }

    public final void A1g(int i) {
        A1G((String) null);
        if (i != this.A06) {
            this.A09.A01();
            A0b();
            this.A06 = i;
            this.A0I = new BitSet(i);
            AnonymousClass9ND[] r2 = new AnonymousClass9ND[i];
            this.A0H = r2;
            for (int i2 = 0; i2 < i; i2++) {
                r2[i2] = new AnonymousClass9ND(this, i2);
            }
            A0b();
        }
    }

    public final void A1h(AnonymousClass3AW r5, int i) {
        int A1a;
        int i2;
        if (i > 0) {
            A1a = A1b();
            i2 = 1;
        } else {
            A1a = A1a();
            i2 = -1;
        }
        C70793OLo oLo = this.A0L;
        oLo.A07 = true;
        A0I(r5, A1a);
        A0F(i2);
        oLo.A01 = A1a + oLo.A03;
        oLo.A00 = Math.abs(i);
    }

    private int A00(int i) {
        int A022 = this.A0H[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A023 = this.A0H[i2].A02(i);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    private int A01(int i) {
        int A032 = this.A0H[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A033 = this.A0H[i2].A03(i);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    public static int A02(int i, int i2, int i3) {
        int mode;
        if ((i2 != 0 || i3 != 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r14v11, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v12, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r2 >= r27.A00()) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A0C(X.C70793OLo r25, X.AnonymousClass3AN r26, X.AnonymousClass3AW r27) {
        /*
            r24 = this;
            r10 = r24
            java.util.BitSet r1 = r10.A0I
            int r0 = r10.A06
            r8 = 0
            r11 = 1
            r1.set(r8, r0, r11)
            X.OLo r7 = r10.A0L
            boolean r0 = r7.A06
            r9 = r25
            int r3 = r9.A04
            if (r0 == 0) goto L_0x0035
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r11) goto L_0x001c
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            r2 = 0
        L_0x001d:
            int r0 = r10.A06
            if (r2 >= r0) goto L_0x0043
            X.9ND[] r1 = r10.A0H
            r0 = r1[r2]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            r0 = r1[r2]
            r10.A0J(r0, r3, r6)
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0035:
            if (r3 != r11) goto L_0x003d
            int r6 = r9.A02
            int r0 = r9.A00
            int r6 = r6 + r0
            goto L_0x001c
        L_0x003d:
            int r6 = r9.A05
            int r0 = r9.A00
            int r6 = r6 - r0
            goto L_0x001c
        L_0x0043:
            boolean r1 = r10.A0E
            X.3BB r0 = r10.A07
            r22 = r0
            if (r1 == 0) goto L_0x034b
            int r20 = r22.A03()
        L_0x004f:
            r3 = 0
        L_0x0050:
            int r2 = r9.A01
            if (r2 < 0) goto L_0x005b
            int r1 = r27.A00()
            r0 = 1
            if (r2 < r1) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r5 = -1
            r23 = r26
            if (r0 == 0) goto L_0x0351
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x006d
            java.util.BitSet r0 = r10.A0I
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0351
        L_0x006d:
            int r1 = r9.A01
            r0 = r23
            android.view.View r4 = r0.A04(r1)
            int r1 = r9.A01
            int r0 = r9.A03
            int r1 = r1 + r0
            r9.A01 = r1
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            X.7kM r3 = (X.C339907kM) r3
            X.3kE r0 = r3.mViewHolder
            int r2 = r0.getLayoutPosition()
            X.S7b r0 = r10.A09
            r21 = r0
            int[] r1 = r0.A01
            if (r1 == 0) goto L_0x02e2
            int r0 = r1.length
            if (r2 >= r0) goto L_0x02e2
            r1 = r1[r2]
            if (r1 == r5) goto L_0x02e2
            r19 = 0
            X.9ND[] r0 = r10.A0H
            r1 = r0[r1]
        L_0x009d:
            r3.A00 = r1
            int r0 = r9.A04
            if (r0 != r11) goto L_0x02dd
            r10.A0h(r4, r5)
        L_0x00a6:
            boolean r12 = r3.A01
            int r0 = r10.A02
            r18 = r0
            if (r12 == 0) goto L_0x02b0
            if (r0 != r11) goto L_0x0297
            int r13 = r10.A00
        L_0x00b2:
            int r15 = r10.A00
            int r14 = r10.A01
            int r12 = r10.BaC()
            int r0 = r10.Ba8()
            int r12 = r12 + r0
            int r0 = r3.height
            int r17 = X.C252553pI.A04(r15, r14, r12, r0, r11)
        L_0x00c5:
            android.graphics.Rect r14 = r10.A0K
            r10.A0k(r4, r14)
            android.view.ViewGroup$LayoutParams r12 = r4.getLayoutParams()
            X.3MX r12 = (X.AnonymousClass3MX) r12
            int r0 = r12.leftMargin
            r16 = r0
            int r0 = r14.left
            int r16 = r16 + r0
            int r15 = r12.rightMargin
            int r0 = r14.right
            int r15 = r15 + r0
            r0 = r16
            int r15 = A02(r13, r0, r15)
            int r13 = r12.topMargin
            int r0 = r14.top
            int r13 = r13 + r0
            int r0 = r12.bottomMargin
            int r14 = r14.bottom
            int r0 = r0 + r14
            r14 = r17
            int r13 = A02(r14, r13, r0)
            boolean r0 = r10.A0z(r4, r12, r15, r13)
            if (r0 == 0) goto L_0x00fc
            r4.measure(r15, r13)
        L_0x00fc:
            int r12 = r9.A04
            boolean r0 = r3.A01
            if (r12 != r11) goto L_0x0144
            if (r0 == 0) goto L_0x013d
            r0 = r20
            int r13 = r10.A00(r0)
        L_0x010a:
            r0 = r22
            int r12 = r0.A0B(r4)
            int r12 = r12 + r13
            if (r19 == 0) goto L_0x018c
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x018c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r14 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r14.<init>()
            int r0 = r10.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r15 = 0
        L_0x0123:
            int r0 = r10.A06
            if (r15 >= r0) goto L_0x013a
            int[] r0 = r14.A03
            r16 = r0
            X.9ND[] r0 = r10.A0H
            r0 = r0[r15]
            int r0 = r0.A02(r13)
            int r0 = r13 - r0
            r16[r15] = r0
            int r15 = r15 + 1
            goto L_0x0123
        L_0x013a:
            r14.A00 = r5
            goto L_0x0185
        L_0x013d:
            r0 = r20
            int r13 = r1.A02(r0)
            goto L_0x010a
        L_0x0144:
            if (r0 == 0) goto L_0x017c
            r0 = r20
            int r12 = r10.A01(r0)
        L_0x014c:
            r0 = r22
            int r0 = r0.A0B(r4)
            int r13 = r12 - r0
            if (r19 == 0) goto L_0x018c
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x018c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r14 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r14.<init>()
            int r0 = r10.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r15 = 0
        L_0x0166:
            int r0 = r10.A06
            if (r15 >= r0) goto L_0x0183
            int[] r0 = r14.A03
            r16 = r0
            X.9ND[] r0 = r10.A0H
            r0 = r0[r15]
            int r0 = r0.A03(r12)
            int r0 = r0 - r12
            r16[r15] = r0
            int r15 = r15 + 1
            goto L_0x0166
        L_0x017c:
            r0 = r20
            int r12 = r1.A03(r0)
            goto L_0x014c
        L_0x0183:
            r14.A00 = r11
        L_0x0185:
            r14.A01 = r2
            r0 = r21
            r0.A07(r14)
        L_0x018c:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x01d8
            int r0 = r9.A03
            if (r0 != r5) goto L_0x01d8
            if (r19 != 0) goto L_0x01d6
            int r5 = r9.A04
            X.9ND[] r0 = r10.A0H
            r0 = r0[r8]
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r11) goto L_0x01b6
            int r14 = r0.A02(r15)
            r5 = 1
        L_0x01a5:
            int r0 = r10.A06
            if (r5 >= r0) goto L_0x01d8
            X.9ND[] r0 = r10.A0H
            r0 = r0[r5]
            int r0 = r0.A02(r15)
            if (r0 != r14) goto L_0x01cc
            int r5 = r5 + 1
            goto L_0x01a5
        L_0x01b6:
            int r14 = r0.A03(r15)
            r5 = 1
        L_0x01bb:
            int r0 = r10.A06
            if (r5 >= r0) goto L_0x01d8
            X.9ND[] r0 = r10.A0H
            r0 = r0[r5]
            int r0 = r0.A03(r15)
            if (r0 != r14) goto L_0x01cc
            int r5 = r5 + 1
            goto L_0x01bb
        L_0x01cc:
            r0 = r21
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x01d6
            r0.A02 = r11
        L_0x01d6:
            r10.A0J = r11
        L_0x01d8:
            int r2 = r9.A04
            boolean r0 = r3.A01
            if (r2 != r11) goto L_0x01f4
            if (r0 == 0) goto L_0x01ee
            int r2 = r10.A06
        L_0x01e2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0209
            X.9ND[] r0 = r10.A0H
            r0 = r0[r2]
            r0.A0C(r4)
            goto L_0x01e2
        L_0x01ee:
            X.9ND r0 = r3.A00
            r0.A0C(r4)
            goto L_0x0209
        L_0x01f4:
            if (r0 == 0) goto L_0x0204
            int r2 = r10.A06
        L_0x01f8:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0209
            X.9ND[] r0 = r10.A0H
            r0 = r0[r2]
            r0.A0D(r4)
            goto L_0x01f8
        L_0x0204:
            X.9ND r0 = r3.A00
            r0.A0D(r4)
        L_0x0209:
            boolean r0 = r10.A1j()
            if (r0 == 0) goto L_0x024f
            r0 = r18
            if (r0 != r11) goto L_0x024f
            boolean r0 = r3.A01
            X.3BB r14 = r10.A08
            int r5 = r14.A03()
            if (r0 != 0) goto L_0x0227
            int r2 = r10.A06
            int r2 = r2 - r11
            int r0 = r1.A04
            int r2 = r2 - r0
            int r0 = r10.A05
            int r2 = r2 * r0
            int r5 = r5 - r2
        L_0x0227:
            int r0 = r14.A0B(r4)
            int r2 = r5 - r0
        L_0x022d:
            X.C252553pI.A09(r4, r2, r13, r5, r12)
        L_0x0230:
            boolean r0 = r3.A01
            int r12 = r7.A04
            if (r0 == 0) goto L_0x0273
            r5 = 0
        L_0x0237:
            int r0 = r10.A06
            if (r5 >= r0) goto L_0x0276
            X.9ND[] r2 = r10.A0H
            r0 = r2[r5]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024c
            r0 = r2[r5]
            r10.A0J(r0, r12, r6)
        L_0x024c:
            int r5 = r5 + 1
            goto L_0x0237
        L_0x024f:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0266
            X.3BB r5 = r10.A08
            int r2 = r5.A06()
        L_0x0259:
            int r5 = r5.A0B(r4)
            int r5 = r5 + r2
            r0 = r18
            if (r0 == r11) goto L_0x022d
            X.C252553pI.A09(r4, r13, r2, r12, r5)
            goto L_0x0230
        L_0x0266:
            int r2 = r1.A04
            int r0 = r10.A05
            int r2 = r2 * r0
            X.3BB r5 = r10.A08
            int r0 = r5.A06()
            int r2 = r2 + r0
            goto L_0x0259
        L_0x0273:
            r10.A0J(r1, r12, r6)
        L_0x0276:
            r0 = r23
            r10.A0G(r7, r0)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x028e
            boolean r0 = r4.hasFocusable()
            if (r0 == 0) goto L_0x028e
            boolean r0 = r3.A01
            java.util.BitSet r2 = r10.A0I
            if (r0 == 0) goto L_0x0291
            r2.clear()
        L_0x028e:
            r3 = 1
            goto L_0x0050
        L_0x0291:
            int r0 = r1.A04
            r2.set(r0, r8)
            goto L_0x028e
        L_0x0297:
            int r14 = r10.A03
            int r13 = r10.A04
            int r12 = r10.Ba9()
            int r0 = r10.BaB()
            int r12 = r12 + r0
            int r0 = r3.width
            int r13 = X.C252553pI.A04(r14, r13, r12, r0, r11)
            int r0 = r10.A00
            r17 = r0
            goto L_0x00c5
        L_0x02b0:
            if (r0 != r11) goto L_0x02be
            int r13 = r10.A05
            int r12 = r10.A04
            int r0 = r3.width
            int r13 = X.C252553pI.A04(r13, r12, r8, r0, r8)
            goto L_0x00b2
        L_0x02be:
            int r14 = r10.A03
            int r13 = r10.A04
            int r12 = r10.Ba9()
            int r0 = r10.BaB()
            int r12 = r12 + r0
            int r0 = r3.width
            int r13 = X.C252553pI.A04(r14, r13, r12, r0, r11)
            int r14 = r10.A05
            int r12 = r10.A01
            int r0 = r3.height
            int r17 = X.C252553pI.A04(r14, r12, r8, r0, r8)
            goto L_0x00c5
        L_0x02dd:
            r10.A0h(r4, r8)
            goto L_0x00a6
        L_0x02e2:
            r19 = 1
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x02f9
            X.9ND[] r0 = r10.A0H
            r1 = r0[r8]
        L_0x02ec:
            r0 = r21
            r0.A02(r2)
            int[] r12 = r0.A01
            int r0 = r1.A04
            r12[r2] = r0
            goto L_0x009d
        L_0x02f9:
            int r0 = r9.A04
            boolean r0 = r10.A0L(r0)
            r13 = -1
            if (r0 == 0) goto L_0x0329
            int r12 = r10.A06
            int r12 = r12 - r11
            r18 = -1
        L_0x0307:
            int r0 = r9.A04
            r1 = 0
            if (r0 != r11) goto L_0x032f
            r17 = 2147483647(0x7fffffff, float:NaN)
            int r16 = r22.A06()
        L_0x0313:
            if (r12 == r13) goto L_0x02ec
            X.9ND[] r0 = r10.A0H
            r14 = r0[r12]
            r0 = r16
            int r15 = r14.A02(r0)
            r0 = r17
            if (r15 >= r0) goto L_0x0326
            r1 = r14
            r17 = r15
        L_0x0326:
            int r12 = r12 + r18
            goto L_0x0313
        L_0x0329:
            r12 = 0
            int r13 = r10.A06
            r18 = 1
            goto L_0x0307
        L_0x032f:
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            int r16 = r22.A03()
        L_0x0335:
            if (r12 == r13) goto L_0x02ec
            X.9ND[] r0 = r10.A0H
            r14 = r0[r12]
            r0 = r16
            int r15 = r14.A03(r0)
            r0 = r17
            if (r15 <= r0) goto L_0x0348
            r1 = r14
            r17 = r15
        L_0x0348:
            int r12 = r12 + r18
            goto L_0x0335
        L_0x034b:
            int r20 = r22.A06()
            goto L_0x004f
        L_0x0351:
            if (r3 != 0) goto L_0x0358
            r0 = r23
            r10.A0G(r7, r0)
        L_0x0358:
            int r0 = r7.A04
            if (r0 != r5) goto L_0x0372
            int r0 = r22.A06()
            int r0 = r10.A01(r0)
            int r1 = r22.A06()
        L_0x0368:
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0371
            int r0 = r9.A00
            int r8 = java.lang.Math.min(r0, r1)
        L_0x0371:
            return r8
        L_0x0372:
            int r0 = r22.A03()
            int r1 = r10.A00(r0)
            int r0 = r22.A03()
            goto L_0x0368
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0C(X.OLo, X.3AN, X.3AW):int");
    }

    private void A0E() {
        boolean z;
        if (this.A02 == 1 || !A1j()) {
            z = this.A0D;
        } else {
            z = !this.A0D;
        }
        this.A0E = z;
    }

    private void A0F(int i) {
        C70793OLo oLo = this.A0L;
        oLo.A04 = i;
        boolean z = this.A0E;
        int i2 = 1;
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        if (z != z2) {
            i2 = -1;
        }
        oLo.A03 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == -1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(X.C70793OLo r8, X.AnonymousClass3AN r9) {
        /*
            r7 = this;
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0129
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0129
            int r2 = r8.A00
            r1 = -1
            int r0 = r8.A04
            if (r2 != 0) goto L_0x0072
            if (r0 != r1) goto L_0x0126
        L_0x0011:
            int r1 = r8.A02
        L_0x0013:
            int r4 = r7.A0T()
            r3 = 1
            int r4 = r4 - r3
        L_0x0019:
            if (r4 < 0) goto L_0x0129
            android.view.View r2 = r7.A0X(r4)
            X.3BB r5 = r7.A07
            int r0 = r5.A0D(r2)
            if (r0 < r1) goto L_0x0129
            int r0 = r5.A0A(r2)
            if (r0 < r1) goto L_0x0129
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            X.7kM r5 = (X.C339907kM) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x005a
            r6 = 0
            r5 = 0
        L_0x0039:
            int r0 = r7.A06
            if (r5 >= r0) goto L_0x004c
            X.9ND[] r0 = r7.A0H
            r0 = r0[r5]
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            int r5 = r5 + 1
            goto L_0x0039
        L_0x004c:
            int r0 = r7.A06
            if (r6 >= r0) goto L_0x0069
            X.9ND[] r0 = r7.A0H
            r0 = r0[r6]
            r0.A0A()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            X.9ND r0 = r5.A00
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            X.9ND r0 = r5.A00
            r0.A0A()
        L_0x0069:
            r7.A0g(r2)
            r9.A0A(r2)
            int r4 = r4 + -1
            goto L_0x0019
        L_0x0072:
            if (r0 != r1) goto L_0x00a0
            int r3 = r8.A05
            X.9ND[] r1 = r7.A0H
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A03(r3)
            r1 = 1
        L_0x0080:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x0092
            X.9ND[] r0 = r7.A0H
            r0 = r0[r1]
            int r0 = r0.A03(r3)
            if (r0 <= r2) goto L_0x008f
            r2 = r0
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0092:
            int r3 = r3 - r2
            if (r3 < 0) goto L_0x0011
            int r1 = r8.A02
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r3, r0)
            int r1 = r1 - r0
            goto L_0x0013
        L_0x00a0:
            int r3 = r8.A02
            X.9ND[] r1 = r7.A0H
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A02(r3)
            r1 = 1
        L_0x00ac:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x00be
            X.9ND[] r0 = r7.A0H
            r0 = r0[r1]
            int r0 = r0.A02(r3)
            if (r0 >= r2) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00be:
            int r0 = r8.A02
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0126
            int r1 = r8.A05
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + r1
        L_0x00cc:
            int r1 = r7.A0T()
            if (r1 <= 0) goto L_0x0129
            r5 = 0
            android.view.View r3 = r7.A0X(r5)
            X.3BB r2 = r7.A07
            int r1 = r2.A08(r3)
            if (r1 > r0) goto L_0x0129
            int r1 = r2.A09(r3)
            if (r1 > r0) goto L_0x0129
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.7kM r2 = (X.C339907kM) r2
            boolean r1 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x0112
            r2 = 0
        L_0x00f1:
            int r1 = r7.A06
            if (r2 >= r1) goto L_0x0104
            X.9ND[] r1 = r7.A0H
            r1 = r1[r2]
            java.util.ArrayList r1 = r1.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0104:
            int r1 = r7.A06
            if (r5 >= r1) goto L_0x011f
            X.9ND[] r1 = r7.A0H
            r1 = r1[r5]
            r1.A0B()
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0112:
            X.9ND r2 = r2.A00
            java.util.ArrayList r1 = r2.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            r2.A0B()
        L_0x011f:
            r7.A0g(r3)
            r9.A0A(r3)
            goto L_0x00cc
        L_0x0126:
            int r0 = r8.A05
            goto L_0x00cc
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0G(X.OLo, X.3AN):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e6, code lost:
        if (r11.A0E != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x020a, code lost:
        if (r2 != r11.A0E) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x037b, code lost:
        if (r1 > 0) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03a7, code lost:
        if (A1i() != false) goto L_0x03a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(X.AnonymousClass3AN r12, X.AnonymousClass3AW r13, boolean r14) {
        /*
            r11 = this;
            X.Vhu r8 = r11.A0N
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r2 = r11.A0A
            r1 = -1
            if (r2 != 0) goto L_0x000b
            int r0 = r11.A03
            if (r0 == r1) goto L_0x0018
        L_0x000b:
            int r0 = r13.A00()
            if (r0 != 0) goto L_0x0018
            r11.A0o(r12)
            r8.A00()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r8.A04
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0025
            r10 = 0
            if (r2 == 0) goto L_0x00dd
        L_0x0025:
            r10 = 1
            r8.A00()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = r11.A0A
            if (r3 == 0) goto L_0x00b1
            int r2 = r3.A02
            if (r2 <= 0) goto L_0x0075
            int r0 = r11.A06
            if (r2 != r0) goto L_0x0066
            r4 = 0
        L_0x0036:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x0075
            X.9ND[] r0 = r11.A0H
            r0 = r0[r4]
            r0.A09()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r2 = r11.A0A
            int[] r0 = r2.A09
            r3 = r0[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x0056
            boolean r2 = r2.A05
            X.3BB r0 = r11.A07
            if (r2 == 0) goto L_0x0061
            int r0 = r0.A03()
        L_0x0055:
            int r3 = r3 + r0
        L_0x0056:
            X.9ND[] r0 = r11.A0H
            r0 = r0[r4]
            r0.A01 = r3
            r0.A00 = r3
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0061:
            int r0 = r0.A06()
            goto L_0x0055
        L_0x0066:
            r0 = 0
            r3.A09 = r0
            r3.A02 = r7
            r3.A01 = r7
            r3.A08 = r0
            r3.A04 = r0
            int r0 = r3.A03
            r3.A00 = r0
        L_0x0075:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r2 = r11.A0A
            boolean r0 = r2.A06
            r11.A0C = r0
            boolean r3 = r2.A07
            r0 = 0
            r11.A1G(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r2 = r11.A0A
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.A07
            if (r0 == r3) goto L_0x008b
            r2.A07 = r3
        L_0x008b:
            r11.A0D = r3
            r11.A0b()
            r11.A0E()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = r11.A0A
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00ae
            r11.A03 = r0
            boolean r0 = r3.A05
        L_0x009d:
            r8.A03 = r0
            int r0 = r3.A01
            if (r0 <= r6) goto L_0x00b8
            X.S7b r2 = r11.A09
            int[] r0 = r3.A08
            r2.A01 = r0
            java.util.List r0 = r3.A04
            r2.A00 = r0
            goto L_0x00b8
        L_0x00ae:
            boolean r0 = r11.A0E
            goto L_0x009d
        L_0x00b1:
            r11.A0E()
            boolean r0 = r11.A0E
            r8.A03 = r0
        L_0x00b8:
            boolean r0 = r13.A08
            r3 = 0
            if (r0 != 0) goto L_0x012b
            int r4 = r11.A03
            if (r4 == r1) goto L_0x012b
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 < 0) goto L_0x0127
            int r0 = r13.A00()
            if (r4 >= r0) goto L_0x0127
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r2 = r11.A0A
            if (r2 == 0) goto L_0x0165
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0165
            int r0 = r2.A02
            if (r0 < r6) goto L_0x0165
            r8.A00 = r9
            r8.A01 = r4
        L_0x00db:
            r8.A04 = r6
        L_0x00dd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r11.A0A
            if (r0 != 0) goto L_0x00fa
            int r0 = r11.A03
            if (r0 != r1) goto L_0x00fa
            boolean r2 = r8.A03
            boolean r0 = r11.A0B
            if (r2 != r0) goto L_0x00f3
            boolean r2 = r11.A1j()
            boolean r0 = r11.A0C
            if (r2 == r0) goto L_0x00fa
        L_0x00f3:
            X.S7b r0 = r11.A09
            r0.A01()
            r8.A02 = r6
        L_0x00fa:
            int r0 = r11.A0T()
            if (r0 <= 0) goto L_0x029b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r11.A0A
            if (r0 == 0) goto L_0x0108
            int r0 = r0.A02
            if (r0 >= r6) goto L_0x029b
        L_0x0108:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0221
            r4 = 0
        L_0x010d:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x029b
            X.9ND[] r3 = r11.A0H
            r0 = r3[r4]
            r0.A09()
            int r2 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0124
            r0 = r3[r4]
            r0.A01 = r2
            r0.A00 = r2
        L_0x0124:
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0127:
            r11.A03 = r1
            r11.A04 = r9
        L_0x012b:
            boolean r0 = r11.A0B
            int r4 = r13.A00()
            if (r0 == 0) goto L_0x014c
            int r2 = r11.A0T()
        L_0x0137:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0163
            android.view.View r0 = r11.A0X(r2)
            int r0 = X.C252553pI.A06(r0)
            if (r0 < 0) goto L_0x0137
            if (r0 >= r4) goto L_0x0137
        L_0x0147:
            r8.A01 = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x018b
        L_0x014c:
            int r3 = r11.A0T()
            r2 = 0
        L_0x0151:
            if (r2 >= r3) goto L_0x0163
            android.view.View r0 = r11.A0X(r2)
            int r0 = X.C252553pI.A06(r0)
            if (r0 < 0) goto L_0x0160
            if (r0 >= r4) goto L_0x0160
            goto L_0x0147
        L_0x0160:
            int r2 = r2 + 1
            goto L_0x0151
        L_0x0163:
            r0 = 0
            goto L_0x0147
        L_0x0165:
            android.view.View r4 = r11.A1D(r4)
            if (r4 == 0) goto L_0x01d6
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01d1
            int r0 = r11.A1b()
        L_0x0173:
            r8.A01 = r0
            int r0 = r11.A04
            if (r0 == r9) goto L_0x019b
            boolean r0 = r8.A03
            X.3BB r3 = r11.A07
            if (r0 == 0) goto L_0x018f
            int r2 = r3.A03()
            int r0 = r11.A04
            int r2 = r2 - r0
            int r0 = r3.A08(r4)
        L_0x018a:
            int r2 = r2 - r0
        L_0x018b:
            r8.A00 = r2
            goto L_0x00db
        L_0x018f:
            int r2 = r3.A06()
            int r0 = r11.A04
            int r2 = r2 + r0
            int r0 = r3.A0D(r4)
            goto L_0x018a
        L_0x019b:
            X.3BB r3 = r11.A07
            int r2 = r3.A0B(r4)
            int r0 = r3.A07()
            if (r2 <= r0) goto L_0x01b5
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x01b0
            int r2 = r3.A03()
            goto L_0x018b
        L_0x01b0:
            int r2 = r3.A06()
            goto L_0x018b
        L_0x01b5:
            int r2 = r3.A0D(r4)
            int r0 = r3.A06()
            int r2 = r2 - r0
            if (r2 >= 0) goto L_0x01c2
            int r2 = -r2
            goto L_0x018b
        L_0x01c2:
            int r2 = r3.A03()
            int r0 = r3.A08(r4)
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x018b
            r8.A00 = r9
            goto L_0x00db
        L_0x01d1:
            int r0 = r11.A1a()
            goto L_0x0173
        L_0x01d6:
            int r5 = r11.A03
            r8.A01 = r5
            int r4 = r11.A04
            if (r4 != r9) goto L_0x020d
            int r0 = r11.A0T()
            if (r0 != 0) goto L_0x0200
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01e9
        L_0x01e8:
            r3 = 1
        L_0x01e9:
            r8.A03 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.3BB r0 = r0.A07
            if (r3 == 0) goto L_0x01fb
            int r0 = r0.A03()
        L_0x01f5:
            r8.A00 = r0
            r8.A02 = r6
            goto L_0x00db
        L_0x01fb:
            int r0 = r0.A06()
            goto L_0x01f5
        L_0x0200:
            int r0 = r11.A1a()
            r2 = 0
            if (r5 >= r0) goto L_0x0208
            r2 = 1
        L_0x0208:
            boolean r0 = r11.A0E
            if (r2 == r0) goto L_0x01e8
            goto L_0x01e9
        L_0x020d:
            boolean r2 = r8.A03
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.3BB r0 = r0.A07
            if (r2 == 0) goto L_0x021b
            int r0 = r0.A03()
            int r0 = r0 - r4
            goto L_0x01f5
        L_0x021b:
            int r0 = r0.A06()
            int r0 = r0 + r4
            goto L_0x01f5
        L_0x0221:
            if (r10 != 0) goto L_0x0228
            int[] r4 = r8.A05
            r3 = 0
            if (r4 != 0) goto L_0x0287
        L_0x0228:
            r5 = 0
        L_0x0229:
            int r0 = r11.A06
            X.9ND[] r9 = r11.A0H
            if (r5 >= r0) goto L_0x0264
            r9 = r9[r5]
            boolean r10 = r11.A0E
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x025f
            int r2 = r9.A02(r3)
        L_0x023d:
            r9.A09()
            if (r2 == r3) goto L_0x0255
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A05
            X.3BB r0 = r0.A07
            if (r10 == 0) goto L_0x0258
            int r0 = r0.A03()
            if (r2 < r0) goto L_0x0255
        L_0x024e:
            if (r4 == r3) goto L_0x0251
            int r2 = r2 + r4
        L_0x0251:
            r9.A00 = r2
            r9.A01 = r2
        L_0x0255:
            int r5 = r5 + 1
            goto L_0x0229
        L_0x0258:
            int r0 = r0.A06()
            if (r2 <= r0) goto L_0x024e
            goto L_0x0255
        L_0x025f:
            int r2 = r9.A03(r3)
            goto L_0x023d
        L_0x0264:
            int r5 = r9.length
            int[] r0 = r8.A05
            if (r0 == 0) goto L_0x026c
            int r0 = r0.length
            if (r0 >= r5) goto L_0x0275
        L_0x026c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.9ND[] r0 = r0.A0H
            int r0 = r0.length
            int[] r0 = new int[r0]
            r8.A05 = r0
        L_0x0275:
            r4 = 0
        L_0x0276:
            if (r4 >= r5) goto L_0x029b
            int[] r3 = r8.A05
            r2 = r9[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A03(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x0276
        L_0x0287:
            int r0 = r11.A06
            if (r3 >= r0) goto L_0x029b
            X.9ND[] r0 = r11.A0H
            r2 = r0[r3]
            r2.A09()
            r0 = r4[r3]
            r2.A01 = r0
            r2.A00 = r0
            int r3 = r3 + 1
            goto L_0x0287
        L_0x029b:
            r11.A0n(r12)
            X.OLo r3 = r11.A0L
            r3.A07 = r7
            r11.A0J = r7
            X.3BB r2 = r11.A08
            int r4 = r2.A07()
            int r0 = r11.A06
            int r0 = r4 / r0
            r11.A05 = r0
            int r0 = r2.A05()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r11.A00 = r0
            int r0 = r8.A01
            r11.A0I(r13, r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x030c
            r11.A0F(r1)
            r11.A0C(r3, r12, r13)
            r11.A0F(r6)
        L_0x02cc:
            int r1 = r8.A01
            int r0 = r3.A03
            int r1 = r1 + r0
            r3.A01 = r1
            r11.A0C(r3, r12, r13)
            int r1 = r2.A05()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0344
            r1 = 0
            int r5 = r11.A0T()
            r4 = 0
            r9 = 0
        L_0x02e5:
            if (r9 >= r5) goto L_0x0316
            android.view.View r10 = r11.A0X(r9)
            int r0 = r2.A0B(r10)
            float r3 = (float) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0309
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.7kM r0 = (X.C339907kM) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0305
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r0 = r11.A06
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0305:
            float r1 = java.lang.Math.max(r1, r3)
        L_0x0309:
            int r9 = r9 + 1
            goto L_0x02e5
        L_0x030c:
            r11.A0F(r6)
            r11.A0C(r3, r12, r13)
            r11.A0F(r1)
            goto L_0x02cc
        L_0x0316:
            int r3 = r11.A05
            int r0 = r11.A06
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r9 = r2.A05()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r0) goto L_0x0330
            int r0 = r2.A07()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0330:
            int r0 = r11.A06
            int r0 = r1 / r0
            r11.A05 = r0
            int r0 = r2.A05()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r11.A00 = r0
            int r0 = r11.A05
            if (r0 != r3) goto L_0x03f5
        L_0x0344:
            int r0 = r11.A0T()
            if (r0 <= 0) goto L_0x0380
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x03c5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r11.A00(r1)
            if (r0 == r1) goto L_0x036b
            X.3BB r2 = r11.A07
            int r1 = r2.A03()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x036b
            int r0 = -r1
            int r0 = r11.A1c(r12, r13, r0)
            int r0 = -r0
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x036b
            r2.A0E(r1)
        L_0x036b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A01(r0)
            if (r1 == r0) goto L_0x0380
            X.3BB r0 = r11.A07
            int r0 = r0.A06()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0380
        L_0x037d:
            r11.A1c(r12, r13, r1)
        L_0x0380:
            if (r14 == 0) goto L_0x03c3
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x03c3
            int r0 = r11.A01
            if (r0 == 0) goto L_0x03c3
            int r0 = r11.A0T()
            if (r0 <= 0) goto L_0x03c3
            boolean r0 = r11.A0J
            if (r0 != 0) goto L_0x039a
            android.view.View r0 = r11.A1d()
            if (r0 == 0) goto L_0x03c3
        L_0x039a:
            java.lang.Runnable r1 = r11.A0M
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x03a3
            r0.removeCallbacks(r1)
        L_0x03a3:
            boolean r0 = r11.A1i()
            if (r0 == 0) goto L_0x03c3
        L_0x03a9:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x03b0
            r8.A00()
        L_0x03b0:
            boolean r0 = r8.A03
            r11.A0B = r0
            boolean r0 = r11.A1j()
            r11.A0C = r0
            if (r6 == 0) goto L_0x0017
            r8.A00()
            r11.A0H(r12, r13, r7)
            return
        L_0x03c3:
            r6 = 0
            goto L_0x03a9
        L_0x03c5:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r11.A01(r0)
            if (r2 == r0) goto L_0x03e2
            X.3BB r1 = r11.A07
            int r0 = r1.A06()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03e2
            int r0 = r11.A1c(r12, r13, r2)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03e2
            int r0 = -r2
            r1.A0E(r0)
        L_0x03e2:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r11.A00(r0)
            if (r1 == r0) goto L_0x0380
            X.3BB r0 = r11.A07
            int r0 = r0.A03()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0380
            int r1 = -r0
            goto L_0x037d
        L_0x03f5:
            if (r4 >= r5) goto L_0x0344
            android.view.View r2 = r11.A0X(r4)
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            X.7kM r9 = (X.C339907kM) r9
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0421
            boolean r0 = r11.A1j()
            if (r0 == 0) goto L_0x0424
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0424
            int r1 = r11.A06
            int r1 = r1 - r6
            X.9ND r0 = r9.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            int r9 = -r1
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
        L_0x041d:
            int r1 = r1 - r9
            r2.offsetLeftAndRight(r1)
        L_0x0421:
            int r4 = r4 + 1
            goto L_0x03f5
        L_0x0424:
            X.9ND r0 = r9.A00
            int r9 = r0.A04
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
            int r0 = r11.A02
            if (r0 == r6) goto L_0x041d
            int r1 = r1 - r9
            r2.offsetTopAndBottom(r1)
            goto L_0x0421
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0H(X.3AN, X.3AW, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(X.AnonymousClass3AW r8, int r9) {
        /*
            r7 = this;
            X.OLo r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A01 = r9
            X.52T r0 = r7.A06
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r6 = 1
            if (r0 == 0) goto L_0x0064
            int r5 = r8.A06
            r0 = -1
            if (r5 == r0) goto L_0x0064
            boolean r2 = r7.A0E
            r1 = 0
            if (r5 >= r9) goto L_0x001f
            r1 = 1
        L_0x001f:
            X.3BB r0 = r7.A07
            int r5 = r0.A07()
            if (r2 == r1) goto L_0x0065
            r2 = r5
            r5 = 0
        L_0x0029:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x0032
            boolean r1 = r0.A0O
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            X.3BB r1 = r7.A07
            if (r0 == 0) goto L_0x0059
            int r0 = r1.A06()
            int r0 = r0 - r2
            r4.A05 = r0
            int r0 = r1.A03()
            int r0 = r0 + r5
            r4.A02 = r0
        L_0x0045:
            r4.A08 = r3
            r4.A07 = r6
            int r0 = r1.A05()
            if (r0 != 0) goto L_0x0056
            int r0 = r1.A02()
            if (r0 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            r4.A06 = r3
            return
        L_0x0059:
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A02 = r0
            int r0 = -r2
            r4.A05 = r0
            goto L_0x0045
        L_0x0064:
            r5 = 0
        L_0x0065:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0I(X.3AW, int):void");
    }

    private void A0J(AnonymousClass9ND r5, int i, int i2) {
        int i3 = r5.A02;
        if (i == -1) {
            int i4 = r5.A01;
            if (i4 == Integer.MIN_VALUE) {
                r5.A08();
                i4 = r5.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = r5.A00;
            if (i5 == Integer.MIN_VALUE) {
                r5.A07();
                i5 = r5.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0I.set(r5.A04, false);
    }

    public static void A0K(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2, int i3) {
        int A1a;
        int i4;
        int i5;
        int A1b;
        if (staggeredGridLayoutManager.A0E) {
            A1a = staggeredGridLayoutManager.A1b();
        } else {
            A1a = staggeredGridLayoutManager.A1a();
        }
        if (i3 == 8) {
            i4 = i2 + 1;
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
            }
            i5 = i;
        } else {
            i4 = i + i2;
            i5 = i;
        }
        C11042S7b s7b = staggeredGridLayoutManager.A09;
        s7b.A04(i5);
        if (i3 == 1) {
            s7b.A05(i, i2);
        } else if (i3 == 2) {
            s7b.A06(i, i2);
        } else if (i3 == 8) {
            s7b.A06(i, 1);
            s7b.A05(i2, 1);
        }
        if (i4 > A1a) {
            if (staggeredGridLayoutManager.A0E) {
                A1b = staggeredGridLayoutManager.A1a();
            } else {
                A1b = staggeredGridLayoutManager.A1b();
            }
            if (i5 <= A1b) {
                staggeredGridLayoutManager.A0b();
            }
        }
    }

    private boolean A0L(int i) {
        if (this.A02 == 0) {
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (z != this.A0E) {
                return true;
            }
            return false;
        }
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        boolean z3 = false;
        if (z2 == this.A0E) {
            z3 = true;
        }
        if (z3 == A1j()) {
            return true;
        }
        return false;
    }

    public final AnonymousClass3MX A18(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass3MX((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass3MX(layoutParams);
    }

    public final void A1C(RecyclerView recyclerView) {
        this.A09.A01();
        A0b();
    }

    public final void A1G(String str) {
        if (this.A0A == null) {
            super.A1G(str);
        }
    }

    public final boolean A1J() {
        if (this.A0A == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    public final Parcelable A1M() {
        ? obj;
        int A1a;
        View A1f;
        int A062;
        int A032;
        int A063;
        int[] iArr;
        SavedState savedState = this.A0A;
        if (savedState != null) {
            obj.A02 = savedState.A02;
            obj.A00 = savedState.A00;
            obj.A03 = savedState.A03;
            obj.A09 = savedState.A09;
            obj.A01 = savedState.A01;
            obj.A08 = savedState.A08;
            obj.A07 = savedState.A07;
            obj.A05 = savedState.A05;
            obj.A06 = savedState.A06;
            obj.A04 = savedState.A04;
        } else {
            obj = new Object();
            obj.A07 = this.A0D;
            obj.A05 = this.A0B;
            obj.A06 = this.A0C;
            C11042S7b s7b = this.A09;
            if (s7b == null || (iArr = s7b.A01) == null) {
                obj.A01 = 0;
            } else {
                obj.A08 = iArr;
                obj.A01 = iArr.length;
                obj.A04 = s7b.A00;
            }
            if (A0T() > 0) {
                if (this.A0B) {
                    A1a = A1b();
                } else {
                    A1a = A1a();
                }
                obj.A00 = A1a;
                if (this.A0E) {
                    A1f = A1e(true);
                } else {
                    A1f = A1f(true);
                }
                if (A1f == null) {
                    A062 = -1;
                } else {
                    A062 = C252553pI.A06(A1f);
                }
                obj.A03 = A062;
                int i = this.A06;
                obj.A02 = i;
                obj.A09 = new int[i];
                for (int i2 = 0; i2 < this.A06; i2++) {
                    boolean z = this.A0B;
                    AnonymousClass9ND r0 = this.A0H[i2];
                    if (z) {
                        A032 = r0.A02(AnonymousClass972.MUTABLE_FLAG_MASK);
                        if (A032 != Integer.MIN_VALUE) {
                            A063 = this.A07.A03();
                        } else {
                            obj.A09[i2] = A032;
                        }
                    } else {
                        A032 = r0.A03(AnonymousClass972.MUTABLE_FLAG_MASK);
                        if (A032 != Integer.MIN_VALUE) {
                            A063 = this.A07.A06();
                        } else {
                            obj.A09[i2] = A032;
                        }
                    }
                    A032 -= A063;
                    obj.A09[i2] = A032;
                }
            } else {
                obj.A00 = -1;
                obj.A03 = -1;
                obj.A02 = 0;
                return obj;
            }
        }
        return obj;
    }

    public final AnonymousClass3MX A1N(Context context, AttributeSet attributeSet) {
        return new AnonymousClass3MX(context, attributeSet);
    }

    public final void A1O(int i) {
        SavedState savedState = this.A0A;
        if (!(savedState == null || savedState.A00 == i)) {
            savedState.A09 = null;
            savedState.A02 = 0;
            savedState.A00 = -1;
            savedState.A03 = -1;
        }
        this.A03 = i;
        this.A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
        A0b();
    }

    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A0A = savedState;
            if (this.A03 != -1) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A01 = 0;
                savedState.A08 = null;
                savedState.A04 = null;
            }
            A0b();
        }
    }

    public final void A1Q(2Rw r3, 2Rw r4) {
        this.A09.A01();
        for (int i = 0; i < this.A06; i++) {
            this.A0H[i].A09();
        }
    }

    public final boolean A1X() {
        if (this.A02 == 0) {
            return true;
        }
        return false;
    }

    public final boolean A1Y() {
        if (this.A02 != 1) {
            return false;
        }
        return true;
    }

    public final View A1e(boolean z) {
        AnonymousClass3BB r7 = this.A07;
        int A062 = r7.A06();
        int A032 = r7.A03();
        View view = null;
        for (int A0T = A0T() - 1; A0T >= 0; A0T--) {
            View A0X = A0X(A0T);
            int A0D2 = r7.A0D(A0X);
            int A082 = r7.A08(A0X);
            if (A082 > A062 && A0D2 < A032) {
                if (A082 <= A032 || !z) {
                    return A0X;
                }
                if (view == null) {
                    view = A0X;
                }
            }
        }
        return view;
    }

    public final View A1f(boolean z) {
        AnonymousClass3BB r8 = this.A07;
        int A062 = r8.A06();
        int A032 = r8.A03();
        int A0T = A0T();
        View view = null;
        for (int i = 0; i < A0T; i++) {
            View A0X = A0X(i);
            int A0D2 = r8.A0D(A0X);
            if (r8.A08(A0X) > A062 && A0D2 < A032) {
                if (A0D2 >= A062 || !z) {
                    return A0X;
                }
                if (view == null) {
                    view = A0X;
                }
            }
        }
        return view;
    }

    public final boolean A1j() {
        if (this.A07.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.S7b, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C238093An.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i3 == 0 || i3 == 1) {
            A1G((String) null);
            if (i3 != this.A02) {
                this.A02 = i3;
                AnonymousClass3BB r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0b();
            }
            A1g(i4);
            A1G((String) null);
            SavedState savedState = this.A0A;
            if (!(savedState == null || savedState.A07 == z)) {
                savedState.A07 = z;
            }
            this.A0D = z;
            A0b();
            this.A0L = new C70793OLo();
            this.A07 = AnonymousClass3BB.A00(this, this.A02);
            this.A08 = AnonymousClass3BB.A00(this, 1 - this.A02);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final void A19(int i) {
        super.A19(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass9ND r2 = this.A0H[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public final void A1A(int i) {
        super.A1A(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass9ND r2 = this.A0H[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public final void A1B(Rect rect, int i, int i2) {
        int A032;
        int A033;
        int Ba9 = Ba9() + BaB();
        int BaC = BaC() + Ba8();
        if (this.A02 == 1) {
            A033 = C252553pI.A03(i2, rect.height() + BaC, this.A07.getMinimumHeight());
            A032 = C252553pI.A03(i, (this.A05 * this.A06) + Ba9, this.A07.getMinimumWidth());
        } else {
            A032 = C252553pI.A03(i, rect.width() + Ba9, this.A07.getMinimumWidth());
            A033 = C252553pI.A03(i2, (this.A05 * this.A06) + BaC, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A032, A033);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r11.A02 == 1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (A1j() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        if (A1j() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        if (r11.A02 == 0) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0123 A[LOOP:3: B:94:0x0123->B:103:0x013a, LOOP_START, PHI: r6 
      PHI: (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:80:0x00fd, B:103:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A1E(android.view.View r12, X.AnonymousClass3AN r13, X.AnonymousClass3AW r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.A0T()
            r10 = 0
            if (r0 == 0) goto L_0x0142
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x0142
            android.view.View r2 = r0.A0V(r12)
            if (r2 == 0) goto L_0x0142
            X.3Aj r0 = r11.A05
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0142
            r11.A0E()
            r7 = 1
            if (r15 == r7) goto L_0x0095
            r0 = 2
            if (r15 == r0) goto L_0x008a
            r0 = 17
            if (r15 == r0) goto L_0x00a0
            r0 = 33
            if (r15 == r0) goto L_0x0085
            r0 = 66
            if (r15 == r0) goto L_0x0080
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0142
            int r0 = r11.A02
            if (r0 != r7) goto L_0x0142
        L_0x0038:
            r8 = 1
        L_0x0039:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.7kM r0 = (X.C339907kM) r0
            boolean r9 = r0.A01
            X.9ND r5 = r0.A00
            if (r8 != r7) goto L_0x007b
            int r3 = r11.A1b()
        L_0x0049:
            r11.A0I(r14, r3)
            r11.A0F(r8)
            X.OLo r4 = r11.A0L
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A01 = r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.3BB r0 = r11.A07
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.A00 = r0
            r4.A08 = r7
            r6 = 0
            r4.A07 = r6
            r11.A0C(r4, r13, r14)
            boolean r0 = r11.A0E
            r11.A0B = r0
            if (r9 != 0) goto L_0x00a6
            android.view.View r0 = r5.A06(r3, r8)
            if (r0 == 0) goto L_0x00a6
            if (r0 == r2) goto L_0x00a6
            return r0
        L_0x007b:
            int r3 = r11.A1a()
            goto L_0x0049
        L_0x0080:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0142
            goto L_0x0038
        L_0x0085:
            int r0 = r11.A02
            if (r0 != r7) goto L_0x0142
            goto L_0x00a4
        L_0x008a:
            int r0 = r11.A02
            if (r0 == r7) goto L_0x0038
            boolean r0 = r11.A1j()
            if (r0 == 0) goto L_0x0038
            goto L_0x00a4
        L_0x0095:
            int r0 = r11.A02
            if (r0 == r7) goto L_0x00a4
            boolean r0 = r11.A1j()
            if (r0 == 0) goto L_0x00a4
            goto L_0x0038
        L_0x00a0:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0142
        L_0x00a4:
            r8 = -1
            goto L_0x0039
        L_0x00a6:
            boolean r0 = r11.A0L(r8)
            if (r0 == 0) goto L_0x00c1
            int r1 = r11.A06
            int r1 = r1 - r7
        L_0x00af:
            if (r1 < 0) goto L_0x00d6
            X.9ND[] r0 = r11.A0H
            r0 = r0[r1]
            android.view.View r0 = r0.A06(r3, r8)
            if (r0 == 0) goto L_0x00be
            if (r0 == r2) goto L_0x00be
            return r0
        L_0x00be:
            int r1 = r1 + -1
            goto L_0x00af
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            int r0 = r11.A06
            if (r1 >= r0) goto L_0x00d6
            X.9ND[] r0 = r11.A0H
            r0 = r0[r1]
            android.view.View r0 = r0.A06(r3, r8)
            if (r0 == 0) goto L_0x00d3
            if (r0 == r2) goto L_0x00d3
            return r0
        L_0x00d3:
            int r1 = r1 + 1
            goto L_0x00c2
        L_0x00d6:
            boolean r0 = r11.A0D
            r4 = r0 ^ 1
            r1 = -1
            r0 = 0
            if (r8 != r1) goto L_0x00df
            r0 = 1
        L_0x00df:
            r3 = 0
            if (r4 != r0) goto L_0x00e3
            r3 = 1
        L_0x00e3:
            if (r9 != 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00f4
            int r0 = r5.A00()
        L_0x00eb:
            android.view.View r0 = r11.A1D(r0)
            if (r0 == 0) goto L_0x00f9
            if (r0 == r2) goto L_0x00f9
            return r0
        L_0x00f4:
            int r0 = r5.A01()
            goto L_0x00eb
        L_0x00f9:
            boolean r0 = r11.A0L(r8)
            if (r0 == 0) goto L_0x0123
            int r1 = r11.A06
            int r1 = r1 - r7
        L_0x0102:
            if (r1 < 0) goto L_0x0142
            int r0 = r5.A04
            if (r1 == r0) goto L_0x0120
            X.9ND[] r0 = r11.A0H
            r0 = r0[r1]
            if (r3 == 0) goto L_0x011b
            int r0 = r0.A00()
        L_0x0112:
            android.view.View r0 = r11.A1D(r0)
            if (r0 == 0) goto L_0x0120
            if (r0 == r2) goto L_0x0120
            return r0
        L_0x011b:
            int r0 = r0.A01()
            goto L_0x0112
        L_0x0120:
            int r1 = r1 + -1
            goto L_0x0102
        L_0x0123:
            int r0 = r11.A06
            if (r6 >= r0) goto L_0x0142
            X.9ND[] r0 = r11.A0H
            r0 = r0[r6]
            if (r3 == 0) goto L_0x013d
            int r0 = r0.A00()
        L_0x0131:
            android.view.View r0 = r11.A1D(r0)
            if (r0 == 0) goto L_0x013a
            if (r0 == r2) goto L_0x013a
            return r0
        L_0x013a:
            int r6 = r6 + 1
            goto L_0x0123
        L_0x013d:
            int r0 = r0.A01()
            goto L_0x0131
        L_0x0142:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1E(android.view.View, X.3AN, X.3AW, int):android.view.View");
    }

    public final void A1F(AccessibilityEvent accessibilityEvent) {
        super.A1F(accessibilityEvent);
        if (A0T() > 0) {
            View A1f = A1f(false);
            View A1e = A1e(false);
            if (A1f != null && A1e != null) {
                int A062 = C252553pI.A06(A1f);
                int A063 = C252553pI.A06(A1e);
                if (A062 < A063) {
                    accessibilityEvent.setFromIndex(A062);
                    accessibilityEvent.setToIndex(A063);
                    return;
                }
                accessibilityEvent.setFromIndex(A063);
                accessibilityEvent.setToIndex(A062);
            }
        }
    }

    public final int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        return A1c(r2, r3, i);
    }

    public final int A1L(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        return A1c(r2, r3, i);
    }

    public final void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        AnonymousClass52S r0 = new AnonymousClass52S(recyclerView.getContext());
        r0.A00 = i;
        A0t(r0);
    }

    public final int A1a() {
        if (A0T() != 0) {
            return C252553pI.A06(A0X(0));
        }
        return 0;
    }

    public final int A1b() {
        int A0T = A0T();
        if (A0T == 0) {
            return 0;
        }
        return C252553pI.A06(A0X(A0T - 1));
    }

    public final int A1c(AnonymousClass3AN r5, AnonymousClass3AW r6, int i) {
        if (A0T() == 0 || i == 0) {
            return 0;
        }
        A1h(r6, i);
        C70793OLo oLo = this.A0L;
        int A0C2 = A0C(oLo, r5, r6);
        if (oLo.A00 >= A0C2) {
            int i2 = i;
            i = A0C2;
            if (i2 < 0) {
                i = -A0C2;
            }
        }
        this.A07.A0E(-i);
        this.A0B = this.A0E;
        oLo.A00 = 0;
        A0G(oLo, r5);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (A1j() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A1d() {
        /*
            r11 = this;
            int r6 = r11.A0T()
            r2 = 1
            int r6 = r6 - r2
            int r1 = r11.A06
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r1)
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r2) goto L_0x001d
            boolean r0 = r11.A1j()
            r9 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r9 = -1
        L_0x001e:
            boolean r0 = r11.A0E
            r4 = -1
            if (r0 != 0) goto L_0x0026
            int r4 = r6 + 1
            r6 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0029
            r10 = 1
        L_0x0029:
            if (r6 == r4) goto L_0x00d8
            android.view.View r3 = r11.A0X(r6)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.7kM r7 = (X.C339907kM) r7
            X.9ND r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0091
            X.9ND r8 = r7.A00
            boolean r0 = r11.A0E
            r2 = 0
            if (r0 == 0) goto L_0x0074
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0051
            r8.A07()
            int r1 = r8.A00
        L_0x0051:
            X.3BB r0 = r11.A07
            int r0 = r0.A03()
            if (r1 >= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            int r0 = r1.size()
            int r2 = r0 + -1
        L_0x0061:
            java.lang.Object r0 = r1.get(r2)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.7kM r0 = (X.C339907kM) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            return r3
        L_0x0074:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x007f
            r8.A08()
            int r1 = r8.A01
        L_0x007f:
            X.3BB r0 = r11.A07
            int r0 = r0.A06()
            if (r1 <= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            goto L_0x0061
        L_0x008a:
            X.9ND r0 = r7.A00
            int r0 = r0.A04
            r5.clear(r0)
        L_0x0091:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d5
            int r0 = r6 + r10
            if (r0 == r4) goto L_0x00d5
            android.view.View r2 = r11.A0X(r0)
            boolean r1 = r11.A0E
            X.3BB r0 = r11.A07
            if (r1 == 0) goto L_0x00ae
            int r1 = r0.A08(r3)
            int r0 = r0.A08(r2)
            if (r1 >= r0) goto L_0x00b9
            return r3
        L_0x00ae:
            int r1 = r0.A0D(r3)
            int r0 = r0.A0D(r2)
            if (r1 <= r0) goto L_0x00b9
            return r3
        L_0x00b9:
            if (r1 != r0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.7kM r1 = (X.C339907kM) r1
            X.9ND r0 = r7.A00
            int r2 = r0.A04
            X.9ND r0 = r1.A00
            int r0 = r0.A04
            int r2 = r2 - r0
            r1 = 0
            if (r2 >= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            r0 = 0
            if (r9 >= 0) goto L_0x00d2
            r0 = 1
        L_0x00d2:
            if (r1 == r0) goto L_0x00d5
            return r3
        L_0x00d5:
            int r6 = r6 + r10
            goto L_0x0029
        L_0x00d8:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1d():android.view.View");
    }

    public final boolean A1i() {
        int A1a;
        int A1b;
        int i;
        int i2;
        if (!(A0T() == 0 || this.A01 == 0 || !this.A0B)) {
            if (this.A0E) {
                A1a = A1b();
                A1b = A1a();
            } else {
                A1a = A1a();
                A1b = A1b();
            }
            if (A1a == 0 && A1d() != null) {
                this.A09.A01();
            } else if (this.A0J) {
                int i3 = 1;
                if (this.A0E) {
                    i3 = -1;
                }
                C11042S7b s7b = this.A09;
                int i4 = A1b + 1;
                List list = s7b.A00;
                if (list != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) s7b.A00.get(i5);
                        int i6 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                        if (i6 >= i4) {
                            break;
                        } else if (i6 < A1a || (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A00 != i3 && !staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A02)) {
                            i5++;
                        } else {
                            int i7 = -i3;
                            List list2 = s7b.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) s7b.A00.get(i8);
                                        i2 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A01;
                                        if (i2 >= i6) {
                                            break;
                                        } else if (i2 < A1a || !(i7 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A00 == i7 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A02)) {
                                            i8++;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i = i2 + 1;
                                s7b.A03(i);
                            }
                            i = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                            s7b.A03(i);
                        }
                    }
                }
                this.A0J = false;
                s7b.A03(i4);
            }
            this.A0F = true;
            A0b();
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 != r4.A0E) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A0E != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF AIp(int r5) {
        /*
            r4 = this;
            int r0 = r4.A0T()
            r3 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            int r0 = r4.A02
            r1 = 0
            if (r0 != 0) goto L_0x0029
            float r0 = (float) r3
            r2.x = r0
            r2.y = r1
            return r2
        L_0x001c:
            int r0 = r4.A1a()
            r1 = 0
            if (r5 >= r0) goto L_0x0024
            r1 = 1
        L_0x0024:
            boolean r0 = r4.A0E
            if (r1 == r0) goto L_0x000b
            goto L_0x000c
        L_0x0029:
            r2.x = r1
            float r0 = (float) r3
            r2.y = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.AIp(int):android.graphics.PointF");
    }

    public final boolean A1Z(AnonymousClass3MX r2) {
        return r2 instanceof C339907kM;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.S7b, java.lang.Object] */
    public StaggeredGridLayoutManager(int i, int i2) {
        this.A02 = i2;
        A1g(i);
        this.A0L = new C70793OLo();
        this.A07 = AnonymousClass3BB.A00(this, this.A02);
        this.A08 = AnonymousClass3BB.A00(this, 1 - this.A02);
    }
}
