package X;

import java.util.Map;

public final class ATK implements C341687nM {
    public final /* synthetic */ C341687nM A00;
    public final /* synthetic */ C341707nO A01;

    public ATK(C341687nM r1, C341707nO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DCg(C391719tX r4) {
        C341707nO r2 = this.A01;
        r2.A0C.A01("roAPe");
        r2.release();
        Map AvY = r2.A0B.AvY();
        if (AvY != null) {
            r4.A01(AvY);
        }
        this.A00.DCg(r4);
    }

    public final void onSuccess() {
        C341707nO r2 = this.A01;
        r2.A0I = 1;
        C341467mw r1 = r2.A0C;
        r1.A01("roAPs");
        if (r2.A03 != null) {
            r1.A01("sAE");
            r2.A03.Ey7(r2.A0A, new C40079AQj(this, 0));
            return;
        }
        r1.A01("sAEn");
        C391719tX r4 = null;
        if (!r2.A09) {
            r4 = new C391719tX(22000, "mAudioEncoder is null while stopping");
            r2.A0F.Cjv(r4, "stop_recording_audio_failed", "AudioRecordingTrack", "", "stop", (Map) null, AnonymousClass7TE.A0Q(r2));
        }
        r2.release();
        C341687nM r0 = this.A00;
        if (r4 != null) {
            r0.DCg(r4);
        } else {
            r0.onSuccess();
        }
    }
}
