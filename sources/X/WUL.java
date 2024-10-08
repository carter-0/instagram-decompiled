package X;

import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.android.R;

public final class WUL implements C41817B1x {
    public final /* synthetic */ C15326UaZ A00;
    public final /* synthetic */ WUS A01;

    public final void DvT(C279284yO r9) {
        View view;
        0qQ.A0B(r9, 0);
        this.A01.DvT(r9);
        C15326UaZ uaZ = this.A00;
        if (uaZ.A00 == null && (view = uaZ.mView) != null) {
            View findViewById = view.findViewById(R.id.pre_capture_controls_container);
            View view2 = uaZ.mView;
            if (view2 != null) {
                C17714Vcj vcj = new C17714Vcj(findViewById, view2.findViewById(R.id.quick_capture_fragment_container), AnonymousClass05K.A01);
                float f = uaZ.A04;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(vcj.A0D.getContext());
                float scaledMinimumFlingVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
                vcj.A04 = Float.valueOf(scaledMinimumFlingVelocity + ((((float) viewConfiguration.getScaledMaximumFlingVelocity()) - scaledMinimumFlingVelocity) * Math.min(Math.max(0.0f, 1.0f), Math.max(Math.min(0.0f, 1.0f), f))));
                vcj.A02 = Math.max(uaZ.A03, 1.0f);
                vcj.A03 = uaZ.A05;
                WC3.A00(vcj.A0C, 2, vcj);
                uaZ.A00 = vcj;
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public WUL(C15326UaZ uaZ, WUS wus) {
        this.A01 = wus;
        this.A00 = uaZ;
    }

    public final void DTa() {
        WUS.A00(this.A01);
    }
}
