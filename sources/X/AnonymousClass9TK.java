package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.9TK  reason: invalid class name */
public final class AnonymousClass9TK implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public AnonymousClass9TK(C353498Hw r1, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = r1;
        this.A01 = audioOverlayTrack;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        C293505kq r13 = (C293505kq) obj;
        0qQ.A0B(r13, 0);
        29I r2 = 27p.A01(this.A00.A1D).A02;
        String str2 = r13.A0T;
        AudioOverlayTrack audioOverlayTrack = this.A01;
        String str3 = audioOverlayTrack.A0A;
        String str4 = audioOverlayTrack.A0B;
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            str = musicAssetModel.A0I;
        } else {
            str = null;
        }
        0qQ.A0B(str2, 0);
        AnonymousClass7TG.A1K(r2);
        29I.A01(r2, "user_clicked_use_audio_button", str3, str4, str, (String) null, str2, (String) null, (String) null, (String) null);
    }
}
