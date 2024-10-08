package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNn  reason: case insensitive filesystem */
public final class C68566NNn extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A0A = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.row_switch_item, false);
        Mz1 mz1 = new Mz1(A0A);
        A0A.setTag(mz1);
        C48947Eml.A00(A0A, mz1.A06);
        0qQ.A0C(mz1, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleSwitchRowViewBinder.Holder");
        return mz1;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        N5W n5w = (N5W) r3;
        Mz1 mz1 = (Mz1) r4;
        AnonymousClass7TG.A1N(n5w, mz1);
        O31.A00((FAT) null, mz1, (C74279Ps7) null, n5w.A00);
    }

    public final Class modelClass() {
        return N5W.class;
    }
}
