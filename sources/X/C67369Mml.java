package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mml  reason: case insensitive filesystem */
public final class C67369Mml extends C232222tE {
    public final String A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67918Mx4(C66582MXn.A0E(layoutInflater, viewGroup, R.layout.title_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C67918Mx4 mx4 = (C67918Mx4) r4;
        0qQ.A0B(mx4, 1);
        String str = this.A00;
        0qQ.A0B(str, 0);
        mx4.A00.setText(str);
    }

    public final Class modelClass() {
        return C69013Ncp.class;
    }

    public C67369Mml(String str) {
        this.A00 = str;
    }
}
