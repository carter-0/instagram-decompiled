package X;

import java.util.HashMap;

/* renamed from: X.AQk  reason: case insensitive filesystem */
public final class C40080AQk implements C341737nR {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341707nO A01;
    public final /* synthetic */ HashMap A02;

    public C40080AQk(C341737nR r1, C341707nO r2, HashMap hashMap) {
        this.A01 = r2;
        this.A02 = hashMap;
        this.A00 = r1;
    }

    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    public final void onSuccess() {
        C341707nO r2 = this.A01;
        r2.A0C.A01("pATs");
        C341567nA r3 = r2.A0F;
        r3.Cjl(19, "recording_prepare_audio_finished");
        r3.Cjv((C391719tX) null, "prepare_recording_audio_finished", "AudioRecordingTrack", "", (String) null, this.A02, AnonymousClass7TE.A0Q(r2));
        r2.A08 = true;
        r2.A09 = false;
        this.A00.onSuccess();
    }
}
