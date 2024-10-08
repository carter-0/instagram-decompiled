package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import X.0dV;
import X.0lm;
import X.AnonymousClass1YL;
import X.C312536ee;
import X.C312546ef;
import X.C312586ej;
import X.C312596el;
import X.C390979s9;
import X.C41404AtQ;
import X.XUQ;
import com.facebook.cameracore.ardelivery.networkconsentmanager.impl.NetworkConsentManagerJNI;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.instagram.common.session.UserSession;

public class IgNetworkConsentManager implements 0lm {
    public static boolean sStaticLoaded = true;
    public final AnalyticsLogger mAnalyticsLogger;
    public final NetworkConsentManagerJNI mCameraCoreNetworkConsentManager;

    public void onUserSessionWillEnd(boolean z) {
    }

    static {
        0dV.A0C("ard-android-network-consent-manager-impl");
    }

    public static IgNetworkConsentManager getInstance(UserSession userSession) {
        return (IgNetworkConsentManager) userSession.A01(IgNetworkConsentManager.class, new C41404AtQ(userSession));
    }

    public static boolean isAnalyticsLoggerAvailable() {
        return sStaticLoaded;
    }

    public static /* synthetic */ IgNetworkConsentManager lambda$getInstance$0(UserSession userSession) {
        return new IgNetworkConsentManager(userSession);
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public NetworkConsentManagerJNI getNetworkConsentManagerJNI() {
        return this.mCameraCoreNetworkConsentManager;
    }

    public TriState hasUserAllowedNetworking(String str) {
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.mAnalyticsLogger;
        analyticsLoggerImpl.mProductName = "camera_core";
        C312546ef r0 = analyticsLoggerImpl.mCameraARAnalyticsLogger;
        String str2 = str;
        if (r0 != null) {
            r0.EZn((C312596el) null, "camera_core", "", str2, (String) null, (String) null, (String) null, false);
        }
        return this.mCameraCoreNetworkConsentManager.hasUserAllowedNetworking(str);
    }

    public void setUserConsent(String str, boolean z, C390979s9 r12) {
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.mAnalyticsLogger;
        analyticsLoggerImpl.mProductName = "camera_core";
        C312546ef r0 = analyticsLoggerImpl.mCameraARAnalyticsLogger;
        String str2 = str;
        if (r0 != null) {
            r0.EZn((C312596el) null, "camera_core", "", str2, (String) null, (String) null, (String) null, false);
        }
        this.mCameraCoreNetworkConsentManager.setUserConsent(str, z, r12);
    }

    public IgNetworkConsentManager(UserSession userSession) {
        AnalyticsLoggerImpl analyticsLoggerImpl = new AnalyticsLoggerImpl(new C312536ee(userSession), (AnonymousClass1YL) null, C312586ej.USE_DEFAULT);
        this.mAnalyticsLogger = analyticsLoggerImpl;
        XUQ xuq = NetworkConsentManagerJNI.Companion;
        this.mCameraCoreNetworkConsentManager = new NetworkConsentManagerJNI(IgNetworkConsentStorage.getInstance(userSession), analyticsLoggerImpl);
    }
}
