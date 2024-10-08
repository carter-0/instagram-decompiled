package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vbm  reason: case insensitive filesystem */
public final class C17656Vbm {
    public final ConstraintLayout A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgLinearLayout A07;

    public C17656Vbm(C252063oV r3) {
        0qQ.A0B(r3, 1);
        ConstraintLayout constraintLayout = (ConstraintLayout) r3.getView();
        this.A00 = constraintLayout;
        this.A02 = DbX.A0Y(constraintLayout, R.id.sticker_image);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass7TF.A0F(constraintLayout, R.id.emoji_container);
        this.A07 = igLinearLayout;
        this.A03 = DbX.A0b(igLinearLayout, R.id.heart_emoji);
        this.A04 = DbX.A0b(igLinearLayout, R.id.laughing_emoji);
        this.A05 = DbX.A0b(igLinearLayout, R.id.open_mouth_emoji);
        this.A06 = DbX.A0b(igLinearLayout, R.id.sad_emoji);
        this.A01 = DbX.A0Y(igLinearLayout, R.id.more_emojis);
    }
}
