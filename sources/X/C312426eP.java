package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentManager;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6eP  reason: invalid class name and case insensitive filesystem */
public final class C312426eP implements 0lm, AnonymousClass0lh {
    public static final Map A01 = new C312436eQ();
    public final C312676ew A00;

    public final void onSessionWillEnd() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C312426eP(Context context, C312156dv r22, 0lg r23, Executor executor) {
        C312586ej r1;
        Map hashMap;
        0lg r10 = r23;
        C312506eX A002 = C312506eX.A00(r10);
        if (!IgNetworkConsentManager.sStaticLoaded) {
            XplatSparsLogger.initHybrid();
        } else {
            C312536ee r11 = new C312536ee(r10);
            r11.EZn((C312596el) null, "", "", "", (String) null, (String) null, (String) null, false);
            int BOQ = (int) new C312566eh(r10).BOQ(AnonymousClass05K.A0A, 0);
            if (BOQ == 1) {
                r1 = C312586ej.OVERRIDE_ENABLE_OPTIMIZED;
            } else if (BOQ != 2) {
                r1 = C312586ej.USE_DEFAULT;
            } else {
                r1 = C312586ej.OVERRIDE_DISABLE_OPTIMIZED;
            }
            C312606em r12 = new C312606em(new AnalyticsLoggerImpl(r11, (AnonymousClass1YL) null, r1));
            C312626ep r0 = XplatSparsLogger.Companion;
            C312626ep.A00(r12);
        }
        C312566eh r13 = new C312566eh(r10);
        Context context2 = context;
        if (0oI.A0C(context2)) {
            hashMap = A01;
        } else {
            hashMap = new HashMap();
        }
        C312156dv r7 = r22;
        this.A00 = new C312676ew(context2, A002, new C312656et(r13, hashMap), r7, 02m.A0p, IgArVoltronModuleLoader.getInstance(r10), r10, executor);
    }

    public final C314366i5 A00(C312136ds r3) {
        C312676ew r1 = this.A00;
        if (r1.A0B == null) {
            C312676ew.A00(r1);
        }
        C314366i5 r0 = r1.A0B;
        r0.getClass();
        r0.A04(r3);
        return r1.A0B;
    }
}
