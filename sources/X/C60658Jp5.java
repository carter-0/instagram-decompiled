package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jp5  reason: case insensitive filesystem */
public final class C60658Jp5 extends C249703kE {
    public final Drawable A00;
    public final Drawable A01;
    public final LinearLayout A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgImageView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60658Jp5(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = (LinearLayout) AnonymousClass7TE.A0b(view, R.id.row_highlight_container);
        this.A05 = JTR.A0i(view, R.id.cover_image);
        this.A04 = Dba.A0E(view, R.id.title);
        this.A03 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.radio_button);
        Context A0S = AnonymousClass7TE.A0S(view);
        int A0D = 2Yu.A0D(A0S);
        Paint paint = AnonymousClass3JT.A00;
        this.A00 = AnonymousClass3JT.A05(A0S, R.drawable.instagram_payments_icons_radio, A0S.getColor(A0D));
        this.A01 = AnonymousClass3JT.A05(A0S, R.drawable.unchecked, A0S.getColor(R.color.baseline_neutral_80));
    }
}
