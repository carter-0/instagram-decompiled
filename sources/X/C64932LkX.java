package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.LkX  reason: case insensitive filesystem */
public final class C64932LkX implements MV1 {
    public View A00;
    public LinearLayout A01;
    public TextView A02;
    public boolean A03;

    public final void setSelected(boolean z) {
    }

    public final void hide() {
        this.A01.setVisibility(8);
    }

    public final void show() {
        this.A01.setVisibility(0);
    }

    public final void setDegree(float f) {
        String valueOf = String.valueOf(f);
        if (this.A03) {
            valueOf = 002.A0C(valueOf, 176);
        }
        this.A02.setText(valueOf);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        View view = this.A00;
        int i2 = 0;
        if (i == 0) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.A01.post(new M2D(this));
    }
}
