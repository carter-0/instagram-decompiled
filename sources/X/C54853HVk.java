package X;

import android.view.View;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.HVk  reason: case insensitive filesystem */
public abstract class C54853HVk {
    public static final void A00(C286575Wy r16, String str, C62320sa r18, C62320sa r19, 0sP r20, int i) {
        int i2;
        C62320sa r6 = r18;
        C62320sa r5 = r19;
        0sP r4 = r20;
        C51973G9u.A1E(r6, r4, r5);
        String str2 = str;
        0qQ.A0B(str2, 3);
        C286575Wy r12 = r16;
        r12.ExV(-1086338192);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r6) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r4);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r5);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r12, str2);
        }
        if ((i2 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(271974349, "com.instagram.barcelonaig.ui.BarcelonaIgLikeAsIGDialog (BarcelonaIgLikeAsIGDialog.kt:19)");
            }
            boolean A1N = C51973G9u.A1N(r12, -2035703355, i2);
            Object ECw = r12.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58707IwG.A00(r12, r6, 42);
            }
            C62320sa r0 = (C62320sa) ECw;
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            Object A16 = C51966G9m.A16(r12);
            String A14 = C51968G9o.A14(r12, str2, 2131953653);
            String A00 = C288035bG.A00(r12, 2131953650);
            boolean AGw = r12.AGw(A16) | C51973G9u.A1O(r12, -2035690036, i2);
            Object ECw2 = r12.ECw();
            if (AGw || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58716IwP.A00(r12, r4, A16, 29);
            }
            C56632I5m.A01((View) r5.invoke(), r12, HXM.A00(r12, (Integer) null, C51965G9l.A0y(A0H, ECw2, false), 2131953651, 14), HXM.A00(r12, (Integer) null, r0, 2131953652, 14), (C53398GnV) null, A14, A00, r0, 0, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, false);
            if (0fL.A02()) {
                0fL.A00(-823549319);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59144J8a(r4, r5, r6, str2, i3, 3);
        }
    }
}
