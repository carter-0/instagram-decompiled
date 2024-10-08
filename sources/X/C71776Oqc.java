package X;

import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;
import org.webrtc.CameraCapturer;

/* renamed from: X.Oqc  reason: case insensitive filesystem */
public final class C71776Oqc implements C13775Tgq {
    public final /* synthetic */ SignalingHttpSenderCallback A00;

    public C71776Oqc(SignalingHttpSenderCallback signalingHttpSenderCallback) {
        this.A00 = signalingHttpSenderCallback;
    }

    public final void DET(int i, String str) {
        SignalingHttpSenderCallback.CProxy.gotHttpResponseJson(this.A00, 002.A0g("{\"result\": \"", str, "\"}"), CameraCapturer.OPEN_CAMERA_DELAY_MS);
    }

    public final void Dat(int i) {
        SignalingHttpSenderCallback.CProxy.gotHttpResponseJson(this.A00, "{\"result\": \"timeout\"}", 408);
    }

    public final void onSuccess(int i) {
        SignalingHttpSenderCallback.CProxy.gotHttpResponseJson(this.A00, "{\"result\": \"success\"}", 200);
    }
}
