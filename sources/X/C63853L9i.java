package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.L9i  reason: case insensitive filesystem */
public final class C63853L9i {
    public final ViewGroup A00;
    public final TextView A01;
    public final LithoView A02;
    public final ComposerAutoCompleteTextView A03;
    public final View A04;
    public final ViewStub A05;

    public C63853L9i(View view) {
        ViewStub viewStub = (ViewStub) AnonymousClass7TE.A0b(view, R.id.direct_composer_style_view_stub);
        this.A05 = viewStub;
        this.A02 = AnonymousClass7TE.A0b(view, R.id.above_composer_views);
        View A0H = JTP.A0H(viewStub, R.layout.layout_broadcast_channels_replies_composer_bar);
        this.A04 = A0H;
        this.A00 = DbU.A0C(A0H, R.id.row_thread_composer_textarea_container);
        this.A03 = (ComposerAutoCompleteTextView) A0H.requireViewById(R.id.row_thread_composer_edittext);
        TextView A0G = DbU.A0G(A0H, R.id.row_thread_composer_button_send);
        this.A01 = A0G;
        A0G.setAlpha(0.3f);
    }
}
