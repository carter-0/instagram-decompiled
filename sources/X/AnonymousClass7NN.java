package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7NN  reason: invalid class name */
public final class AnonymousClass7NN {
    public Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public final void A00(U3Z u3z, String str) {
        U3Z u3z2 = u3z;
        0qQ.A0B(u3z, 1);
        Map map = this.A01;
        Object obj = map.get(str);
        C17879VhW vhW = obj;
        if (obj == null) {
            C17879VhW vhW2 = new C17879VhW(str);
            C17185VLp vLp = (C17185VLp) this.A00.remove(str);
            if (vLp != null) {
                vhW2.A00(vLp);
            }
            map.put(str, vhW2);
            vhW = vhW2;
        }
        C17879VhW vhW3 = (C17879VhW) vhW;
        vhW3.A02 = new WeakReference(u3z);
        String A0R = 002.A0R(vhW3.A04, "back");
        if (!0qQ.A0K(u3z.A01, A0R)) {
            u3z.setTargetId(A0R);
            u3z.A05.clear();
            u3z.A03.removeCallbacksAndMessages((Object) null);
            u3z.invalidate();
            Path path = new Path();
            path.moveTo(-13.0f, 15.0f);
            path.lineTo(5.0f, -18.0f);
            u3z2.A05(path, 0.5f, 5.0f, 51, 500, false);
            Path path2 = new Path();
            path2.moveTo(-6.0f, -3.0f);
            path2.lineTo(6.0f, -15.0f);
            u3z2.A05(path2, 0.5f, -5.0f, 53, 650, false);
        }
        C17185VLp vLp2 = vhW3.A00;
        if (vLp2 != null) {
            u3z.A06(vLp2);
            vhW3.A00 = null;
        }
    }

    public final void A01(U3Z u3z, String str) {
        U3Z u3z2 = u3z;
        0qQ.A0B(u3z2, 1);
        Map map = this.A01;
        String str2 = str;
        Object obj = map.get(str2);
        C17879VhW vhW = obj;
        if (obj == null) {
            C17879VhW vhW2 = new C17879VhW(str2);
            C17185VLp vLp = (C17185VLp) this.A00.remove(str2);
            if (vLp != null) {
                vhW2.A00(vLp);
            }
            map.put(str2, vhW2);
            vhW = vhW2;
        }
        C17879VhW vhW3 = (C17879VhW) vhW;
        vhW3.A03 = new WeakReference(u3z2);
        String A0R = 002.A0R(vhW3.A04, "front");
        if (!0qQ.A0K(u3z2.A01, A0R)) {
            u3z2.setTargetId(A0R);
            u3z2.A05.clear();
            u3z2.A03.removeCallbacksAndMessages((Object) null);
            u3z2.invalidate();
            Path path = new Path();
            path.moveTo(-11.0f, 19.0f);
            path.quadTo(-5.0f, 13.0f, 12.0f, 7.0f);
            u3z2.A05(path, 0.67f, 15.0f, 85, 0, true);
            Path path2 = new Path();
            path2.moveTo(22.0f, 12.0f);
            path2.quadTo(-8.0f, 12.0f, -8.0f, 12.0f);
            u3z2.A05(path2, 0.5f, -15.0f, 83, 200, true);
            Path path3 = new Path();
            path3.moveTo(45.0f, 20.0f);
            path3.lineTo(15.0f, 20.0f);
            path3.arcTo(new RectF(-15.0f, -40.0f, 45.0f, 20.0f), 90.0f, 90.0f);
            u3z2.A05(path3, 1.0f, -15.0f, 51, 425, true);
            Path path4 = new Path();
            path4.lineTo(-10.0f, -21.0f);
            u3z2.A05(path4, 0.33f, -15.0f, 53, 575, true);
        }
        C17185VLp vLp2 = vhW3.A01;
        if (vLp2 != null) {
            u3z2.A06(vLp2);
            vhW3.A01 = null;
        }
    }

    public final void A02(U3Z u3z, String str) {
        0qQ.A0B(u3z, 1);
        Map map = this.A01;
        C17879VhW vhW = (C17879VhW) map.get(str);
        if (vhW != null) {
            WeakReference weakReference = vhW.A02;
            if (weakReference != null) {
                if (weakReference.get() == u3z) {
                    vhW.A02 = null;
                } else {
                    return;
                }
            }
            if (vhW.A03 == null) {
                map.remove(str);
            }
        }
    }

    public final void A03(U3Z u3z, String str) {
        0qQ.A0B(u3z, 1);
        Map map = this.A01;
        C17879VhW vhW = (C17879VhW) map.get(str);
        if (vhW != null) {
            WeakReference weakReference = vhW.A03;
            if (weakReference != null && weakReference.get() == u3z) {
                vhW.A03 = null;
                weakReference = null;
            }
            if (vhW.A02 == null && weakReference == null) {
                map.remove(str);
            }
        }
    }

    public final boolean A04(String str) {
        WeakReference weakReference;
        U3Z u3z;
        WeakReference weakReference2;
        U3Z u3z2;
        C17879VhW vhW = (C17879VhW) this.A01.get(str);
        if (vhW == null || (weakReference = vhW.A02) == null || (u3z = (U3Z) weakReference.get()) == null || !u3z.getCanReleaseHearts() || (weakReference2 = vhW.A03) == null || (u3z2 = (U3Z) weakReference2.get()) == null || !u3z2.getCanReleaseHearts()) {
            return false;
        }
        return true;
    }
}
