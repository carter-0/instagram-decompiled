package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2m7  reason: invalid class name */
public final class AnonymousClass2m7 extends AnonymousClass2m1 {
    public final Context A00;
    public final UserSession A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void Des(AnonymousClass1GU r6, 1XM r7) {
        boolean z;
        0qQ.A0B(r7, 1);
        try {
            C241193Og r0 = r7.A07;
            if (r0 == null) {
                r0 = C241193Og.A02;
            }
            C241213Oi r02 = r0.A00;
            if (r02 != null) {
                z = r02.A00;
                C243473Yx.A00 = z;
                UserSession userSession = this.A01;
                0Tu r4 = 0Tu.A05;
                if (!182.A06(r4, userSession, 36328151947623424L)) {
                    return;
                }
                if (!182.A06(r4, userSession, 36328151947688961L) || this.A02.compareAndSet(false, true)) {
                    boolean A06 = 182.A06(r4, userSession, 36328151948082183L);
                    boolean A062 = 182.A06(r4, userSession, 36328151948016646L);
                    if (A06) {
                        AnonymousClass1HI.A02.Eyo(new H8O(this));
                    } else if (A062) {
                        AnonymousClass1HI.A02.Eym(new H8P(this));
                    } else {
                        C243473Yx.A05.A09(userSession, this.A00, ClipsPrefetchTriggerType.COLD_START.A00);
                    }
                }
            } else {
                throw new IllegalStateException("clips config is not available");
            }
        } catch (IllegalStateException unused) {
            z = true;
        }
    }

    public AnonymousClass2m7(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
