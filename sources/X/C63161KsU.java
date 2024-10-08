package X;

/* renamed from: X.KsU  reason: case insensitive filesystem */
public abstract class C63161KsU {
    public static final int A00(C66507MUl mUl, int i) {
        0qQ.A0B(mUl, 0);
        if (mUl.BrN() <= 0) {
            throw AnonymousClass7TE.A0z("segment count must be > 0");
        } else if (i >= 0) {
            int BrN = mUl.BrN();
            for (int i2 = 0; i2 < BrN; i2++) {
                if (i >= mUl.BrU(i2) && i < mUl.BrR(i2)) {
                    return i2;
                }
            }
            if (i >= mUl.BrU(0)) {
                return mUl.BrN() - 1;
            }
            return 0;
        } else {
            throw AnonymousClass7TE.A0z("timelinePositionInMs must be >= 0");
        }
    }
}
