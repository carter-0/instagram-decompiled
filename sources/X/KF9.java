package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

public final class KF9 extends C232222tE {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60521Jms(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_empty_state, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        KGK kgk = (KGK) r5;
        C60521Jms jms = (C60521Jms) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(kgk, jms);
        IgdsEmptyState igdsEmptyState = jms.A00;
        igdsEmptyState.EZe(R.drawable.instagram_gift_box_outline_96, A1Z);
        igdsEmptyState.setBody((CharSequence) kgk.A01);
        String str = kgk.A00;
        if (str != null && !00l.A0W(str)) {
            igdsEmptyState.setAction(str, new LYC((Object) this, 18));
        }
    }

    public final Class modelClass() {
        return KGK.class;
    }

    public KF9(C62320sa r1) {
        this.A00 = r1;
    }
}
