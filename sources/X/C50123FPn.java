package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.FPn  reason: case insensitive filesystem */
public final class C50123FPn implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ ConstraintLayout A02;

    public C50123FPn(View view, TextView textView, ConstraintLayout constraintLayout) {
        this.A01 = textView;
        this.A02 = constraintLayout;
        this.A00 = view;
    }

    public final boolean onPreDraw() {
        TextView textView = this.A01;
        if (textView.getLineCount() <= 0) {
            return true;
        }
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        FGO.A05(this.A00, textView, this.A02, 0);
        return true;
    }
}
