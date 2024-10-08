package X;

/* renamed from: X.PQb  reason: case insensitive filesystem */
public final class C72943PQb implements C273494mf {
    public boolean A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final 0sL A03;
    public final /* synthetic */ OLF A04;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public C72943PQb(OLF olf, C62320sa r2, C62320sa r3, 0sL r4) {
        this.A04 = olf;
        this.A02 = r2;
        this.A03 = r4;
        this.A01 = r3;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final boolean isScrolledToTop() {
        return C51971G9r.A1b(this.A02);
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        int i3;
        boolean z;
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        OLF olf = this.A04;
        AnonymousClass37D A012 = r2.A01(olf.A00);
        if (A012 != null) {
            i3 = A012.A08();
        } else {
            i3 = 0;
        }
        int abs = Math.abs(i3 - i);
        C71111Ocu ocu = olf.A01;
        ocu.A05(new PNE(JTR.A0H(this.A01) + abs));
        float f = ((float) abs) / ((float) i3);
        if (f < 0.25f || this.A00) {
            if (f < 0.25f && this.A00) {
                z = false;
            }
            this.A03.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        z = true;
        ocu.A05(new PN5(z));
        this.A00 = z;
        this.A03.invoke(Integer.valueOf(i), Integer.valueOf(i2));
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
}
