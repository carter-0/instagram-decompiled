package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uhk  reason: case insensitive filesystem */
public final class C15739Uhk extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.product_feed_title_row, false);
        Object A0U = C13988Tno.A0U(A09, new UE1(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productfeed.ProductFeedTitleRowViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String A00;
        String A002;
        C19279WSm wSm = (C19279WSm) r7;
        UE1 ue1 = (UE1) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, wSm, ue1);
        TextView textView = ue1.A03;
        UL9 ul9 = wSm.A00;
        C56078HsR hsR = ul9.A01;
        if (hsR == null || (A002 = C56259HvT.A00(C66580MXl.A0B(textView), hsR)) == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(A002);
            textView.setTypeface(textView.getTypeface(), A1U ? 1 : 0);
        }
        TextView textView2 = ue1.A02;
        C56078HsR hsR2 = ul9.A00;
        if (hsR2 == null || (A00 = C56259HvT.A00(C66580MXl.A0B(textView2), hsR2)) == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(A00);
            DbY.A11(textView2, textView2.getContext());
            WBC.A00(textView2, 33, wSm);
        }
        ue1.A01.setVisibility(8);
        ue1.A04.setVisibility(8);
        WBC.A00(ue1.A00, 34, wSm);
    }

    public final Class modelClass() {
        return C19279WSm.class;
    }
}
