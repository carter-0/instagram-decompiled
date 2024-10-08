package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.KLv  reason: case insensitive filesystem */
public final class C61782KLv extends C60680JpR {
    public final IgTextView A00;
    public final IgImageView A01;
    public final LoadingSpinnerView A02;

    public C61782KLv(View view) {
        super(view);
        IgImageView A0i = JTR.A0i(view, R.id.tts_voice_image_view);
        this.A01 = A0i;
        this.A00 = Dba.A0E(view, R.id.tts_voice_name_text);
        this.A02 = (LoadingSpinnerView) AnonymousClass7TE.A0b(view, R.id.voice_loading_spinner);
        A0i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0i.setForeground(view.getContext().getDrawable(R.drawable.color_filter_image_forground));
    }
}
