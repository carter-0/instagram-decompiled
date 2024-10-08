package X;

import android.view.View;
import com.instagram.common.gallery.Medium;

public final class JW2 implements AnonymousClass3NL {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C378479Py A01;
    public final /* synthetic */ C59739JVx A02;
    public final /* synthetic */ C361698ge A03;
    public final /* synthetic */ boolean A04;

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        C59739JVx jVx = this.A02;
        C378479Py r3 = this.A01;
        JX8.A03(this.A00, r3, jVx, this.A03, this.A04);
        2eQ.A06(view, 500);
        return true;
    }

    public JW2(Medium medium, C378479Py r2, C59739JVx jVx, C361698ge r4, boolean z) {
        this.A02 = jVx;
        this.A01 = r2;
        this.A00 = medium;
        this.A04 = z;
        this.A03 = r4;
    }

    public final void DP5(View view) {
        C59739JVx jVx = this.A02;
        Medium medium = this.A00;
        C361698ge r3 = this.A03;
        jVx.A01.post(new M9Q(JX8.A00(jVx), medium, jVx, r3));
    }
}
