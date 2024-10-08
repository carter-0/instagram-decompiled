package X;

import com.facebook.mqtt.service.MqttPublishListener;

public final class TKB implements Runnable {
    public final /* synthetic */ AnonymousClass46Z A00;
    public final /* synthetic */ C2605346a A01;
    public final /* synthetic */ 26B A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public TKB(AnonymousClass46Z r1, C2605346a r2, 26B r3, String str, byte[] bArr) {
        this.A02 = r3;
        this.A03 = str;
        this.A04 = bArr;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        int A002 = this.A02.A04.A00((MqttPublishListener) null, this.A01, this.A03, (String) null, this.A04);
        AnonymousClass46Z r0 = this.A00;
        if (A002 == -1) {
            r0.onFailure();
        } else {
            r0.onSuccess();
        }
    }
}
