package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.5Ye  reason: invalid class name and case insensitive filesystem */
public abstract class C286885Ye {
    public static final void A01(C286575Wy r7, 0lg r8, String str, 0sL r10) {
        A03(r7, r8, str, r10, 196608, 28, false, false, false);
    }

    public static final void A03(C286575Wy r13, 0lg r14, String str, 0sL r16, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        String str2 = str;
        0qQ.A0B(str, 0);
        0lg r5 = r14;
        0qQ.A0B(r14, 1);
        0sL r7 = r16;
        0qQ.A0B(r7, 5);
        r13.ExV(-1248157021);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            z6 = false;
        }
        if ((i2 & 8) != 0) {
            z5 = false;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        }
        if (0fL.A02()) {
            0fL.A01(1788978662, "com.instagram.compose.root.IgRoot (IgRoot.kt:32)");
        }
        AnonymousClass2kQ A01 = C227942kP.A01(str, z5, z4);
        ArrayList A1M = 0sr.A1M(new C286705Xl[]{C286895Yf.A00.A02(r14), C286915Yh.A00.A02(A01), C286935Yj.A00.A02(A01)});
        if (r14 instanceof UserSession) {
            A1M.add(C286955Yl.A00.A02(r14));
        }
        if (182.A06(0Tu.A05, r14, 36328955103428294L)) {
            A1M.add(C304946Fv.A00.A02(C304966Fx.A00));
        }
        C286705Xl[] r1 = (C286705Xl[]) A1M.toArray(new C286705Xl[0]);
        C286715Xm.A01(r13, AnonymousClass5PI.A01(r13, new C59108J6q(r7, z6), -401074717), (C286705Xl[]) Arrays.copyOf(r1, r1.length), 56);
        if (0fL.A02()) {
            0fL.A00(-1629155685);
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59175J9f(r5, str2, r7, i, i3, z6, z5, z4);
        }
    }

    public static final void A00(C286575Wy r7, 0lg r8, String str, 0sL r10) {
        A03(r7, r8, str, r10, 196672, 28, false, false, false);
    }

    public static final void A02(C286575Wy r7, 0lg r8, String str, 0sL r10) {
        A03(r7, r8, str, r10, 196614, 28, false, false, false);
    }
}
