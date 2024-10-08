package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.JoH  reason: case insensitive filesystem */
public final class C60608JoH extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public C60608JoH(View view) {
        super(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.story_highlight_image_preview_container);
        this.A02 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.story_highlight_image_preview);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.story_highlight_title);
    }
}
