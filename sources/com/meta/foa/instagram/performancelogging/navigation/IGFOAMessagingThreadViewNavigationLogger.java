package com.meta.foa.instagram.performancelogging.navigation;

import X.C330797Oh;
import X.OSZ;
import com.instagram.common.session.UserSession;

public interface IGFOAMessagingThreadViewNavigationLogger extends C330797Oh {
    public static final OSZ Companion = OSZ.A01;

    void annotateFirstUserIsBackground(boolean z);

    void annotateIsDm(boolean z);

    void annotateIsInstamadillo(boolean z);

    void annotateIsVm(boolean z);

    void annotateMessageMatchingSuccess(boolean z);

    void annotateMissingMessageId(boolean z);

    void annotateOpenThreadId(String str);

    void annotatePushCategory(String str);

    void maybeEndFlowCancel(String str, String str2);

    void maybeEndFlowSuccess(String str);

    void onLogThreadRenderingEnd(boolean z);

    void updateExtras(UserSession userSession);
}
