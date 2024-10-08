package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Ufj  reason: case insensitive filesystem */
public final class C15617Ufj extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C15617Ufj(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A04 = z;
        this.A01 = obj2;
        this.A05 = z2;
    }

    public final void onFail(C268654dm r15) {
        int i;
        IllegalStateException illegalStateException;
        int i2;
        String str;
        String str2;
        Throwable th;
        String str3;
        C17589Vah vah;
        C17589Vah vah2;
        if (this.A00 != 0) {
            int A032 = AnonymousClass0fD.A03(393522596);
            0qQ.A0B(r15, 0);
            boolean z = this.A05;
            if (z && (vah2 = (C17589Vah) this.A01) != null) {
                VFY.A00(vah2, AnonymousClass000.A00(3883), "dialog", (String) null, this.A04);
            }
            W01 w01 = (W01) this.A03;
            UserSession userSession = w01.A02;
            C49089EpE.A00(userSession).A03(TraceFieldType.FailureReason, "network_failure");
            C18069Vkw A002 = C49089EpE.A00(userSession);
            Throwable A012 = r15.A01();
            if (A012 != null) {
                str3 = A012.getMessage();
            } else {
                str3 = "Network error";
            }
            A002.A04("network_failure", str3);
            boolean z2 = this.A04;
            if (z2) {
                C59689JTv.A01(w01.A00, "deep_delete_failed_instagram_and_facebook", 2131957502, 1);
                if (z && (vah = (C17589Vah) this.A01) != null) {
                    VFY.A00(vah, "view", "failure_toast", "ig_deletion_failure_fb_deletion_failure", z2);
                }
            } else {
                W01.A01((C17589Vah) this.A01, w01, false, z, true);
            }
            AnonymousClass0fD.A0A(-1115633412, A032);
            return;
        }
        int A033 = AnonymousClass0fD.A03(488791439);
        0qQ.A0B(r15, 0);
        Object A003 = r15.A00();
        if (A003 != null) {
            C250903mF r1 = (C250903mF) A003;
            i = r1.mStatusCode;
            r1.A08 = (UUID) this.A02;
        } else {
            i = 0;
        }
        C19439WZn wZn = (C19439WZn) this.A03;
        C19439WZn.A01(wZn, (List) null, i);
        AnonymousClass3CP r2 = wZn.A09;
        if (r2 != null) {
            long currentTimeMillis = System.currentTimeMillis() - wZn.A06;
            if (182.A06(0Tu.A05, wZn.A0D, 36322280724310052L)) {
                String A004 = AnonymousClass000.A00(1379);
                1XP r7 = (1XP) A003;
                if (r7 != null) {
                    str2 = r7.getErrorMessage();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "n/a";
                }
                String A0R = 002.A0R(A004, str2);
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(1376));
                Throwable A013 = r15.A01();
                if (A013 == null || (th = A013.getCause()) == null) {
                    th = "n/a";
                }
                str = 002.A0g(A0R, " | ", AnonymousClass7TF.A0i(th, sb));
            } else {
                str = null;
            }
            r2.A0H.Ch0(str, i, currentTimeMillis, r2.A07);
            r2.A07 = false;
            wZn.A07.onFail(r15);
            if (wZn.A0K) {
                AnonymousClass3CP r12 = wZn.A09;
                if (r12 != null) {
                    r12.A03 = AnonymousClass05K.A00;
                    wZn.A07.onFinish();
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = 1232720934;
                }
            }
            AnonymousClass0fD.A0A(-509493708, A033);
            return;
        }
        illegalStateException = new IllegalStateException("Required value was null.");
        i2 = -1394924690;
        AnonymousClass0fD.A0A(i2, A033);
        throw illegalStateException;
    }

    public final void onFailInBackground(C268654dm r5) {
        if (this.A00 != 0) {
            C15617Ufj.super.onFailInBackground(r5);
            return;
        }
        int A032 = AnonymousClass0fD.A03(1207745383);
        ((C19439WZn) this.A03).A05 = System.currentTimeMillis();
        AnonymousClass0fD.A0A(-2001665370, A032);
    }

    public final void onFinish() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(1185188203);
            ((F3H) this.A02).A00();
            i = 1636112348;
        } else {
            A032 = AnonymousClass0fD.A03(-608291935);
            C19439WZn wZn = (C19439WZn) this.A03;
            System.currentTimeMillis();
            if (!wZn.A0K) {
                AnonymousClass3CP r1 = wZn.A09;
                if (r1 != null) {
                    r1.A03 = AnonymousClass05K.A00;
                    wZn.A07.onFinish();
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0A(780565029, A032);
                    throw A0y;
                }
            }
            i = 1547113949;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1815153972);
            ((F3H) this.A02).A01();
            i = 911716486;
        } else {
            A032 = AnonymousClass0fD.A03(496169982);
            C19439WZn wZn = (C19439WZn) this.A03;
            long currentTimeMillis = System.currentTimeMillis();
            wZn.A06 = currentTimeMillis;
            wZn.A0E.A0M = Long.valueOf(currentTimeMillis);
            i = 866609642;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
        if (X.0qQ.A0K(r0.A0I.getSessionId(), r6.A05) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r17
            r9 = r16
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0063
            r0 = -1766909895(0xffffffff96af1839, float:-2.8288061E-25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.UXg r6 = (X.C15246UXg) r6
            r0 = 2010799412(0x77da5d34, float:8.857899E33)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            boolean r8 = r9.A05
            if (r8 == 0) goto L_0x0030
            java.lang.Object r7 = r9.A01
            X.Vah r7 = (X.C17589Vah) r7
            if (r7 == 0) goto L_0x0030
            boolean r3 = r9.A04
            r2 = 0
            r0 = 3886(0xf2e, float:5.445E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "dialog"
            X.VFY.A00(r7, r1, r0, r2, r3)
        L_0x0030:
            java.lang.Object r3 = r9.A03
            X.W01 r3 = (X.W01) r3
            boolean r1 = r9.A04
            java.lang.Object r0 = r9.A01
            X.Vah r0 = (X.C17589Vah) r0
            X.W01.A00(r0, r6, r3, r1, r8)
            android.content.Context r2 = r3.A00
            com.instagram.common.session.UserSession r1 = r3.A02
            X.1Xj r0 = r3.A03
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C49102EpR.A00(r2, r1, r0)
            X.1Ng r2 = r3.A01
            X.3uh r1 = r3.A04
            X.WQ9 r0 = new X.WQ9
            r0.<init>(r1)
            r2.A05(r0)
            r0 = -990970561(0xffffffffc4eefd3f, float:-1911.914)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -624495806(0xffffffffdac6f342, float:-2.79997551E16)
        L_0x005f:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0063:
            r0 = 248677391(0xed2840f, float:5.1896165E-30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.3mF r6 = (X.C250903mF) r6
            r0 = -1968327701(0xffffffff8aadb3eb, float:-1.6726972E-32)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r9.A02
            java.util.UUID r0 = (java.util.UUID) r0
            r6.A08 = r0
            boolean r8 = r9.A04
            java.lang.String r3 = "Required value was null."
            if (r8 != 0) goto L_0x01bb
            java.lang.Object r0 = r9.A01
            X.3Ce r0 = (X.C238523Ce) r0
            r6.A00 = r0
            java.lang.Object r0 = r9.A03
            X.WZn r0 = (X.C19439WZn) r0
            X.3CP r2 = r0.A09
            if (r2 == 0) goto L_0x01dd
            boolean r1 = r9.A05
            java.lang.Integer r1 = r2.A02(r1)
            r6.A02 = r1
        L_0x0095:
            java.lang.Integer r1 = r6.A02
            r0.A0A = r1
            X.3mF r1 = r0.A08
            if (r1 != 0) goto L_0x009f
            r0.A08 = r6
        L_0x009f:
            boolean r9 = r9.A05
            java.lang.String r7 = "ReelAdsAndNetegoController#onSuccess"
            if (r8 != 0) goto L_0x00b4
            X.3kK r1 = r0.A0I
            java.lang.String r2 = r1.getSessionId()
            java.lang.String r1 = r6.A05
            boolean r1 = X.0qQ.A0K(r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x00b5
        L_0x00b4:
            r2 = 1
        L_0x00b5:
            boolean r1 = r0.A0J
            if (r1 != 0) goto L_0x013f
            if (r2 != 0) goto L_0x013f
            X.3CP r8 = r0.A09
            if (r8 == 0) goto L_0x01d7
            int r12 = r6.mStatusCode
            long r13 = java.lang.System.currentTimeMillis()
            long r1 = r0.A06
            long r13 = r13 - r1
            X.2vI r9 = r8.A0H
            X.0sn r11 = X.0sn.A00
            boolean r15 = r8.A07
            X.4LN r10 = X.AnonymousClass4LN.A0D
            r9.Ch2(r10, r11, r12, r13, r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "viewerSource: "
            r2.append(r1)
            X.3BQ r1 = r0.A0G
            java.lang.String r1 = r1.A00
            r2.append(r1)
            java.lang.String r1 = " || viewerSessionId: "
            r2.append(r1)
            X.3kK r1 = r0.A0I
            java.lang.String r1 = r1.getSessionId()
            r2.append(r1)
            java.lang.String r1 = " || Response viewer session id: "
            r2.append(r1)
            java.lang.String r1 = r6.A05
            r2.append(r1)
            java.lang.String r1 = "|| nextAdAndNetegoRequestIndex: "
            r2.append(r1)
            int r1 = r0.A02
            r2.append(r1)
            java.lang.String r1 = "|| adsPoolThreshold: "
            r2.append(r1)
            int r1 = r0.A00
            r2.append(r1)
            java.lang.String r1 = "|| earliestRequestPosition: "
            r2.append(r1)
            int r1 = r0.A01
            java.lang.String r1 = X.Pxe.A0z(r2, r1)
            X.0wb.A03(r7, r1)
        L_0x011e:
            X.1P0 r1 = r0.A07
            r1.onSuccess(r6)
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x0134
            X.3CP r2 = r0.A09
            if (r2 == 0) goto L_0x01ce
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A03 = r1
            X.1P0 r0 = r0.A07
            r0.onFinish()
        L_0x0134:
            r0 = 1203945129(0x47c2bea9, float:99709.32)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 669740426(0x27eb6d8a, float:6.5344365E-15)
            goto L_0x005f
        L_0x013f:
            int r1 = r0.A02
            r0.A03 = r1
            if (r8 == 0) goto L_0x0149
            boolean r1 = r0.A0L
            if (r1 != 0) goto L_0x018e
        L_0x0149:
            com.instagram.common.session.UserSession r10 = r0.A0D
            X.0Tu r7 = X.0Tu.A05
            r1 = 36310542579073151(0x81003f0007007f, double:3.026271565600574E-306)
            boolean r1 = X.182.A06(r7, r10, r1)
            if (r1 != 0) goto L_0x018e
            X.4dB r7 = X.C19439WZn.A00(r6, r0, r8, r9)
            int r2 = r0.A04
            java.lang.Integer r1 = r6.A02(r2)
            int r1 = r1.intValue()
            r0.A02 = r1
            java.lang.Integer r1 = r6.A01(r2)
            int r1 = r1.intValue()
            r0.A01 = r1
            java.lang.Integer r1 = r6.A00()
            int r1 = r1.intValue()
            r0.A00 = r1
        L_0x017c:
            com.instagram.common.session.UserSession r8 = r0.A0D
            X.2mN r2 = r0.A0H
            int r1 = r0.A01
            if (r7 != 0) goto L_0x01b3
            java.lang.String r0 = "deliveryOutcome"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x018e:
            int r2 = r0.A04
            java.lang.Integer r1 = r6.A02(r2)
            int r1 = r1.intValue()
            r0.A02 = r1
            java.lang.Integer r1 = r6.A01(r2)
            int r1 = r1.intValue()
            r0.A01 = r1
            java.lang.Integer r1 = r6.A00()
            int r1 = r1.intValue()
            r0.A00 = r1
            X.4dB r7 = X.C19439WZn.A00(r6, r0, r8, r9)
            goto L_0x017c
        L_0x01b3:
            int r1 = X.C291225go.A00(r8, r2, r7, r1)
            r0.A01 = r1
            goto L_0x011e
        L_0x01bb:
            java.lang.Object r0 = r9.A03
            X.WZn r0 = (X.C19439WZn) r0
            X.3kK r1 = r0.A0I
            java.lang.String r7 = r1.getSessionId()
            int r2 = r0.A04
            int r1 = r0.A0B
            r6.A04(r7, r2, r1)
            goto L_0x0095
        L_0x01ce:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            r0 = -1739803850(0xffffffff984cb336, float:-2.645686E-24)
            goto L_0x01e5
        L_0x01d7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            throw r1
        L_0x01dd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            r0 = -2026887252(0xffffffff873027ac, float:-1.3252427E-34)
        L_0x01e5:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15617Ufj.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Collection<AnonymousClass3HX> emptyList;
        if (this.A00 != 0) {
            C15617Ufj.super.onSuccessInBackground(obj);
            return;
        }
        int A032 = AnonymousClass0fD.A03(-532425632);
        C250903mF r12 = (C250903mF) obj;
        int A0D = AnonymousClass7TG.A0D(r12, -1359496671);
        C19439WZn wZn = (C19439WZn) this.A03;
        wZn.A05 = System.currentTimeMillis();
        UserSession userSession = wZn.A0D;
        if (r12.A03(userSession) != null) {
            emptyList = r12.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        for (AnonymousClass3HX r0 : emptyList) {
            0qQ.A0A(r0);
            Iterator it = AnonymousClass3P9.A05(r0).iterator();
            while (it.hasNext()) {
                1Xj A0t = C51966G9m.A0t(it);
                Context context = wZn.A0C;
                ExtendedImageUrl A1n = A0t.A1n(context);
                C297715sD.A00(context, userSession, A0t, "");
                if (A1n != null) {
                    1OO A0J = 1NK.A00().A0J(A1n, wZn.A0F.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
                if (A0t.CeS() && (!A0t.A5D() || (A0t = A0t.A1c(A0t.A0w())) != null)) {
                    A0t.CEL();
                    C255593uO.A00(userSession).A01(new C256203vO(A0t.CEL(), wZn.A0F.getModuleName()));
                }
            }
        }
        AnonymousClass0fD.A0A(-290426827, A0D);
        AnonymousClass0fD.A0A(-1938525585, A032);
    }
}
