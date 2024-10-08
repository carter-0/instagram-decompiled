package X;

import android.animation.ArgbEvaluator;
import android.view.View;
import java.util.Set;

public final /* synthetic */ class PQP implements C295005nO {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C295005nO A01;
    public final /* synthetic */ Set A02;

    public /* synthetic */ PQP(View view, C295005nO r2, Set set) {
        this.A02 = set;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void onFinish() {
        Set set = this.A02;
        View view = this.A00;
        C295005nO r1 = this.A01;
        ArgbEvaluator argbEvaluator = C294975nL.A0b;
        set.getClass();
        set.remove(view);
        if (set.isEmpty()) {
            r1.onFinish();
        }
    }
}
