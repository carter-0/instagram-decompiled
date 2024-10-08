package androidx.recyclerview.widget;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3B9;
import X.AnonymousClass3MX;
import X.C238093An;
import X.C252553pI;
import X.C320796sy;
import X.C320806sz;
import X.C320856t4;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class GridLayoutManager extends LinearLayoutManager {
    public int A00 = -1;
    public C320806sz A01 = new C320796sy();
    public boolean A02 = false;
    public boolean A03;
    public int[] A04;
    public View[] A05;
    public final Rect A06 = new Rect();
    public final SparseIntArray A07 = new SparseIntArray();
    public final SparseIntArray A08 = new SparseIntArray();

    public static int A00(GridLayoutManager gridLayoutManager, AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        if (!r5.A08) {
            return gridLayoutManager.A01.A02(i, gridLayoutManager.A00);
        }
        int A032 = r4.A03(i);
        if (A032 != -1) {
            return gridLayoutManager.A01.A02(A032, gridLayoutManager.A00);
        }
        Log.w("GridLayoutManager", 002.A0O("Cannot find span size for pre layout position. ", i));
        return 0;
    }

    private int A0C(AnonymousClass3AN r7, AnonymousClass3AW r8, int i) {
        if (!r8.A08) {
            C320806sz r3 = this.A01;
            int i2 = this.A00;
            if (!r3.A00) {
                return r3.A01(i, i2);
            }
            SparseIntArray sparseIntArray = r3.A02;
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int A012 = r3.A01(i, i2);
            sparseIntArray.put(i, A012);
            return A012;
        }
        int i4 = this.A07.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int A032 = r7.A03(i);
        if (A032 == -1) {
            Log.w("GridLayoutManager", 002.A0O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
            return 0;
        }
        C320806sz r2 = this.A01;
        int i5 = this.A00;
        if (!r2.A00) {
            return r2.A01(A032, i5);
        }
        SparseIntArray sparseIntArray2 = r2.A02;
        int i6 = sparseIntArray2.get(A032, -1);
        if (i6 != -1) {
            return i6;
        }
        int A013 = r2.A01(A032, i5);
        sparseIntArray2.put(A032, A013);
        return A013;
    }

    private int A0D(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        if (!r5.A08) {
            return this.A01.A00(i);
        }
        int i2 = this.A08.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A032 = r4.A03(i);
        if (A032 != -1) {
            return this.A01.A00(A032);
        }
        Log.w("GridLayoutManager", 002.A0O("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
        return 1;
    }

    private void A0E() {
        View[] viewArr = this.A05;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A05 = new View[this.A00];
        }
    }

    private void A0F() {
        int Ba8;
        int BaC;
        if (this.A01 == 1) {
            Ba8 = this.A03 - BaB();
            BaC = Ba9();
        } else {
            Ba8 = this.A00 - Ba8();
            BaC = BaC();
        }
        A0G(Ba8 - BaC);
    }

    private void A0G(int i) {
        int i2;
        int length;
        int[] iArr = this.A04;
        int i3 = this.A00;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A04 = iArr;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3MX, X.6t4] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3MX A18(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0012
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            X.6t4 r1 = new X.6t4
            r1.<init>((android.view.ViewGroup.MarginLayoutParams) r3)
        L_0x000b:
            r0 = -1
            r1.A00 = r0
            r0 = 0
            r1.A01 = r0
            return r1
        L_0x0012:
            X.6t4 r1 = new X.6t4
            r1.<init>((android.view.ViewGroup.LayoutParams) r3)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A18(android.view.ViewGroup$LayoutParams):X.3MX");
    }

    public final void A1B(Rect rect, int i, int i2) {
        int A032;
        int A033;
        if (this.A04 == null) {
            super.A1B(rect, i, i2);
        }
        int Ba9 = Ba9() + BaB();
        int BaC = BaC() + Ba8();
        if (this.A01 == 1) {
            A033 = C252553pI.A03(i2, rect.height() + BaC, this.A07.getMinimumHeight());
            int[] iArr = this.A04;
            A032 = C252553pI.A03(i, iArr[iArr.length - 1] + Ba9, this.A07.getMinimumWidth());
        } else {
            A032 = C252553pI.A03(i, rect.width() + Ba9, this.A07.getMinimumWidth());
            int[] iArr2 = this.A04;
            A033 = C252553pI.A03(i2, iArr2[iArr2.length - 1] + BaC, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A032, A033);
    }

    public final void A1C(RecyclerView recyclerView) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (A1u() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        if (r4 <= r17) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
        if (r4 > r16) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A1E(android.view.View r25, X.AnonymousClass3AN r26, X.AnonymousClass3AW r27, int r28) {
        /*
            r24 = this;
            r8 = r24
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            r21 = 0
            r4 = r25
            if (r0 == 0) goto L_0x001a
            android.view.View r2 = r0.A0V(r4)
            if (r2 == 0) goto L_0x001a
            X.3Aj r0 = r8.A05
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r2 = r21
        L_0x001c:
            r20 = 0
            if (r2 == 0) goto L_0x008b
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.6t4 r0 = (X.C320856t4) r0
            int r7 = r0.A00
            int r0 = r0.A01
            int r6 = r7 + r0
            r23 = r26
            r22 = r27
            r3 = r28
            r1 = r23
            r0 = r22
            android.view.View r0 = super.A1E(r4, r1, r0, r3)
            if (r0 == 0) goto L_0x008b
            int r0 = r8.A1e(r3)
            r3 = 1
            r1 = 0
            if (r0 != r3) goto L_0x0045
            r1 = 1
        L_0x0045:
            boolean r0 = r8.A09
            int r10 = r8.A0T()
            r9 = 0
            r19 = 1
            if (r1 == r0) goto L_0x0055
            int r9 = r10 - r3
            r10 = -1
            r19 = -1
        L_0x0055:
            int r0 = r8.A01
            if (r0 != r3) goto L_0x0060
            boolean r0 = r8.A1u()
            r5 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r1 = r23
            r0 = r22
            int r18 = A00(r8, r1, r0, r9)
            r12 = 0
            r17 = -1
            r16 = -1
            r11 = 0
        L_0x006f:
            if (r9 == r10) goto L_0x0102
            r1 = r23
            r0 = r22
            int r1 = A00(r8, r1, r0, r9)
            android.view.View r14 = r8.A0X(r9)
            if (r14 == r2) goto L_0x0102
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x008c
            r0 = r18
            if (r1 == r0) goto L_0x008c
            if (r20 == 0) goto L_0x00c9
        L_0x008b:
            return r20
        L_0x008c:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            X.6t4 r13 = (X.C320856t4) r13
            int r4 = r13.A00
            int r0 = r13.A01
            int r3 = r4 + r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00a3
            if (r4 != r7) goto L_0x00a3
            if (r3 != r6) goto L_0x00a3
            return r14
        L_0x00a3:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00ab
            if (r20 == 0) goto L_0x00b3
        L_0x00ab:
            boolean r0 = r14.hasFocusable()
            if (r0 != 0) goto L_0x00d3
            if (r21 != 0) goto L_0x00d3
        L_0x00b3:
            boolean r15 = r14.hasFocusable()
            int r13 = r13.A00
            int r1 = java.lang.Math.min(r3, r6)
            int r0 = java.lang.Math.max(r4, r7)
            if (r15 == 0) goto L_0x00cc
            int r12 = r1 - r0
            r17 = r13
            r20 = r14
        L_0x00c9:
            int r9 = r9 + r19
            goto L_0x006f
        L_0x00cc:
            int r11 = r1 - r0
            r16 = r13
            r21 = r14
            goto L_0x00c9
        L_0x00d3:
            int r0 = java.lang.Math.max(r4, r7)
            int r15 = java.lang.Math.min(r3, r6)
            int r15 = r15 - r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00ef
            if (r15 > r12) goto L_0x00b3
            if (r15 != r12) goto L_0x00c9
            r1 = 1
            r0 = r17
            if (r4 > r0) goto L_0x00ec
        L_0x00eb:
            r1 = 0
        L_0x00ec:
            if (r5 != r1) goto L_0x00c9
            goto L_0x00b3
        L_0x00ef:
            if (r20 != 0) goto L_0x00c9
            r0 = 0
            r1 = 1
            boolean r0 = r8.A10(r14, r0)
            if (r0 == 0) goto L_0x00c9
            if (r15 > r11) goto L_0x00b3
            if (r15 != r11) goto L_0x00c9
            r0 = r16
            if (r4 <= r0) goto L_0x00eb
            goto L_0x00ec
        L_0x0102:
            if (r20 != 0) goto L_0x008b
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1E(android.view.View, X.3AN, X.3AW, int):android.view.View");
    }

    public boolean A1J() {
        if (this.A05 != null || this.A02) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3MX, X.6t4] */
    public final AnonymousClass3MX A1N(Context context, AttributeSet attributeSet) {
        ? r1 = new AnonymousClass3MX(context, attributeSet);
        r1.A00 = -1;
        r1.A01 = 0;
        return r1;
    }

    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        this.A01.A02.clear();
        this.A01.A01.clear();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8  */
    public final void A1r(X.AnonymousClass3BA r21, X.C240123Jr r22, X.AnonymousClass3AN r23, X.AnonymousClass3AW r24) {
        /*
            r20 = this;
            r4 = r20
            X.3BB r1 = r4.A06
            boolean r0 = r1 instanceof X.C238673Cy
            if (r0 == 0) goto L_0x0071
            X.3pI r0 = r1.A02
            int r11 = r0.A04
        L_0x000c:
            r8 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r2 = 0
            r19 = 0
            if (r11 == r8) goto L_0x0016
            r19 = 1
        L_0x0016:
            int r0 = r4.A0T()
            if (r0 <= 0) goto L_0x006f
            int[] r1 = r4.A04
            int r0 = r4.A00
            r10 = r1[r0]
        L_0x0022:
            if (r19 == 0) goto L_0x0027
            r4.A0F()
        L_0x0027:
            r6 = r22
            int r0 = r6.A03
            r18 = 0
            if (r0 != r5) goto L_0x0031
            r18 = 1
        L_0x0031:
            int r7 = r4.A00
            r12 = r23
            r9 = r24
            if (r18 != 0) goto L_0x0046
            int r0 = r6.A01
            int r7 = r4.A0C(r12, r9, r0)
            int r0 = r6.A01
            int r0 = r4.A0D(r12, r9, r0)
            int r7 = r7 + r0
        L_0x0046:
            r3 = 0
        L_0x0047:
            int r0 = r4.A00
            if (r3 >= r0) goto L_0x0088
            int r13 = r6.A01
            if (r13 < 0) goto L_0x0088
            int r0 = r9.A00()
            if (r13 >= r0) goto L_0x0088
            if (r7 <= 0) goto L_0x0088
            int r14 = r4.A0D(r12, r9, r13)
            int r15 = r4.A00
            if (r14 > r15) goto L_0x0076
            int r7 = r7 - r14
            if (r7 < 0) goto L_0x0088
            android.view.View r1 = r6.A00(r12)
            if (r1 == 0) goto L_0x0088
            android.view.View[] r0 = r4.A05
            r0[r3] = r1
            int r3 = r3 + 1
            goto L_0x0047
        L_0x006f:
            r10 = 0
            goto L_0x0022
        L_0x0071:
            X.3pI r0 = r1.A02
            int r11 = r0.A01
            goto L_0x000c
        L_0x0076:
            java.lang.String r9 = "Item at position "
            java.lang.String r10 = " requires "
            java.lang.String r11 = " spans but GridLayoutManager has only "
            java.lang.String r12 = " spans."
            java.lang.String r1 = X.002.A0z(r9, r10, r11, r12, r13, r14, r15)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0088:
            r7 = r21
            if (r3 != 0) goto L_0x008f
            r7.A01 = r5
            return
        L_0x008f:
            r17 = 0
            r15 = 0
            r14 = -1
            int r13 = r3 + -1
            r16 = -1
            if (r18 == 0) goto L_0x00b6
            r14 = r3
            r13 = 0
            r16 = 1
        L_0x009d:
            android.view.View[] r0 = r4.A05
            r0 = r0[r13]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.6t4 r1 = (X.C320856t4) r1
            int r0 = X.C252553pI.A06(r0)
            int r0 = r4.A0D(r12, r9, r0)
            r1.A01 = r0
            r1.A00 = r15
            int r15 = r15 + r0
            int r13 = r13 + r16
        L_0x00b6:
            if (r13 != r14) goto L_0x009d
            r12 = 0
            r9 = 0
        L_0x00ba:
            if (r12 >= r3) goto L_0x0107
            android.view.View[] r0 = r4.A05
            r1 = r0[r12]
            java.util.List r0 = r6.A09
            if (r0 != 0) goto L_0x00fc
            if (r18 == 0) goto L_0x00f8
            r0 = -1
            r4.A0h(r1, r0)
        L_0x00ca:
            android.graphics.Rect r0 = r4.A06
            r4.A0k(r1, r0)
            r4.A0I(r1, r11, r2)
            X.3BB r0 = r4.A06
            int r0 = r0.A0B(r1)
            if (r0 <= r9) goto L_0x00db
            r9 = r0
        L_0x00db:
            android.view.ViewGroup$LayoutParams r14 = r1.getLayoutParams()
            X.6t4 r14 = (X.C320856t4) r14
            r13 = 1065353216(0x3f800000, float:1.0)
            X.3BB r0 = r4.A06
            int r0 = r0.A0C(r1)
            float r1 = (float) r0
            float r1 = r1 * r13
            int r0 = r14.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            r17 = r1
        L_0x00f5:
            int r12 = r12 + 1
            goto L_0x00ba
        L_0x00f8:
            r4.A0h(r1, r2)
            goto L_0x00ca
        L_0x00fc:
            if (r18 == 0) goto L_0x0103
            r0 = -1
            X.C252553pI.A0A(r1, r4, r0, r5)
            goto L_0x00ca
        L_0x0103:
            X.C252553pI.A0A(r1, r4, r2, r5)
            goto L_0x00ca
        L_0x0107:
            if (r19 == 0) goto L_0x0130
            int r0 = r4.A00
            float r0 = (float) r0
            float r17 = r17 * r0
            int r0 = java.lang.Math.round(r17)
            int r0 = java.lang.Math.max(r0, r10)
            r4.A0G(r0)
            r10 = 0
            r9 = 0
        L_0x011b:
            if (r10 >= r3) goto L_0x0130
            android.view.View[] r0 = r4.A05
            r1 = r0[r10]
            r4.A0I(r1, r8, r5)
            X.3BB r0 = r4.A06
            int r0 = r0.A0B(r1)
            if (r0 <= r9) goto L_0x012d
            r9 = r0
        L_0x012d:
            int r10 = r10 + 1
            goto L_0x011b
        L_0x0130:
            r12 = 0
        L_0x0131:
            if (r12 >= r3) goto L_0x01a8
            android.view.View[] r0 = r4.A05
            r17 = r0[r12]
            X.3BB r1 = r4.A06
            r0 = r17
            int r0 = r1.A0B(r0)
            if (r0 == r9) goto L_0x018f
            android.view.ViewGroup$LayoutParams r14 = r17.getLayoutParams()
            X.6t4 r14 = (X.C320856t4) r14
            android.graphics.Rect r1 = r14.A02
            int r13 = r1.top
            int r0 = r1.bottom
            int r13 = r13 + r0
            int r0 = r14.topMargin
            int r13 = r13 + r0
            int r0 = r14.bottomMargin
            int r13 = r13 + r0
            int r11 = r1.left
            int r0 = r1.right
            int r11 = r11 + r0
            int r0 = r14.leftMargin
            int r11 = r11 + r0
            int r0 = r14.rightMargin
            int r11 = r11 + r0
            int r15 = r14.A00
            int r10 = r14.A01
            int r0 = r4.A01
            if (r0 != r5) goto L_0x019f
            boolean r0 = r4.A1u()
            if (r0 == 0) goto L_0x019f
            int[] r0 = r4.A04
            r16 = r0
            int r0 = r4.A00
            int r0 = r0 - r15
            r1 = r16[r0]
            int r0 = r0 - r10
            r0 = r16[r0]
            int r1 = r1 - r0
        L_0x017a:
            int r0 = r4.A01
            if (r0 != r5) goto L_0x0192
            int r0 = r14.width
            int r10 = X.C252553pI.A04(r1, r8, r11, r0, r2)
            int r0 = r9 - r13
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
        L_0x018a:
            r0 = r17
            r4.A0H(r0, r10, r1, r5)
        L_0x018f:
            int r12 = r12 + 1
            goto L_0x0131
        L_0x0192:
            int r0 = r9 - r11
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            int r0 = r14.height
            int r1 = X.C252553pI.A04(r1, r8, r13, r0, r2)
            goto L_0x018a
        L_0x019f:
            int[] r0 = r4.A04
            int r10 = r10 + r15
            r1 = r0[r10]
            r0 = r0[r15]
            int r1 = r1 - r0
            goto L_0x017a
        L_0x01a8:
            r10 = 0
            r7.A00 = r9
            int r0 = r4.A01
            r11 = -1
            int r1 = r6.A05
            if (r0 != r5) goto L_0x022a
            int r0 = r6.A07
            int r2 = r0 - r9
            if (r1 == r11) goto L_0x01bb
            int r9 = r9 + r0
            r2 = r0
            r0 = r9
        L_0x01bb:
            r8 = 0
            r6 = 0
        L_0x01bd:
            android.view.View[] r1 = r4.A05
            if (r10 >= r3) goto L_0x0236
            r11 = r1[r10]
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            X.6t4 r9 = (X.C320856t4) r9
            int r1 = r4.A01
            if (r1 != r5) goto L_0x0217
            boolean r1 = r4.A1u()
            int r8 = r4.Ba9()
            int[] r12 = r4.A04
            if (r1 == 0) goto L_0x0208
            int r6 = r4.A00
            int r1 = r9.A00
            int r6 = r6 - r1
            r1 = r12[r6]
            int r8 = r8 + r1
            X.3BB r1 = r4.A06
            int r1 = r1.A0C(r11)
            int r6 = r8 - r1
        L_0x01e9:
            X.C252553pI.A09(r11, r6, r2, r8, r0)
            X.3kE r9 = r9.mViewHolder
            boolean r1 = r9.isRemoved()
            if (r1 != 0) goto L_0x01fa
            boolean r1 = r9.isUpdated()
            if (r1 == 0) goto L_0x01fc
        L_0x01fa:
            r7.A03 = r5
        L_0x01fc:
            boolean r9 = r7.A02
            boolean r1 = r11.hasFocusable()
            r9 = r9 | r1
            r7.A02 = r9
            int r10 = r10 + 1
            goto L_0x01bd
        L_0x0208:
            int r1 = r9.A00
            r1 = r12[r1]
            int r8 = r8 + r1
            X.3BB r1 = r4.A06
            int r1 = r1.A0C(r11)
            int r1 = r1 + r8
            r6 = r8
            r8 = r1
            goto L_0x01e9
        L_0x0217:
            int r2 = r4.BaC()
            int[] r1 = r4.A04
            int r0 = r9.A00
            r0 = r1[r0]
            int r2 = r2 + r0
            X.3BB r0 = r4.A06
            int r0 = r0.A0C(r11)
            int r0 = r0 + r2
            goto L_0x01e9
        L_0x022a:
            int r0 = r6.A07
            int r8 = r9 + r0
            r6 = r0
            if (r1 != r11) goto L_0x0234
            int r6 = r0 - r9
            r8 = r0
        L_0x0234:
            r0 = 0
            goto L_0x01bd
        L_0x0236:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1r(X.3BA, X.3Jr, X.3AN, X.3AW):void");
    }

    public final void A1t(boolean z) {
        if (!z) {
            super.A1t(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void A1v(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i >= 1) {
                this.A00 = i;
                this.A01.A02.clear();
                A0b();
                return;
            }
            throw new IllegalArgumentException(002.A0O("Span count should be at least 1. Provided ", i));
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C238093An.A00, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(10, 1);
        obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1v(i3);
    }

    public static int A01(GridLayoutManager gridLayoutManager, AnonymousClass3AW r11) {
        int max;
        if (gridLayoutManager.A0T() == 0 || r11.A00() == 0) {
            return 0;
        }
        gridLayoutManager.A1n();
        boolean z = gridLayoutManager.A0A;
        boolean z2 = !z;
        View A1m = gridLayoutManager.A1m(z2);
        View A1l = gridLayoutManager.A1l(z2);
        if (A1m == null || A1l == null) {
            return 0;
        }
        int A022 = gridLayoutManager.A01.A02(C252553pI.A06(A1m), gridLayoutManager.A00);
        int A023 = gridLayoutManager.A01.A02(C252553pI.A06(A1l), gridLayoutManager.A00);
        int min = Math.min(A022, A023);
        int max2 = Math.max(A022, A023);
        int A024 = gridLayoutManager.A01.A02(r11.A00() - 1, gridLayoutManager.A00) + 1;
        if (gridLayoutManager.A09) {
            max = Math.max(0, (A024 - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(gridLayoutManager.A06.A08(A1l) - gridLayoutManager.A06.A0D(A1m))) / ((float) ((gridLayoutManager.A01.A02(C252553pI.A06(A1l), gridLayoutManager.A00) - gridLayoutManager.A01.A02(C252553pI.A06(A1m), gridLayoutManager.A00)) + 1)))) + ((float) (gridLayoutManager.A06.A06() - gridLayoutManager.A06.A0D(A1m))));
    }

    public static int A02(GridLayoutManager gridLayoutManager, AnonymousClass3AW r8) {
        if (gridLayoutManager.A0T() == 0 || r8.A00() == 0) {
            return 0;
        }
        gridLayoutManager.A1n();
        boolean z = gridLayoutManager.A0A;
        boolean z2 = !z;
        View A1m = gridLayoutManager.A1m(z2);
        View A1l = gridLayoutManager.A1l(z2);
        if (A1m == null || A1l == null) {
            return 0;
        }
        if (!z) {
            return gridLayoutManager.A01.A02(r8.A00() - 1, gridLayoutManager.A00) + 1;
        }
        return (int) ((((float) (gridLayoutManager.A06.A08(A1l) - gridLayoutManager.A06.A0D(A1m))) / ((float) ((gridLayoutManager.A01.A02(C252553pI.A06(A1l), gridLayoutManager.A00) - gridLayoutManager.A01.A02(C252553pI.A06(A1m), gridLayoutManager.A00)) + 1))) * ((float) (gridLayoutManager.A01.A02(r8.A00() - 1, gridLayoutManager.A00) + 1)));
    }

    private void A0H(View view, int i, int i2, boolean z) {
        AnonymousClass3MX r2 = (AnonymousClass3MX) view.getLayoutParams();
        if (z) {
            if (this.A0D && C252553pI.A0B(view.getMeasuredWidth(), i, r2.width) && C252553pI.A0B(view.getMeasuredHeight(), i2, r2.height)) {
                return;
            }
        } else if (!A0z(view, r2, i, i2)) {
            return;
        }
        view.measure(i, i2);
    }

    private void A0I(View view, int i, boolean z) {
        int i2;
        int A042;
        int A043;
        C320856t4 r5 = (C320856t4) view.getLayoutParams();
        Rect rect = r5.A02;
        int i3 = rect.top + rect.bottom + r5.topMargin + r5.bottomMargin;
        int i4 = rect.left + rect.right + r5.leftMargin + r5.rightMargin;
        int i5 = r5.A00;
        int i6 = r5.A01;
        if (this.A01 != 1 || !A1u()) {
            int[] iArr = this.A04;
            i2 = iArr[i6 + i5] - iArr[i5];
        } else {
            int[] iArr2 = this.A04;
            int i7 = this.A00 - i5;
            i2 = iArr2[i7] - iArr2[i7 - i6];
        }
        if (this.A01 == 1) {
            A043 = C252553pI.A04(i2, i, i4, r5.width, false);
            A042 = C252553pI.A04(this.A06.A07(), this.A01, i3, r5.height, true);
        } else {
            A042 = C252553pI.A04(i2, i, i3, r5.height, false);
            A043 = C252553pI.A04(this.A06.A07(), this.A04, i4, r5.width, true);
        }
        A0H(view, A043, A042, z);
    }

    public final void A17(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass3AN r3, AnonymousClass3AW r4) {
        super.A17(accessibilityNodeInfoCompat, r3, r4);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    public final int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        A0F();
        A0E();
        return super.A1K(r2, r3, i);
    }

    public final int A1L(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        A0F();
        A0E();
        return super.A1L(r2, r3, i);
    }

    public final void A1R(AnonymousClass3AN r8, AnonymousClass3AW r9) {
        int A032 = AnonymousClass0fD.A03(-29962045);
        if (r9.A08) {
            int A0T = A0T();
            for (int i = 0; i < A0T; i++) {
                C320856t4 r3 = (C320856t4) A0X(i).getLayoutParams();
                int layoutPosition = r3.mViewHolder.getLayoutPosition();
                this.A08.put(layoutPosition, r3.A01);
                this.A07.put(layoutPosition, r3.A00);
            }
        }
        super.A1R(r8, r9);
        this.A08.clear();
        this.A07.clear();
        AnonymousClass0fD.A0A(-652217396, A032);
    }

    public void A1S(AnonymousClass3AW r2) {
        super.A1S(r2);
        this.A02 = false;
    }

    public final View A1k(AnonymousClass3AN r11, AnonymousClass3AW r12, boolean z, boolean z2) {
        int i;
        int A0T = A0T();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = A0T() - 1;
            i3 = -1;
        } else {
            i2 = A0T;
            i = 0;
        }
        int A002 = r12.A00();
        A1n();
        int A062 = this.A06.A06();
        int A032 = this.A06.A03();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0X = A0X(i);
            int A063 = C252553pI.A06(A0X);
            if (A063 >= 0 && A063 < A002 && A0C(r11, r12, A063) == 0) {
                if (((AnonymousClass3MX) A0X.getLayoutParams()).mViewHolder.isRemoved()) {
                    if (view2 == null) {
                        view2 = A0X;
                    }
                } else if (this.A06.A0D(A0X) < A032 && this.A06.A08(A0X) >= A062) {
                    return A0X;
                } else {
                    if (view == null) {
                        view = A0X;
                    }
                }
            }
            i += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final void A1q(AnonymousClass3B9 r6, AnonymousClass3AN r7, AnonymousClass3AW r8, int i) {
        A0F();
        if (r8.A00() > 0 && !r8.A08) {
            boolean z = false;
            if (i == 1) {
                z = true;
            }
            int A0C = A0C(r7, r8, r6.A01);
            if (z) {
                while (A0C > 0) {
                    int i2 = r6.A01;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    r6.A01 = i3;
                    A0C = A0C(r7, r8, i3);
                }
            } else {
                int A002 = r8.A00() - 1;
                int i4 = r6.A01;
                while (i4 < A002) {
                    int i5 = i4 + 1;
                    int A0C2 = A0C(r7, r8, i5);
                    if (A0C2 <= A0C) {
                        break;
                    }
                    i4 = i5;
                    A0C = A0C2;
                }
                r6.A01 = i4;
            }
        }
        A0E();
    }

    public final boolean A1Z(AnonymousClass3MX r2) {
        return r2 instanceof C320856t4;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        A1v(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        A1v(i);
    }
}
