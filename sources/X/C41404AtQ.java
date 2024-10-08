package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.AtQ  reason: case insensitive filesystem */
public final /* synthetic */ class C41404AtQ implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C41404AtQ(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        return new IgNetworkConsentManager(this.A00);
    }
}
