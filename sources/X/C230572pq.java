package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2pq  reason: invalid class name and case insensitive filesystem */
public final class C230572pq implements C230532pm {
    public final UserSession A00;
    public final C230562pp A01;
    public final AnonymousClass4DU A02;
    public final C228402lc A03;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public C230572pq(UserSession userSession, AnonymousClass4DU r5, C228402lc r6, C249763kK r7) {
        this(userSession, new C230562pp(userSession, new C232832uW(userSession, r7), r5, true), r5, r6);
    }

    public final void ChV(1Xj r4, 1Xj r5, 1Xj r6, int i, int i2, int i3) {
        C232872ua r2 = this.A01.A00;
        if (r2 != null) {
            boolean containsKey = r2.A04.containsKey(C232872ua.A02(r2, r4, r5));
            if (containsKey) {
                r2.A08(r4, r5, i2);
            }
            r2.A07(r4, r5, i2);
            r2.A09(r4, r6, i, i3);
            if (containsKey) {
                r2.A0A(r4, r6, i, i3);
            }
        }
    }

    public final void D6z(View view) {
        this.A01.D6z(view);
    }

    public final void DMB(1Xj r5) {
        C232872ua r0;
        AnonymousClass3W1 BQr = this.A03.BQr(r5);
        BQr.A0l(false);
        int i = BQr.A03;
        C230562pp r2 = this.A01;
        r2.A03(r5, i);
        1Xj A1c = r5.A1c(i);
        if (r5.A5D() && A1c != null && (r0 = r2.A00) != null) {
            r0.A08(r5, A1c, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r2 = r3.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMS(X.1Xj r6, int r7) {
        /*
            r5 = this;
            X.2pp r4 = r5.A01
            X.3s5 r0 = X.C254193s5.A01
            r4.A01(r0, r6, r7)
            X.2lc r0 = r5.A03
            X.3W1 r3 = r0.BQr(r6)
            r0 = 1
            r3.A0l(r0)
            boolean r0 = r6.A5D()
            if (r0 == 0) goto L_0x0026
            int r2 = r3.A03
            X.1Xj r1 = r6.A1c(r2)
            if (r1 == 0) goto L_0x0026
            X.2ua r0 = r4.A00
            if (r0 == 0) goto L_0x0026
            r0.A0A(r6, r1, r7, r2)
        L_0x0026:
            int r0 = r3.A03
            X.1Xj r3 = r6.A1c(r0)
            if (r3 != 0) goto L_0x002f
            r3 = r6
        L_0x002f:
            boolean r0 = r3.A5f()
            if (r0 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r2 = r5.A00
            X.4DU r1 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.I2F.A02(r3, r1, r2, r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230572pq.DMS(X.1Xj, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.3s8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.3s8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.3s8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMV(android.view.View r6, X.1Xj r7, double r8) {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r0 = r5.A00
            boolean r0 = X.C231122qu.A0S(r0, r7)
            if (r0 != 0) goto L_0x0027
            X.2pp r0 = r5.A01
            X.2ua r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            java.lang.String r2 = X.C232872ua.A01(r0, r7)
            java.util.Map r1 = r0.A06
            java.lang.Object r0 = r1.get(r2)
            X.3s8 r0 = (X.C254223s8) r0
            if (r0 != 0) goto L_0x0024
            X.3s8 r0 = new X.3s8
            r0.<init>()
            r1.put(r2, r0)
        L_0x0024:
            r0.A00(r8)
        L_0x0027:
            X.2lc r0 = r5.A03
            X.3W1 r4 = r0.BQr(r7)
            r2 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            r4.A0g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230572pq.DMV(android.view.View, X.1Xj, double):void");
    }

    public final void Duz(1Xj r7) {
        1Xj A1c;
        C232872ua r0;
        C228402lc r4 = this.A03;
        AnonymousClass3W1 BQr = r4.BQr(r7);
        int i = BQr.A03;
        C230562pp r2 = this.A01;
        r2.A02(r7, i);
        if (!(!r7.A5D() || (A1c = r7.A1c(i)) == null || (r0 = r2.A00) == null)) {
            r0.A07(r7, A1c, i);
        }
        BQr.A31 = false;
        UserSession userSession = this.A00;
        if (C253933re.A00(r7, BQr.A02) || AnonymousClass3YF.A00(userSession, r7)) {
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36325678043509891L)) {
                AnonymousClass3W1 BQr2 = r4.BQr(r7);
                0qQ.A0B(BQr2, 2);
                if (BQr2.A1j) {
                    BQr2.A1j = false;
                    AnonymousClass3W1.A00(BQr2, 76);
                }
                if (1sx.A0Q(r7, BQr2.A03)) {
                    C292885jg.A00(userSession).A01(BQr2);
                }
                AnonymousClass3W1 BQr3 = r4.BQr(r7);
                0qQ.A0B(BQr3, 1);
                BQr3.A0m(false, true);
                BQr3.A2P = false;
                BQr3.A1L = null;
                if (1sx.A0Q(r7, BQr3.A03)) {
                    AnonymousClass5F9.A00().A00(BQr3);
                }
            }
            if (!C2360432f.A00(userSession).A03(r7, r4.BQr(r7))) {
                AnonymousClass3W1 BQr4 = r4.BQr(r7);
                0qQ.A0B(BQr4, 2);
                BQr4.A0e(false);
                if (BQr4.A1l) {
                    BQr4.A1l = false;
                }
                BQr4.A1L = null;
                if (1sx.A0Q(r7, BQr4.A03)) {
                    C293415kh.A00(userSession).A00(BQr4);
                }
            }
            AnonymousClass598.A00().A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        if (r1 > (X.AnonymousClass4X2.A00(r9).A04(r7, 0) + com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dv0(X.0jB r15, X.1Xj r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r10 = r16
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x0020
            com.instagram.common.session.UserSession r2 = r14.A00
            java.lang.String r1 = X.C231122qu.A07(r2, r10)
            if (r1 == 0) goto L_0x0020
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Class<X.2BT> r0 = X.2BT.class
            java.lang.Object r0 = r2.A00(r0)
            X.2BT r0 = (X.2BT) r0
            if (r0 == 0) goto L_0x0020
            r0.A01 = r1
        L_0x0020:
            X.2lc r0 = r14.A03
            X.3W1 r6 = r0.BQr(r10)
            int r12 = r6.A03
            X.0jB r9 = new X.0jB
            r9.<init>()
            boolean r0 = r6.A0o()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "is_image_loaded"
            java.util.Map r0 = r9.A00
            r0.put(r1, r2)
            com.instagram.common.session.UserSession r5 = r14.A00
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313957077616968(0x81035a00000948, double:3.028430908228766E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0058
            int r1 = r6.A0V
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "pushdown_offset"
            r9.A09(r0, r1)
        L_0x0058:
            X.4DU r0 = r14.A02
            boolean r0 = r0.isSponsoredEligible()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x009a
            java.lang.String r2 = r10.getId()
            r2.getClass()
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r1 = r0.A01
            java.lang.String r4 = "current_ad_id"
            r0 = 0
            java.lang.String r0 = r1.getString(r4, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009a
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r3 = r10.getId()
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            r1.E5g(r4, r3)
            java.lang.String r0 = "has_seen_current_ad"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x009a:
            X.2pp r8 = r14.A01
            r13 = 1
            r11 = r17
            r8.A00(r9, r10, r11, r12, r13)
            boolean r0 = r10.A5D()
            if (r0 == 0) goto L_0x00b5
            X.1Xj r1 = r10.A1c(r12)
            if (r1 == 0) goto L_0x00b5
            X.2ua r0 = r8.A00
            if (r0 == 0) goto L_0x00b5
            r0.A09(r10, r1, r11, r12)
        L_0x00b5:
            boolean r0 = r10.CeS()
            if (r0 == 0) goto L_0x010e
            java.lang.Class<X.4X2> r2 = X.AnonymousClass4X2.class
            r1 = 35
            X.MMF r0 = new X.MMF
            r0.<init>(r5, r1)
            java.lang.Object r9 = r5.A01(r2, r0)
            X.4X2 r9 = (X.AnonymousClass4X2) r9
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r10.getId()
            if (r3 == 0) goto L_0x015f
            X.1Bk r0 = X.AnonymousClass4X2.A00(r9)
            boolean r0 = r0.A0F(r3)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r7 = r10.getId()
            if (r7 == 0) goto L_0x0157
            X.1Bk r0 = X.AnonymousClass4X2.A00(r9)
            r3 = 0
            long r7 = r0.A04(r7, r3)
            r3 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 + r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
        L_0x00f6:
            java.lang.String r0 = r10.getId()
            if (r0 == 0) goto L_0x014f
            X.1Bk r3 = X.AnonymousClass4X2.A00(r9)
            r3.A0C(r0, r1)
            int r1 = r3.A03()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto L_0x010e
            X.C306366Lw.A00(r3)
        L_0x010e:
            int r0 = r6.A02
            boolean r0 = X.C253933re.A00(r10, r0)
            if (r0 != 0) goto L_0x011c
            boolean r0 = X.AnonymousClass3YF.A00(r5, r10)
            if (r0 == 0) goto L_0x012f
        L_0x011c:
            X.599 r2 = X.AnonymousClass598.A00()
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x012f
            java.lang.Runnable r1 = r2.A00
            if (r1 == 0) goto L_0x012f
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            r2.A01 = r13
        L_0x012f:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.1GW r2 = X.1GV.A00(r5)
            java.lang.String r1 = r10.getId()
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x014e
            if (r1 == 0) goto L_0x014e
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x014e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.1GW.A00(r2, r0)
        L_0x014e:
            return
        L_0x014f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230572pq.Dv0(X.0jB, X.1Xj, int, int, int):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A01.onActivityResult(i, i2, intent);
    }

    public final void onCreate() {
        this.A01.onCreate();
    }

    public final void onDestroy() {
        this.A01.onDestroy();
    }

    public final void onDestroyView() {
        this.A01.onDestroyView();
    }

    public final void onPause() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        userSession.A01(AnonymousClass6YP.class, AnonymousClass6YO.A00);
        this.A01.onPause();
    }

    public final void onResume() {
        this.A01.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        this.A01.onStart();
    }

    public final void onStop() {
        this.A01.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A01.onViewCreated(view, bundle);
    }

    public C230572pq(UserSession userSession, C230562pp r2, AnonymousClass4DU r3, C228402lc r4) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }
}
