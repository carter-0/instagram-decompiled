package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Dpb  reason: case insensitive filesystem */
public final class C47041Dpb extends C249703kE implements AnonymousClass3N3 {
    public View A00;
    public ViewGroup A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgTextView A07;
    public IgTextView A08;
    public CircularImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public NoteBubbleView A0D;
    public GradientSpinnerAvatarView A0E;
    public RoundedCornerConstraintLayout A0F;
    public final ViewStub A0G;
    public final ViewStub A0H;
    public final IgFrameLayout A0I;
    public final IgFrameLayout A0J;
    public final IgLinearLayout A0K;
    public final IgTextView A0L;
    public final CircularImageView A0M;
    public final Context A0N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47041Dpb(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0N = AnonymousClass7TE.A0S(view);
        this.A0I = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.content_notes_container);
        this.A0G = (ViewStub) AnonymousClass7TF.A0F(view, R.id.broadcast_content_notes);
        this.A0J = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.reshare_story_container);
        this.A0H = (ViewStub) AnonymousClass7TF.A0F(view, R.id.broadcast_reshare_story);
        this.A0K = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.group_row_container);
        this.A0M = DbX.A0a(view, R.id.avatar_image_view);
        this.A0L = DbX.A0Z(view, R.id.row_title);
    }

    public final boolean EtJ() {
        return true;
    }

    public final View AeY() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0E;
        if (gradientSpinnerAvatarView == null) {
            return new View(this.A0N);
        }
        return gradientSpinnerAvatarView;
    }

    public final GradientSpinner Bkt() {
        GradientSpinner gradientSpinner;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0E;
        if (gradientSpinnerAvatarView == null || (gradientSpinner = gradientSpinnerAvatarView.A0O) == null) {
            return new GradientSpinner(this.A0N, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        return gradientSpinner;
    }

    public final RectF AeG() {
        return 0nA.A0F(AeY());
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(AeY());
    }

    public final void CLE() {
        AeY().setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        AeY().setVisibility(0);
    }
}
