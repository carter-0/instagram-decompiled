package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.common.session.UserSession;

public final class XZP {
    public final XAnalyticsAdapterHolder A00;

    public XZP(UserSession userSession) {
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        this.A00 = new XAnalyticsAdapterHolder(new C12392Ssg(userSession));
    }
}
