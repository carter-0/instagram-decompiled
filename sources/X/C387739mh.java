package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9mh  reason: invalid class name and case insensitive filesystem */
public final class C387739mh extends C339087j2 {
    public final ImageUrl A00;
    public final GIH A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387739mh(Context context, ImageUrl imageUrl, C339057iz r20, String str) {
        super(r20, 0, C339067j0.A00, C339077j1.A00, 0);
        this.A00 = imageUrl;
        this.A02 = str;
        Context context2 = context;
        this.A01 = new GIH(context2, (GJO) null, context2.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), context2.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_radius), context2.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), AnonymousClass7TE.A09(context2), AnonymousClass7TG.A03(context2), 0, false);
    }

    public final void A00(UserSession userSession, C339807kC r4) {
        IgSimpleImageView igSimpleImageView = r4.A07;
        igSimpleImageView.setImageDrawable(this.A01);
        JYP.A00(igSimpleImageView, this.A00);
        IgTextView igTextView = r4.A08;
        igTextView.setText(this.A02);
        igTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        igTextView.setSelected(true);
    }
}
