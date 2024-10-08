package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.4QV  reason: invalid class name */
public final class AnonymousClass4QV implements AnonymousClass4QW {
    public int A00;
    public int A01 = 0;
    public AnonymousClass4QX[] A02 = new AnonymousClass4QX[100];
    public int A03;

    public final synchronized void A00(int i) {
        boolean z = false;
        if (i < this.A03) {
            z = true;
        }
        this.A03 = i;
        if (z) {
            FI0();
        }
    }

    public final synchronized int C8e() {
        return this.A00 * Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public final synchronized void FI0() {
        int max = Math.max(0, (((this.A03 + Constants.LOAD_RESULT_PGO_ATTEMPTED) - 1) / Constants.LOAD_RESULT_PGO_ATTEMPTED) - this.A00);
        int i = this.A01;
        if (max < i) {
            Arrays.fill(this.A02, max, i, (Object) null);
            this.A01 = max;
        }
    }
}
