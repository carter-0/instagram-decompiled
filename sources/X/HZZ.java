package X;

import android.view.View;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public abstract class HZZ {
    public static final void A00(View view, C286575Wy r28, Modifier modifier, AnonymousClass62P r30, int i, int i2, boolean z, boolean z2) {
        C304826Fj r11;
        long j;
        Modifier modifier2 = modifier;
        AnonymousClass62P<Object> r9 = r30;
        0qQ.A0B(r9, 0);
        C286575Wy r13 = r28;
        r13.ExV(1803156279);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1Q = C51966G9m.A1Q(i2 & 8, z);
        boolean A1Q2 = C51966G9m.A1Q(i2 & 16, z2);
        if (0fL.A02()) {
            0fL.A01(1510480117, "com.instagram.direct.fragment.sharesheet.view.ExternalShareRow (ExternalShareRow.kt:47)");
        }
        int i4 = i;
        AnonymousClass5RD A0R = C51971G9r.A0R(C287275Zs.A07, r13, C287215Zl.A02, ((i >> 6) & 14) >> 3);
        int A00 = C287425a7.A00(r13);
        C286565Wx r7 = (C286565Wx) r13;
        AnonymousClass5RM A04 = C286565Wx.A04(r7);
        Modifier A01 = C287435a8.A01(r13, modifier2);
        C51973G9u.A0y(r13, r7);
        C51971G9r.A12(r13, A0R, A04);
        0sL r1 = C287485aD.A02;
        if (r7.A0K || !C51972G9s.A1Q(r13, A00)) {
            C51971G9r.A13(r13, r1, A00);
        }
        C51965G9l.A18(r13, A01);
        C304676Et r31 = C304676Et.A00;
        r13.ExS(-65427727);
        if (!A1Q) {
            C56618I4t.A00(r13);
        }
        C286565Wx.A0L(r7, false);
        if (A1Q) {
            r11 = new C304826Fj(24.0f, 0.0f, 24.0f, 0.0f);
            j = C51967G9n.A0a(r13, -65420012).A0B;
        } else {
            r11 = new C304826Fj(16.0f, 16.0f, 16.0f, 16.0f);
            j = C51967G9n.A0a(r13, -65418499).A0C;
        }
        C286565Wx.A0L(r7, false);
        Object A0m = C51967G9n.A0m(r13, -65416691);
        Y43 y43 = A0m;
        if (A0m == AnonymousClass5XT.A00) {
            ArrayList A0r = AnonymousClass7TG.A0r(r9);
            for (Object obj : r9) {
                Class<?> cls = obj.getClass();
                Map map = 0Yh.A03;
                0qQ.A0B(cls, 1);
                AnonymousClass7TF.A1I(0q1.A01(cls), true, A0r);
            }
            0eP[] r5 = (0eP[]) A0r.toArray(new 0eP[0]);
            Y43 y432 = new Y43();
            y432.putAll(0Yt.A0D((0eP[]) Arrays.copyOf(r5, r5.length)));
            r13.FLL(y432);
            y43 = y432;
        }
        C286565Wx.A0L(r7, false);
        View view2 = view;
        AnonymousClass6HY.A02(C287275Zs.A01(20.0f), r11, C305066Gi.A00(r13, 0, 0, 0, 3), r13, (C287245Zp) null, (Modifier) null, new C58789Ixa(y43, view2, r30, r31, j, A1Q2), 12607488, 105);
        if (C51967G9n.A1R(r13)) {
            0fL.A00(-84307218);
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59192J9w(view2, r9, modifier2, i4, i3, 3, A1Q2, A1Q);
        }
    }
}
