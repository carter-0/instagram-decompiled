package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class AUG implements B15 {
    public final /* synthetic */ AUL A00;

    public AUG(AUL aul) {
        this.A00 = aul;
    }

    public final MediaFormat BZV() {
        AUL aul = this.A00;
        ByteBuffer byteBuffer = AUL.A06;
        C343507qK r0 = aul.A00.A01;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", r0.A08, r0.A03);
        createAudioFormat.setInteger(Pxd.A00(183), aul.A00.A01.A00);
        return createAudioFormat;
    }
}
