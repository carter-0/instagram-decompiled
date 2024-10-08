package X;

import com.instagram.android.R;

/* renamed from: X.I5s  reason: case insensitive filesystem */
public abstract class C56637I5s {
    public static final void A00(C286575Wy r4, String str, int i, boolean z) {
        int i2;
        0qQ.A0B(str, 0);
        r4.ExV(-746799880);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r4, z);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(727796805, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellContent (ShareToBarcelonaUpsellContent.kt:18)");
            }
            A02(str, r4, i2 & 14);
            A04(z, r4, (i2 >> 3) & 14);
            if (0fL.A02()) {
                0fL.A00(1846453000);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7P(str, z, i, 0);
        }
    }

    public static final void A01(C286575Wy r3, String str, int i, boolean z) {
        int i2;
        0qQ.A0B(str, 0);
        r3.ExV(1874265587);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r3, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r3, z);
        }
        if ((i2 & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2063346359, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaToggleUpsellContent (ShareToBarcelonaUpsellContent.kt:12)");
            }
            A03(str, r3, i2 & 14);
            A04(z, r3, (i2 >> 3) & 14);
            if (0fL.A02()) {
                0fL.A00(-1362430138);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7P(str, z, i, 1);
        }
    }

    public static final void A02(String str, C286575Wy r4, int i) {
        int i2;
        r4.ExV(1898157833);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1240450609, "com.instagram.creation.igbarcelona.upsell.AutoPostUpsellDescriptionSection (ShareToBarcelonaUpsellContent.kt:36)");
            }
            C56649I6e.A05(r4, new C53508Gpe(C51968G9o.A14(r4, str, 2131973532), 0), R.drawable.instagram_app_threads_pano_outline_24);
            if (0fL.A02()) {
                0fL.A00(-1542800598);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str, i, 6);
        }
    }

    public static final void A03(String str, C286575Wy r4, int i) {
        int i2;
        r4.ExV(-1763012626);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-17186747, "com.instagram.creation.igbarcelona.upsell.ToggleUpsellDescriptionSection (ShareToBarcelonaUpsellContent.kt:24)");
            }
            C56649I6e.A05(r4, new C53508Gpe(C51968G9o.A14(r4, str, 2131973551), 0), R.drawable.instagram_app_threads_pano_outline_24);
            if (0fL.A02()) {
                0fL.A00(-655047465);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str, i, 7);
        }
    }

    public static final void A04(boolean z, C286575Wy r4, int i) {
        int i2;
        r4.ExV(-1687874044);
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r4, z) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2135118154, "com.instagram.creation.igbarcelona.upsell.PrivacySection (ShareToBarcelonaUpsellContent.kt:49)");
            }
            int i3 = 2131973554;
            if (z) {
                i3 = 2131973552;
            }
            String A00 = C288035bG.A00(r4, i3);
            int i4 = 2131973555;
            if (z) {
                i4 = 2131973553;
            }
            C56649I6e.A05(r4, C53509Gpf.A00(r4, A00, i4), R.drawable.instagram_globe_pano_outline_24);
            if (0fL.A02()) {
                0fL.A00(-719424601);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J70(z, i, 2);
        }
    }
}
