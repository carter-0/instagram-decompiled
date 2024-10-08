package com.instagram.fanclub.consideration;

import X.00k;
import X.01N;
import X.02m;
import X.02z;
import X.05G;
import X.0Tu;
import X.0jo;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.106;
import X.10b;
import X.182;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass12T;
import X.AnonymousClass12U;
import X.AnonymousClass12V;
import X.AnonymousClass2o3;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C15731Uhc;
import X.C250663lr;
import X.C253673rC;
import X.C266444Yx;
import X.C272994ll;
import X.C273004lm;
import X.C273014lo;
import X.C314996jB;
import X.C318116oQ;
import X.C361478gI;
import X.C42845Bjr;
import X.C42852Bjy;
import X.C47151DrS;
import X.C48893Elt;
import X.C51970G9q;
import X.C51972G9s;
import X.C51974G9v;
import X.C54304H6w;
import X.C61067Jw5;
import X.C62600KiX;
import X.C64828Lio;
import X.C65312LrA;
import X.C66174MGl;
import X.C66182MGt;
import X.DbS;
import X.EKL;
import X.EVA;
import X.EVK;
import X.GKO;
import X.JTP;
import X.JTQ;
import X.JUH;
import X.L4V;
import X.L4W;
import X.MCA;
import X.N49;
import android.app.Application;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class FanClubConsiderationViewModel extends C361478gI {
    public Integer A00 = AnonymousClass05K.A01;
    public final Application A01;
    public final AnonymousClass12V A02;
    public final UserSession A03;
    public final C273004lm A04;
    public final L4V A05;
    public final FanClubConsiderationRepository A06;
    public final C64828Lio A07;
    public final MonetizationRepository A08;
    public final C314996jB A09;
    public final String A0A;
    public final String A0B;
    public final AnonymousClass0r6 A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final AnonymousClass0Ud A0L;
    public final boolean A0M;

    /* JADX WARNING: type inference failed for: r11v2, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(android.content.Context r11, com.instagram.fanclub.consideration.FanClubConsiderationViewModel r12, java.lang.String r13, java.util.Set r14, X.AnonymousClass4D7 r15) {
        /*
            r7 = r11
            r10 = r13
            r3 = 4
            r4 = r15
            boolean r0 = X.C66141MDt.A02(r3, r15)
            if (r0 == 0) goto L_0x007f
            r11 = r4
            X.MDt r11 = (X.C66141MDt) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0018:
            java.lang.Object r6 = r11.A08
            X.1Hj r5 = X.1Hj.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 != r4) goto L_0x0085
            java.lang.Object r9 = r11.A07
            java.lang.Object r3 = r11.A06
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r11.A05
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r11.A04
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r10 = r11.A03
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r11.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r12 = r11.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r12 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r12
            X.0eS.A00(r6)
        L_0x0040:
            X.EaI r6 = (X.C48176EaI) r6
            boolean r1 = r6 instanceof X.C47857EKd
            if (r1 == 0) goto L_0x004d
            X.EKd r6 = (X.C47857EKd) r6
            java.lang.String r1 = r6.A00
            r0.put(r9, r1)
        L_0x004d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x008a
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            X.Lio r6 = r12.A07
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.C66141MDt.A00(r12, r7, r10, r2, r11)
            r11.A05 = r0
            r11.A06 = r3
            r11.A07 = r9
            r11.A00 = r4
            java.lang.Object r6 = r6.A00(r7, r8, r9, r10, r11)
            if (r6 != r5) goto L_0x0040
            return r5
        L_0x006f:
            X.0eS.A00(r6)
            X.0Ym r0 = new X.0Ym
            r0.<init>()
            if (r14 == 0) goto L_0x008b
            java.util.Iterator r3 = r14.iterator()
            r2 = r0
            goto L_0x004d
        L_0x007f:
            X.MDt r11 = new X.MDt
            r11.<init>(r12, r15, r3)
            goto L_0x0018
        L_0x0085:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x008a:
            r0 = r2
        L_0x008b:
            X.0Ym r5 = X.0se.A0N(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A04(android.content.Context, com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.String, java.util.Set, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(androidx.fragment.app.FragmentActivity r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27) {
        /*
            r21 = this;
            r6 = 0
            r2 = 1
            r5 = r23
            X.0qQ.A0B(r5, r2)
            r3 = r21
            java.lang.Integer r0 = r3.A00
            int r1 = r0.intValue()
            r9 = r22
            r11 = r25
            if (r1 == r6) goto L_0x0184
            if (r1 == r2) goto L_0x004c
            r0 = 2
            if (r1 != r0) goto L_0x01b6
            X.4lm r4 = r3.A04
            java.lang.String r0 = r3.A0A
            long r1 = java.lang.Long.parseLong(r0)
            X.0wc r4 = r4.A00
            java.lang.String r0 = "ig_fan_club_view_member_list_button_tapped"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r0)
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dbb.A1D(r4, r0, r1)
            r4.Cgf()
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "PROFILE"
            android.os.Bundle r2 = X.DbY.A0B(r1, r0)
            java.lang.String r0 = "fan_club_member_list"
        L_0x0048:
            X.Dbb.A0i(r9, r2, r5, r4, r0)
        L_0x004b:
            return
        L_0x004c:
            if (r25 == 0) goto L_0x01c5
            com.instagram.common.session.UserSession r4 = r3.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322864839797378(0x810b7400002a82, double:3.034064212900337E-306)
            X.182.A06(r2, r4, r0)
            java.lang.String r8 = "Required value was null."
            if (r27 == 0) goto L_0x00a1
            r0 = 36331201371325390(0x811309000043ce, double:3.0393362690071696E-306)
            X.182.A06(r2, r4, r0)
            r0 = 36321056658564127(0x8109cf0000241f, double:3.0329207118074674E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a1
            A0B(r3, r5)
        L_0x0074:
            r0 = 36329229981335419(0x81113e00003f7b, double:3.0380895540393616E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r4, r0)
            X.0qQ.A0A(r0)
            java.lang.String r5 = r3.A0B
            java.util.Set r0 = X.C49280EsP.A00
            r0 = 4988(0x137c, float:6.99E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x010f
            X.FYu r2 = X.C48796EkJ.A00(r4)
            X.EZo r1 = X.C48146EZo.STORY
            X.EZp r0 = X.C48147EZp.SUBSCRIBE_TO_JOIN_CHAT_SHEET
            java.lang.String r3 = "subscribe_to_creator"
            java.lang.String r4 = "tap"
            r5 = 0
            X.C50337FYu.A01(r0, r1, r2, r3, r4, r5)
            return
        L_0x00a1:
            X.L4V r0 = r3.A05
            X.02m r7 = r0.A00
            java.lang.String r0 = r0.A01
            int r1 = r0.hashCode()
            r0 = 1062866800(0x3f5a0f70, float:0.85179806)
            r7.markerStart(r0, r1, r6)
            X.Lio r1 = r3.A07
            X.05G r0 = r3.A0E
            java.lang.Object r10 = r0.getValue()
            if (r10 == 0) goto L_0x01c0
            r12 = r26
            if (r26 == 0) goto L_0x01bb
            X.FEX r8 = r1.A01
            r13 = 0
            r14 = 4
            X.MGS r7 = new X.MGS
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.032 r7 = X.AnonymousClass0Zq.A00(r7)
            X.4Cq r8 = r1.A03
            X.109 r6 = X.AnonymousClass10A.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.0V1 r7 = X.10b.A01(r8, r7, r6, r0)
            java.util.Map r6 = r1.A02
            X.0eP r0 = X.AnonymousClass7TE.A1L(r10, r11)
            r6.put(r0, r7)
            r20 = 11
            X.MH6 r14 = new X.MH6
            r15 = r10
            r18 = r11
            r19 = r13
            r16 = r1
            r17 = r7
            r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.String) r18, (X.AnonymousClass4D7) r19, (int) r20)
            X.AnonymousClass7TE.A1Z(r14, r8)
            X.6oS r6 = X.C318116oQ.A00(r3)
            X.12V r0 = r3.A02
            X.12U r0 = (X.AnonymousClass12U) r0
            X.4CZ r1 = r0.A04
            r20 = 3
            X.MEe r0 = new X.MEe
            r14 = r0
            r15 = r3
            r16 = r12
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.1Eo.A05(r1, r0, r6)
            goto L_0x0074
        L_0x010f:
            r0 = 4902(0x1326, float:6.869E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "message_in_story"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "clips_chat_sticker"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x004b
        L_0x012b:
            X.6gx r4 = X.C313746gw.A00(r4)
            java.lang.String r1 = r3.A0A
            X.1Ln r3 = X.DbT.A0J(r4)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x004b
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "creator_igid"
            r2.put(r0, r1)
            java.lang.String r0 = "clips_chat_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = "reels"
        L_0x014e:
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
            X.DbW.A17(r3, r4)
            java.lang.String r0 = "subscribe_to_creator"
            X.DbV.A1M(r3, r0)
            r0 = 1153(0x481, float:1.616E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.A0p(r0)
            java.lang.String r0 = "subscribe_to_open_chat"
            r3.A0q(r0)
            java.lang.String r0 = "subscriber_broadcast"
            r3.A0o(r0)
            r3.A0w(r2)
            r3.Cgf()
            return
        L_0x0175:
            java.lang.String r1 = "message_in_story"
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x014e
            r0 = 2952(0xb88, float:4.137E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x014e
        L_0x0184:
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r3.A0A
            r0 = 1247(0x4df, float:1.747E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            r0 = 3103(0xc1f, float:4.348E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = r24
            r2.putString(r0, r1)
            java.lang.String r0 = "sku"
            r2.putString(r0, r11)
            java.lang.String r1 = "fan_management_consideration"
            java.lang.String r0 = "origin"
            r2.putString(r0, r1)
            r0 = 2347(0x92b, float:3.289E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0048
        L_0x01b6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x01c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x01c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A0E(androidx.fragment.app.FragmentActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FanClubConsiderationViewModel(Application application, UserSession userSession, FanClubConsiderationRepository fanClubConsiderationRepository, C64828Lio lio, C314996jB r17, String str, String str2, boolean z) {
        super(application);
        AnonymousClass12T r3 = AnonymousClass12T.A00;
        C273004lm A002 = C272994ll.A00(userSession);
        String str3 = str;
        L4V l4v = new L4V(str3);
        MonetizationRepository A003 = AnonymousClass2o3.A00(userSession);
        String str4 = str2;
        C51972G9s.A1D(str3, str4);
        C64828Lio lio2 = lio;
        C314996jB r8 = r17;
        C51974G9v.A1Q(lio2, r8, r3, A002);
        0qQ.A0B(A003, 12);
        this.A01 = application;
        this.A03 = userSession;
        this.A0A = str3;
        this.A0B = str4;
        this.A0M = z;
        this.A06 = fanClubConsiderationRepository;
        this.A07 = lio2;
        this.A09 = r8;
        this.A02 = r3;
        this.A04 = A002;
        this.A05 = l4v;
        this.A08 = A003;
        02z A012 = 106.A01((Object) null);
        this.A0E = A012;
        02z A013 = 106.A01((Object) null);
        this.A0H = A013;
        02z A0q = JTQ.A0q();
        this.A0J = A0q;
        02z A10 = C51970G9q.A10(true);
        this.A0I = A10;
        02z A014 = 106.A01((Object) null);
        this.A0G = A014;
        02z A102 = DbS.A10(EVA.READY_TO_PURCHASE);
        this.A0D = A102;
        this.A0L = 10b.A03(A102);
        02z A103 = DbS.A10(EVK.A03);
        this.A0F = A103;
        02z A015 = 106.A01(C65312LrA.A00);
        this.A0K = A015;
        this.A0C = MCA.A00(this, new AnonymousClass0r6[]{A012, A013, A0q, A10, A014, A102, A103, A015}, 44);
        l4v.A00.markerStart(1062864564, l4v.A01.hashCode());
        C66182MGt.A02(this, r3.A04, C318116oQ.A00(this), 37);
    }

    public static final C61067Jw5 A00(EVA eva, FanClubConsiderationViewModel fanClubConsiderationViewModel, Boolean bool, Boolean bool2, Integer num) {
        C266444Yx A0Q;
        int i;
        int intValue = fanClubConsiderationViewModel.A00.intValue();
        boolean z = false;
        if (intValue == 0) {
            A0Q = DbS.A0Q(new Object[0], 2131962058);
        } else if (intValue == 1) {
            if (eva == EVA.PURCHASING) {
                i = 2131962034;
            } else {
                i = 2131962041;
                if (AnonymousClass7TF.A1Y(bool2, true)) {
                    i = 2131962007;
                }
            }
            GKO A0Q2 = JTP.A0Q(i);
            C273014lo r2 = C273014lo.PRIMARY;
            if (eva == EVA.READY_TO_PURCHASE && !AnonymousClass7TF.A1Y(bool, true)) {
                z = true;
            }
            return new C61067Jw5((C266444Yx) A0Q2, r2, z, AnonymousClass7TF.A1Y(bool2, true));
        } else if (intValue != 2) {
            throw AnonymousClass7TE.A1K();
        } else if (num != null) {
            A0Q = new C54304H6w(new Object[]{num}, R.plurals.fan_club_creator_view_members_list, num.intValue());
        } else {
            throw AnonymousClass7TE.A0y();
        }
        return new C61067Jw5(A0Q, C273014lo.SECONDARY, AnonymousClass7TF.A1W(eva, EVA.READY_TO_PURCHASE));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 28
            boolean r0 = X.C66145MDx.A02(r3, r15)
            if (r0 == 0) goto L_0x00d0
            r7 = r15
            X.MDx r7 = (X.C66145MDx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r10 = r7.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 0
            r6 = 0
            r12 = 2
            r11 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0057
            if (r0 == r11) goto L_0x0098
            if (r0 != r12) goto L_0x00d7
            java.lang.Object r14 = r7.A02
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r13
            X.0eS.A00(r10)
        L_0x0033:
            X.C7i r10 = (X.C43738C7i) r10
            if (r10 == 0) goto L_0x0056
            X.4lm r5 = r13.A04
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.C7h r0 = r10.A0E()
            if (r0 == 0) goto L_0x004e
            X.Bju r1 = r0.A0E()
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "count"
            int r0 = r1.getCoercedIntField(r9, r0)
            long r2 = (long) r0
        L_0x004e:
            r5.A01(r4, r14, r2)
            X.KRT r6 = new X.KRT
            r6.<init>(r10)
        L_0x0056:
            return r6
        L_0x0057:
            X.0eS.A00(r10)
            java.lang.Integer r0 = r13.A00
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x007f
            if (r0 == r11) goto L_0x007f
            if (r0 != r12) goto L_0x00dc
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r10 = r13.A06
            com.instagram.common.session.UserSession r5 = r13.A03
            X.0Tu r4 = X.0Tu.A06
            r0 = 36320682996409107(0x81097800002313, double:3.032684406356016E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            X.C66145MDx.A00(r13, r14, r7, r12)
            java.lang.Object r10 = r10.A01(r14, r7, r0)
            if (r10 != r8) goto L_0x0033
            return r8
        L_0x007f:
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r10 = r13.A06
            com.instagram.common.session.UserSession r5 = r13.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36329144081989461(0x81112a00003f55, double:3.038035230947089E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            X.C66145MDx.A00(r13, r14, r7, r11)
            java.lang.Object r10 = r10.A02(r14, r7, r0)
            if (r10 != r8) goto L_0x00a3
            return r8
        L_0x0098:
            java.lang.Object r14 = r7.A02
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r13
            X.0eS.A00(r10)
        L_0x00a3:
            X.C7m r10 = (X.C43742C7m) r10
            if (r10 == 0) goto L_0x0056
            X.4lm r8 = r13.A04
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            X.C7l r6 = r10.A0E()
            if (r6 == 0) goto L_0x00c7
            java.lang.Class<X.Bk1> r5 = X.Bk1.class
            r4 = 8
            java.lang.String r1 = "members"
            r0 = -1307878652(0xffffffffb20b5b04, float:-8.111559E-9)
            X.3lr r1 = r6.getOptionalTreeField(r4, r1, r5, r0)
            if (r1 == 0) goto L_0x00c7
            java.lang.String r0 = "count"
            int r0 = r1.getCoercedIntField(r9, r0)
            long r2 = (long) r0
        L_0x00c7:
            r8.A01(r7, r14, r2)
            X.KRU r6 = new X.KRU
            r6.<init>(r10)
            return r6
        L_0x00d0:
            X.MDx r7 = new X.MDx
            r7.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (X.AnonymousClass7TE.A1b(r7.A0D) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        if (r0.size() <= 1) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r18, X.AnonymousClass4D7 r19) {
        /*
            r5 = r18
            r3 = 44
            r4 = r19
            boolean r0 = X.C66129MDh.A01(r3, r4)
            if (r0 == 0) goto L_0x01ac
            r8 = r4
            X.MDh r8 = (X.C66129MDh) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01ac
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001a:
            java.lang.Object r7 = r8.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r8.A00
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0196
            if (r0 != r4) goto L_0x01b8
            java.lang.Object r5 = r8.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r5 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r5
            X.0eS.A00(r7)
        L_0x002d:
            X.EKM r7 = (X.EKM) r7
            if (r7 == 0) goto L_0x009f
            java.util.List r1 = r7.A0G
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != 0) goto L_0x0042
            java.util.List r0 = r7.A0D
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r11 = 1
        L_0x0043:
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            java.util.List r0 = r7.A0D
            boolean r19 = X.AnonymousClass7TE.A1b(r0)
            java.util.List r0 = r7.A0E
            boolean r18 = X.AnonymousClass7TE.A1b(r0)
            X.Jw5 r0 = r7.A02
            boolean r10 = r0.A04
            X.L4V r0 = r5.A05
            X.02m r8 = r0.A00
            java.lang.String r0 = r0.A01
            int r3 = r0.hashCode()
            r0 = 1062864564(0x3f5a06b4, float:0.8516648)
            r2 = 2
            r8.markerEnd(r0, r3, r2)
            java.lang.Integer r0 = r5.A00
            int r0 = r0.intValue()
            if (r0 == r6) goto L_0x00a2
            if (r0 == r4) goto L_0x00ee
            if (r0 != r2) goto L_0x01b3
            if (r18 == 0) goto L_0x009f
            X.4lm r0 = r5.A04
            java.lang.String r2 = r5.A0A
            java.lang.String r6 = r5.A0B
            java.lang.String r9 = "subscription_management"
            X.0wc r1 = r0.A00
            java.lang.String r0 = "ig_fan_club_creator_side_customized_benefits_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbS.A1O(r1, r0)
            X.DbY.A1G(r1, r2)
            java.lang.String r3 = "origin"
        L_0x0094:
            r1.AAJ(r3, r6)
            java.lang.String r0 = "surface"
            r1.AAJ(r0, r9)
            r1.Cgf()
        L_0x009f:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x00a2:
            X.4lm r0 = r5.A04
            java.lang.Integer r17 = X.AnonymousClass05K.A0N
            java.lang.String r2 = r5.A0A
            long r3 = java.lang.Long.parseLong(r2)
            java.lang.String r6 = r5.A0B
            X.0wc r8 = r0.A00
            java.lang.String r0 = "fan_management_consideration_screen_seen"
            X.0kJ r7 = r8.A00
            X.0Aj r9 = r8.A00(r7, r0)
            java.lang.String r0 = "fan_management_consideration"
            java.lang.String r5 = "container_module"
            r9.AAJ(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "creator_igid"
            r9.A9F(r4, r0)
            java.lang.String r3 = "origin"
            java.lang.Boolean r1 = X.JTP.A0g(r9, r3, r6, r1)
            java.lang.String r0 = "social_context_shown"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "content_preview_shown"
            r9.A7p(r0, r1)
            java.lang.String r0 = "version_seen"
            X.AnonymousClass7TE.A1W(r9, r0, r11)
            r9.Cgf()
            if (r18 == 0) goto L_0x009f
            r0 = 3105(0xc21, float:4.351E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            goto L_0x0180
        L_0x00ee:
            X.4lm r3 = r5.A04
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
            java.lang.String r2 = r5.A0A
            long r15 = java.lang.Long.parseLong(r2)
            java.lang.String r6 = r5.A0B
            X.05G r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.L4W r0 = (X.L4W) r0
            if (r0 == 0) goto L_0x010f
            java.util.Set r0 = r0.A01
            if (r0 == 0) goto L_0x010f
            int r0 = r0.size()
            r14 = 1
            if (r0 > r4) goto L_0x0110
        L_0x010f:
            r14 = 0
        L_0x0110:
            java.util.List r0 = r7.A0H
            boolean r13 = X.AnonymousClass7TE.A1b(r0)
            boolean r12 = X.AnonymousClass7TE.A1b(r0)
            X.0wc r8 = r3.A00
            java.lang.String r0 = "fan_onboarding_consideration_screen_seen"
            X.0kJ r7 = r8.A00
            X.0Aj r9 = r8.A00(r7, r0)
            r0 = 286(0x11e, float:4.01E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "container_module"
            r9.AAJ(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.String r4 = "creator_igid"
            r9.A9F(r4, r0)
            java.lang.String r3 = "origin"
            java.lang.Boolean r1 = X.JTP.A0g(r9, r3, r6, r1)
            java.lang.String r0 = "social_context_shown"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "content_preview_shown"
            r9.A7p(r0, r1)
            java.lang.String r0 = "version_seen"
            X.AnonymousClass7TE.A1W(r9, r0, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.String r0 = "early_pricing_enabled"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "free_trial_enabled"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "exclusive_permanent_content_teaser_shown"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "exclusive_story_teaser_shown"
            r9.A7p(r0, r1)
            r9.Cgf()
            if (r18 == 0) goto L_0x009f
            r0 = 689(0x2b1, float:9.65E-43)
            java.lang.String r9 = X.C273654mx.A00(r0)
        L_0x0180:
            java.lang.String r0 = "ig_fan_club_fan_side_customized_benefits_impression"
            X.0Aj r1 = r8.A00(r7, r0)
            java.lang.String r0 = X.C63261Ku6.A00(r17)
            r1.AAJ(r5, r0)
            java.lang.Long r0 = X.DbV.A0q(r2)
            r1.A9F(r4, r0)
            goto L_0x0094
        L_0x0196:
            X.0eS.A00(r7)
            X.0r6 r2 = r5.A0C
            r1 = 2
            X.FxC r0 = new X.FxC
            r0.<init>((X.AnonymousClass0r6) r2, (int) r1)
            r8.A01 = r5
            r8.A00 = r4
            java.lang.Object r7 = X.AnonymousClass10c.A03(r8, r0)
            if (r7 != r3) goto L_0x002d
            return r3
        L_0x01ac:
            X.MDh r8 = new X.MDh
            r8.<init>(r5, r4, r3)
            goto L_0x001a
        L_0x01b3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A06(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, X.4D7):java.lang.Object");
    }

    public static final List A07(FanClubConsiderationViewModel fanClubConsiderationViewModel, User user, List list, boolean z) {
        GKO A0Q;
        Object[] objArr;
        int i;
        GKO A0Q2;
        int i2;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        int i4;
        if (z) {
            return 0sn.A00;
        }
        boolean A1W = AnonymousClass7TF.A1W(fanClubConsiderationViewModel.A00, AnonymousClass05K.A0C);
        01N A1H = 0jo.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((C62600KiX) it.next()).ordinal();
            if (ordinal == 1) {
                String username = user.getUsername();
                A0Q = DbS.A0Q(new Object[0], 2131953769);
                if (A1W) {
                    objArr = new Object[0];
                    i = 2131953762;
                } else {
                    objArr = new Object[]{username};
                    i = 2131953763;
                }
                A0Q2 = DbS.A0Q(objArr, i);
                i2 = R.drawable.instagram_crown_badge_pano_outline_24;
            } else if (ordinal == 5) {
                String username2 = user.getUsername();
                A0Q = DbS.A0Q(new Object[0], 2131953771);
                A0Q2 = DbS.A0Q(new Object[]{username2}, 2131953766);
                i2 = R.drawable.instagram_media_pano_outline_24;
            } else if (ordinal == 7) {
                String username3 = user.getUsername();
                A0Q = DbS.A0Q(new Object[0], 2131953772);
                if (A1W) {
                    objArr2 = new Object[0];
                    i3 = 2131953767;
                } else {
                    objArr2 = new Object[]{username3};
                    i3 = 2131953768;
                }
                A0Q2 = DbS.A0Q(objArr2, i3);
                i2 = R.drawable.instagram_app_messenger_pano_outline_24;
            } else if (ordinal == 2) {
                String username4 = user.getUsername();
                A0Q = DbS.A0Q(new Object[0], 2131953770);
                if (A1W) {
                    objArr3 = new Object[0];
                    i4 = 2131953764;
                } else {
                    objArr3 = new Object[]{username4};
                    i4 = 2131953765;
                }
                A0Q2 = DbS.A0Q(objArr3, i4);
                i2 = R.drawable.instagram_live_pano_outline_24;
            }
            A1H.add(new C47151DrS(A0Q, A0Q2, i2));
        }
        return 0jo.A1I(A1H);
    }

    public static final List A09(List list, boolean z) {
        if (!z) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if ((next instanceof C42852Bjy) || (next instanceof C42845Bjr)) {
                C250663lr r1 = (C250663lr) next;
                JTP.A1T(r1.A07(DialogModule.KEY_TITLE), r1.A08(DevServerEntity.COLUMN_DESCRIPTION), A1C, 45);
            }
        }
        return 00k.A0a(A1C);
    }

    public static final void A0B(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str) {
        1Eo.A05(((AnonymousClass12U) fanClubConsiderationViewModel.A02).A04, new C66174MGl((Object) fanClubConsiderationViewModel, str, (AnonymousClass4D7) null, 43), JTP.A0K(fanClubConsiderationViewModel, EVK.HOLDOUT_ERROR, fanClubConsiderationViewModel.A0F));
    }

    public static final boolean A0C(FanClubConsiderationViewModel fanClubConsiderationViewModel, Boolean bool) {
        User user;
        FanClubInfoDict B3v;
        Integer num = fanClubConsiderationViewModel.A00;
        Integer num2 = AnonymousClass05K.A0C;
        Boolean A0v = AnonymousClass7TE.A0v();
        if (num == num2 || (user = (User) fanClubConsiderationViewModel.A0E.getValue()) == null || (B3v = user.A03.B3v()) == null || !0qQ.A0K(B3v.CT7(), A0v)) {
            return false;
        }
        if (!182.A06(0Tu.A05, fanClubConsiderationViewModel.A03, 36316100266299337L) || 0qQ.A0K(bool, A0v)) {
            return false;
        }
        return true;
    }

    public static final C266444Yx A01(FanClubConsiderationViewModel fanClubConsiderationViewModel, Integer num, Integer num2, String str, String str2, Map map) {
        int i;
        Object[] objArr;
        int i2;
        int intValue;
        Object obj = map.get(str);
        if (obj == null) {
            return JUH.A00("");
        }
        Object obj2 = map.get(str2);
        int intValue2 = fanClubConsiderationViewModel.A00.intValue();
        if (intValue2 == 0) {
            i = 2131962066;
        } else if (intValue2 == 1) {
            if (obj2 != null) {
                objArr = new Object[]{obj, obj2};
                i2 = 2131962067;
            } else {
                objArr = new Object[]{obj};
                i2 = 2131962066;
            }
            ArrayList A1M = 0sr.A1M(new C266444Yx[]{DbS.A0Q(objArr, i2)});
            if (num2 != null && (intValue = num2.intValue()) > 0) {
                if (182.A06(0Tu.A05, fanClubConsiderationViewModel.A03, 36329144081989461L)) {
                    A1M.add(new C54304H6w(new Object[]{C253673rC.A01(intValue)}, R.plurals.fan_onboarding_consideration_subtitle_member_count, intValue));
                }
            }
            0qQ.A0B(A1M, 3);
            return new C15731Uhc(" · ", A1M);
        } else if (intValue2 != 2) {
            throw AnonymousClass7TE.A1K();
        } else if (obj2 != null && num != null) {
            return DbS.A0Q(new Object[]{obj, obj2, num}, 2131965827);
        } else {
            i = 2131965826;
        }
        return DbS.A0Q(new Object[]{obj}, i);
    }

    public static final EKL A02(FanClubConsiderationViewModel fanClubConsiderationViewModel, int i) {
        Integer num;
        Set set;
        switch (i) {
            case 1:
                num = AnonymousClass05K.A01;
                break;
            case 2:
                num = AnonymousClass05K.A0j;
                break;
            case 4:
                num = AnonymousClass05K.A0N;
                break;
            case 5:
                num = AnonymousClass05K.A0u;
                break;
            case 6:
                num = AnonymousClass05K.A15;
                break;
            case 7:
                num = AnonymousClass05K.A1F;
                break;
            case 8:
                num = AnonymousClass05K.A0C;
                break;
            case 9:
                num = AnonymousClass05K.A0Y;
                break;
            default:
                return new EKL(i);
        }
        L4V l4v = fanClubConsiderationViewModel.A05;
        String A002 = C48893Elt.A00(num);
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                l4v.A00.markerEndAtPoint(1062864564, l4v.A01.hashCode(), 3, A002);
                break;
            default:
                02m r1 = l4v.A00;
                int hashCode = l4v.A01.hashCode();
                r1.markerAnnotate(1062864564, hashCode, "error", A002);
                r1.markerEnd(1062864564, hashCode, 3);
                break;
        }
        C273004lm r3 = fanClubConsiderationViewModel.A04;
        String str = fanClubConsiderationViewModel.A0A;
        String A003 = C48893Elt.A00(num);
        05G r2 = fanClubConsiderationViewModel.A0H;
        L4W l4w = (L4W) r2.getValue();
        String str2 = null;
        if (l4w != null) {
            set = l4w.A01;
        } else {
            set = null;
        }
        String valueOf = String.valueOf(set);
        L4W l4w2 = (L4W) r2.getValue();
        if (l4w2 != null) {
            str2 = l4w2.A00;
        }
        r3.A0C(str, A003, valueOf, String.valueOf(str2), fanClubConsiderationViewModel.A0B);
        return new EKL(i);
    }

    public static final Integer A03(List list, boolean z) {
        if (!list.isEmpty() && z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((N49) it.next()).A00;
                if (str != null) {
                    if (str.length() == 0) {
                    }
                }
            }
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public static final List A08(List list) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N49 n49 = (N49) it.next();
            String str2 = n49.A01;
            if (!(str2 == null || (str = n49.A00) == null)) {
                AnonymousClass7TF.A1I(str2, str, A1C);
            }
        }
        return 00k.A0a(A1C);
    }

    public static final void A0A(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str) {
        1Eo.A05(((AnonymousClass12U) fanClubConsiderationViewModel.A02).A04, new C66174MGl((Object) fanClubConsiderationViewModel, str, (AnonymousClass4D7) null, 42), C318116oQ.A00(fanClubConsiderationViewModel));
    }
}
