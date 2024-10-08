package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class NO7 extends C232222tE {
    public final C68491NKk A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67949MxZ(DbT.A0D(layoutInflater, viewGroup, R.layout.thread_capability_item, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        Context context;
        int i;
        C68201N5q n5q = (C68201N5q) r6;
        C67949MxZ mxZ = (C67949MxZ) r7;
        boolean A1U = AnonymousClass7TF.A1U(0, n5q, mxZ);
        IgTextView igTextView = mxZ.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(n5q.A03);
        A1A.append(" - ");
        igTextView.setText(AnonymousClass7TF.A0l(n5q.A02, A1A));
        Boolean bool = n5q.A01;
        if (AnonymousClass7TF.A1Y(bool, A1U)) {
            context = igTextView.getContext();
            i = R.attr.igds_color_success;
        } else {
            boolean A1Y = AnonymousClass7TF.A1Y(bool, false);
            context = igTextView.getContext();
            i = R.attr.igds_color_primary_background;
            if (A1Y) {
                i = R.attr.igds_color_error_or_destructive;
            }
        }
        DbT.A16(context, igTextView, 2Yu.A0H(context, i));
        C71408Ok7.A00(igTextView, 58, mxZ, n5q);
    }

    public final Class modelClass() {
        return C68201N5q.class;
    }

    public NO7(C68491NKk nKk) {
        this.A00 = nKk;
    }
}
