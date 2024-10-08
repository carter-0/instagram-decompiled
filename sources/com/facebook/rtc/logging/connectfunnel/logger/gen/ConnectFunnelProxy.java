package com.facebook.rtc.logging.connectfunnel.logger.gen;

import com.facebook.djinni.msys.infra.McfReference;

public abstract class ConnectFunnelProxy {
    public abstract McfReference createStructuredLoggerPointer();

    public abstract String diskCachingCreateDirectory();

    public abstract boolean diskCachingIsEnabled();
}
