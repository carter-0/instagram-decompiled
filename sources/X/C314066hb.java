package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.6hb  reason: invalid class name and case insensitive filesystem */
public abstract class C314066hb extends C252423p5 {
    public final int A00;
    public final C2366634p A01 = A02("animation_component");

    public final int A0L() {
        return this.A00;
    }

    public void A0M() {
        this.A01.A05();
    }

    public final void A0N() {
        if (this.A01) {
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 4);
        }
        A09(AwakeTimeSinceBootClock.INSTANCE.now());
        this.A01.A08((String) null);
    }

    public C314066hb(Context context, UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
        A0B(context);
    }
}
