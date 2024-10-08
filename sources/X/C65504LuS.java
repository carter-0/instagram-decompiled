package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.LuS  reason: case insensitive filesystem */
public final class C65504LuS implements C315536k3 {
    public int A00;
    public int A01;
    public final C234502xy A02;
    public final C61430K7f A03;

    public C65504LuS(Context context, UserSession userSession, C61430K7f k7f, C234462xu r10) {
        0qQ.A0B(userSession, 2);
        this.A02 = C234472xv.A00(context, userSession, (AnonymousClass4DU) null, r10, "ClipsDurationPickerMusicPlayer", C234472xv.A02(userSession));
        this.A03 = k7f;
    }

    public final void A00(AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, int i, int i2, int i3) {
        AudioType audioType;
        MusicDataSource musicDataSource;
        AudioType audioType2;
        C234502xy r4 = this.A02;
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        if (!r4.CKF()) {
            DownloadedTrack downloadedTrack = audioOverlayTrack2.A06;
            MusicAssetModel musicAssetModel2 = musicAssetModel;
            if (downloadedTrack == null || !audioOverlayTrack2.A01()) {
                String str = musicAssetModel2.A0H;
                String str2 = musicAssetModel2.A0C;
                String str3 = musicAssetModel2.A0E;
                String str4 = musicAssetModel2.A0A;
                if (musicAssetModel2.A0U) {
                    audioType = AudioType.ORIGINAL_AUDIO;
                } else {
                    audioType = AudioType.MUSIC;
                }
                musicDataSource = new MusicDataSource((Uri) null, audioType, str, str2, str3, str4);
            } else {
                Uri A032 = 0cp.A03(downloadedTrack.A02);
                String str5 = musicAssetModel2.A0E;
                String str6 = musicAssetModel2.A0A;
                if (musicAssetModel2.A0U) {
                    audioType2 = AudioType.ORIGINAL_AUDIO;
                } else {
                    audioType2 = AudioType.MUSIC;
                }
                musicDataSource = new MusicDataSource(A032, audioType2, (String) null, (String) null, str5, str6);
            }
            r4.ETw(musicDataSource, this, (String) null, 0, -1, -1, false, false);
        }
        int i4 = audioOverlayTrack2.A03 + i;
        this.A01 = i4;
        int i5 = i4 + i2;
        this.A00 = i5;
        r4.seekTo(0mi.A03(i4 + i3, i4, i5));
        r4.E2p();
    }

    public final void onCurrentTrackPlaybackStarted() {
    }

    public final void onCurrentTrackPrepared(int i) {
    }

    public final void onCurrentTrackSeekComplete() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    public final void onCurrentTrackStopped() {
    }

    public final void onCurrentTrackCompleted() {
        C234502xy r1 = this.A02;
        if (r1.CKF()) {
            r1.seekTo(this.A01);
            r1.E2p();
        }
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C61430K7f k7f = this.A03;
        int i2 = this.A01;
        float f = ((float) (i - i2)) / ((float) (this.A00 - i2));
        MS8 ms8 = k7f.A07;
        if (ms8 == null) {
            0qQ.A0F("durationPicker");
            throw AnonymousClass00P.createAndThrow();
        }
        ms8.setProgress(f);
        if (i > this.A00) {
            this.A02.seekTo(this.A01);
        }
    }
}
