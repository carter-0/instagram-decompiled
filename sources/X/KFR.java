package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KFR extends C232222tE {
    public final K89 A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60631Joe(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_reels_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64802LiM liM = (C64802LiM) r4;
        C60631Joe joe = (C60631Joe) r5;
        AnonymousClass7TG.A1N(liM, joe);
        joe.A03.setUrl(DbS.A0V(liM.A05), this.A01);
        joe.A02.setText(liM.A03);
        joe.A01.setText(liM.A02);
        LY8.A00(joe.A00, 8, liM, this);
    }

    public final Class modelClass() {
        return C64802LiM.class;
    }

    public KFR(K89 k89, AnonymousClass0iw r2) {
        this.A00 = k89;
        this.A01 = r2;
    }
}
