package X;

import android.view.View;
import android.widget.CheckBox;
import com.instagram.model.direct.DirectShareTarget;

public final class FOO implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public FOO(G8F g8f, C47035DpR dpR, DirectShareTarget directShareTarget, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        if (i4 != 0) {
            this.A05 = dpR;
            this.A06 = directShareTarget;
            this.A04 = g8f;
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
            return;
        }
        this.A04 = dpR;
        this.A05 = directShareTarget;
        this.A06 = g8f;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final void onClick(View view) {
        if (this.A00 != 0) {
            int A052 = AnonymousClass0fD.A05(1847205991);
            C47035DpR dpR = (C47035DpR) this.A05;
            G8F g8f = (G8F) this.A04;
            int i = this.A03;
            int i2 = this.A01;
            int i3 = this.A02;
            g8f.Dbt();
            if (g8f.Dbl((DirectShareTarget) this.A06, i, i2, i3)) {
                CheckBox checkBox = dpR.A02;
                if (checkBox.getVisibility() == 0) {
                    checkBox.setChecked(!checkBox.isChecked());
                }
            }
            AnonymousClass0fD.A0C(1953688973, A052);
            return;
        }
        C47035DpR dpR2 = (C47035DpR) this.A04;
        G8F g8f2 = (G8F) this.A06;
        int i4 = this.A01;
        int i5 = this.A02;
        int i6 = this.A03;
        g8f2.Dbt();
        if (g8f2.Dbl((DirectShareTarget) this.A05, i4, i5, i6)) {
            CheckBox checkBox2 = dpR2.A02;
            if (checkBox2.getVisibility() == 0) {
                checkBox2.setChecked(!checkBox2.isChecked());
            }
        }
    }
}
