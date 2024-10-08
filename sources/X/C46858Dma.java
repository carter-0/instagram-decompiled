package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dma  reason: case insensitive filesystem */
public final class C46858Dma extends AnonymousClass3B3 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04 = 5;
    public final boolean A05;

    public C46858Dma(float f, int i, int i2, int i3, boolean z) {
        this.A00 = f;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.graphics.Rect r8, int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            r0 = r10
            if (r12 == 0) goto L_0x0007
            int r0 = r7.A03
            int r0 = r10 - r0
        L_0x0007:
            float r1 = (float) r0
            float r4 = r7.A00
            float r6 = (float) r9
            float r3 = r4 * r6
            float r1 = r1 - r3
            float r1 = r1 / r6
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r1 = (int) r1
            int r5 = r7.A02
            if (r1 >= r5) goto L_0x0018
            r1 = r5
        L_0x0018:
            if (r13 == 0) goto L_0x0063
            r0 = r10
            if (r12 == 0) goto L_0x0021
            int r0 = r7.A03
            int r0 = r10 - r0
        L_0x0021:
            float r2 = (float) r0
            float r2 = r2 - r3
            float r2 = r2 / r6
            int r3 = r7.A01
            int r0 = r9 * 2
            int r1 = r3 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r1 = (int) r2
            if (r1 >= r5) goto L_0x0063
            int r2 = r9 + -1
            if (r12 == 0) goto L_0x0039
            int r0 = r7.A03
            int r10 = r10 - r0
        L_0x0039:
            float r1 = (float) r10
            float r0 = (float) r2
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 / r0
            int r0 = r2 * 2
            int r3 = r3 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r3
            float r1 = r1 - r0
            int r1 = (int) r1
        L_0x0047:
            if (r2 == 0) goto L_0x004a
            r9 = r2
        L_0x004a:
            r0 = 0
            r8.top = r0
            r8.bottom = r0
            if (r11 != 0) goto L_0x0060
            int r0 = r7.A01
            r8.left = r0
        L_0x0055:
            int r0 = r9 + -1
            if (r11 != r0) goto L_0x005d
            if (r13 != 0) goto L_0x005d
            int r1 = r7.A01
        L_0x005d:
            r8.right = r1
            return
        L_0x0060:
            r8.left = r1
            goto L_0x0055
        L_0x0063:
            r2 = r9
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46858Dma.A00(android.graphics.Rect, int, int, int, boolean, boolean):void");
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r20) {
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass7TF.A1B(view2, 1, recyclerView2);
        int measuredWidth = recyclerView2.getMeasuredWidth();
        2Rw r0 = recyclerView2.A0A;
        if (r0 != null) {
            int itemCount = r0.getItemCount();
            int A032 = RecyclerView.A03(view2);
            if (((float) Math.floor((double) (((float) measuredWidth) / (this.A00 + ((float) (this.A02 * 2)))))) < ((float) itemCount) || itemCount > this.A04) {
                A00(rect2, this.A04, measuredWidth, A032, true, this.A05);
                return;
            }
            A00(rect2, itemCount, measuredWidth, A032, false, this.A05);
        }
    }
}
