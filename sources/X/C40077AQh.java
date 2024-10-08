package X;

import java.util.Map;

/* renamed from: X.AQh  reason: case insensitive filesystem */
public final class C40077AQh implements C341737nR {
    public final /* synthetic */ C341687nM A00;
    public final /* synthetic */ C341707nO A01;

    public C40077AQh(C341687nM r1, C341707nO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onError(Throwable th) {
        C341707nO r2 = this.A01;
        r2.A0C.A01("stAEe");
        r2.release();
        r2.A0F.Cjv(new C382309dU(th), "start_recording_audio_failed", "AudioRecordingTrack", "", "start", (Map) null, AnonymousClass7TE.A0Q(r2));
        this.A00.DCg(new C382309dU(th));
    }

    public final void onSuccess() {
        C341707nO r3 = this.A01;
        C341467mw r2 = r3.A0C;
        r2.A01("stAEs");
        r3.A0J = false;
        r2.A01("aoAP");
        C341587nC r22 = r3.A0B;
        C341747nS r7 = r3.A0E;
        r22.A9l(r3.A0A, r3.A01, r3.A02, new ATP(this, 0), r7);
    }
}
