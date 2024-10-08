package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;

/* renamed from: X.AVx  reason: case insensitive filesystem */
public final class C40207AVx implements AnonymousClass1JW {
    public final /* synthetic */ UserSession A00;

    public C40207AVx(UserSession userSession) {
        this.A00 = userSession;
    }

    public final XAnalyticsHolder CGv() {
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        return new XAnalyticsAdapterHolder(new 0kQ((ImmutableMap) null, this.A00, "IGRTCEngine"));
    }
}
