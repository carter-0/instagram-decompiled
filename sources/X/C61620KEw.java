package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KEw  reason: case insensitive filesystem */
public final class C61620KEw extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60551JnM(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_empty_state_section, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C61153Jy5 jy5 = (C61153Jy5) r3;
        C60551JnM jnM = (C60551JnM) r4;
        AnonymousClass7TG.A1N(jy5, jnM);
        jnM.A00.setText(jy5.A00);
    }

    public final Class modelClass() {
        return C61153Jy5.class;
    }
}
