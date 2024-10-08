package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E17 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ShareToStoryNuxFragment";
    public int A00;
    public 2Er A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C41655Ay7(this, 11));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "social_channel_share_to_story_nux_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.subtitle);
        2Er r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("threadViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean A0K = 0qQ.A0K(r0.AsX(), DbU.A0u(this.A03));
        int i = 2131959614;
        if (A0K) {
            i = 2131959613;
        }
        DbU.A1G(A0R, this, i);
        View A0G = AnonymousClass7TF.A0G(view, R.id.primary_button);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.secondary_button);
        FPI.A01(A0G, 33, this);
        FPI.A01(A0G2, 34, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-877124043);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_channel_share_to_story_nux, false);
        AnonymousClass0fD.A09(-894249878, A022);
        return A0D;
    }
}
