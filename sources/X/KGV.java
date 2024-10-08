package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class KGV extends C232232tF {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.ai_sticker_generate_more_button, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C61178JyU jyU = (C61178JyU) r5;
        boolean A1U = AnonymousClass7TF.A1U(0, jyU, r6);
        IgdsButton A0n = JTR.A0n(r6.itemView, R.id.action_button);
        if (!jyU.A00) {
            LY0.A00(r6.itemView, A1U ? 1 : 0, this);
            A0n.setLoading(false);
            return;
        }
        A0n.setLoading(A1U);
    }

    public final Class modelClass() {
        return C61178JyU.class;
    }

    public KGV(C62320sa r1) {
        this.A00 = r1;
    }
}
