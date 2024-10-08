package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NNf  reason: case insensitive filesystem */
public final class C68558NNf extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67937MxN(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_header_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        N5P n5p = (N5P) r6;
        C67937MxN mxN = (C67937MxN) r7;
        AnonymousClass7TF.A1H(n5p, mxN);
        String str = n5p.A00;
        boolean A1Q = AnonymousClass7TF.A1Q(str.length());
        TextView textView = mxN.A01;
        if (A1Q) {
            textView.setVisibility(8);
            mxN.A00.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        mxN.A00.setVisibility(8);
        textView.setText(str);
    }

    public final Class modelClass() {
        return N5P.class;
    }
}
