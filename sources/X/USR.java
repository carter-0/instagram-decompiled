package X;

import android.os.Bundle;
import android.view.View;

public final class USR extends C14750U7h {
    public final /* synthetic */ U66 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public USR(View view, U66 u66, int i, boolean z) {
        super(view, i, z);
        this.A00 = u66;
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.A0V(view, i, bundle);
        }
        U66 u66 = this.A00;
        int A0C = C13988Tno.A0C(u66);
        if (A0C > 0) {
            u66.setSelection(A0C);
        }
        return U66.A02(u66);
    }
}
