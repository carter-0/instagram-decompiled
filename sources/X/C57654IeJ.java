package X;

import android.view.View;

/* renamed from: X.IeJ  reason: case insensitive filesystem */
public final class C57654IeJ implements C59601JPv {
    public View.OnClickListener A00;

    public final void Dtx(View view) {
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void Eeb(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
