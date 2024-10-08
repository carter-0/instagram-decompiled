package X;

import android.view.View;

/* renamed from: X.3NB  reason: invalid class name */
public final class AnonymousClass3NB implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3N1 A00;

    public AnonymousClass3NB(AnonymousClass3N1 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-91907930);
        View.OnClickListener onClickListener = ((AnonymousClass3N9) this.A00.A03.getHolder().A03.getValue()).A00;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        AnonymousClass0fD.A0C(-586983554, A05);
    }
}
