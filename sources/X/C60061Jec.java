package X;

import android.view.View;
import android.widget.HorizontalScrollView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.Jec  reason: case insensitive filesystem */
public abstract class C60061Jec extends HorizontalScrollView {
    public final void A00(int i, boolean z) {
        if (this instanceof IgSegmentedTabLayout) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this;
            igSegmentedTabLayout.A00 = i;
            igSegmentedTabLayout.A06 = true;
            return;
        }
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) this;
        igSegmentedTabLayout2.A00 = i;
        igSegmentedTabLayout2.A06 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout
            if (r0 == 0) goto L_0x0039
            r4 = r5
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout r4 = (com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout) r4
            X.Jeq r3 = r4.A04
            int r0 = r3.getChildCount()
            if (r6 >= r0) goto L_0x0034
            android.view.View r2 = r3.getChildAt(r6)
            X.MTv r0 = r4.A03
            if (r0 != 0) goto L_0x0035
            int r0 = X.JTR.A0B(r4, r2)
            int r0 = r0 / 2
            float r1 = (float) r0
            int r0 = r2.getLeft()
            float r2 = (float) r0
            float r2 = r2 - r1
            int r0 = r4.getScrollX()
            float r0 = (float) r0
            float r2 = r2 - r0
            r1 = 0
            int r0 = (int) r2
            if (r7 != 0) goto L_0x0062
            r4.scrollBy(r0, r1)
        L_0x0031:
            r3.A02(r6, r7)
        L_0x0034:
            return
        L_0x0035:
            r0.ETY(r6, r7)
            goto L_0x0031
        L_0x0039:
            r4 = r5
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2 r4 = (com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2) r4
            r7 = 1
            X.Jeq r3 = r4.A04
            int r0 = r3.getChildCount()
            if (r6 >= r0) goto L_0x0034
            android.view.View r2 = r3.getChildAt(r6)
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A03
            if (r0 != 0) goto L_0x0066
            int r0 = X.JTR.A0B(r4, r2)
            int r0 = r0 / 2
            float r1 = (float) r0
            int r0 = r2.getLeft()
            float r2 = (float) r0
            float r2 = r2 - r1
            int r0 = r4.getScrollX()
            float r0 = (float) r0
            float r2 = r2 - r0
            r1 = 0
            int r0 = (int) r2
        L_0x0062:
            r4.smoothScrollBy(r0, r1)
            goto L_0x0031
        L_0x0066:
            r0.A03(r6, r7)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60061Jec.A01(int, boolean):void");
    }

    public final void A02(View.OnClickListener onClickListener, C49627Ezk ezk) {
        boolean z = this instanceof IgSegmentedTabLayout;
        C46720Djx djx = new C46720Djx(AnonymousClass7TE.A0S(this), ezk);
        addView(djx);
        if (onClickListener != null) {
            djx.setOnClickListener(onClickListener);
        }
    }
}
