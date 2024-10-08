package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPe  reason: case insensitive filesystem */
public final class C68608NPe extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C67974Mxy(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_self_note_bottom_sheet_section_title, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        NPH nph = (NPH) r3;
        C67974Mxy mxy = (C67974Mxy) r4;
        AnonymousClass7TG.A1N(nph, mxy);
        mxy.A00.setText(nph.A00);
    }

    public final Class modelClass() {
        return NPH.class;
    }
}
