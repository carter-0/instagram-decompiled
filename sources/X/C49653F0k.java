package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.F0k  reason: case insensitive filesystem */
public final class C49653F0k {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final FKk A03 = new FKk(this, 21);
    public final C252213ok A04 = new FZH(this, 1);
    public final AnonymousClass3E6 A05;
    public final C68478NJv A06;
    public final ComposerAutoCompleteTextView A07;

    public C49653F0k(View view, AnonymousClass3E6 r5, C68478NJv nJv) {
        0qQ.A0B(r5, 3);
        this.A01 = view;
        this.A06 = nJv;
        this.A05 = r5;
        this.A07 = (ComposerAutoCompleteTextView) AnonymousClass7TF.A0F(view, R.id.reply_bar_edit_text);
        View A0G = AnonymousClass7TF.A0G(view, R.id.reply_bar_send_button);
        this.A02 = A0G;
        FP2.A00(A0G, 14, this);
    }
}
