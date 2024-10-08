package X;

import android.app.Activity;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQj  reason: case insensitive filesystem */
public abstract class C52384GQj {
    public static final void A00(LazyListState lazyListState, C286575Wy r5, int i, int i2) {
        int i3;
        0qQ.A0B(lazyListState, 0);
        r5.ExV(-237543117);
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r5, lazyListState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r5, i);
        }
        if ((i3 & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(949631811, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:34)");
            }
            boolean A1N = C51973G9u.A1N(r5, -165882916, i3);
            Object ECw = r5.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new GQ6(lazyListState);
                r5.FLL(ECw);
            }
            C51965G9l.A1X(r5, false);
            A02(r5, (MVZ) ECw, i, i3 & 112);
            if (0fL.A02()) {
                0fL.A00(1875489736);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, lazyListState, i, i2, 5);
        }
    }

    public static final void A01(LazyGridState lazyGridState, C286575Wy r5, int i, int i2) {
        int i3;
        0qQ.A0B(lazyGridState, 0);
        r5.ExV(-2057742453);
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r5, lazyGridState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r5, i);
        }
        if ((i3 & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-8074394, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:45)");
            }
            boolean A1N = C51973G9u.A1N(r5, -165869156, i3);
            Object ECw = r5.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C57126IPp(lazyGridState);
                r5.FLL(ECw);
            }
            C51965G9l.A1X(r5, false);
            A02(r5, (MVZ) ECw, i, i3 & 112);
            if (0fL.A02()) {
                0fL.A00(-1004385973);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, lazyGridState, i, i2, 6);
        }
    }

    public static final void A02(C286575Wy r10, MVZ mvz, int i, int i2) {
        int i3;
        boolean z;
        r10.ExV(1461236960);
        if ((i2 & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r10, mvz, i2) ? 1 : 0) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r10, i);
        }
        if ((i3 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1519684382, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:57)");
            }
            Activity A00 = C61270mF.A00(C51968G9o.A0I(r10));
            UserSession A0h = C51968G9o.A0h(r10);
            AnonymousClass0iw r3 = (AnonymousClass0iw) r10.AJO(C286915Yh.A00);
            boolean A1S = AnonymousClass7TF.A1S(i3 & 112, 32) | C51974G9v.A1b(r10, A00, A0h, r3, -165848894);
            Object ECw = r10.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C52516GVt(A00, r3, A0h, i);
                r10.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            r10.ExS(-165841916);
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && r10.AGw(mvz))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1U = C51966G9m.A1U(r10, ECw, z);
            Object ECw2 = r10.ECw();
            if (A1U || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C59819JZr((Object) mvz, ECw, (AnonymousClass4D7) null, 22);
                r10.FLL(ECw2);
            }
            C51968G9o.A1E(r10, A0H, ECw2, mvz);
            boolean A1Z = C51967G9n.A1Z(r10, ECw, -165807314);
            Object ECw3 = r10.ECw();
            if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C59112J6u(ECw, 12);
                r10.FLL(ECw3);
            }
            C52517GVu.A00(r10, (AnonymousClass07Z) null, C51965G9l.A10(A0H, ECw3), 0, 1);
            if (0fL.A02()) {
                0fL.A00(-1277989033);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, mvz, i, i2, 7);
        }
    }
}
