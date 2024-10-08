package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LsF  reason: case insensitive filesystem */
public final class C65374LsF implements C234222xL {
    public final /* synthetic */ UserSession A00;

    public final boolean Ds8(AnonymousClass5Gv r2) {
        return true;
    }

    public final void DsC(AnonymousClass5Gv r1) {
    }

    public final void DsE(AnonymousClass5Gv r1) {
    }

    public C65374LsF(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void DsH(AnonymousClass5Gv r5) {
        0xY A0g = AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(this.A00), "preference_feed_picker_nux_count");
        A0g.E5c("preference_feed_picker_nux_last_seen_time", System.currentTimeMillis());
        A0g.apply();
    }
}
