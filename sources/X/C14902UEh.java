package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.UEh  reason: case insensitive filesystem */
public final class C14902UEh extends C249703kE implements C66433MRn {
    public C60005JdE A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Resources A09;
    public final Drawable A0A;
    public final UserSession A0B;
    public final IgTextView A0C;
    public final U10 A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final IgImageView A0G;
    public final SpinnerImageView A0H;

    public final void CyJ(Bitmap bitmap, C60005JdE jdE) {
        JTO.A1X(this.A0H);
        IgImageView igImageView = this.A0E;
        igImageView.setImageDrawable(jdE);
        int i = 4;
        igImageView.setVisibility(0);
        this.A0C.setVisibility(0);
        this.A0G.setVisibility(0);
        IgImageView igImageView2 = this.A0F;
        if (this.A01) {
            i = 0;
        }
        igImageView2.setVisibility(i);
    }

    public C14902UEh(Context context, View view, UserSession userSession) {
        super(view);
        this.A08 = context;
        this.A0B = userSession;
        this.A0G = DbT.A0b(view, R.id.mention_profile_attribution);
        this.A0E = DbT.A0b(view, R.id.mention_thumbnail_image);
        IgImageView A0b = DbT.A0b(view, R.id.mention_thumbnail_video_play_button);
        this.A0F = A0b;
        this.A0C = DbT.A0a(view, R.id.mention_thumbnail_time_left_text);
        this.A0H = (SpinnerImageView) view.requireViewById(R.id.mention_thumbnail_spinner);
        ImageView A0F2 = DbU.A0F(view, R.id.mention_thumbnail_card_dim);
        this.A0A = A0b.getDrawable();
        U10 u10 = new U10();
        this.A0D = u10;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A02 = dimensionPixelSize;
        u10.A01 = dimensionPixelSize;
        u10.A02 = 77;
        A0F2.setImageDrawable(u10);
        Resources resources = context.getResources();
        this.A09 = resources;
        this.A05 = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A06 = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = AnonymousClass7TE.A0C(resources);
    }
}
