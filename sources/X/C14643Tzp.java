package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Tzp  reason: case insensitive filesystem */
public final class C14643Tzp implements X5Q {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ ReelDashboardFragment A01;

    public C14643Tzp(C255773uh r1, ReelDashboardFragment reelDashboardFragment) {
        this.A01 = reelDashboardFragment;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ea, code lost:
        if (X.DbY.A1Y(X.0Tu.A06, r3.A06, 36313029364876906L) != false) goto L_0x01ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DzV(X.C17700VcV r15, java.lang.Boolean r16, java.lang.String r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.util.List r24, java.util.List r25, int r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            r14 = this;
            r6 = r26
            r7 = r23
            if (r26 <= 0) goto L_0x003b
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x003b
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x003b
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = r14.A01
            com.instagram.common.session.UserSession r0 = r0.A06
            X.W0E r3 = X.C14639Tzl.A00(r0)
            X.3uh r0 = r14.A00
            java.lang.String r1 = r0.A0j
            boolean r0 = X.W0E.A01(r3, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Long r0 = X.W0E.A00(r3, r1)
            if (r0 == 0) goto L_0x003b
            long r1 = r0.longValue()
            X.1QP r4 = r3.A02
            java.lang.String r0 = "failure_reason"
            java.lang.String r3 = "ig_viewers_list_empty"
            r4.flowAnnotate(r1, r0, r3)
            r0 = 0
            r4.flowEndFail(r1, r3, r0)
        L_0x003b:
            X.3uh r5 = r14.A00
            r5.A0d()
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = r14.A01
            java.util.ArrayList r2 = instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A01(r7)
            X.TzX r1 = r3.mListAdapter
            java.lang.String r4 = r5.A0j
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x00df
            if (r23 == 0) goto L_0x00df
        L_0x0052:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x005a
            r2 = r22
        L_0x005a:
            r0 = r17
            boolean r0 = r1.A0B(r4, r0, r7, r2)
            if (r0 == 0) goto L_0x0235
            java.util.Set r0 = r3.A0Y
            r0.add(r4)
            X.3mL r7 = r5.A0e
            int r1 = r7.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x009b
            X.1Xj r8 = r5.A0b
            r8.getClass()
            int r1 = r8.A10()
            r0 = 10
            if (r1 < r0) goto L_0x0092
            int r0 = r1 * 2
            if (r6 < r0) goto L_0x0092
            java.lang.String r2 = "old count: "
            int r1 = r8.A10()
            java.lang.String r0 = ", new count: "
            java.lang.String r1 = X.002.A02(r1, r6, r2, r0)
            java.lang.String r0 = "Media#setTotalViewerCount"
            X.0wb.A03(r0, r1)
        L_0x0092:
            X.1Xy r1 = r8.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.Ep3(r0)
        L_0x009b:
            X.1Xj r2 = r5.A0b
            r2.getClass()
            X.1Xy r1 = r2.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r1.EWM(r0)
            java.util.List r6 = r5.A0l
            r6.clear()
            r0 = r21
            r6.addAll(r0)
            X.3mL r0 = X.C250963mL.MEDIA
            if (r7 != r0) goto L_0x00ea
            if (r18 == 0) goto L_0x00ea
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x00ea
            X.1Xy r1 = r2.A0C
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r18)
            r1.Ehn(r0)
            X.1Xy r7 = r2.A0C
            r2 = 0
            java.util.Iterator r1 = r18.iterator()
        L_0x00cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r1.next()
            X.BG9 r0 = (X.BG9) r0
            int r0 = r0.A00
            int r2 = r2 + r0
            goto L_0x00cf
        L_0x00df:
            r7 = r19
            goto L_0x0052
        L_0x00e3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.Ehl(r0)
        L_0x00ea:
            java.util.List r0 = r5.A0m
            r0.clear()
            r1 = r25
            r0.addAll(r1)
            r0 = r29
            r5.A0T = r0
            r0 = r30
            r5.A0O = r0
            X.TzX r0 = r3.mListAdapter
            r1 = r20
            r0.A09(r4, r1)
            if (r15 == 0) goto L_0x01fb
            java.lang.String r0 = r15.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = r15.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01d3
            android.content.Context r8 = r3.requireContext()
            boolean r13 = r5.A1m()
            java.util.Iterator r12 = r6.iterator()
            r11 = 0
            r7 = 0
            r10 = 0
            r9 = 0
        L_0x0125:
            boolean r0 = r12.hasNext()
            r2 = 2
            if (r0 == 0) goto L_0x0152
            java.lang.Object r0 = r12.next()
            X.VW6 r0 = (X.VW6) r0
            int r7 = r7 + 1
            com.instagram.model.reels.Reel r0 = r0.A02
            X.1Ns r0 = r0.A0W
            r0.getClass()
            java.lang.Integer r0 = r0.CAm()
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0150
            r0 = 3
            if (r1 == r0) goto L_0x014e
            r0 = 10
            if (r1 != r0) goto L_0x0125
            r9 = 1
            goto L_0x0125
        L_0x014e:
            r10 = 1
            goto L_0x0125
        L_0x0150:
            r11 = 1
            goto L_0x0125
        L_0x0152:
            if (r11 == 0) goto L_0x0196
            if (r10 == 0) goto L_0x01a5
            r0 = 2131967701(0x7f133ed5, float:1.9572276E38)
            if (r13 == 0) goto L_0x015e
            r0 = 2131967703(0x7f133ed7, float:1.957228E38)
        L_0x015e:
            java.lang.String r0 = r8.getString(r0)
        L_0x0162:
            r15.A08 = r0
            android.content.Context r9 = r3.requireContext()
            java.util.Iterator r8 = r6.iterator()
            r7 = 0
            r6 = 0
        L_0x016e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r8.next()
            X.VW6 r0 = (X.VW6) r0
            com.instagram.model.reels.Reel r0 = r0.A02
            X.1Ns r0 = r0.A0W
            r0.getClass()
            java.lang.Integer r0 = r0.CAm()
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0194
            r0 = 3
            if (r1 == r0) goto L_0x0194
            r0 = 10
            if (r1 != r0) goto L_0x016e
            r6 = 1
            goto L_0x016e
        L_0x0194:
            r7 = 1
            goto L_0x016e
        L_0x0196:
            if (r10 == 0) goto L_0x01b6
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131820836(0x7f110124, float:1.9274398E38)
            if (r13 == 0) goto L_0x01b1
            r0 = 2131820838(0x7f110126, float:1.9274402E38)
            goto L_0x01b1
        L_0x01a5:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131820837(0x7f110125, float:1.92744E38)
            if (r13 == 0) goto L_0x01b1
            r0 = 2131820839(0x7f110127, float:1.9274404E38)
        L_0x01b1:
            java.lang.String r0 = X.DbY.A0d(r1, r7, r0)
            goto L_0x0162
        L_0x01b6:
            if (r9 == 0) goto L_0x01c1
            r0 = 2131967700(0x7f133ed4, float:1.9572274E38)
            if (r13 == 0) goto L_0x015e
            r0 = 2131967702(0x7f133ed6, float:1.9572278E38)
            goto L_0x015e
        L_0x01c1:
            java.lang.String r0 = ""
            goto L_0x0162
        L_0x01c4:
            if (r7 == 0) goto L_0x020a
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131967697(0x7f133ed1, float:1.9572268E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x01d1:
            r15.A02 = r0
        L_0x01d3:
            java.lang.String r1 = r15.A09
            java.lang.String r0 = "FB_XPOST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ec
            com.instagram.common.session.UserSession r5 = r3.A06
            X.0Tu r2 = X.0Tu.A06
            r0 = 36313029364876906(0x8102820003066a, double:3.0278442189563516E-306)
            boolean r0 = X.DbY.A1Y(r2, r5, r0)
            if (r0 == 0) goto L_0x01fb
        L_0x01ec:
            X.TzX r0 = r3.mListAdapter
            X.Tzb r0 = X.C14625TzX.A01(r0, r4)
            if (r0 == 0) goto L_0x01fb
            X.TrF r0 = r0.A0j
            r0.A07 = r15
            r0.A07()
        L_0x01fb:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r3.mImageViewPager
            float r0 = r1.A01
            r1.A0H(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r3.mListViewPager
            float r0 = r1.A01
            r1.A0H(r0)
            return
        L_0x020a:
            if (r6 == 0) goto L_0x0232
            r2 = 0
            com.instagram.model.effect.AttributedAREffect r0 = r5.A05
            if (r0 == 0) goto L_0x021e
            java.lang.String r2 = r0.A05()
            if (r2 != 0) goto L_0x022a
            java.lang.String r1 = "ReelViewerListMegaphoneUtil"
            java.lang.String r0 = "getStringForMASContent() has null effect name."
            X.0wb.A03(r1, r0)
        L_0x021e:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131967699(0x7f133ed3, float:1.9572272E38)
        L_0x0225:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r2, r0)
            goto L_0x01d1
        L_0x022a:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131967698(0x7f133ed2, float:1.957227E38)
            goto L_0x0225
        L_0x0232:
            java.lang.String r0 = ""
            goto L_0x01d1
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14643Tzp.DzV(X.VcV, java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, int, int, boolean, boolean):void");
    }
}
