package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.List;

public abstract class A18 {
    public static final int A00(String str) {
        List A0R = 00l.A0R(str, new String[]{":"}, 0);
        if (A0R.size() == 3) {
            try {
                int parseInt = Integer.parseInt(AnonymousClass7TE.A19(A0R, 0));
                int parseInt2 = Integer.parseInt(AnonymousClass7TE.A19(A0R, 1));
                int parseInt3 = Integer.parseInt(AnonymousClass7TE.A19(00l.A0R((CharSequence) A0R.get(2), new String[]{","}, 0), 0));
                return (((parseInt * ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS) + (parseInt2 * 60) + parseInt3) * IgNetworkConsentStorage.MAX_ENTRIES) + Integer.parseInt(AnonymousClass7TE.A19(00l.A0R((CharSequence) A0R.get(2), new String[]{","}, 0), 1));
            } catch (Exception e) {
                0KC.A0F("KaraokeStickerUtil", "Error parsing time string from SRT file", e);
            }
        }
        return -1;
    }
}
