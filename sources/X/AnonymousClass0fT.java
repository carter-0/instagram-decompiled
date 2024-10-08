package X;

import android.view.View;

/* renamed from: X.0fT  reason: invalid class name */
public final class AnonymousClass0fT implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;

    public AnonymousClass0fT(View.OnClickListener onClickListener, View view) {
        this.A01 = view;
        this.A00 = onClickListener;
    }

    public final void onClick(View view) {
        View view2 = this.A01;
        View.OnClickListener onClickListener = this.A00;
        C70712Um.A00(onClickListener, view2);
        onClickListener.onClick(view);
    }
}
