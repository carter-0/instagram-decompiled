package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.contacts.ccu.impl.CCUPluginImpl;

/* renamed from: X.94I  reason: invalid class name */
public final class AnonymousClass94I {
    public static AnonymousClass94I A01;
    public CCUPluginImpl A00;

    public final void A00(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        CCUPluginImpl cCUPluginImpl = this.A00;
        if (cCUPluginImpl != null) {
            cCUPluginImpl.initScheduler(context, userSession);
        }
    }

    public AnonymousClass94I() {
        try {
            Object newInstance = Class.forName("com.instagram.contacts.ccu.impl.CCUPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
            0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.contacts.ccu.intf.CCUPlugin");
            this.A00 = (CCUPluginImpl) newInstance;
        } catch (Throwable th) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUPlugin");
            0qQ.A0A(formatStrLocaleSafe);
            0wb.A06("CCUPluginWrapper", formatStrLocaleSafe, th);
        }
    }
}
