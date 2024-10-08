package X;

import com.facebook.cvat.ctaudiosync.CTAudioSync;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.IOException;
import java.util.HashMap;

public final class MA2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C353498Hw A01;
    public final /* synthetic */ AnonymousClass51M A02;
    public final /* synthetic */ AnonymousClass831 A03;
    public final /* synthetic */ AudioOverlayTrack A04;
    public final /* synthetic */ DownloadedTrack A05;

    public MA2(C353498Hw r1, AnonymousClass51M r2, AnonymousClass831 r3, AudioOverlayTrack audioOverlayTrack, DownloadedTrack downloadedTrack, int i) {
        this.A01 = r1;
        this.A05 = downloadedTrack;
        this.A04 = audioOverlayTrack;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void run() {
        long j;
        String str;
        C353498Hw r10 = this.A01;
        DownloadedTrack downloadedTrack = this.A05;
        AudioOverlayTrack audioOverlayTrack = this.A04;
        AnonymousClass51M r11 = this.A02;
        AnonymousClass831 r6 = this.A03;
        int i = this.A00;
        0qQ.A0B(r11, 2);
        long A002 = ((long) downloadedTrack.A00(audioOverlayTrack.A03)) * 1000;
        long j2 = 0;
        if (r6 != null) {
            j = ((long) r6.A00) * 1000;
        } else {
            j = 0;
        }
        long j3 = A002 + j;
        CTAudioSync cTAudioSync = new CTAudioSync();
        try {
            String A0t = JTP.A0t(AnonymousClass7TE.A0t(downloadedTrack.A02));
            long j4 = (long) i;
            CTAudioSync cTAudioSync2 = cTAudioSync;
            String str2 = r11.A0F.A0F;
            int assetOffsetInMs = cTAudioSync2.getAssetOffsetInMs(A0t, str2, j3, j3 + (1000 * j4), 0, 0);
            if (Math.abs(assetOffsetInMs) > i) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("AudioSync - invalid offset", 002.A02(assetOffsetInMs, i, "Offset: ", " ReelsDuration: "));
                0kD.A0I("ClipsCaptureControllerImpl", (Throwable) null, A1E);
            }
            27r A012 = 27p.A01(r10.A1D);
            String str3 = audioOverlayTrack.A0B;
            Long valueOf = Long.valueOf(j4);
            if (r6 != null) {
                j2 = (long) JTO.A08(r6);
            }
            Long valueOf2 = Long.valueOf(j2);
            long j5 = (long) assetOffsetInMs;
            long floor = (long) Math.floor(cTAudioSync.getProcessingTime());
            boolean wasConfident = cTAudioSync.getWasConfident();
            long floor2 = (long) Math.floor(cTAudioSync.refSampleRate);
            String str4 = A012.A04.A0L;
            double maxCrestFactor = cTAudioSync.getMaxCrestFactor();
            0wc r112 = A012.A01;
            0qQ.A0B(r112, 9);
            0Aj A0e = AnonymousClass7TE.A0e(r112, "audiosync_on_reels");
            if (A0e.isSampled()) {
                A0e.A9F("syncing_offset", Long.valueOf(j5));
                A0e.A9F("reel_duration", valueOf);
                A0e.A9F("processing_time", Long.valueOf(floor));
                A0e.A7p("was_confident", Boolean.valueOf(wasConfident));
                A0e.A9F("mic_sample_rate", Long.valueOf(floor2));
                A0e.AAJ("music_id_str", str3);
                A0e.AAJ("waterfall_id", str4);
                A0e.A8D("max_crest_factor", Double.valueOf(maxCrestFactor));
                A0e.A9F("clip_index", valueOf2);
                A0e.Cgf();
            }
        } catch (IOException e) {
            e = e;
            str = "Failure to process AudioSync";
            0kD.A07("ClipsCaptureControllerImpl", str, e);
        } catch (Exception e2) {
            e = e2;
            str = "Unexpected failure to process AudioSync";
            0kD.A07("ClipsCaptureControllerImpl", str, e);
        }
    }
}
