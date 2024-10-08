package X;

import android.app.Activity;
import android.view.View;

public final /* synthetic */ class LYZ implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;

    public /* synthetic */ LYZ(Activity activity, View view, int i) {
        this.A02 = view;
        this.A01 = activity;
        this.A00 = i;
    }

    public final void onSystemUiVisibilityChange(int i) {
        View view = this.A02;
        Activity activity = this.A01;
        int i2 = this.A00;
        if ((i & 4) == 0) {
            view.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
            if (C317756nm.A06(activity)) {
                view.setBackgroundColor(i2);
            } else {
                C317756nm.A00(activity, 0);
            }
        }
    }
}
