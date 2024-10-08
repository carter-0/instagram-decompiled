package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mmo  reason: case insensitive filesystem */
public final class C67372Mmo extends C232222tE {
    public final XBt A00;
    public final X41 A01;
    public final 0sP A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C69008Nck nck = (C69008Nck) r8;
        My7 my7 = (My7) r9;
        AnonymousClass7TF.A1H(nck, my7);
        this.A01.ECL(JTO.A0F(my7), this.A00.B9n(nck), nck.A02, nck, false);
        C71409Ok8.A01(my7.itemView, 8, this, nck);
        my7.A00.setText(nck.A00.A00().A04);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new My7(DbT.A0D(layoutInflater, viewGroup, R.layout.keyword_header, false));
    }

    public final Class modelClass() {
        return C69008Nck.class;
    }

    public C67372Mmo(XBt xBt, X41 x41, 0sP r3) {
        this.A01 = x41;
        this.A00 = xBt;
        this.A02 = r3;
    }
}
