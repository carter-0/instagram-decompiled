package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.reels.store.ReelStore;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Z6  reason: invalid class name */
public final class AnonymousClass7Z6 implements AnonymousClass7Z7 {
    public final UserSession A00;
    public final C282375Cv A01;
    public final 2Dm A02;
    public final ReelStore A03;
    public final AnonymousClass0eK A04;
    public final C61410nE A05;

    private void A03(B1V b1v, C381819cP r12, DirectShareTarget directShareTarget, 2FW r14, String str, String str2, String str3, boolean z) {
        A01(new A6I(b1v, this, str3), this, r12, (C69343Nji) null, directShareTarget, r14, str, str2, z);
    }

    private void A04(B1V b1v, C381819cP r11, DirectShareTarget directShareTarget, String str, String str2) {
        A01(new A6I(b1v, this, str2), this, r11, (C69343Nji) null, directShareTarget, (2FW) null, str, (String) null, false);
    }

    public final void ELK(DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new PED(directAREffectShare, this, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void ELM(Context context, UserSession userSession, DirectShareTarget directShareTarget, DirectAnimatedMedia directAnimatedMedia, String str, String str2, boolean z) {
        A02(new C40493Ad2(this, directAnimatedMedia, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void ELS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        A03(new PEE(this, str3, str, z), new C381819cP(str3, z, false), directShareTarget, 2FW.A0S, str2, (String) null, "unknown", false);
    }

    public final void ELT(1Xj r10, DirectShareTarget directShareTarget, String str, boolean z) {
        A03(new C40488Acx(this, r10, str), new C381819cP(str, false, false), directShareTarget, 2FW.A0W, (String) null, (String) null, "unknown", false);
    }

    public final void ELW(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z) {
        A02(new PEI(this, savedCollection, str2, str, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void ELX(C247733gp r16, DirectShareTarget directShareTarget, String str, boolean z) {
        String str2;
        C247733gp r11 = r16;
        1Xj r0 = r11.A07;
        if (r0 == null || r0.A0C.CCd() == null) {
            str2 = null;
        } else {
            str2 = r11.A07.A0C.CCd().getUsername();
        }
        String str3 = r11.A0D;
        String A0R = 002.A0R("https://www.instagram.com/p/", str3);
        if (r11.A0d != null && str3 != null) {
            String str4 = str;
            A03(new PEF(this, r11, str4, str2, A0R), new C381819cP(str4, false, false), directShareTarget, 2FW.A0b, (String) null, (String) null, "unknown", false);
        }
    }

    public final void ELZ(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        AnonymousClass3U9 BYf = 1bJ.A00(this.A00).BYf(directShareTarget2);
        if (BYf.Axj() || C331057Pi.A02(BYf.AiM())) {
            boolean z2 = z;
            C381819cP r14 = new C381819cP((String) null, z2, false);
            A03(new C40496Ad5(imageUrl, this, user, str, str2, str3, str5, j, z2), r14, directShareTarget2, 2FW.A1g, (String) null, (String) null, "unknown", false);
        }
    }

    public final void ELb(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        String str9 = str8;
        boolean z2 = z;
        A02(new DHA(this, str9, str3, str4, str5, str6, str, str2, list, z2), this, new C381819cP(str9, z2, false), directShareTarget, str7);
    }

    public final void ELh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        boolean z2 = z;
        A02(new DH6(this, str6, str2, str4, str5, z2), this, new C381819cP(str6, z2, false), directShareTarget, str);
    }

    public final void ELi(1Xj r10, DirectShareTarget directShareTarget, String str, boolean z, boolean z2) {
        A03(new C40490Acz(this, r10, str), new C381819cP(str, false, false), directShareTarget, 2FW.A1D, (String) null, (String) null, "unknown", false);
    }

    public final void ELl(DirectShareTarget directShareTarget, C51151FpN fpN, String str, String str2, String str3, boolean z) {
        A02(new DH1(this, fpN, str3, str, z), this, new C381819cP(str3, z, false), directShareTarget, str2);
    }

    public final void ELm(1Xj r3, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new PEB(this, r3, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void ELp(InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new PE9(this, infoCenterShareInfoIntf, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void ELu(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        A03(new PEA(this, str3, str, z), new C381819cP(str3, z, false), directShareTarget, 2FW.A17, str2, (String) null, "unknown", false);
    }

    public final void ELw(C317966o8 r11, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str4;
        boolean z2 = z;
        C381819cP r6 = new C381819cP(str5, z2, false);
        A04(new DH2(this, str5, str, str2, z2), r6, directShareTarget, str3, "unknown");
    }

    public final void EMM(DirectShareTarget directShareTarget, Product product, String str, String str2, boolean z) {
        A02(new PEC(this, product, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void EMP(MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        MessagingOffPlatformShareType messagingOffPlatformShareType2 = messagingOffPlatformShareType;
        A02(new DH4(messagingOffPlatformShareType2, this, str4, str, str2, z), this, new C381819cP(str4, z, false), directShareTarget, str3);
    }

    public final void EMQ(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z, boolean z2) {
        A02(new PEH(this, savedCollection, str2, str, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void EMU(C317966o8 r12, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6 = str5;
        boolean z2 = z;
        C381819cP r7 = new C381819cP(str6, z2, false);
        A04(new DH7(this, str6, str2, str3, str4, z2), r7, directShareTarget, str, "unknown");
    }

    public final void EMV(1Xj r10, DirectShareTarget directShareTarget, String str, boolean z) {
        A03(new C40492Ad1(this, r10, str, z), new C381819cP(str, z, false), directShareTarget, 2FW.A1x, (String) null, (String) null, "unknown", false);
    }

    public final void EMc(DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new C45969DGy(this, directRoomsXma, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void EMh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        String str7 = str6;
        boolean z2 = z;
        A02(new DH9(this, str7, str3, str4, str5, str2, list, z2), this, new C381819cP(str7, z2, false), directShareTarget, str);
    }

    public final void EMi(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        String str11 = str10;
        boolean z2 = z;
        A02(new DHC(this, str11, str2, str3, str4, str5, str6, str7, str8, str9, z2), this, new C381819cP(str11, z2, false), directShareTarget, str);
    }

    public final void EMo(DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, boolean z) {
        A02(new DH5(this, user, str2, str3, str4, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public final void EN7(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new C45968DGx(this, str2, z), this, new C381819cP(str2, z, false), directShareTarget, str);
    }

    public static AnonymousClass7Z6 A00(UserSession userSession) {
        return (AnonymousClass7Z6) userSession.A01(AnonymousClass7Z6.class, new AnonymousClass7Z8(userSession));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r1 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r1 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.A6I r22, X.AnonymousClass7Z6 r23, X.C381819cP r24, X.C69343Nji r25, com.instagram.model.direct.DirectShareTarget r26, X.2FW r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            r7 = r23
            X.2Dm r0 = r7.A02
            r3 = r26
            X.3U9 r1 = r0.BYf(r3)
            com.instagram.model.direct.DirectThreadKey r12 = r1.BJz()
            com.instagram.common.session.UserSession r2 = r7.A00
            X.ODs r5 = X.OQO.A00(r2, r12)
            java.lang.Long r14 = r0.BWH(r12)
            r6 = 0
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.3S9 r0 = r1.A01
            X.3Te r8 = r0.A0s
            r11 = 0
            r13 = r27
            if (r27 == 0) goto L_0x0079
            if (r8 == 0) goto L_0x0079
            com.google.common.collect.ImmutableSet r0 = X.2FW.A07
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r8.A0G
            if (r0 == 0) goto L_0x003b
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            r10 = r0 ^ 1
            java.util.List r0 = r8.A0D
            if (r0 == 0) goto L_0x0049
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            r9 = r0 ^ 1
            java.util.List r0 = r8.A0E
            if (r0 == 0) goto L_0x0057
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            r4 = r0 ^ 1
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r8.A07
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0079
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x0079
            if (r9 != 0) goto L_0x0079
            if (r4 != 0) goto L_0x0079
            boolean r0 = X.AnonymousClass7K4.A03(r2, r6)
            if (r0 == 0) goto L_0x0079
            r11 = 1
        L_0x0079:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            X.0eK r1 = r7.A04
            java.lang.Object r9 = r1.get()
            X.1Ou r9 = (X.1Ou) r9
            r0 = r22
            X.7Z6 r8 = r0.A01
            X.B1V r4 = r0.A00
            java.lang.String r0 = r0.A02
            X.1bp r7 = r4.AXP(r5, r12, r10, r14)
            r8.A05(r7, r12, r0)
            r9.A0A(r7)
            X.2FW r4 = r7.Aqm()
            java.lang.Object r0 = r7.A05()
            java.lang.String r6 = X.C3265677h.A04(r4, r0, r6)
            java.lang.String r4 = r7.A06()
            X.MaY r0 = r7.A02
            boolean r0 = r0.A09
            X.C3265677h.A0i(r2, r12, r6, r4, r0)
            r16 = r28
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x0109
            if (r30 != 0) goto L_0x0109
            java.lang.Class<X.1cE> r19 = X.1cE.class
            r0 = r24
            java.lang.String r7 = r0.A00
            boolean r6 = r0.A02
            boolean r4 = r0.A03
            java.lang.String r0 = r0.A01
            r9 = 0
            r20 = r7
            r21 = r0
            r22 = r9
            r23 = r6
            r24 = r4
            r18 = r5
            r17 = r2
            X.MaY r10 = X.C66669Mac.A03(r17, r18, r19, r20, r21, r22, r23, r24)
            long r6 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r4
            java.lang.Long r15 = java.lang.Long.valueOf(r6)
            X.1cE r8 = new X.1cE
            r11 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x00f3
            r0 = r29
            r8.A0K = r0
        L_0x00f3:
            java.lang.Object r0 = r1.get()
            X.1Ou r0 = (X.1Ou) r0
            r0.A0A(r8)
            X.2FW r3 = X.2FW.A1g
            java.lang.String r1 = r8.A06()
            X.MaY r0 = r8.A02
            boolean r0 = r0.A09
            X.C3265677h.A0g(r2, r12, r3, r1, r0)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z6.A01(X.A6I, X.7Z6, X.9cP, X.Nji, com.instagram.model.direct.DirectShareTarget, X.2FW, java.lang.String, java.lang.String, boolean):void");
    }

    public static void A02(B1V b1v, AnonymousClass7Z6 r7, C381819cP r8, DirectShareTarget directShareTarget, String str) {
        r7.A04(b1v, r8, directShareTarget, str, "unknown");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ca, code lost:
        if (r8.B25().A00 != X.C69405Nkj.A04) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ce, code lost:
        if (r8 != null) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d4, code lost:
        if (r8.AiM() == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d6, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e0, code lost:
        if (r8.AiM().A02() != false) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e2, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e4, code lost:
        r15 = r5.A06();
        r1 = r4.A00;
        r0 = r5.A02.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f0, code lost:
        if (r3 == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f2, code lost:
        r23 = X.C273654mx.A00(301);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f8, code lost:
        r14 = r6;
        r13 = r3;
        r12.logTraceAnnotations(r13, r14, r15, r11, r2, 6, r1, r20, r0, r22, r23, r3, r25, 7, 1, (java.lang.String) null);
        r12.annotateIsReshare(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0315, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0316, code lost:
        r23 = "ig_django";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031b, code lost:
        if (r8 != null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (X.AnonymousClass796.A06(r9, r5, r4) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0152, code lost:
        switch(r16) {
            case 1: goto L_0x0156;
            case 2: goto L_0x0155;
            case 3: goto L_0x017e;
            case 4: goto L_0x0183;
            case 5: goto L_0x0188;
            case 6: goto L_0x018d;
            case 7: goto L_0x0192;
            case 8: goto L_0x0197;
            case 9: goto L_0x019c;
            case 10: goto L_0x01a5;
            case 11: goto L_0x01b1;
            default: goto L_0x0155;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0158, code lost:
        if ((r5 instanceof X.1fi) == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015a, code lost:
        r1 = ((X.1fi) r5).A04.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0166, code lost:
        if (r1 != X.1iA.A0Q) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0168, code lost:
        r0 = 70523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016e, code lost:
        if (r1 != X.1iA.A0a) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        r0 = 70524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0173, code lost:
        r1 = java.lang.Integer.valueOf(r0);
        r12 = 70501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017b, code lost:
        if (r1 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017e, code lost:
        r1 = 70520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0183, code lost:
        r1 = 70525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0188, code lost:
        r1 = 70525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018d, code lost:
        r1 = 70521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0192, code lost:
        r1 = 70521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0197, code lost:
        r1 = 70520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019c, code lost:
        r1 = 70528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a0, code lost:
        r12 = 70543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a5, code lost:
        r1 = 70521;
        r12 = 70540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b1, code lost:
        r1 = 70528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b6, code lost:
        r1 = 70522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ba, code lost:
        r12 = 70541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01be, code lost:
        r11 = new java.util.ArrayList(java.util.Arrays.asList(new java.lang.Long[]{java.lang.Long.valueOf((long) r1.intValue())}));
        r11.add(java.lang.Long.valueOf((long) r12.intValue()));
        X.C282375Cv.A03(r2, r11, 0, 6000, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(X.1bp r30, com.instagram.model.direct.DirectThreadKey r31, java.lang.String r32) {
        /*
            r29 = this;
            r10 = r29
            com.instagram.common.session.UserSession r9 = r10.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323195552476143(0x810bc100032bef, double:3.034273356930061E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r5 = r30
            r4 = r31
            if (r0 == 0) goto L_0x001c
            boolean r0 = X.AnonymousClass796.A06(r9, r5, r4)
            r3 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            if (r3 != 0) goto L_0x008d
            boolean r0 = r5 instanceof X.1du
            if (r0 != 0) goto L_0x031e
            boolean r0 = r5 instanceof X.C65561e1
            if (r0 != 0) goto L_0x031e
            boolean r0 = r5 instanceof X.1dq
            if (r0 != 0) goto L_0x031e
            boolean r0 = r5 instanceof X.1di
            if (r0 != 0) goto L_0x031e
            r6 = 4
        L_0x0030:
            X.5Cv r11 = r10.A01
            java.lang.String r2 = com.facebook.msys.mci.TraceLogger.createTraceIdForType(r6)
            if (r2 == 0) goto L_0x0271
            r0 = 50301(0xc47d, double:2.4852E-319)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.lang.String r0 = "share_sheet"
            r1 = r32
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            r0 = 70501(0x11365, double:3.4832E-319)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.add(r0)
        L_0x005c:
            r11.A04(r7, r6, r2)
            java.lang.String r0 = r5.A05
            X.C282375Cv.A02(r6, r2, r0)
            if (r3 == 0) goto L_0x006d
            r7 = 0
            r1 = 1252(0x4e4, float:1.754E-42)
            r0 = 0
            X.C282375Cv.A03(r2, r7, r6, r1, r0)
        L_0x006d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.add(r0)
            r0 = 7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.add(r0)
            r17 = 0
            r0 = 53
            r7 = 0
            X.C282375Cv.A03(r2, r11, r6, r0, r7)
            goto L_0x0090
        L_0x008d:
            r6 = 15
            goto L_0x0030
        L_0x0090:
            java.lang.String r0 = r5.A06()     // Catch:{ NumberFormatException -> 0x01e5 }
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            r1 = 1305(0x519, float:1.829E-42)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            X.C282375Cv.A03(r2, r0, r7, r1, r7)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.String r1 = r5.A02()     // Catch:{ NumberFormatException -> 0x01e5 }
            int r0 = r1.hashCode()     // Catch:{ NumberFormatException -> 0x01e5 }
            switch(r0) {
                case -1807113702: goto L_0x00b2;
                case -1507386093: goto L_0x00be;
                case -1031621161: goto L_0x00cc;
                case -550704097: goto L_0x00d7;
                case -383741099: goto L_0x00e2;
                case -143199520: goto L_0x00ed;
                case -37395819: goto L_0x00f8;
                case 296381094: goto L_0x0103;
                case 1345441876: goto L_0x010e;
                case 1831509275: goto L_0x0119;
                case 1870272601: goto L_0x0124;
                case 2046682813: goto L_0x012f;
                default: goto L_0x00b0;
            }     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x00b0:
            goto L_0x01e5
        L_0x00b2:
            java.lang.String r0 = "send_profile_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 0
            goto L_0x013d
        L_0x00be:
            r0 = 1212(0x4bc, float:1.698E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 != 0) goto L_0x0156
            goto L_0x01e5
        L_0x00cc:
            java.lang.String r0 = "send_ai_agent_profile_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 2
            goto L_0x013d
        L_0x00d7:
            java.lang.String r0 = "send_clips_mention_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 3
            goto L_0x013d
        L_0x00e2:
            java.lang.String r0 = "send_media_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 4
            goto L_0x013d
        L_0x00ed:
            java.lang.String r0 = "send_media_mention_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 5
            goto L_0x013d
        L_0x00f8:
            java.lang.String r0 = "send_reels_mention_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 6
            goto L_0x013d
        L_0x0103:
            java.lang.String r0 = "send_story_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 7
            goto L_0x013d
        L_0x010e:
            java.lang.String r0 = "send_clips_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 8
            goto L_0x013d
        L_0x0119:
            java.lang.String r0 = "send_comment_mention_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 9
            goto L_0x013d
        L_0x0124:
            java.lang.String r0 = "send_reel_share_message"
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 10
            goto L_0x013d
        L_0x012f:
            r0 = 1796(0x704, float:2.517E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r16 = 11
        L_0x013d:
            r15 = 70522(0x1137a, float:9.8822E-41)
            r14 = 70528(0x11380, float:9.8831E-41)
            r13 = 70525(0x1137d, float:9.8827E-41)
            r12 = 70520(0x11378, float:9.882E-41)
            r1 = 70521(0x11379, float:9.8821E-41)
            r11 = 70543(0x1138f, float:9.8852E-41)
            r0 = 70541(0x1138d, float:9.8849E-41)
            switch(r16) {
                case 1: goto L_0x0156;
                case 2: goto L_0x0155;
                case 3: goto L_0x017e;
                case 4: goto L_0x0183;
                case 5: goto L_0x0188;
                case 6: goto L_0x018d;
                case 7: goto L_0x0192;
                case 8: goto L_0x0197;
                case 9: goto L_0x019c;
                case 10: goto L_0x01a5;
                case 11: goto L_0x01b1;
                default: goto L_0x0155;
            }     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x0155:
            goto L_0x01b6
        L_0x0156:
            boolean r0 = r5 instanceof X.1fi     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r0 == 0) goto L_0x01e5
            r0 = r5
            X.1fi r0 = (X.1fi) r0     // Catch:{ NumberFormatException -> 0x01e5 }
            X.5yB r0 = r0.A04     // Catch:{ NumberFormatException -> 0x01e5 }
            X.1iA r1 = r0.A01     // Catch:{ NumberFormatException -> 0x01e5 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ NumberFormatException -> 0x01e5 }
            r11 = 70501(0x11365, float:9.8793E-41)
            if (r1 != r0) goto L_0x016c
            r0 = 70523(0x1137b, float:9.8824E-41)
            goto L_0x0173
        L_0x016c:
            X.1iA r0 = X.1iA.A0a     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r1 != r0) goto L_0x01e5
            r0 = 70524(0x1137c, float:9.8825E-41)
        L_0x0173:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x01e5 }
            if (r1 == 0) goto L_0x01e5
            goto L_0x01be
        L_0x017e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01a0
        L_0x0183:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01ba
        L_0x0188:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01a0
        L_0x018d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01a0
        L_0x0192:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01ba
        L_0x0197:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01ba
        L_0x019c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x01a0:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01be
        L_0x01a5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            r0 = 70540(0x1138c, float:9.8848E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01be
        L_0x01b1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x01e5 }
            goto L_0x01ba
        L_0x01b6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x01ba:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x01be:
            int r0 = r1.intValue()     // Catch:{ NumberFormatException -> 0x01e5 }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.Long[] r0 = new java.lang.Long[]{r0}     // Catch:{ NumberFormatException -> 0x01e5 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ NumberFormatException -> 0x01e5 }
            r11.<init>(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            int r0 = r12.intValue()     // Catch:{ NumberFormatException -> 0x01e5 }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            r11.add(r0)     // Catch:{ NumberFormatException -> 0x01e5 }
            r0 = 6000(0x1770, float:8.408E-42)
            X.C282375Cv.A03(r2, r11, r7, r0, r7)     // Catch:{ NumberFormatException -> 0x01e5 }
        L_0x01e5:
            java.lang.String r12 = r4.A00
            r0 = 36320644342096566(0x81096f000622b6, double:3.0326599612131167E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0271
            if (r12 == 0) goto L_0x0271
            int r1 = r12.length()
            if (r1 <= 0) goto L_0x0271
            boolean r0 = X.AnonymousClass3f0.A04(r12)
            if (r0 == 0) goto L_0x0271
            int r1 = r1 / 3
            int r13 = r1 * 2
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.MaY r0 = r5.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0218
            r14 = 131(0x83, double:6.47E-322)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r11.add(r0)
        L_0x0218:
            java.util.List r0 = r5.C6L()
            java.lang.Object r0 = r0.get(r7)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            X.797 r0 = X.AnonymousClass796.A00(r9, r5, r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0235
            r14 = 1252(0x4e4, double:6.186E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r11.add(r0)
        L_0x0235:
            java.lang.String r0 = r12.substring(r7, r1)
            long r14 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r11.add(r0)
            java.lang.String r0 = r12.substring(r1, r13)
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.add(r0)
            java.lang.String r0 = r12.substring(r13)
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.add(r0)
            r20 = 2220(0x8ac, float:3.111E-42)
            r18 = r7
            r19 = r17
            r21 = r2
            r22 = r7
            r23 = r11
            com.facebook.msys.mci.TraceLogger.logCrucialCheckpoint(r17, r18, r19, r20, r21, r22, r23)
        L_0x0271:
            boolean r0 = X.OQP.A01(r9, r3)
            if (r0 == 0) goto L_0x031e
            java.lang.String r0 = r5.A06()
            int r11 = r0.hashCode()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 3
            X.0qQ.A0B(r9, r0)
            r7 = 1
            X.Nhw r12 = X.AnonymousClass7G0.A01(r9, r1, r11, r3, r7)
            if (r12 == 0) goto L_0x031e
            r12.onStartFlow()
            if (r2 == 0) goto L_0x02aa
            r12.onLogFlowConnectId()
            r0 = 36320644342096566(0x81096f000622b6, double:3.0326599612131167E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x02aa
            java.lang.String r0 = r4.A00
            boolean r0 = X.AnonymousClass3f0.A04(r0)
            if (r0 == 0) goto L_0x02aa
            r12.onLogArmadilloTlcControlOpenThread()
        L_0x02aa:
            X.2Dm r0 = r10.A02
            X.3U9 r8 = r0.B33(r4)
            if (r8 == 0) goto L_0x0319
            boolean r0 = r8.CUG()
            if (r0 == 0) goto L_0x0319
            java.lang.String r22 = "group"
        L_0x02ba:
            X.ODs r0 = r8.B25()
            if (r0 == 0) goto L_0x02cc
            X.ODs r0 = r8.B25()
            X.Nkj r1 = r0.A00
            X.Nkj r0 = X.C69405Nkj.DISAPPEARING_MESSAGE
            r20 = 1
            if (r1 == r0) goto L_0x02d0
        L_0x02cc:
            r20 = 0
            if (r8 == 0) goto L_0x02e2
        L_0x02d0:
            X.3Tu r0 = r8.AiM()
            if (r0 == 0) goto L_0x02e2
            X.3Tu r0 = r8.AiM()
            boolean r0 = r0.A02()
            r25 = 1
            if (r0 != 0) goto L_0x02e4
        L_0x02e2:
            r25 = 0
        L_0x02e4:
            java.lang.String r15 = r5.A06()
            r18 = 6
            java.lang.String r1 = r4.A00
            X.MaY r0 = r5.A02
            boolean r0 = r0.A07
            if (r3 == 0) goto L_0x0316
            r4 = 301(0x12d, float:4.22E-43)
            java.lang.String r23 = X.C273654mx.A00(r4)
        L_0x02f8:
            r4 = 7
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r7)
            r28 = 0
            r19 = r1
            r21 = r0
            r24 = r3
            r16 = r11
            r17 = r2
            r14 = r6
            r13 = r3
            r12.logTraceAnnotations(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.annotateIsReshare(r7)
            return
        L_0x0316:
            java.lang.String r23 = "ig_django"
            goto L_0x02f8
        L_0x0319:
            java.lang.String r22 = "one_to_one"
            if (r8 == 0) goto L_0x02cc
            goto L_0x02ba
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z6.A05(X.1bp, com.instagram.model.direct.DirectThreadKey, java.lang.String):void");
    }

    public final void A06(Context context, C254933tI r22, C69343Nji nji, DirectShareTarget directShareTarget, AnonymousClass3Q2 r25, C352218Cl r26, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str2;
        boolean z3 = z;
        C69343Nji nji2 = nji;
        DirectShareTarget directShareTarget2 = directShareTarget;
        A01(new A6I(new C40498Ad7(context, r22, this, nji2, directShareTarget2, r25, r26, str4, str3, z3, z2), this, "unknown"), this, new C381819cP(z3, str4), nji2, directShareTarget2, (2FW) null, str, (String) null, false);
    }

    public final void A07(Context context, DirectShareTarget directShareTarget, String str, int i, int i2, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        DirectShareTarget directShareTarget2 = directShareTarget;
        int i3 = i;
        int i4 = i2;
        boolean z3 = z2;
        AnonymousClass3Q2 A052 = LTU.A05(context, userSession, directShareTarget2.A00(), str, i3, i4, z3);
        2Dm r2 = this.A02;
        C300925yB A002 = C63326Kv9.A00(A052);
        A002.A0A = z3;
        DirectThreadKey BJy = r2.BYf(directShareTarget2).BJz();
        C70621ODs A003 = OQO.A00(userSession, BJy);
        float f = (float) i3;
        float f2 = (float) i4;
        1fV r7 = new 1fV((DirectForwardingParams) null, C66669Mac.A04(userSession, A003, 1cX.class, (String) null, (String) null, z), A002, BJy, r2.BWH(BJy), f, f2, System.currentTimeMillis() * 1000);
        ((1Ou) this.A04.get()).A0A(r7);
        C3265677h.A0i(userSession, BJy, C3265677h.A04(r7.Aqm(), r7.A05(), false), r7.A06(), r7.A02.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0119, code lost:
        if (r16.B25().A00 != X.C69405Nkj.A04) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x011d, code lost:
        if (r16 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0123, code lost:
        if (r16.AiM() == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0125, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012f, code lost:
        if (r16.AiM().A02() != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0131, code lost:
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0133, code lost:
        r21 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0135, code lost:
        if (r1 == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0137, code lost:
        r21 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0139, code lost:
        r10 = r3.A05;
        r9 = r4.A00;
        r4 = r3.A02.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0141, code lost:
        if (r1 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0143, code lost:
        r30 = X.C273654mx.A00(301);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        r19.logTraceAnnotations(r1, r21, r10, r12, (java.lang.String) null, 4, r9, r27, r4, r29, r30, r1, r32, 7, 1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x016a, code lost:
        r30 = "ig_django";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016f, code lost:
        if (r16 != null) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AWR(com.instagram.direct.model.DirectForwardingParams r44, com.instagram.model.direct.DirectShareTarget r45, X.2FW r46, java.lang.String r47, java.lang.String r48, boolean r49) {
        /*
            r43 = this;
            r40 = 0
            java.lang.String r36 = ""
            r8 = 0
            r2 = r43
            X.2Dm r9 = r2.A02
            r42 = r45
            r0 = r42
            X.3U9 r0 = r9.BYf(r0)
            com.instagram.model.direct.DirectThreadKey r6 = r0.BJz()
            com.instagram.common.session.UserSession r0 = r2.A00
            X.ODs r13 = X.OQO.A00(r0, r6)
            java.lang.Long r14 = r9.BWH(r6)
            r1 = 2
            X.0qQ.A0B(r0, r1)
            X.0eK r1 = r2.A04
            r41 = r1
            java.lang.Object r7 = r41.get()
            X.1Ou r7 = (X.1Ou) r7
            java.lang.Class<X.1cX> r2 = X.1cX.class
            r37 = r48
            r15 = r49
            r1 = r37
            X.MaY r1 = X.C66669Mac.A05(r0, r13, r2, r1, r15)
            long r4 = java.lang.System.currentTimeMillis()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r17
            X.1gB r3 = new X.1gB
            r3.<init>(r1)
            r1 = -1
            r3.A00 = r1
            r2 = r46
            r3.A03 = r2
            r3.A02 = r6
            r3.A04 = r14
            r3.A00 = r4
            r1 = r44
            r3.A01 = r1
            X.2FW r5 = X.2FW.A1g
            if (r2 != r5) goto L_0x00dd
            boolean r9 = X.OYx.A01(r0, r3)
            java.lang.String r1 = r3.A05
            int r4 = r1.hashCode()
            r1 = 1
            X.OYx.A00(r0, r4, r9, r1)
            X.OYx r1 = X.O58.A01
            r1.A02(r0, r3, r8)
        L_0x006f:
            java.lang.String r1 = r3.A05
            int r1 = r1.hashCode()
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r4 = X.AnonymousClass7G0.A00(r0, r1)
            r1 = 1
            if (r4 == 0) goto L_0x007f
            r4.annotateIsForward(r1)
        L_0x007f:
            r7.A0A(r3)
            java.lang.String r4 = X.C3265677h.A04(r2, r8, r1)
            java.lang.String r2 = r3.A05
            X.MaY r1 = r3.A02
            boolean r1 = r1.A09
            X.C3265677h.A0i(r0, r6, r4, r2, r1)
            r25 = r47
            boolean r1 = android.text.TextUtils.isEmpty(r25)
            if (r1 != 0) goto L_0x00dc
            java.lang.Class<X.1cE> r35 = X.1cE.class
            r33 = r0
            r34 = r13
            r38 = r8
            r39 = r15
            X.MaY r19 = X.C66669Mac.A03(r33, r34, r35, r36, r37, r38, r39, r40)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 * r17
            java.lang.Long r24 = java.lang.Long.valueOf(r1)
            X.1cE r3 = new X.1cE
            r17 = r3
            r18 = r8
            r20 = r8
            r21 = r6
            r22 = r8
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = r42.A0Q()
            if (r1 == 0) goto L_0x00c8
            r3.A0K = r8
        L_0x00c8:
            java.lang.Object r1 = r41.get()
            X.1Ou r1 = (X.1Ou) r1
            r1.A0A(r3)
            java.lang.String r2 = r3.A06()
            X.MaY r1 = r3.A02
            boolean r1 = r1.A09
            X.C3265677h.A0g(r0, r6, r5, r2, r1)
        L_0x00dc:
            return
        L_0x00dd:
            java.lang.String r1 = r3.A05
            int r12 = r1.hashCode()
            com.instagram.model.direct.DirectThreadKey r4 = r3.C6K()
            X.797 r1 = X.AnonymousClass796.A00(r0, r3, r4)
            boolean r1 = r1.A00()
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r11 = 1
            X.Nhw r19 = X.AnonymousClass7G0.A01(r0, r10, r12, r1, r11)
            if (r19 == 0) goto L_0x006f
            r19.onStartFlow()
            X.3U9 r16 = r9.B33(r4)
            if (r16 == 0) goto L_0x016d
            boolean r9 = r16.CUG()
            if (r9 == 0) goto L_0x016d
            java.lang.String r29 = "group"
        L_0x0109:
            X.ODs r9 = r16.B25()
            if (r9 == 0) goto L_0x011b
            X.ODs r9 = r16.B25()
            X.Nkj r10 = r9.A00
            X.Nkj r9 = X.C69405Nkj.DISAPPEARING_MESSAGE
            r27 = 1
            if (r10 == r9) goto L_0x011f
        L_0x011b:
            r27 = 0
            if (r16 == 0) goto L_0x0131
        L_0x011f:
            X.3Tu r9 = r16.AiM()
            if (r9 == 0) goto L_0x0131
            X.3Tu r9 = r16.AiM()
            boolean r9 = r9.A02()
            r32 = 1
            if (r9 != 0) goto L_0x0133
        L_0x0131:
            r32 = 0
        L_0x0133:
            r21 = 4
            if (r1 == 0) goto L_0x0139
            r21 = 15
        L_0x0139:
            java.lang.String r10 = r3.A05
            java.lang.String r9 = r4.A00
            X.MaY r4 = r3.A02
            boolean r4 = r4.A07
            if (r1 == 0) goto L_0x016a
            r16 = 301(0x12d, float:4.22E-43)
            java.lang.String r30 = X.C273654mx.A00(r16)
        L_0x0149:
            r16 = 7
            java.lang.Integer r33 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r11)
            r25 = 4
            r24 = r8
            r26 = r9
            r28 = r4
            r31 = r1
            r35 = r8
            r20 = r1
            r22 = r10
            r23 = r12
            r19.logTraceAnnotations(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x006f
        L_0x016a:
            java.lang.String r30 = "ig_django"
            goto L_0x0149
        L_0x016d:
            java.lang.String r29 = "one_to_one"
            if (r16 == 0) goto L_0x011b
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z6.AWR(com.instagram.direct.model.DirectForwardingParams, com.instagram.model.direct.DirectShareTarget, X.2FW, java.lang.String, java.lang.String, boolean):void");
    }

    public final void ELU(SocialContextType socialContextType, 1Xj r10, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        SocialContextType socialContextType2 = socialContextType;
        A02(new DH3(socialContextType2, this, r10, str2, str3, z), this, new C381819cP(z, str2), directShareTarget, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r4.equals(X.C66579MXk.A00(124)) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ELY(X.C317966o8 r21, X.1Xj r22, com.instagram.model.direct.DirectPendingLayeredXma r23, com.instagram.model.direct.DirectShareTarget r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            r20 = this;
            r2 = r22
            java.lang.String r1 = r2.A2Z()
            boolean r0 = r2.A5G()
            r5 = r25
            if (r1 != 0) goto L_0x005d
            r8 = 0
        L_0x000f:
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            r17 = 0
            if (r0 == 0) goto L_0x005a
            X.1Xy r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            java.lang.String r7 = r0.getUsername()
        L_0x0023:
            r16 = r26
            r4 = r27
            if (r27 == 0) goto L_0x0037
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.equals(r0)
            r6 = r16
            if (r0 == 0) goto L_0x0039
        L_0x0037:
            r6 = r17
        L_0x0039:
            r0 = 0
            X.9cP r13 = new X.9cP
            r9 = r28
            r13.<init>(r4, r9, r0)
            X.DHB r0 = new X.DHB
            r1 = r20
            r3 = r23
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.2FW r15 = X.2FW.A0c
            java.lang.String r18 = "unknown"
            r14 = r24
            r11 = r1
            r12 = r0
            r19 = r10
            r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005a:
            r7 = r17
            goto L_0x0023
        L_0x005d:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            if (r0 == 0) goto L_0x006e
            r0 = 3260(0xcbc, float:4.568E-42)
        L_0x0065:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = X.0mp.A06(r0, r1)
            goto L_0x000f
        L_0x006e:
            r0 = 3259(0xcbb, float:4.567E-42)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z6.ELY(X.6o8, X.1Xj, com.instagram.model.direct.DirectPendingLayeredXma, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void ELn(C48097EVp eVp, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, long j, boolean z) {
        String str4 = str3;
        boolean z2 = z;
        A02(new DH8(eVp, this, l, str4, str, j, z2), this, new C381819cP(z2, str4), directShareTarget, str2);
    }

    public final void ELo(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new WVb(this, infoCenterFactShareInfoIntf, str2, z), this, new C381819cP(z, str2), directShareTarget, str);
    }

    public final void ELv(Context context, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z) {
        boolean z2 = z;
        A02(new PEJ(context, this, str, str2, str5, z2), this, new C381819cP(z2, str4), directShareTarget, str3);
    }

    public final void ELz(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        A02(new C40494Ad3(this, str3, str, z), this, new C381819cP(z, str3), directShareTarget, str2);
    }

    public final void EM0(1Xj r30, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        2Dm r1 = this.A02;
        DirectShareTarget directShareTarget2 = directShareTarget;
        DirectThreadKey BJy = r1.BYf(directShareTarget2).BJz();
        Long BWH = r1.BWH(BJy);
        UserSession userSession = this.A00;
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        UserSession userSession2 = userSession;
        C66665MaY A032 = C66669Mac.A03(userSession2, OQO.A00(userSession, BJy), AnonymousClass1dS.class, str5, str4, (String) null, z3, false);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        String str6 = null;
        1Xj r11 = r30;
        r11.getClass();
        Integer num = AnonymousClass05K.A00;
        String str7 = str;
        boolean z4 = z;
        if (z) {
            str6 = str7;
        }
        AnonymousClass1dS A002 = C44707Cjb.A00((SocialContextType) null, (DirectForwardingParams) null, A032, r11, BJy, num, BWH, (String) null, str6, currentTimeMillis, false, z4, false);
        C381819cP r6 = new C381819cP(str4, str5, z3, false);
        boolean z5 = z4;
        A01(new A6I(new C40487Acw(A002), this, "unknown"), this, r6, (C69343Nji) null, directShareTarget2, (2FW) null, str7, (String) null, z5);
    }

    public final void EME(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        boolean z2 = z;
        String str5 = str2;
        DirectShareTarget directShareTarget2 = directShareTarget;
        A02(new C40491Ad0(this, str4, str5, z2), this, new C381819cP(z2, str4), directShareTarget2, str);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36328602916109773L)) {
            0qQ.A0B(userSession, 1);
            1vn A012 = 1vm.A01(userSession);
            ArrayList A0B = directShareTarget2.A0B();
            0qQ.A0B(str5, 1);
            2IV r4 = new 2IV();
            r4.A09(str5, "access_token");
            r4.A05("sponsors", A0B);
            2IS r3 = new 2IS();
            2IS r1 = new 2IS();
            r3.A00(r4, "data");
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            1ES.A05(AnonymousClass9D0.A00(A012.A03(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "AddSharedWithSponsorToAdsBoostPostAccessTokenMutation", r3.getParamsCopy(), r1.getParamsCopy(), BYJ.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_creator_ads_add_shared_with_sponsor_to_ads_boost_post_access_token", new ArrayList()))), -5, 3, false, false);
        }
    }

    public final void EMI(Context context, C254933tI r14, DirectShareTarget directShareTarget, AnonymousClass3Q2 r16, C352218Cl r17, String str, String str2, String str3, boolean z) {
        C69343Nji nji;
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            nji = C69343Nji.MEDIA;
        } else {
            nji = C69343Nji.DEFAULT;
        }
        A06(context, r14, nji, directShareTarget, r16, r17, str4, str2, str3, z, false);
    }

    public final void EML(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        A02(new DH0(this, str3, str, str2, z), this, new C381819cP(z, str3), directShareTarget, str2);
    }

    public final void EMN(C317966o8 r7, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, boolean z) {
        A04(new C45970DGz(this, user, str2, z), new C381819cP(str2, z, false), directShareTarget, str, "share_sheet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
        if (r8 != null) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EMT(X.C381429bk r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r32 = this;
            java.lang.String r16 = "reel"
            r7 = r32
            X.2Dm r2 = r7.A02
            r0 = r33
            com.instagram.model.direct.DirectShareTarget r1 = r0.A01
            X.3U9 r1 = r2.BYf(r1)
            com.instagram.model.direct.DirectThreadKey r6 = r1.BJz()
            java.lang.Long r20 = r2.BWH(r6)
            com.instagram.model.direct.gifs.DirectAnimatedMedia r2 = r0.A02
            com.instagram.common.session.UserSession r5 = r7.A00
            java.lang.Class<X.1cr> r10 = X.C65481cr.class
            boolean r1 = r0.A0K
            X.ODs r9 = X.OQO.A00(r5, r6)
            r4 = 0
            r15 = 0
            r12 = r34
            r11 = r35
            r8 = r5
            r13 = r4
            r14 = r1
            X.MaY r18 = X.C66669Mac.A03(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = r0.A0I
            r31 = r1
            java.lang.String r10 = r0.A0H
            X.1Xj r1 = r0.A00
            r30 = r1
            java.lang.String r1 = r0.A0J
            r24 = r1
            java.lang.String r9 = r0.A0G
            java.lang.String r8 = r0.A07
            java.lang.String r1 = r0.A09
            r29 = r1
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A03
            r28 = r1
            if (r2 == 0) goto L_0x00fa
            java.lang.String r1 = r2.A05
            r27 = r1
            boolean r3 = r2.A06
        L_0x0051:
            java.lang.String r1 = r0.A0D
            r26 = r1
            java.lang.Boolean r15 = r0.A05
            java.lang.String r14 = r0.A0B
            java.lang.String r13 = r0.A0A
            long r21 = java.lang.System.currentTimeMillis()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r1
            java.lang.String r1 = r0.A0E
            r23 = r1
            java.lang.String r12 = r0.A0C
            java.lang.String r11 = r0.A08
            java.lang.Boolean r2 = r0.A04
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r5)
            X.27E r1 = r0.A01
            boolean r0 = r1 instanceof X.C293135kC
            if (r0 == 0) goto L_0x00f8
            X.5kC r1 = (X.C293135kC) r1
            X.5kB r0 = r1.A00
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00f8
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0086:
            X.1cr r0 = new X.1cr
            r17 = r0
            r19 = r6
            r17.<init>(r18, r19, r20, r21)
            r0.A0I = r10
            if (r9 != 0) goto L_0x0097
            r25 = 0
            if (r8 == 0) goto L_0x0099
        L_0x0097:
            r25 = 1
        L_0x0099:
            X.7FN r10 = new X.7FN
            r19 = r24
            r20 = r31
            r21 = r26
            r22 = r14
            r24 = r8
            r17 = r10
            r18 = r30
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A00 = r10
            r0.A0H = r9
            r0.A08 = r8
            r8 = r29
            r0.A0A = r8
            r8 = r27
            r0.A0D = r8
            r0.A0K = r3
            r0.A0E = r14
            r0.A0C = r13
            r3 = r26
            r0.A0G = r3
            r0.A0B = r4
            r0.A05 = r15
            r0.A06 = r4
            r0.A0F = r12
            r3 = r28
            r0.A01 = r3
            r0.A02 = r4
            r0.A09 = r11
            r0.A03 = r4
            r0.A04 = r2
            r0.A07 = r1
            r1 = r16
            r7.A05(r0, r6, r1)
            X.0eK r1 = r7.A04
            java.lang.Object r1 = r1.get()
            X.1Ou r1 = (X.1Ou) r1
            r1.A0A(r0)
            X.2FW r2 = X.2FW.A1T
            java.lang.String r1 = r0.A06()
            X.MaY r0 = r0.A02
            boolean r0 = r0.A09
            X.C3265677h.A0g(r5, r6, r2, r1, r0)
            return
        L_0x00f8:
            r1 = r4
            goto L_0x0086
        L_0x00fa:
            r27 = r4
            r3 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z6.EMT(X.9bk, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void EMe(DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        A02(new C40489Acy(this, str2, z), this, new C381819cP(z, str2), directShareTarget, str);
    }

    public final void EMm(C381429bk r18, String str) {
        2Dm r3 = this.A02;
        C381429bk r1 = r18;
        DirectThreadKey BJy = r3.BYf(r1.A01).BJz();
        Long BWH = r3.BWH(BJy);
        UserSession userSession = this.A00;
        C70621ODs A002 = OQO.A00(userSession, BJy);
        String str2 = r1.A0J;
        String str3 = r1.A0B;
        String str4 = r1.A0C;
        String str5 = r1.A0D;
        String str6 = r1.A0F;
        1bp r11 = new 1bp(C66669Mac.A04(userSession, A002, C65481cr.class, str, (String) null, false), BJy, BWH, System.currentTimeMillis() * 1000);
        r11.A01 = str6;
        r11.A00 = new QP5(str2, str3, str4, str5, 10);
        ((1Ou) this.A04.get()).A0A(r11);
        C3265677h.A0g(userSession, BJy, 2FW.A0y, r11.A06(), r11.A02.A09);
    }

    public final void EMn(C317966o8 r10, C381819cP r11, 1Xj r12, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        A04(new PEK(this, r11, r12, str, str2), r11, directShareTarget, str3, str4);
    }

    @Deprecated
    public final void EMp(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        throw new IllegalStateException("Stub");
    }

    public final void EMx(C69343Nji nji, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z) {
        DirectThreadKey BJy = this.A02.BYf(directShareTarget).BJz();
        UserSession userSession = this.A00;
        OQO.A00(userSession, BJy);
        0qQ.A0B(userSession, 0);
        C71052OaU.A00((N49) null, userSession, (C70766OKm) null, (C254933tI) null, (SendMentionData$MentionData) null, (OCA) null, nji, BJy, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str, NetInfoModule.CONNECTION_TYPE_NONE, str2, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, z, false, false);
    }

    public final void EN0(Context context, QP5 qp5, C254933tI r32, DirectShareTarget directShareTarget, ClipInfo clipInfo, AnonymousClass3Q2 r35, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        C69343Nji nji;
        String str7 = str2;
        if (!TextUtils.isEmpty(str7)) {
            nji = C69343Nji.MEDIA;
        } else {
            nji = C69343Nji.DEFAULT;
        }
        String str8 = str3;
        boolean z4 = z;
        C381819cP r2 = new C381819cP(z4, str8);
        C254933tI r6 = r32;
        QP5 qp52 = qp5;
        Context context2 = context;
        String str9 = str6;
        ClipInfo clipInfo2 = clipInfo;
        AnonymousClass3Q2 r10 = r35;
        Boolean bool2 = bool;
        String str10 = str;
        boolean z5 = z4;
        A01(new A6I(new PEL(context2, qp52, r6, this, nji, clipInfo2, r10, bool2, str10, str8, str9, str4, str5, z5, z2, false, z3), this, "unknown"), this, r2, nji, directShareTarget, (2FW) null, str7, (String) null, false);
    }

    public AnonymousClass7Z6(UserSession userSession, C61410nE r3, 2Dm r4, ReelStore reelStore, AnonymousClass0eK r6) {
        this.A00 = userSession;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r3;
        this.A03 = reelStore;
        this.A01 = C282375Cv.A00(userSession);
    }

    public final void ELV(SocialContextType socialContextType, C317966o8 r20, 1Xj r21, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        String A002 = HZX.A00();
        boolean z2 = false;
        SocialContextType socialContextType2 = socialContextType;
        if (socialContextType2 == SocialContextType.REEL_EXTERNAL_SHARE) {
            z2 = true;
        }
        String str5 = str2;
        boolean z3 = z;
        C381819cP r11 = new C381819cP(str5, z3, z2);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str6 = str;
        C40495Ad4 ad4 = new C40495Ad4(socialContextType2, this, r21, directShareTarget2, str5, A002, str6, str4, z3);
        2FW r13 = 2FW.A0W;
        boolean z4 = false;
        if (str4 != null) {
            z4 = true;
        }
        A03(ad4, r11, directShareTarget2, r13, str6, A002, str3, z4);
    }

    public final void EM1(SocialContextType socialContextType, C317966o8 r21, C381819cP r22, 1Xj r23, DirectShareTarget directShareTarget, Long l, String str, String str2) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000);
        String A002 = HZX.A00();
        C381819cP r4 = r22;
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str3 = str;
        A01(new A6I(new C40497Ad6(socialContextType, this, r4, r23, directShareTarget2, valueOf, A002, str3, str2), this, "unknown"), this, r4, (C69343Nji) null, directShareTarget2, (2FW) null, str3, A002, false);
    }
}
