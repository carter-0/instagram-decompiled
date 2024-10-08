package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

public final class UEL extends C249703kE {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final RoundedCornerImageView A06;
    public final RoundedCornerImageView A07;
    public final AutoWidthToggleButton A08;
    public final AnonymousClass0eM A09 = C20693WxP.A00(this, 4);

    public UEL(View view) {
        super(view);
        this.A02 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.thumbnail_circle);
        this.A06 = roundedCornerImageView;
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.thumbnail_square);
        this.A07 = roundedCornerImageView2;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.tertiary_text);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.chevron);
        this.A08 = (AutoWidthToggleButton) AnonymousClass7TF.A0F(view, R.id.add_button);
        AnonymousClass3MJ r0 = AnonymousClass3MJ.CENTER_CROP;
        roundedCornerImageView.setBitmapShaderScaleType(r0);
        roundedCornerImageView2.setBitmapShaderScaleType(r0);
    }
}
