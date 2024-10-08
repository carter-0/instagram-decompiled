package androidx.appcompat.widget;

import X.03v;
import X.AnonymousClass2Z3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;

public class ButtonBarLayout extends LinearLayout {
    public boolean A00;
    public int A01 = -1;
    public boolean A02;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = AnonymousClass2Z3.A0A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        03v.A06(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 0);
        this.A02 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.A02);
        }
    }

    private void setStacked(boolean z) {
        if (this.A00 == z) {
            return;
        }
        if (!z || this.A02) {
            this.A00 = z;
            setOrientation(z ? 1 : 0);
            int i = 80;
            if (z) {
                i = 8388613;
            }
            setGravity(i);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                int i2 = 4;
                if (z) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (!z && this.A00) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r2 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.A02
            r3 = 0
            if (r0 == 0) goto L_0x0016
            int r0 = r5.A01
            if (r2 <= r0) goto L_0x0014
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0014
            r5.setStacked(r3)
        L_0x0014:
            r5.A01 = r2
        L_0x0016:
            boolean r0 = r5.A00
            r4 = 1
            if (r0 != 0) goto L_0x00b8
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00b8
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L_0x002a:
            super.onMeasure(r0, r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00b5
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x00b5
            r5.setStacked(r4)
        L_0x0043:
            super.onMeasure(r6, r7)
        L_0x0046:
            r4 = 0
            int r1 = r5.getChildCount()
        L_0x004b:
            if (r4 >= r1) goto L_0x009a
            android.view.View r0 = r5.getChildAt(r4)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b2
            if (r4 < 0) goto L_0x009a
            android.view.View r0 = r5.getChildAt(r4)
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 + r0
            int r3 = X.C13988Tno.A0B(r2, r1)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x00ac
            int r2 = r4 + 1
            int r1 = r5.getChildCount()
        L_0x0078:
            if (r2 >= r1) goto L_0x009a
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00a9
            if (r2 < 0) goto L_0x009a
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            r1 = 1098907648(0x41800000, float:16.0)
            android.util.DisplayMetrics r0 = X.C13988Tno.A0F(r5)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            int r2 = r2 + r0
            int r3 = r3 + r2
        L_0x009a:
            int r0 = r5.getMinimumHeight()
            if (r0 == r3) goto L_0x00a8
            r5.setMinimumHeight(r3)
            if (r7 != 0) goto L_0x00a8
            super.onMeasure(r6, r7)
        L_0x00a8:
            return
        L_0x00a9:
            int r2 = r2 + 1
            goto L_0x0078
        L_0x00ac:
            int r0 = r5.getPaddingBottom()
            int r3 = r3 + r0
            goto L_0x009a
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x004b
        L_0x00b5:
            if (r2 == 0) goto L_0x0046
            goto L_0x0043
        L_0x00b8:
            r0 = r6
            r2 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
