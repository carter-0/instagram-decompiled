package X;

import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7nI  reason: invalid class name and case insensitive filesystem */
public final class C341647nI {
    public final Handler A00;
    public final Handler A01;
    public final C341417mq A02;
    public final C341567nA A03;
    public final C341627nG A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);

    public static String A00(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown message" : "MSG_RELEASE" : "MSG_STOP_RECORDING" : "MSG_PREPARE_AND_START_RECORDING" : "MSG_START_RECORDING" : "MSG_PREPARE";
    }

    public final void A01() {
        Handler handler = this.A00;
        if (!handler.hasMessages(5)) {
            handler.removeCallbacksAndMessages((Object) null);
            this.A06.set(true);
            this.A03.Cjv((C391719tX) null, "stop_recording_requested", "RecordingControllerImpl", "", (String) null, (Map) null, (long) hashCode());
            handler.sendMessage(handler.obtainMessage(4, new Object[0]));
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9dU, X.9tX] */
    public final void A02(AD9 ad9, C41827B2i b2i, List list) {
        if (this.A05.compareAndSet(false, true)) {
            Handler handler = this.A00;
            handler.sendMessage(handler.obtainMessage(3, new Object[]{list, ad9, new AUJ(b2i, this, this.A04.A02())}));
            return;
        }
        ? r2 = new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated START request");
        this.A03.Cjw(r2, "recording_controller_error", "RecordingControllerImpl", "", "high", "startRecording", (long) hashCode());
        b2i.D0z(r2);
    }

    public final void A03(C341717nP r3) {
        this.A04.A05.put(r3.CAE(), r3);
    }

    public C341647nI(C341417mq r5, C341567nA r6, C341627nG r7) {
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        Handler A012 = C341447mt.A01("RecordingThread");
        this.A01 = A012;
        r7.A02 = A012;
        this.A00 = C341447mt.A00(new C341657nJ(A012, r6, this), C341447mt.A02, "RecordingControllerMessageThread", 0);
    }
}
