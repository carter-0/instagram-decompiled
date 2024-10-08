package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

public final /* synthetic */ class GXG extends 03J implements 0sP {
    public GXG(Object obj) {
        super(1, obj, AnonymousClass32L.class, "launchKeywordSerp", "launchKeywordSerp(Lcom/instagram/model/keyword/Keyword;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Keyword keyword = (Keyword) obj;
        C52530GWh gWh = ((AnonymousClass32L) C51969G9p.A0t(keyword, this)).A0C;
        if (gWh == null) {
            0qQ.A0F("exploreGridDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession = gWh.A09;
        if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36331033867600762L)) {
            C309516Yo A0H = DbW.A0H(gWh.A0D.A00, userSession);
            A0H.A08();
            C14398TvR.A00();
            A0H.A0B((Bundle) null, C14452Twa.A02(keyword, gWh.A0F.getModuleName(), AnonymousClass7TG.A0j(), (String) null, (String) null));
            A0H.A04();
        }
        return C60340gF.A00;
    }
}
