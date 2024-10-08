package X;

import java.util.concurrent.atomic.AtomicLong;

public enum RJ2 implements C13718Tfj {
    MqttDurationMs(0),
    MqttTotalDurationMs(1),
    NetworkDurationMs(2),
    NetworkTotalDurationMs(3),
    ServiceDurationMs(4),
    MessageSendAttempt(5),
    MessageSendSuccess(6),
    ForegroundPing(7),
    BackgroundPing(8),
    PublishReceived(9),
    FbnsNotificationReceived(10),
    FbnsLiteNotificationReceived(11),
    FbnsNotificationDeliveryRetried(12),
    FbnsLiteNotificationDeliveryRetried(13);
    
    public final String A00;
    public final Class A01;

    /* access modifiers changed from: public */
    RJ2(int i) {
        this.A00 = r3;
        this.A01 = AtomicLong.class;
    }

    public final String BK1() {
        return this.A00;
    }

    public final Class CDV() {
        return this.A01;
    }
}
