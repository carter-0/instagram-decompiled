package X;

import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class U52 extends LinearLayout {
    public ViewParent A00;
    public TextView A01;
    public U3E A02;
    public VZD A03;
    public boolean A04;

    public final void setBarSelected(Boolean bool) {
        U3E u3e = this.A02;
        if (u3e != null) {
            u3e.setBarSelected(bool);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04 && getHeight() > 0) {
            this.A04 = true;
            post(new C19986Wix(this));
        }
    }

    public final void setViewModel(VZD vzd, ViewParent viewParent) {
        AnonymousClass7TG.A1N(vzd, viewParent);
        removeAllViews();
        this.A00 = viewParent;
        this.A03 = vzd;
    }
}
