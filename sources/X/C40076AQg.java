package X;

import java.util.Map;

/* renamed from: X.AQg  reason: case insensitive filesystem */
public final class C40076AQg implements C341737nR {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341707nO A01;

    public C40076AQg(C341737nR r1, C341707nO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onError(Throwable th) {
        C341707nO r2 = this.A01;
        r2.A0C.A01("pAEe");
        C382309dU r4 = new C382309dU(th);
        C343467qG r0 = r2.A05;
        if (r0 != null) {
            r4.A01(r0.A00());
        }
        r2.release();
        try {
            r4.A00("supported_configs", C39902AIk.A02(C39902AIk.A03()));
        } catch (Exception unused) {
        }
        r2.A0F.Cjv(r4, "prepare_recording_audio_failed", "AudioRecordingTrack", "", "prepareEncoder", (Map) null, AnonymousClass7TE.A0Q(r2));
        this.A00.onError(th);
    }

    public final void onSuccess() {
        this.A01.A0C.A01("pAEs");
        this.A00.onSuccess();
    }
}
