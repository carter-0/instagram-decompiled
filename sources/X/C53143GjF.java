package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.GjF  reason: case insensitive filesystem */
public final class C53143GjF extends C249703kE {
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;
    public final GradientSpinnerAvatarView A05;

    public C53143GjF(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A01 = view;
        this.A05 = (GradientSpinnerAvatarView) AnonymousClass7TF.A0F(view, R.id.thread_image);
        this.A02 = DbX.A0Z(view, R.id.thread_name);
        this.A03 = DbX.A0Z(view, R.id.thread_secondary_name);
        this.A04 = (IgdsRadioButton) AnonymousClass7TF.A0F(view, R.id.target_thread_radio_button);
    }
}
