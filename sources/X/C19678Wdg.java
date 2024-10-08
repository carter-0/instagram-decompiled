package X;

/* renamed from: X.Wdg  reason: case insensitive filesystem */
public final class C19678Wdg implements C273494mf, C273504mg {
    public final int A00;
    public final Object A01;

    public C19678Wdg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (X.JTP.A1Y(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2.getLocalVisibleRect(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0.top == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isScrolledToTop() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0025;
                case 2: goto L_0x002c;
                case 3: goto L_0x0005;
                case 4: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            X.UZ0 r0 = (X.UZ0) r0
            android.view.View r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0018
            android.graphics.Rect r0 = r0.A04
        L_0x0010:
            r2.getLocalVisibleRect(r0)
            int r0 = r0.top
            if (r0 == 0) goto L_0x0018
            r1 = 0
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.Object r0 = r3.A01
            X.UZ6 r0 = (X.UZ6) r0
            com.instagram.common.ui.base.IgTextView r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0018
            android.graphics.Rect r0 = r0.A01
            goto L_0x0010
        L_0x0025:
            java.lang.Object r0 = r3.A01
            X.UYu r0 = (X.UYu) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A04
            goto L_0x0032
        L_0x002c:
            java.lang.Object r0 = r3.A01
            X.UYc r0 = (X.C15262UYc) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
        L_0x0032:
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.JTP.A1Y(r0)
            if (r0 != 0) goto L_0x0018
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19678Wdg.isScrolledToTop():boolean");
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
