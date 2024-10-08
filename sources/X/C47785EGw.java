package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EGw  reason: case insensitive filesystem */
public final class C47785EGw extends C232232tF {
    public final G7A A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46967DoL(DbU.A09(layoutInflater, viewGroup, R.layout.layout_meta_ai_prompt_pill, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        UO1 uo1 = (UO1) r14;
        C46967DoL doL = (C46967DoL) r15;
        AnonymousClass7TG.A1N(uo1, doL);
        String str = uo1.A05;
        int length = str.length();
        boolean z = true;
        IgTextView igTextView = doL.A02;
        if (length == 0) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setText(str);
        }
        Integer num = uo1.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (length != 0) {
                z = false;
            }
            Drawable drawable = DbS.A07(doL).getDrawable(intValue);
            int i = igTextView.getResources().getDisplayMetrics().widthPixels;
            int A01 = 0mq.A01(igTextView.getContext(), igTextView.getTypeface(), "", igTextView.getLineSpacingMultiplier(), (int) igTextView.getTextSize(), i);
            IgSimpleImageView igSimpleImageView = doL.A01;
            Resources resources = igSimpleImageView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin) + A01;
            0nA.A0g(igSimpleImageView, dimensionPixelSize, dimensionPixelSize);
            igSimpleImageView.setImageDrawable(drawable);
            if (z) {
                int dimensionPixelSize2 = A01 + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                IgLinearLayout igLinearLayout = doL.A00;
                0nA.A0g(igLinearLayout, dimensionPixelSize2, dimensionPixelSize2);
                0nA.A0k(igLinearLayout, 0, 0, 0, 0);
            } else {
                0nA.A0U(igSimpleImageView, AnonymousClass7TE.A0C(resources));
            }
            igSimpleImageView.requestLayout();
            igSimpleImageView.setVisibility(0);
        }
        View view = doL.itemView;
        0qQ.A06(view);
        AnonymousClass3NG r2 = new AnonymousClass3NG(view);
        r2.A04 = new C47793EHe(2, this, uo1);
        r2.A05 = AnonymousClass05K.A01;
        r2.A00();
        this.A00.ECJ(doL.A00, uo1);
    }

    public final Class modelClass() {
        return UO1.class;
    }

    public C47785EGw(G7A g7a) {
        this.A00 = g7a;
    }
}
