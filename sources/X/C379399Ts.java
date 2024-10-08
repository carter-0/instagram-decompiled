package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.9Ts  reason: invalid class name and case insensitive filesystem */
public abstract class C379399Ts {
    public static final AnonymousClass51I A00(Context context, AudioOverlayTrack audioOverlayTrack, float f) {
        String str;
        MediaEffect mediaEffect;
        float f2;
        0qQ.A0B(audioOverlayTrack, 0);
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        Float f3 = null;
        if (downloadedTrack == null) {
            return null;
        }
        String str2 = downloadedTrack.A02;
        int A00 = downloadedTrack.A00(audioOverlayTrack.A03);
        int i = audioOverlayTrack.A04;
        int i2 = audioOverlayTrack.A01;
        int i3 = -1;
        if (i2 != 0) {
            i3 = i2 - i;
        }
        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
        if (musicBrowseCategory != null) {
            str = musicBrowseCategory.A04;
        } else {
            str = null;
        }
        AnonymousClass51J r2 = AnonymousClass51J.AUDIO_TRACK;
        String str3 = audioOverlayTrack.A0D;
        AnonymousClass8IJ r0 = audioOverlayTrack.A05;
        if (r0 != null) {
            mediaEffect = r0.A00(context);
        } else {
            mediaEffect = null;
        }
        AnonymousClass8IJ r02 = audioOverlayTrack.A05;
        if (r02 != null) {
            f2 = r02.A01;
            f3 = r02.A05;
        } else {
            f2 = 1.0f;
        }
        return new AnonymousClass51I(mediaEffect, r2, f3, str2, str, str3, f, f2, A00, i, i3);
    }
}
