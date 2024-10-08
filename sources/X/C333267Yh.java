package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Yh  reason: invalid class name and case insensitive filesystem */
public final class C333267Yh extends C331647Ru {
    public final UserSession A00;
    public final C317996oB A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final C62320sa A03;

    public final void A05(View view) {
        this.A01.A02((AnonymousClass2Ep) this.A03.invoke());
    }

    public final boolean A08() {
        return 182.A06(0Tu.A05, this.A00, 36320824730788740L);
    }

    public C333267Yh(UserSession userSession, C331627Rs r4, C317996oB r5, C62320sa r6) {
        super(r4);
        this.A00 = userSession;
        this.A03 = r6;
        this.A01 = r5;
    }
}
