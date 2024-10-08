package X;

import com.instagram.api.schemas.MediaVCRTappableData;
import java.util.List;
import java.util.Set;

public final class GCE extends C52050GCw implements JRF, JQ7 {
    public final C52016GBn A00;
    public final Set A01 = DbS.A0y();

    public GCE(C52016GBn gBn) {
        0qQ.A0B(gBn, 1);
        this.A00 = gBn;
    }

    public final void DaS(C267324bN r8, int i, int i2, boolean z) {
        MediaVCRTappableData mediaVCRTappableData;
        0qQ.A0B(r8, 0);
        Set<C52177GHt> set = this.A01;
        for (C52177GHt gHt : set) {
            GIE gie = gHt.A00;
            gie.A03.A05(i, i2);
            gie.A04.A04(i);
        }
        List Bkd = r8.Bkd(AnonymousClass3WT.REELS_VISUAL_REPLIES);
        if ((!Bkd.isEmpty()) && (mediaVCRTappableData = ((C255783ui) Bkd.get(0)).A0K) != null) {
            Float f = mediaVCRTappableData.A02;
            Float f2 = mediaVCRTappableData.A01;
            if (f != null && f2 != null) {
                int floor = (int) ((float) Math.floor((double) f.floatValue()));
                if (i < ((int) ((float) Math.ceil((double) f2.floatValue()))) && floor <= i) {
                    for (C52177GHt gHt2 : set) {
                        C252063oV r0 = gHt2.A00.A01.A03;
                        if (r0 != null) {
                            r0.setVisibility(0);
                        }
                    }
                } else if (i >= 0 && i < i2) {
                    for (C52177GHt gHt3 : set) {
                        C252063oV r1 = gHt3.A00.A01.A03;
                        if (r1 != null) {
                            r1.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public final void EDt(C52177GHt gHt) {
        0qQ.A0B(gHt, 0);
        this.A01.remove(gHt);
    }

    public final void A93(C52177GHt gHt) {
        this.A01.add(gHt);
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
