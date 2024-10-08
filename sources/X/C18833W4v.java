package X;

import android.content.DialogInterface;

/* renamed from: X.W4v  reason: case insensitive filesystem */
public final class C18833W4v implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C18833W4v(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03b2, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0401, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0408, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0454, code lost:
        r3 = "promoteAdToolsAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0457, code lost:
        r3 = "recyclerViewProxy";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r23, int r24) {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A00
            r4 = r23
            switch(r0) {
                case 0: goto L_0x045a;
                case 1: goto L_0x0134;
                case 2: goto L_0x03f7;
                case 3: goto L_0x036e;
                case 4: goto L_0x0360;
                case 5: goto L_0x03a8;
                case 6: goto L_0x0350;
                case 7: goto L_0x0350;
                case 8: goto L_0x0332;
                case 9: goto L_0x011d;
                case 10: goto L_0x010b;
                case 11: goto L_0x0317;
                case 12: goto L_0x02da;
                case 13: goto L_0x02a8;
                case 14: goto L_0x0009;
                case 15: goto L_0x0009;
                case 16: goto L_0x0238;
                case 17: goto L_0x01fd;
                case 18: goto L_0x01ce;
                case 19: goto L_0x0010;
                case 20: goto L_0x00f6;
                case 21: goto L_0x0189;
                case 22: goto L_0x00cb;
                case 23: goto L_0x0011;
                case 24: goto L_0x015f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A02
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            r0.onDismiss(r4)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r2.A01
            X.3gp r1 = (X.C247733gp) r1
            java.lang.Object r4 = r2.A02
            X.Vzr r4 = (X.C18756Vzr) r4
            if (r1 != 0) goto L_0x0074
            X.Udf r2 = r4.A02
            X.VsW r8 = r2.A06
            X.Wv0 r7 = r8.A00
            com.google.common.collect.ImmutableSet r0 = X.C13990Tnq.A0L(r7)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            boolean r0 = r4.A05
            r9 = 0
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
        L_0x0036:
            java.util.Iterator r12 = X.AnonymousClass7TE.A1G(r3)
        L_0x003a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x049d
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r12)
            X.3gp r0 = (X.C247733gp) r0
            r10 = 1
            r0.A0P = r10
            java.lang.String r6 = r0.A0F
            if (r6 == 0) goto L_0x003a
            java.util.List r0 = r8.A01
            java.util.Iterator r5 = r0.iterator()
        L_0x0053:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.3gp r0 = (X.C247733gp) r0
            java.lang.String r0 = r0.A0G
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0053
        L_0x0068:
            X.3gp r1 = (X.C247733gp) r1
            if (r1 == 0) goto L_0x003a
            r1.A0P = r10
            r11.add(r1)
            goto L_0x003a
        L_0x0072:
            r1 = 0
            goto L_0x0068
        L_0x0074:
            X.1Xj r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x00c9
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
        L_0x007e:
            r6 = 1
            r1.A0P = r6
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r3.add(r1)
            java.lang.String r5 = r1.A0F
            if (r5 == 0) goto L_0x00b5
            X.Udf r0 = r4.A02
            X.VsW r0 = r0.A06
            java.util.List r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0097:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3gp r0 = (X.C247733gp) r0
            java.lang.String r0 = r0.A0G
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0097
        L_0x00ac:
            X.3gp r1 = (X.C247733gp) r1
            if (r1 == 0) goto L_0x00b5
            r3.add(r1)
            r1.A0P = r6
        L_0x00b5:
            X.Hrb r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A01(r0, r7, r3)
            X.Udf r2 = r4.A02
            X.VsW r0 = r2.A06
            java.util.Set r0 = r0.A02
            r0.addAll(r3)
            goto L_0x04b3
        L_0x00c7:
            r1 = 0
            goto L_0x00ac
        L_0x00c9:
            r7 = 0
            goto L_0x007e
        L_0x00cb:
            java.lang.Object r0 = r2.A01
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3 = r0[r24]
            java.lang.Object r0 = r2.A02
            X.U4j r0 = (X.C14721U4j) r0
            X.VPy r0 = r0.A0Z
            X.4MM r0 = r0.A00
            X.4Ms r1 = r0.A09
            if (r3 == 0) goto L_0x0010
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0010
            X.4Mt r2 = r1.A0I
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "setCustomQuality: %s"
            X.C263634Mt.A05(r2, r0, r1)
            android.os.Handler r1 = r2.A0E
            r0 = 13
            X.AnonymousClass7TE.A1S(r1, r3, r0)
            return
        L_0x00f6:
            java.lang.Object r0 = r2.A01
            X.W0T r0 = (X.W0T) r0
            r0.A03()
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0010
            java.lang.Object r1 = r2.A02
            X.K4f r1 = (X.C61363K4f) r1
            r0 = 1
            r1.A0S = r0
            return
        L_0x010b:
            java.lang.Object r1 = r2.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.W38.A06(r1, r0)
            java.lang.Object r0 = r2.A02
            X.X8Y r0 = (X.X8Y) r0
            if (r0 == 0) goto L_0x0010
            r0.DZN()
            return
        L_0x011d:
            java.lang.Object r0 = r2.A01
            X.X6V r0 = (X.X6V) r0
            r0.Dqw()
            java.lang.Object r0 = r2.A02
            X.VhY r0 = (X.C17881VhY) r0
            android.app.Activity r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0010
            r1.finish()
            return
        L_0x0134:
            java.lang.Object r4 = r2.A01
            com.instagram.archive.fragment.ArchiveReelFragment r4 = (com.instagram.archive.fragment.ArchiveReelFragment) r4
            java.lang.Object r3 = r2.A02
            X.1Xj r3 = (X.1Xj) r3
            X.UdK r2 = r4.A00
            X.VM4 r1 = r2.A05
            r0 = 1
            r1.A00 = r0
            r2.A0C()
            X.Jj7 r0 = r4.A03
            r0.A04(r3)
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0010
            X.1Wj r3 = X.DcL.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A04
            java.lang.String r0 = "729501257421949"
            r3.A03(r1, r2, r0)
            return
        L_0x015f:
            X.1Z4 r5 = X.1Z4.A00
            java.lang.Object r4 = r2.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r4 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            r5.A02(r3, r1, r0)
            X.Udf r0 = r4.A03
            X.VsW r0 = r0.A06
            X.Wv0 r0 = r0.A00
            r0.clear()
            X.Udf r0 = r4.A03
            r0.A00()
            android.content.Context r2 = r4.getContext()
            r1 = 2131964966(0x7f133426, float:1.9566729E38)
            r0 = 0
            X.C59689JTv.A08(r2, r1, r0)
            return
        L_0x0189:
            java.lang.Object r4 = r2.A02
            X.W2P r4 = (X.W2P) r4
            com.instagram.common.session.UserSession r0 = r4.A0Q
            X.1NY r3 = X.DbU.A0M(r0)
            X.1Xj r0 = r4.A03
            if (r0 == 0) goto L_0x01c9
            java.lang.String r0 = r0.A30()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/story/%s/remove_storefront_sticker/"
            X.DbU.A1P(r3, r0, r1)
            r3.A04()
            java.lang.Class<X.K1b> r1 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            X.1OC r3 = X.DbU.A0S(r3, r1, r0)
            java.lang.Object r2 = r2.A01
            X.VQC r2 = (X.VQC) r2
            r0 = 14
            X.C15622Ufo.A00(r3, r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.A0P
            X.0gy r0 = X.AnonymousClass07i.A00(r1)
            X.1ES.A00(r1, r0, r3)
            X.6iY r0 = r2.A00
            X.4mU r0 = r0.A02
            r0.EHd()
            return
        L_0x01c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01ce:
            java.lang.Object r3 = r2.A01
            X.X1W r3 = (X.X1W) r3
            java.lang.Object r1 = r2.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.Wb7 r3 = (X.C19521Wb7) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01ed;
                case 2: goto L_0x01f5;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            java.lang.Object r0 = r3.A01
            X.Ubu r0 = (X.C15391Ubu) r0
            r0.Drw(r1)
            return
        L_0x01e5:
            java.lang.Object r0 = r3.A02
            X.Ubv r0 = (X.C15392Ubv) r0
            r0.Drw(r1)
            return
        L_0x01ed:
            java.lang.Object r0 = r3.A02
            X.Ubx r0 = (X.C15394Ubx) r0
            r0.Drw(r1)
            return
        L_0x01f5:
            java.lang.Object r0 = r3.A02
            X.Ubw r0 = (X.C15393Ubw) r0
            r0.Drw(r1)
            return
        L_0x01fd:
            java.lang.Object r2 = r2.A01
            X.X1W r2 = (X.X1W) r2
            X.Wb7 r2 = (X.C19521Wb7) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0214;
                case 1: goto L_0x0220;
                case 2: goto L_0x022c;
                default: goto L_0x0208;
            }
        L_0x0208:
            java.lang.Object r1 = r2.A01
            X.Ubu r1 = (X.C15391Ubu) r1
            java.lang.Object r0 = r2.A02
            X.Tzd r0 = (X.C14631Tzd) r0
            r1.DzU(r0)
            return
        L_0x0214:
            java.lang.Object r1 = r2.A02
            X.Ubv r1 = (X.C15392Ubv) r1
            java.lang.Object r0 = r2.A01
            X.Tzd r0 = (X.C14631Tzd) r0
            r1.DzU(r0)
            return
        L_0x0220:
            java.lang.Object r1 = r2.A02
            X.Ubx r1 = (X.C15394Ubx) r1
            java.lang.Object r0 = r2.A01
            X.Tzd r0 = (X.C14631Tzd) r0
            r1.DzU(r0)
            return
        L_0x022c:
            java.lang.Object r1 = r2.A02
            X.Ubw r1 = (X.C15393Ubw) r1
            java.lang.Object r0 = r2.A01
            X.Tzd r0 = (X.C14631Tzd) r0
            r1.DzU(r0)
            return
        L_0x0238:
            java.lang.Object r4 = r2.A02
            X.WPh r4 = (X.C19201WPh) r4
            java.lang.CharSequence[] r0 = X.C19201WPh.A0W(r4)
            r3 = r0[r24]
            java.lang.CharSequence r0 = r4.A03
            if (r0 == 0) goto L_0x0266
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0266
            java.lang.Object r0 = r2.A01
            X.XCI r0 = (X.XCI) r0
            r0.DJC()
            X.0wc r1 = r4.A0A
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "recommended_user_see_fewer_suggestions_tapped"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            r0.Cgf()
        L_0x0262:
            r0 = 0
            r4.A01 = r0
            return
        L_0x0266:
            android.content.res.Resources r1 = r4.A05
            r0 = 2131963108(0x7f132ce4, float:1.956296E38)
            boolean r0 = X.C13988Tno.A1X(r1, r3, r0)
            if (r0 == 0) goto L_0x0262
            X.3uh r1 = r4.A0F
            boolean r0 = r1.A1R()
            if (r0 == 0) goto L_0x0262
            X.4gC r1 = r1.A0B
            r0 = 504(0x1f8, float:7.06E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.17k.A07(r1, r0)
            if (r1 == 0) goto L_0x0262
            X.3II r0 = r1.A00
            X.1Xj r3 = r0.BPf()
            X.DU7 r0 = r0.ApN()
            if (r0 == 0) goto L_0x02a6
            java.lang.String r2 = r0.getOriginalCommentId()
        L_0x0296:
            if (r3 == 0) goto L_0x0262
            if (r2 == 0) goto L_0x0262
            com.instagram.common.session.UserSession r1 = r4.A0B
            androidx.fragment.app.Fragment r0 = r4.A06
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.I5a.A01(r0, r1, r3, r2)
            goto L_0x0262
        L_0x02a6:
            r2 = 0
            goto L_0x0296
        L_0x02a8:
            r10 = 0
            X.0qQ.A0B(r4, r10)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r2.A01
            android.content.Context r1 = X.DbT.A08(r0)
            java.lang.Object r0 = r2.A02
            X.0lg r0 = (X.0lg) r0
            java.lang.String r6 = "https://help.instagram.com/667697642215070"
            r7 = 0
            r14 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r9 = r7
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r14
            r16 = r10
            r17 = r14
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21)
            r3.A02(r1, r0, r5)
            r4.dismiss()
            return
        L_0x02da:
            java.lang.Object r7 = r2.A01
            X.Uc0 r7 = (X.C15397Uc0) r7
            java.lang.Object r5 = r2.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r9 = r7.A0C     // Catch:{ IOException -> 0x030e }
            r9.getClass()     // Catch:{ IOException -> 0x030e }
            X.XAi r2 = r7.A08     // Catch:{ IOException -> 0x030e }
            java.lang.Integer r8 = X.AnonymousClass05K.A0N     // Catch:{ IOException -> 0x030e }
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ IOException -> 0x030e }
            r11 = 0
            java.util.Set r10 = java.util.Collections.emptySet()     // Catch:{ IOException -> 0x030e }
            X.UfZ r6 = new X.UfZ     // Catch:{ IOException -> 0x030e }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x030e }
            java.lang.String r0 = "feed_photos_of_you"
            r2.Co2(r6, r8, r0, r1)     // Catch:{ IOException -> 0x030e }
            X.F25 r4 = r7.A05     // Catch:{ IOException -> 0x030e }
            X.EVG r3 = r7.A06     // Catch:{ IOException -> 0x030e }
            java.lang.Integer r2 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x030e }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x030e }
            java.lang.String r0 = "confirm_delete_all"
            r4.A00(r3, r2, r0, r1)     // Catch:{ IOException -> 0x030e }
            return
        L_0x030e:
            r1 = 2131969435(0x7f13459b, float:1.9575793E38)
            java.lang.String r0 = "media_action_io_exception"
            X.C59689JTv.A0F(r5, r0, r1)
            return
        L_0x0317:
            java.lang.Integer r3 = X.AnonymousClass05K.A04
            java.lang.Object r0 = r2.A01
            X.Wfg r0 = (X.C19799Wfg) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Object r0 = r2.A02
            X.Vc9 r0 = (X.C17678Vc9) r0
            X.X1p r0 = r0.A07
            X.F74.A00(r1, r0, r3)
            X.1WR r1 = X.1WR.A01()
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r1.A05(r0)
            return
        L_0x0332:
            java.lang.Object r1 = r2.A02
            X.UZX r1 = (X.UZX) r1
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0eM r0 = r1.A0C
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r1.A03
            if (r1 != 0) goto L_0x0348
            java.lang.String r3 = "entryPoint"
            goto L_0x0401
        L_0x0348:
            java.lang.Object r0 = r2.A01
            X.X6L r0 = (X.X6L) r0
            X.C18676VwZ.A01(r4, r0, r3, r1)
            return
        L_0x0350:
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r2.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = "https://www.facebook.com/business/help/131439120265224"
            X.2EG r0 = X.2EG.A34
            X.Dbb.A0k(r3, r2, r0, r1)
            return
        L_0x0360:
            java.lang.Object r3 = r2.A02
            X.Uac r3 = (X.C15328Uac) r3
            java.lang.Object r1 = r2.A01
            X.WOi r1 = (X.C19176WOi) r1
            java.lang.String r0 = "promotion_list"
            X.C15328Uac.A0A(r3, r1, r0)
            return
        L_0x036e:
            java.lang.Object r3 = r2.A02
            X.Uac r3 = (X.C15328Uac) r3
            X.3As r0 = r3.A0H
            if (r0 == 0) goto L_0x0457
            r1 = 1
            r0.EaP(r1)
            X.3AD r0 = r3.A0J
            java.lang.String r4 = "pullToRefresh"
            if (r0 == 0) goto L_0x03b2
            r0.setIsLoading(r1)
            X.3AD r0 = r3.A0J
            if (r0 == 0) goto L_0x03b2
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x039c
            X.UdV r0 = r3.A0B
            if (r0 == 0) goto L_0x0454
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A0K
            if (r0 != 0) goto L_0x0399
            java.lang.String r3 = "loadingSpinner"
            goto L_0x0401
        L_0x0399:
            X.DbS.A1T(r0)
        L_0x039c:
            java.lang.Object r2 = r2.A01
            r1 = 3
            X.WO6 r0 = new X.WO6
            r0.<init>(r1, r3, r2)
            X.C15328Uac.A02(r0, r3)
            return
        L_0x03a8:
            java.lang.Object r5 = r2.A02
            X.Uab r5 = (X.C15327Uab) r5
            X.3As r0 = r5.A04
            if (r0 != 0) goto L_0x03b6
            java.lang.String r4 = "recyclerViewProxy"
        L_0x03b2:
            X.0qQ.A0F(r4)
            goto L_0x0404
        L_0x03b6:
            r1 = 1
            r0.EaP(r1)
            X.3AD r0 = r5.A05
            java.lang.String r3 = "pullToRefresh"
            if (r0 == 0) goto L_0x0401
            r0.setIsLoading(r1)
            X.3AD r0 = r5.A05
            if (r0 == 0) goto L_0x0401
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x03df
            X.UdV r0 = r5.A02
            if (r0 != 0) goto L_0x03d2
            java.lang.String r4 = "pastPromotionsAdapter"
            goto L_0x03b2
        L_0x03d2:
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A06
            if (r0 != 0) goto L_0x03dc
            java.lang.String r4 = "loadingSpinner"
            goto L_0x03b2
        L_0x03dc:
            X.DbS.A1T(r0)
        L_0x03df:
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0eM r0 = r5.A0I
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r2 = r2.A01
            r0 = 5
            X.WO6 r1 = new X.WO6
            r1.<init>(r0, r5, r2)
            java.lang.String r0 = "ads_manager"
            X.C18676VwZ.A01(r4, r1, r3, r0)
            return
        L_0x03f7:
            java.lang.Object r5 = r2.A02
            X.UZU r5 = (X.UZU) r5
            X.VwK r3 = r5.A00
            if (r3 != 0) goto L_0x0409
            java.lang.String r3 = "adsManagerLogger"
        L_0x0401:
            X.0qQ.A0F(r3)
        L_0x0404:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0409:
            java.lang.Object r0 = r2.A01
            X.UzG r0 = (X.C16680UzG) r0
            java.lang.String r2 = X.W3M.A01(r0)
            java.lang.String r1 = r5.A07
            r0 = 0
            java.lang.String r4 = "ads_manager_highlights_hub"
            r3.A0A(r4, r2, r1, r0)
            X.3As r0 = r5.A03
            if (r0 == 0) goto L_0x0457
            r1 = 1
            r0.EaP(r1)
            X.3AD r0 = r5.A04
            java.lang.String r3 = "pullToRefresh"
            if (r0 == 0) goto L_0x0401
            r0.setIsLoading(r1)
            X.3AD r0 = r5.A04
            if (r0 == 0) goto L_0x0401
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x0440
            X.UdV r0 = r5.A01
            if (r0 == 0) goto L_0x0454
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A05
            if (r0 == 0) goto L_0x0440
            X.DbS.A1T(r0)
        L_0x0440:
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r0 = r5.A0B
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r1 = 0
            X.WO4 r0 = new X.WO4
            r0.<init>(r5, r1)
            X.C18676VwZ.A01(r3, r0, r2, r4)
            return
        L_0x0454:
            java.lang.String r3 = "promoteAdToolsAdapter"
            goto L_0x0401
        L_0x0457:
            java.lang.String r3 = "recyclerViewProxy"
            goto L_0x0401
        L_0x045a:
            java.lang.Object r5 = r2.A01
            X.Vv1 r5 = (X.C18608Vv1) r5
            java.lang.Object r4 = r2.A02
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r2 = "open"
            X.1yR r1 = X.1yR.A0A
            X.FxW r0 = new X.FxW
            r0.<init>((android.net.Uri) r4, (X.C18608Vv1) r5, (java.lang.String) r2)
            r1.A05(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            android.net.Uri r0 = X.C18608Vv1.A05
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "static_map_url"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r0.build()
            android.content.Intent r1 = r3.setData(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.setFlags(r0)
            X.VL9 r0 = r5.A01
            X.Vv1 r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.startActivity(r1)
            return
        L_0x049d:
            r3.addAll(r11)
            X.Hrb r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A01(r0, r9, r3)
            com.google.common.collect.ImmutableSet r1 = X.C13990Tnq.A0L(r7)
            java.util.Set r0 = r8.A02
            r0.addAll(r1)
            r7.clear()
        L_0x04b3:
            X.C18756Vzr.A00(r4, r3)
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = r4.A04
            X.Udf r1 = r0.A03
            X.1Xj r0 = r0.A01
            r1.A01(r0)
            r2.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18833W4v.onClick(android.content.DialogInterface, int):void");
    }
}
