package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNs  reason: case insensitive filesystem */
public final class C68571NNs extends C232222tE {
    public final C62320sa A00;

    public C68571NNs(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fetch_retry_view, false);
        C62320sa r3 = this.A00;
        0qQ.A0B(r3, 2);
        C249703kE r2 = new C249703kE(A0D);
        A0D.findViewById(R.id.retry_fetch_container);
        C71403Ok2.A01(A0D.findViewById(R.id.retry_button), 9, r3);
        A0D.findViewById(R.id.error_text);
        return r2;
    }

    public final Class modelClass() {
        return C68596NOs.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }
}
