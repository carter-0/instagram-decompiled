package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class W9t implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C315656kI A02;

    public W9t(FragmentActivity fragmentActivity, 1Xj r2, C315656kI r3) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-496508689);
        C358248ab r3 = new C358248ab((Activity) this.A00);
        1Xj r2 = this.A01;
        int i = 2131973770;
        if (r2.A5j()) {
            i = 2131973763;
        }
        r3.A09(i);
        boolean A5j = r2.A5j();
        int i2 = 2131968772;
        if (A5j) {
            i2 = 2131971974;
        }
        r3.A0K(new W5U(this, 53), i2);
        W5U.A01(r3, this, 52, 2131954722);
        DbT.A1V(r3);
        AnonymousClass0fD.A0C(-194753893, A05);
    }
}
