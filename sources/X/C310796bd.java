package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6bd  reason: invalid class name and case insensitive filesystem */
public final class C310796bd implements C310726bW {
    public HC7 A00;
    public C310966bu A01;
    public C308456Ui A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final boolean A05;
    public final C310916bp A06;
    public final C310666bQ A07;
    public final C310816bf A08;
    public final C310806be A09;
    public final C310876bl A0A;
    public final C310836bh A0B;
    public final C310856bj A0C;
    public final C310946bs A0D;
    public final C310896bn A0E;
    public final C310936br A0F = new C310936br();
    public final C310826bg A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final void ABc(C2354830a r3, C2354830a r4, C255773uh r5, C250973mM r6) {
        0qQ.A0B(r3, 2);
        r3.A00(this.A09);
        r3.A00(this.A0A);
        if (r4 != null) {
            r4.A00(this.A08);
        }
        C310966bu r1 = this.A01;
        if (r1 != null && this.A0I) {
            r3.A00(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        if (X.AnonymousClass3WX.A01(r8, r5.A04) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ABe(X.C2354830a r6, X.C2354830a r7, X.C255773uh r8, X.C250973mM r9) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36313437386967013(0x8102e1000607e5, double:3.0281022537691084E-306)
            boolean r1 = X.182.A06(r4, r3, r0)
            boolean r2 = r5.A05
            r0 = r2 ^ 1
            if (r1 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x0026
        L_0x001d:
            X.4DU r0 = r5.A04
            boolean r0 = X.AnonymousClass3WX.A01(r8, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            boolean r0 = r8.A17()
            if (r0 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x003f
            r0 = 36312806026380548(0x81024e00000504, double:3.027702978791943E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x003f
        L_0x003a:
            X.6bh r0 = r5.A0B
            r6.A00(r0)
        L_0x003f:
            X.3BK r0 = X.AnonymousClass3BJ.A00(r3)
            boolean r0 = r0.A02(r8)
            if (r0 != 0) goto L_0x005a
            X.4DU r0 = r5.A04
            boolean r0 = X.AnonymousClass3WX.A01(r8, r0)
            if (r0 == 0) goto L_0x005a
            X.6Ui r0 = r5.A02
            if (r0 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005a
            r6.A00(r0)
        L_0x005a:
            return
        L_0x005b:
            if (r1 == 0) goto L_0x003f
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310796bd.ABe(X.30a, X.30a, X.3uh, X.3mM):void");
    }

    public final void ABh(View view, C2354830a r12, C2354830a r13, C255773uh r14, C250973mM r15) {
        C250183l2 r0;
        C250513lZ injected;
        int i;
        HC7 hc7;
        0qQ.A0B(view, 0);
        0qQ.A0B(r14, 1);
        0qQ.A0B(r15, 2);
        0qQ.A0B(r12, 3);
        UserSession userSession = this.A03;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36313437387294698L);
        boolean z = this.A0H;
        boolean z2 = true;
        boolean z3 = !z;
        if ((!A062 && !z3) || !AnonymousClass3WX.A02(r14, this.A04)) {
            z2 = false;
        }
        r12.A00(this.A09);
        if (z2) {
            r12.A00(this.A0C);
        }
        AnonymousClass4DU r5 = this.A04;
        if (AnonymousClass3WX.A02(r14, r5) && (hc7 = this.A00) != null && z) {
            r12.A00(hc7);
        }
        C310936br r6 = this.A0F;
        1Xj r4 = r14.A0b;
        if (r4 != null) {
            if (r4.A66()) {
                i = R.id.sponsored_reel_showreel_native_view;
            } else if (r4.A65()) {
                i = R.id.sponsored_reel_showreel_composition_view;
            }
            View findViewById = view.findViewById(i);
            if (findViewById != null) {
                Map map = r6.A01;
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (findViewById.equals(entry.getValue())) {
                        map.remove(key);
                    }
                }
                map.put(r14, findViewById);
            }
        }
        r12.A00(r6);
        if (r13 != null) {
            r13.A00(this.A08);
            if (AnonymousClass3WX.A02(r15.A0H, r5) && this.A07.A03 != AnonymousClass3BQ.MULTI_ADVERTISER_CAROUSEL_POP_UP) {
                r13.A00(this.A0E);
                if (C297785sK.A0l(r15)) {
                    r13.A00(this.A06);
                }
            }
            if (r4 == null || (injected = r4.A0C.getInjected()) == null) {
                r0 = null;
            } else {
                r0 = injected.AaH();
            }
            if (C295435o9.A00(r0, userSession, false)) {
                r13.A00(this.A0G);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.2oN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r21v2, types: [X.2oN, java.lang.Object] */
    public C310796bd(Context context, FragmentActivity fragmentActivity, C46505Dg8 dg8, C309986aF r27, C310016aI r28, C310666bQ r29) {
        C310666bQ r15 = r29;
        this.A07 = r15;
        C309986aF r14 = r27;
        this.A09 = new C310806be(r14);
        UserSession userSession = r15.A01;
        this.A08 = new C310816bf(userSession, r14);
        this.A03 = userSession;
        boolean A062 = 182.A06(0Tu.A06, userSession, 36313437387229161L);
        this.A0H = A062;
        0Tu r5 = 0Tu.A05;
        boolean A063 = 182.A06(r5, userSession, 36313437386639328L);
        this.A05 = A063;
        boolean A064 = 182.A06(r5, userSession, 36318913469881068L);
        this.A0I = A064;
        Context context2 = context;
        this.A0G = new C310826bg(context2, dg8, userSession);
        1Bk r1 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r1);
        1Bk r10 = C229232n3.A00(userSession).A00.A01;
        0qQ.A07(r10);
        AnonymousClass2yG A002 = C234572yE.A00(userSession);
        this.A0B = new C310836bh(r1, r15);
        C310016aI r8 = r28;
        C310006aH r12 = r8.A01;
        Context context3 = context2;
        C309986aF r20 = r14;
        this.A0C = new C310856bj(context3, r10, r12, r20, r15, A002);
        this.A0A = new C310876bl(r10, r14, r15, A002);
        C310666bQ r22 = r15;
        this.A0E = new C310896bn(context3, fragmentActivity, r10, r20, r8, r22);
        this.A06 = new C310916bp(r10, r12);
        this.A0D = new C310946bs(context2, r10, r15);
        AnonymousClass4DU r122 = r15.A02;
        this.A04 = r122;
        if (A063 && !182.A06(r5, userSession, 36313437388277752L)) {
            1Bk r13 = C229232n3.A00(userSession).A00.A00;
            0qQ.A07(r13);
            UserSession userSession2 = userSession;
            AnonymousClass4DU r19 = r122;
            1Bk r17 = r13;
            this.A02 = new C308456Ui(r17, userSession2, r19, AnonymousClass2oO.A00(userSession), new Object(), r22);
        }
        if (A062) {
            this.A00 = new HC7(context2, r10, userSession, r122, AnonymousClass2oO.A00(userSession), r14, r15);
        }
        if (A064) {
            this.A01 = new C310966bu(context2, r10, userSession, r122, AnonymousClass2oO.A00(userSession), new Object());
        }
    }
}
