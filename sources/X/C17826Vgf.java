package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Vgf  reason: case insensitive filesystem */
public final class C17826Vgf {
    public View A00;
    public TextView A01;
    public final C252063oV A02;

    public final void A00() {
        C252063oV r2 = this.A02;
        View view = r2.getView();
        this.A00 = view;
        if (view != null) {
            this.A01 = AnonymousClass7TE.A0d(view, R.id.question_sticker_answer);
            r2.setVisibility(0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C17826Vgf(View view) {
        this.A02 = C66581MXm.A0T(view, R.id.question_sticker_text_answer_stub);
    }
}
