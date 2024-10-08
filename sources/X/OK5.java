package X;

import android.media.AudioManager;
import android.media.audiofx.AcousticEchoCanceler;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;

public final class OK5 {
    public final /* synthetic */ C69109Neo A00;

    public final void A00(boolean z) {
        C68295N9i n9i;
        int i;
        C68295N9i n9i2;
        boolean z2 = !z;
        if (z2) {
            C69109Neo neo = this.A00;
            try {
                if (!AcousticEchoCanceler.isAvailable()) {
                    if (neo.A0R.A00.isSpeakerphoneOn() && !neo.A07) {
                        C70516O9p o9p = neo.A0T;
                        C73906Plh plh = new C73906Plh(this, 8);
                        C358248ab A0Y = DbS.A0Y(o9p.A00);
                        A0Y.A0r(true);
                        A0Y.A0s(true);
                        A0Y.A09(2131956832);
                        A0Y.A08(2131956831);
                        A0Y.A0E(new C71182Oey(plh, 5));
                        A0Y.A05();
                        neo.A0Q.A05(new PNW(A0Y.A02(), AnonymousClass05K.A00));
                        neo.A07 = true;
                        return;
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
        C69109Neo neo2 = this.A00;
        C68295N9i n9i3 = (C68295N9i) neo2.A01;
        if (n9i3 == null) {
            n9i = null;
        } else if (!n9i3.A0Z || n9i3.A0a) {
            n9i = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i3, (AnonymousClass3TO) null, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -1025, 2047, false, z2, false, false, false, false, false, false);
        } else {
            boolean z3 = false;
            if (!n9i3.A0c) {
                z3 = true;
            }
            C68295N9i n9i4 = null;
            if (z3) {
                if (z2 && C70942OSp.A00() > 0) {
                    neo2.A0U.FHE();
                    C68295N9i n9i5 = (C68295N9i) neo2.A01;
                    if (n9i5 != null) {
                        n9i2 = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i5, (AnonymousClass3TO) null, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -1025, 2047, false, true, false, false, false, false, false, false);
                    } else {
                        n9i2 = null;
                    }
                    neo2.A0J(n9i2);
                }
                C68295N9i n9i6 = (C68295N9i) neo2.A01;
                if (n9i6 != null) {
                    n9i4 = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i6, (AnonymousClass3TO) null, Integer.valueOf(C70942OSp.A00()), (Integer) null, (List) null, 0.0f, 0, -6145, 2047, false, false, true, false, false, false, false, false);
                }
            } else {
                AudioManager audioManager = neo2.A0R.A00;
                if (z2) {
                    i = 100;
                } else {
                    i = -100;
                }
                audioManager.adjustStreamVolume(3, i, 0);
                neo2.A0U.FHE();
                OZx oZx = neo2.A0W;
                boolean z4 = neo2.A08;
                oZx.A04.A00(new C72775PJp(z2));
                if (!z4) {
                    oZx.A03.A03(C69502Nmk.A09, (String) null, (Map) null);
                }
                C68295N9i n9i7 = (C68295N9i) neo2.A01;
                if (n9i7 != null) {
                    n9i4 = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i7, (AnonymousClass3TO) null, Integer.valueOf(C70942OSp.A00()), (Integer) null, (List) null, 0.0f, 0, -5121, 2047, false, z2, false, false, false, false, false, false);
                }
            }
            neo2.A0J(n9i4);
            return;
        }
        neo2.A0J(n9i);
        neo2.A0U.FHE();
        OZx oZx2 = neo2.A0W;
        boolean z5 = neo2.A08;
        oZx2.A04.A00(new C72775PJp(z2));
        if (!z5) {
            oZx2.A03.A03(C69502Nmk.A09, (String) null, (Map) null);
        }
    }

    public OK5(C69109Neo neo) {
        this.A00 = neo;
    }
}
