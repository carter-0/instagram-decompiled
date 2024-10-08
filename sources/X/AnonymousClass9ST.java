package X;

import com.instagram.api.schemas.AudioFilterType;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.9ST  reason: invalid class name */
public abstract class AnonymousClass9ST {
    public static final AudioOverlayTrack A00(MusicAttributionConfig musicAttributionConfig, int i) {
        int i2;
        AnonymousClass8IJ r6;
        MusicAttributionConfig musicAttributionConfig2 = musicAttributionConfig;
        0qQ.A0B(musicAttributionConfig2, 0);
        MusicAssetModel musicAssetModel = musicAttributionConfig2.A02;
        if (musicAssetModel == null) {
            return null;
        }
        int i3 = musicAssetModel.A00;
        int i4 = i;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i3 <= 0 || (i2 = musicAttributionConfig2.A00) < 0) {
            return null;
        }
        AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(musicAssetModel, i2, i3);
        AudioFilterType audioFilterType = musicAttributionConfig2.A01;
        if (audioFilterType == null) {
            return audioOverlayTrack;
        }
        AnonymousClass8IJ[] values = AnonymousClass8IJ.values();
        int length = values.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                r6 = null;
                break;
            }
            r6 = values[i5];
            if (r6.A04 == audioFilterType) {
                break;
            }
            i5++;
        }
        int i6 = audioOverlayTrack.A03;
        int i7 = audioOverlayTrack.A02;
        int i8 = audioOverlayTrack.A04;
        int i9 = audioOverlayTrack.A01;
        String str = audioOverlayTrack.A0B;
        String str2 = audioOverlayTrack.A0A;
        String str3 = audioOverlayTrack.A0E;
        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        float f = audioOverlayTrack.A00;
        return new AudioOverlayTrack(r6, downloadedTrack, audioOverlayTrack.A07, musicAssetModel2, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, f, i6, i7, i8, i9);
    }
}
