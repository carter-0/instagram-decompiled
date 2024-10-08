package X;

import java.util.HashMap;

public final class ATO implements C341687nM {
    public final /* synthetic */ C341687nM A00;
    public final /* synthetic */ C341777nV A01;

    public ATO(C341687nM r1, C341777nV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DCg(C391719tX r2) {
        this.A01.release();
        this.A00.DCg(r2);
    }

    public final void onSuccess() {
        C341777nV r3 = this.A01;
        r3.A0G = 2;
        C341567nA r4 = r3.A0D;
        r4.Cjl(19, "recording_stop_video_finished");
        HashMap A1E = AnonymousClass7TE.A1E();
        AUM aum = r3.A05;
        if (aum != null) {
            C39800A9v a9v = aum.A01;
            A1E.put("capture_size", 002.A0P("x", a9v.A05, a9v.A04));
        }
        r4.Cjv((C391719tX) null, "stop_recording_video_finished", "AbstractVideoRecordingTrack", "", (String) null, A1E, AnonymousClass7TE.A0Q(r3));
        r3.release();
        this.A00.onSuccess();
    }
}
