package X;

import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.Fpo  reason: case insensitive filesystem */
public final class C51178Fpo implements Runnable {
    public final /* synthetic */ C47493E4x A00;

    public C51178Fpo(C47493E4x e4x) {
        this.A00 = e4x;
    }

    public final void run() {
        C47493E4x e4x = this.A00;
        G8D g8d = e4x.A01;
        String str = "controller";
        if (g8d != null) {
            g8d.EWu(C319586qr.CONVERSION_FLOW);
            G8D g8d2 = e4x.A01;
            if (g8d2 != null) {
                ((BusinessConversionActivity) g8d2).Clz((Bundle) null);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e4x.A00;
                if (businessFlowAnalyticsLogger == null) {
                    str = "logger";
                } else {
                    businessFlowAnalyticsLogger.Ci7(new C22030Xtl("renew", e4x.A03, (String) null, (String) null, (String) null, e4x.A02(), (Map) null, (Map) null));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
