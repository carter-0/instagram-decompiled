package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNj  reason: case insensitive filesystem */
public final class C68562NNj extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67950Mxa(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_spam_folder_header_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C68602NOy nOy = (C68602NOy) r3;
        C67950Mxa mxa = (C67950Mxa) r4;
        AnonymousClass7TG.A1N(nOy, mxa);
        mxa.A00.setText(nOy.A00);
    }

    public final Class modelClass() {
        return C68602NOy.class;
    }
}
