package X;

import android.view.View;

/* renamed from: X.LXz  reason: case insensitive filesystem */
public final class C64273LXz implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C64273LXz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C64273LXz(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v22, types: [X.07Z, java.lang.Object, X.KXd] */
    /* JADX WARNING: type inference failed for: r3v71, types: [android.content.Context, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: type inference failed for: r4v40, types: [com.instagram.tagging.activity.TaggingActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x07e6, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x07e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0aa7, code lost:
        r6 = "resultsListController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0b5b, code lost:
        r6 = "musicProduct";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0b7f, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0b86, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0d86, code lost:
        X.0qQ.A0F(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0d8d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0dd3, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0dd6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0e29, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0e2c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x021e, code lost:
        if (r0.A02 != null) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0ceb  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0d0f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0e1a;
                case 1: goto L_0x0e02;
                case 2: goto L_0x0df2;
                case 3: goto L_0x0de2;
                case 4: goto L_0x0d74;
                case 5: goto L_0x0d34;
                case 6: goto L_0x0c6f;
                case 7: goto L_0x0bcd;
                case 8: goto L_0x0b64;
                case 9: goto L_0x0ac0;
                case 10: goto L_0x0aab;
                case 11: goto L_0x0a7a;
                case 12: goto L_0x0a67;
                case 13: goto L_0x0a50;
                case 14: goto L_0x0a3d;
                case 15: goto L_0x0a06;
                case 16: goto L_0x09de;
                case 17: goto L_0x09b9;
                case 18: goto L_0x097c;
                case 19: goto L_0x093d;
                case 20: goto L_0x092a;
                case 21: goto L_0x090f;
                case 22: goto L_0x08fc;
                case 23: goto L_0x089c;
                case 24: goto L_0x0889;
                case 25: goto L_0x083b;
                case 26: goto L_0x081e;
                case 27: goto L_0x07f5;
                case 28: goto L_0x077e;
                case 29: goto L_0x073c;
                case 30: goto L_0x06f5;
                case 31: goto L_0x06da;
                case 32: goto L_0x06bf;
                case 33: goto L_0x06a4;
                case 34: goto L_0x0689;
                case 35: goto L_0x0658;
                case 36: goto L_0x0647;
                case 37: goto L_0x0634;
                case 38: goto L_0x0606;
                case 39: goto L_0x05ea;
                case 40: goto L_0x05ce;
                case 41: goto L_0x05bd;
                case 42: goto L_0x05ac;
                case 43: goto L_0x0599;
                case 44: goto L_0x0566;
                case 45: goto L_0x0533;
                case 46: goto L_0x050d;
                case 47: goto L_0x04e7;
                case 48: goto L_0x04ae;
                case 49: goto L_0x0488;
                case 50: goto L_0x0462;
                case 51: goto L_0x044f;
                case 52: goto L_0x0428;
                case 53: goto L_0x0381;
                case 54: goto L_0x035c;
                case 55: goto L_0x0347;
                case 56: goto L_0x0328;
                case 57: goto L_0x030e;
                case 58: goto L_0x02df;
                case 59: goto L_0x02ca;
                case 60: goto L_0x0228;
                case 61: goto L_0x01e6;
                case 62: goto L_0x0111;
                case 63: goto L_0x00fc;
                case 64: goto L_0x00e9;
                case 65: goto L_0x00d6;
                case 66: goto L_0x00c1;
                case 67: goto L_0x00ae;
                case 68: goto L_0x003b;
                case 69: goto L_0x0028;
                case 70: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = -944252506(0xffffffffc7b7d9a6, float:-94131.3)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.tagging.activity.TaggingActivity r3 = (com.instagram.tagging.activity.TaggingActivity) r3
            X.Kj1 r1 = r3.A0H
            if (r1 != 0) goto L_0x001b
            java.lang.String r6 = "tagType"
            goto L_0x0b7f
        L_0x001b:
            X.Kj1 r2 = X.C62630Kj1.PEOPLE
            if (r1 == r2) goto L_0x0023
            r1 = 1
            com.instagram.tagging.activity.TaggingActivity.A0L(r3, r2, r1)
        L_0x0023:
            r1 = -1169163224(0xffffffffba4ffc28, float:-7.9339975E-4)
            goto L_0x0e29
        L_0x0028:
            r0 = 484954303(0x1ce7d0bf, float:1.5340257E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            r1.onBackPressed()
            r1 = 1249711677(0x4a7d163d, float:4146575.2)
            goto L_0x0e29
        L_0x003b:
            r0 = 694736103(0x2968d4e7, float:5.169901E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.tagging.activity.TaggingActivity r4 = (com.instagram.tagging.activity.TaggingActivity) r4
            boolean r5 = com.instagram.tagging.activity.TaggingActivity.A0T(r4)
            X.0eM r1 = r4.A0o
            X.0lg r1 = X.DbT.A0X(r1)
            X.2cc r2 = X.C71342cb.A00(r1)
            java.lang.String r1 = "back"
            r2.A0A(r4, r1)
            android.content.Intent r3 = X.DbS.A09()
            java.util.ArrayList r2 = r4.A0M
            java.lang.String r6 = "mediaTaggingInfos"
            if (r5 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0b7f
            java.lang.String r1 = "media_tagging_info_list"
            r3.putParcelableArrayListExtra(r1, r2)
        L_0x006a:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r4.A05
            if (r1 == 0) goto L_0x0081
            java.util.ArrayList r2 = r4.A0M
            if (r2 == 0) goto L_0x0b7f
            int r1 = r1.getCurrentDataIndex()
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r1 = X.JTO.A0p(r2, r1)
            int r2 = r1.A01
            java.lang.String r1 = "last_page"
            r3.putExtra(r1, r2)
        L_0x0081:
            X.Dba.A0k(r4, r3)
            r1 = 1934763522(0x73522602, float:1.6649677E31)
            goto L_0x0e29
        L_0x0089:
            if (r2 == 0) goto L_0x0b7f
            java.lang.String r1 = "media_tagging_info_list"
            r3.putParcelableArrayListExtra(r1, r2)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r2 = r4.A0D
            java.lang.String r1 = "tagged_collection_info"
            r3.putExtra(r1, r2)
            boolean r2 = r4.A0P
            java.lang.String r1 = "has_seen_OPT_tooltip"
            r3.putExtra(r1, r2)
            java.util.List r2 = r4.A0O
            if (r2 != 0) goto L_0x00a6
            java.lang.String r6 = "taggedSellerIds"
            goto L_0x0b7f
        L_0x00a6:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.String r1 = "tagged_seller_ids"
            r3.putStringArrayListExtra(r1, r2)
            goto L_0x006a
        L_0x00ae:
            r0 = -1963017514(0xffffffff8afebad6, float:-2.452959E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            r1.onBackPressed()
            r1 = -1012698980(0xffffffffc3a3709c, float:-326.87976)
            goto L_0x0e29
        L_0x00c1:
            r0 = -1822066013(0xffffffff93657aa3, float:-2.8964328E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MRC r1 = (X.MRC) r1
            com.instagram.tagging.activity.TaggingActivity r1 = (com.instagram.tagging.activity.TaggingActivity) r1
            com.instagram.tagging.activity.TaggingActivity.A0B(r1)
            r1 = 871759723(0x33f5ff6b, float:1.1455162E-7)
            goto L_0x0e29
        L_0x00d6:
            r0 = 1469569700(0x5797daa4, float:3.3393062E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MUG r1 = (X.MUG) r1
            r1.DLd()
            r1 = 1041344680(0x3e11a8a8, float:0.14224494)
            goto L_0x0e29
        L_0x00e9:
            r0 = -1019067491(0xffffffffc342439d, float:-194.26411)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MUG r1 = (X.MUG) r1
            r1.CuE()
            r1 = 652160463(0x26df2dcf, float:1.548615E-15)
            goto L_0x0e29
        L_0x00fc:
            r0 = 1509186075(0x59f45a1b, float:8.5973708E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MSx r1 = (X.C66469MSx) r1
            if (r1 == 0) goto L_0x010c
            r1.DqV()
        L_0x010c:
            r1 = -992262929(0xffffffffc4db44ef, float:-1754.1542)
            goto L_0x0e29
        L_0x0111:
            r0 = 17482333(0x10ac25d, float:2.5486046E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.LSN r4 = (X.LSN) r4
            X.MXd r5 = r4.A0L
            com.instagram.tagging.activity.TaggingActivity r5 = (com.instagram.tagging.activity.TaggingActivity) r5
            int r1 = r5.A00
            boolean r1 = com.instagram.tagging.activity.TaggingActivity.A0W(r5, r1)
            if (r1 == 0) goto L_0x01bd
            X.0eM r1 = r5.A0o
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r12 = r5.A0K
            if (r12 != 0) goto L_0x0136
            java.lang.String r13 = "_shoppingCreationSessionId"
            goto L_0x0d86
        L_0x0136:
            boolean r1 = com.instagram.tagging.activity.TaggingActivity.A0U(r5)
            r11 = r1 ^ 1
            java.util.ArrayList r1 = r5.A0M
            java.lang.String r13 = "mediaTaggingInfos"
            if (r1 == 0) goto L_0x0d86
            int r7 = r5.A00
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r1 = X.JTO.A0p(r1, r7)
            java.util.ArrayList r2 = r1.A0D
            X.Jqt r6 = com.instagram.tagging.activity.TaggingActivity.A02(r5)
            r1 = 0
            X.0qQ.A0B(r8, r1)
            android.util.Pair r9 = X.LTQ.A00(r2)
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r8)
            java.lang.String r1 = "ig_suggested_tags_remove_all_tags"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r10 = r8.A06
            X.LTQ.A06(r3, r10, r12)
            r8 = 9
            r2 = 10
            r1 = 79
            java.lang.String r1 = X.C46325Dbt.A00(r8, r2, r1)
            r3.AAJ(r1, r12)
            java.lang.Long r2 = X.00y.A0n(r2, r10)
            java.lang.String r1 = "ig_user_id"
            r3.A9F(r1, r2)
            X.JTQ.A17(r3, r11)
            java.lang.Object r1 = r9.first
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r2 = X.C51969G9p.A0r(r1)
            java.lang.String r1 = "high_confidence_suggestions_count"
            r3.A9F(r1, r2)
            java.lang.Object r1 = r9.second
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r2 = X.C51969G9p.A0r(r1)
            java.lang.String r1 = "low_confidence_suggestions_count"
            r3.A9F(r1, r2)
            java.lang.String r1 = "suggested_tags_info"
            r3.AAK(r6, r1)
            long r1 = (long) r7
            X.C51970G9q.A19(r3, r1)
            r3.Cgf()
            boolean r1 = com.instagram.tagging.activity.TaggingActivity.A0U(r5)
            if (r1 == 0) goto L_0x01c9
            X.Ka8 r3 = r5.A0F
        L_0x01ac:
            if (r3 == 0) goto L_0x01bd
            java.util.ArrayList r1 = r5.A0M
            if (r1 == 0) goto L_0x0d86
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r1 = X.JTT.A0i(r5, r1)
            java.util.ArrayList r2 = r1.A0D
            com.instagram.tagging.widget.TagsInteractiveLayout r1 = r3.A01
            r1.A0A(r2)
        L_0x01bd:
            android.widget.TextView r2 = r4.A0H
            r1 = 8
            r2.setVisibility(r1)
            r1 = 445240511(0x1a89d4bf, float:5.700558E-23)
            goto L_0x0e29
        L_0x01c9:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r5.A05
            if (r2 == 0) goto L_0x01e1
            int r1 = r5.A00
            android.view.View r1 = r2.A0D(r1)
            if (r1 == 0) goto L_0x01e1
            java.lang.Object r3 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.tagging.activity.TaggingPhotoViewBinder.Holder"
            X.0qQ.A0C(r3, r1)
            X.Ka8 r3 = (X.C62103Ka8) r3
            goto L_0x01ac
        L_0x01e1:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x01e6:
            r0 = -929471556(0xffffffffc89963bc, float:-314141.88)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LSN r0 = (X.LSN) r0
            X.MXd r3 = r0.A0L
            com.instagram.tagging.activity.TaggingActivity r3 = (com.instagram.tagging.activity.TaggingActivity) r3
            java.util.ArrayList r0 = r3.A0M
            if (r0 != 0) goto L_0x01fd
            java.lang.String r6 = "mediaTaggingInfos"
            goto L_0x0b7f
        L_0x01fd:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r3, r0)
            X.1iA r1 = r0.A03
            X.1iA r0 = X.1iA.A0a
            if (r1 == r0) goto L_0x0220
            r0 = 1
            boolean r1 = X.2eO.A01(r3, r0)
            boolean r0 = X.2eO.A00(r3)
            if (r1 == 0) goto L_0x0223
            if (r0 == 0) goto L_0x0223
            X.LSN r0 = r3.A0E
            if (r0 != 0) goto L_0x021c
            java.lang.String r6 = "helpTextController"
            goto L_0x0b7f
        L_0x021c:
            android.widget.ListView r0 = r0.A02
            if (r0 == 0) goto L_0x0223
        L_0x0220:
            com.instagram.tagging.activity.TaggingActivity.A0B(r3)
        L_0x0223:
            r0 = -482882504(0xffffffffe337cc38, float:-3.3904697E21)
            goto L_0x07e6
        L_0x0228:
            r0 = -1913728306(0xffffffff8deed2ce, float:-1.4718632E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.L79 r1 = (X.L79) r1
            X.0eM r1 = r1.A02
            java.lang.Object r4 = r1.getValue()
            X.JhM r4 = (X.C60203JhM) r4
            X.VX8 r1 = r4.A02
            X.0Ud r1 = r1.A02
            java.lang.Object r6 = r1.getValue()
            boolean r1 = r6 instanceof X.UOF
            if (r1 == 0) goto L_0x02c3
            X.UOF r6 = (X.UOF) r6
            if (r6 == 0) goto L_0x02c3
            X.3uh r3 = r6.A01
            X.3mL r2 = r3.A0e
            X.3mL r1 = X.C250963mL.MEDIA
            if (r2 != r1) goto L_0x02bc
            X.1Xj r9 = r3.A0b
            r9.getClass()
            X.0qQ.A0A(r9)
            X.KWc r10 = r4.A05
            r7 = 0
            X.2fS r1 = r10.A02
            boolean r1 = r1.A0M(r9)
            if (r1 == 0) goto L_0x02b9
            X.3Yl r8 = X.C243363Yl.NOT_LIKED
        L_0x0268:
            X.L2Z r1 = r4.A04
            X.1QP r5 = r1.A00
            r1 = 18943093(0x1210c75, double:9.3591315E-317)
            r3 = 3380(0xd34, float:4.736E-42)
            java.lang.String r4 = X.C273654mx.A00(r3)
            com.facebook.quicklog.reliability.UserFlowConfig r3 = new com.facebook.quicklog.reliability.UserFlowConfig
            r3.<init>(r4, r7)
            r5.flowStartIfNotOngoing(r1, r3)
            X.3Yl r3 = X.C243363Yl.LIKED
            if (r8 != r3) goto L_0x02b6
            r3 = 3377(0xd31, float:4.732E-42)
        L_0x0283:
            java.lang.String r3 = X.C273654mx.A00(r3)
            r5.flowMarkPoint(r1, r3)
            com.instagram.model.reels.Reel r1 = r6.A00
            long r1 = r1.A04()
            int r13 = (int) r1
            java.lang.String r11 = r9.getId()
            if (r11 == 0) goto L_0x02b1
            X.05G r3 = r10.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.Jzm r1 = new X.Jzm
            r1.<init>(r8, r2, r11)
            r3.Epw(r1)
            r9.A44(r8)
            X.4Cq r1 = r10.A01
            r12 = 0
            X.MGQ r7 = new X.MGQ
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.JTO.A1Y(r2, r7, r1)
        L_0x02b1:
            r1 = 1177693561(0x46322d79, float:11403.368)
            goto L_0x0e29
        L_0x02b6:
            r3 = 3379(0xd33, float:4.735E-42)
            goto L_0x0283
        L_0x02b9:
            X.3Yl r8 = X.C243363Yl.LIKED
            goto L_0x0268
        L_0x02bc:
            java.lang.String r0 = "Received click for non-media story item"
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r0)
            throw r3
        L_0x02c3:
            java.lang.String r0 = "Received click for non-organic story"
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r0)
            throw r3
        L_0x02ca:
            r0 = -1863216385(0xffffffff90f192ff, float:-9.528422E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.W1O r1 = (X.W1O) r1
            X.0sa r1 = r1.A02
            r1.invoke()
            r1 = -481959033(0xffffffffe345e387, float:-3.6504037E21)
            goto L_0x0e29
        L_0x02df:
            r0 = -907713657(0xffffffffc9e56387, float:-1879152.9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Ly3 r3 = (X.C65688Ly3) r3
            X.0eM r2 = r3.A03
            java.lang.Object r1 = r2.getValue()
            X.LPD r1 = (X.LPD) r1
            boolean r1 = r1.A05()
            if (r1 == 0) goto L_0x0306
            java.lang.Object r1 = r2.getValue()
            X.LPD r1 = (X.LPD) r1
            r1.A03()
        L_0x0301:
            r1 = 3671044(0x380404, float:5.144228E-39)
            goto L_0x0e29
        L_0x0306:
            X.MSv r1 = r3.A01
            if (r1 == 0) goto L_0x0301
            r1.onClick()
            goto L_0x0301
        L_0x030e:
            r0 = 1490065671(0x58d09907, float:1.83484533E15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LP7 r1 = (X.LP7) r1
            android.view.View r0 = r1.A00
            X.AnonymousClass7TH.A0R(r0)
            X.LPD r0 = r1.A0D
            r0.A01()
            r0 = -1564120494(0xffffffffa2c56a52, float:-5.350953E-18)
            goto L_0x07e6
        L_0x0328:
            r0 = 125125125(0x7754205, float:1.8451153E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ugt r1 = (X.C15688Ugt) r1
            com.instagram.user.model.User r0 = r1.A06
            if (r0 == 0) goto L_0x0342
            X.W1i r3 = r1.A0A
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "ads_product_page_title_bar"
            r3.A06(r1, r0, r0)
        L_0x0342:
            r0 = 80025052(0x4c515dc, float:4.6334552E-36)
            goto L_0x07e6
        L_0x0347:
            r0 = 539663661(0x202a9d2d, float:1.4451565E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.L76 r1 = (X.L76) r1
            X.0sa r1 = r1.A01
            r1.invoke()
            r1 = -1846738555(0xffffffff91ed0185, float:-3.7392943E-28)
            goto L_0x0e29
        L_0x035c:
            r0 = 1496405833(0x59315749, float:3.11981512E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXY r1 = (X.KXY) r1
            X.0eM r1 = r1.A04
            X.2YL r5 = X.DbS.A0H(r1)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 35
            X.MG4 r1 = new X.MG4
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -449125515(0xffffffffe53ae375, float:-5.515975E22)
            goto L_0x0e29
        L_0x0381:
            r0 = -822019456(0xffffffffcf00fa80, float:-2.16390042E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KXa r4 = (X.C62038KXa) r4
            X.LRl r1 = r4.A03
            java.util.Set r1 = r1.A03
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r1)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x039c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x03a6
            X.C61036Jva.A01(r6, r2)
            goto L_0x039c
        L_0x03a6:
            boolean r1 = r4.A02
            if (r1 != 0) goto L_0x03f5
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r12 = r4.A00
            if (r12 == 0) goto L_0x03f5
            android.content.Context r10 = r4.requireContext()
            X.0eM r1 = r4.A04
            com.instagram.common.session.UserSession r11 = X.JTU.A0J(r1)
            java.util.List r1 = r12.A00
            java.lang.Object r1 = X.00k.A0J(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03cf
            X.3Q2 r2 = X.JTQ.A0M(r11, r1)
            if (r2 == 0) goto L_0x03cf
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.SHARE_TO_FRIENDS_STORY
            r2.A0e(r1)
            r2.A4e = r6
        L_0x03cf:
            com.instagram.pendingmedia.model.UserStoryTarget r13 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            r16 = 0
            r14 = 0
            X.Lqn r9 = new X.Lqn
            r15 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.Lqi r1 = X.C65289Lqi.A00
            X.LRm r8 = new X.LRm
            r8.<init>(r1)
            X.Juy r7 = X.C61002Juy.A03
            android.os.Handler r5 = r8.A00
            X.MSN r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.MA7 r3 = new X.MA7
            r3.<init>(r5, r2, r9, r1)
            r1 = 0
            r3.A00 = r1
            X.LRm.A00(r8, r3, r7)
        L_0x03f5:
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x0423
            androidx.fragment.app.FragmentActivity r7 = r4.getActivity()
            if (r7 == 0) goto L_0x0420
            r5 = -1
            android.content.Intent r3 = X.DbS.A09()
            r2 = 1
            r1 = 2494(0x9be, float:3.495E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.content.Intent r3 = r3.putExtra(r1, r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r6)
            r1 = 480(0x1e0, float:6.73E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.content.Intent r1 = r3.putStringArrayListExtra(r1, r2)
            r7.setResult(r5, r1)
        L_0x0420:
            X.DbX.A1I(r4)
        L_0x0423:
            r1 = -314208263(0xffffffffed458ff9, float:-3.8214124E27)
            goto L_0x0e29
        L_0x0428:
            r0 = -1854620350(0xffffffff9174bd42, float:-1.9306526E-28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KXa r4 = (X.C62038KXa) r4
            android.app.Activity r0 = r4.getRootActivity()
            if (r0 == 0) goto L_0x043c
            X.0nA.A0J(r0)
        L_0x043c:
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 0
            X.C63437Kwx.A00(r1, r4, r3, r0)
            r0 = -298248881(0xffffffffee39154f, float:-1.4320122E28)
            goto L_0x07e6
        L_0x044f:
            r0 = -137842091(0xfffffffff7c8b255, float:-8.1412217E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXa r1 = (X.C62038KXa) r1
            X.DbT.A1K(r1)
            r1 = 405856000(0x1830df00, float:2.2860053E-24)
            goto L_0x0e29
        L_0x0462:
            r0 = 896667649(0x35721001, float:9.0175314E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KYb r3 = (X.KYb) r3
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.DbX.A10(r0, r1)
            X.MUE r0 = r3.A05
            if (r0 == 0) goto L_0x047d
            r0.D0c()
        L_0x047d:
            X.8sM r1 = X.C368278sM.DECLINE
            r0 = 0
            X.KYb.A02(r1, r3, r0)
            r0 = -1675714534(0xffffffff9c1ea01a, float:-5.248474E-22)
            goto L_0x07e6
        L_0x0488:
            r0 = 172064825(0xa418039, float:9.316728E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KYb r3 = (X.KYb) r3
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.DbX.A10(r0, r1)
            X.MUE r0 = r3.A05
            if (r0 == 0) goto L_0x04a3
            r0.D5Z()
        L_0x04a3:
            X.8sM r1 = X.C368278sM.ACCEPT
            r0 = 0
            X.KYb.A02(r1, r3, r0)
            r0 = 376100521(0x166ad6a9, float:1.8970104E-25)
            goto L_0x07e6
        L_0x04ae:
            r0 = -1651453444(0xffffffff9d90d1fc, float:-3.83336E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KYc r4 = (X.KYc) r4
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.DbX.A10(r1, r2)
            X.MUE r1 = r4.A05
            if (r1 == 0) goto L_0x04c9
            r1.D0c()
        L_0x04c9:
            X.819 r2 = r4.A0B()
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_SHARE_LATER_FEED
            r3 = 0
            if (r2 == r1) goto L_0x04e4
            X.819 r2 = r4.A0B()
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_SHARE_LATER_STORY
            if (r2 == r1) goto L_0x04e4
            X.8sM r1 = X.C368278sM.DECLINE
        L_0x04dc:
            X.KYc.A07(r1, r4, r3)
            r1 = -307337341(0xffffffffedae6783, float:-6.746941E27)
            goto L_0x0e29
        L_0x04e4:
            X.8sM r1 = X.C368278sM.OTHER
            goto L_0x04dc
        L_0x04e7:
            r0 = 1590639507(0x5ecf3b93, float:7.4663453E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KYc r3 = (X.KYc) r3
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.DbX.A10(r0, r1)
            X.MUE r0 = r3.A05
            if (r0 == 0) goto L_0x0502
            r0.D5Z()
        L_0x0502:
            X.8sM r1 = X.C368278sM.ACCEPT
            r0 = 0
            X.KYc.A07(r1, r3, r0)
            r0 = -1004667312(0xffffffffc41dfe50, float:-631.97363)
            goto L_0x07e6
        L_0x050d:
            r0 = 787800081(0x2ef4e011, float:1.11356376E-10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KYc r3 = (X.KYc) r3
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.DbX.A10(r0, r1)
            X.MUE r0 = r3.A05
            if (r0 == 0) goto L_0x0528
            r0.D0c()
        L_0x0528:
            X.8sM r1 = X.C368278sM.DECLINE
            r0 = 0
            X.KYc.A07(r1, r3, r0)
            r0 = -989943987(0xffffffffc4fea74d, float:-2037.2281)
            goto L_0x07e6
        L_0x0533:
            r0 = -490593217(0xffffffffe2c2243f, float:-1.7906401E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KYc r3 = (X.KYc) r3
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.DbX.A10(r0, r1)
            X.MUE r0 = r3.A05
            if (r0 == 0) goto L_0x054e
            r0.D5Z()
        L_0x054e:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.KYa r0 = X.LRS.A00(r0)
            r1 = 0
            r0.A07()
            X.8sM r0 = X.C368278sM.ACCEPT
            X.KYc.A07(r0, r3, r1)
            r0 = 708941480(0x2a4196a8, float:1.7194113E-13)
            goto L_0x07e6
        L_0x0566:
            r0 = 1404113733(0x53b11345, float:1.521065E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K4e r5 = (X.C61362K4e) r5
            X.L3t r2 = r5.A02
            if (r2 == 0) goto L_0x058b
            boolean r4 = r5.A04
            X.8Wk r3 = r2.A00
            X.8BA r1 = r3.A0A
            X.8it r1 = r1.A1q
            r1.A04(r4)
            java.lang.String r2 = r2.A01
            r1 = 0
            r3.A0G(r2, r1)
            X.8sM r1 = X.C368278sM.ACCEPT
            X.C357088Wk.A02(r1, r3, r2, r4)
        L_0x058b:
            X.37E r2 = X.AnonymousClass37D.A00
            android.content.Context r1 = r5.getContext()
            X.DbX.A14(r1, r2)
            r1 = 628856346(0x257b961a, float:2.1821636E-16)
            goto L_0x0e29
        L_0x0599:
            r0 = 1401988980(0x5390a774, float:1.24256938E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXb r1 = (X.C62039KXb) r1
            X.C62039KXb.A05(r1)
            r1 = 963216032(0x396982a0, float:2.2269273E-4)
            goto L_0x0e29
        L_0x05ac:
            r0 = -1225467196(0xffffffffb6f4dac4, float:-7.2972343E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -850983299(0xffffffffcd47067d, float:-2.086932E8)
            goto L_0x07e6
        L_0x05bd:
            r0 = -1526675809(0xffffffffa500c69f, float:-1.1169526E-16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -815805637(0xffffffffcf5fcb3b, float:-3.75463808E9)
            goto L_0x07e6
        L_0x05ce:
            r0 = 878829323(0x3461df0b, float:2.10359E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JwE r1 = (X.C61076JwE) r1
            java.lang.Object r1 = r1.A00
            X.L2Q r1 = (X.L2Q) r1
            X.K9H r2 = r1.A00
            r1 = 1
            r2.A03 = r1
            r2.A02()
            r1 = 182021133(0xad96c0d, float:2.0936984E-32)
            goto L_0x0e29
        L_0x05ea:
            r0 = -641676098(0xffffffffd9c0ccbe, float:-6.783539E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JwE r1 = (X.C61076JwE) r1
            java.lang.Object r1 = r1.A00
            X.L2Q r1 = (X.L2Q) r1
            X.K9H r2 = r1.A00
            r1 = 1
            r2.A03 = r1
            r2.A02()
            r1 = 910416311(0x3643d9b7, float:2.918399E-6)
            goto L_0x0e29
        L_0x0606:
            r0 = -484987661(0xffffffffe317acf3, float:-2.7979207E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6S r3 = (X.K6S) r3
            boolean r1 = r3 instanceof X.C62040KXc
            if (r1 == 0) goto L_0x062f
            X.KXc r3 = (X.C62040KXc) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A06
            X.6Yo r2 = X.DbX.A0N(r2, r1)
            r2.A08()
            X.KXZ r1 = new X.KXZ
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
        L_0x062f:
            r1 = -1664593223(0xffffffff9cc852b9, float:-1.3256273E-21)
            goto L_0x0e29
        L_0x0634:
            r0 = -1490325724(0xffffffffa72b6f24, float:-2.3791267E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.2pG r1 = (X.C230242pG) r1
            r1.DR6()
            r1 = 956832791(0x39081c17, float:1.2980435E-4)
            goto L_0x0e29
        L_0x0647:
            r0 = 1366644855(0x51755877, float:6.5859449E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 1974108147(0x75aa7ff3, float:4.3226835E32)
            goto L_0x0e29
        L_0x0658:
            r0 = 1031302185(0x3d786c29, float:0.060650025)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K6C r2 = (X.K6C) r2
            X.8hl r1 = r2.A00
            if (r1 != 0) goto L_0x066b
            java.lang.String r6 = "storyDraftsAdapter"
            goto L_0x0b7f
        L_0x066b:
            java.util.Set r1 = r1.A0A
            int r4 = r1.size()
            r1 = 31
            X.MMg r3 = new X.MMg
            r3.<init>(r2, r1)
            android.content.Context r2 = r2.requireContext()
            X.LmY r1 = new X.LmY
            r1.<init>(r3)
            X.C54908HXq.A00(r2, r1, r4)
            r1 = -1107473852(0xffffffffbdfd4a44, float:-0.12367681)
            goto L_0x0e29
        L_0x0689:
            java.lang.Object r1 = r1.A01
            X.TzX r1 = (X.C14625TzX) r1
            X.4DH r0 = r1.A05
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r1.A07
            X.30l r0 = new X.30l
            r0.<init>(r3, r2)
            X.LFp r1 = new X.LFp
            r1.<init>(r3, r0, r2)
            r0 = 0
            r1.A01(r0, r0)
            return
        L_0x06a4:
            r0 = -1698301692(0xffffffff9ac5f904, float:-8.1879597E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.6iU r1 = (X.C314576iU) r1
            X.2kA r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.6iS r1 = (X.C314556iS) r1
            r1.A06()
            r1 = 1610536117(0x5ffed4b5, float:3.6725001E19)
            goto L_0x0e29
        L_0x06bf:
            r0 = -329446150(0xffffffffec5d0cfa, float:-1.06893554E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.6iU r1 = (X.C314576iU) r1
            X.2kA r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.6iS r1 = (X.C314556iS) r1
            r1.A06()
            r1 = -1755463725(0xffffffff975dbfd3, float:-7.1651068E-25)
            goto L_0x0e29
        L_0x06da:
            r0 = 170840220(0xa2ed09c, float:8.41703E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.6iU r1 = (X.C314576iU) r1
            X.2kA r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.6iS r1 = (X.C314556iS) r1
            r1.A06()
            r1 = 1407256444(0x53e1077c, float:1.93298642E12)
            goto L_0x0e29
        L_0x06f5:
            r0 = 1553612103(0x5c9a3d47, float:3.47316173E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.6iR r1 = (X.C314546iR) r1
            X.6iS r3 = X.C314546iR.A00(r1)
            X.05G r2 = r3.A0D
            java.lang.Object r1 = r2.getValue()
            X.6n9 r1 = (X.C317366n9) r1
            boolean r1 = r1.A0O
            if (r1 == 0) goto L_0x072e
            X.LwA r1 = X.C65576LwA.A00
            X.C314556iS.A01(r1, r3)
            r1 = 0
            X.C314556iS.A04(r3, r1)
            X.LwG r1 = X.C65582LwG.A00
            X.C314556iS.A01(r1, r3)
            X.0eM r1 = r3.A0A
            java.lang.Object r1 = r1.getValue()
            X.6Ym r1 = (X.C309496Ym) r1
            r1.A01()
        L_0x0729:
            r1 = 964280925(0x3979c25d, float:2.3818896E-4)
            goto L_0x0e29
        L_0x072e:
            java.lang.Object r1 = r2.getValue()
            X.6n9 r1 = (X.C317366n9) r1
            boolean r1 = r1.A0N
            if (r1 == 0) goto L_0x0729
            r3.A07()
            goto L_0x0729
        L_0x073c:
            r0 = -1544925966(0xffffffffa3ea4cf2, float:-2.5402918E-17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.6iR r0 = (X.C314546iR) r0
            X.6iS r5 = X.C314546iR.A00(r0)
            X.05G r0 = r5.A0D
            java.lang.Object r0 = r0.getValue()
            X.6n9 r0 = (X.C317366n9) r0
            java.lang.CharSequence r1 = r0.A08
            boolean r0 = X.C51966G9m.A1X(r1)
            r7 = 0
            if (r0 == 0) goto L_0x077a
            if (r1 == 0) goto L_0x077a
            java.lang.String r6 = r1.toString()
            if (r6 == 0) goto L_0x077a
            X.1Xj r4 = r5.A00
            if (r4 == 0) goto L_0x077a
            X.0eM r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            X.4Cq r0 = (X.C262224Cq) r0
            r8 = 12
            X.MGk r3 = new X.MGk
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r0)
        L_0x077a:
            r0 = 1109450949(0x4220e0c5, float:40.2195)
            goto L_0x07e6
        L_0x077e:
            r0 = -1625464642(0xffffffff9f1d60be, float:-3.3326066E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.Object r6 = r1.A01
            X.K7C r6 = (X.K7C) r6
            X.6Ku r0 = r6.A01
            if (r0 == 0) goto L_0x07ea
            com.instagram.creation.cameraconfiguration.CameraConfiguration r1 = r0.A00()
            r0 = 22
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putParcelable(r0, r1)
            X.6Ku r1 = r6.A01
            X.6Ku r0 = X.C306106Ku.CLIPS
            if (r1 != r0) goto L_0x07ab
            X.28D r1 = X.28D.A0n
            java.lang.String r0 = "camera_entry_point"
            r5.putSerializable(r0, r1)
        L_0x07ab:
            com.instagram.common.session.UserSession r4 = r6.A00
            java.lang.String r13 = "userSession"
            r12 = 0
            if (r4 == 0) goto L_0x0d86
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.6W8 r1 = X.AnonymousClass6W8.A02(r1, r5, r4, r3, r0)
            X.Dbc.A0y(r1)
            r0 = 60571(0xec9b, float:8.4878E-41)
            r1.A0D(r6, r0)
            com.instagram.common.session.UserSession r7 = r6.A00
            if (r7 == 0) goto L_0x0d86
            r0 = 190(0xbe, float:2.66E-43)
            java.lang.String r9 = X.C273654mx.A00(r0)
            java.lang.String r11 = r6.A02
            X.6Ku r0 = r6.A01
            if (r0 == 0) goto L_0x07d9
            java.lang.String r12 = r0.A00
        L_0x07d9:
            r8 = 0
            r0 = 2752(0xac0, float:3.856E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            X.C63978LGs.A01(r6, r7, r8, r9, r10, r11, r12)
            r0 = -2112330969(0xffffffff82186327, float:-1.1195652E-37)
        L_0x07e6:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x07ea:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r0 = -1624834686(0xffffffff9f26fd82, float:-3.5361564E-20)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r3
        L_0x07f5:
            r0 = -437681864(0xffffffffe5e98138, float:-1.3783688E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KXd r3 = (X.C62041KXd) r3
            androidx.constraintlayout.widget.ConstraintLayout r1 = r3.A00
            X.AnonymousClass7TF.A16(r1)
            com.instagram.common.ui.base.IgEditText r2 = r3.A02
            if (r2 == 0) goto L_0x0816
            r2.requestFocus()
            int r1 = r2.length()
            r2.setSelection(r1)
            X.0nA.A0Q(r2)
        L_0x0816:
            X.C62041KXd.A05(r3)
            r1 = 2034413946(0x7942b17a, float:6.318158E34)
            goto L_0x0e29
        L_0x081e:
            r0 = 654492763(0x2702c45b, float:1.8147569E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KXd r4 = (X.C62041KXd) r4
            java.lang.String r3 = r4.A07
            if (r3 == 0) goto L_0x0836
            X.0xx r2 = X.DbW.A0E(r4)
            r1 = 18
            X.DbX.A1W(r4, r3, r2, r1)
        L_0x0836:
            r1 = 19576163(0x12ab563, float:3.1354207E-38)
            goto L_0x0e29
        L_0x083b:
            r0 = 1793955196(0x6aed957c, float:1.4361067E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KXd r5 = (X.C62041KXd) r5
            X.JTT.A16(r5)
            android.content.Context r2 = r5.requireContext()
            X.0eM r1 = r5.A0C
            X.Dg1 r4 = X.C46498Dg1.A00(r2, r1)
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x0881
            android.content.Context r2 = r5.requireContext()
            r1 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r1)
            r2 = 26
            X.LXz r1 = new X.LXz
            r1.<init>(r5, r2)
            r4.A0A(r3, r1)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131961457(0x7f132671, float:1.9559611E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r1)
            r2 = 27
            X.LXz r1 = new X.LXz
            r1.<init>(r5, r2)
            r4.A0C(r3, r1)
        L_0x0881:
            X.C49945FFy.A00(r5, r4)
            r1 = 1334569545(0x4f8bea49, float:4.6947743E9)
            goto L_0x0e29
        L_0x0889:
            r0 = 1619705674(0x608abf4a, float:7.998233E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXd r1 = (X.C62041KXd) r1
            X.DbT.A1K(r1)
            r1 = -946009952(0xffffffffc79d08a0, float:-80401.25)
            goto L_0x0e29
        L_0x089c:
            r0 = -2012236505(0xffffffff880fb527, float:-4.324544E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Dib r4 = (X.C46656Dib) r4
            com.instagram.common.session.UserSession r2 = r4.A0V
            r1 = 0
            X.0qQ.A0B(r2, r1)
            android.os.Bundle r1 = X.DbY.A09(r2)
            X.K52 r3 = new X.K52
            r3.<init>()
            r3.setArguments(r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A0V
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            r1.A0E(r3)
            r1.A04()
            com.instagram.common.session.UserSession r7 = r4.A0V
            java.lang.String r9 = "edit_profile"
            X.JVM r4 = r4.A0f
            r2 = 0
            if (r4 == 0) goto L_0x08f9
            com.instagram.music.common.model.MusicAssetModel r1 = r4.A02
            java.lang.String r1 = r1.A0E
            long r12 = java.lang.Long.parseLong(r1)
        L_0x08db:
            X.HOu r5 = X.C54689HOu.A0N
            java.lang.String r10 = X.DbS.A0k()
            r6 = 0
            if (r4 == 0) goto L_0x08ec
            com.instagram.music.common.model.MusicAssetModel r1 = r4.A02
            java.lang.String r1 = r1.A0B
            long r2 = java.lang.Long.parseLong(r1)
        L_0x08ec:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r11 = r6
            X.C56326Hwd.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -795969153(0xffffffffd08e797f, float:-1.91226163E10)
            goto L_0x0e29
        L_0x08f9:
            r12 = 0
            goto L_0x08db
        L_0x08fc:
            r0 = 604596425(0x240968c9, float:2.9795896E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jev r1 = (X.C60067Jev) r1
            r1.toggle()
            r1 = -828392645(0xffffffffce9fbb3b, float:-1.33992384E9)
            goto L_0x0e29
        L_0x090f:
            r0 = 1685384955(0x6474eefb, float:1.8072904E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Luk r1 = (X.C65521Luk) r1
            X.WW4 r1 = r1.A03
            if (r1 != 0) goto L_0x0922
            java.lang.String r6 = "delegate"
            goto L_0x0b7f
        L_0x0922:
            r1.A0B()
            r1 = 1549858112(0x5c60f540, float:2.532802E17)
            goto L_0x0e29
        L_0x092a:
            r0 = 933254584(0x37a055b8, float:1.9113402E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Luk r1 = (X.C65521Luk) r1
            X.C65521Luk.A00(r1)
            r1 = 921939693(0x36f3aeed, float:7.2623284E-6)
            goto L_0x0e29
        L_0x093d:
            r0 = 704636599(0x29ffe6b7, float:1.13642975E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Luk r1 = (X.C65521Luk) r1
            X.Jfs r5 = r1.A06
            if (r5 != 0) goto L_0x0950
            java.lang.String r6 = "viewModel"
            goto L_0x0b7f
        L_0x0950:
            boolean r1 = r5 instanceof com.instagram.nido.impl.explore.NidoExploreViewModel
            if (r1 == 0) goto L_0x0977
            com.instagram.nido.impl.explore.NidoExploreViewModel r5 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r5
            if (r5 == 0) goto L_0x0977
            com.instagram.common.session.UserSession r4 = r5.A01
            java.lang.String r3 = r4.A06
            java.lang.String r2 = "dismiss"
            java.lang.String r1 = ""
            X.I3t.A00(r4, r3, r2, r1, r1)
            X.0xY r2 = X.AnonymousClass7TF.A0N(r4)
            java.lang.String r1 = "has_dismissed_explore_topic_picker"
            X.DbW.A1L(r2, r1)
            X.0eM r1 = r5.A03
            java.lang.Object r1 = r1.getValue()
            X.Dgy r1 = (X.C46556Dgy) r1
            r1.A02()
        L_0x0977:
            r1 = 25069667(0x17e8863, float:4.6750285E-38)
            goto L_0x0e29
        L_0x097c:
            r0 = -819310037(0xffffffffcf2a522b, float:-2.85751168E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KVM r4 = (X.KVM) r4
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x09a5
            r2 = 0
            r4.A03 = r2
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r4.A0M
            if (r1 == 0) goto L_0x0997
            r1.setSelected(r2)
        L_0x0997:
            X.MVU r3 = r4.A0K
            X.MWx r2 = r4.A01
            java.lang.String r1 = r4.A0O
            r3.EHh(r2, r1)
        L_0x09a0:
            r1 = -49195231(0xfffffffffd115721, float:-1.2074404E37)
            goto L_0x0e29
        L_0x09a5:
            r2 = 1
            r4.A03 = r2
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r4.A0M
            if (r1 == 0) goto L_0x09af
            r1.setSelected(r2)
        L_0x09af:
            X.MVU r3 = r4.A0K
            X.MWx r2 = r4.A01
            java.lang.String r1 = r4.A0O
            r3.EHe(r2, r1)
            goto L_0x09a0
        L_0x09b9:
            r0 = -569552940(0xffffffffde0d4fd4, float:-2.54564759E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.L9t r3 = (X.C63864L9t) r3
            X.89a r2 = r3.A03
            r1 = 1
            r2.A02 = r1
            com.instagram.common.session.UserSession r1 = r3.A02
            X.60k r2 = X.C3018660j.A01(r1)
            X.Nmo r1 = X.C69506Nmo.A0Z
            r2.A0B(r1)
            android.app.Activity r1 = r3.A00
            r1.onBackPressed()
            r1 = -1854162030(0xffffffff917bbb92, float:-1.9858208E-28)
            goto L_0x0e29
        L_0x09de:
            r0 = 1059921688(0x3f2d1f18, float:0.6762557)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.L9t r4 = (X.C63864L9t) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            X.60k r2 = X.C3018660j.A01(r3)
            X.Nmo r1 = X.C69506Nmo.A0E
            r2.A0B(r1)
            X.OZb r1 = new X.OZb
            r1.<init>(r3)
            android.app.Activity r1 = r4.A00
            X.C71024OZb.A00(r1, r3)
            r1.onBackPressed()
            r1 = -1783497803(0xffffffff95b1fbb5, float:-7.1886854E-26)
            goto L_0x0e29
        L_0x0a06:
            r0 = -1788974883(0xffffffff955e68dd, float:-4.4915266E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Lua r4 = (X.C65512Lua) r4
            X.4DH r1 = r4.A01
            X.8ab r3 = X.DbW.A0U(r1)
            r1 = 2131955145(0x7f130dc9, float:1.954681E38)
            r3.A09(r1)
            r1 = 2131955144(0x7f130dc8, float:1.9546807E38)
            r3.A08(r1)
            r2 = 2131955136(0x7f130dc0, float:1.954679E38)
            r1 = 33
            X.LV2 r1 = X.LV2.A00(r4, r1)
            r3.A0L(r1, r2)
            r3.A05()
            r3.A04()
            X.DbT.A1V(r3)
            r1 = 688982618(0x29110a5a, float:3.2205446E-14)
            goto L_0x0e29
        L_0x0a3d:
            r0 = 1686218657(0x6481a7a1, float:1.9133671E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6w r1 = (X.C61423K6w) r1
            r1.onBackPressed()
            r1 = 596852869(0x23934085, float:1.5965097E-17)
            goto L_0x0e29
        L_0x0a50:
            r0 = 1198676191(0x477258df, float:62040.87)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6w r1 = (X.C61423K6w) r1
            com.instagram.music.search.MusicOverlayResultsListController r1 = r1.A04
            if (r1 == 0) goto L_0x0aa7
            r1.A07()
            r1 = 1278552930(0x4c352b62, float:4.7492488E7)
            goto L_0x0e29
        L_0x0a67:
            r0 = -1233887575(0xffffffffb6745ea9, float:-3.6413933E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6w r1 = (X.C61423K6w) r1
            X.C61423K6w.A02(r1)
            r1 = -681734028(0xffffffffd75d9074, float:-2.43612491E14)
            goto L_0x0e29
        L_0x0a7a:
            r0 = 1747251464(0x6824f108, float:3.1156574E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6w r4 = (X.C61423K6w) r4
            X.0eM r1 = r4.A0R
            X.27r r3 = X.C51971G9r.A0g(r1)
            com.instagram.api.schemas.MusicProduct r2 = r4.A01
            if (r2 == 0) goto L_0x0b5b
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r2 != r1) goto L_0x0aa4
            X.8fP r1 = X.C360948fP.CLIPS
        L_0x0a95:
            r3.A0u(r1)
            com.instagram.music.search.MusicOverlayResultsListController r1 = r4.A04
            if (r1 == 0) goto L_0x0aa7
            r1.A08()
            r1 = -525495390(0xffffffffe0ad93a2, float:-1.0006015E20)
            goto L_0x0e29
        L_0x0aa4:
            X.8fP r1 = X.C360948fP.NORMAL
            goto L_0x0a95
        L_0x0aa7:
            java.lang.String r6 = "resultsListController"
            goto L_0x0b7f
        L_0x0aab:
            r0 = -1551629159(0xffffffffa3840499, float:-1.4313416E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JZ0 r2 = (X.JZ0) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.A09(r1)
            r1 = -2113264450(0xffffffff820a24be, float:-1.0149183E-37)
            goto L_0x0e29
        L_0x0ac0:
            r0 = -760501808(0xffffffffd2aba9d0, float:-3.68644194E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.music.search.AudioBrowserBrowseLandingPageFragment r6 = (com.instagram.music.search.AudioBrowserBrowseLandingPageFragment) r6
            androidx.viewpager.widget.ViewPager r1 = r6.viewPager
            if (r1 == 0) goto L_0x0b61
            r1.requestFocus()
            X.0eM r4 = r6.A0H
            X.27r r2 = X.C51971G9r.A0g(r4)
            X.8fP r1 = X.C360948fP.NORMAL
            r2.A0u(r1)
            com.google.common.collect.ImmutableList r2 = r6.A04
            if (r2 == 0) goto L_0x0b5e
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            boolean r1 = r2.contains(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0b12
            java.lang.String r3 = "playlists"
        L_0x0aed:
            android.content.Context r2 = r6.requireContext()
            r1 = 2131967864(0x7f133f78, float:1.9572606E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r1)
            r14 = 0
            java.lang.String r1 = "bookmarked"
            com.instagram.music.common.model.MusicBrowseCategory r15 = X.C64181LSn.A03(r3, r1, r2)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.api.schemas.MusicProduct r12 = r6.A05
            if (r12 == 0) goto L_0x0b5b
            com.google.common.collect.ImmutableList r10 = r6.A04
            if (r10 == 0) goto L_0x0b5e
            java.lang.String r5 = r6.A0D
            if (r5 != 0) goto L_0x0b15
            java.lang.String r6 = "browseSessionFullId"
            goto L_0x0b7f
        L_0x0b12:
            java.lang.String r3 = "saved_music"
            goto L_0x0aed
        L_0x0b15:
            X.80X r4 = r6.A0C
            if (r4 != 0) goto L_0x0b1c
            java.lang.String r6 = "captureState"
            goto L_0x0b7f
        L_0x0b1c:
            X.JVj r9 = r6.A02
            if (r9 != 0) goto L_0x0b23
            java.lang.String r6 = "surfaceType"
            goto L_0x0b7f
        L_0x0b23:
            X.89i r8 = r6.A01
            com.google.common.collect.ImmutableList r11 = r6.A03
            r3 = 0
            int r7 = r6.A00
            boolean r2 = r6.A0G
            java.util.Map r1 = r6.A0F
            java.lang.String r20 = "full_list"
            r16 = r14
            r19 = r14
            r22 = r7
            r23 = r3
            r24 = r2
            r21 = r1
            r18 = r5
            r17 = r4
            X.K6w r2 = X.C63352KvZ.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.MSb r1 = r6.A0A
            if (r1 != 0) goto L_0x0b4b
            java.lang.String r6 = "trackSelectionDelegate"
            goto L_0x0b7f
        L_0x0b4b:
            r2.A05 = r1
            X.2xu r1 = r6.A08
            if (r1 == 0) goto L_0x0b53
            r2.A03 = r1
        L_0x0b53:
            X.C63353Kva.A00(r6, r2, r3)
            r1 = 221159723(0xd2ea12b, float:5.381189E-31)
            goto L_0x0e29
        L_0x0b5b:
            java.lang.String r6 = "musicProduct"
            goto L_0x0b7f
        L_0x0b5e:
            java.lang.String r6 = "audioTrackTypesToExclude"
            goto L_0x0b7f
        L_0x0b61:
            java.lang.String r6 = "viewPager"
            goto L_0x0b7f
        L_0x0b64:
            r0 = -1781730329(0xffffffff95ccf3e7, float:-8.2779754E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.0r1 r4 = new X.0r1
            r4.<init>()
            X.0r1 r3 = new X.0r1
            r3.<init>()
            java.lang.Object r9 = r1.A01
            X.K52 r9 = (X.K52) r9
            android.content.Context r5 = r9.A00
            if (r5 != 0) goto L_0x0b87
            java.lang.String r6 = "context"
        L_0x0b7f:
            X.0qQ.A0F(r6)
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x0b87:
            X.0eM r1 = r9.A0A
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r1)
            X.80X r18 = X.AnonymousClass80X.UNINITIALIZED
            com.instagram.music.common.constants.AudioTrackType r2 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            com.instagram.music.common.constants.AudioTrackType r1 = com.instagram.music.common.constants.AudioTrackType.REACTIVE
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r2, r1)
            X.0qQ.A07(r7)
            r21 = 1
            X.LnU r15 = new X.LnU
            r15.<init>(r9, r4, r3)
            X.LnP r14 = new X.LnP
            r14.<init>(r9, r3, r4)
            com.instagram.api.schemas.MusicProduct r8 = com.instagram.api.schemas.MusicProduct.MUSIC_ON_PROFILE
            boolean r1 = X.AnonymousClass1GD.A03()
            r23 = r1 ^ 1
            X.89i r6 = X.C3515589i.CHOOSE_MUSIC_ON_PROFILE
            r11 = 0
            r1 = 0
            X.89j r17 = X.C3515689j.UNKNOWN
            X.89k r4 = new X.89k
            r12 = r11
            r13 = r11
            r16 = r11
            r19 = r11
            r20 = r1
            r22 = r21
            r24 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0A(r11, r11, r1, r1)
            r1 = -2122704868(0xffffffff817a181c, float:-4.5935046E-38)
            goto L_0x0e29
        L_0x0bcd:
            r0 = 797953712(0x2f8fceb0, float:2.615841E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K52 r2 = (X.K52) r2
            X.0eM r1 = r2.A09
            java.lang.Object r3 = r1.getValue()
            X.6vZ r3 = (X.C322296vZ) r3
            X.0eM r7 = r2.A0A
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r14 = "music_settings"
            com.instagram.music.common.model.AudioOverlayTrack r1 = r2.A02
            r8 = 0
            if (r1 == 0) goto L_0x0c6c
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x0c6c
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x0c6c
            long r17 = r1.longValue()
        L_0x0bfc:
            X.HOu r10 = X.C54689HOu.A0t
            X.1QJ r4 = X.AnonymousClass1QI.A00
            X.1QM r1 = r4.A02
            java.lang.String r15 = r1.A00
            r11 = 0
            com.instagram.music.common.model.AudioOverlayTrack r1 = r2.A02
            if (r1 == 0) goto L_0x0c69
            java.lang.String r1 = r1.A0B
            if (r1 == 0) goto L_0x0c69
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x0c69
            long r5 = r1.longValue()
        L_0x0c17:
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            r16 = r11
            X.C56326Hwd.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            X.0lg r1 = X.DbT.A0X(r7)
            X.0wc r5 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r1 = "instagram_music_on_profile_remove_tap"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r1)
            boolean r1 = r5.isSampled()
            if (r1 == 0) goto L_0x0c5f
            java.lang.String r1 = "containermodule"
            r5.AAJ(r1, r14)
            com.instagram.music.common.model.AudioOverlayTrack r1 = r2.A02
            if (r1 == 0) goto L_0x0c45
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x0c45
            long r8 = X.JTR.A0M(r1)
        L_0x0c45:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r1 = "container_id"
            r5.A9F(r1, r2)
            X.HOu r2 = X.C54689HOu.A0N
            java.lang.String r1 = "action_source"
            r5.A8M(r2, r1)
            X.1QM r1 = r4.A02
            java.lang.String r1 = r1.A00
            X.C51965G9l.A1K(r5, r1)
            r5.Cgf()
        L_0x0c5f:
            X.05G r1 = r3.A05
            r1.Epw(r11)
            r1 = -529304182(0xffffffffe073758a, float:-7.017232E19)
            goto L_0x0e29
        L_0x0c69:
            r5 = 0
            goto L_0x0c17
        L_0x0c6c:
            r17 = 0
            goto L_0x0bfc
        L_0x0c6f:
            r0 = 1090704086(0x4102d2d6, float:8.176474)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K52 r4 = (X.K52) r4
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x0d25
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A01
            r7 = 1
            if (r1 == 0) goto L_0x0d12
            X.6ve r10 = r4.A04
            if (r10 == 0) goto L_0x0caa
            X.0eM r1 = r4.A0A
            java.lang.String r1 = X.DbU.A0u(r1)
            java.lang.String r9 = "edit_profile_music"
            r8 = 0
            long r2 = X.C322326ve.A00(r10, r1)
            r5 = 0
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0caa
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r5 = r10.A0A
            boolean r1 = r5.isOngoingFlow(r2)
            if (r1 != 0) goto L_0x0caa
            com.facebook.quicklog.reliability.UserFlowConfig r1 = new com.facebook.quicklog.reliability.UserFlowConfig
            r1.<init>(r9, r8)
            r5.flowStart(r2, r1)
        L_0x0caa:
            com.instagram.music.common.model.AudioOverlayTrack r2 = r4.A01
            if (r2 == 0) goto L_0x0cd3
            X.DbY.A18(r4, r7)
            X.0eM r1 = r4.A09
            X.2YL r7 = X.DbS.A0H(r1)
            int r6 = r2.A03
            int r5 = r2.A02
            com.instagram.music.common.model.MusicAssetModel r1 = r2.A08
            if (r1 == 0) goto L_0x0d29
            r3 = 0
            X.JVM r2 = new X.JVM
            r2.<init>(r1, r3, r6, r5)
            X.6oS r6 = X.C318116oQ.A00(r7)
            r1 = 28
            X.MH3 r5 = new X.MH3
            r5.<init>(r7, r2, r3, r1)
        L_0x0cd0:
            X.AnonymousClass7TE.A1Z(r5, r6)
        L_0x0cd3:
            X.0eM r1 = r4.A0A
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r9 = "music_settings"
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A02
            r2 = 0
            if (r1 == 0) goto L_0x0d0f
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x0d0f
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x0d0f
            long r12 = r1.longValue()
        L_0x0cef:
            X.HOu r5 = X.C54689HOu.A02
            java.lang.String r10 = X.DbS.A0k()
            r6 = 0
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A02
            if (r1 == 0) goto L_0x0d02
            java.lang.String r1 = r1.A0B
            if (r1 == 0) goto L_0x0d02
            long r2 = X.JTR.A0M(r1)
        L_0x0d02:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r11 = r6
            X.C56326Hwd.A00(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0d0a:
            r1 = 2107079557(0x7d977b85, float:2.5169347E37)
            goto L_0x0e29
        L_0x0d0f:
            r12 = 0
            goto L_0x0cef
        L_0x0d12:
            X.0eM r1 = r4.A09
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r6 = X.C318116oQ.A00(r3)
            r2 = 0
            r1 = 30
            X.JV6 r5 = new X.JV6
            r5.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r2, (int) r1, (boolean) r7)
            goto L_0x0cd0
        L_0x0d25:
            X.DbT.A1J(r4)
            goto L_0x0d0a
        L_0x0d29:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r1 = 1159430107(0x451b7fdb, float:2487.991)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r3
        L_0x0d34:
            r0 = -1149131497(0xffffffffbb81a517, float:-0.003956448)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K52 r3 = (X.K52) r3
            X.0eM r2 = r3.A09
            java.lang.Object r0 = r2.getValue()
            X.6vZ r0 = (X.C322296vZ) r0
            X.2Fk r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            X.9IP r0 = (X.AnonymousClass9IP) r0
            r1 = 1
            if (r0 == 0) goto L_0x0d67
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x0d67
            android.content.Context r1 = r3.getContext()
            r0 = 32
            X.LV2 r0 = X.LV2.A00(r3, r0)
            X.FCN.A00(r1, r0)
        L_0x0d63:
            r0 = 833278798(0x31aad34e, float:4.9716737E-9)
            goto L_0x0dd3
        L_0x0d67:
            java.lang.Object r0 = r2.getValue()
            X.6vZ r0 = (X.C322296vZ) r0
            r0.A00()
            X.DbT.A1J(r3)
            goto L_0x0d63
        L_0x0d74:
            r0 = 18079496(0x113df08, float:2.7159653E-38)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K73 r6 = (X.K73) r6
            X.8a4 r1 = r6.A01
            r0 = 0
            if (r1 != 0) goto L_0x0d8e
            java.lang.String r13 = "musicOverlayEditController"
        L_0x0d86:
            X.0qQ.A0F(r13)
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x0d8e:
            r1.A0G()
            com.instagram.music.common.model.AudioOverlayTrack r8 = r6.A00
            if (r8 != 0) goto L_0x0d98
            java.lang.String r13 = "currentAudioOverlayTrack"
            goto L_0x0d86
        L_0x0d98:
            X.0eM r1 = r6.A04
            java.lang.Object r7 = r1.getValue()
            X.6vZ r7 = (X.C322296vZ) r7
            com.instagram.music.common.model.MusicAssetModel r4 = r8.A08
            if (r4 == 0) goto L_0x0dd7
            int r3 = r8.A03
            int r1 = r8.A02
            com.instagram.music.common.model.AudioOverlayTrack r2 = new com.instagram.music.common.model.AudioOverlayTrack
            r2.<init>(r4, r3, r1)
            X.05G r1 = r7.A05
            r1.Epw(r2)
            X.0eM r1 = r6.A05
            X.27r r7 = X.C51971G9r.A0g(r1)
            r9 = 0
            r12 = 0
            java.lang.String r1 = r8.A0A
            if (r1 == 0) goto L_0x0dc2
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r1)
        L_0x0dc2:
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            X.JVj r8 = X.C59725JVj.PROFILE
            java.lang.String r10 = "AUDIO_EDITOR_PAGE_DONE_BUTTON"
            r7.A1K(r8, r9, r10, r11, r12)
            X.DbT.A1J(r6)
            r0 = 1758731978(0x68d41eca, float:8.013677E24)
        L_0x0dd3:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0dd7:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r0 = -745582896(0xffffffffd38f4ed0, float:-1.23100516E12)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r3
        L_0x0de2:
            r0 = -2103945592(0xffffffff82985688, float:-2.238406E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1151519089(0x44a2c971, float:1302.295)
            goto L_0x0e29
        L_0x0df2:
            r0 = -1988430166(0xffffffff897af6aa, float:-3.0208636E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -626258024(0xffffffffdaac0f98, float:-2.42154208E16)
            goto L_0x0e29
        L_0x0e02:
            r0 = 1766484439(0x694a69d7, float:1.5293927E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lhj r1 = (X.C64767Lhj) r1
            X.LrS r1 = r1.A00
            X.JjW r2 = r1.A02
            com.instagram.mediakit.analytics.VisibilitySheetOrigin r1 = com.instagram.mediakit.analytics.VisibilitySheetOrigin.PINNED_PRIVATE_BANNER
            r2.A04(r1)
            r1 = 584205809(0x22d245f1, float:5.6994667E-18)
            goto L_0x0e29
        L_0x0e1a:
            r0 = -285020711(0xffffffffef02edd9, float:-4.052059E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = -565084131(0xffffffffde51801d, float:-3.77402446E18)
        L_0x0e29:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64273LXz.onClick(android.view.View):void");
    }
}
