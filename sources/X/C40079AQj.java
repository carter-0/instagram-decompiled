package X;

import java.util.Map;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.AQj  reason: case insensitive filesystem */
public final class C40079AQj implements C341737nR {
    public final int A00;
    public final Object A01;

    public C40079AQj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
        switch (this.A00) {
            case 0:
                ATK atk = (ATK) this.A01;
                C341707nO r2 = atk.A01;
                r2.A0C.A01("sAEe");
                r2.release();
                atk.A00.DCg(new C382309dU(th));
                return;
            case 1:
                C40083AQo aQo = ((AUP) this.A01).A00;
                C18091VlL.A01(aQo.A00, aQo.A01, th);
                B16 b16 = aQo.A02;
                if (b16 != null) {
                    b16.onFinished();
                    return;
                }
                return;
            default:
                C40695AhF.A01((C40695AhF) this.A01, "Error preparing controller", th);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.9dU, X.9tX] */
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                ATK atk = (ATK) this.A01;
                C341707nO r2 = atk.A01;
                r2.A0I = 2;
                r2.A0C.A01("sAEs");
                r2.release();
                C341567nA r4 = r2.A0F;
                r4.Cjl(19, "recording_stop_audio_finished");
                r4.Cjv((C391719tX) null, "stop_recording_audio_finished", "AudioRecordingTrack", "", (String) null, (Map) null, AnonymousClass7TE.A0Q(r2));
                atk.A00.onSuccess();
                return;
            case 1:
                C40083AQo aQo = ((AUP) this.A01).A00;
                C18091VlL.A00(aQo.A00, aQo.A01);
                B16 b16 = aQo.A02;
                if (b16 != null) {
                    b16.onFinished();
                    return;
                }
                return;
            default:
                C40695AhF ahF = (C40695AhF) this.A01;
                ATP atp = new ATP(ahF, 3);
                C22018Xss xss = ahF.A01;
                if (xss != null) {
                    xss.A05(atp, ahF.A05);
                }
                C341647nI r22 = ahF.A06;
                ATP atp2 = new ATP(ahF, 2);
                C63822L8d l8d = ahF.A02;
                if (l8d == null) {
                    l8d = new C63822L8d(ahF.A08);
                    ahF.A02 = l8d;
                }
                AD9 ad9 = new AD9(atp2, AnonymousClass7TE.A0t(l8d.A01), true, AnonymousClass05K.A00, Long.valueOf(((long) ahF.A00) * 1000));
                AUH auh = new AUH(ahF, 1);
                if (r22.A05.compareAndSet(false, true)) {
                    AnonymousClass7TE.A1S(r22.A00, new Object[]{ad9, new AUJ(auh, r22, r22.A04.A02())}, 2);
                    return;
                }
                ? r5 = new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated START request");
                r22.A03.Cjw(r5, "recording_controller_error", "RecordingControllerImpl", "", "high", "startRecording", AnonymousClass7TE.A0Q(r22));
                auh.D0z(r5);
                return;
        }
    }
}
