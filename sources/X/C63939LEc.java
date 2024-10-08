package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.LEc  reason: case insensitive filesystem */
public final class C63939LEc {
    public final C300835xz A00 = new C300835xz();

    public final void A00(C59671JTb jTb, IgSimpleImageView igSimpleImageView, MSJ msj, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        MSJ msj2 = msj;
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = igBouncyUfiButtonImageView;
        AnonymousClass7TF.A1C(igBouncyUfiButtonImageView, 0, msj);
        boolean z = jTb.A00;
        igBouncyUfiButtonImageView.setSelected(z);
        Context context = igBouncyUfiButtonImageView.getContext();
        int i = 2131968545;
        if (z) {
            i = 2131968546;
        }
        DbU.A12(context, igBouncyUfiButtonImageView, i);
        AnonymousClass0fU.A00(new C64253LXf(5, igSimpleImageView, igBouncyUfiButtonImageView2, msj2, this, jTb), igBouncyUfiButtonImageView);
    }

    public final void A01(IgSimpleImageView igSimpleImageView, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        0qQ.A0B(igBouncyUfiButtonImageView, 0);
        if (igSimpleImageView != null) {
            Context A0S = AnonymousClass7TE.A0S(igSimpleImageView);
            igSimpleImageView.setImageDrawable(AnonymousClass3JT.A04(A0S, new int[]{AnonymousClass7TF.A03(A0S, R.attr.igds_color_gradient_yellow), AnonymousClass7TF.A03(A0S, R.attr.igds_color_gradient_red), AnonymousClass7TF.A03(A0S, R.attr.igds_color_gradient_purple)}, R.drawable.instagram_cake_pano_filled_24));
            igSimpleImageView.setVisibility(8);
        }
        igBouncyUfiButtonImageView.setVisibility(0);
        this.A00.A01(C51965G9l.A0v(igBouncyUfiButtonImageView));
    }
}
