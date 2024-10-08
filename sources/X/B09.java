package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.File;

public final class B09 extends 0Yg implements 0sJ {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ DownloadedTrack A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B09(C353498Hw r2, AudioOverlayTrack audioOverlayTrack, DownloadedTrack downloadedTrack) {
        super(4);
        this.A00 = r2;
        this.A01 = audioOverlayTrack;
        this.A02 = downloadedTrack;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        File file = (File) obj3;
        boolean A1a = AnonymousClass7TE.A1a(obj4);
        int i = 0;
        if (A1a) {
            C353498Hw r0 = this.A00;
            r0.A0b = false;
            r0.A0Q = file;
        }
        AudioOverlayTrack audioOverlayTrack = this.A01;
        int i2 = audioOverlayTrack.A03;
        AnonymousClass8IJ r02 = audioOverlayTrack.A05;
        if (r02 == null) {
            i = i2;
        } else if (A1a) {
            i = (int) (((float) i2) / r02.A01);
        }
        C353498Hw r2 = this.A00;
        if (file != null) {
            DownloadedTrack downloadedTrack = this.A02;
            int i3 = downloadedTrack.A01;
            int i4 = downloadedTrack.A00;
            String path = file.getPath();
            0qQ.A07(path);
            DownloadedTrack downloadedTrack2 = new DownloadedTrack(path, i3, i4);
            int i5 = audioOverlayTrack.A02;
            int i6 = audioOverlayTrack.A04;
            int i7 = audioOverlayTrack.A01;
            String str = audioOverlayTrack.A0B;
            String str2 = audioOverlayTrack.A0A;
            String str3 = audioOverlayTrack.A0E;
            MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            AnonymousClass8IJ r7 = audioOverlayTrack.A05;
            float f = audioOverlayTrack.A00;
            float f2 = f;
            audioOverlayTrack = new AudioOverlayTrack(r7, downloadedTrack2, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, f2, i, i5, i6, i7);
        }
        if (r2.A0i) {
            r2.A0O = audioOverlayTrack;
        } else {
            r2.A1d.A00();
            r2.A1X.A05(r2.A1m.A00(), audioOverlayTrack);
            C353498Hw.A0X(r2);
        }
        return C60340gF.A00;
    }
}
