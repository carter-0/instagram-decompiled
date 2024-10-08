package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

public final class KFK extends C232222tE {
    public final C63644L1g A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60562JnX(DbT.A0D(layoutInflater, viewGroup, R.layout.location_suggestions_two_rows, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        Li8 li8 = (Li8) r5;
        C60562JnX jnX = (C60562JnX) r6;
        AnonymousClass7TG.A1N(li8, jnX);
        LOe lOe = jnX.A00;
        lOe.A02(li8.A00);
        if (li8.A02) {
            C60409Jl2 jl2 = lOe.A04;
            jl2.A00.clear();
            jl2.notifyDataSetChanged();
            K8A k8a = this.A00.A00;
            if (k8a instanceof C61942KSr) {
                ((C61942KSr) k8a).A0P = false;
            } else {
                ((C61941KSq) k8a).A0U = false;
            }
        }
        List list = li8.A01;
        if (list != null) {
            C60409Jl2 jl22 = lOe.A04;
            DbW.A0z(jl22, list, jl22.A00);
            LOe.A00(lOe, lOe.A02);
        }
    }

    public final Class modelClass() {
        return Li8.class;
    }

    public KFK(C63644L1g l1g) {
        this.A00 = l1g;
    }
}
