package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.MqA  reason: case insensitive filesystem */
public final class C67576MqA extends 0ng {
    public final /* synthetic */ C66633Ma2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67576MqA(C66633Ma2 ma2) {
        super(1857862624, 2, false, false);
        this.A00 = ma2;
    }

    public final void run() {
        C66633Ma2 ma2 = this.A00;
        C290645fe r1 = ma2.A0K;
        if (r1 == null) {
            0qQ.A0F("banyanClient");
        } else {
            C290865g5 A01 = r1.A01("direct_ibc_inbox_invitations");
            ArrayList A1C = AnonymousClass7TE.A1C();
            HashSet A0D = ma2.A0v().A0C.A0D(ma2.A0t());
            for (DirectShareTarget directShareTarget : A01.A02) {
                if (!00k.A0u(A0D, directShareTarget.A08())) {
                    A1C.add(directShareTarget);
                }
            }
            if (182.A06(0Tu.A05, ma2.A0p(), 36317934218385060L)) {
                ma2.A0x = A1C;
                if (0qQ.A0K(ma2.A0s(), AnonymousClass2EX.A00)) {
                    if (!A1C.isEmpty() && !ma2.A11) {
                        OPT.A01(ma2).A0B("inbox");
                        ma2.A11 = true;
                    }
                    C66736Mbh A0U = C66581MXm.A0U(ma2);
                    C67141Miz miz = A0U.A0E;
                    if (!miz.A0K.isEmpty() || !A1C.isEmpty()) {
                        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                        int i = 0;
                        Iterator it = A1C.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                0sr.A1T();
                            } else {
                                A0r.add(new C68200N5p((DirectShareTarget) next, i));
                                i = i2;
                            }
                        }
                        miz.A0K = A0r;
                        C66736Mbh.A03(A0U);
                    }
                }
            }
            11Z.A02(new C67577MqB(ma2, A1C));
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }
}
