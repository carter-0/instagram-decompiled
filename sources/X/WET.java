package X;

import android.content.Context;
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

public final class WET implements C231452rh, C59630JQy, X8S {
    public static final Comparator A0F = C20376WqH.A00;
    public int A00;
    public int A01;
    public C296935qt A02;
    public final Handler A03;
    public final Fragment A04;
    public final UserSession A05;
    public final C14313Ttn A06;
    public final XAZ A07;
    public final WWE A08;
    public final C234312xe A09;
    public final List A0A = new ArrayList();
    public final Map A0B = new LinkedHashMap();
    public final Map A0C = new LinkedHashMap();
    public final boolean A0D;
    public final C52526GWd A0E;

    public WET(Fragment fragment, UserSession userSession, C14313Ttn ttn, XAZ xaz, WWE wwe, C52526GWd gWd) {
        0qQ.A0B(fragment, 1);
        C51974G9v.A1M(userSession, wwe, xaz);
        this.A04 = fragment;
        this.A05 = userSession;
        this.A08 = wwe;
        this.A07 = xaz;
        this.A06 = ttn;
        this.A0E = gWd;
        this.A0D = 0qg.A01().A06() <= 1 ? false : true;
        this.A09 = new C234312xe(AnonymousClass05K.A01);
        this.A00 = -1;
        this.A03 = new C14697U1x(Looper.getMainLooper(), this, 6);
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
        if (X.AnonymousClass3OE.A00(r3.A05).A00() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dxv(X.1Xj r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GWd r2 = r3.A0E
            if (r2 == 0) goto L_0x0025
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0021
            androidx.fragment.app.Fragment r0 = r3.A04
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r3.A05
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
        throw new UnsupportedOperationException("Method not decompiled: X.WET.Dxv(X.1Xj):void");
    }

    public final void DyT(1Xj r2) {
        0qQ.A0B(r2, 0);
        C52526GWd gWd = this.A0E;
        if (gWd != null) {
            gWd.A02(r2);
        }
    }

    public final void Dye(Rect rect, C296935qt r5, float f, int i) {
        0qQ.A0B(r5, 0);
        this.A0B.put(r5, new C17425VVe(i, this.A07.AVI(r5), f));
        EHL();
    }

    public final void Dyf(C296935qt r2) {
        0qQ.A0B(r2, 0);
        this.A0B.remove(r2);
        EHL();
    }

    public final void Dyh(Rect rect, C296935qt r5, float f, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        Map map = this.A0B;
        C17425VVe vVe = (C17425VVe) map.get(r5);
        if (!(vVe == null || (i2 = vVe.A01 - i) == 0)) {
            this.A09.A01(i2);
        }
        C17425VVe vVe2 = (C17425VVe) map.get(r5);
        if (vVe2 == null) {
            map.put(r5, new C17425VVe(i, this.A07.AVI(r5), f));
        } else if (vVe2.A00 != f || vVe2.A01 != i) {
            vVe2.A00 = f;
            vVe2.A01 = i;
        } else {
            return;
        }
        EHL();
    }

    public static final void A00(WET wet, int i) {
        int i2;
        2HY r11;
        int i3 = i;
        WET wet2 = wet;
        Map map = wet.A0B;
        if (!map.isEmpty()) {
            List list = wet.A0A;
            if (!list.isEmpty() && i3 != -1) {
                boolean z = false;
                int size = list.size();
                while (i3 < size) {
                    Map.Entry entry = (Map.Entry) 00k.A0O(list, i3);
                    if (entry != null) {
                        C296935qt r1 = (C296935qt) entry.getKey();
                        if (((C17425VVe) entry.getValue()).A00 <= 0.25f) {
                            continue;
                        } else {
                            if (!z) {
                                C14313Ttn ttn = wet2.A06;
                                C14315Ttp A022 = ttn.A02(r1);
                                C20976X7p A012 = ttn.A01(r1);
                                if (A022 == null || A012 == null || !A022.A03) {
                                    z = false;
                                } else {
                                    wet2.A08.A00.A0B(new C14339TuM(A022.A00, A012, A022.A01, wet2.A07.CEA(A022), 0, AnonymousClass7TF.A1S(map.size(), 1)));
                                    z = true;
                                    wet2.A02 = r1;
                                }
                            }
                            if (wet2.A01 < 1) {
                                C17425VVe vVe = (C17425VVe) map.get(r1);
                                if (vVe != null && (i2 = vVe.A02) != -1 && vVe.A00 >= 1.0f && wet2.A0C.size() < 1) {
                                    Integer num = wet2.A09.A01;
                                    if (wet2.A00 != i2) {
                                        XAZ xaz = wet2.A07;
                                        if (i2 >= xaz.getCount()) {
                                            r11 = 2HY.A00;
                                        } else if (num == AnonymousClass05K.A01) {
                                            r11 = C229632nm.A0C(i2 + 1, xaz.getCount());
                                        } else {
                                            r11 = new 2HZ(i2 - 1, 0, -1);
                                        }
                                        int i4 = r11.A00;
                                        int i5 = r11.A01;
                                        int i6 = r11.A02;
                                        if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                                            while (true) {
                                                C14315Ttp CE9 = xaz.CE9(i4);
                                                Context context = wet2.A04.getContext();
                                                if (CE9 == null || !CE9.A03 || context == null) {
                                                    if (i4 == i5) {
                                                        break;
                                                    }
                                                    i4 += i6;
                                                } else {
                                                    WWE wwe = wet2.A08;
                                                    1Xj r12 = CE9.A01;
                                                    if (!wwe.CcR(r12)) {
                                                        wet2.A00 = i2;
                                                        AnonymousClass4U8 r0 = new AnonymousClass4U8(context, wet2.A05, r12.CEL(), "explore");
                                                        r0.A04 = true;
                                                        AnonymousClass4UA.A00(r0.A00());
                                                    }
                                                }
                                            }
                                        }
                                        if (num == AnonymousClass05K.A01) {
                                            xaz.getCount();
                                        }
                                    }
                                }
                                wet2.A01++;
                            } else {
                                return;
                            }
                        }
                    }
                    i3++;
                }
            }
        }
    }

    public final void AGS() {
        this.A03.removeCallbacksAndMessages((Object) null);
    }

    public final void DYl(1Xj r2) {
        C52526GWd gWd = this.A0E;
        if (gWd != null) {
            gWd.A01(r2);
        }
    }

    public final void DhX() {
        this.A03.sendEmptyMessageDelayed(0, 200);
    }

    public final void EHL() {
        this.A03.sendEmptyMessage(0);
    }

    public final void onCompletion() {
        C14312Ttm ttm = this.A08.A00;
        if (ttm.A0G() && ttm.A07() != null) {
            ttm.A0C("finished", true);
        }
        this.A03.sendEmptyMessage(1);
    }
}
