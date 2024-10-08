package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPa  reason: case insensitive filesystem */
public final class C68604NPa extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C67900Mwi(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.direct_thread_color_picker_header_view, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C71951Otc otc = (C71951Otc) r3;
        C67900Mwi mwi = (C67900Mwi) r4;
        AnonymousClass7TG.A1N(otc, mwi);
        mwi.A00.setText(otc.A00);
    }

    public final Class modelClass() {
        return C71951Otc.class;
    }
}
