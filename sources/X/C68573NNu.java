package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNu  reason: case insensitive filesystem */
public final class C68573NNu extends C232222tE {
    public final O6I A00;

    public C68573NNu(O6I o6i) {
        0qQ.A0B(o6i, 1);
        this.A00 = o6i;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67964Mxo(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_header_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C68194N5j n5j = (C68194N5j) r4;
        C67964Mxo mxo = (C67964Mxo) r5;
        AnonymousClass7TG.A1N(n5j, mxo);
        mxo.A02.setText(n5j.A00);
        View view = mxo.A01;
        int i = 0;
        view.setVisibility(DbW.A01(n5j.A01 ? 1 : 0));
        C71407Ok6.A00(view, 55, this);
        View view2 = mxo.A00;
        if (!n5j.A02) {
            i = 8;
        }
        view2.setVisibility(i);
        C71407Ok6.A00(view2, 56, this);
    }

    public final Class modelClass() {
        return C68194N5j.class;
    }
}
