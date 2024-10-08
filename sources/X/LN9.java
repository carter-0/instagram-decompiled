package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class LN9 {
    public static final 1QU A0C;
    public AnonymousClass1T9 A00;
    public C314236hs A01;
    public C317466nJ A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Matrix A06 = AnonymousClass7TE.A0U();
    public final ComposeView A07;
    public final AnonymousClass3NM A08;
    public final ConstrainedImageView A09;
    public final ConstrainedImageView A0A;
    public final IgImageView A0B;

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.ImageView, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public LN9(View view, AnonymousClass0iw r22, UserSession userSession) {
        View view2 = view;
        0qQ.A0B(view2, 3);
        Resources resources = view2.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        ? r3 = (ConstrainedImageView) AnonymousClass7TF.A0F(view2, R.id.asset_item);
        this.A0A = r3;
        ? r1 = (ConstrainedImageView) AnonymousClass7TF.A0G(view2, R.id.asset_item_overlay);
        this.A09 = r1;
        IgImageView requireViewById = view2.requireViewById(R.id.mute_button);
        IgImageView igImageView = requireViewById;
        Drawable drawable = igImageView.getResources().getDrawable(R.drawable.cutout_video_trim_screen_audio_button_background);
        Context A0S = AnonymousClass7TE.A0S(igImageView);
        igImageView.setImageDrawable(new InsetDrawable(drawable, DbS.A02(A0S, 8), DbS.A02(A0S, 14), DbS.A02(A0S, 8), DbS.A02(A0S, 2)));
        igImageView.setActivated(true);
        0qQ.A07(requireViewById);
        this.A0B = igImageView;
        this.A07 = (ComposeView) AnonymousClass7TF.A0F(view2, R.id.meme_hub_text_overlay);
        this.A03 = 0nA.A0H(AnonymousClass7TE.A0S(r3)).densityDpi;
        Context context = view2.getContext();
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(r3);
        A0m.A04 = new C61684KHs(0, context, resources, r22, userSession, this);
        A0m.A07 = true;
        A0m.A0C = true;
        this.A08 = A0m.A00();
        r1.setImageResource(R.drawable.right_bottom_triangle);
    }

    static {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A06;
        r1.A03 = 1Fe.A03;
        A0C = r1.A00();
    }
}
