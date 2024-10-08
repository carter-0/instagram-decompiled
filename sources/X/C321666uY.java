package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6uY  reason: invalid class name and case insensitive filesystem */
public final class C321666uY extends C321676uZ {
    public Integer A00 = AnonymousClass05K.A00;
    public boolean A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C321666uY(UserSession userSession, boolean z, boolean z2) {
        super(userSession, "clips_profile_tab", 31795244);
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void A0O(Context context, 2cc r4, AnonymousClass0iw r5, AnonymousClass4DJ r6) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    public final void A0P(Context context, 2cc r4, AnonymousClass0iw r5, AnonymousClass4DJ r6, boolean z) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    public final void A0R(Context context, 2cc r4, AnonymousClass4DJ r5) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    public final void A05() {
        super.A05();
        A0K("is_self_profile", this.A03);
        A0K("is_clips_profile_starting_tab", this.A04);
    }
}
