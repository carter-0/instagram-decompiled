package X;

import android.view.View;

public final class U7T extends AnonymousClass0uU {
    public int A00;
    public boolean A01;
    public final int A02 = 0;
    public final Object A03;

    public U7T(C18004Vjg vjg) {
        this.A03 = vjg;
        this.A01 = false;
        this.A00 = 0;
    }

    public final void CvA(View view) {
        if (1 - this.A02 != 0) {
            super.CvA(view);
        } else {
            this.A01 = true;
        }
    }

    public final void CvE(View view) {
        if (this.A02 == 0) {
            int i = this.A00 + 1;
            this.A00 = i;
            C18004Vjg vjg = (C18004Vjg) this.A03;
            if (i == vjg.A04.size()) {
                AnonymousClass04L r1 = vjg.A02;
                if (r1 != null) {
                    r1.CvE((View) null);
                }
                this.A00 = 0;
                this.A01 = false;
                vjg.A03 = false;
            }
        } else if (!this.A01) {
            ((WDZ) this.A03).A09.setVisibility(this.A00);
        }
    }

    public final void CvM(View view) {
        if (this.A02 != 0) {
            ((WDZ) this.A03).A09.setVisibility(0);
        } else if (!this.A01) {
            this.A01 = true;
            AnonymousClass04L r1 = ((C18004Vjg) this.A03).A02;
            if (r1 != null) {
                r1.CvM((View) null);
            }
        }
    }

    public U7T(WDZ wdz, int i) {
        this.A03 = wdz;
        this.A00 = i;
        this.A01 = false;
    }
}
