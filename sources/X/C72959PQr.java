package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.PQr  reason: case insensitive filesystem */
public final class C72959PQr implements C273414mX {
    public final int A00;
    public final Object A01;

    public C72959PQr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C331157Pu A00(C331127Pr r1, Object obj, int i) {
        r1.A0U = new C72959PQr(obj, i);
        return r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a0, code lost:
        r2.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d6, code lost:
        r0.A06.A06.Epw((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0244, code lost:
        r0.Cyg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0247, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyc() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0197;
                case 1: goto L_0x0008;
                case 2: goto L_0x01a1;
                case 3: goto L_0x01c9;
                case 4: goto L_0x01d0;
                case 5: goto L_0x01df;
                case 6: goto L_0x001f;
                case 7: goto L_0x0007;
                case 8: goto L_0x021c;
                case 9: goto L_0x00ab;
                case 10: goto L_0x00f7;
                case 11: goto L_0x0221;
                case 12: goto L_0x0229;
                case 13: goto L_0x0229;
                case 14: goto L_0x0230;
                case 15: goto L_0x0248;
                case 16: goto L_0x0113;
                case 17: goto L_0x025b;
                case 18: goto L_0x0263;
                case 19: goto L_0x026b;
                case 20: goto L_0x0273;
                case 21: goto L_0x0007;
                case 22: goto L_0x027b;
                case 23: goto L_0x0288;
                case 24: goto L_0x0294;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r1 = r1.A01
            X.P9l r1 = (X.C72528P9l) r1
            X.7Ug r0 = r1.A09
            r0.Cyg()
            X.OJR r0 = r1.A06
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0007
            X.7SM r0 = r1.A08
            r0.A00()
            return
        L_0x001f:
            java.lang.Object r3 = r1.A01
            X.OTm r3 = (X.C70965OTm) r3
            java.lang.Integer r0 = r3.A02
            if (r0 != 0) goto L_0x003a
            r0 = -1
        L_0x0028:
            r7 = 0
            java.lang.String r9 = "source"
            if (r0 == r7) goto L_0x00c3
            r8 = 1
            if (r0 == r8) goto L_0x0062
            r1 = 2
            if (r0 == r1) goto L_0x003f
            r1 = 3
            if (r0 != r1) goto L_0x0007
            X.C70965OTm.A00(r3)
            return
        L_0x003a:
            int r0 = r0.intValue()
            goto L_0x0028
        L_0x003f:
            X.OWQ r5 = r3.A07
            X.3tr r4 = r3.A00
            if (r4 == 0) goto L_0x00e8
            java.lang.String r2 = "suggested_replies_manage_saved_replies_tap"
            java.lang.String r1 = "sayt"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.OWQ.A00(r5, r4, r2, r1, r0)
            X.O8a r0 = r3.A06
            X.7Kl r1 = r0.A00
            X.7Hp r0 = r1.A0L
            android.app.Activity r1 = r1.A0I
            X.7Hl r0 = r0.A00
            X.7Q0 r0 = r0.A0n
            if (r0 == 0) goto L_0x0007
            r0.A00(r1)
            return
        L_0x0062:
            X.OWQ r6 = r3.A07
            X.3tr r5 = r3.A00
            if (r5 == 0) goto L_0x00e8
            java.lang.String r4 = r3.A03
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "enabled"
            r2.put(r0, r1)
            java.lang.String r1 = "control_sheet"
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
            java.lang.String r0 = "suggested_replies_toggle"
            X.OWQ.A00(r6, r5, r0, r4, r2)
            X.6ap r2 = X.DbV.A0W()
            r2.A06()
            r2.A0L = r8
            android.content.Context r1 = r3.A04
            r0 = 2131960239(0x7f1321af, float:1.9557141E38)
            X.DbS.A19(r1, r2, r0)
            r0 = 2131960237(0x7f1321ad, float:1.9557137E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0I = r0
            r0 = 2131960238(0x7f1321ae, float:1.955714E38)
            X.DbW.A0q(r1, r2, r0)
            r0 = 4
            X.C72737PHr.A00(r2, r3, r0)
            X.DbY.A1N(r2)
            return
        L_0x00ab:
            java.lang.Object r1 = r1.A01
            X.NIn r1 = (X.C68449NIn) r1
            com.instagram.common.ui.base.IgEditText r0 = r1.A0H
            java.lang.String r9 = "noteEditText"
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0007
            com.instagram.common.ui.base.IgEditText r0 = r1.A0H
            if (r0 == 0) goto L_0x00e8
            X.C69979NvJ.A00(r0)
            return
        L_0x00c3:
            X.O8a r0 = r3.A06
            X.3tr r2 = r3.A00
            if (r2 == 0) goto L_0x00e8
            java.lang.String r1 = r3.A03
            X.7Kl r5 = r0.A00
            r0 = 1
            r5.A0F = r0
            X.7Hp r0 = r5.A0L
            r0.A00()
            X.3tr r0 = X.C255273tr.A07
            if (r2 != r0) goto L_0x0007
            java.lang.String r0 = "sayt"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x00f0
            X.OBx r9 = r5.A06
            if (r9 != 0) goto L_0x02ba
            java.lang.String r9 = "previousReplyLogger"
        L_0x00e8:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f0:
            X.91j r6 = r5.A07
            if (r6 != 0) goto L_0x02a4
            java.lang.String r9 = "smartSuggestionLogger"
            goto L_0x00e8
        L_0x00f7:
            java.lang.Object r0 = r1.A01
            X.OJl r0 = (X.C70740OJl) r0
            if (r0 == 0) goto L_0x0007
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0103:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            android.view.View r1 = X.JTO.A0H(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            goto L_0x0103
        L_0x0113:
            java.lang.Object r2 = r1.A01
            X.Moq r2 = (X.C67496Moq) r2
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0152
            X.P41 r0 = new X.P41
            r0.<init>(r2)
            X.NIg r3 = new X.NIg
            r3.<init>()
            r3.A02 = r0
            r0 = 0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r0)
            X.Nps r0 = r2.A07
            r0.A00(r1)
            r3.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r2.A06
            X.7Pr r1 = X.DbS.A0W(r0)
            r0 = 1
            X.DbS.A1S(r1, r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.A03 = r0
            r0 = 17
            X.7Pu r1 = A00(r1, r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r2.A05
            r1.A02(r0, r3)
            return
        L_0x0152:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0007
            com.instagram.common.session.UserSession r1 = r2.A06
            androidx.fragment.app.FragmentActivity r15 = r2.A05
            r13 = 1
            r5 = 0
            r10 = 0
            r18 = 120(0x78, float:1.68E-43)
            X.7H6 r4 = new X.7H6
            r14 = r4
            r16 = r1
            r17 = r5
            r19 = r13
            r20 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.LNF r0 = X.K6K.A0s
            X.K6K r1 = r0.A01(r1, r5, r5)
            X.7L0 r0 = r2.A09
            r1.ADi(r0)
            X.P18 r3 = new X.P18
            r3.<init>(r2)
            X.AcJ r2 = new X.AcJ
            r2.<init>()
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = r5
            r7 = r5
            r8 = r5
            r11 = r10
            r12 = r10
            r1.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.37D r0 = X.DbT.A0i(r15)
            if (r0 == 0) goto L_0x0007
            r0.A0J(r1)
            return
        L_0x0197:
            java.lang.Object r0 = r1.A01
            X.OVW r0 = (X.OVW) r0
            X.Puw r0 = r0.A02
            r0.D9d()
            return
        L_0x01a1:
            java.lang.Object r6 = r1.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.4kA r5 = X.AnonymousClass4k9.A00(r6)
            long r3 = X.AnonymousClass7TG.A0I()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600882375954476(0x82084f007c102c, double:3.209883622252847E-306)
            long r0 = X.182.A01(r2, r6, r0)
            long r3 = r3 + r0
            X.0s0 r2 = r5.A06
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 30
            r1 = r1[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
            return
        L_0x01c9:
            java.lang.Object r0 = r1.A01
            X.OIT r0 = (X.OIT) r0
            X.MuF r0 = r0.A0D
            goto L_0x01d6
        L_0x01d0:
            java.lang.Object r0 = r1.A01
            X.OIO r0 = (X.OIO) r0
            X.MuF r0 = r0.A0A
        L_0x01d6:
            r1 = 0
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r0.A06
            X.05G r0 = r0.A06
            r0.Epw(r1)
            return
        L_0x01df:
            java.lang.Object r2 = r1.A01
            X.NVW r2 = (X.NVW) r2
            X.0eM r0 = r2.A00
            X.OyR r3 = X.C66580MXl.A0T(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r2.A06()
            java.lang.String r5 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r2.A06()
            java.lang.String r6 = r0.A01
            int r1 = r2.A00
            X.JwH r0 = X.C67750Mu3.A00(r2)
            java.lang.Object r0 = r0.A00
            X.Nk9 r0 = (X.C69369Nk9) r0
            int r0 = r0.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "selected_duration_days"
            java.util.Map r11 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r7 = "challenge_duration_selected"
            java.lang.String r8 = "tap"
            java.lang.String r9 = "done_button"
            java.lang.String r10 = "duration_bottom_sheet"
            r2 = 0
            X.C72202OyR.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x021c:
            java.lang.Object r0 = r1.A01
            X.7Ug r0 = (X.C332257Ug) r0
            goto L_0x0244
        L_0x0221:
            java.lang.Object r0 = r1.A01
            X.NWu r0 = (X.C68784NWu) r0
            X.C68784NWu.A00(r0)
            return
        L_0x0229:
            java.lang.Object r0 = r1.A01
            X.P9G r0 = (X.P9G) r0
            X.7Ug r0 = r0.A06
            goto L_0x0244
        L_0x0230:
            java.lang.Object r3 = r1.A01
            X.P9s r3 = (X.C72535P9s) r3
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r3.A01
            if (r2 == 0) goto L_0x0242
            X.7VW r1 = r3.A04
            java.lang.String r0 = "direct_thread_username"
            r1.CqM(r2, r0)
            r0 = 0
            r3.A01 = r0
        L_0x0242:
            X.7Ug r0 = r3.A05
        L_0x0244:
            r0.Cyg()
            return
        L_0x0248:
            java.lang.Object r3 = r1.A01
            X.P15 r3 = (X.P15) r3
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r3.A00
            if (r2 == 0) goto L_0x0257
            X.7VW r1 = r3.A05
            java.lang.String r0 = "collection_item_username"
            r1.CqM(r2, r0)
        L_0x0257:
            r0 = 0
            r3.A00 = r0
            return
        L_0x025b:
            java.lang.Object r0 = r1.A01
            X.Moq r0 = (X.C67496Moq) r0
            X.C67496Moq.A00(r0)
            return
        L_0x0263:
            java.lang.Object r1 = r1.A01
            X.Mc0 r1 = (X.C66755Mc0) r1
            r0 = 0
            r1.A01 = r0
            return
        L_0x026b:
            java.lang.Object r1 = r1.A01
            X.Mc3 r1 = (X.C66758Mc3) r1
            r0 = 0
            r1.A07 = r0
            return
        L_0x0273:
            java.lang.Object r1 = r1.A01
            X.McC r1 = (X.C66767McC) r1
            r0 = 0
            r1.A04 = r0
            return
        L_0x027b:
            java.lang.Object r1 = r1.A01
            X.TvH r1 = (X.C14388TvH) r1
            com.instagram.common.session.UserSession r0 = r1.A09
            X.VhG r2 = X.VGG.A00(r0)
            com.instagram.base.activity.BaseFragmentActivity r0 = r1.A06
            goto L_0x02a0
        L_0x0288:
            java.lang.Object r0 = r1.A01
            X.PI3 r0 = (X.PI3) r0
            X.OCV r0 = r0.A08
            X.0sa r0 = r0.A00
            r0.invoke()
            return
        L_0x0294:
            java.lang.Object r1 = r1.A01
            X.TwL r1 = (X.C14437TwL) r1
            com.instagram.common.session.UserSession r0 = r1.A04
            X.VhG r2 = X.VGG.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.A01
        L_0x02a0:
            r2.A00(r0)
            return
        L_0x02a4:
            com.instagram.common.session.UserSession r2 = r5.A0K
            java.lang.String r4 = r2.A06
            java.util.List r0 = r5.A0N
            java.lang.String r1 = X.C51966G9m.A1G(r0, r7)
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r0 = r5.A08
            if (r0 == 0) goto L_0x02b8
            java.lang.String r0 = r0.A05
        L_0x02b4:
            r6.A01(r4, r1, r0)
            goto L_0x0300
        L_0x02b8:
            r0 = r3
            goto L_0x02b4
        L_0x02ba:
            com.instagram.common.session.UserSession r2 = r5.A0K
            java.lang.String r8 = r2.A06
            java.util.List r0 = r5.A0N
            java.lang.String r7 = X.C51966G9m.A1G(r0, r7)
            java.lang.String r6 = r5.A0D
            X.0wc r1 = r9.A01
            java.lang.String r0 = "smart_suggestion_dismiss"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r7 == 0) goto L_0x0300
            if (r6 == 0) goto L_0x0300
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0300
            X.91i r1 = r9.A00
            java.lang.String r0 = "suggestion_type"
            r4.A8M(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r8)
            java.lang.String r0 = "page_or_business_id"
            r4.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r7)
            java.lang.String r0 = "consumer_id"
            r4.A9F(r0, r1)
            java.lang.String r0 = "request_id"
            r4.AAJ(r0, r6)
            java.lang.String r1 = "INSTAGRAM"
            java.lang.String r0 = "channel"
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x0300:
            X.3t1 r0 = r5.A0M
            X.3sy r1 = X.AnonymousClass6W3.A06(r0)
            r0 = 87
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            X.O04.A00(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72959PQr.Cyc():void");
    }

    public final /* synthetic */ void Cyf() {
        String str;
        C273484me r1;
        AnonymousClass9H7 r0;
        switch (this.A00) {
            case 7:
                AnonymousClass4DH r12 = (AnonymousClass4DH) this.A01;
                if ((r12 instanceof C273484me) && (r1 = (C273484me) r12) != null && (r0 = r1.A00) != null) {
                    r0.A0G();
                    return;
                }
                return;
            case 9:
                C68449NIn.A0C((C68449NIn) this.A01);
                return;
            case 10:
                C70740OJl oJl = (C70740OJl) this.A01;
                if (oJl != null) {
                    oJl.A00();
                    return;
                }
                return;
            case 21:
                C71153OeR oeR = ((C70493O8s) this.A01).A00;
                NKA nka = oeR.A05;
                if (nka != null) {
                    C68497NKq nKq = (C68497NKq) nka.A08.getValue();
                    UserSession A0J = JTS.A0J(nka.A07);
                    05G r13 = nKq.A00;
                    r13.Epw(C69991NvV.A00(A0J).A00.A02);
                    05G r6 = nKq.A02;
                    r6.Epw(00k.A0j(C2612048r.A00(A0J).A00));
                    C68497NKq.A00((C2611948q) r13.getValue(), nKq);
                    for (C69415Nkv nkv : C69415Nkv.A04) {
                        05G r14 = nKq.A03;
                        String str2 = nkv.A02;
                        if (((AbstractMap) r14.getValue()).containsKey(str2)) {
                            Map map = (Map) r14.getValue();
                            if (((Set) r6.getValue()).contains(nkv)) {
                                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                            } else {
                                str = "0";
                            }
                            map.put(str2, str);
                        }
                    }
                }
                if (!oeR.A0B) {
                    UserSession userSession = oeR.A0h;
                    if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36317161124729662L)) {
                        OTI.A00(oeR.A0m, "filter_bottom_sheet_dismiss", (String) null, (String) null, (String) null, oeR.A0j.A05());
                    }
                }
                oeR.A0B = false;
                return;
            default:
                return;
        }
    }
}
