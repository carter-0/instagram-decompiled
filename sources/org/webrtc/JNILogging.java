package org.webrtc;

import org.webrtc.Logging;

public class JNILogging {
    public final Loggable loggable;

    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Logging.Severity.values()[num.intValue()], str2);
    }

    public JNILogging(Loggable loggable2) {
        this.loggable = loggable2;
    }
}
