package com.instagram.ui.layoutmanager;

import X.0Yt;
import X.0kD;
import X.0qQ;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import kotlin.Deprecated;

@Deprecated(message = "use [LinearLayoutManager] instead, and call\n      [LinearLayoutManager#setAutoMeasureEnabled(boolean)] with {@code true} to enable this\n      wrap_content behavior (this behavior will be enabled by default once t15165061 is closed).")
public final class BetterLinearLayoutManager extends AutoMeasureLinearLayoutManager {
    public final void A0r(AnonymousClass3AN r14, AnonymousClass3AW r15, int i, int i2) {
        int i3;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        if (r15.A00() > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int[] iArr = {0, 0};
            try {
                View A04 = r14.A04(0);
                if (A04 != null) {
                    ViewGroup.LayoutParams layoutParams = A04.getLayoutParams();
                    if (layoutParams != null) {
                        A04.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, Ba9() + BaB(), layoutParams.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, BaC() + Ba8(), layoutParams.height));
                        iArr[0] = A04.getMeasuredWidth();
                        iArr[1] = A04.getMeasuredHeight();
                        r14.A0A(A04);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                0kD.A0J("IndexOutOfBoundsException in BetterLinearLayoutManager:measureScrapChild while trying getting item view at position 0", e, 0Yt.A0E(), 817899586);
            }
            i4 = iArr[0];
            i3 = iArr[1];
        } else {
            i3 = 0;
        }
        if (mode != 1073741824) {
            size = i4;
        }
        if (mode2 != 1073741824) {
            size2 = i3;
        }
        this.A07.setMeasuredDimension(size, size2);
    }
}
