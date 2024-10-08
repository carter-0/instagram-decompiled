package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.9QP  reason: invalid class name */
public final class AnonymousClass9QP implements C2365734g {
    public final /* synthetic */ C358338ak A00;

    public AnonymousClass9QP(C358338ak r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0A(view);
        C358338ak r0 = this.A00;
        UserSession userSession = r0.A02;
        AnonymousClass0iw r5 = r0.A01;
        0qQ.A0B(view, 0);
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        view.setVisibility(4);
        IgImageView A0F = AnonymousClass7TF.A0F(view, R.id.profile_picture);
        A0F.setUrl(A01.Bh3(), r5);
        A0F.setVisibility(0);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.username);
        A0R.setText(A01.getUsername());
        A0R.setVisibility(0);
        C394289xq.A00(view);
        View A0F2 = AnonymousClass7TF.A0F(view, R.id.video_caption_container);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.video_caption);
        0qQ.A07(view.requireViewById(R.id.media_info_expanded_caption_background));
        0qQ.A0B(A0F2, 0);
        0qQ.A0B(A0R2, 1);
        A0F2.setVisibility(0);
        A0R2.setText(2131955722);
        AnonymousClass7TF.A0G(view, R.id.clips_cta).setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }
}
