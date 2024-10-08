package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpO  reason: case insensitive filesystem */
public final class C47032DpO extends C249703kE {
    public final ViewGroup A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgTextView A07;
    public final C67059Mha A08;
    public final IgdsButton A09;
    public final IgdsButton A0A;

    public C47032DpO(View view) {
        super(view);
        ViewGroup A0I = DbX.A0I(view, R.id.row_inbox_container);
        this.A00 = A0I;
        this.A08 = new C67059Mha((C71662eb) null, (C71662eb) null, (C71662eb) null, 2b1.A00(A0I.requireViewById(R.id.group_photo_faceswarm_stub)), (GradientSpinnerAvatarView) AnonymousClass7TF.A0G(A0I, R.id.avatar_container));
        this.A06 = DbX.A0Y(A0I, R.id.row_inbox_icon);
        this.A05 = DbX.A0Y(A0I, R.id.row_avatar_placeholder);
        IgTextView A0Z = DbX.A0Z(A0I, R.id.row_inbox_username);
        this.A07 = A0Z;
        this.A04 = AnonymousClass7TG.A0R(A0I, R.id.row_inbox_digest);
        this.A03 = AnonymousClass7TG.A0R(A0I, R.id.row_search_user_secondary_subtitle);
        this.A02 = AnonymousClass7TG.A0R(A0I, R.id.row_search_debug_info);
        this.A01 = (FrameLayout) AnonymousClass7TF.A0F(A0I, R.id.inbox_option_view);
        this.A09 = (IgdsButton) AnonymousClass7TF.A0F(A0I, R.id.row_direct_action_button);
        this.A0A = (IgdsButton) AnonymousClass7TF.A0F(A0I, R.id.row_direct_message_button);
        A0Z.A00 = true;
    }
}
