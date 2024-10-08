package X;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Jof  reason: case insensitive filesystem */
public final class C60632Jof extends C249703kE {
    public final TextView A00;
    public final CardView A01;
    public final IgSimpleImageView A02;
    public final IgMultiImageButton A03;

    public C60632Jof(View view, float f) {
        super(view);
        ((MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A03 = igMultiImageButton;
        igMultiImageButton.A00 = f;
        this.A01 = (CardView) view.requireViewById(R.id.overlay_metric_view);
        this.A02 = JTP.A0T(view, R.id.media_promote_icon);
        this.A00 = DbU.A0G(view, R.id.media_metric_value);
    }
}
