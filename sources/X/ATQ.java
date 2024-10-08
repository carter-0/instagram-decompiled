package X;

import java.util.HashMap;

public final class ATQ implements C341687nM {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341777nV A01;
    public final /* synthetic */ String A02;

    public ATQ(C341737nR r1, C341777nV r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onSuccess() {
        C341777nV r2 = this.A01;
        r2.A08 = true;
        r2.A09 = false;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("recording_video_encoder_mimetype", this.A02);
        C341567nA r3 = r2.A0D;
        r3.Cjl(19, "recording_prepare_video_finished");
        r3.Cjv((C391719tX) null, "prepare_recording_video_finished", "AbstractVideoRecordingTrack", "", (String) null, A1E, AnonymousClass7TE.A0Q(r2));
        this.A00.onSuccess();
    }

    public final void DCg(C391719tX r12) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("recording_video_encoder_mimetype", this.A02);
        C341777nV r1 = this.A01;
        C391719tX r3 = r12;
        r1.A0D.Cjv(r3, AnonymousClass000.A00(1699), "AbstractVideoRecordingTrack", "", "prepareEncoder", A1E, AnonymousClass7TE.A0Q(r1));
        r1.release();
        this.A00.onError(r12);
    }
}
