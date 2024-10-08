package X;

import com.instagram.common.ui.base.IgFrameLayout;

public final class PQL implements C295005nO {
    public final /* synthetic */ C308476Uk A00;
    public final /* synthetic */ Boolean A01;

    public PQL(C308476Uk r1, Boolean bool) {
        this.A01 = bool;
        this.A00 = r1;
    }

    public final void onFinish() {
        Boolean bool = this.A01;
        if (bool != null) {
            IgFrameLayout igFrameLayout = this.A00.A01;
            boolean booleanValue = bool.booleanValue();
            igFrameLayout.setEnabled(booleanValue);
            float f = 0.5f;
            if (booleanValue) {
                f = 1.0f;
            }
            igFrameLayout.setAlpha(f);
        }
    }
}
