package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.LAv  reason: case insensitive filesystem */
public final class C63892LAv {
    public final View A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgdsButton A06;
    public final IgdsButton A07;
    public final ViewGroup A08;

    public C63892LAv(View view) {
        this.A01 = DbX.A0I(view, R.id.content_view);
        View A0G = AnonymousClass7TF.A0G(view, R.id.share_options_container);
        this.A00 = A0G;
        this.A08 = DbX.A0I(A0G, R.id.footer_content_view);
        ViewGroup A0I = DbX.A0I(view, R.id.footer_button_container);
        this.A02 = A0I;
        this.A07 = JTR.A0n(A0I, R.id.share_button);
        this.A06 = JTR.A0n(A0I, R.id.save_draft_button);
        this.A04 = DbX.A0Z(A0I, R.id.learn_more_button);
        this.A05 = DbX.A0b(A0I, R.id.thread_facepile);
        this.A03 = DbX.A0Z(A0I, R.id.thread_disclaimer);
        A0I.setVisibility(0);
        A0G.setVisibility(0);
    }
}
