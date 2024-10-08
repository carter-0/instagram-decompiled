package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ui5  reason: case insensitive filesystem */
public final class C15760Ui5 extends C232222tE {
    public final VPC A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C15805Uio uio = (C15805Uio) r7;
        UBS ubs = (UBS) r8;
        boolean A1Z = AnonymousClass7TG.A1Z(uio, ubs);
        VPC vpc = this.A00;
        int i = uio.A00;
        0qQ.A0B(vpc, A1Z ? 1 : 0);
        IgTextView igTextView = ubs.A00;
        if (igTextView != null) {
            Context context = igTextView.getContext();
            String A16 = AnonymousClass7TE.A16(context, 2131952327);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(DbY.A0c(context, A16, i));
            AnonymousClass7AV.A05(spannableStringBuilder, new UsT(vpc, DbV.A02(context)), A16);
            DbX.A1G(igTextView, spannableStringBuilder);
        }
    }

    public final Class modelClass() {
        return C15805Uio.class;
    }

    public C15760Ui5(VPC vpc) {
        this.A00 = vpc;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.UBS] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        IgTextView igTextView;
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        IgTextView A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.shop_management_learn_more, false);
        ? r1 = new C249703kE(A0D);
        if (A0D instanceof IgTextView) {
            igTextView = A0D;
        } else {
            igTextView = null;
        }
        r1.A00 = igTextView;
        return r1;
    }
}
