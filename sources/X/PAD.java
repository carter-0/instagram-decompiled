package X;

import android.view.View;
import com.instagram.android.R;

public final class PAD implements C74404PuK {
    public final C333517Zg A00;

    public final boolean isEnabled() {
        AnonymousClass7S7 C6l = this.A00.C6l();
        if (!(C6l instanceof AnonymousClass7S6)) {
            return false;
        }
        0qQ.A0C(C6l, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.DirectThreadViewDataLoader");
        AnonymousClass2Ep r0 = ((AnonymousClass7S6) C6l).A07;
        r0.getClass();
        return r0.CUJ();
    }

    public PAD(C333517Zg r1) {
        this.A00 = r1;
    }

    public final N4H BWk() {
        return new N4H((View.OnClickListener) new C71397Ojw(this, 40), (int) R.drawable.instagram_link_pano_outline_24, 2131968701);
    }
}
