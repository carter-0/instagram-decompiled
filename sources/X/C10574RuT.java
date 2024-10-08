package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;

/* renamed from: X.RuT  reason: case insensitive filesystem */
public final class C10574RuT {
    public int A00 = 0;
    public C7334Q4k A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public C10574RuT(C266714aE r5, MediaComposition mediaComposition, C7334Q4k q4k) {
        List<SIO> A1B = Pxe.A1B(r5, mediaComposition.A00);
        if (A1B != null) {
            for (SIO sio : A1B) {
                if (sio.A01.Esg()) {
                    this.A02.add(sio.A00);
                }
            }
        }
        C13113TLw.A00(8, this.A02);
        this.A01 = q4k;
    }
}
