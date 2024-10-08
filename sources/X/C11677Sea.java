package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.Sea  reason: case insensitive filesystem */
public final class C11677Sea implements C13509Tba {
    public int A00;
    public int A01 = 0;
    public C10149RnQ[] A02 = new C10149RnQ[100];
    public int A03;

    public final synchronized void A00(int i) {
        boolean A1T = AnonymousClass7TF.A1T(i, this.A03);
        this.A03 = i;
        if (A1T) {
            FI0();
        }
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
