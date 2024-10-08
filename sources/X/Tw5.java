package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class Tw5 extends C232222tE {
    public final C21052XBu A00 = new C19349WVq(this, 1);
    public final C21052XBu A01;
    public final X47 A02;

    public Tw5(C21052XBu xBu, X47 x47) {
        0qQ.A0B(xBu, 1);
        this.A01 = xBu;
        this.A02 = x47;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C69166Nfp nfp = (C69166Nfp) r6;
        AnonymousClass7TG.A1N(nfp, r7);
        View view = r7.itemView;
        0qQ.A06(view);
        Object tag = r7.itemView.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(3658));
        VBT.A00(view, nfp.A00, this.A00, (C17494VXx) tag, this.A02);
    }

    public final Class modelClass() {
        return C69166Nfp.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.inform_header, false);
        A0A.setTag(new C17494VXx(A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C17494VXx) {
            return r1;
        }
        throw DbT.A0m();
    }
}
