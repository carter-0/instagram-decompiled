package X;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.7AQ  reason: invalid class name */
public abstract class AnonymousClass7AQ {
    public static final C328007Db A00(LayoutInflater layoutInflater, ConstraintLayout constraintLayout, AnonymousClass7D2 r4) {
        if (r4 == null) {
            return null;
        }
        C328007Db ANK = r4.ANK(layoutInflater, constraintLayout);
        View BJd = ANK.BJd();
        constraintLayout.addView(BJd, BJd.getLayoutParams());
        return ANK;
    }
}
