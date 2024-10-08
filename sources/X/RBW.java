package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public final class RBW extends C2806552w {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C270254gR A02;
    public final /* synthetic */ C11265SHz A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBW(Activity activity, Bundle bundle, C270254gR r3, C11265SHz sHz, Integer num) {
        super(num);
        this.A00 = activity;
        this.A03 = sHz;
        this.A01 = bundle;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        0kR.A0F(this.A00, 0cp.A03("https://www.meta.com/help/315696271061805/"));
        SUR.A0A(this.A01, this.A02, this.A03);
    }
}
