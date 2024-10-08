package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creator.ghostwriter.ui.GhostWriterView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.dismissablecallout.DismissableCallout;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.wellbeing.respectfulcommentnudge.views.LightweightNudgeBanner;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.HrN  reason: case insensitive filesystem */
public final class C56015HrN {
    public View A00;
    public IgImageView A01;
    public IgImageView A02;
    public GradientSpinnerAvatarView A03;
    public IgImageView A04;
    public IgImageView A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final UserSession A0B;
    public final DismissableCallout A0C;
    public final ComposerAutoCompleteTextView A0D;
    public final AnonymousClass0eM A0E = C58710IwJ.A00(this, 0eO.A02, 42);
    public final View A0F;
    public final View A0G;
    public final ViewGroup A0H;
    public final ViewStub A0I;
    public final TextView A0J;
    public final IgdsBanner A0K;
    public final AnonymousClass7Q6 A0L;
    public final LightweightNudgeBanner A0M;

    public final void A00(Integer num, String str) {
        Object value;
        Integer num2;
        List list;
        0qQ.A0B(str, 1);
        ViewGroup viewGroup = this.A0H;
        if (viewGroup instanceof GhostWriterView) {
            C61081JwJ jwJ = new C61081JwJ(str, 33, num);
            C60165Jgk jgk = ((GhostWriterView) viewGroup).A00;
            if (jgk == null) {
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
            C262204Co r0 = jgk.A01;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            05G r5 = jgk.A03;
            do {
                value = r5.getValue();
                num2 = AnonymousClass05K.A0C;
                list = (List) ((C59721JVf) value).A00;
                0qQ.A0B(list, 1);
            } while (!r5.AIY(value, new C59721JVf(num2, list, 49)));
            jgk.A01 = null;
            jgk.A00 = jwJ;
        }
    }

    public C56015HrN(View view, Fragment fragment, UserSession userSession, AnonymousClass7Q6 r12) {
        this.A0B = userSession;
        this.A07 = view;
        this.A0L = r12;
        this.A0G = AnonymousClass7TF.A0G(view, R.id.layout_comment_composer_parent_container);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.layout_comment_composer_container);
        this.A06 = A0G2;
        this.A0F = AnonymousClass7TF.A0G(view, R.id.layout_comment_disabled_composer_container);
        this.A0J = AnonymousClass7TG.A0R(view, R.id.layout_comment_disabled_composer_textview);
        this.A0C = (DismissableCallout) AnonymousClass7TF.A0F(view, R.id.layout_comment_composer_callout);
        this.A0A = (ViewStub) AnonymousClass7TF.A0F(view, R.id.layout_comment_composer_emoji_picker_v1_stub);
        this.A0I = (ViewStub) AnonymousClass7TF.A0F(view, R.id.layout_comment_composer_quick_replies_stub);
        this.A0M = (LightweightNudgeBanner) AnonymousClass7TF.A0F(view, R.id.lightweight_nudge);
        this.A0K = (IgdsBanner) AnonymousClass7TF.A0F(view, R.id.hide_similar_comments_banner);
        this.A09 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.carousel_comment_tooltip_banner_stub);
        ViewGroup A0I2 = DbX.A0I(view, R.id.layout_comment_composer_edittext_container);
        if (182.A06(0Tu.A05, this.A0B, 36319557714976227L)) {
            A0I2.setVisibility(8);
            View A0F2 = DbY.A0F(view, R.id.ghost_writer_root_container_view_stub);
            0qQ.A0C(A0F2, AnonymousClass000.A00(5));
            A0I2 = (ViewGroup) A0F2;
        } else {
            this.A01 = A0I2.findViewById(R.id.layout_comment_thread_gift_button);
        }
        this.A0H = A0I2;
        if (A0I2 instanceof GhostWriterView) {
            GhostWriterView ghostWriterView = (GhostWriterView) A0I2;
            ghostWriterView.setVisibility(0);
            AnonymousClass07g A002 = ViewTreeViewModelStoreOwner.A00(ghostWriterView);
            if (A002 != null) {
                ghostWriterView.A00 = new 2YN(new C61535KBo(userSession), A002).A00(C60165Jgk.class);
                ghostWriterView.A02.setOnClickListener(new C56800ICx(ghostWriterView, 37));
                07U r4 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r4, ghostWriterView, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(viewLifecycleOwner));
                this.A0D = ghostWriterView.A03;
                IgTextView igTextView = ghostWriterView.A01;
                this.A00 = igTextView;
                this.A08 = igTextView;
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        this.A0D = (ComposerAutoCompleteTextView) A0I2.requireViewById(R.id.layout_comment_thread_edittext);
        this.A08 = A0I2.requireViewById(R.id.layout_comment_thread_post_button_click_area);
        this.A04 = A0I2.findViewById(R.id.layout_comment_thread_animated_image_picker_button);
        this.A02 = A0I2.findViewById(R.id.layout_comment_thread_mention_button);
        this.A05 = A0I2.findViewById(R.id.visual_reply_icon);
        this.A03 = (GradientSpinnerAvatarView) A0I2.findViewById(R.id.layout_comment_composer_avatar);
        this.A00 = A0G2.requireViewById(R.id.layout_comment_thread_post_button_icon);
    }
}
