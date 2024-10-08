package X;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Nj  reason: invalid class name and case insensitive filesystem */
public final class C330577Nj extends C330587Nk {
    public long A00 = 0;
    public long A01 = 0;
    public final Resources A02;
    public final Matrix A03 = new Matrix();
    public final Paint A04 = new Paint();
    public final AccelerateInterpolator A05 = new AccelerateInterpolator(2.0f);
    public final C330607Nm A06 = new C330597Nl(this);
    public final List A07 = new ArrayList(20);
    public final List A08 = new ArrayList(20);
    public final List A09 = new ArrayList(20);

    public final void A00() {
        C14086Tpc.A01.A01(this.A06);
        this.A00 = 0;
        this.A09.clear();
        List<C17716Vcl> list = this.A08;
        for (C17716Vcl vcl : list) {
            vcl.A09 = null;
        }
        list.clear();
        this.A07.clear();
    }

    public C330577Nj(Resources resources) {
        this.A02 = resources;
    }
}
