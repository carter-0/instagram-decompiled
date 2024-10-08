package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UE8 extends C249703kE {
    public final TextView A00;
    public final TitleTextView A01;
    public final TitleTextView A02;
    public final TitleTextView A03;
    public final IgImageView A04;
    public final C17543VZw A05;
    public final Integer A06;
    public final Runnable A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UE8(View view, Integer num) {
        super(view);
        0qQ.A0B(view, 1);
        this.A06 = num;
        IgImageView A0b = DbX.A0b(view, R.id.thumbnail_image);
        this.A04 = A0b;
        this.A05 = new C17543VZw(view);
        TitleTextView titleTextView = (TitleTextView) AnonymousClass7TF.A0F(view, R.id.title);
        this.A03 = titleTextView;
        TitleTextView titleTextView2 = (TitleTextView) AnonymousClass7TF.A0F(view, R.id.secondary_title);
        this.A01 = titleTextView2;
        TitleTextView titleTextView3 = (TitleTextView) AnonymousClass7TF.A0F(view, R.id.tertiary_title);
        this.A02 = titleTextView3;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.call_to_action);
        Context context = view.getContext();
        0qQ.A0A(context);
        AnonymousClass7TG.A1N(context, num);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
        int A08 = C51972G9s.A08(context);
        0nA.A0f(view, dimensionPixelSize);
        0nA.A0V(A0b, dimensionPixelSize);
        float f = (float) A08;
        titleTextView.setTextSize(0, f);
        titleTextView2.setTextSize(0, f);
        titleTextView3.setTextSize(0, f);
        this.A07 = new C20308Wox(view, this, view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin));
    }
}
