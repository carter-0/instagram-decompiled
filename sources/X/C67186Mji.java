package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Mji  reason: case insensitive filesystem */
public final class C67186Mji extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67971Mxv(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_general_folder_banner, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C67116Mia mia = (C67116Mia) r5;
        C67971Mxv mxv = (C67971Mxv) r6;
        AnonymousClass7TG.A1N(mia, mxv);
        mxv.A02.setText(mia.A03);
        SpannableStringBuilder append = DbS.A0C(mia.A02).append(" ");
        0qQ.A07(append);
        int length = append.length();
        append.append(mia.A01);
        Context context = mxv.A00;
        C51971G9r.A0y(append, new C61920KRp(mia, context.getColor(2Yu.A0D(context))), length);
        TextView textView = mxv.A01;
        DbT.A1H(textView);
        textView.setText(append);
    }

    public final Class modelClass() {
        return C67116Mia.class;
    }
}
