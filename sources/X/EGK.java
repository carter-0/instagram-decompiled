package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.loadmore2.LoadMoreButton;

public final class EGK extends C232222tE {
    public final G5G A00;

    public final C46929Dnj A00(ViewGroup viewGroup) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        G5G g5g = this.A00;
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.load_more_container);
        ((LoadMoreButton) A0C.requireViewById(R.id.load_more_button)).A03 = g5g;
        return new C46929Dnj(A0C);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        ((C46929Dnj) r4).A00.setState(((FYP) r3).A00);
    }

    public final Class modelClass() {
        return FYP.class;
    }

    public EGK(G5G g5g) {
        this.A00 = g5g;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(viewGroup);
    }
}
