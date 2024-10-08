package com.instagram.common.ui.widget.recyclerview.flow;

import X.002;
import X.2Rw;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.C14323Tu0;
import X.C14429Tvy;
import X.C252553pI;
import X.C320536sX;
import X.W6D;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowingGridLayoutManager extends C252553pI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public final Rect A05 = new Rect();
    public final C14323Tu0 A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new W6D(91);
        public int A00;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
        }
    }

    public final void A1O(int i) {
        A1e(i, 0);
    }

    public final boolean A1Y() {
        return true;
    }

    public static int A00(FlowingGridLayoutManager flowingGridLayoutManager, int i, int i2) {
        int Ba8;
        C14323Tu0 tu0 = flowingGridLayoutManager.A06;
        Rect A002 = tu0.A00(i);
        if (A002 != null) {
            int i3 = 0;
            int i4 = 0;
            do {
                i4 = Math.max(i4, tu0.A03[i3]);
                i3++;
            } while (i3 < 3);
            int i5 = A002.top;
            if (i4 >= ((flowingGridLayoutManager.A00 - flowingGridLayoutManager.Ba8()) - flowingGridLayoutManager.BaC()) + i5 + i2) {
                Ba8 = i5 + i2;
                return Math.max(0, Ba8);
            }
        }
        int i6 = 0;
        int i7 = 0;
        do {
            i7 = Math.max(i7, tu0.A03[i6]);
            i6++;
        } while (i6 < 3);
        Ba8 = i7 - ((flowingGridLayoutManager.A00 - flowingGridLayoutManager.Ba8()) - flowingGridLayoutManager.BaC());
        return Math.max(0, Ba8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0.A0O == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.A0O
            r1 = 1
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            r0 = 0
            if (r1 == 0) goto L_0x005d
            int r6 = r7.Ba9()
        L_0x0011:
            int r4 = r7.A04
            if (r1 == 0) goto L_0x0019
            int r0 = r7.BaC()
        L_0x0019:
            int r4 = r4 + r0
            int r3 = r7.A03
            if (r1 == 0) goto L_0x0023
            int r0 = r7.BaB()
            int r3 = r3 - r0
        L_0x0023:
            int r2 = r7.A04
            if (r1 == 0) goto L_0x005a
            int r1 = r7.A00
            int r0 = r7.Ba8()
            int r1 = r1 - r0
        L_0x002e:
            int r2 = r2 + r1
            android.graphics.Rect r5 = r7.A05
            r5.set(r6, r4, r3, r2)
            X.Tu0 r4 = r7.A06
            java.util.List r3 = r7.A07
            r3.clear()
            r2 = 0
        L_0x003c:
            java.util.List r1 = r4.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r0 = r1.get(r2)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            boolean r0 = android.graphics.Rect.intersects(r5, r0)
            if (r0 == 0) goto L_0x0057
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.add(r0)
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x005a:
            int r1 = r7.A00
            goto L_0x002e
        L_0x005d:
            r6 = 0
            goto L_0x0011
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A01():void");
    }

    private void A02(AnonymousClass3AN r11) {
        Map map = this.A08;
        map.clear();
        int i = 0;
        while (i < A0T()) {
            View A0X = A0X(i);
            Map map2 = this.A09;
            if (map2.containsKey(A0X)) {
                map.put(map2.get(A0X), A0X);
                i++;
            } else {
                throw new IllegalStateException(002.A0O("Cannot find current rect index for View at child position: ", i));
            }
        }
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T < 0) {
                break;
            }
            A0X(A0T);
            this.A05.A08(A0T);
        }
        int i2 = 0;
        while (true) {
            List list = this.A07;
            if (i2 >= list.size()) {
                break;
            }
            Number number = (Number) list.get(i2);
            int intValue = number.intValue();
            if (map.containsKey(number)) {
                Integer valueOf = Integer.valueOf(intValue);
                A0i((View) map.get(valueOf), -1);
                map.remove(valueOf);
            } else {
                Rect A002 = this.A06.A00(intValue);
                if (A002 != null) {
                    View A042 = r11.A04(intValue);
                    A042.getLayoutParams().width = A002.width();
                    A042.getLayoutParams().height = A002.height();
                    this.A09.put(A042, Integer.valueOf(intValue));
                    A0h(A042, -1);
                    A0j(A042, 0, 0);
                    int i3 = A002.left;
                    int i4 = A002.top;
                    int i5 = this.A04;
                    C252553pI.A08(A042, i3, i4 - i5, A002.right, A002.bottom - i5);
                }
            }
            i2++;
        }
        for (View view : map.values()) {
            this.A09.remove(view);
            A0g(view);
            r11.A0A(view);
        }
    }

    public final void A1C(RecyclerView recyclerView) {
        this.A06.A00 = 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState, java.lang.Object] */
    public final Parcelable A1M() {
        ? obj = new Object();
        obj.A00 = this.A04;
        return obj;
    }

    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.A04 = ((SavedState) parcelable).A00;
        }
    }

    public final void A1Q(2Rw r3, 2Rw r4) {
        this.A06.A00 = 0;
        A0a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        if (r3.CM0() == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        if (r9 != -1.0f) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1R(X.AnonymousClass3AN r30, X.AnonymousClass3AW r31) {
        /*
            r29 = this;
            r7 = r29
            int r0 = r7.A0U()
            r28 = r30
            if (r0 != 0) goto L_0x0027
            X.Tu0 r2 = r7.A06
            java.util.List r0 = r2.A07
            r0.clear()
            int[] r0 = r2.A03
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.A04
            java.util.Arrays.fill(r0, r1)
            java.util.Map r0 = r2.A08
            r0.clear()
            r0 = r28
            r7.A0n(r0)
            return
        L_0x0027:
            int r1 = r7.A03
            int r0 = r7.BaC()
            if (r1 != r0) goto L_0x004d
            int r1 = r7.A01
            int r0 = r7.Ba9()
            if (r1 != r0) goto L_0x004d
            int r2 = r7.A02
            int r1 = r7.A03
            int r0 = r7.BaB()
            int r1 = r1 - r0
            if (r2 != r1) goto L_0x004d
            int r2 = r7.A00
            int r1 = r7.A00
            int r0 = r7.Ba8()
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x0070
        L_0x004d:
            int r0 = r7.BaC()
            r7.A03 = r0
            int r0 = r7.Ba9()
            r7.A01 = r0
            int r1 = r7.A03
            int r0 = r7.BaB()
            int r1 = r1 - r0
            r7.A02 = r1
            int r1 = r7.A00
            int r0 = r7.Ba8()
            int r1 = r1 - r0
            r7.A00 = r1
            X.Tu0 r1 = r7.A06
            r0 = 0
            r1.A00 = r0
        L_0x0070:
            int r6 = r7.A1d()
            int r1 = r7.A00
            int r0 = r7.Ba8()
            int r1 = r1 - r0
            int r0 = r7.BaC()
            int r1 = r1 - r0
            int r26 = r31.A00()
            if (r6 <= 0) goto L_0x0399
            if (r1 <= 0) goto L_0x0399
            X.Tu0 r12 = r7.A06
            int r13 = r12.A00
            r25 = -1
            r0 = r25
            if (r13 == r0) goto L_0x0369
            java.util.List r11 = r12.A07
            if (r13 != 0) goto L_0x00c6
            r11.clear()
            int[] r1 = r12.A03
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            int[] r8 = r12.A04
            java.util.Arrays.fill(r8, r0)
            java.util.Map r0 = r12.A08
            r0.clear()
            r6 = 3
            int r5 = r12.A01
            int r0 = r5 * 2
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r4 = r12.A06
            int r3 = r4.A1d()
            int r3 = r3 - r0
            int r3 = r3 / r6
            r2 = 0
        L_0x00b7:
            int r1 = r4.Ba9()
            int r0 = r5 + r3
            int r0 = r0 * r2
            int r1 = r1 + r0
            r8[r2] = r1
            int r2 = r2 + 1
            if (r2 >= r6) goto L_0x011c
            goto L_0x00b7
        L_0x00c6:
            int r0 = r11.size()
            if (r13 >= r0) goto L_0x011c
            int r4 = r11.size()
        L_0x00d0:
            int r4 = r4 + -1
            if (r4 < r13) goto L_0x011c
            java.lang.Object r3 = r11.remove(r4)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r3 == 0) goto L_0x00d0
            int r1 = r3.top
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r0 = r12.A06
            int r0 = r0.BaC()
            int r1 = r1 - r0
            r2 = 0
            int r6 = java.lang.Math.max(r2, r1)
            java.util.Map r5 = r12.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r5.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0118
        L_0x0102:
            int[] r1 = r12.A04
            r0 = 3
            if (r2 >= r0) goto L_0x00d0
            r1 = r1[r2]
            int r0 = r3.left
            if (r1 < r0) goto L_0x0115
            int r0 = r3.right
            if (r1 >= r0) goto L_0x0115
            int[] r0 = r12.A03
            r0[r2] = r6
        L_0x0115:
            int r2 = r2 + 1
            goto L_0x0102
        L_0x0118:
            int r0 = r12.A01
            int r6 = r6 - r0
            goto L_0x0102
        L_0x011c:
            r10 = 3
            r24 = 2
            int r0 = r12.A01
            r23 = r0
            int r1 = r0 * 2
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r0 = r12.A06
            r27 = r0
            int r14 = r27.A1d()
            int r14 = r14 - r1
            int r14 = r14 / r10
            boolean[] r0 = new boolean[r10]
            r22 = r0
        L_0x0133:
            r15 = 1
            r0 = r26
            if (r13 >= r0) goto L_0x0356
            X.6sX r0 = r12.A05
            X.5qr r3 = r0.B9q(r13)
            float r9 = r3.AcX()
            int r2 = r3.Ap8()
            r8 = r2
            r0 = r25
            if (r2 != r0) goto L_0x014c
            r8 = 3
        L_0x014c:
            r1 = 0
            if (r2 != r0) goto L_0x0157
            boolean r0 = r3.CM0()
            r21 = 1
            if (r0 != 0) goto L_0x0159
        L_0x0157:
            r21 = 0
        L_0x0159:
            r6 = 0
            if (r8 != r10) goto L_0x0164
            r6 = 1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r4 = 1
            if (r0 == 0) goto L_0x0165
        L_0x0164:
            r4 = 0
        L_0x0165:
            java.lang.String r2 = ") must be positive."
            java.lang.String r3 = "columnSpan ("
            if (r8 <= 0) goto L_0x034c
            if (r8 > r10) goto L_0x033e
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x017d
            if (r8 == r10) goto L_0x017d
            java.lang.String r1 = "Only full width items may wrap_content."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x017d:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0192
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0192
            java.lang.String r0 = "aspectRatio ("
            java.lang.String r1 = X.002.A0Z(r0, r2, r9)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0192:
            if (r4 == 0) goto L_0x02d2
            r0 = r28
            android.view.View r3 = r0.A04(r13)
            int r2 = r27.A1d()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r0 = r27
            int r4 = r0.A00
            int r0 = r27.Ba8()
            int r4 = r4 - r0
            int r0 = r27.BaC()
            int r4 = r4 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            r3.measure(r2, r0)
            int r5 = r3.getMeasuredHeight()
        L_0x01bd:
            r0 = r22
            java.util.Arrays.fill(r0, r1)
        L_0x01c2:
            r2 = -1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L_0x01c7:
            boolean r0 = r22[r1]
            if (r0 != 0) goto L_0x01d3
            int[] r0 = r12.A03
            r0 = r0[r1]
            if (r0 >= r3) goto L_0x01d3
            r2 = r1
            r3 = r0
        L_0x01d3:
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x01c7
            if (r2 < 0) goto L_0x0336
            r20 = r2
            r19 = r2
        L_0x01dd:
            if (r19 <= 0) goto L_0x01ec
            int[] r3 = r12.A03
            int r0 = r19 + -1
            r1 = r3[r0]
            r0 = r3[r2]
            if (r1 > r0) goto L_0x01ec
            int r19 = r19 + -1
            goto L_0x01dd
        L_0x01ec:
            r3 = r2
            r0 = r24
            if (r2 >= r0) goto L_0x01fb
            int[] r0 = r12.A03
            int r2 = r2 + 1
            r1 = r0[r2]
            r0 = r0[r20]
            if (r1 <= r0) goto L_0x01ec
        L_0x01fb:
            int r3 = r3 - r19
            int r0 = r3 + 1
            if (r0 >= r8) goto L_0x0203
            r19 = -1
        L_0x0203:
            r22[r20] = r15
            if (r19 < 0) goto L_0x01c2
            if (r5 >= 0) goto L_0x02cc
            if (r6 != 0) goto L_0x02cc
            int r16 = r8 + -1
            int r16 = r16 * r23
            r0 = r23
            float r2 = (float) r0
            float r1 = (float) r8
            float r1 = r1 / r9
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r0 = java.lang.Math.abs(r2)
            int r0 = (int) r0
            r18 = r0
        L_0x021f:
            int[] r15 = r12.A03
            r0 = r15[r20]
            if (r0 == 0) goto L_0x023d
            java.util.Map r2 = r12.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r0 = r2.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02c8
        L_0x023d:
            r17 = 0
        L_0x023f:
            int r4 = r27.Ba9()
            int r0 = r23 + r14
            int r0 = r0 * r19
            int r4 = r4 + r0
            int r3 = r27.BaC()
            r0 = r15[r20]
            int r3 = r3 + r0
            int r3 = r3 + r17
            if (r5 < 0) goto L_0x02a9
            int r2 = r27.A1d()
            int r1 = r3 + r5
        L_0x0259:
            if (r4 < 0) goto L_0x02d5
            if (r3 < 0) goto L_0x02d5
            r0 = r27
            int r9 = r0.A03
            int r0 = r27.BaB()
            int r9 = r9 - r0
            if (r2 > r9) goto L_0x02d5
            int r0 = r11.size()
            if (r13 >= r0) goto L_0x02a0
            java.lang.Object r0 = r11.get(r13)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.set(r4, r3, r2, r1)
        L_0x0277:
            r3 = r15[r20]
            java.lang.Object r0 = r11.get(r13)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.height()
            int r3 = r3 + r0
            int r3 = r3 + r17
            r1 = 0
        L_0x0287:
            int r0 = r19 + r1
            r15[r0] = r3
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x0287
            java.util.Map r2 = r12.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            r2.put(r1, r0)
            int r13 = r13 + 1
            goto L_0x0133
        L_0x02a0:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r2, r1)
            r11.add(r0)
            goto L_0x0277
        L_0x02a9:
            if (r6 == 0) goto L_0x02ba
            int r2 = r27.A1d()
            float r0 = (float) r3
            r1 = r0
            int r0 = r27.A1d()
            float r0 = (float) r0
            float r0 = r0 / r9
        L_0x02b7:
            float r1 = r1 + r0
            int r1 = (int) r1
            goto L_0x0259
        L_0x02ba:
            int r0 = r8 * r14
            int r2 = r4 + r0
            int r2 = r2 + r16
            float r1 = (float) r3
            float r0 = (float) r0
            float r0 = r0 / r9
            float r1 = r1 + r0
            r0 = r18
            float r0 = (float) r0
            goto L_0x02b7
        L_0x02c8:
            r17 = r23
            goto L_0x023f
        L_0x02cc:
            r18 = 0
            r16 = 0
            goto L_0x021f
        L_0x02d2:
            r5 = -1
            goto L_0x01bd
        L_0x02d5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Child is out of bounds (l: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = ", t: "
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", r: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = ", parentWidth: "
            r7.append(r0)
            int r0 = r27.A1d()
            r7.append(r0)
            java.lang.String r0 = ", parentRight: "
            r7.append(r0)
            r0 = r27
            int r1 = r0.A03
            int r0 = r27.BaB()
            int r1 = r1 - r0
            r7.append(r1)
            java.lang.String r0 = ", columnWidth: "
            r7.append(r0)
            r7.append(r14)
            java.lang.String r0 = ", measuredChildHeight: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ", isFullWidth: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0336:
            java.lang.String r1 = "Minimum column not found."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x033e:
            java.lang.String r1 = ") cannot exceed totalColumnCount ("
            java.lang.String r0 = ")."
            java.lang.String r1 = X.002.A0n(r3, r1, r0, r8, r10)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x034c:
            java.lang.String r1 = X.002.A0c(r3, r2, r8)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0356:
            int r1 = r11.size()
            int r1 = r1 - r15
        L_0x035b:
            if (r1 < r0) goto L_0x0363
            r11.remove(r1)
            int r1 = r1 + -1
            goto L_0x035b
        L_0x0363:
            int r0 = r11.size()
            r12.A00 = r0
        L_0x0369:
            java.util.List r2 = r12.A07
            int r1 = r2.size()
            int r0 = r7.A0U()
            if (r1 != r0) goto L_0x0381
            r7.A01()
            r0 = r28
            r7.A0n(r0)
            r7.A02(r0)
            return
        L_0x0381:
            int r4 = r2.size()
            int r3 = r7.A0U()
            java.lang.String r2 = "rectCount ("
            java.lang.String r1 = ") doesn't match adapterCount ("
            java.lang.String r0 = ")!"
            java.lang.String r1 = X.002.A0n(r2, r1, r0, r4, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0399:
            java.lang.String r2 = "onLayoutChildren(): RecyclerView has not been laid out. parentWidth: "
            java.lang.String r3 = " parentHeight: "
            java.lang.String r4 = " itemCount: "
            java.lang.String r5 = " calculationStartPosition: "
            X.Tu0 r0 = r7.A06
            int r0 = r0.A00
            r7 = r1
            r8 = r26
            r9 = r0
            java.lang.String r1 = X.002.A10(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "FlowingGridLayoutManager"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A1R(X.3AN, X.3AW):void");
    }

    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        this.A06.A01(i);
    }

    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        this.A06.A01(i);
    }

    public final int A1d() {
        return (this.A03 - BaB()) - Ba9();
    }

    public FlowingGridLayoutManager(C320536sX r2, int i) {
        this.A06 = new C14323Tu0(r2, this, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r8 == 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A1L(X.AnonymousClass3AN r6, X.AnonymousClass3AW r7, int r8) {
        /*
            r5 = this;
            int r0 = r7.A00()
            r4 = 0
            if (r0 <= 0) goto L_0x0035
            if (r8 == 0) goto L_0x0035
            X.Tu0 r3 = r5.A06
            r1 = 0
            r2 = 0
        L_0x000d:
            int[] r0 = r3.A03
            r0 = r0[r1]
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L_0x000d
            int r1 = r5.A00
            int r0 = r5.Ba8()
            int r1 = r1 - r0
            int r0 = r5.BaC()
            int r1 = r1 - r0
            int r2 = r2 - r1
            int r2 = java.lang.Math.max(r4, r2)
            int r1 = r5.A04
            int r0 = r1 + r8
            if (r0 <= r2) goto L_0x0036
            int r8 = r2 - r1
        L_0x0033:
            if (r8 != 0) goto L_0x003a
        L_0x0035:
            return r4
        L_0x0036:
            if (r0 > 0) goto L_0x003a
            int r8 = -r1
            goto L_0x0033
        L_0x003a:
            int r1 = r1 + r8
            r5.A04 = r1
            if (r1 < 0) goto L_0x004a
            int r0 = -r8
            r5.A1A(r0)
            r5.A01()
            r5.A02(r6)
            return r8
        L_0x004a:
            java.lang.String r1 = "Cannot scroll less than 0!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A1L(X.3AN, X.3AW, int):int");
    }

    public final int A1a() {
        if (A0U() != 0) {
            List list = this.A07;
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    int intValue = ((Number) list.get(i)).intValue();
                    Rect A002 = this.A06.A00(intValue);
                    if (A002 != null && this.A05.contains(A002)) {
                        return intValue;
                    }
                }
            }
        }
        return -1;
    }

    public final int A1b() {
        if (A0U() == 0) {
            return -1;
        }
        List list = this.A07;
        if (!list.isEmpty()) {
            return ((Number) list.get(0)).intValue();
        }
        return -1;
    }

    public final int A1c() {
        if (A0U() == 0) {
            return -1;
        }
        List list = this.A07;
        if (!list.isEmpty()) {
            return ((Number) list.get(list.size() - 1)).intValue();
        }
        return -1;
    }

    public final void A1e(int i, int i2) {
        if (A0U() != 0) {
            List list = this.A06.A07;
            if (list.size() != 0) {
                if (i >= list.size()) {
                    i = list.size() - 1;
                }
                if (i < 0) {
                    i = 0;
                }
                int A002 = A00(this, i, i2);
                if (this.A04 != A002) {
                    this.A04 = A002;
                    A0a();
                    A0b();
                }
            }
        }
    }

    public final void A1f(RecyclerView recyclerView, int i) {
        if (A0U() != 0) {
            C14429Tvy tvy = new C14429Tvy(recyclerView.getContext(), this);
            List list = this.A06.A07;
            if (i >= list.size()) {
                i = list.size() - 1;
            }
            if (i < 0) {
                i = 0;
            }
            tvy.A00 = i;
            A0t(tvy);
        }
    }

    public final void A1T(AnonymousClass3AW r1, RecyclerView recyclerView, int i) {
        A1f(recyclerView, i);
    }
}
