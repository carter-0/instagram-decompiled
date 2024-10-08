package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.ITx  reason: case insensitive filesystem */
public final class C57236ITx implements AnonymousClass32J, C267644bx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47482E4h A01;

    public final void DIH(View view, 1Xj r13, int i) {
        List list;
        0qQ.A0B(r13, 0);
        C47482E4h e4h = this.A01;
        C55707Hm4 hm4 = (C55707Hm4) ((C53001Ggs) e4h.A0E.getValue()).A00.A02();
        if (hm4 != null && (list = hm4.A01) != null) {
            int i2 = this.A00;
            C55982Hqn hqn = (C55982Hqn) list.get(i2);
            if (hqn != null) {
                if (i >= 9) {
                    C22338Xzn xzn = e4h.A03;
                    if (xzn != null) {
                        xzn.A06(AnonymousClass000.A00(352), "see_more", hqn.A00().toString(), (String) null);
                    }
                    0qQ.A0F("logger");
                    throw AnonymousClass00P.createAndThrow();
                }
                C22338Xzn xzn2 = e4h.A03;
                if (xzn2 != null) {
                    xzn2.A07(AnonymousClass000.A00(352), "grid_tile", hqn.A00().toString(), String.valueOf(i), r13.A30());
                }
                0qQ.A0F("logger");
                throw AnonymousClass00P.createAndThrow();
                C47482E4h.A00(hqn.A00(), e4h, r13, hqn.A01, i2);
            }
        }
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        return false;
    }

    public final void DQQ(1Xj r1, int i, int i2) {
    }

    public final void DQS(1Xj r1, int i, int i2) {
    }

    public final /* synthetic */ void EvS(View view, int i) {
    }

    public C57236ITx(C47482E4h e4h, int i) {
        this.A01 = e4h;
        this.A00 = i;
    }
}
