package X;

import android.text.SegmentFinder;

public final class U21 extends SegmentFinder {
    public final /* synthetic */ XAM A00;

    public U21(XAM xam) {
        this.A00 = xam;
    }

    public final int nextEndBoundary(int i) {
        return this.A00.Cra(i);
    }

    public final int nextStartBoundary(int i) {
        return this.A00.Cre(i);
    }

    public final int previousEndBoundary(int i) {
        return this.A00.E4N(i);
    }

    public final int previousStartBoundary(int i) {
        return this.A00.E4P(i);
    }
}
