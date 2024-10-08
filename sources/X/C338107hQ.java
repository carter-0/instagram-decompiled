package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7hQ  reason: invalid class name and case insensitive filesystem */
public class C338107hQ implements C338117hR {
    public final LinearLayoutManager A00;

    public C338107hQ(Context context, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, false);
        linearLayoutManager.A1t(false);
        this.A00 = linearLayoutManager;
        linearLayoutManager.A0D = false;
    }

    public final void EiU(2We r1) {
    }

    public final int ACF(int i, int i2, int i3, int i4) {
        float f = (float) i3;
        float f2 = (float) i;
        if (this.A00.A01 != 0) {
            f = (float) i4;
            f2 = (float) i2;
        }
        int ceil = (int) Math.ceil((double) (f / f2));
        if (ceil < 2) {
            return 2;
        }
        if (ceil > 10) {
            return 10;
        }
        return ceil;
    }

    public final /* bridge */ /* synthetic */ JQ9 ANM(int i, int i2) {
        return new C56934IId(i, i2, this.A00.A01);
    }

    public final int AVF() {
        return this.A00.A1c();
    }

    public final int AVG() {
        return this.A00.A1a();
    }

    public final int AVJ() {
        return this.A00.A1d();
    }

    public final int AVK() {
        return this.A00.A1b();
    }

    public int AnJ(C338367hq r2, int i) {
        if (this.A00.A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    public int AnM(C338367hq r2, int i) {
        if (this.A00.A01 == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    public final C252553pI BLt() {
        return this.A00;
    }

    public final int Bq5() {
        return this.A00.A01;
    }

    public final void EKi(int i, int i2) {
        this.A00.A1p(i, i2);
    }

    public final int getItemCount() {
        return this.A00.A0U();
    }

    public C338107hQ(LinearLayoutManager linearLayoutManager) {
        this.A00 = linearLayoutManager;
    }
}
