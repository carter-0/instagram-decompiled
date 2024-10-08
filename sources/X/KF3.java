package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KF3 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60566Jnb(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_visibility, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C60566Jnb jnb = (C60566Jnb) r4;
        C64273LXz.A00(jnb.A00, AnonymousClass7TG.A1Z(r3, jnb) ? 1 : 0, r3);
    }

    public final Class modelClass() {
        return C64767Lhj.class;
    }
}
