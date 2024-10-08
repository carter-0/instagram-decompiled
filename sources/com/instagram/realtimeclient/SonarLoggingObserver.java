package com.instagram.realtimeclient;

import X.AnonymousClass46J;
import X.C291065gS;
import com.facebook.flipper.plugins.mqtt.MqttEvent;
import com.facebook.flipper.plugins.mqtt.MqttFlipperPlugin;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;

public class SonarLoggingObserver implements RealtimeClientManager$Observer {
    public static final Charset CHARSET_UTF8 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public MqttFlipperPlugin mPlugin;

    public void onConnectionChanged(AnonymousClass46J r1) {
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        this.mPlugin.reportEvent(MqttEvent.subscribe(str, str2));
    }

    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
        this.mPlugin.reportEvent(MqttEvent.payload(str));
    }

    public SonarLoggingObserver(MqttFlipperPlugin mqttFlipperPlugin) {
        this.mPlugin = mqttFlipperPlugin;
    }

    public void onMessage(C291065gS r6) {
        String str;
        RealtimePayload parse = RealtimePayloadParser.parse(r6);
        MqttFlipperPlugin mqttFlipperPlugin = this.mPlugin;
        String str2 = r6.A00;
        if (parse != null) {
            str = parse.stringPayload;
        } else {
            str = new String(r6.A01, CHARSET_UTF8);
        }
        mqttFlipperPlugin.reportEvent(MqttEvent.message(str2, str));
    }
}
