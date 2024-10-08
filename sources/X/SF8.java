package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;

public final class SF8 {
    public int A00 = 64000;
    public int A01 = 2;
    public int A02 = 44100;
    public boolean A03 = false;

    public static C10862RzN A00(MediaComposition mediaComposition, File file) {
        SQv sQv = new SQv();
        sQv.A08 = mediaComposition;
        sQv.A06 = new C11354SOn();
        sQv.A0F = file.getPath();
        sQv.A0C = new SFQ(new SF8());
        sQv.A0Q = true;
        return new C10862RzN(sQv);
    }
}
