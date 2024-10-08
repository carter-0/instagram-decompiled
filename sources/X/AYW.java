package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

public final class AYW implements AnonymousClass68Z {
    public final /* synthetic */ C3262976e A00;

    public AYW(C3262976e r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PPRLoggingData pPRLoggingData;
        String str = (String) obj;
        if (182.A06(0Tu.A05, this.A00.A01.A00, 36319020844063538L)) {
            pPRLoggingData = new PPRLoggingData(AnonymousClass05K.A01, AnonymousClass05K.A00, NetInfoModule.CONNECTION_TYPE_NONE, false, false, false);
        } else {
            pPRLoggingData = null;
        }
        0qQ.A0A(str);
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl((ExtendedImageUrl) null, (Integer) null, (Integer) null, (Long) null, str, (String) null, (String) null, (List) null);
        extendedImageUrl.A00 = pPRLoggingData;
        return extendedImageUrl;
    }
}
