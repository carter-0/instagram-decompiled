package X;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* renamed from: X.5iB  reason: invalid class name and case insensitive filesystem */
public abstract class C291975iB {
    public static final long A00 = (0 << 32);
    public static final C291985iC A01 = new Canvas();

    public static final TextDirectionHeuristic A00(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i != 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
