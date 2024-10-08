package com.instagram.direct.msys.plugins.mcis2sloggerplugin;

import X.C66581MXm;
import X.O58;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;

public final class MCIS2SLoggerPluginSessionless extends Sessionless {
    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionAnnotationBoolean(String str, String str2, boolean z) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A0k;
        if (str != null && str2 != null && (userSession = O58.A00) != null && (A0k = C66581MXm.A0k(userSession, str)) != null) {
            A0k.onLogPlatformLayerAnnotationBoolean(str2, z);
        }
    }

    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPoint(String str, String str2) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A0k;
        if (str != null && str2 != null && (userSession = O58.A00) != null && (A0k = C66581MXm.A0k(userSession, str)) != null) {
            A0k.onLogPlatformLayerPoints(str2, (String) null);
        }
    }

    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointWithData(String str, String str2, String str3) {
        IGFOAMessagingSendToSentLogger A0k;
        IGFOAMessagingSendToSentLogger A0k2;
        if (str != null && str2 != null) {
            UserSession userSession = O58.A00;
            if (str3 != null) {
                if (userSession != null && (A0k2 = C66581MXm.A0k(userSession, str)) != null) {
                    A0k2.onLogPlatformLayerPoints(str2, str3);
                }
            } else if (userSession != null && (A0k = C66581MXm.A0k(userSession, str)) != null) {
                A0k.onLogPlatformLayerPoints(str2, (String) null);
            }
        }
    }

    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerMCCError(String str, long j, long j2, long j3, int i) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A0k;
        if (str != null && (userSession = O58.A00) != null && (A0k = C66581MXm.A0k(userSession, str)) != null) {
            A0k.onLogMCCErrors(j, j2, j3, i);
        }
    }
}
