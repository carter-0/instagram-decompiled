package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.JoS  reason: case insensitive filesystem */
public final class C60619JoS extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;

    public C60619JoS(View view) {
        super(view);
        this.A00 = DbX.A0Y(view, R.id.prompt_image_view);
        this.A01 = DbX.A0Y(view, R.id.prompt_secondary_card_view);
        this.A02 = DbX.A0Y(view, R.id.prompt_tertiary_card_view);
    }
}
