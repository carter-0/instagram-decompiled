package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NO4 extends C232222tE {
    public final C333187Xz A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67910Mws(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_shh_mode_interleaved_footer, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        AnonymousClass7OA r32 = (AnonymousClass7OA) r3;
        C67910Mws mws = (C67910Mws) r4;
        AnonymousClass7TG.A1N(r32, mws);
        TextView textView = mws.A00;
        textView.setText(r32.A03);
        textView.setBackgroundColor(r32.A00);
        C71397Ojw.A00(textView, 48, this);
    }

    public final Class modelClass() {
        return AnonymousClass7OA.class;
    }

    public NO4(C333187Xz r1) {
        this.A00 = r1;
    }
}
