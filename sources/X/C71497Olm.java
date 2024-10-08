package X;

import android.app.Dialog;
import com.instagram.rtc.activity.RtcCallActivity;

/* renamed from: X.Olm  reason: case insensitive filesystem */
public final class C71497Olm implements C13907Tl7, AnonymousClass07Y {
    public final int A00;
    public final Object A01;

    public C71497Olm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r4) {
        switch (this.A00) {
            case 1:
                0qQ.A0B(r4, 0);
                ((Dialog) this.A01).dismiss();
                return;
            case 3:
                C70845ONx oNx = ((RtcCallActivity) this.A01).A02;
                if (oNx == null) {
                    0qQ.A0F("presenterBridge");
                    throw AnonymousClass00P.createAndThrow();
                } else if (oNx.A01 != null) {
                    oNx.A04.A03(new PLR(false));
                    return;
                } else {
                    oNx.A03.A7I(new PLR(false));
                    return;
                }
            default:
                return;
        }
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r4) {
        switch (this.A00) {
            case 2:
                0qQ.A0B(r4, 0);
                ((2Wa) this.A01).A01(false);
                return;
            case 3:
                C70845ONx oNx = ((RtcCallActivity) this.A01).A02;
                if (oNx == null) {
                    0qQ.A0F("presenterBridge");
                    throw AnonymousClass00P.createAndThrow();
                } else if (oNx.A01 != null) {
                    oNx.A04.A03(new PLR(true));
                    return;
                } else {
                    oNx.A03.A7I(new PLR(true));
                    return;
                }
            default:
                return;
        }
    }

    public final void onStart(AnonymousClass07Z r4) {
        if (this.A00 == 0) {
            C363058j1.A02.A01("sup:MediaStreamAppLifecycleListener", "App moved to foreground");
            ((OMN) this.A01).A01.onAppForegrounded();
        }
    }

    public final void onStop(AnonymousClass07Z r4) {
        if (this.A00 == 0) {
            C363058j1.A02.A01("sup:MediaStreamAppLifecycleListener", "App moved to background");
            ((OMN) this.A01).A01.onAppBackgrounded();
        }
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }
}
