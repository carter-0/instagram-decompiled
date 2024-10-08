package X;

import android.location.Location;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.5q7  reason: invalid class name and case insensitive filesystem */
public final class C296475q7 implements C13709TfW {
    public final /* synthetic */ AnonymousClass60p A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ C267874cM A02;

    public C296475q7(AnonymousClass60p r1, LocationPluginImpl locationPluginImpl, C267874cM r3) {
        this.A01 = locationPluginImpl;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void DCf(Q0M q0m) {
        this.A02.DCn(q0m);
        this.A00.A06();
    }

    public final void DOh(C276164sm r4) {
        this.A02.onLocationChanged(new Location(r4.A00));
    }
}
