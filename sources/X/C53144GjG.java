package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.GjG  reason: case insensitive filesystem */
public final class C53144GjG extends C249703kE {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgView A05;
    public final IgView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53144GjG(View view, View view2, IgTextView igTextView, IgTextView igTextView2) {
        super(view);
        C51974G9v.A1M(view2, igTextView, igTextView2);
        this.A01 = view2;
        this.A04 = igTextView;
        this.A02 = igTextView2;
        this.A06 = (IgView) AnonymousClass7TF.A0F(view, R.id.top_divider);
        this.A05 = (IgView) AnonymousClass7TF.A0F(view, R.id.bottom_divider);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.fundraiser_banner_chevron);
        this.A03 = DbX.A0Z(view, R.id.fundraiser_owner_attribution_text);
    }
}
