package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNl  reason: case insensitive filesystem */
public final class C68564NNl extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67921Mx7(DbU.A09(layoutInflater, viewGroup, R.layout.friend_map_updates_title, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        N5V n5v = (N5V) r3;
        C67921Mx7 mx7 = (C67921Mx7) r4;
        AnonymousClass7TG.A1N(n5v, mx7);
        mx7.A00.setText(n5v.A00);
    }

    public final Class modelClass() {
        return N5V.class;
    }
}
