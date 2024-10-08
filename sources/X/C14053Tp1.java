package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp1  reason: case insensitive filesystem */
public final class C14053Tp1 extends RecyclerView {
    public final /* synthetic */ ViewPager2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14053Tp1(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00.A0B || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.A00;
        accessibilityEvent.setFromIndex(viewPager2.A00);
        accessibilityEvent.setToIndex(viewPager2.A00);
        accessibilityEvent.setSource(viewPager2.A09.A04);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (super.onTouchEvent(r4) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 1585994793(0x5e885c29, float:4.9128868E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0014
            boolean r0 = super.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r0 = -1229153487(0xffffffffb6bc9b31, float:-5.6209033E-6)
            X.AnonymousClass0fD.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14053Tp1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
