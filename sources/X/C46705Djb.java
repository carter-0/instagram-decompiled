package X;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.Djb  reason: case insensitive filesystem */
public final class C46705Djb extends InputConnectionWrapper {
    public final G5F A00;

    public C46705Djb(InputConnection inputConnection, G5F g5f) {
        super(inputConnection, false);
        this.A00 = g5f;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        C46723DkC dkC = (C46723DkC) this.A00;
        G6W g6w = dkC.A00;
        if (g6w != null) {
            g6w.D8H(dkC);
        }
        return super.deleteSurroundingText(i, i2);
    }
}
