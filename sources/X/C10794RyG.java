package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.RyG  reason: case insensitive filesystem */
public final class C10794RyG {
    public ByteBuffer A00 = Pxg.A13(0);
    public final C13852TiV A01;
    public final C13827Thy A02;
    public final SOP A03;
    public final C11352SOl A04;
    public final C10862RzN A05;
    public final ByteBuffer[] A06;

    public C10794RyG(C13852TiV tiV, C13827Thy thy, SOP sop, C11352SOl sOl, C10862RzN rzN) {
        HashMap A07;
        int i = 0;
        this.A01 = tiV;
        this.A02 = thy;
        this.A05 = rzN;
        MediaComposition mediaComposition = rzN.A08;
        if (!(mediaComposition == null || (A07 = mediaComposition.A07(C266714aE.AUDIO)) == null)) {
            i = A07.size();
        }
        this.A06 = new ByteBuffer[i];
        this.A03 = sop;
        this.A04 = sOl;
    }
}
