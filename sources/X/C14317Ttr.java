package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ttr  reason: case insensitive filesystem */
public class C14317Ttr implements C59630JQy, X8S {
    public static final Comparator A0D = C14342TuP.A00;
    public final Fragment A00;
    public final UserSession A01;
    public final C14313Ttn A02;
    public final XAZ A03;
    public final C14322Ttx A04;
    public final C234312xe A05 = new C234312xe(AnonymousClass05K.A01);
    public final List A06 = new ArrayList();
    public final Map A07 = new LinkedHashMap();
    public final boolean A08;
    public final Handler A09;
    public final C52526GWd A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C14317Ttr(Fragment fragment, UserSession userSession, C14313Ttn ttn, XAZ xaz, C14322Ttx ttx, C52526GWd gWd) {
        AnonymousClass7TF.A1D(fragment, 1, xaz);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A04 = ttx;
        this.A03 = xaz;
        this.A02 = ttn;
        this.A0A = gWd;
        0Tu r2 = 0Tu.A05;
        this.A0C = 182.A06(r2, userSession, 36321507630392782L);
        this.A0B = 182.A06(r2, userSession, 36320141830725688L);
        this.A09 = new C14697U1x(Looper.getMainLooper(), this, 5);
        this.A08 = 0qg.A01().A06() <= 1 ? false : true;
        ttx.A01 = this;
        Iterator A0v = AnonymousClass7TF.A0v(ttx.A08);
        while (A0v.hasNext()) {
            ((C14312Ttm) A0v.next()).A03 = this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (X.AnonymousClass3OE.A00(r3.A01).A00() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dxv(X.1Xj r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GWd r2 = r3.A0A
            if (r2 == 0) goto L_0x0025
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0021
            androidx.fragment.app.Fragment r0 = r3.A00
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r3.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C14317Ttr.Dxv(X.1Xj):void");
    }

    public final void DyT(1Xj r2) {
        0qQ.A0B(r2, 0);
        C52526GWd gWd = this.A0A;
        if (gWd != null) {
            gWd.A02(r2);
        }
    }

    public void Dyf(C296935qt r3) {
        0qQ.A0B(r3, 0);
        A01(this, r3, 0.0f, -1);
    }

    public final void onCompletion() {
    }

    public static final void A01(C14317Ttr ttr, C296935qt r8, float f, int i) {
        boolean A1R;
        XAZ xaz;
        int AVI;
        2HY r0;
        C14315Ttp A022;
        boolean A1T;
        int i2;
        Map map = ttr.A07;
        if (map.containsKey(r8)) {
            C14318Tts tts = (C14318Tts) map.get(r8);
            if (!(tts == null || (i2 = tts.A00 - i) == 0)) {
                ttr.A05.A01(i2);
            }
            if (ttr instanceof C14316Ttq) {
                C14316Ttq ttq = (C14316Ttq) ttr;
                1Xj A012 = ttq.A01(r8);
                if (A012 != null) {
                    A1T = !ttq.A00.containsKey(A012);
                }
                map.remove(r8);
                ttr.EHL();
                return;
            }
            A1T = C51970G9q.A1T((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
            if (!A1T) {
                map.put(r8, new C14318Tts(i));
                return;
            }
            map.remove(r8);
            ttr.EHL();
            return;
        }
        if (ttr instanceof C14316Ttq) {
            C14316Ttq ttq2 = (C14316Ttq) ttr;
            1Xj A013 = ttq2.A01(r8);
            if (A013 != null) {
                A1R = ttq2.A00.containsKey(A013);
            } else {
                return;
            }
        } else {
            A1R = AnonymousClass7TF.A1R((f > 0.25f ? 1 : (f == 0.25f ? 0 : -1)));
        }
        if (A1R) {
            boolean z = ttr.A0C;
            if (z && (A022 = ttr.A02.A02(r8)) != null) {
                ttr.A02(A022.A01);
            }
            map.put(r8, new C14318Tts(i));
            ttr.EHL();
            if (!z && (AVI = xaz.AVI(r8)) != -1) {
                if (ttr.A05.A01 == AnonymousClass05K.A01) {
                    r0 = C229632nm.A0C(AVI + 1, xaz.getCount());
                } else {
                    r0 = new 2HZ(AVI - 1, 0, -1);
                }
                int i3 = r0.A00;
                int i4 = r0.A01;
                int i5 = r0.A02;
                if (i5 > 0) {
                    if (i3 > i4) {
                        return;
                    }
                } else if (i5 >= 0 || i4 > i3) {
                    return;
                }
                while (true) {
                    C14315Ttp CE9 = (xaz = ttr.A03).CE9(i3);
                    if (CE9 != null && CE9.A03) {
                        ttr.A02(CE9.A01);
                        return;
                    } else if (i3 != i4) {
                        i3 += i5;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void A02(1Xj r6) {
        Integer num;
        C14337TuK tuK;
        Context context = this.A00.getContext();
        if (context != null) {
            if (!(this instanceof C14316Ttq) || (tuK = (C14337TuK) ((C14316Ttq) this).A00.get(r6)) == null) {
                num = null;
            } else {
                num = Integer.valueOf(tuK.A00);
            }
            int A022 = DbX.A02(num);
            AnonymousClass3WR CEL = r6.CEL();
            if (A022 > 0 && this.A0B) {
                CEL.A01 = 0;
                CEL.A00 = A022;
            }
            AnonymousClass4UA.A00(new AnonymousClass4U8(context, this.A01, CEL, "explore").A00());
        }
    }

    public final void AGS() {
        this.A09.removeCallbacksAndMessages((Object) null);
    }

    public final void DYl(1Xj r2) {
        C52526GWd gWd = this.A0A;
        if (gWd != null) {
            gWd.A01(r2);
        }
    }

    public final void DhX() {
        this.A09.sendEmptyMessageDelayed(0, 200);
    }

    public final void Dye(Rect rect, C296935qt r4, float f, int i) {
        if (this instanceof C14316Ttq) {
            C14316Ttq ttq = (C14316Ttq) this;
            AnonymousClass7TF.A1C(r4, 0, rect);
            C14316Ttq.A00(rect, ttq, r4, f, i);
            A01(ttq, r4, f, i);
            return;
        }
        0qQ.A0B(r4, 0);
        A01(this, r4, f, i);
    }

    public final void Dyh(Rect rect, C296935qt r4, float f, int i) {
        if (this instanceof C14316Ttq) {
            C14316Ttq ttq = (C14316Ttq) this;
            AnonymousClass7TF.A1C(r4, 0, rect);
            C14316Ttq.A00(rect, ttq, r4, f, i);
            A01(ttq, r4, f, i);
            return;
        }
        0qQ.A0B(r4, 0);
        A01(this, r4, f, i);
    }

    public final void EHL() {
        this.A09.sendEmptyMessage(0);
    }
}
