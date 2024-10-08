package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Dpc  reason: case insensitive filesystem */
public final class C47042Dpc extends C249703kE implements XC0 {
    public final View A00 = AnonymousClass7TF.A0G(this.itemView, R.id.gallery_grid_item_selection_overlay);
    public final ImageView A01;
    public final IgTextView A02 = DbX.A0Z(this.itemView, R.id.highlight_video_duration_label);
    public final IgImageView A03;
    public final MediaFrameLayout A04;
    public final C59740JVy A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47042Dpc(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.item_container);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.story_cover_image);
        C59740JVy jVy = new C59740JVy(AnonymousClass7TE.A0S(view));
        this.A05 = jVy;
        View requireViewById = this.itemView.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(jVy);
        0qQ.A07(requireViewById);
        this.A01 = imageView;
    }

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A04);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A04);
    }

    public final void CLk() {
        this.A04.setVisibility(4);
    }

    public final void Ev3() {
        this.A04.setVisibility(0);
    }
}
