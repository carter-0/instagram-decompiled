package X;

import android.view.Surface;
import java.util.Map;

public final class ATT implements C341687nM {
    public final /* synthetic */ C341687nM A00;
    public final /* synthetic */ C341777nV A01;

    public ATT(C341687nM r1, C341777nV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(C341687nM r10, C341777nV r11, String str) {
        C391719tX r2 = new C391719tX(23000, str);
        r11.A0D.Cjv(r2, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "addVideoOutputToMediapipeline", (Map) null, (long) r11.hashCode());
        r11.release();
        r10.DCg(r2);
    }

    public final void DCg(C391719tX r11) {
        C341777nV r0 = this.A01;
        r0.A0D.Cjv(r11, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "start", (Map) null, AnonymousClass7TE.A0Q(r0));
        r0.release();
        this.A00.DCg(r11);
    }

    public final void onSuccess() {
        AUM aum;
        C341777nV r3 = this.A01;
        C341687nM r4 = this.A00;
        C341537n7 r6 = (C341537n7) r3.A0F.get();
        if (r6 == null) {
            A00(r4, r3, "VideoOutputProvider is null while adding to Mediapipeline");
            return;
        }
        B3V b3v = r3.A06;
        if (b3v == null || (aum = r3.A05) == null) {
            A00(r4, r3, "mVideoEncoder or mConfig are null while adding to Mediapipeline");
            return;
        }
        Surface BHX = b3v.BHX();
        r3.A01 = BHX;
        if (BHX == null) {
            A00(r4, r3, "Recording Surface is null");
        } else if (!aum.A02) {
            C346027uT r1 = new C346027uT(BHX, false);
            r1.A09 = 1;
            r3.A07 = r1;
            r1.A0D = false;
            r6.A9k(r3.A07);
            C341567nA r5 = r3.A0D;
            r5.Cjl(19, "recording_start_video_finished");
            r5.Cjv((C391719tX) null, "start_recording_video_finished", "AbstractVideoRecordingTrack", "", (String) null, (Map) null, AnonymousClass7TE.A0Q(r3));
            r4.onSuccess();
            C39777A8w a8w = r3.A02;
            if (a8w != null) {
                a8w.A00();
                r3.A02 = null;
            }
        } else {
            throw AnonymousClass7TE.A15(C273654mx.A00(60));
        }
    }
}
