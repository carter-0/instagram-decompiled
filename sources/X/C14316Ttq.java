package X;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ttq  reason: case insensitive filesystem */
public final class C14316Ttq extends C14317Ttr implements X8M {
    public final Map A00 = new LinkedHashMap();
    public final C14077TpR A01;
    public final C14336TuJ A02;
    public final C14322Ttx A03;
    public final Map A04 = new LinkedHashMap();
    public final Map A05 = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14316Ttq(Fragment fragment, C14077TpR tpR, C14336TuJ tuJ, UserSession userSession, C14313Ttn ttn, XAZ xaz, C14322Ttx ttx, C52526GWd gWd) {
        super(fragment, userSession, ttn, xaz, ttx, gWd);
        0qQ.A0B(tuJ, 2);
        this.A01 = tpR;
        this.A02 = tuJ;
        this.A03 = ttx;
    }

    public final void Dyf(C296935qt r5) {
        0qQ.A0B(r5, 0);
        1Xj A012 = A01(r5);
        if (A012 != null) {
            0qQ.A0B(002.A0R("onVideoViewExitingScreen: ", A012.getId()), 0);
            super.Dyf(r5);
            this.A01.A01(A012, false);
            this.A04.remove(r5);
        }
    }

    public final void Ewj(1Xj r4, int i) {
        0qQ.A0B(002.A0R("startBufferingOrPlaying: ", r4.getId()), 0);
        this.A00.put(r4, new C14337TuK(i));
    }

    public static final void A00(Rect rect, C14316Ttq ttq, C296935qt r7, float f, int i) {
        Rect rect2;
        Float f2;
        rect.top = i;
        Map map = ttq.A04;
        String str = null;
        if (map.containsKey(r7)) {
            C14320Ttu ttu = (C14320Ttu) map.get(r7);
            if (ttu != null) {
                rect2 = ttu.A01;
            } else {
                rect2 = null;
            }
            if (0qQ.A0K(rect2, rect)) {
                C14320Ttu ttu2 = (C14320Ttu) map.get(r7);
                if (ttu2 != null) {
                    f2 = Float.valueOf(ttu2.A00);
                } else {
                    f2 = null;
                }
                if (0qQ.A0I(f2, f)) {
                    return;
                }
            }
        }
        1Xj A012 = ttq.A01(r7);
        if (A012 != null) {
            map.put(r7, new C14320Ttu(new Rect(rect), r7, A012, f));
            if (f > 0.0f) {
                ttq.A01.A01(A012, true);
            }
            1Xj A013 = ttq.A01(r7);
            if (A013 != null) {
                str = A013.getId();
            }
            0qQ.A0B(002.A0R("onVideoViewUpdatingOnScreen: ", str), 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1Xj A01(X.C296935qt r2) {
        /*
            r1 = this;
            X.Ttn r0 = r1.A02
            X.Ttp r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0019
            X.1Xj r0 = r0.A01
        L_0x000a:
            if (r0 != 0) goto L_0x0018
        L_0x000c:
            java.util.Map r0 = r1.A04
            java.lang.Object r0 = r0.get(r2)
            X.Ttu r0 = (X.C14320Ttu) r0
            if (r0 == 0) goto L_0x0020
            X.1Xj r0 = r0.A02
        L_0x0018:
            return r0
        L_0x0019:
            X.5ov r0 = r2.A03
            if (r0 == 0) goto L_0x000c
            X.1Xj r0 = r0.A0A
            goto L_0x000a
        L_0x0020:
            java.util.Map r0 = r1.A05
            java.lang.Object r0 = r0.get(r2)
            X.1Xj r0 = (X.1Xj) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14316Ttq.A01(X.5qt):X.1Xj");
    }

    public final boolean BJE(1Xj r5) {
        C14312Ttm ttm;
        C14322Ttx ttx = this.A03;
        Map map = ttx.A08;
        if (map.isEmpty() || !map.containsKey(r5) || !ttx.CcR(r5) || (ttm = (C14312Ttm) map.get(r5)) == null || !ttm.A0G()) {
            return false;
        }
        return true;
    }

    public final void EyG(1Xj r2) {
        this.A00.remove(r2);
    }

    public final void FKw(AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata) {
        Object obj;
        Iterator it = this.A04.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C14320Ttu) obj).A02.getId(), autoplayOnScreenItemWithMetadata.media.getId())) {
                break;
            }
        }
        C14320Ttu ttu = (C14320Ttu) obj;
        if (ttu != null) {
            Rect rect = ttu.A01;
            autoplayOnScreenItemWithMetadata.x = rect.left;
            autoplayOnScreenItemWithMetadata.y = rect.top;
            autoplayOnScreenItemWithMetadata.width = rect.width();
            autoplayOnScreenItemWithMetadata.height = rect.height();
            autoplayOnScreenItemWithMetadata.percentageVisible = ttu.A00;
        }
    }
}
