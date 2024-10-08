package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.HrS  reason: case insensitive filesystem */
public final class C56020HrS {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56020HrS) && this.A00 == ((C56020HrS) obj).A00);
    }

    public C56020HrS(boolean z, boolean z2) {
        int i = !z ? 262152 : Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        this.A00 = !z2 ? i | 512 : i;
    }

    public final int hashCode() {
        return (((((((((this.A00 * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + C54732HQn.A00();
    }
}
