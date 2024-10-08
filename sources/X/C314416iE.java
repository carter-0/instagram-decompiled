package X;

import android.view.View;

/* renamed from: X.6iE  reason: invalid class name and case insensitive filesystem */
public final class C314416iE {
    public boolean A00;
    public final C273384mU A01;
    public final C313056fm A02;

    public C314416iE(C273384mU r2, C313056fm r3) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00(boolean z) {
        View view;
        if (this.A00 != z) {
            this.A00 = z;
            View view2 = ((C313046fl) this.A02).A04.A0F;
            Object obj = null;
            if (view2 != null) {
                obj = view2.getTag();
            }
            if (obj instanceof C316006kx) {
                view = ((C316006kx) obj).A0N;
            } else if (obj instanceof C309406Yd) {
                view = ((C309406Yd) obj).A0D;
            } else if (obj instanceof C67602Mqa) {
                view = ((C67602Mqa) obj).A0F;
            } else {
                return;
            }
            if (view != null) {
                AnonymousClass4EQ.A09(view, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.A01 != 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r4 = this;
            X.4mU r0 = r4.A01
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r0 = r0.A0a
            r3 = 1
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A01
            r2 = 1
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            X.6fm r0 = r4.A02
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            int r1 = r0.A08
            r0 = 0
            if (r1 != 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            r3 = 0
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314416iE.A01():boolean");
    }
}
