package X;

import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.5oX  reason: invalid class name and case insensitive filesystem */
public final class C295585oX implements Runnable {
    public final /* synthetic */ C3722490b A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;
    public final /* synthetic */ C267874cM A03;

    public C295585oX(C3722490b r1, UserSession userSession, LocationPluginImpl locationPluginImpl, C267874cM r4) {
        this.A02 = locationPluginImpl;
        this.A00 = r1;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        if (this.A00.isCancelled()) {
            this.A02.removeLocationUpdates(this.A01, this.A03);
        }
    }
}
