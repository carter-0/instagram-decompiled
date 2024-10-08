package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JpM  reason: case insensitive filesystem */
public final class C60675JpM extends C249703kE {
    public final Context A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgSimpleImageView A06;
    public final CircularImageView A07;
    public final C71662eb A08;
    public final C64970Ll9 A09;
    public final GIH A0A;

    public C60675JpM(View view, C64970Ll9 ll9) {
        super(view);
        Context context = view.getContext();
        this.A00 = context;
        this.A09 = ll9;
        Resources resources = context.getResources();
        this.A01 = DbU.A0C(view, R.id.active_fundraiser_row_container);
        ImageView A0F = DbU.A0F(view, R.id.album_art);
        this.A02 = A0F;
        this.A07 = (CircularImageView) view.requireViewById(R.id.default_cover_photo_border);
        this.A06 = JTP.A0T(view, R.id.default_cover_photo);
        this.A05 = DbU.A0G(view, R.id.active_fundraiser_row_title);
        this.A04 = DbU.A0G(view, R.id.active_fundraiser_row_subtitle);
        this.A03 = DbU.A0G(view, R.id.active_fundraiser_row_secondary_subtitle);
        this.A08 = DbY.A0T(view, R.id.overflow_button_stub);
        GIH gih = new GIH(context, (GJO) null, JTP.A05(resources), AnonymousClass7TE.A0C(resources), 0, 0, JTP.A03(resources), 1, false);
        this.A0A = gih;
        A0F.setImageDrawable(gih);
    }
}
