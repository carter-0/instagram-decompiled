package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2kw  reason: invalid class name and case insensitive filesystem */
public final class C228192kw implements C13907Tl7 {
    public C229772oA A00;
    public AnonymousClass2o0 A01;
    public final Context A02;
    public final UserSession A03;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void onDestroy(AnonymousClass07Z r4) {
        AnonymousClass2o0 r2 = this.A01;
        if (r2 != null) {
            C229772oA r0 = this.A00;
            if (r0 == null) {
                0qQ.A0F("feedPickerStateManager");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A05.remove(r2);
        }
        this.A01 = null;
    }

    public C228192kw(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
