package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.MyT  reason: case insensitive filesystem */
public final class C68001MyT extends C249703kE {
    public final IgTextView A00;
    public final IgImageView A01;
    public final GradientSpinnerAvatarView A02;
    public final /* synthetic */ C67812MvG A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68001MyT(View view, C67812MvG mvG) {
        super(view);
        0qQ.A0B(view, 2);
        this.A03 = mvG;
        this.A02 = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.reply_avatar_container);
        this.A00 = Dba.A0E(view, R.id.profile_name);
        this.A01 = JTR.A0i(view, R.id.reply_remove_icon);
    }
}
