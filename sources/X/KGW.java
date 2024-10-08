package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KGW extends C232232tF {
    public View A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C61155Jy7 jy7 = (C61155Jy7) r3;
        C60616JoP joP = (C60616JoP) r4;
        AnonymousClass7TG.A1N(jy7, joP);
        joP.A00.setVisibility(DbW.A01(jy7.A00 ? 1 : 0));
    }

    public final Class modelClass() {
        return C61155Jy7.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_other_members_header, false);
        this.A00 = A0D;
        return new C60616JoP(A0D);
    }
}
