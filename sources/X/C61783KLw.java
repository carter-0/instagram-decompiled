package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.KLw  reason: case insensitive filesystem */
public final class C61783KLw extends C60680JpR {
    public final IgTextView A00;
    public final IgImageView A01;
    public final RoundedCornerFrameLayout A02;
    public final SpinnerImageView A03;

    public C61783KLw(View view) {
        super(view);
        this.A02 = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.audio_filter_background);
        IgImageView A0i = JTR.A0i(view, R.id.audio_filter_icon);
        this.A01 = A0i;
        this.A00 = Dba.A0E(view, R.id.audio_filter_name);
        this.A03 = (SpinnerImageView) AnonymousClass7TE.A0b(view, R.id.audio_filter_spinner);
        A0i.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
