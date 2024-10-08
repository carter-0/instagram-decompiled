package X;

import android.os.Handler;
import org.webrtc.EglBase;

/* renamed from: X.OqM  reason: case insensitive filesystem */
public final class C71760OqM implements C74295PsU {
    public final /* synthetic */ OU3 A00;

    public C71760OqM(OU3 ou3) {
        this.A00 = ou3;
    }

    public final void Cwl() {
        OU3 ou3 = this.A00;
        EglBase.Context context = OU3.A0m;
        C69126Nf7 nf7 = ou3.A0W.A00.A0b;
        if (182.A06(0Tu.A05, nf7.A04, 36311285608022505L)) {
            if (!nf7.A02 || nf7.A00 <= 1) {
                ((C67663Mrt) nf7.A06.getValue()).A00(8);
            } else {
                C69264NiQ niQ = C69264NiQ.SPEAKER;
                Handler A0E = JTO.A0E(nf7.A06);
                A0E.sendMessage(A0E.obtainMessage(0, 6, -1, niQ));
            }
            nf7.A00 = 0;
            nf7.A01 = false;
        }
    }
}
