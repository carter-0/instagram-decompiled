package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.window.PopupLayout;
import java.util.List;

public final class IGS implements AnonymousClass5RD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IGS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final int CmW(C268014cc r4, List list, int i) {
        if (this.A00 != 0) {
            return C52407GRi.A00(r4, this, list, i);
        }
        C52849Gdi gdi = (C52849Gdi) this.A02;
        ViewGroup.LayoutParams layoutParams = gdi.getLayoutParams();
        0qQ.A0A(layoutParams);
        gdi.measure(C52849Gdi.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return gdi.getMeasuredHeight();
    }

    public final int CmZ(C268014cc r4, List list, int i) {
        if (this.A00 != 0) {
            return C52407GRi.A01(r4, this, list, i);
        }
        return A00((C52849Gdi) this.A02, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final C289145d6 Cnx(C268004cb r7, List list, long j) {
        int A002;
        int measuredHeight;
        0sP tya;
        if (this.A00 != 0) {
            ((PopupLayout) this.A02).A00 = (AnonymousClass5Q8) this.A01;
            return r7.Cfi(0Yt.A0E(), C58917Izg.A00, 0, 0);
        }
        C52849Gdi gdi = (C52849Gdi) this.A02;
        if (gdi.getChildCount() == 0) {
            A002 = Constraints.A03(j);
            measuredHeight = Constraints.A02(j);
            tya = C58914Izd.A00;
        } else {
            int A03 = Constraints.A03(j);
            if (A03 != 0) {
                gdi.getChildAt(0).setMinimumWidth(A03);
            }
            int A022 = Constraints.A02(j);
            if (A022 != 0) {
                gdi.getChildAt(0).setMinimumHeight(A022);
            }
            int A012 = Constraints.A01(j);
            ViewGroup.LayoutParams layoutParams = gdi.getLayoutParams();
            0qQ.A0A(layoutParams);
            A002 = A00(gdi, A022, Constraints.A00(j), C52849Gdi.A00(A03, A012, layoutParams.width));
            measuredHeight = gdi.getMeasuredHeight();
            tya = new TYA(5, (Object) gdi, this.A01);
        }
        return C51969G9p.A0a(r7, tya, A002, measuredHeight);
    }

    public final int CoP(C268014cc r4, List list, int i) {
        if (this.A00 != 0) {
            return C52407GRi.A02(r4, this, list, i);
        }
        C52849Gdi gdi = (C52849Gdi) this.A02;
        ViewGroup.LayoutParams layoutParams = gdi.getLayoutParams();
        0qQ.A0A(layoutParams);
        gdi.measure(C52849Gdi.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return gdi.getMeasuredHeight();
    }

    public final int CoS(C268014cc r4, List list, int i) {
        if (this.A00 != 0) {
            return C52407GRi.A03(r4, this, list, i);
        }
        return A00((C52849Gdi) this.A02, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static int A00(C52849Gdi gdi, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = gdi.getLayoutParams();
        0qQ.A0A(layoutParams);
        gdi.measure(i3, C52849Gdi.A00(i, i2, layoutParams.height));
        return gdi.getMeasuredWidth();
    }
}
