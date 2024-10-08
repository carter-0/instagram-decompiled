package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.PWr  reason: case insensitive filesystem */
public final class C73110PWr implements Runnable {
    public final /* synthetic */ C314436iG A00;

    public C73110PWr(C314436iG r1) {
        this.A00 = r1;
    }

    public final void run() {
        C314436iG r2 = this.A00;
        UserSession userSession = r2.A0e;
        Context context = r2.A0W;
        0qQ.A07(context);
        View view = r2.A0Y;
        AnonymousClass0iw r5 = r2.A0d;
        N3L n3l = r2.A05;
        if (n3l != null) {
            OPM.A01(context, view, r5, userSession, r2.A0l, (AnonymousClass7L0) null, n3l);
            N3L n3l2 = r2.A05;
            if (n3l2 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (C70271O0b.A00(userSession, n3l2, false)) {
                C314426iF r0 = r2.A0o;
                r0.A00 = false;
                r0.A06.A0M(false);
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
