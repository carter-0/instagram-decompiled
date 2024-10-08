package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNk  reason: case insensitive filesystem */
public final class C68563NNk extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67919Mx5(DbT.A0D(layoutInflater, viewGroup, R.layout.user_group_header_text, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        NP1 np1 = (NP1) r3;
        C67919Mx5 mx5 = (C67919Mx5) r4;
        AnonymousClass7TG.A1N(np1, mx5);
        mx5.A00.setText(np1.A00);
    }

    public final Class modelClass() {
        return NP1.class;
    }
}
