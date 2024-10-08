package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ejy  reason: case insensitive filesystem */
public abstract class C48775Ejy {
    public static final int A00(UserSession userSession) {
        boolean A06 = 182.A06(0Tu.A05, userSession, 36317324331979800L);
        int A07 = DbX.A07(Dc2.A0S);
        if (!A06) {
            return A07 + IgNetworkConsentStorage.MAX_ENTRIES;
        }
        return A07;
    }
}
