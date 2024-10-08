package X;

import java.text.BreakIterator;

/* renamed from: X.U6f  reason: case insensitive filesystem */
public final class C14741U6f extends C56882IGd {
    public static C14741U6f A01;
    public BreakIterator A00;

    public final void A03(String str) {
        this.A00 = str;
        BreakIterator breakIterator = this.A00;
        if (breakIterator == null) {
            0qQ.A0F("impl");
            throw AnonymousClass00P.createAndThrow();
        } else {
            breakIterator.setText(str);
        }
    }

    public final int[] AWA(int i) {
        int A012 = C56882IGd.A01(this);
        if (A012 > 0 && i < A012) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.following(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int following = breakIterator2.following(i);
                    if (following != -1) {
                        return A04(i, following);
                    }
                }
            }
            0qQ.A0F("impl");
            throw AnonymousClass00P.createAndThrow();
        }
        return null;
    }

    public final int[] E3T(int i) {
        int A012 = C56882IGd.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.preceding(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int preceding = breakIterator2.preceding(i);
                    if (preceding != -1) {
                        return A04(preceding, i);
                    }
                }
            }
            0qQ.A0F("impl");
            throw AnonymousClass00P.createAndThrow();
        }
        return null;
    }
}
