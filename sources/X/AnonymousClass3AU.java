package X;

import java.util.Arrays;

/* renamed from: X.3AU  reason: invalid class name */
public final class AnonymousClass3AU implements AnonymousClass3AV {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r0 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(androidx.recyclerview.widget.RecyclerView r11, boolean r12) {
        /*
            r10 = this;
            r2 = 0
            r10.A00 = r2
            int[] r1 = r10.A03
            if (r1 == 0) goto L_0x000b
            r0 = -1
            java.util.Arrays.fill(r1, r0)
        L_0x000b:
            X.3pI r7 = r11.A0D
            X.2Rw r1 = r11.A0A
            if (r1 == 0) goto L_0x01df
            if (r7 == 0) goto L_0x01df
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x01df
            if (r12 == 0) goto L_0x005c
            X.3Ae r0 = r11.A07
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01d0
            int r6 = r1.getItemCount()
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x01d0
            r5 = r7
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.A05
            r4 = -1
            if (r0 == 0) goto L_0x004b
            int r3 = r0.A01
            if (r3 < 0) goto L_0x004b
            boolean r0 = r0.A02
        L_0x0039:
            if (r0 == 0) goto L_0x005a
        L_0x003b:
            r1 = 0
        L_0x003c:
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x01d0
            if (r3 < 0) goto L_0x01d0
            if (r3 >= r6) goto L_0x01d0
            r10.A9p(r3, r2)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004b:
            androidx.recyclerview.widget.LinearLayoutManager.A0P(r5)
            boolean r0 = r5.A09
            int r3 = r5.A02
            if (r3 != r4) goto L_0x0039
            r3 = 0
            if (r0 == 0) goto L_0x005a
            int r3 = r6 + -1
            goto L_0x003b
        L_0x005a:
            r4 = 1
            goto L_0x003b
        L_0x005c:
            boolean r0 = r11.A1D()
            if (r0 != 0) goto L_0x01d0
            int r4 = r10.A01
            int r1 = r10.A02
            X.3AW r6 = r11.mState
            boolean r0 = r7 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L_0x00ea
            r8 = r7
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r8 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r8
            if (r1 == 0) goto L_0x01d0
            int r0 = r8.A0U()
            if (r0 == 0) goto L_0x01d0
            java.util.List r4 = r8.A07
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01d0
            r3 = 1
            r0 = 0
            if (r1 <= 0) goto L_0x0084
            r0 = 1
        L_0x0084:
            int r9 = java.lang.Math.abs(r1)
            if (r0 == 0) goto L_0x00be
            int r0 = r4.size()
            int r0 = r0 - r3
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
        L_0x0099:
            int r5 = r5 + 1
            int r0 = r6.A00()
            if (r5 >= r0) goto L_0x01d0
            X.Tu0 r0 = r8.A06
            android.graphics.Rect r4 = r0.A00(r5)
            if (r4 == 0) goto L_0x01d0
            int r3 = r4.top
            android.graphics.Rect r0 = r8.A05
            int r1 = r0.bottom
            int r0 = r1 + r9
            if (r3 >= r0) goto L_0x01d0
            int r0 = r4.top
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r2, r0)
            r10.A9p(r5, r0)
            goto L_0x0099
        L_0x00be:
            java.lang.Object r0 = r4.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            int r5 = r5 - r3
        L_0x00c9:
            if (r5 < 0) goto L_0x01d0
            X.Tu0 r0 = r8.A06
            android.graphics.Rect r4 = r0.A00(r5)
            if (r4 == 0) goto L_0x01d0
            int r3 = r4.bottom
            android.graphics.Rect r0 = r8.A05
            int r1 = r0.top
            int r0 = r1 - r9
            if (r3 <= r0) goto L_0x01d0
            int r0 = r4.bottom
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
            r10.A9p(r5, r0)
            int r5 = r5 + -1
            goto L_0x00c9
        L_0x00ea:
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0142
            r8 = r7
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            int r0 = r8.A01
            if (r0 == 0) goto L_0x00f6
            r4 = r1
        L_0x00f6:
            int r0 = r8.A0T()
            if (r0 == 0) goto L_0x01d0
            if (r4 == 0) goto L_0x01d0
            r8.A1n()
            r3 = 1
            r1 = -1
            if (r4 <= 0) goto L_0x0106
            r1 = 1
        L_0x0106:
            int r0 = java.lang.Math.abs(r4)
            androidx.recyclerview.widget.LinearLayoutManager.A0Q(r8, r6, r1, r0, r3)
            X.3Jr r4 = r8.A04
            boolean r0 = r8 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x01bd
            androidx.recyclerview.widget.GridLayoutManager r8 = (androidx.recyclerview.widget.GridLayoutManager) r8
            int r5 = r8.A00
            r3 = 0
        L_0x0118:
            int r0 = r8.A00
            if (r3 >= r0) goto L_0x01d0
            int r1 = r4.A01
            if (r1 < 0) goto L_0x01d0
            int r0 = r6.A00()
            if (r1 >= r0) goto L_0x01d0
            if (r5 <= 0) goto L_0x01d0
            int r0 = r4.A08
            int r0 = java.lang.Math.max(r2, r0)
            r10.A9p(r1, r0)
            X.6sz r0 = r8.A01
            int r0 = r0.A00(r1)
            int r5 = r5 - r0
            int r1 = r4.A01
            int r0 = r4.A03
            int r1 = r1 + r0
            r4.A01 = r1
            int r3 = r3 + 1
            goto L_0x0118
        L_0x0142:
            boolean r0 = r7 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x01d0
            r5 = r7
            androidx.recyclerview.widget.StaggeredGridLayoutManager r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r5
            int r0 = r5.A02
            if (r0 == 0) goto L_0x014e
            r4 = r1
        L_0x014e:
            int r0 = r5.A0T()
            if (r0 == 0) goto L_0x01d0
            if (r4 == 0) goto L_0x01d0
            r5.A1h(r6, r4)
            int[] r0 = r5.A0G
            if (r0 == 0) goto L_0x0162
            int r1 = r0.length
            int r0 = r5.A06
            if (r1 >= r0) goto L_0x0168
        L_0x0162:
            int r0 = r5.A06
            int[] r0 = new int[r0]
            r5.A0G = r0
        L_0x0168:
            r4 = 0
            r8 = 0
            r3 = 0
        L_0x016b:
            int r0 = r5.A06
            if (r8 >= r0) goto L_0x0199
            X.OLo r9 = r5.A0L
            int r1 = r9.A03
            r0 = -1
            if (r1 != r0) goto L_0x018c
            int r1 = r9.A05
            X.9ND[] r0 = r5.A0H
            r0 = r0[r8]
            int r0 = r0.A03(r1)
        L_0x0180:
            int r1 = r1 - r0
            if (r1 < 0) goto L_0x0189
            int[] r0 = r5.A0G
            r0[r3] = r1
            int r3 = r3 + 1
        L_0x0189:
            int r8 = r8 + 1
            goto L_0x016b
        L_0x018c:
            X.9ND[] r0 = r5.A0H
            r1 = r0[r8]
            int r0 = r9.A02
            int r1 = r1.A02(r0)
            int r0 = r9.A02
            goto L_0x0180
        L_0x0199:
            int[] r0 = r5.A0G
            java.util.Arrays.sort(r0, r2, r3)
        L_0x019e:
            if (r4 >= r3) goto L_0x01d0
            X.OLo r2 = r5.A0L
            int r1 = r2.A01
            if (r1 < 0) goto L_0x01d0
            int r0 = r6.A00()
            if (r1 >= r0) goto L_0x01d0
            int[] r0 = r5.A0G
            r0 = r0[r4]
            r10.A9p(r1, r0)
            int r1 = r2.A01
            int r0 = r2.A03
            int r1 = r1 + r0
            r2.A01 = r1
            int r4 = r4 + 1
            goto L_0x019e
        L_0x01bd:
            int r1 = r4.A01
            if (r1 < 0) goto L_0x01d0
            int r0 = r6.A00()
            if (r1 >= r0) goto L_0x01d0
            int r0 = r4.A08
            int r0 = java.lang.Math.max(r2, r0)
            r10.A9p(r1, r0)
        L_0x01d0:
            int r1 = r10.A00
            int r0 = r7.A02
            if (r1 <= r0) goto L_0x01df
            r7.A02 = r1
            r7.A0E = r12
            X.3AN r0 = r11.A0y
            r0.A08()
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AU.A00(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    public final void A9p(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.A00 * 2;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 2)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }
}
