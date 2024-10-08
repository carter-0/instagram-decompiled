package X;

import com.samsung.android.os.SemPerfManager;

/* renamed from: X.4oy  reason: invalid class name and case insensitive filesystem */
public final class C274734oy extends C272194kI {
    public final boolean A00;

    public final void A04() {
        if (this.A00) {
            SemPerfManager.onSmoothScrollEvent(false);
        } else {
            SemPerfManager.onScrollEvent(false);
        }
    }

    public final boolean A05() {
        if (this.A00) {
            SemPerfManager.onSmoothScrollEvent(true);
            return true;
        }
        SemPerfManager.onScrollEvent(true);
        return true;
    }

    public C274734oy(int i, boolean z) {
        super(i);
        this.A00 = z;
    }
}
