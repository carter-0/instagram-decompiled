package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;

/* renamed from: X.HAp  reason: case insensitive filesystem */
public final class C54374HAp extends GAR {
    public C324356z9 A00;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final JRI A04;
    public final ContextualFeedNetworkConfig A05;
    public final String A06;

    public C54374HAp(Context context, AnonymousClass07i r3, UserSession userSession, JRI jri, ContextualFeedNetworkConfig contextualFeedNetworkConfig, String str) {
        0qQ.A0B(contextualFeedNetworkConfig, 5);
        this.A03 = userSession;
        this.A04 = jri;
        this.A01 = context;
        this.A02 = r3;
        this.A05 = contextualFeedNetworkConfig;
        this.A06 = str;
    }
}
