package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class GBZ implements C338117hR {
    public LinearLayoutManager A00;
    public final C338107hQ A01;
    public final /* synthetic */ GBY A02;

    public final void EiU(2We r1) {
    }

    public GBZ(Context context, GBY gby) {
        this.A02 = gby;
        this.A01 = new C338107hQ(context, 1);
    }

    public final int ACF(int i, int i2, int i3, int i4) {
        return this.A01.ACF(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ JQ9 ANM(int i, int i2) {
        return new C56934IId(i, i2, this.A01.A00.A01);
    }

    public final int AVF() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1c();
        }
        return -1;
    }

    public final int AVG() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1a();
        }
        return -1;
    }

    public final int AVJ() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1d();
        }
        return -1;
    }

    public final int AVK() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1b();
        }
        return -1;
    }

    public final int AnJ(C338367hq r2, int i) {
        return C51967G9n.A01(this.A02.A06.A00);
    }

    public final int AnM(C338367hq r2, int i) {
        return C51967G9n.A01(this.A02.A06.A01);
    }

    public final C252553pI BLt() {
        return this.A00;
    }

    public final int Bq5() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A01;
        }
        return 1;
    }

    public final void EKi(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            linearLayoutManager.A1p(i, i2);
        }
    }

    public final int getItemCount() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A0U();
        }
        return 0;
    }
}
