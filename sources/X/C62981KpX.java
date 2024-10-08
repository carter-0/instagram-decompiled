package X;

import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.KpX  reason: case insensitive filesystem */
public abstract class C62981KpX {
    public static final IgCdlProviderBuilder A00(VLB vlb, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, vlb);
        IgCdlProviderBuilder igCdlProviderBuilder = IgCdlProviderBuilder.A06;
        if (igCdlProviderBuilder != null) {
            return igCdlProviderBuilder;
        }
        IgCdlProviderBuilder igCdlProviderBuilder2 = new IgCdlProviderBuilder(vlb, userSession);
        IgCdlProviderBuilder.A06 = igCdlProviderBuilder2;
        return igCdlProviderBuilder2;
    }
}
