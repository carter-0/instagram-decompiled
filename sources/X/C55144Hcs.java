package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hcs  reason: case insensitive filesystem */
public abstract class C55144Hcs {
    public static final void A00(C286575Wy r25, SettingsScreenViewModel settingsScreenViewModel, C53559GqV gqV, 0sP r28, int i) {
        int i2;
        String str;
        C286625Xd ASQ;
        int i3;
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        C53559GqV gqV2 = gqV;
        0sP r5 = r28;
        int A1b = C51973G9u.A1b(gqV2, r5, settingsScreenViewModel2);
        C286575Wy r13 = r25;
        r13.ExV(2050763057);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, gqV2) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r5);
        }
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r13, settingsScreenViewModel2);
        }
        if ((i2 & 147) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1564145521, "com.instagram.settings2.core.view.YourAccountHeader (YourAccountCustomHeader.kt:22)");
            }
            C66570MXa mXa = gqV2.A02;
            boolean A1S = C51973G9u.A1S(r13, settingsScreenViewModel2, gqV2, -1795306440);
            Object ECw = r13.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C66186MGx((Object) settingsScreenViewModel2, (Object) gqV2, (AnonymousClass4D7) null, 10);
                r13.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            C286645Xf.A04(r13, mXa, (0sL) ECw);
            SimpleImageUrl A0V = DbS.A0V(gqV2.A03);
            List<C61083JwL> list = gqV2.A05;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C61083JwL A12 : list) {
                A0r.add(C51968G9o.A12(r13, A12));
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                DbV.A1U(next, A1C, 00l.A0W((String) next) ? 1 : 0);
            }
            if (A1C.size() > A1b) {
                str = DbT.A0z(" · ", A1C, (0sP) null);
            } else {
                str = (String) 00k.A0J(A1C);
            }
            C61083JwL jwL = gqV2.A00;
            String A122 = C51968G9o.A12(r13, jwL);
            List list2 = (List) jwL.A01;
            if (list2 != null) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next2 : list2) {
                    if (next2 instanceof C53556GqS) {
                        A1C2.add(next2);
                    }
                }
                C53556GqS gqS = (C53556GqS) 00k.A0J(A1C2);
                if (gqS != null) {
                    C286025Tq A00 = C52744Gbw.A00(r13, gqS, A122);
                    HL5 hl5 = HL5.EMPHASIZED;
                    C53513Gpj gpj = new C53513Gpj(A0V, 96.0f);
                    String A123 = C51968G9o.A12(r13, gqV2.A01);
                    HL6 hl6 = HL6.CENTER_OVERRIDE_DONOTUSE;
                    boolean A1T = C51968G9o.A1T(r13, gqS, C51967G9n.A1Y(r13, A00, -1795273109), C51972G9s.A1M(i2));
                    Object ECw2 = r13.ECw();
                    if (A1T || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new C59104J6m(A00, gqS, r5, 33);
                        r13.FLL(ECw2);
                    }
                    I7M.A01(r13, (Modifier) null, gpj, hl5, hl6, str, A00, A123, (String) null, (C62320sa) null, (0sP) null, C51965G9l.A0z(A0H, ECw2), 384, 6, 2658, 0);
                    if (0fL.A02()) {
                        0fL.A00(-1202287424);
                    }
                }
            }
            if (0fL.A02()) {
                0fL.A00(-1786203627);
            }
            ASQ = r13.ASQ();
            if (ASQ != null) {
                i3 = 11;
                ASQ.A06 = new C59135J7r(i4, i3, settingsScreenViewModel2, gqV2, r5);
            }
            return;
        }
        r13.Evl();
        ASQ = r13.ASQ();
        if (ASQ != null) {
            i3 = 10;
            ASQ.A06 = new C59135J7r(i4, i3, settingsScreenViewModel2, gqV2, r5);
        }
    }
}
