package X;

import android.view.View;

/* renamed from: X.KHp  reason: case insensitive filesystem */
public final class C61682KHp extends AnonymousClass3NK {
    public final /* synthetic */ View.OnClickListener A00;

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (!view.isEnabled()) {
            return false;
        }
        view.performHapticFeedback(3);
        this.A00.onClick(view);
        return true;
    }

    public C61682KHp(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
