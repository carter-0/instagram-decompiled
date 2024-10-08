package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

/* renamed from: X.EGt  reason: case insensitive filesystem */
public final class C47782EGt extends C232232tF {
    public final E7P A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.follow_list_sorting_entry_row, viewGroup, false);
        FP1.A01(inflate, 4, this);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C46911DnR(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        KGH kgh = (KGH) r10;
        C46911DnR dnR = (C46911DnR) r11;
        AnonymousClass7TG.A1N(kgh, dnR);
        Context A07 = DbS.A07(dnR);
        String A0d = AnonymousClass7TF.A0d(A07.getResources(), 2131953598);
        TextView textView = dnR.A00;
        Integer num = kgh.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        Typeface A02 = AnonymousClass0qo.A00(A07).A02(0qm.A13);
        if (A02 == null) {
            A02 = Typeface.DEFAULT_BOLD;
        }
        spannableStringBuilder.append(A0d).append(" ").append(A07.getString(C48894Elu.A00(num))).setSpan(new CustomTypefaceSpan(A02), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public final Class modelClass() {
        return KGH.class;
    }

    public C47782EGt(E7P e7p) {
        this.A00 = e7p;
    }
}
