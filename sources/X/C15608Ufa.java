package X;

import android.app.Dialog;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.Ufa  reason: case insensitive filesystem */
public final class C15608Ufa extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C15608Ufa(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj5;
        this.A02 = obj4;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A01 = obj6;
    }

    public final void onFail(C268654dm r12) {
        int A0D;
        String str;
        AnonymousClass3FZ r7;
        Boolean bool;
        Boolean bool2;
        int i;
        AnonymousClass3FZ r2;
        String str2;
        C16538Uwi uwi;
        String str3;
        int i2;
        switch (this.A00) {
            case 0:
                A0D = AnonymousClass7TG.A0D(r12, 968635188);
                String str4 = null;
                if (r12 instanceof C268674do) {
                    Throwable A012 = r12.A01();
                    if (A012 == null) {
                        str = "ApiError.error is null";
                    } else if (!(A012 instanceof C16693V1w)) {
                        str = "ApiError.error is not a GraphQLException";
                    } else {
                        String A002 = Pxd.A00(91);
                        0qQ.A0C(A012, A002);
                        ImmutableList immutableList = ((C16693V1w) A012).A00;
                        if (immutableList.isEmpty()) {
                            str = "ApiError.error.errors is empty";
                        } else {
                            0qQ.A0C(A012, A002);
                            C249803kO A0J = C66580MXl.A0J(immutableList);
                            str = null;
                            while (A0J.hasNext()) {
                                C13802ThL thL = (C13802ThL) AnonymousClass7TF.A0a(A0J);
                                if (thL.getDescription() != null) {
                                    if (str == null) {
                                        str = thL.getDescription();
                                    } else {
                                        str = 002.A0g(str, " | ", thL.getDescription());
                                    }
                                }
                            }
                            if (str == null) {
                                str = "IGraphQLError.description is unavailable.";
                            }
                        }
                    }
                } else {
                    Throwable A013 = r12.A01();
                    if (A013 == null || (str = A013.toString()) == null) {
                        str = "ApiError unavailable. Device is likely offline";
                    }
                }
                C71132OdV.A03((Context) this.A03, (BugReportComposerViewModel) this.A06, (BugReport) this.A02, (0lg) this.A04, true);
                AnonymousClass3JC r0 = (AnonymousClass3JC) r12.A00();
                if (r0 == null || (r2 = (AnonymousClass3FZ) r0.A01) == null) {
                    r7 = null;
                } else {
                    r7 = r2.A00(UJP.class, "ig_bug_submit");
                }
                C70758OKe oKe = (C70758OKe) this.A05;
                if (r7 != null) {
                    bool = Boolean.valueOf(r7.A06("is_retryable"));
                    bool2 = Boolean.valueOf(r7.A06("is_prohibited"));
                    str4 = r7.A05("error_message");
                } else {
                    bool = null;
                    bool2 = null;
                }
                oKe.A00(bool, bool2, str, str4);
                i = 387362835;
                break;
            case 1:
                A0D = AnonymousClass7TG.A0D(r12, -501021254);
                C15608Ufa.super.onFail(r12);
                WGU.A00((UserSession) this.A06).A0L(C16678UzE.FEED_UPLOADED, "promote_tooltip_fetch", r12.A01());
                i = -1141943835;
                break;
            case 2:
                A0D = AnonymousClass7TG.A0D(r12, -929170349);
                ((Dialog) this.A02).dismiss();
                C59689JTv.A0C((Context) this.A01, "hideSuperlativeCard_unknown_error_occured");
                Throwable A014 = r12.A01();
                if (A014 == null || (str2 = A014.getMessage()) == null) {
                    str2 = "";
                }
                C14164Tr2.A01("Menu Click", 002.A0R("Delete API failed - ", str2));
                ((C273384mU) this.A04).EHd();
                i = 983618050;
                break;
            case 3:
                A0D = AnonymousClass0fD.A03(-127262819);
                C56669I6y.A02((Context) this.A03, (AnonymousClass0iw) this.A01, (UserSession) this.A06, (SavedCollection) this.A02, (Runnable) this.A05, (List) this.A04);
                i = -1417359824;
                break;
            default:
                A0D = AnonymousClass7TG.A0D(r12, 1744190793);
                C15608Ufa.super.onFail(r12);
                C17938ViT viT = (C17938ViT) this.A06;
                C310316an r22 = viT.A08;
                C45465Cwy cwy = (C45465Cwy) this.A04;
                if (cwy.A01() == UpcomingEventReminderAction.SET_REMINDER) {
                    uwi = C16538Uwi.SET_REMINDER;
                } else {
                    uwi = C16538Uwi.UNSET_REMINDER;
                }
                Throwable A015 = r12.A01();
                String str5 = null;
                if (A015 != null) {
                    str3 = A015.getMessage();
                } else {
                    str3 = null;
                }
                r22.A01(uwi, str3);
                C310306am r6 = viT.A07;
                UpcomingEvent upcomingEvent = (UpcomingEvent) this.A01;
                1Xj r02 = (1Xj) this.A02;
                if (r02 != null) {
                    str5 = r02.getId();
                }
                C17514VYs vYs = (C17514VYs) this.A03;
                if (vYs.A03) {
                    i2 = 3460;
                } else {
                    i2 = 3459;
                }
                r6.A04(upcomingEvent, str5, C273654mx.A00(i2), vYs.A02);
                if (r12 instanceof C268674do) {
                    viT.A06.A0N(cwy);
                    viT.A03.A00(new WQA(upcomingEvent));
                    C70823OMv oMv = (C70823OMv) this.A05;
                    if (oMv != null) {
                        oMv.A00();
                    }
                    X7A x7a = viT.A00;
                    if (x7a != null) {
                        x7a.DEZ(upcomingEvent);
                    }
                }
                i = 1106112941;
                break;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onStart() {
        if (2 - this.A00 != 0) {
            C15608Ufa.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(1882400984);
        AnonymousClass0fN.A00((Dialog) this.A02);
        AnonymousClass0fD.A0A(1929668787, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a0, code lost:
        X.C41845B3m.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03a7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02de, code lost:
        if (r11 != null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0331, code lost:
        if (r11 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0335, code lost:
        if (r11 != null) goto L_0x0319;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r3 = r24
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01b1;
                case 1: goto L_0x014b;
                case 2: goto L_0x00d7;
                case 3: goto L_0x007c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -403459622(0xffffffffe7f3b1da, float:-2.3016317E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -2045804514(0xffffffff860f801e, float:-2.6989436E-35)
            int r5 = X.AnonymousClass7TG.A0D(r3, r2)
            X.C15608Ufa.super.onSuccess(r3)
            java.lang.Object r7 = r1.A04
            X.Cwy r7 = (X.C45465Cwy) r7
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r3 = r7.A01()
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r2 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            boolean r4 = X.AnonymousClass7TF.A1W(r3, r2)
            java.lang.Object r6 = r1.A06
            X.ViT r6 = (X.C17938ViT) r6
            X.6an r3 = r6.A08
            if (r4 == 0) goto L_0x0079
            X.Uwi r2 = X.C16538Uwi.SET_REMINDER
        L_0x0032:
            r3.A00(r2)
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.UpcomingEvent r3 = (com.instagram.user.model.UpcomingEvent) r3
            X.Cwd r2 = new X.Cwd
            r2.<init>(r3)
            r2.A0E = r4
            com.instagram.user.model.UpcomingEvent r4 = r2.A00()
            X.6ak r2 = r6.A09
            r2.A01(r4)
            X.2fP r2 = r6.A06
            r2.A0N(r7)
            X.1Ng r3 = r6.A03
            X.WQA r2 = new X.WQA
            r2.<init>(r4)
            r3.A00(r2)
            java.lang.Object r2 = r1.A05
            X.OMv r2 = (X.C70823OMv) r2
            if (r2 == 0) goto L_0x0065
            boolean r1 = r4.getReminderEnabled()
            r2.A01(r1)
        L_0x0065:
            X.X7A r1 = r6.A00
            if (r1 == 0) goto L_0x006c
            r1.DoZ(r4)
        L_0x006c:
            r1 = -1825400338(0xffffffff933299ee, float:-2.2542652E-27)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 846840152(0x3279c158, float:1.4537669E-8)
        L_0x0075:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0079:
            X.Uwi r2 = X.C16538Uwi.UNSET_REMINDER
            goto L_0x0032
        L_0x007c:
            r0 = 1295736685(0x4d3b5f6d, float:1.96474576E8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            r2 = -1686752036(0xffffffff9b7634dc, float:-2.0365723E-22)
            int r9 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r1.A03
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r1.A04
            java.util.List r4 = (java.util.List) r4
            r2 = 0
            X.1Xj r8 = X.DbZ.A0T(r4, r2)
            int r7 = r4.size()
            X.C51973G9u.A1E(r5, r3, r8)
            X.6ap r6 = new X.6ap
            r6.<init>()
            android.content.res.Resources r5 = r5.getResources()
            r4 = 2131820942(0x7f11018e, float:1.9274613E38)
            java.lang.String r2 = r3.A0G
            java.lang.Object[] r2 = X.C51968G9o.A1Z(r2, r7)
            java.lang.String r2 = r5.getQuantityString(r4, r7, r2)
            r6.A0D = r2
            com.instagram.common.typedurl.ImageUrl r2 = r8.A1Q()
            r6.A09 = r2
            r6.A03()
            X.I6V.A04(r6)
            java.lang.Object r1 = r1.A05
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x00cd
            r1.run()
        L_0x00cd:
            r1 = 309560147(0x12738353, float:7.683915E-28)
            X.AnonymousClass0fD.A0A(r1, r9)
            r1 = 2084007843(0x7c376fa3, float:3.8098183E36)
            goto L_0x0075
        L_0x00d7:
            r0 = 376266385(0x166d5e91, float:1.9174547E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DuY r3 = (X.C47305DuY) r3
            r2 = 1775870923(0x69d9a3cb, float:3.28888E25)
            int r7 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r2 = r1.A06
            X.WPh r2 = (X.C19201WPh) r2
            com.instagram.common.session.UserSession r8 = r2.A0B
            com.instagram.reels.store.ReelStore r5 = X.1OP.A05(r8)
            X.G8W r2 = r3.A00
            if (r2 == 0) goto L_0x03a0
            X.FTX r2 = (X.FTX) r2
            X.3HX r3 = r2.A00
            if (r3 == 0) goto L_0x0115
            X.1E5 r2 = X.1E4.A00(r8)
            X.3HX r4 = r3.FEr(r2)
            com.instagram.model.reels.Reel r2 = r5.A0I(r4, r6)
            r2.A0R(r8)
            X.LOR r3 = X.LOR.A01
            X.3IP r2 = r4.A0F
            r3.A01(r2)
        L_0x0115:
            X.Tr2 r3 = X.C14164Tr2.A00
            java.lang.Object r6 = r1.A03
            X.3uh r6 = (X.C255773uh) r6
            java.lang.Object r5 = r1.A05
            X.3BQ r5 = (X.AnonymousClass3BQ) r5
            boolean r2 = r6.A1k()
            if (r2 == 0) goto L_0x0132
            X.0wc r4 = X.AnonymousClass0kN.A01(r3, r8)
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            java.lang.String r2 = "ig_story_standouts_card_delete"
            X.C13990Tnq.A1J(r4, r6, r5, r2, r3)
        L_0x0132:
            java.lang.Object r2 = r1.A02
            android.app.Dialog r2 = (android.app.Dialog) r2
            r2.dismiss()
            java.lang.Object r1 = r1.A04
            X.4mU r1 = (X.C273384mU) r1
            r1.EHd()
            r1 = 788004875(0x2ef8000b, float:1.1277742E-10)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -1262777591(0xffffffffb4bb8b09, float:-3.4932626E-7)
            goto L_0x0075
        L_0x014b:
            r0 = -1309032892(0xffffffffb1f9be44, float:-7.2684845E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DuV r3 = (X.C47302DuV) r3
            r2 = 1802462440(0x6b6f64e8, float:2.8940979E26)
            int r6 = X.AnonymousClass7TG.A0D(r3, r2)
            X.C15608Ufa.super.onSuccess(r3)
            X.G8V r2 = r3.A01
            if (r2 == 0) goto L_0x03a0
            X.Dsi r2 = (X.C47196Dsi) r2
            com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum r3 = r2.A00
            if (r3 == 0) goto L_0x01a6
            com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum r2 = com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum.FEED_AFTER_PARTY_ELIGIBLE
            if (r3 != r2) goto L_0x01a6
            java.lang.Object r9 = r1.A03
            X.1Xj r9 = (X.1Xj) r9
            r2 = 1
            X.1Xy r3 = r9.A0C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.EjY(r2)
            java.lang.Object r2 = r1.A06
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.WGU r5 = X.WGU.A00(r2)
            X.UzE r4 = X.C16678UzE.FEED_UPLOADED
            java.lang.String r3 = "feed_uploaded_tooltip"
            java.lang.String r2 = "home_screen"
            r5.A01 = r2
            r5.A0H(r4, r3)
            java.lang.Object r7 = r1.A01
            X.41J r7 = (X.AnonymousClass41J) r7
            java.lang.Object r10 = r1.A05
            X.3W1 r10 = (X.AnonymousClass3W1) r10
            java.lang.Object r8 = r1.A04
            android.view.View r8 = (android.view.View) r8
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.Object r1 = r1.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r12 = r1.getModuleName()
            r7.Ev5(r8, r9, r10, r11, r12)
        L_0x01a6:
            r1 = 768549997(0x2dcf246d, float:2.3549352E-11)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 417759994(0x18e682fa, float:5.958586E-24)
            goto L_0x0075
        L_0x01b1:
            r0 = 1190457743(0x46f4f18f, float:31352.78)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r2 = -1316389813(0xffffffffb1897c4b, float:-4.0013552E-9)
            int r10 = X.AnonymousClass0fD.A03(r2)
            r9 = 0
            X.0qQ.A0B(r3, r9)
            java.lang.Object r13 = r3.A01
            r11 = r13
            X.3FZ r11 = (X.AnonymousClass3FZ) r11
            if (r11 == 0) goto L_0x02c2
            java.lang.Class<X.UJP> r3 = X.UJP.class
            java.lang.String r2 = "ig_bug_submit"
            X.3FZ r3 = r11.A00(r3, r2)
            if (r3 == 0) goto L_0x02c2
            java.lang.String r2 = "bug_id"
            java.lang.String r2 = r3.A05(r2)
            if (r2 == 0) goto L_0x02c2
            java.lang.Long r8 = X.AnonymousClass7TE.A10(r2)
            if (r8 == 0) goto L_0x02c2
            X.4Cq r2 = X.C71132OdV.A01
            java.lang.Object r6 = r1.A03
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r1.A04
            X.0lg r7 = (X.0lg) r7
            java.lang.String r4 = X.2Yu.A0K(r6)
            X.0qQ.A07(r4)
            r3 = 2131954343(0x7f130aa7, float:1.9545183E38)
            r22 = 1
            java.lang.String r17 = X.DbY.A0c(r6, r4, r3)
            r2 = 2131954341(0x7f130aa5, float:1.9545178E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r6, r2)
            r2 = 2130969230(0x7f04028e, float:1.7547136E38)
            r20 = 2131239376(0x7f0821d0, float:1.8095057E38)
            int r2 = X.2Yu.A0H(r6, r2)
            if (r2 == 0) goto L_0x0213
            r20 = r2
        L_0x0213:
            java.lang.String r19 = X.DbY.A0c(r6, r4, r3)
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            r13 = 0
            r21 = 3
            r14 = r6
            r16 = r7
            X.C71132OdV.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            long r2 = r8.longValue()
            java.lang.Object r4 = r1.A05
            X.OKe r4 = (X.C70758OKe) r4
            com.facebook.quicklog.QuickPerformanceLogger r12 = r4.A01
            int r11 = r4.A00
            r5 = 396363964(0x17a008bc, float:1.0341963E-24)
            r4 = 1128(0x468, float:1.58E-42)
            java.lang.String r17 = X.C66579MXk.A00(r4)
            r14 = r12
            r15 = r5
            r16 = r11
            r18 = r2
            r14.markerAnnotate(r15, r16, r17, r18)
            r4 = 2
            r12.markerEnd(r5, r11, r4)
            X.0Tu r11 = X.0Tu.A05
            r4 = 18311936663893714(0x410e9c000036d2, double:1.8976617911432362E-307)
            boolean r4 = X.1AW.A06(r11, r4)
            if (r4 == 0) goto L_0x02a1
            X.4Cq r5 = X.C71132OdV.A01
            com.instagram.bugreporter.BugReporterUploader$logSuccess$1 r4 = new com.instagram.bugreporter.BugReporterUploader$logSuccess$1
            r4.<init>(r13, r2)
            X.AnonymousClass7TE.A1Z(r4, r5)
        L_0x025e:
            java.lang.Object r11 = r1.A02
            com.instagram.bugreporter.model.BugReport r11 = (com.instagram.bugreporter.model.BugReport) r11
            java.lang.String r8 = r11.A0G
            X.OKd r5 = new X.OKd
            r5.<init>(r8, r2)
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            int r1 = r4.size()
            java.util.concurrent.CountDownLatch r12 = new java.util.concurrent.CountDownLatch
            r12.<init>(r1)
            java.util.Iterator r13 = r4.iterator()
        L_0x027a:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0386
            X.0eP r1 = X.JTO.A1A(r13)
            java.lang.Object r1 = r1.A00
            com.meta.flytrap.attachment.model.BugReportAttachment r1 = (com.meta.flytrap.attachment.model.BugReportAttachment) r1
            java.lang.String r4 = r1.A03
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            r14 = r6
            r15 = r5
            r16 = r11
            r17 = r7
            r18 = r1
            r19 = r12
            r20 = r9
            r21 = r2
            X.C71132OdV.A04(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x027a
        L_0x02a1:
            X.0xi r4 = X.0tS.A4E
            X.0tS r13 = r4.A00()
            X.0s0 r11 = r13.A22
            X.0YZ[] r5 = X.0tS.A4G
            r4 = 78
            X.DbS.A1a(r13, r8, r11, r5, r4)
            long r11 = java.lang.System.currentTimeMillis()
            X.0s0 r8 = r13.A23
            r4 = 79
            r5 = r5[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r8.Epx(r13, r4, r5)
            goto L_0x025e
        L_0x02c2:
            X.4Cq r2 = X.C71132OdV.A01
            java.lang.Object r8 = r1.A03
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r7 = r1.A04
            X.0lg r7 = (X.0lg) r7
            java.lang.Object r6 = r1.A02
            com.instagram.bugreporter.model.BugReport r6 = (com.instagram.bugreporter.model.BugReport) r6
            java.lang.Object r5 = r1.A06
            com.instagram.bugreporter.BugReportComposerViewModel r5 = (com.instagram.bugreporter.BugReportComposerViewModel) r5
            java.lang.Object r12 = r1.A05
            X.OKe r12 = (X.C70758OKe) r12
            r4 = 1
            r3 = 0
            if (r13 != 0) goto L_0x0338
            java.lang.String r13 = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult is null"
        L_0x02de:
            if (r11 == 0) goto L_0x0330
        L_0x02e0:
            java.lang.Class<X.UJP> r14 = X.UJP.class
            java.lang.String r2 = "ig_bug_submit"
            X.3FZ r15 = r11.A00(r14, r2)
            if (r15 == 0) goto L_0x02f5
            java.lang.String r1 = "is_retryable"
            boolean r1 = r15.A06(r1)
            if (r1 != r4) goto L_0x02f5
            X.C71132OdV.A03(r8, r5, r6, r7, r9)
        L_0x02f5:
            X.3FZ r2 = r11.A00(r14, r2)
            if (r2 == 0) goto L_0x0330
            java.lang.String r1 = "is_retryable"
            boolean r1 = r2.A06(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x0305:
            java.lang.Class<X.UJP> r2 = X.UJP.class
            java.lang.String r1 = "ig_bug_submit"
            X.3FZ r2 = r11.A00(r2, r1)
            if (r2 == 0) goto L_0x0334
            java.lang.String r1 = "is_prohibited"
            boolean r1 = r2.A06(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L_0x0319:
            java.lang.Class<X.UJP> r2 = X.UJP.class
            java.lang.String r1 = "ig_bug_submit"
            X.3FZ r2 = r11.A00(r2, r1)
            if (r2 == 0) goto L_0x0329
            java.lang.String r1 = "error_message"
            java.lang.String r3 = r2.A05(r1)
        L_0x0329:
            r12.A00(r5, r4, r13, r3)
            r1 = -1444167499(0xffffffffa9ebc0b5, float:-1.0469526E-13)
            goto L_0x0398
        L_0x0330:
            r5 = r3
            if (r11 == 0) goto L_0x0334
            goto L_0x0305
        L_0x0334:
            r4 = r3
            if (r11 == 0) goto L_0x0329
            goto L_0x0319
        L_0x0338:
            if (r11 == 0) goto L_0x0382
            java.lang.Class<X.UJP> r14 = X.UJP.class
            java.lang.String r13 = "ig_bug_submit"
            X.3FZ r1 = r11.A00(r14, r13)
            if (r1 == 0) goto L_0x0382
            X.3FZ r1 = r11.A00(r14, r13)
            if (r1 == 0) goto L_0x036c
            java.lang.String r2 = "error_message"
            java.lang.String r1 = r1.A05(r2)
            if (r1 == 0) goto L_0x036c
            boolean r1 = X.C51966G9m.A1X(r1)
            if (r1 != r4) goto L_0x036c
            X.3FZ r1 = r11.A00(r14, r13)
            if (r1 == 0) goto L_0x036a
            java.lang.String r1 = r1.A05(r2)
            if (r1 == 0) goto L_0x036a
        L_0x0364:
            java.lang.String r13 = java.lang.String.valueOf(r1)
            goto L_0x02e0
        L_0x036a:
            r1 = r3
            goto L_0x0364
        L_0x036c:
            X.3FZ r2 = r11.A00(r14, r13)
            if (r2 == 0) goto L_0x037e
            java.lang.String r1 = "bug_id"
            java.lang.String r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x037e
            java.lang.String r13 = ""
            goto L_0x02e0
        L_0x037e:
            java.lang.String r13 = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult.IgBugSubmit.BugId is null"
            goto L_0x02e0
        L_0x0382:
            java.lang.String r13 = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult.IgBugSubmit is null"
            goto L_0x02de
        L_0x0386:
            r12.await()
            X.OV8 r1 = new X.OV8
            r1.<init>(r8)
            java.io.File r1 = r1.A00()
            X.AnonymousClass5Kg.A07(r1)
            r1 = 883139999(0x34a3a59f, float:3.048162E-7)
        L_0x0398:
            X.AnonymousClass0fD.A0A(r1, r10)
            r1 = 824503570(0x3124ed12, float:2.39999E-9)
            goto L_0x0075
        L_0x03a0:
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15608Ufa.onSuccess(java.lang.Object):void");
    }
}
