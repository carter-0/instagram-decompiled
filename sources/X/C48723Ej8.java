package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Ej8  reason: case insensitive filesystem */
public abstract class C48723Ej8 {
    public static final void A00(C268654dm r2, String str, String str2) {
        AnonymousClass7TG.A1O(str2, r2);
        String A0u = 002.A0u("[Bloks] ", str, ": ", str2);
        Throwable A01 = r2.A01();
        if (A01 != null) {
            0wb.A05(A0u, "request failed", IgNetworkConsentStorage.MAX_ENTRIES, A01);
        } else {
            0wb.A04(A0u, "request failed", IgNetworkConsentStorage.MAX_ENTRIES);
        }
    }
}
