package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPd  reason: case insensitive filesystem */
public final class C68607NPd extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C67973Mxx(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_note_reactions_disclaimer_item, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        NPG npg = (NPG) r3;
        C67973Mxx mxx = (C67973Mxx) r4;
        AnonymousClass7TG.A1N(npg, mxx);
        mxx.A00.setText(npg.A00);
    }

    public final Class modelClass() {
        return NPG.class;
    }
}
