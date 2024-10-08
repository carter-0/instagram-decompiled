package X;

import android.util.Pair;
import android.view.Surface;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.LzJ  reason: case insensitive filesystem */
public final class C65765LzJ implements MUK {
    public final /* synthetic */ C18014Vjq A00;
    public final /* synthetic */ C62422KfX A01;

    public C65765LzJ(C18014Vjq vjq, C62422KfX kfX) {
        this.A01 = kfX;
        this.A00 = vjq;
    }

    public final void EzA(Surface surface, int i, int i2) {
        C62422KfX kfX = this.A01;
        ConstraintLayout constraintLayout = this.A00.A03;
        kfX.A01 = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        kfX.A00 = height;
        LSQ lsq = kfX.A08;
        if (lsq != null) {
            lsq.A01 = kfX.A01;
            lsq.A00 = height;
        }
        ((C17992VjU) C63486Kxq.A00(kfX.A07, C313666go.GUEST).A07.getValue()).A01((Pair) null, new Pair(Integer.valueOf(kfX.A01), Integer.valueOf(kfX.A00)), (Integer) null);
        kfX.A09.A09.obtainMessage(6, i, i2, (Object) null).sendToTarget();
        LSQ lsq2 = kfX.A08;
        if (lsq2 != null) {
            Surface surface2 = kfX.A04;
            lsq2.A03 = i;
            lsq2.A02 = i2;
            if (lsq2.A0E) {
                lsq2.A04();
                lsq2.A05(surface2);
            }
        }
        kfX.A03 = i;
        kfX.A02 = i2;
        LSQ lsq3 = kfX.A08;
        if (lsq3 != null) {
            Surface surface3 = kfX.A04;
            lsq3.A03 = i;
            lsq3.A02 = i2;
            if (lsq3.A0E) {
                lsq3.A04();
                lsq3.A05(surface3);
            }
        }
        if (!0qQ.A0K(kfX.A04, surface)) {
            kfX.A04 = surface;
            if (!kfX.A0F) {
                C62422KfX.A02(kfX);
            }
        }
    }

    public final void EzC() {
        this.A01.A04 = null;
    }
}
