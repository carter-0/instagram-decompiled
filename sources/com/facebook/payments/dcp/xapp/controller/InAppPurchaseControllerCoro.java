package com.facebook.payments.dcp.xapp.controller;

import X.0KC;
import X.0Tu;
import X.0Yt;
import X.0Yv;
import X.0qQ;
import X.0se;
import X.0sm;
import X.0sn;
import X.0xY;
import X.182;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10162Rnd;
import X.C10300Rpy;
import X.C10657Rvr;
import X.C10945S2c;
import X.C11230SGo;
import X.C11266SId;
import X.C11826ShC;
import X.C11828ShE;
import X.C11829ShG;
import X.C11834ShL;
import X.C12177SoS;
import X.C12178SoT;
import X.C12179SoU;
import X.C12187Soc;
import X.C12188Sod;
import X.C13348TVv;
import X.C13526Tbv;
import X.C13560TcZ;
import X.C13561Tca;
import X.C13562Tcb;
import X.C13713Tfb;
import X.C13851TiU;
import X.C13888TjB;
import X.C241503Pl;
import X.C262224Cq;
import X.C2818159r;
import X.C47862EKi;
import X.C51965G9l;
import X.C51971G9r;
import X.C51975G9x;
import X.C53394GnR;
import X.C58790Ixb;
import X.C61046Jvk;
import X.C61073JwB;
import X.C62701Kl1;
import X.C66582MXn;
import X.C7610QOs;
import X.C8913RFg;
import X.C8918RFl;
import X.C9010RLe;
import X.DbS;
import X.DbT;
import X.JTQ;
import X.JTT;
import X.LCD;
import X.Pxe;
import X.QP6;
import X.QYF;
import X.QYG;
import X.QYH;
import X.QYI;
import X.RGW;
import X.RH0;
import X.RRR;
import X.RWE;
import X.S1B;
import X.S1C;
import X.S1E;
import X.S74;
import X.SHQ;
import X.SKS;
import X.SPQ;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class InAppPurchaseControllerCoro implements C13526Tbv {
    public C7610QOs A00;
    public C13713Tfb A01;
    public C10300Rpy A02;
    public WeakReference A03;
    public List A04;
    public Map A05 = 0Yt.A0E();
    public final SPQ A06;
    public final S1B A07;
    public final S1C A08;
    public final C9010RLe A09;
    public final C62701Kl1 A0A;
    public final C11266SId A0B;
    public final LCD A0C;
    public final SHQ A0D;
    public final C262224Cq A0E;

    public /* synthetic */ InAppPurchaseControllerCoro(SPQ spq, S1B s1b, S1C s1c, C9010RLe rLe, C62701Kl1 kl1, LCD lcd, SHQ shq, C262224Cq r9) {
        0qQ.A0B(shq, 4);
        this.A06 = spq;
        this.A0C = lcd;
        this.A0D = shq;
        this.A08 = s1c;
        this.A07 = s1b;
        this.A09 = rLe;
        this.A0A = kl1;
        this.A0B = new C11266SId(spq, rLe, lcd);
        this.A0E = r9;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.S2c, java.lang.Object] */
    public static C10945S2c A00(Purchase purchase, Number number) {
        String A022 = purchase.A02();
        0qQ.A07(A022);
        int intValue = number.intValue();
        ? obj = new Object();
        obj.A00 = 0;
        obj.A01 = 0;
        obj.A02 = A022;
        obj.A00 = intValue;
        C10657Rvr A002 = obj.A00();
        ? obj2 = new Object();
        obj2.A00 = 0;
        obj2.A01 = 0;
        obj2.A02 = A002.A02;
        obj2.A00 = A002.A00;
        obj2.A01 = A002.A01;
        obj2.A03 = A002.A03;
        return obj2;
    }

    public static final List A03(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            if (((Purchase) next).A02.optInt("purchaseState", 1) != 4) {
                A0q.add(next);
            }
        }
        return A0q;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.S06] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.S06] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r14.isEmpty() != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r14.isEmpty() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.C13560TcZ r12, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r13, java.util.List r14, java.util.List r15, java.util.Map r16) {
        /*
            r3 = 0
            r11 = r13
            X.SId r4 = r13.A0B
            X.TiU r1 = r4.A02
            r10 = r12
            r12 = r16
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "fff"
            X.SGo r0 = r1.CTR(r0)
            int r0 = r0.A00
            if (r0 != 0) goto L_0x00c1
            r2 = 0
            if (r14 == 0) goto L_0x001f
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r9 = r0 ^ 1
            if (r15 == 0) goto L_0x002a
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            r8 = r2 ^ 1
            if (r14 == 0) goto L_0x0055
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r14)
            java.util.Iterator r6 = r14.iterator()
        L_0x0037:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.String r2 = X.AnonymousClass7TE.A18(r6)
            java.lang.String r1 = "inapp"
            if (r2 == 0) goto L_0x004e
            X.Rqu r0 = new X.Rqu
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x0037
        L_0x004e:
            java.lang.String r0 = "Product id must be provided."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0055:
            X.0sn r7 = X.0sn.A00
        L_0x0057:
            if (r15 == 0) goto L_0x0080
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r15)
            java.util.Iterator r5 = r15.iterator()
        L_0x0061:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = X.AnonymousClass7TE.A18(r5)
            java.lang.String r1 = "subs"
            if (r2 == 0) goto L_0x0079
            X.Rqu r0 = new X.Rqu
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x0061
        L_0x0079:
            java.lang.String r0 = "Product id must be provided."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0080:
            X.0sn r6 = X.0sn.A00
        L_0x0082:
            X.S06 r0 = new X.S06
            r0.<init>()
            if (r8 == 0) goto L_0x00bd
            r0.A00(r6)
        L_0x008c:
            X.Rnc r2 = new X.Rnc
            r2.<init>(r0)
            if (r9 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00bb
            X.S06 r1 = new X.S06
            r1.<init>()
            r1.A00(r7)
            X.Rnc r0 = new X.Rnc
            r0.<init>(r1)
        L_0x00a2:
            X.0eP r1 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.Object r0 = r1.A00
            X.Rnc r0 = (X.C10161Rnc) r0
            java.lang.Object r8 = r1.A01
            X.Rnc r8 = (X.C10161Rnc) r8
            X.TiU r9 = r4.A02
            if (r9 == 0) goto L_0x00f1
            X.ShI r7 = new X.ShI
            r7.<init>(r8, r9, r10, r11, r12)
            r9.E5p(r7, r0, r3)
            return
        L_0x00bb:
            r0 = 0
            goto L_0x00a2
        L_0x00bd:
            r0.A00(r7)
            goto L_0x008c
        L_0x00c1:
            r2 = 0
            if (r14 == 0) goto L_0x00cb
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            r1 = r0 ^ 1
            if (r15 == 0) goto L_0x00d6
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x00d7
        L_0x00d6:
            r2 = 1
        L_0x00d7:
            r0 = r2 ^ 1
            X.0eP r1 = X.S95.A01(r14, r15, r1, r0)
            java.lang.Object r0 = r1.A00
            X.Rqv r0 = (X.C10358Rqv) r0
            java.lang.Object r8 = r1.A01
            X.Rqv r8 = (X.C10358Rqv) r8
            X.TiU r9 = r4.A02
            if (r9 == 0) goto L_0x00f1
            X.ShP r7 = new X.ShP
            r7.<init>(r8, r9, r10, r11, r12)
            r9.E5s(r0, r7, r3)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0A(X.TcZ, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.util.List, java.util.List, java.util.Map):void");
    }

    public final void A0G(Context context, C61046Jvk jvk, C13561Tca tca) {
        C13851TiU soT;
        C8918RFl rFl;
        C11266SId sId = this.A0B;
        C13348TVv tVv = new C13348TVv(this, 27);
        C13348TVv tVv2 = new C13348TVv(this, 28);
        Context context2 = context;
        sId.A00 = context;
        C13561Tca tca2 = tca;
        sId.A03 = tca2;
        C9010RLe rLe = sId.A06;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(RH0.A0b, String.valueOf(false));
        A1H.put(RH0.A0Z, String.valueOf(true));
        C61046Jvk jvk2 = jvk;
        if (sId.A01()) {
            if (!0qQ.A0K(sId.A01, jvk2)) {
                tVv2.invoke();
                SPQ spq = sId.A05;
                String str = jvk2.A00;
                0qQ.A0B(str, 0);
                C12177SoS soS = (C12177SoS) spq.A00;
                soS.A00 = C2818159r.A01();
                soS.A01 = str;
                sId.A01 = jvk2;
            }
            rFl = C8918RFl.SUCCESSFUL;
        } else {
            SPQ spq2 = sId.A05;
            String str2 = jvk2.A00;
            0qQ.A0B(str2, 0);
            C12177SoS soS2 = (C12177SoS) spq2.A00;
            soS2.A00 = C2818159r.A01();
            soS2.A01 = str2;
            sId.A01 = jvk2;
            UserSession userSession = ((QYF) rLe).A00;
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, userSession, 36322113220519889L)) {
                SKS.A01("DCP not enabled for the user country", AnonymousClass7TE.A1H());
                rFl = C8918RFl.DCP_NOT_ENABLED_FOR_COUNTRY;
            } else {
                if (182.A06(r7, userSession, 36322113220716500L)) {
                    soT = new C12179SoU(context, C11266SId.A08, this, spq2);
                } else {
                    soT = new C12178SoT(context2, C11266SId.A08, this, spq2, rLe);
                }
                sId.A02 = soT;
                if (EndToEnd.isRunningEndToEndTest()) {
                    sId.A04 = true;
                    tca2.Djb(C8918RFl.SUCCESSFUL);
                    return;
                }
                C13851TiU tiU = sId.A02;
                if (tiU != null) {
                    tiU.Ewn(new C11828ShE(1, tVv, sId), false);
                    return;
                }
                return;
            }
        }
        0KC.A0C("DCP", AnonymousClass7TG.A0m(rFl, "Setup complete: ", C51975G9x.A0l(rFl)));
        C13561Tca tca3 = sId.A03;
        if (tca3 != null) {
            tca3.Djb(rFl);
        }
    }

    public final void A0H(S1E s1e, List list, List list2, Map map) {
        LinkedHashMap linkedHashMap;
        Map map2;
        C61073JwB jwB;
        if (list.isEmpty()) {
            this.A06.A06(C8918RFl.CONSUME_SKIPPED, (String) null, (Map) null);
            return;
        }
        C11266SId sId = this.A0B;
        S1E s1e2 = s1e;
        if (!sId.A01()) {
            if (s1e != null) {
                A0E(s1e2.A00, C8918RFl.CONSUME_FAILURE);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A06.A06(C8918RFl.BILLING_CLIENT_DISCONNECTED, ((Purchase) it.next()).A01(), (Map) null);
            }
            return;
        }
        if (list2 != null) {
            linkedHashMap = DbS.A0x(JTT.A08(list2));
            for (Object next : list2) {
                linkedHashMap.put(((C61073JwB) next).A03, next);
            }
        } else {
            linkedHashMap = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            Map map3 = map;
            if (map != null) {
                map2 = (Map) map3.get(purchase.A02());
            } else {
                map2 = null;
            }
            SPQ spq = this.A06;
            String A012 = purchase.A01();
            Map map4 = map2;
            if (map2 == null) {
                map4 = 0Yt.A0E();
            }
            LinkedHashMap A032 = 0Yt.A03(map4);
            if (A012 != null) {
                Pxe.A1U(RH0.A0V, A012, A032);
            }
            spq.A00.Cgp(A032, (Map) null, "client_create_dcp_external_confirm_init");
            if (linkedHashMap == null || (jwB = (C61073JwB) linkedHashMap.get(purchase.A01())) == null) {
                spq.A03((C11230SGo) null, (String) null, purchase.A01(), map2);
                if (s1e != null) {
                    A0E(s1e2.A00, C8918RFl.CONSUME_FAILURE);
                }
            } else {
                C61073JwB jwB2 = jwB;
                C58790Ixb ixb = new C58790Ixb(4, purchase, jwB2, map2, s1e2, this);
                if (!0qQ.A0K(jwB.A02, RGW.AUTO_RENEW_SUBSCRIPTION.toString())) {
                    C13851TiU tiU = sId.A02;
                    if (tiU != null) {
                        String A022 = purchase.A02();
                        0qQ.A07(A022);
                        tiU.AJT(new C11829ShG(ixb), A022, false);
                    }
                } else if (!purchase.A02.optBoolean("acknowledged", true)) {
                    C13851TiU tiU2 = sId.A02;
                    if (tiU2 != null) {
                        String A023 = purchase.A02();
                        0qQ.A07(A023);
                        tiU2.A79(new C11826ShC(ixb), A023, false);
                    }
                } else {
                    spq.A06(C8918RFl.CONSUME_SKIPPED, purchase.A01(), map2);
                    if (s1e != null) {
                        s1e2.A00(jwB);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.Rqv] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.S06] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0137, code lost:
        if (r14.length() != 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (com.facebook.endtoend.EndToEnd.isRunningEndToEndTest() != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C7610QOs r22, java.util.Map r23) {
        /*
            r21 = this;
            r4 = 0
            r5 = r22
            r3 = r23
            boolean r7 = X.AnonymousClass7TF.A1U(r4, r5, r3)
            r1 = r21
            X.SId r6 = r1.A0B
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0086
            java.lang.ref.WeakReference r0 = r1.A03
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0029
            X.RLe r2 = r1.A09
            r0 = 2
            X.0qQ.A0B(r2, r0)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0086
        L_0x0029:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r3)
            X.RH0 r0 = X.RH0.A0a
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "true"
            r6.put(r2, r0)
            X.SPQ r0 = r1.A06
            X.TjB r3 = r0.A00
            java.lang.String r2 = "client_create_dcppayment_init"
            r0 = 0
            r3.Cgp(r6, r0, r2)
            java.lang.ref.WeakReference r0 = r1.A03
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x0085
            X.S1D r3 = new X.S1D
            r3.<init>(r1, r6)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r0 = 2131957465(0x7f1316d9, float:1.9551515E38)
            android.app.AlertDialog$Builder r2 = r1.setMessage(r0)
            r1 = 2131958476(0x7f131acc, float:1.9553565E38)
            X.SV1 r0 = new X.SV1
            r0.<init>(r4, r5, r3)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r1, r0)
            r1 = 2131958471(0x7f131ac7, float:1.9553555E38)
            X.SV8 r0 = X.SV8.A00
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r1, r0)
            r1 = 2
            X.SUw r0 = new X.SUw
            r0.<init>(r3, r1)
            android.app.AlertDialog$Builder r0 = r2.setOnCancelListener(r0)
            android.app.AlertDialog r0 = r0.create()
            X.AnonymousClass0fN.A00(r0)
        L_0x0085:
            return
        L_0x0086:
            X.SPQ r0 = r1.A06
            X.TjB r2 = r0.A00
            java.lang.String r8 = "client_create_dcppayment_init"
            r0 = 0
            r2.Cgp(r3, r0, r8)
            boolean r8 = r6.A01()
            if (r8 != 0) goto L_0x00ab
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.lang.String r3 = "Payments are not enabled"
            X.SKS.A01(r3, r4)
            java.lang.String r3 = "client_create_dcppayment_fail"
            r2.Cgp(r4, r0, r3)
            X.RFl r0 = X.C8918RFl.IAB_INIT_FAILED
        L_0x00a7:
            A0E(r1, r0)
            return
        L_0x00ab:
            X.SHQ r10 = r1.A0D
            X.RF1 r8 = r5.A05
            java.lang.String r15 = r8.A00
            java.lang.String r8 = r5.A02
            java.util.List r17 = X.AnonymousClass7TE.A1I(r8)
            java.lang.String r9 = r5.A08
            X.0qQ.A0B(r15, r4)
            X.1aS r8 = X.SHQ.A00(r10, r15)
            X.RFg r14 = X.C8913RFg.IN_PROGRESS
            r20 = 112(0x70, float:1.57E-43)
            X.QP6 r13 = new X.QP6
            r19 = r0
            r18 = r0
            r16 = r9
            r13.<init>((X.C8913RFg) r14, (java.lang.String) r15, (java.lang.String) r16, (java.util.List) r17, (java.util.List) r18, (java.util.List) r19, (int) r20)
            r8.accept(r13)
            X.LCD r8 = r1.A0C
            X.90R r8 = r8.A00()
            X.0xa r8 = r8.A00
            X.0xY r9 = r8.AR4()
            java.lang.String r8 = "ig_in_app_purchases_synchronization_required"
            r9.E5T(r8, r7)
            r9.apply()
            java.lang.String r11 = r5.A02
            java.lang.String r8 = r5.A04
            X.S1C r7 = r1.A08
            com.android.billingclient.api.SkuDetails r16 = r7.A00(r11)
            java.lang.String r12 = r5.A01
            java.lang.Integer r7 = r5.A00
            X.0rm r9 = X.C51965G9l.A11()
            if (r12 == 0) goto L_0x0193
            int r10 = r12.length()
            if (r10 == 0) goto L_0x0193
            java.util.List r10 = r1.A04
            if (r10 == 0) goto L_0x0191
            java.util.Iterator r14 = r10.iterator()
        L_0x0108:
            boolean r10 = r14.hasNext()
            if (r10 == 0) goto L_0x0248
            java.lang.Object r13 = r14.next()
            com.android.billingclient.api.Purchase r13 = (com.android.billingclient.api.Purchase) r13
            java.lang.String r10 = X.RWF.A00(r13)
            boolean r10 = X.0qQ.A0K(r10, r12)
            if (r10 == 0) goto L_0x0108
        L_0x011e:
            r9.A00 = r13
            if (r13 == 0) goto L_0x0139
            org.json.JSONObject r13 = r13.A02
            java.lang.String r10 = "obfuscatedAccountId"
            java.lang.String r14 = r13.optString(r10)
            java.lang.String r10 = "obfuscatedProfileId"
            r13.optString(r10)
            if (r14 == 0) goto L_0x0139
            int r10 = r14.length()
            if (r10 != 0) goto L_0x0193
        L_0x0139:
            java.lang.String r8 = r5.A02
            java.lang.Object r5 = r9.A00
            com.android.billingclient.api.Purchase r5 = (com.android.billingclient.api.Purchase) r5
            X.0qQ.A0B(r8, r4)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r3)
            if (r5 != 0) goto L_0x0161
            java.lang.String r3 = "No previous purchase found"
        L_0x014b:
            X.SKS.A01(r3, r10)
            X.RH0 r3 = X.RH0.A0U
            X.Pxe.A1U(r3, r8, r10)
            X.RH0 r3 = X.RH0.A0f
            X.Pxe.A1U(r3, r12, r10)
            java.lang.String r3 = "client_create_dcppayment_fail"
            r2.Cgp(r10, r0, r3)
            X.RFl r0 = X.C8918RFl.USER_PAYMENT_FAILED
            goto L_0x00a7
        L_0x0161:
            org.json.JSONObject r9 = r5.A02
            java.lang.String r4 = "obfuscatedAccountId"
            java.lang.String r3 = r9.optString(r4)
            java.lang.String r7 = "obfuscatedProfileId"
            r9.optString(r7)
            if (r3 == 0) goto L_0x018e
            r6 = 0
            int r3 = r3.length()
            if (r3 == 0) goto L_0x018e
            java.lang.String r5 = "Xgrade failed for previous purchase "
            java.lang.String r4 = r9.optString(r4)
            java.lang.String r3 = r9.optString(r7)
            if (r4 != 0) goto L_0x018c
            if (r3 != 0) goto L_0x018c
        L_0x0187:
            java.lang.String r3 = X.002.A0R(r5, r6)
            goto L_0x014b
        L_0x018c:
            r6 = r4
            goto L_0x0187
        L_0x018e:
            java.lang.String r3 = "No original quoteId found"
            goto L_0x014b
        L_0x0191:
            r13 = r0
            goto L_0x011e
        L_0x0193:
            X.TiU r2 = r6.A02
            if (r2 == 0) goto L_0x020d
            java.lang.String r0 = "fff"
            X.SGo r0 = r2.CTR(r0)
            int r0 = r0.A00
            if (r0 != 0) goto L_0x020d
            java.lang.Object r13 = r9.A00
            com.android.billingclient.api.Purchase r13 = (com.android.billingclient.api.Purchase) r13
            java.lang.String r9 = r5.A03
            X.S1B r0 = r1.A07
            X.RRR r2 = r0.A00(r11)
            if (r2 == 0) goto L_0x01d5
            boolean r0 = r2 instanceof X.QYI
            if (r0 == 0) goto L_0x01cb
            r0 = r2
            X.QYI r0 = (X.QYI) r0
            X.S74 r0 = r0.A01
        L_0x01b8:
            if (r0 == 0) goto L_0x01d5
            java.lang.String r9 = r2.A06(r9)
            java.lang.ref.WeakReference r0 = r1.A03
            android.app.Activity r3 = X.Pxg.A0K(r0)
            r4 = r13
            r5 = r1
            r6 = r2
            A05(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x01cb:
            boolean r0 = r2 instanceof X.QYH
            if (r0 != 0) goto L_0x01d5
            r0 = r2
            X.QYG r0 = (X.QYG) r0
            X.S74 r0 = r0.A00
            goto L_0x01b8
        L_0x01d5:
            X.0qQ.A0B(r11, r4)
            java.lang.String r0 = "first_party"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0253
            X.Rqu r0 = new X.Rqu
            r0.<init>(r11, r15)
            X.S06 r5 = new X.S06
            r5.<init>()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r5.A00(r0)
            X.Rnc r2 = new X.Rnc
            r2.<init>(r5)
            X.TiU r0 = r6.A02
            if (r0 == 0) goto L_0x0085
            X.ShJ r12 = new X.ShJ
            r19 = r3
            r14 = r1
            r15 = r7
            r16 = r11
            r17 = r9
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.E5p(r12, r2, r4)
            return
        L_0x020d:
            if (r16 == 0) goto L_0x0224
            java.lang.ref.WeakReference r0 = r1.A03
            android.app.Activity r14 = X.Pxg.A0K(r0)
            java.lang.Object r0 = r9.A00
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            r15 = r0
            r17 = r1
            r18 = r7
            r19 = r8
            A04(r14, r15, r16, r17, r18, r19)
            return
        L_0x0224:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            X.TiU r5 = r6.A02
            if (r5 == 0) goto L_0x0085
            X.Rqv r2 = new X.Rqv
            r2.<init>()
            r2.A00 = r15
            r2.A01 = r0
            X.ShO r0 = new X.ShO
            r10 = r0
            r11 = r1
            r12 = r7
            r13 = r8
            r14 = r3
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r5.E5s(r2, r0, r4)
            return
        L_0x0248:
            r0 = 3
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x0253:
            java.lang.String r0 = "Serialized doc id must be provided for first party products."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0I(X.QOs, java.util.Map):void");
    }

    public final void A0K(List list) {
        List list2 = list;
        ArrayList A0q = AnonymousClass7TF.A0q(list2, 0);
        for (Object next : list2) {
            if (((Purchase) next).A01() != null) {
                A0q.add(next);
            }
        }
        SPQ spq = this.A06;
        C11266SId sId = this.A0B;
        String A002 = sId.A00();
        S1C s1c = this.A08;
        LinkedHashMap A022 = spq.A02(s1c, A002, A0q, true);
        Iterator A0v = AnonymousClass7TF.A0v(A022);
        while (A0v.hasNext()) {
            spq.A00.Cgp((Map) A0v.next(), (Map) null, "client_verify_dcppayment_init");
        }
        this.A0D.A01(this.A07, s1c, new C12188Sod(this, A0q, list2, A022), sId.A00(), ((C12177SoS) spq.A00).A00, (String) null, A0q);
    }

    public final void A0L(List list, boolean z) {
        String str;
        SPQ spq = this.A06;
        C11266SId sId = this.A0B;
        String A002 = sId.A00();
        S1C s1c = this.A08;
        List list2 = list;
        LinkedHashMap A022 = spq.A02(s1c, A002, list2, false);
        Iterator A0v = AnonymousClass7TF.A0v(A022);
        while (A0v.hasNext()) {
            spq.A00.Cgp((Map) A0v.next(), (Map) null, "client_verify_dcppayment_init");
        }
        SHQ shq = this.A0D;
        String A003 = sId.A00();
        String str2 = ((C12177SoS) spq.A00).A00;
        S1B s1b = this.A07;
        C7610QOs qOs = this.A00;
        if (qOs != null) {
            str = qOs.A08;
        } else {
            str = null;
        }
        shq.A01(s1b, s1c, new C12187Soc(this, list2, A022, z), A003, str2, str, list2);
    }

    public final void Db3(C11230SGo sGo, List list) {
        C8918RFl rFl;
        C11230SGo sGo2 = sGo;
        0qQ.A0B(sGo2, 0);
        SPQ spq = this.A06;
        C7610QOs qOs = this.A00;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List<Purchase> list2 = list;
        if (list != null) {
            for (Purchase purchase : list2) {
                String A022 = purchase.A02();
                LinkedHashMap A032 = 0Yt.A03(spq.A00.BiK(sGo2, purchase, false));
                if (qOs != null) {
                    A032.put(RH0.A0m.A00, (Object) null);
                }
                A1H.put(A022, A032);
            }
        }
        if (sGo2.A00 != 0 || list == null || list2.isEmpty()) {
            C7610QOs qOs2 = this.A00;
            int i = sGo2.A00;
            rFl = C8918RFl.USER_PAYMENT_FAILED;
            if (i == 0) {
                rFl = C8918RFl.SUCCESSFUL;
            } else if (i == 1) {
                rFl = C8918RFl.USER_CANCELLED_PAYMENT;
            } else if (i == 3) {
                rFl = C8918RFl.BILLING_UNAVAILABLE;
            } else if (i == 7) {
                rFl = C8918RFl.PENDING_PURCHASE_ON_SKU;
            }
            if (qOs2 != null) {
                SHQ shq = this.A0D;
                String A002 = this.A0B.A00();
                List A1I = AnonymousClass7TE.A1I(qOs2.A02);
                String str = qOs2.A08;
                0qQ.A0B(A002, 0);
                SHQ.A00(shq, A002).accept(new QP6(rFl, C8913RFg.FAILURE, A002, str, A1I, (List) null, (List) null));
            }
            if (A1H.isEmpty()) {
                LinkedHashMap A0y = C66582MXn.A0y("extra_error_message", "Received empty list of purchases from Google");
                if (qOs2 != null) {
                    String str2 = qOs2.A02;
                    String A003 = this.A0B.A00();
                    String str3 = qOs2.A07;
                    0sm r0 = qOs2.A09;
                    if (r0 == null) {
                        r0 = 0Yt.A0E();
                    }
                    AnonymousClass7TF.A1H(str2, A003);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(r0);
                    Pxe.A1U(RH0.A0U, str2, linkedHashMap);
                    Pxe.A1U(RH0.A0n, A003, linkedHashMap);
                    if (str3 != null) {
                        Pxe.A1U(RH0.A0k, str3, linkedHashMap);
                    }
                    linkedHashMap.put(RH0.A0c.A00, String.valueOf(false));
                    A0y.putAll(linkedHashMap);
                }
                spq.A04(sGo2, A0y);
            } else {
                Iterator A0s = AnonymousClass7TF.A0s(A1H);
                while (A0s.hasNext()) {
                    spq.A04(sGo2, (Map) C51971G9r.A0p(A0s));
                }
            }
        } else {
            C7610QOs qOs3 = this.A00;
            if (qOs3 != null) {
                for (Purchase purchase2 : list2) {
                    Map map = (Map) A1H.get(purchase2.A02());
                    if (purchase2.A02.optInt("purchaseState", 1) != 4) {
                        if (map != null) {
                            spq.A00.Cgp(map, (Map) null, "client_create_dcppayment_success");
                        }
                        C10300Rpy rpy = this.A02;
                        if (rpy != null) {
                            rpy.A00.FIG(C47862EKi.A00);
                        }
                    } else {
                        if (map != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                            SKS.A01("Transaction is still pending on google", linkedHashMap2);
                            spq.A00.Cgp(linkedHashMap2, (Map) null, "client_create_dcppayment_fail");
                        }
                        A0E(this, C8918RFl.PENDING_PURCHASE);
                    }
                }
                if (RWE.A00(qOs3.A02)) {
                    A0H((S1E) null, list2, (List) null, (Map) null);
                    SHQ shq2 = this.A0D;
                    String A004 = this.A0B.A00();
                    List A1I2 = AnonymousClass7TE.A1I(qOs3.A02);
                    String str4 = qOs3.A08;
                    rFl = C8918RFl.SERVER_VERIFICATION_FAILED;
                    AnonymousClass7TF.A1C(A004, 0, rFl);
                    SHQ.A00(shq2, A004).accept(new QP6(rFl, C8913RFg.FAILURE, A004, str4, A1I2, (List) null, (List) null));
                } else {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list2) {
                        if (((Purchase) next).A02.optInt("purchaseState", 1) != 4) {
                            A1C.add(next);
                        }
                    }
                    A0L(A1C, false);
                    return;
                }
            } else {
                return;
            }
        }
        A0E(this, rFl);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[LOOP:1: B:24:0x0089->B:26:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 14
            boolean r0 = X.C66146MDy.A02(r3, r9)
            if (r0 == 0) goto L_0x00cb
            r5 = r9
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cb
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 2
            r6 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r6) goto L_0x0070
            if (r1 != r3) goto L_0x00d2
            java.lang.Object r6 = r5.A01
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            X.0eS.A00(r0)
        L_0x002b:
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "purchase_history."
            java.lang.String r0 = X.002.A0R(r0, r1)
            r6.add(r0)
            goto L_0x002f
        L_0x004a:
            X.0eS.A00(r0)
            X.SId r0 = r7.A0B
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0058
            X.0sn r6 = X.0sn.A00
        L_0x0057:
            return r6
        L_0x0058:
            X.SPQ r0 = r7.A06
            X.TjB r2 = r0.A00
            java.lang.String r1 = "client_load_iap_store_purchases_init"
            r0 = 0
            r2.Cgp(r0, r0, r1)
            r5.A01 = r7
            r5.A02 = r8
            r5.A00 = r6
            r0 = 0
            java.lang.Object r0 = A02(r7, r8, r5, r0)
            if (r0 != r4) goto L_0x007b
            return r4
        L_0x0070:
            java.lang.Object r8 = r5.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r5.A01
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r7 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r7
            X.0eS.A00(r0)
        L_0x007b:
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0089:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            java.lang.String r0 = X.RWF.A00(r0)
            r2.add(r0)
            goto L_0x0089
        L_0x009d:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r2)
            X.SId r1 = r7.A0B
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0057
            r5.A01 = r6
            r0 = 0
            r5.A02 = r0
            r5.A00 = r3
            X.TiU r3 = r1.A02
            if (r3 == 0) goto L_0x00c8
            X.3Pl r2 = X.JTQ.A0m(r5)
            X.ShK r1 = new X.ShK
            r1.<init>(r2)
            r0 = 0
            r3.E5q(r1, r8, r0)
            java.lang.Object r0 = r2.A00()
        L_0x00c5:
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x00c8:
            X.0sn r0 = X.0sn.A00
            goto L_0x00c5
        L_0x00cb:
            X.MDy r5 = new X.MDy
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A01(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.SGo] */
    public static final Object A02(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, String str, AnonymousClass4D7 r6, boolean z) {
        C13851TiU tiU = inAppPurchaseControllerCoro.A0B.A02;
        if (tiU == null) {
            ? obj = new Object();
            obj.A00 = 2;
            obj.A01 = "";
            return AnonymousClass7TE.A1L(obj, 0sn.A00);
        } else if (str != null) {
            C10162Rnd rnd = new C10162Rnd(str);
            C241503Pl A0m = JTQ.A0m(r6);
            tiU.E5r(new C11834ShL(inAppPurchaseControllerCoro, A0m), rnd, z);
            return A0m.A00();
        } else {
            throw AnonymousClass7TE.A0w("Product type must be set");
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.S2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.Rxl] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.app.Activity r17, com.android.billingclient.api.Purchase r18, com.android.billingclient.api.SkuDetails r19, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r20, java.lang.Integer r21, java.lang.String r22) {
        /*
            if (r17 == 0) goto L_0x0134
            r16 = 0
            r7 = 0
            r2 = 0
            r4 = 0
            X.S2c r6 = new X.S2c
            r6.<init>()
            r11 = 0
            r6.A00 = r11
            r6.A01 = r11
            r1 = 1
            r6.A04 = r1
            r9 = r18
            if (r18 == 0) goto L_0x00a7
            r8 = r21
            if (r21 == 0) goto L_0x00a7
            org.json.JSONObject r5 = r9.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r3 = r5.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r0 = r5.optString(r0)
            if (r3 != 0) goto L_0x0031
            if (r0 != 0) goto L_0x0031
            r3 = 0
        L_0x0031:
            X.S2c r6 = A00(r9, r8)
        L_0x0035:
            if (r22 == 0) goto L_0x0039
            r7 = r22
        L_0x0039:
            if (r3 == 0) goto L_0x003d
            r16 = r3
        L_0x003d:
            if (r19 == 0) goto L_0x0043
            java.util.ArrayList r4 = X.DbV.A14(r19)
        L_0x0043:
            r5 = r20
            X.SId r0 = r5.A0B
            X.TiU r3 = r0.A02
            if (r3 == 0) goto L_0x0134
            r8 = 1
            if (r4 == 0) goto L_0x012d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x012d
            java.lang.String r14 = "play_pass_subs"
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x0126
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x00e6
            java.lang.Object r0 = r4.get(r11)
            com.android.billingclient.api.SkuDetails r0 = (com.android.billingclient.api.SkuDetails) r0
            org.json.JSONObject r2 = r0.A00
            java.lang.String r13 = "type"
            java.lang.String r12 = r2.optString(r13)
            int r9 = r4.size()
            r1 = 0
        L_0x0077:
            if (r1 >= r9) goto L_0x00aa
            java.lang.Object r10 = r4.get(r1)
            com.android.billingclient.api.SkuDetails r10 = (com.android.billingclient.api.SkuDetails) r10
            boolean r0 = r12.equals(r14)
            if (r0 != 0) goto L_0x00a4
            org.json.JSONObject r0 = r10.A00
            java.lang.String r0 = r0.optString(r13)
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00a4
            org.json.JSONObject r0 = r10.A00
            java.lang.String r0 = r0.optString(r13)
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "SKUs should have the same type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00a4:
            int r1 = r1 + 1
            goto L_0x0077
        L_0x00a7:
            r3 = r22
            goto L_0x0035
        L_0x00aa:
            java.lang.String r10 = "packageName"
            java.lang.String r9 = r2.optString(r10)
            int r2 = r4.size()
            r1 = 0
        L_0x00b6:
            if (r1 >= r2) goto L_0x00e6
            java.lang.Object r15 = r4.get(r1)
            com.android.billingclient.api.SkuDetails r15 = (com.android.billingclient.api.SkuDetails) r15
            boolean r0 = r12.equals(r14)
            if (r0 != 0) goto L_0x00e3
            org.json.JSONObject r0 = r15.A00
            java.lang.String r0 = r0.optString(r13)
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00e3
            org.json.JSONObject r0 = r15.A00
            java.lang.String r0 = r0.optString(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "All SKUs must have the same package name."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00e3:
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00e6:
            X.Rxl r2 = new X.Rxl
            r2.<init>()
            java.lang.Object r0 = r4.get(r11)
            com.android.billingclient.api.SkuDetails r0 = (com.android.billingclient.api.SkuDetails) r0
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "packageName"
            java.lang.String r0 = r1.optString(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0101
            r8 = 0
        L_0x0101:
            r2.A05 = r8
            r0 = r16
            r2.A02 = r0
            r2.A03 = r7
            X.Rvr r0 = r6.A00()
            r2.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r4)
            r2.A04 = r0
            X.Qwr r0 = X.C8553Qwr.A00()
            r2.A01 = r0
            X.SoV r1 = new X.SoV
            r1.<init>(r5)
            r0 = r17
            r3.CfW(r0, r2, r1)
            return
        L_0x0126:
            java.lang.String r0 = "SKU cannot be null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x012d:
            java.lang.String r0 = "Details of the products must be provided."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A04(android.app.Activity, com.android.billingclient.api.Purchase, com.android.billingclient.api.SkuDetails, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.S2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.Rxl] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(android.app.Activity r15, com.android.billingclient.api.Purchase r16, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r17, X.RRR r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21) {
        /*
            r4 = r18
            if (r15 == 0) goto L_0x017e
            r7 = 0
            r6 = 0
            r2 = 0
            X.S2c r5 = new X.S2c
            r5.<init>()
            r10 = 0
            r5.A00 = r10
            r5.A01 = r10
            r0 = 1
            r5.A04 = r0
            r9 = r16
            if (r16 == 0) goto L_0x00f1
            r8 = r19
            if (r19 == 0) goto L_0x00f1
            org.json.JSONObject r3 = r9.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r1 = r3.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r0 = r3.optString(r0)
            if (r1 != 0) goto L_0x0031
            if (r0 != 0) goto L_0x0031
            r1 = 0
        L_0x0031:
            X.S2c r5 = A00(r9, r8)
        L_0x0035:
            if (r20 == 0) goto L_0x0039
            r6 = r20
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            r7 = r1
        L_0x003c:
            boolean r0 = r4 instanceof X.QYI
            if (r0 == 0) goto L_0x00e4
            X.QYI r4 = (X.QYI) r4
            X.S74 r1 = r4.A01
        L_0x0044:
            java.lang.String r0 = "null cannot be cast to non-null type com.android.billingclient.api.ProductDetails"
            X.0qQ.A0C(r1, r0)
            r3 = 0
            X.Rxm r0 = r1.A00()
            if (r0 == 0) goto L_0x0061
            X.Rxm r0 = r1.A00()
            r0.getClass()
            X.Rxm r0 = r1.A00()
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0061
            r3 = r0
        L_0x0061:
            java.lang.String r4 = r1.A01
            java.lang.String r0 = "subs"
            boolean r0 = X.0qQ.A0K(r4, r0)
            r4 = r17
            if (r0 == 0) goto L_0x0078
            if (r21 == 0) goto L_0x00db
            int r0 = r21.length()
            if (r0 == 0) goto L_0x00db
            r3 = r21
        L_0x0078:
            java.lang.String r0 = "ProductDetails is required for constructing ProductDetailsParams."
            X.C11396SRp.A04(r1, r0)
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "offerToken is required for constructing ProductDetailsParams for subscriptions."
            X.C11396SRp.A04(r3, r0)
        L_0x0087:
            X.Rqt r0 = new X.Rqt
            r0.<init>(r1, r3)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
        L_0x0094:
            X.SId r0 = r4.A0B
            X.TiU r3 = r0.A02
            if (r3 == 0) goto L_0x017e
            r8 = 1
            if (r2 == 0) goto L_0x0177
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0177
            java.lang.String r12 = "play_pass_subs"
            java.lang.Object r9 = r2.get(r10)
            X.Rqt r9 = (X.C10356Rqt) r9
            r1 = 0
        L_0x00ad:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x00fc
            java.lang.Object r0 = r2.get(r1)
            X.Rqt r0 = (X.C10356Rqt) r0
            if (r0 == 0) goto L_0x00f5
            if (r1 == 0) goto L_0x00d8
            X.S74 r0 = r0.A00
            java.lang.String r11 = r0.A01
            X.S74 r0 = r9.A00
            java.lang.String r0 = r0.A01
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r11.equals(r12)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "All products should have same ProductType."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00d8:
            int r1 = r1 + 1
            goto L_0x00ad
        L_0x00db:
            X.RFl r0 = X.C8918RFl.INVALID_OFFER_TOKEN
            X.0qQ.A0B(r0, r10)
            A0E(r4, r0)
            goto L_0x0094
        L_0x00e4:
            boolean r0 = r4 instanceof X.QYH
            if (r0 == 0) goto L_0x00eb
            r1 = 0
            goto L_0x0044
        L_0x00eb:
            X.QYG r4 = (X.QYG) r4
            X.S74 r1 = r4.A00
            goto L_0x0044
        L_0x00f1:
            r1 = r20
            goto L_0x0035
        L_0x00f5:
            java.lang.String r0 = "ProductDetailsParams cannot be null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00fc:
            X.S74 r11 = r9.A00
            org.json.JSONObject r0 = r11.A05
            java.lang.String r9 = "packageName"
            java.lang.String r1 = r0.optString(r9)
            java.util.Iterator r14 = r2.iterator()
        L_0x010b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r13 = r14.next()
            X.Rqt r13 = (X.C10356Rqt) r13
            java.lang.String r0 = r11.A01
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x010b
            X.S74 r13 = r13.A00
            java.lang.String r0 = r13.A01
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x010b
            org.json.JSONObject r0 = r13.A05
            java.lang.String r0 = r0.optString(r9)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = "All products must have the same package name."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x013c:
            X.Rxl r1 = new X.Rxl
            r1.<init>()
            java.lang.Object r0 = r2.get(r10)
            X.Rqt r0 = (X.C10356Rqt) r0
            X.S74 r0 = r0.A00
            org.json.JSONObject r0 = r0.A05
            java.lang.String r0 = r0.optString(r9)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0156
            r8 = 0
        L_0x0156:
            r1.A05 = r8
            r1.A02 = r7
            r1.A03 = r6
            X.Rvr r0 = r5.A00()
            r1.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A04 = r0
            X.Qwr r0 = X.C8553Qwr.A02(r2)
            r1.A01 = r0
            X.SoW r0 = new X.SoW
            r0.<init>(r4)
            r3.CfW(r15, r1, r0)
            return
        L_0x0177:
            java.lang.String r0 = "Details of the products must be provided."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A05(android.app.Activity, com.android.billingclient.api.Purchase, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, X.RRR, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public static final void A06(C11230SGo sGo, C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, Map map) {
        String str;
        Object qyi;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S74 s74 = (S74) it.next();
            if (map == null || (str = DbT.A11(s74.A00, map)) == null) {
                str = s74.A00;
                0qQ.A07(str);
            }
            0qQ.A0B(str, 1);
            if (0qQ.A0K(s74.A01, "inapp")) {
                qyi = new QYG(s74, str);
            } else {
                qyi = new QYI(s74, str);
            }
            A0p.add(qyi);
        }
        Iterator it2 = A0p.iterator();
        while (it2.hasNext()) {
            A0D(inAppPurchaseControllerCoro, (RRR) it2.next());
        }
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A0p, 10)));
        Iterator it3 = A0p.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            A0x.put(((RRR) next).A02(), next);
        }
        tcZ.Df6(sGo, (C8918RFl) null, A0x);
        SPQ spq = inAppPurchaseControllerCoro.A06;
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            A0p2.add(((S74) it4.next()).A00);
        }
        spq.A09(A0p2, inAppPurchaseControllerCoro.A0B.A00());
    }

    public static final void A08(C11230SGo sGo, C13562Tcb tcb, List list) {
        LinkedHashMap linkedHashMap;
        0se.A0M(AnonymousClass7TE.A1L(RH0.A0N.A00, "querySkuDetailsAsync"));
        if (list != null) {
            linkedHashMap = DbS.A0x(JTT.A08(list));
            for (Object next : list) {
                String optString = ((SkuDetails) next).A00.optString("productId");
                0qQ.A07(optString);
                linkedHashMap.put(optString, next);
            }
        } else {
            linkedHashMap = null;
        }
        tcb.Df7(sGo, linkedHashMap);
    }

    public static final void A09(SkuDetails skuDetails, InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        S1C s1c = inAppPurchaseControllerCoro.A08;
        String optString = skuDetails.A00.optString("productId");
        0qQ.A07(optString);
        s1c.A00.put(optString, new C53394GnR(s1c.A01.now() + 3600000, skuDetails, 2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.SGo] */
    public static final void A0B(C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        ? obj = new Object();
        obj.A00 = 5;
        obj.A01 = "";
        tcZ.Df6(obj, C8918RFl.FETCH_INTERNAL_BILLING_INFO_FAILED, 0Yt.A0E());
        SPQ spq = inAppPurchaseControllerCoro.A06;
        ArrayList A0f = JTQ.A0f(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            A0f.add(C51971G9r.A0p(A0u));
        }
        spq.A07(inAppPurchaseControllerCoro.A0B.A00(), "Internal billing info fetch failed", A0f);
    }

    public static final void A0C(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        C11266SId sId = inAppPurchaseControllerCoro.A0B;
        C61046Jvk jvk = sId.A01;
        if (jvk != null && jvk.A01) {
            sId.A03 = null;
        }
        inAppPurchaseControllerCoro.A01 = null;
        inAppPurchaseControllerCoro.A02 = null;
        inAppPurchaseControllerCoro.A03 = C51965G9l.A0v((Object) null);
    }

    public static final void A0D(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, RRR rrr) {
        S1B s1b = inAppPurchaseControllerCoro.A07;
        String A022 = rrr.A02();
        0qQ.A0B(A022, 1);
        s1b.A00.put(A022, new C53394GnR(s1b.A01.now() + 3600000, rrr, 1));
    }

    public static final void A0E(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, C8918RFl rFl) {
        C13713Tfb tfb = inAppPurchaseControllerCoro.A01;
        if (tfb != null) {
            tfb.Db0(rFl);
        }
        SPQ spq = inAppPurchaseControllerCoro.A06;
        String obj = rFl.toString();
        Map map = inAppPurchaseControllerCoro.A05;
        0qQ.A0B(obj, 0);
        Pxe.A1U(RH0.A0s, obj, new LinkedHashMap(map));
        spq.A00.Cgp(map, (Map) null, "client_execute_dcpiap_fail");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r5 != r7) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(X.C7610QOs r15, java.util.Map r16, X.AnonymousClass4D7 r17) {
        /*
            r14 = this;
            r3 = r16
            r4 = 2
            r5 = r17
            boolean r0 = X.ME1.A02(r4, r5)
            if (r0 == 0) goto L_0x01a0
            r9 = r5
            X.ME1 r9 = (X.ME1) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01a0
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0019:
            java.lang.Object r5 = r9.A06
            X.1Hj r7 = X.1Hj.A02
            int r0 = r9.A00
            r6 = 3
            r8 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r8) goto L_0x0060
            if (r0 == r4) goto L_0x0088
            if (r0 != r6) goto L_0x01a7
            X.0eS.A00(r5)
        L_0x002c:
            return r5
        L_0x002d:
            X.0eS.A00(r5)
            X.SPQ r0 = r14.A06
            r5 = 0
            X.0qQ.A0B(r3, r5)
            X.TjB r2 = r0.A00
            java.lang.String r1 = "client_create_dcpquote_init"
            r0 = 0
            r2.Cgp(r3, r0, r1)
            X.RF1 r0 = r15.A05
            int r0 = r0.ordinal()
            if (r0 == r8) goto L_0x005c
            if (r0 != r5) goto L_0x01ac
            java.lang.String r1 = "inapp"
        L_0x004a:
            r9.A01 = r14
            r9.A02 = r15
            r9.A03 = r3
            r9.A04 = r1
            r9.A00 = r8
            java.lang.Object r5 = A01(r14, r1, r9)
            if (r5 == r7) goto L_0x0087
            r2 = r14
            goto L_0x0073
        L_0x005c:
            java.lang.String r1 = "subs"
            goto L_0x004a
        L_0x0060:
            java.lang.Object r1 = r9.A04
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r9.A03
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A02
            X.QOs r15 = (X.C7610QOs) r15
            java.lang.Object r2 = r9.A01
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r2 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r2
            X.0eS.A00(r5)
        L_0x0073:
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            r9.A01 = r2
            r9.A02 = r15
            r9.A03 = r3
            r9.A04 = r11
            r9.A00 = r4
            r0 = 0
            java.lang.Object r5 = A02(r2, r1, r9, r0)
            if (r5 != r7) goto L_0x009b
        L_0x0087:
            return r7
        L_0x0088:
            java.lang.Object r11 = r9.A04
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r3 = r9.A03
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A02
            X.QOs r15 = (X.C7610QOs) r15
            java.lang.Object r2 = r9.A01
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r2 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r2
            X.0eS.A00(r5)
        L_0x009b:
            X.0eP r5 = (X.0eP) r5
            java.lang.Object r0 = r5.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x00a9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r12.next()
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            java.lang.String r5 = X.RWF.A00(r0)
            org.json.JSONObject r1 = r0.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r4 = r1.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r1 = r1.optString(r0)
            if (r4 != 0) goto L_0x00ce
            r0 = 0
            if (r1 == 0) goto L_0x00cf
        L_0x00ce:
            r0 = r1
        L_0x00cf:
            X.AnonymousClass7TF.A1I(r5, r0, r10)
            goto L_0x00a9
        L_0x00d3:
            r9.A01 = r2
            r9.A02 = r15
            r9.A03 = r3
            r9.A04 = r11
            r9.A05 = r10
            r9.A00 = r6
            X.1IW r6 = X.JTS.A0s(r9)
            X.SHQ r1 = r2.A0D
            X.SPQ r0 = r2.A06
            X.TjB r0 = r0.A00
            X.SoS r0 = (X.C12177SoS) r0
            java.lang.String r9 = r0.A00
            X.S2K r5 = new X.S2K
            r5.<init>(r2, r15, r3, r6)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.0qQ.A0B(r11, r8)
            X.RqH r0 = r1.A00
            X.2IS r3 = X.C41845B3m.A04()
            X.QNI r4 = new X.QNI
            r4.<init>()
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "actor_id"
            r4.A07(r1, r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "client_mutation_id"
            r4.A07(r1, r0)
            java.lang.String r1 = "GOOGLE"
            java.lang.String r0 = "platform"
            r4.A07(r1, r0)
            java.lang.String r1 = r15.A07
            java.lang.String r0 = "quotable_id"
            r4.A07(r1, r0)
            java.lang.String r1 = r15.A06
            java.lang.String r0 = "developer_payload"
            r4.A07(r1, r0)
            java.lang.String r1 = r15.A02
            java.lang.String r0 = "external_product_id"
            r4.A07(r1, r0)
            java.lang.String r0 = "active_inuse_skus"
            r4.A05(r0, r11)
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r13 = r10.iterator()
        L_0x0141:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r12 = r13.next()
            X.0eP r12 = (X.0eP) r12
            X.2IV r10 = X.Pxe.A0R()
            java.lang.Object r1 = r12.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "sku"
            r10.A09(r1, r0)
            java.lang.Object r1 = r12.A01
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "payload_identifier"
            r10.A09(r1, r0)
            r11.add(r10)
            goto L_0x0141
        L_0x0169:
            java.lang.String r0 = "purchase_history"
            r4.A05(r0, r11)
            java.lang.String r0 = X.Q2N.A00()
            r4.A07(r9, r0)
            java.lang.String r0 = "input"
            r3.A00(r4, r0)
            java.lang.Class<X.QNd> r1 = X.C7588QNd.class
            java.lang.String r0 = "IGCreateDigitalContentQuoteMutation"
            X.3Fa r4 = new X.3Fa
            r4.<init>(r3, r1, r0, r8)
            X.8j4 r3 = X.C363088j4.A00(r2)
            r0 = 9
            X.Smn r2 = new X.Smn
            r2.<init>(r5, r0)
            r1 = 14
            X.Smk r0 = new X.Smk
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.ATL(r0, r2, r4)
            java.lang.Object r5 = r6.A0E()
            if (r5 != r7) goto L_0x002c
            return r7
        L_0x01a0:
            X.ME1 r9 = new X.ME1
            r9.<init>(r14, r5, r4)
            goto L_0x0019
        L_0x01a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ac:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0F(X.QOs, java.util.Map, X.4D7):java.lang.Object");
    }

    public final void A0J(C8918RFl rFl, List list, Map map) {
        String str;
        C8918RFl rFl2;
        SPQ spq = this.A06;
        0KC.A0C("DCP", AnonymousClass7TG.A0m(rFl, "Synchronization complete: ", AnonymousClass7TE.A1A()));
        LinkedHashMap A012 = SPQ.A01(list);
        C13888TjB tjB = spq.A00;
        boolean z = rFl.A01;
        if (z) {
            str = "client_create_iap_synchronize_fail";
        } else {
            str = "client_create_iap_synchronize_success";
        }
        tjB.Cgp(map, A012, str);
        LCD lcd = this.A0C;
        0xY AR4 = lcd.A00().A00.AR4();
        AR4.E5T("ig_in_app_purchases_synchronization_required", z);
        AR4.apply();
        0xY AR42 = lcd.A00().A00.AR4();
        AR42.E5T("ig_in_app_purchases_has_been_initialized", true);
        AR42.apply();
        C11266SId sId = this.A0B;
        C61046Jvk jvk = sId.A01;
        if (jvk != null && jvk.A01) {
            if (z) {
                rFl2 = C8918RFl.SYNCHRONIZATION_FAILED;
            } else {
                rFl2 = C8918RFl.SYNCHRONIZATION_SUCCESS;
            }
            C13561Tca tca = sId.A03;
            if (tca != null) {
                tca.Djb(rFl2);
            }
        }
    }

    public static final void A07(C11230SGo sGo, C13560TcZ tcZ, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, Map map) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A09((SkuDetails) it.next(), inAppPurchaseControllerCoro);
        }
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it2.next();
            if (map == null || (str = DbT.A11(skuDetails.A00.optString("productId"), map)) == null) {
                str = skuDetails.A00.optString("productId");
                0qQ.A07(str);
            }
            A0p.add(new QYH(skuDetails, str));
        }
        Iterator it3 = A0p.iterator();
        while (it3.hasNext()) {
            A0D(inAppPurchaseControllerCoro, (RRR) it3.next());
        }
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A0p, 10)));
        Iterator it4 = A0p.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            A0x.put(((RRR) next).A02(), next);
        }
        tcZ.Df6(sGo, (C8918RFl) null, A0x);
        SPQ spq = inAppPurchaseControllerCoro.A06;
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            A0p2.add(((SkuDetails) it5.next()).A00.optString("productId"));
        }
        spq.A09(A0p2, inAppPurchaseControllerCoro.A0B.A00());
    }
}
