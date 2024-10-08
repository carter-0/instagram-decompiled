package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8i4  reason: invalid class name and case insensitive filesystem */
public final class C362538i4 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.stories_gallery_meta_gallery_footer_message, viewGroup, false);
        0qQ.A07(inflate);
        return new AnonymousClass9YU(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C362588i9 r32 = (C362588i9) r3;
        AnonymousClass9YU r42 = (AnonymousClass9YU) r4;
        0qQ.A0B(r32, 0);
        0qQ.A0B(r42, 1);
        r42.A00.setText(r32.A00);
    }

    public final Class modelClass() {
        return C362588i9.class;
    }
}
