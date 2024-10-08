package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class WES implements C231452rh, C59630JQy, X8S {
    public static final Comparator A0E = C20377WqI.A00;
    public static final Comparator A0F = C20378WqJ.A00;
    public int A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C14313Ttn A03;
    public final XAZ A04;
    public final WWE A05;
    public final C234312xe A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new LinkedHashMap();
    public final Map A09 = new LinkedHashMap();
    public final boolean A0A;
    public final boolean A0B;
    public final Handler A0C;
    public final C52526GWd A0D;

    public WES(Fragment fragment, UserSession userSession, C14313Ttn ttn, XAZ xaz, WWE wwe, C52526GWd gWd, boolean z) {
        AnonymousClass7TF.A1D(fragment, 1, xaz);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A05 = wwe;
        this.A04 = xaz;
        this.A03 = ttn;
        this.A0B = z;
        this.A0D = gWd;
        this.A0A = 0qg.A01().A06() <= 1 ? false : true;
        this.A06 = new C234312xe(AnonymousClass05K.A01);
        this.A00 = -1;
        this.A0C = new C14697U1x(Looper.getMainLooper(), this, 7);
        wwe.A00.A03 = this;
    }

    public final void D1O(int i, int i2, Object obj) {
    }

    public final void DKr(int i, int i2) {
    }

    public final void DSU(int i, int i2) {
    }

    public final void Ddf(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (X.AnonymousClass3OE.A00(r3.A02).A00() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dxv(X.1Xj r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GWd r2 = r3.A0D
            if (r2 == 0) goto L_0x0025
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0021
            androidx.fragment.app.Fragment r0 = r3.A01
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r3.A02
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r2.A04(r4, r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WES.Dxv(X.1Xj):void");
    }

    public final void DyT(1Xj r2) {
        0qQ.A0B(r2, 0);
        C52526GWd gWd = this.A0D;
        if (gWd != null) {
            gWd.A02(r2);
        }
    }

    public final void Dye(Rect rect, C296935qt r5, float f, int i) {
        0qQ.A0B(r5, 0);
        this.A08.put(r5, new C17426VVf(i, this.A04.AVI(r5), f));
        EHL();
    }

    public final void Dyf(C296935qt r2) {
        0qQ.A0B(r2, 0);
        this.A08.remove(r2);
        EHL();
    }

    public final void Dyh(Rect rect, C296935qt r5, float f, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        Map map = this.A08;
        C17426VVf vVf = (C17426VVf) map.get(r5);
        if (!(vVf == null || (i2 = vVf.A01 - i) == 0)) {
            this.A06.A01(i2);
        }
        C17426VVf vVf2 = (C17426VVf) map.get(r5);
        if (vVf2 == null) {
            map.put(r5, new C17426VVf(i, this.A04.AVI(r5), f));
        } else if (vVf2.A00 != f || vVf2.A01 != i) {
            vVf2.A00 = f;
            vVf2.A01 = i;
        } else {
            return;
        }
        EHL();
    }

    public final void onCompletion() {
    }

    public final void AGS() {
        this.A0C.removeCallbacksAndMessages((Object) null);
    }

    public final void DYl(1Xj r2) {
        C52526GWd gWd = this.A0D;
        if (gWd != null) {
            gWd.A01(r2);
        }
    }

    public final void DhX() {
        this.A0C.sendEmptyMessageDelayed(0, 200);
    }

    public final void EHL() {
        this.A0C.sendEmptyMessage(0);
    }
}
