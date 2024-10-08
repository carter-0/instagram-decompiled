package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;

public final class PQD implements C295005nO {
    public final /* synthetic */ View A00;

    public PQD(View view) {
        this.A00 = view;
    }

    public final void onFinish() {
        View view = this.A00;
        C294975nL A0D = JTP.A0c(view, 1).A0C(195).A0D(new DecelerateInterpolator());
        A0D.A0U(0.95f, 1.0f, (float) view.getMeasuredWidth());
        A0D.A0V(0.95f, 1.0f, (float) view.getMeasuredHeight());
        A0D.A0J(0.0f);
        A0D.A0H();
    }
}
