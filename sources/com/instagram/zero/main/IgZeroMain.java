package com.instagram.zero.main;

import X.0KC;
import X.0Tu;
import X.0lg;
import X.0qQ;
import X.14i;
import X.182;
import X.19B;
import X.1Eo;
import X.1R7;
import X.AnonymousClass0lh;
import X.AnonymousClass19S;
import X.AnonymousClass1HX;
import X.AnonymousClass3OC;
import X.AnonymousClass3OD;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C262204Co;
import X.C271524iz;
import X.C51970G9q;
import X.C56662I6r;
import X.C58106ImS;
import X.C66580MXl;
import X.C69266NiS;
import X.C71079Oay;
import X.C71941OtR;
import X.C73889PlQ;
import X.OD7;
import X.OSR;
import com.instagram.common.session.UserSession;
import com.instagram.zero.cma.CampaignAPITokenFetcher;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

public final class IgZeroMain implements AnonymousClass0lh {
    public static IgZeroMain A08;
    public final UserSession A00;
    public final CampaignAPITokenFetcher A01;
    public final OD7 A02;
    public final C56662I6r A03;
    public final boolean A04;
    public final boolean A05;
    public final C262204Co A06;
    public final C71079Oay A07;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Hj A00(com.instagram.zero.main.IgZeroMain r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 39
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x0026
            r5 = r7
            X.ME5 r5 = (X.ME5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r3) goto L_0x004c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0026:
            X.ME5 r5 = X.ME5.A01(r6, r7, r3)
            goto L_0x0016
        L_0x002b:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.Class<X.HlO> r1 = X.C55665HlO.class
            X.ItS r0 = X.C58533ItS.A00
            java.lang.Object r0 = r2.A01(r1, r0)
            X.HlO r0 = (X.C55665HlO) r0
            X.0Ud r2 = r0.A01
            r1 = 32
            X.PeH r0 = new X.PeH
            r0.<init>(r6, r1)
            r5.A00 = r3
            java.lang.Object r0 = r2.collect(r0, r5)
            if (r0 != r4) goto L_0x004f
            return r4
        L_0x004c:
            X.0eS.A00(r1)
        L_0x004f:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.main.IgZeroMain.A00(com.instagram.zero.main.IgZeroMain, X.4D7):X.1Hj");
    }

    public final 1R7 A01() {
        C69266NiS niS;
        if (this.A02.A01.getValue() == AnonymousClass3OD.FREE) {
            niS = C69266NiS.BASIC;
        } else {
            niS = C69266NiS.NORMAL;
        }
        CampaignAPITokenFetcher campaignAPITokenFetcher = this.A01;
        HashMap hashMap = campaignAPITokenFetcher.A02;
        1R7 r0 = (1R7) hashMap.get(niS);
        if (r0 == null) {
            String string = campaignAPITokenFetcher.A00.getString(niS.toString(), (String) null);
            synchronized (campaignAPITokenFetcher) {
                if (string != null) {
                    try {
                        r0 = C271524iz.A00(C66580MXl.A17(string));
                        hashMap.put(niS, r0);
                    } catch (JSONException e) {
                        0KC.A0F("CampaignAPITokenFetcher", "Token parsing failure", e);
                    }
                }
                r0 = null;
            }
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 37
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x003f
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0044
            X.0eS.A00(r3)
        L_0x0024:
            libraries.zero.headers.ZeroHeadersEntry r3 = (libraries.zero.headers.ZeroHeadersEntry) r3
            if (r3 == 0) goto L_0x002c
            java.lang.String r2 = r3.A03
            if (r2 != 0) goto L_0x002e
        L_0x002c:
            java.lang.String r2 = ""
        L_0x002e:
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            X.Oay r0 = r5.A07
            r4.A00 = r1
            X.OYZ r0 = r0.A02
            java.lang.Object r3 = X.C56378HxX.A00(r0, r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003f:
            X.ME5 r4 = X.ME5.A01(r5, r7, r3)
            goto L_0x0016
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.main.IgZeroMain.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 38
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x003f
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0044
            X.0eS.A00(r3)
        L_0x0024:
            libraries.zero.headers.ZeroHeadersEntry r3 = (libraries.zero.headers.ZeroHeadersEntry) r3
            if (r3 == 0) goto L_0x002c
            java.lang.String r2 = r3.A04
            if (r2 != 0) goto L_0x002e
        L_0x002c:
            java.lang.String r2 = ""
        L_0x002e:
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            X.Oay r0 = r5.A07
            r4.A00 = r1
            X.OYZ r0 = r0.A02
            java.lang.Object r3 = X.C56378HxX.A00(r0, r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003f:
            X.ME5 r4 = X.ME5.A01(r5, r7, r3)
            goto L_0x0016
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.main.IgZeroMain.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A04(String str, AnonymousClass4D7 r4) {
        1R7 A012 = A01();
        if (A012 == null) {
            return null;
        }
        0qQ.A0A("IG_HEADERS_ENABLED");
        if (A012.A0C.contains(AnonymousClass7TF.A0j("IG_HEADERS_ENABLED"))) {
            return this.A07.A03(str, AnonymousClass7TG.A0j(), r4);
        }
        return null;
    }

    public final void onSessionWillEnd() {
        this.A06.AG7((CancellationException) null);
    }

    public IgZeroMain(UserSession userSession, CampaignAPITokenFetcher campaignAPITokenFetcher, C71079Oay oay, C56662I6r i6r) {
        AnonymousClass7TG.A1O(userSession, i6r);
        int A082 = C51970G9q.A08(3, campaignAPITokenFetcher, oay);
        this.A00 = userSession;
        this.A03 = i6r;
        this.A01 = campaignAPITokenFetcher;
        this.A07 = oay;
        this.A02 = (OD7) userSession.A01(OD7.class, C73889PlQ.A00);
        0Tu r4 = 0Tu.A05;
        this.A04 = 182.A06(r4, userSession, 36328255023758485L);
        OSR osr = OSR.A00;
        0qQ.A0B(osr, 0);
        AnonymousClass3OC.A00 = osr;
        try {
            Method method = Class.forName("com.instagram.zero.dogfooding.IgZeroDogfoodingInit").getMethod("getInstance", new Class[]{0lg.class});
            0qQ.A07(method);
            method.invoke((Object) null, new Object[]{this.A00});
        } catch (Exception unused) {
            0KC.A0C("Zero_IgZeroMain", "IgZeroDogfooding failed to initialized");
        }
        AnonymousClass19S A012 = AnonymousClass1HX.A01(240488536, 3);
        C58106ImS imS = new C58106ImS((Object) this, (AnonymousClass4D7) null, 24);
        19B r5 = 19B.A00;
        this.A06 = 1Eo.A04(r5, imS, A012);
        1Eo.A05(r5, new C58106ImS((Object) this, (AnonymousClass4D7) null, 25), AnonymousClass1HX.A02(273884380, 3));
        1Eo.A05(r5, new C58106ImS((Object) this, (AnonymousClass4D7) null, 26), AnonymousClass1HX.A02(240488536, 3));
        boolean z = 14i.A05;
        14i.A05(new C71941OtR(this, A082));
        this.A05 = 182.A06(r4, userSession, 36328255023824022L);
    }
}
