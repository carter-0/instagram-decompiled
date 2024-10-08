package X;

import android.view.View;

public final /* synthetic */ class Ag7 implements C295005nO {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C3497781s A01;

    public /* synthetic */ Ag7(C3497781s r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final void onFinish() {
        C3497781s r0 = this.A01;
        float f = this.A00;
        View view = r0.A01;
        if (view != null) {
            view.setAlpha(f);
        }
    }
}
