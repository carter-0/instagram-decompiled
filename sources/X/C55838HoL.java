package X;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.HoL  reason: case insensitive filesystem */
public final class C55838HoL {
    public final CardView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final IgdsBottomButtonLayout A05;

    public C55838HoL(View view) {
        this.A01 = DbX.A0Y(view, R.id.checkmark_icon);
        this.A00 = (CardView) AnonymousClass7TF.A0F(view, R.id.image_card);
        this.A04 = DbX.A0b(view, R.id.image_preview);
        this.A03 = DbX.A0Z(view, R.id.quality_survey_headline_text);
        this.A02 = DbX.A0Z(view, R.id.quality_survey_body_text);
        this.A05 = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(view, R.id.start_survey_button);
    }
}
