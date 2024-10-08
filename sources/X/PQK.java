package X;

import android.view.ViewGroup;

public final class PQK implements C295005nO {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ boolean A01;

    public PQK(ViewGroup viewGroup, boolean z) {
        this.A01 = z;
        this.A00 = viewGroup;
    }

    public final void onFinish() {
        if (!this.A01) {
            this.A00.setVisibility(8);
        }
    }
}
