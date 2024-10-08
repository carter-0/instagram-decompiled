package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagElement;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Map;

/* renamed from: X.Gbp  reason: case insensitive filesystem */
public abstract class C52737Gbp {
    public static final void A00(C286575Wy r30, C52745Gbx gbx, SettingsScreenViewModel settingsScreenViewModel, 0sL r33, int i) {
        int i2;
        String str;
        C286565Wx r2;
        AnonymousClass2DO A00;
        C59489JLn gc0;
        C52745Gbx gbx2 = gbx;
        0qQ.A0B(gbx2, 0);
        0sL r4 = r33;
        0qQ.A0B(r4, 1);
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        0qQ.A0B(settingsScreenViewModel2, 2);
        C286575Wy r13 = r30;
        r13.ExV(-1125329329);
        int i3 = i;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r13.AGw(gbx2)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r13.AGw(r4)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i3 & 384) == 0) {
            int i6 = 128;
            if (r13.AGw(settingsScreenViewModel2)) {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1619291772, "com.instagram.settings2.core.view.NavigationRow (NavigationRow.kt:31)");
            }
            if (gbx2.A0A) {
                Modifier Ezh = Modifier.A00.Ezh(new TestTagElement("settings_navigation_row"));
                HLX hlx = gbx2.A05;
                boolean z = true;
                String str2 = null;
                if (hlx != null) {
                    r13.ExS(1502528069);
                    String str3 = C59846JaM.A01(r13, gbx2.A02).toString();
                    Modifier Ezh2 = Ezh.Ezh(C287205Zk.A02);
                    r13.ExS(1849586903);
                    if ((i2 & 112) != 32) {
                        z = false;
                    }
                    boolean AGw = r13.AGw(gbx2) | z;
                    Object ECw = r13.ECw();
                    if (AGw || ECw == AnonymousClass5XT.A00) {
                        ECw = new C20613Wvu(6, gbx2, r4);
                        r13.FLL(ECw);
                    }
                    r2 = (C286565Wx) r13;
                    C286565Wx.A0L(r2, false);
                    HXR.A00(r13, Ezh2, hlx, str3, (C62320sa) ECw, 384, 16, false);
                } else {
                    r13.ExS(1502799691);
                    String str4 = C59846JaM.A01(r13, gbx2.A02).toString();
                    C61083JwL jwL = gbx2.A03;
                    r13.ExS(1849595525);
                    if (jwL == null) {
                        str = null;
                    } else {
                        str = C59846JaM.A01(r13, jwL).toString();
                    }
                    r2 = (C286565Wx) r13;
                    C286565Wx.A0L(r2, false);
                    r13.ExS(1849597958);
                    if (!gbx2.A09) {
                        Modifier Ezh3 = Ezh.Ezh(C287205Zk.A02);
                        C287625aV r10 = new C287625aV(0);
                        r13.ExS(1849602205);
                        boolean z2 = false;
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        boolean AGw2 = r13.AGw(gbx2) | z2;
                        Object ECw2 = r13.ECw();
                        if (AGw2 || ECw2 == AnonymousClass5XT.A00) {
                            ECw2 = new C20613Wvu(7, gbx2, r4);
                            r13.FLL(ECw2);
                        }
                        C286565Wx.A0L(r2, false);
                        Ezh = C287635aW.A05(Ezh3, r10, (String) null, (C62320sa) ECw2, true);
                    }
                    C286565Wx.A0L(r2, false);
                    Integer num = gbx2.A08;
                    r13.ExS(1849606305);
                    if (num == null) {
                        A00 = null;
                    } else {
                        A00 = C287975bA.A00(r13, num.intValue(), 0);
                    }
                    C286565Wx.A0L(r2, false);
                    C61083JwL jwL2 = gbx2.A01;
                    r13.ExS(1849609109);
                    if (jwL2 == null) {
                        gc0 = null;
                    } else {
                        gc0 = new C52748Gc0(C59846JaM.A01(r13, jwL2).toString(), true);
                    }
                    C286565Wx.A0L(r2, false);
                    if (gc0 == null) {
                        gc0 = C57124IPn.A00;
                    }
                    C61083JwL jwL3 = gbx2.A00;
                    r13.ExS(1849616549);
                    if (jwL3 != null) {
                        str2 = C59846JaM.A01(r13, jwL3).toString();
                    }
                    C286565Wx.A0L(r2, false);
                    C52636GaA.A00(r13, Ezh, (Modifier) null, (AnonymousClass5RW) null, A00, (C286025Tq) null, gbx2.A04, gc0, str4, str, str2, (Map) null, (C62320sa) null, 0, 0, 0, 0, 0, 64716, 0, false);
                }
                C286565Wx.A0L(r2, false);
                XRZ xrz = gbx2.A07;
                r13.ExS(1849620128);
                boolean AGw3 = r13.AGw(settingsScreenViewModel2) | r13.AGw(gbx2);
                Object ECw3 = r13.ECw();
                if (AGw3 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C66186MGx((Object) settingsScreenViewModel2, (Object) gbx2, (AnonymousClass4D7) null, 4);
                    r13.FLL(ECw3);
                }
                C286565Wx.A0L(r2, false);
                C286645Xf.A04(r13, xrz, (0sL) ECw3);
            }
            if (0fL.A02()) {
                0fL.A00(1616909953);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 9, r4, gbx2, settingsScreenViewModel2);
        }
    }
}
