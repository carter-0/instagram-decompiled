package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPn  reason: case insensitive filesystem */
public final class C68617NPn extends C232232tF {
    public final int A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68005MyX(DbT.A0D(layoutInflater, viewGroup, R.layout.quick_snap_consumption_viewer_end_card, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C68005MyX myX = (C68005MyX) r6;
        AnonymousClass7TG.A1N(r5, myX);
        View view = myX.A01;
        int i = this.A00;
        0nA.A0g(view, i, i);
        I7E.A06(view, i);
        0nA.A0g(myX.A02, i, i);
        C66581MXm.A15(myX.A00, myX.A03, AnonymousClass7TE.A0M(00k.A0G(KGN.A01, 2SP.A00)));
    }

    public final Class modelClass() {
        return KGN.class;
    }

    public C68617NPn(int i) {
        this.A00 = i;
    }
}
