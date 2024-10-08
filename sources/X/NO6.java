package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class NO6 extends C232222tE {
    public final C3260475e A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68016Myi(DbT.A0D(layoutInflater, viewGroup, R.layout.command_item_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        N5S n5s = (N5S) r7;
        C68016Myi myi = (C68016Myi) r8;
        AnonymousClass7TF.A1H(n5s, myi);
        C3260875i r5 = n5s.A00;
        boolean A06 = r5.A06();
        IgImageView igImageView = myi.A04;
        if (A06) {
            igImageView.setLayoutParams(myi.A01);
            igImageView.setImageResource(r5.A00());
        } else {
            igImageView.setLayoutParams(myi.A00);
            Context A0S = AnonymousClass7TE.A0S(igImageView);
            igImageView.setImageDrawable(AnonymousClass4Ed.A01(A0S, r5.A00(), 2Yu.A0H(A0S, R.attr.glyphColorPrimary)));
        }
        myi.A03.setText(r5.A05());
        String A04 = r5.A04();
        TextView textView = myi.A02;
        if (A04 == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(A04);
        }
        C71408Ok7.A00(myi.itemView, 54, this, n5s);
    }

    public final Class modelClass() {
        return N5S.class;
    }

    public NO6(C3260475e r1) {
        this.A00 = r1;
    }
}
