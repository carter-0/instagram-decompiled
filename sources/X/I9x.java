package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.rtc.views.omnigridview.OmniGridView;

public final class I9x implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public I9x(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.A00 == 0) {
            0qQ.A0B(view, 0);
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            ((0r1) this.A01).A00 = 0qQ.A0K(parent, ((C56913IHi) this.A03).A00);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 0:
                if (!((0r1) this.A01).A00) {
                    GWO gwo = (GWO) this.A02;
                    if (!C275604qc.A02(gwo)) {
                        gwo.A05();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((XBv) this.A01).DK6((1Xj) this.A03);
                ((View) this.A02).removeOnAttachStateChangeListener(this);
                return;
            default:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                ((OmniGridView) this.A02).A0H.A0M.remove(((PML) this.A03).A05);
                return;
        }
    }
}
