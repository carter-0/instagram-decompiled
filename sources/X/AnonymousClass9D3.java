package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9D3  reason: invalid class name */
public final class AnonymousClass9D3 implements C61110lV {
    public static AnonymousClass9D3 A02;
    public static final AnonymousClass9D4 A03 = new Object();
    public final AnonymousClass9D6 A00;
    public final AnonymousClass9D7 A01 = new AnonymousClass9D7();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0iw, java.lang.Object] */
    public AnonymousClass9D3(Context context, UserSession userSession) {
        this.A00 = new AnonymousClass9D6(context, AnonymousClass0kN.A01(new Object(), userSession), userSession);
    }

    public final void onAppBackgrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(1730655972);
        if (!182.A06(0Tu.A05, this.A00.A02, 36310774506848530L)) {
            i = 1046696534;
        } else {
            AtomicBoolean atomicBoolean = this.A01.A00;
            if (!atomicBoolean.getAndSet(true)) {
                if (AnonymousClass0xl.A00(C61170le.A00).A00.getLong("bigfoot_reporter_last_foreground_measurement", 0) < System.currentTimeMillis() - 86400000) {
                    0nY.A00().ATE(new C8787R9o(this));
                } else {
                    atomicBoolean.set(false);
                }
            }
            i = 1001981991;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(916252009, AnonymousClass0fD.A03(1805108369));
    }
}
