package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class Tw7 extends C232222tE {
    public final X47 A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C16193UqI uqI = (C16193UqI) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(uqI, r7);
        Object tag = r7.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.search.NoResultsRowViewBinder.Holder");
        C48234EbF ebF = (C48234EbF) tag;
        C56078HsR hsR = uqI.A00;
        X47 x47 = this.A00;
        Dba.A0j(A1Z ? 1 : 0, ebF, hsR);
        TextView textView = ebF.A01;
        View view = ebF.A00;
        textView.setText(C56259HvT.A00(C66580MXl.A0B(view), hsR));
        if (x47 != null) {
            x47.EBK(view, hsR);
        }
    }

    public final Class modelClass() {
        return C16193UqI.class;
    }

    public Tw7(X47 x47) {
        this.A00 = x47;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A002 = C49162EqT.A00(layoutInflater, viewGroup);
        C249703kE r1 = new C249703kE(A002);
        if (A002.getTag() instanceof C48234EbF) {
            return r1;
        }
        throw DbT.A0m();
    }

    public Tw7() {
        this((X47) null);
    }
}
