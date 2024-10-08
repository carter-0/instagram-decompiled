package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.File;

/* renamed from: X.AaV  reason: case insensitive filesystem */
public final class C40336AaV implements C13671Tef {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C353498Hw A02;
    public final /* synthetic */ LEP A03;

    public C40336AaV(C353498Hw r1, LEP lep, int i, int i2) {
        this.A03 = lep;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public final void Cwc(String str) {
        Runnable anY;
        if (str == null) {
            anY = new C40843AkD(this.A02);
        } else {
            LEP lep = this.A03;
            lep.A0A = str;
            lep.A0B = str;
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(lep.A00(), this.A01, this.A00);
            File A0t = AnonymousClass7TE.A0t(str);
            0qQ.A0B(A0t, 0);
            String path = A0t.getPath();
            0qQ.A07(path);
            audioOverlayTrack.A06 = new DownloadedTrack(path, -1, -1);
            anY = new C41050AnY(this.A02, audioOverlayTrack);
        }
        11Z.A02(anY);
    }
}
