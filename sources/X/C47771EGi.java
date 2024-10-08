package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EGi  reason: case insensitive filesystem */
public final class C47771EGi extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        return new C46974DoS(F8B.A00(viewGroup));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C47240DtR dtR = (C47240DtR) r9;
        C46974DoS doS = (C46974DoS) r10;
        AnonymousClass7TG.A1N(dtR, doS);
        F03 f03 = doS.A02;
        ViewGroup viewGroup = f03.A00;
        Context context = viewGroup.getContext();
        int A02 = AnonymousClass7TG.A02(context);
        TextView textView = f03.A03;
        textView.setText(dtR.A02);
        textView.setTextAppearance(R.style.control_option_title_text);
        TextView textView2 = f03.A04;
        textView2.setText(dtR.A03);
        textView2.setMaxLines(2);
        textView2.setLineSpacing(0.0f, 1.0f);
        f03.A01.setVisibility(8);
        DbX.A1C(textView, A02, textView.getPaddingTop());
        DbX.A1C(textView2, A02, textView2.getPaddingTop());
        viewGroup.setMinimumHeight(context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material));
        viewGroup.setBackgroundResource(2Yu.A0H(context, R.attr.backgroundDrawable));
        View A01 = doS.A01.A01();
        0qQ.A07(A01);
        CompoundButton compoundButton = (CompoundButton) A01;
        compoundButton.setChecked(dtR.A00);
        FPE.A01(viewGroup, 29, compoundButton, dtR);
    }

    public final Class modelClass() {
        return C47240DtR.class;
    }
}
