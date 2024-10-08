package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.IKz  reason: case insensitive filesystem */
public final class C57007IKz implements 2IR {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public final void onFailure(Throwable th) {
    }

    public C57007IKz(1Xj r1, ReelViewerFragment reelViewerFragment) {
        this.A00 = r1;
        this.A01 = reelViewerFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015e, code lost:
        if (r10 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        if (r10 != null) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            X.3JD r12 = (X.AnonymousClass3JD) r12
            r1 = 0
            if (r12 == 0) goto L_0x015c
            X.3lr r5 = X.C41845B3m.A0U(r12)
            if (r5 == 0) goto L_0x015c
            java.lang.Class<X.Bnm> r3 = X.C42944Bnm.class
            r4 = 0
            r0 = 5390(0x150e, float:7.553E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = -2095310994(0xffffffff831c176e, float:-4.5871176E-37)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r4, r2, r3, r0)
            if (r0 == 0) goto L_0x015c
            java.lang.Object r5 = X.00k.A0O(r0, r4)
            X.3lr r5 = (X.C250663lr) r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015c
            if (r5 == 0) goto L_0x015c
            java.lang.Class<X.Bnl> r3 = X.C42943Bnl.class
            r9 = 1
            java.lang.String r2 = "specs"
            r0 = 737962438(0x2bfc69c6, float:1.7935035E-12)
            com.google.common.collect.ImmutableList r6 = r5.getRequiredCompactedTreeListField(r9, r2, r3, r0)
            java.lang.Class<X.Bne> r3 = X.C42936Bne.class
            r0 = 713(0x2c9, float:9.99E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            r0 = 942623171(0x382f49c3, float:4.1791947E-5)
            X.3lr r5 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r5 == 0) goto L_0x0167
            java.lang.Class<X.Bnd> r3 = X.C42935Bnd.class
            r0 = 5016(0x1398, float:7.029E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = -1721306333(0xffffffff9966f323, float:-1.1939822E-23)
            X.3lr r2 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r2 == 0) goto L_0x0167
            java.lang.String r0 = "tip_stage"
            java.lang.String r8 = r2.getOptionalStringField(r4, r0)
            java.lang.String r0 = "metric_name"
            java.lang.String r7 = r2.getOptionalStringField(r9, r0)
        L_0x0065:
            if (r6 == 0) goto L_0x015c
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r10 = r6.get(r4)
            X.3lr r10 = (X.C250663lr) r10
            if (r10 == 0) goto L_0x015d
            java.lang.Class<X.Bnk> r3 = X.C42942Bnk.class
            java.lang.String r2 = "title"
            r0 = -574547662(0xffffffffddc11932, float:-1.73927594E18)
            X.3lr r5 = r10.getOptionalTreeField(r9, r2, r3, r0)
            if (r5 == 0) goto L_0x015d
            java.lang.Class<X.Bnj> r3 = X.C42941Bnj.class
            java.lang.String r2 = "text"
            r0 = -1979506284(0xffffffff8a032194, float:-6.313736E-33)
            X.3lr r0 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r0 == 0) goto L_0x015d
            java.lang.String r6 = r0.getOptionalStringField(r4, r2)
        L_0x0093:
            java.lang.Class<X.Bng> r3 = X.C42938Bng.class
            java.lang.String r2 = "action"
            r0 = 890234615(0x350fe6f7, float:5.360775E-7)
            X.3lr r5 = r10.A04(r3, r2, r0)
            if (r5 == 0) goto L_0x0162
            java.lang.Class<X.Bnf> r3 = X.C42937Bnf.class
            r0 = 378(0x17a, float:5.3E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 1102238698(0x41b2d3ea, float:22.353474)
            X.3lr r2 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r2 == 0) goto L_0x0162
            java.lang.String r0 = "text"
            java.lang.String r5 = r2.getOptionalStringField(r4, r0)
        L_0x00b7:
            java.lang.Class<X.Bng> r3 = X.C42938Bng.class
            java.lang.String r2 = "action"
            r0 = 890234615(0x350fe6f7, float:5.360775E-7)
            X.3lr r2 = r10.A04(r3, r2, r0)
            if (r2 == 0) goto L_0x00ce
            r0 = 319(0x13f, float:4.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r2.getOptionalStringField(r9, r0)
        L_0x00ce:
            X.1Xj r0 = r11.A00
            X.1i4 r0 = r0.A0c
            r0.A07 = r6
            r0.A04 = r5
            r0.A01 = r1
            r0.A06 = r8
            r0.A03 = r7
            instagram.features.stories.fragment.ReelViewerFragment r3 = r11.A01
            X.3uh r1 = r3.Au5()
            if (r1 == 0) goto L_0x015c
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x015c
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x015c
            X.1i4 r5 = r0.A0c
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x015c
            android.content.Context r0 = r3.requireContext()
            X.F3t r2 = new X.F3t
            r2.<init>(r0)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131237691(0x7f081b3b, float:1.809164E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A05 = r0
            android.content.Context r1 = r3.requireContext()
            r0 = 2131974424(0x7f135918, float:1.9585912E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A05(r0)
            java.lang.String r0 = r5.A07
            r2.A04(r0)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131974422(0x7f135916, float:1.9585908E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 52
            X.I8z r0 = X.C56719I8z.A00(r3, r0)
            r2.A02(r0, r1)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131974423(0x7f135917, float:1.958591E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 53
            X.I8z r0 = X.C56719I8z.A00(r3, r0)
            X.0qQ.A0B(r1, r4)
            r2.A07 = r1
            r2.A00 = r0
            r2.A01()
            X.6Z5 r2 = r3.A3G
            X.3uh r1 = r3.Au5()
            java.lang.String r0 = "stories_golden_window_tip_impression"
            r2.A0G(r1, r0)
        L_0x015c:
            return
        L_0x015d:
            r6 = r1
            if (r10 == 0) goto L_0x0162
            goto L_0x0093
        L_0x0162:
            r5 = r1
            if (r10 == 0) goto L_0x00ce
            goto L_0x00b7
        L_0x0167:
            r8 = r1
            r7 = r1
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57007IKz.onSuccess(java.lang.Object):void");
    }
}
