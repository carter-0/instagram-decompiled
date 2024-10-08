package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Uhm  reason: case insensitive filesystem */
public final class C15741Uhm extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C15807Uiq uiq = (C15807Uiq) r5;
        UBW ubw = (UBW) r6;
        AnonymousClass7TG.A1N(uiq, ubw);
        String str = uiq.A01;
        String str2 = uiq.A00;
        IgTextView igTextView = ubw.A01;
        igTextView.setText(str);
        igTextView.setVisibility(0);
        if (str2 != null) {
            IgTextView igTextView2 = ubw.A00;
            igTextView2.setText(str2);
            igTextView2.setVisibility(0);
            return;
        }
        ubw.A00.setVisibility(8);
    }

    public final Class modelClass() {
        return C15807Uiq.class;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.UBW] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.product_row_no_results, false);
        ? r1 = new C249703kE(A0D);
        r1.A01 = Dba.A0E(A0D, R.id.row_no_results_title);
        r1.A00 = Dba.A0E(A0D, R.id.row_no_results_message);
        return r1;
    }
}
