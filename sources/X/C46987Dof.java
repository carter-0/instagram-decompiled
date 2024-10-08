package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dof  reason: case insensitive filesystem */
public final class C46987Dof extends C249703kE {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final C67059Mha A03;

    public C46987Dof(View view) {
        super(view);
        this.A00 = DbU.A0C(view, R.id.row_inbox_container);
        this.A03 = new C67059Mha((C71662eb) null, (C71662eb) null, (C71662eb) null, 2b1.A00(view.requireViewById(R.id.group_photo_faceswarm_stub)), (GradientSpinnerAvatarView) AnonymousClass7TF.A0G(view, R.id.avatar_container));
        this.A02 = DbT.A0a(view, R.id.title_text_view);
        this.A01 = DbT.A0a(view, R.id.subtitle_text_view);
    }
}
