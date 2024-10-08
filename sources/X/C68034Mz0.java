package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Mz0  reason: case insensitive filesystem */
public final class C68034Mz0 extends C249703kE {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final GradientSpinnerAvatarView A06;

    public C68034Mz0(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.user_row_background);
        this.A06 = DbX.A0j(view, R.id.avatar_container);
        this.A05 = DbX.A0Z(view, R.id.thread_title);
        this.A04 = DbX.A0Z(view, R.id.thread_subtitle);
        this.A03 = DbX.A0Y(view, R.id.existing_thread_radio_button);
    }
}
