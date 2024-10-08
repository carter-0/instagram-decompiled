package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.KLq  reason: case insensitive filesystem */
public final class C61777KLq extends C60517Jmo {
    public final IgTextView A00 = Dba.A0E(this.itemView, R.id.tts_voice_name_text);
    public final IgImageView A01;
    public final LoadingSpinnerView A02 = ((LoadingSpinnerView) AnonymousClass7TE.A0b(this.itemView, R.id.voice_loading_spinner));
    public final /* synthetic */ C61774KLn A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61777KLq(View view, C61774KLn kLn) {
        super(view);
        0qQ.A0B(view, 2);
        this.A03 = kLn;
        IgImageView A0i = JTR.A0i(this.itemView, R.id.tts_voice_image_view);
        this.A01 = A0i;
        A0i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0i.setForeground(DbS.A07(this).getDrawable(R.drawable.color_filter_image_forground));
    }
}
