package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uj5  reason: case insensitive filesystem */
public final class C15822Uj5 extends C232232tF {
    public final C20900X3r A00 = new C19344WVl(this);
    public final C20900X3r A01;
    public final X47 A02;

    public C15822Uj5(C20900X3r x3r, X47 x47) {
        0qQ.A0B(x3r, 1);
        this.A01 = x3r;
        this.A02 = x47;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C69165Nfo nfo = (C69165Nfo) r9;
        boolean A1Z = AnonymousClass7TG.A1Z(nfo, r10);
        View view = r10.itemView;
        0qQ.A06(view);
        Object tag = r10.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InformMessageBodylessFooterViewBinder.Holder");
        VS2 vs2 = (VS2) tag;
        N3M n3m = nfo.A00;
        C20900X3r x3r = this.A00;
        X47 x47 = this.A02;
        AnonymousClass7TF.A1C(vs2, A1Z ? 1 : 0, x3r);
        UsS usS = new UsS(n3m, x3r, AnonymousClass7TF.A03(view.getContext(), R.attr.igds_color_link));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(n3m.A04);
        String str = n3m.A03;
        if (str != null) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(str);
            AnonymousClass7AV.A05(spannableStringBuilder, usS, str);
        }
        DbX.A1G(vs2.A00, spannableStringBuilder);
        if (x47 != null) {
            x47.EBK(view, n3m);
        }
    }

    public final Class modelClass() {
        return C69165Nfo.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.inform_footer, false);
        A0A.setTag(new VS2(viewGroup, A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof VS2) {
            return r1;
        }
        throw DbT.A0m();
    }
}
