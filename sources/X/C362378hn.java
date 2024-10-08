package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8hn  reason: invalid class name and case insensitive filesystem */
public final class C362378hn extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.stories_gallery_section_subheader, viewGroup, false);
        0qQ.A07(inflate);
        return new AnonymousClass9YZ(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C362418hr r32 = (C362418hr) r3;
        AnonymousClass9YZ r42 = (AnonymousClass9YZ) r4;
        0qQ.A0B(r32, 0);
        0qQ.A0B(r42, 1);
        r42.A00.setText(r32.A00);
    }

    public final Class modelClass() {
        return C362418hr.class;
    }
}
