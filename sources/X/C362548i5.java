package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8i5  reason: invalid class name and case insensitive filesystem */
public final class C362548i5 extends C232232tF {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.stories_gallery_meta_gallery_loading_spinner, viewGroup, false);
        0qQ.A07(inflate);
        return new AnonymousClass9YV(inflate);
    }

    public final Class modelClass() {
        return C362598iA.class;
    }
}
