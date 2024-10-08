package X;

import android.content.Context;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Ajo  reason: case insensitive filesystem */
public final class C40818Ajo implements Runnable {
    public final /* synthetic */ C353438Hq A00;

    public C40818Ajo(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void run() {
        C352888Fl r2 = this.A00.A09;
        ShutterButton shutterButton = r2.A1I;
        shutterButton.setHandsFreeRecordingEnabled(true);
        AnonymousClass85X r0 = r2.A0v;
        r0.A0B = true;
        AnonymousClass85X.A06(r0);
        r2.A0p.setEnabled(false);
        if (1X9.A00 != null) {
            if (AnonymousClass38W.A00().A02(r2.A0P, r2.A0f)) {
                r2.A0m.A05();
                shutterButton.A04(CancelReason.SYSTEM_CANCELLED, "Single Tap in Video Call");
                return;
            }
        }
        if (r2.A1U) {
            UserSession userSession = r2.A0f;
            0qQ.A0B(userSession, 0);
            0Tu r5 = 0Tu.A05;
            if (!182.A06(r5, userSession, 36320502608110081L) && ((!r2.A1Q || !182.A06(r5, userSession, 36321769627068161L)) && !AnonymousClass1GD.A03())) {
                Context context = C60960kU.A00;
                shutterButton.setShutterButtonSingularColor(context.getColor(2Yu.A04(context)));
            }
        }
        r2.A16.A03 = true;
        shutterButton.A0i.A01("start_handsfree_recording");
        r2.A1F.A00().A00();
    }
}
