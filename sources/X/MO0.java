package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.StringWriter;

public final class MO0 extends 0Yg implements 0sP {
    public static final MO0 A00 = new MO0();

    public MO0() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
        StringWriter A0a = JTS.A0a(audioOverlayTrack);
        17W A0Q = JTO.A0Q(A0a);
        C59707JUp.A00(A0Q, audioOverlayTrack);
        return JTR.A12(A0Q, A0a);
    }
}
