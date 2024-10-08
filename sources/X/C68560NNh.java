package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNh  reason: case insensitive filesystem */
public final class C68560NNh extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67912Mwu(DbT.A0D(layoutInflater, viewGroup, R.layout.header_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        N5T n5t = (N5T) r4;
        C67912Mwu mwu = (C67912Mwu) r5;
        AnonymousClass7TG.A1N(n5t, mwu);
        DbT.A18(DbS.A07(mwu), mwu.A00, n5t.A00);
    }

    public final Class modelClass() {
        return N5T.class;
    }
}
