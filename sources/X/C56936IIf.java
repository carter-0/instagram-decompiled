package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.IIf  reason: case insensitive filesystem */
public final class C56936IIf implements C338117hR {
    public 2We A00;
    public final GridLayoutManager A01;
    public final C53064Ghw A02;

    public C56936IIf(Context context, int i, int i2) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i, i2, false);
        this.A01 = gridLayoutManager;
        C53064Ghw ghw = new C53064Ghw(this);
        this.A02 = ghw;
        gridLayoutManager.A01 = ghw;
    }

    public static int A00(GridLayoutManager gridLayoutManager, C338367hq r3, int i) {
        Number number = (Number) r3.Auo("OVERRIDE_SIZE");
        if (number != null) {
            return number.intValue();
        }
        if (r3.CU5()) {
            return View.MeasureSpec.getSize(i);
        }
        return r3.By5() * (View.MeasureSpec.getSize(i) / gridLayoutManager.A00);
    }

    public final int ACF(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        GridLayoutManager gridLayoutManager = this.A01;
        int i5 = gridLayoutManager.A00;
        if (gridLayoutManager.A01 != 0) {
            d = (double) i4;
            d2 = (double) i2;
        } else {
            d = (double) i3;
            d2 = (double) i;
        }
        return ((int) Math.ceil(d / d2)) * i5;
    }

    public final /* bridge */ /* synthetic */ JQ9 ANM(int i, int i2) {
        GridLayoutManager gridLayoutManager = this.A01;
        return new C56935IIe(i, i2, gridLayoutManager.A01, gridLayoutManager.A00);
    }

    public final int AVF() {
        return this.A01.A1c();
    }

    public final int AVG() {
        return this.A01.A1a();
    }

    public final int AVJ() {
        return this.A01.A1d();
    }

    public final int AVK() {
        return this.A01.A1b();
    }

    public final int AnJ(C338367hq r3, int i) {
        GridLayoutManager gridLayoutManager = this.A01;
        if (gridLayoutManager.A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(A00(gridLayoutManager, r3, i), SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int AnM(C338367hq r3, int i) {
        GridLayoutManager gridLayoutManager = this.A01;
        if (gridLayoutManager.A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(A00(gridLayoutManager, r3, i), SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final C252553pI BLt() {
        return this.A01;
    }

    public final int Bq5() {
        return this.A01.A01;
    }

    public final void EKi(int i, int i2) {
        this.A01.A1p(i, i2);
    }

    public final int getItemCount() {
        return this.A01.A0U();
    }

    public final void EiU(2We r1) {
        this.A00 = r1;
    }
}
