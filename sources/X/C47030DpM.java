package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.DpM  reason: case insensitive filesystem */
public final class C47030DpM extends C249703kE {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final /* synthetic */ C46819Dlv A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47030DpM(View view, C46819Dlv dlv) {
        super(view);
        this.A08 = dlv;
        this.A02 = view;
        this.A03 = (IgLinearLayout) AnonymousClass7TE.A0b(view, R.id.birthday_effects_audience_item_root);
        this.A04 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.birthday_effects_audience_icon);
        this.A07 = Dba.A0E(view, R.id.birthday_effects_audience_title);
        this.A06 = Dba.A0E(view, R.id.birthday_effects_audience_subtitle);
        this.A05 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.birthday_effects_audience_radio_button);
        Context A0S = AnonymousClass7TE.A0S(view);
        int A0D = 2Yu.A0D(A0S);
        Paint paint = AnonymousClass3JT.A00;
        this.A00 = AnonymousClass3JT.A05(A0S, R.drawable.instagram_payments_icons_radio, A0S.getColor(A0D));
        this.A01 = AnonymousClass3JT.A05(A0S, R.drawable.unchecked, A0S.getColor(2Yu.A09(A0S)));
    }
}
