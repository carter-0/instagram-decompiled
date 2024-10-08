package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Map;

/* renamed from: X.Ozw  reason: case insensitive filesystem */
public final class C72287Ozw implements AnonymousClass8DE {
    public final /* synthetic */ OES A00;

    public final void AVf(AnonymousClass87G r10, Map map) {
        CameraAREffect A002 = r10.A00();
        if (A002 != null) {
            OES oes = this.A00;
            C70507O9g o9g = oes.A00;
            if (o9g != null) {
                int ordinal = o9g.A00.A03.A07.ordinal();
                int i = 2;
                if (ordinal != 0) {
                    i = 7;
                    if (ordinal != 2) {
                        i = 3;
                    }
                }
                OKY oky = oes.A02;
                String str = A002.A0K;
                0qQ.A07(str);
                oky.A00(new PL7(str, A002.A0B, map, i, A002.CbC()));
                return;
            }
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int BMI() {
        return 0;
    }

    public C72287Ozw(OES oes) {
        this.A00 = oes;
    }
}
