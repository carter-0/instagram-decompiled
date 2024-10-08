package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.NPi  reason: case insensitive filesystem */
public final class C68612NPi extends C232232tF {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67892Mwa(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_manage_folders_footer, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        N5Z n5z = (N5Z) r3;
        C67892Mwa mwa = (C67892Mwa) r4;
        AnonymousClass7TG.A1N(n5z, mwa);
        IgdsButton igdsButton = mwa.A00;
        igdsButton.setEnabled(n5z.A01);
        C71401Ok0.A01(igdsButton, 3, this);
    }

    public final Class modelClass() {
        return N5Z.class;
    }

    public C68612NPi(C62320sa r1) {
        this.A00 = r1;
    }
}
