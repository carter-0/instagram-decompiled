package X;

/* renamed from: X.MMs  reason: case insensitive filesystem */
public final class C66309MMs extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66309MMs(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object, com.instagram.pendingmedia.model.UserStoryTarget] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object, com.instagram.pendingmedia.model.UserStoryTarget] */
    /* JADX WARNING: type inference failed for: r1v31, types: [X.8SL, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03a5, code lost:
        if (r0 != null) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a7, code lost:
        r0.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0699, code lost:
        r2.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (X.AnonymousClass7TE.A1b(r10) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0971, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x097d, code lost:
        return java.lang.Boolean.valueOf(X.0qQ.A0K(r2, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        X.C39903AIl.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        r1 = X.2CC.A00(X.AnonymousClass05K.A0L);
        r0 = (X.C39903AIl) r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r1 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        r0 = X.C39903AIl.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r1.A0L((X.C332277Ui) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f6, code lost:
        r0 = (X.C357358Xo) r0.A0B.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r10 = r19
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x093d;
                case 1: goto L_0x003b;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0057;
                case 6: goto L_0x0065;
                case 7: goto L_0x009a;
                case 8: goto L_0x00b3;
                case 9: goto L_0x00ff;
                case 10: goto L_0x0116;
                case 11: goto L_0x01c7;
                case 12: goto L_0x02fa;
                case 13: goto L_0x0305;
                case 14: goto L_0x030f;
                case 15: goto L_0x034b;
                case 16: goto L_0x0354;
                case 17: goto L_0x036b;
                case 18: goto L_0x0378;
                case 19: goto L_0x0399;
                case 20: goto L_0x0879;
                case 21: goto L_0x03ac;
                case 22: goto L_0x03cb;
                case 23: goto L_0x047b;
                case 24: goto L_0x04ba;
                case 25: goto L_0x04d5;
                case 26: goto L_0x0514;
                case 27: goto L_0x056f;
                case 28: goto L_0x05ce;
                case 29: goto L_0x05e3;
                case 30: goto L_0x05fc;
                case 31: goto L_0x0636;
                case 32: goto L_0x067e;
                case 33: goto L_0x067e;
                case 34: goto L_0x069e;
                case 35: goto L_0x06d1;
                case 36: goto L_0x06fd;
                case 37: goto L_0x06fd;
                case 38: goto L_0x070f;
                case 39: goto L_0x070f;
                case 40: goto L_0x077d;
                case 41: goto L_0x077d;
                case 42: goto L_0x094e;
                case 43: goto L_0x0960;
                case 44: goto L_0x07ff;
                case 45: goto L_0x0830;
                case 46: goto L_0x0844;
                case 47: goto L_0x08d8;
                case 48: goto L_0x090a;
                case 49: goto L_0x0920;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r4 = r7.A01
            X.JY9 r4 = (X.JY9) r4
            X.8Yz r0 = r4.A19
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C363138jC
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = X.AnonymousClass05K.A15
        L_0x001d:
            r4.A0U = r0
        L_0x001f:
            X.0gF r4 = X.C60340gF.A00
        L_0x0021:
            return r4
        L_0x0022:
            com.instagram.common.session.UserSession r3 = r4.A18
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0038
            X.5vi r0 = X.C299715vi.A00
            if (r10 != r0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x001d
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x001d
        L_0x003b:
            java.lang.String r2 = X.C41847B3o.A1E(r10)
            java.lang.Object r0 = r7.A01
            X.JY9 r0 = (X.JY9) r0
            X.JZL r0 = r0.A0L
            if (r0 == 0) goto L_0x001f
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A04
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x001f
            r1.setText(r2)
            goto L_0x001f
        L_0x0057:
            float r1 = X.AnonymousClass7TE.A04(r10)
            java.lang.Object r0 = r7.A01
            X.LVA r0 = (X.LVA) r0
            X.STU r0 = r0.A01
            r0.A08(r1)
            goto L_0x001f
        L_0x0065:
            java.util.List r10 = (java.util.List) r10
            r12 = 0
            X.0qQ.A0B(r10, r12)
            java.lang.Object r0 = r7.A01
            X.JjN r0 = (X.C60319JjN) r0
            X.05G r2 = r0.A07
        L_0x0071:
            java.lang.Object r1 = r2.getValue()
            r8 = r1
            X.Jvp r8 = (X.C61051Jvp) r8
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0084
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            r17 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0084:
            r17 = 0
        L_0x0086:
            r7 = 0
            r13 = 10239(0x27ff, float:1.4348E-41)
            r9 = r7
            r11 = r7
            r14 = r12
            r15 = r12
            r16 = r12
            X.Jvp r0 = X.C61051Jvp.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0071
            goto L_0x001f
        L_0x009a:
            boolean r0 = r10 instanceof X.C61753KKs
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r2 = r7.A01
            X.AIl r2 = (X.C39903AIl) r2
            X.80U r1 = r2.A09
            X.80V r0 = X.AnonymousClass80V.POST_CAPTURE_AR_EFFECT_MINI_GALLERY
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x00d7
            android.view.ViewGroup r1 = r2.A03
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x00d7
        L_0x00b3:
            boolean r0 = r10 instanceof X.C61753KKs
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r2 = r7.A01
            X.AIl r2 = (X.C39903AIl) r2
            X.80U r1 = r2.A09
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x00cc:
            X.0Ud r0 = X.AnonymousClass8d4.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            X.C39903AIl.A02(r0, r2)
        L_0x00d7:
            X.C39903AIl.A03(r2)
            goto L_0x001f
        L_0x00dc:
            java.lang.Integer r0 = X.AnonymousClass05K.A0L
            boolean r1 = X.2CC.A00(r0)
            java.lang.Object r0 = r7.A01
            X.AIl r0 = (X.C39903AIl) r0
            if (r1 == 0) goto L_0x00f6
            X.8Xo r0 = X.C39903AIl.A00(r0)
        L_0x00ec:
            X.7Pu r1 = r0.A00
            if (r1 == 0) goto L_0x001f
            r0 = 0
            r1.A0L(r0)
            goto L_0x001f
        L_0x00f6:
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.8Xo r0 = (X.C357358Xo) r0
            goto L_0x00ec
        L_0x00ff:
            java.lang.Number r10 = (java.lang.Number) r10
            java.lang.Object r0 = r7.A01
            X.AIl r0 = (X.C39903AIl) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r1 = r0.getValue()
            X.7oF r1 = (X.C342227oF) r1
            int r0 = X.JTP.A09(r10)
            r1.A00(r0)
            goto L_0x001f
        L_0x0116:
            X.86R r10 = (X.AnonymousClass86R) r10
            if (r10 == 0) goto L_0x097e
            int r1 = r10.ordinal()
            r4 = 0
            if (r1 == r4) goto L_0x0168
            r0 = 1
            if (r1 != r0) goto L_0x097e
            java.lang.Object r3 = r7.A01
            X.AIl r3 = (X.C39903AIl) r3
            X.0eM r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.LlX r0 = (X.C64994LlX) r0
            android.view.ViewGroup r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.80U r1 = r3.A09
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0149
            X.8Sj r0 = new X.8Sj
            r0.<init>()
            r1.E3H(r0)
        L_0x0149:
            X.0Ud r2 = X.AnonymousClass8d4.A03
            androidx.lifecycle.CoroutineLiveData r1 = X.DbT.A0G(r2)
            X.2gO r0 = r3.A05
            r1.A08(r0)
            java.lang.Object r1 = r2.getValue()
            X.05G r0 = X.AnonymousClass8d4.A02
            r0.Epw(r1)
            X.05G r1 = X.AnonymousClass8d4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x0163:
            r1.Epw(r0)
            goto L_0x001f
        L_0x0168:
            java.lang.Object r3 = r7.A01
            X.AIl r3 = (X.C39903AIl) r3
            X.0eM r0 = r3.A0A     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IllegalStateException -> 0x01ad }
            X.LlX r1 = (X.C64994LlX) r1     // Catch:{ IllegalStateException -> 0x01ad }
            android.view.ViewGroup r0 = r1.A01     // Catch:{ IllegalStateException -> 0x01ad }
            r0.setVisibility(r4)     // Catch:{ IllegalStateException -> 0x01ad }
            X.0eM r1 = r1.A02     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IllegalStateException -> 0x01ad }
            X.7wt r0 = (X.C347487wt) r0     // Catch:{ IllegalStateException -> 0x01ad }
            r0.A0E()     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IllegalStateException -> 0x01ad }
            X.7wt r0 = (X.C347487wt) r0     // Catch:{ IllegalStateException -> 0x01ad }
            r0.setHorizontalMargin(r4)     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IllegalStateException -> 0x01ad }
            X.7wt r0 = (X.C347487wt) r0     // Catch:{ IllegalStateException -> 0x01ad }
            r0.setBookmarkIconExpanded(r4)     // Catch:{ IllegalStateException -> 0x01ad }
            X.0Ud r1 = X.AnonymousClass8d4.A03     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IllegalStateException -> 0x01ad }
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0     // Catch:{ IllegalStateException -> 0x01ad }
            X.C39903AIl.A02(r0, r3)     // Catch:{ IllegalStateException -> 0x01ad }
            androidx.lifecycle.CoroutineLiveData r2 = X.DbT.A0G(r1)     // Catch:{ IllegalStateException -> 0x01ad }
            X.07Z r1 = r3.A04     // Catch:{ IllegalStateException -> 0x01ad }
            X.2gO r0 = r3.A05     // Catch:{ IllegalStateException -> 0x01ad }
            r2.A06(r1, r0)     // Catch:{ IllegalStateException -> 0x01ad }
            goto L_0x01bf
        L_0x01ad:
            r3 = move-exception
            X.0kg r2 = X.0kg.A03
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Exception when opening Mini Gallery : "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.lang.String r0 = "POST_CAP_ERROR"
            X.0wb.A01(r2, r0, r1)
        L_0x01bf:
            r0 = 1
            X.05G r1 = X.AnonymousClass8d4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0163
        L_0x01c7:
            com.instagram.camera.effect.models.CameraAREffect r10 = (com.instagram.camera.effect.models.CameraAREffect) r10
            java.lang.Object r3 = r7.A01
            X.AIl r3 = (X.C39903AIl) r3
            X.9YG r0 = r3.A00
            if (r10 == 0) goto L_0x0272
            r0.A01(r10)
            X.0eM r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.LlX r0 = (X.C64994LlX) r0
            r0.A00(r10)
            X.80U r1 = r3.A09
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x001f
            X.8Xo r7 = X.C39903AIl.A00(r3)
            android.app.Activity r6 = r3.A01
            r9 = 0
            r5 = 1
            X.7Pu r0 = r7.A00
            if (r0 == 0) goto L_0x025c
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r0.A03
            android.widget.TextView r0 = r0.A0L()
            if (r0 == 0) goto L_0x025c
            X.7Pu r0 = r7.A00
            if (r0 == 0) goto L_0x0204
            r0.A04()
        L_0x0204:
            X.7Pu r2 = r7.A00
            if (r2 == 0) goto L_0x0246
            java.lang.String r8 = r10.A0S
            r1 = 2131953212(0x7f13063c, float:1.9542889E38)
            java.lang.String r0 = r10.A0C
            java.lang.String r4 = X.DbW.A0h(r6, r0, r1)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = r2.A03
            X.7Pr r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r2)
            r0.A0d = r8
            X.7Pr r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r2)
            r0.A0c = r4
            X.3oV r1 = r2.titleTextView
            if (r1 == 0) goto L_0x0246
            if (r8 == 0) goto L_0x0246
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0246
            android.view.View r0 = r1.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r8)
            r1.setVisibility(r9)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0E(r2, r8, r4)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0C(r2)
            android.content.Context r0 = r2.requireContext()
            com.instagram.igds.components.bottomsheet.BottomSheetFragment.A05(r0, r2)
        L_0x0246:
            X.7Pu r1 = r7.A00
            if (r1 == 0) goto L_0x0251
            X.7Pt r0 = X.C357358Xo.A00(r6, r7)
            r1.A0J(r0, r5)
        L_0x0251:
            X.7Pu r1 = r7.A00
            if (r1 == 0) goto L_0x025c
            X.7Pt r0 = X.C357358Xo.A01(r6, r7)
            r1.A0K(r0, r5)
        L_0x025c:
            com.instagram.common.session.UserSession r0 = r3.A07
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x001f
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 1
            java.lang.String r0 = "TIMELINE_AR_EFFECTS_EFFECT_SELECTED_TAP"
        L_0x026d:
            X.27r.A08(r2, r3, r0, r1)
            goto L_0x001f
        L_0x0272:
            r0.A00()
            X.0eM r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.LlX r0 = (X.C64994LlX) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.7wt r0 = (X.C347487wt) r0
            r0.A0F()
            X.80U r1 = r3.A09
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x001f
            X.8Xo r4 = X.C39903AIl.A00(r3)
            android.app.Activity r1 = r3.A01
            X.7Pu r0 = r4.A00     // Catch:{ NotFoundException -> 0x02bb }
            if (r0 == 0) goto L_0x02c7
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r0.A03     // Catch:{ NotFoundException -> 0x02bb }
            android.widget.TextView r0 = r0.A0L()     // Catch:{ NotFoundException -> 0x02bb }
            if (r0 == 0) goto L_0x02c7
            X.7Pu r2 = r4.A00     // Catch:{ NotFoundException -> 0x02bb }
            if (r2 == 0) goto L_0x02c7
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x02bb }
            r0 = 2131955837(0x7f13107d, float:1.9548213E38)
            java.lang.CharSequence r0 = r1.getText(r0)     // Catch:{ NotFoundException -> 0x02bb }
            java.lang.String r0 = r0.toString()     // Catch:{ NotFoundException -> 0x02bb }
            r2.A0M(r0)     // Catch:{ NotFoundException -> 0x02bb }
            goto L_0x02c7
        L_0x02bb:
            r2 = move-exception
            r0 = 980(0x3d4, float:1.373E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Exception when clearing BottomSheet title header"
            X.0wb.A06(r1, r0, r2)
        L_0x02c7:
            X.7Pu r2 = r4.A00
            if (r2 == 0) goto L_0x02df
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r2.A03
            X.7Pr r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r1)
            r0.A01()
            r1.A0R()
            r1.A0R()
            X.7Pr r0 = r2.A02
            r0.A01()
        L_0x02df:
            X.7Pu r1 = r4.A00
            if (r1 == 0) goto L_0x02e7
            r0 = 1
            r1.A0O(r0)
        L_0x02e7:
            com.instagram.common.session.UserSession r0 = r3.A07
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x001f
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 1
            java.lang.String r0 = "TIMELINE_AR_EFFECTS_EFFECT_UNSELECTED_TAP"
            goto L_0x026d
        L_0x02fa:
            java.lang.Object r0 = r7.A01
            X.8hG r0 = (X.C362048hG) r0
            android.content.Context r0 = r0.A0O
            X.C63138Ks6.A00(r0)
            goto L_0x001f
        L_0x0305:
            java.lang.Object r1 = r7.A01
            X.8hz r1 = (X.C362488hz) r1
            r0 = 0
            r1.A02(r0)
            goto L_0x001f
        L_0x030f:
            java.lang.String r2 = X.C41847B3o.A1E(r10)
            java.lang.Object r4 = r7.A01
            X.8hT r4 = (X.C362178hT) r4
            X.8hS r1 = r4.A0N
            X.0Ud r0 = r1.A0K
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            X.2Fk r0 = r1.A0F
            java.lang.Object r0 = r0.A02()
            X.8gX r0 = (X.C361628gX) r0
            if (r0 == 0) goto L_0x0349
            java.lang.String r0 = r0.A01
        L_0x032d:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001f
            if (r3 == 0) goto L_0x001f
            X.8gT r2 = r4.A0L
            X.8Yz r0 = r4.A0K
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r1 = X.AnonymousClass9PQ.A00(r0)
            r0 = 0
            r2.A05(r3, r1, r0)
            goto L_0x001f
        L_0x0349:
            r0 = 0
            goto L_0x032d
        L_0x034b:
            java.lang.Object r1 = r7.A01
            X.8hT r1 = (X.C362178hT) r1
            r0 = 0
            r1.A0B = r0
            goto L_0x001f
        L_0x0354:
            X.0sa r10 = (X.C62320sa) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r7.A01
            X.8iX r0 = (X.C362818iX) r0
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.9SS r0 = (X.AnonymousClass9SS) r0
            r0.A00(r10)
            goto L_0x001f
        L_0x036b:
            X.0sa r10 = (X.C62320sa) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r7.A01
            X.8iX r0 = (X.C362818iX) r0
            X.8iW r0 = r0.A08
            goto L_0x03a7
        L_0x0378:
            X.0sa r10 = (X.C62320sa) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r7.A01
            X.8iX r0 = (X.C362818iX) r0
            android.app.Activity r3 = r0.A01
            com.instagram.common.session.UserSession r2 = r0.A03
            X.0iw r1 = r0.A02
            X.8Yz r0 = r0.A04
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r0 = X.AnonymousClass9PQ.A00(r0)
            X.C48788EkB.A00(r3, r1, r2, r0, r10)
            goto L_0x001f
        L_0x0399:
            X.0sa r10 = (X.C62320sa) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r7.A01
            X.8iX r0 = (X.C362818iX) r0
            X.8iW r0 = r0.A08
            if (r0 == 0) goto L_0x001f
        L_0x03a7:
            r0.A00(r10)
            goto L_0x001f
        L_0x03ac:
            X.6Tm r10 = (X.AnonymousClass6Tm) r10
            r4 = 0
            if (r10 == 0) goto L_0x03c9
            java.lang.Object r3 = X.DbW.A0e(r10)
        L_0x03b5:
            X.DbS.A1Y(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r7.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            X.8hG r2 = r0.A02
            if (r2 == 0) goto L_0x0021
            r1 = 1
            java.lang.String r0 = ""
            r2.A0e(r3, r0, r1)
            return r4
        L_0x03c9:
            r3 = r4
            goto L_0x03b5
        L_0x03cb:
            X.Klr r10 = (X.C62753Klr) r10
            boolean r0 = r10 instanceof X.C61758KKx
            if (r0 == 0) goto L_0x03f3
            java.lang.Object r4 = r7.A01
            X.Lh1 r4 = (X.C64724Lh1) r4
            X.KKx r10 = (X.C61758KKx) r10
            java.util.List r3 = r10.A00
            java.lang.Integer r2 = r4.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.0nO r1 = X.0nY.A00()
            if (r2 != r0) goto L_0x03ed
            X.KIh r0 = new X.KIh
            r0.<init>(r4, r3)
        L_0x03e8:
            r1.ATE(r0)
            goto L_0x001f
        L_0x03ed:
            X.KIi r0 = new X.KIi
            r0.<init>(r4, r3)
            goto L_0x03e8
        L_0x03f3:
            boolean r0 = r10 instanceof X.C61759KKy
            if (r0 == 0) goto L_0x040a
            java.lang.Object r3 = r7.A01
            X.Lh1 r3 = (X.C64724Lh1) r3
            X.7w8 r0 = r3.A04
            if (r0 == 0) goto L_0x001f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A09 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0405:
            X.C64724Lh1.A08(r3, r0)
            goto L_0x001f
        L_0x040a:
            boolean r0 = r10 instanceof X.C61760KKz
            if (r0 == 0) goto L_0x0419
            java.lang.Object r3 = r7.A01
            X.Lh1 r3 = (X.C64724Lh1) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3.A09 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0405
        L_0x0419:
            boolean r0 = r10 instanceof X.KL0
            if (r0 == 0) goto L_0x0988
            java.lang.Object r3 = r7.A01
            X.Lh1 r3 = (X.C64724Lh1) r3
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x001f
            X.MVu r0 = r3.A06
            if (r0 == 0) goto L_0x001f
            X.LED r0 = r0.BJn()
            if (r0 == 0) goto L_0x001f
            X.LBz r1 = r3.A0M
            X.0sn r6 = X.0sn.A00
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r1.A00 = r6
            android.content.Context r4 = r3.A0F
            com.instagram.common.session.UserSession r5 = r3.A0I
            X.MVu r0 = r3.A06
            if (r0 == 0) goto L_0x0479
            int r7 = r0.C8i(r4)
        L_0x0445:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323715243650478(0x810c3a00052dae, double:3.0346020117213386E-306)
            boolean r9 = X.182.A06(r2, r5, r0)
            X.8ME r1 = r3.A0N
            boolean r8 = r1.A1X()
            X.7w8 r0 = X.C18192Vn6.A00(r4, r5, r6, r7, r8, r9)
            r3.A04 = r0
            X.C64724Lh1.A06(r3)
            X.C64724Lh1.A05(r3)
            X.MVu r0 = r3.A06
            if (r0 == 0) goto L_0x0469
            r0.FHa(r4)
        L_0x0469:
            X.7w8 r0 = r3.A04
            if (r0 == 0) goto L_0x0983
            X.UOC r0 = X.C63153KsM.A00(r0)
            if (r0 == 0) goto L_0x0983
            r1.A1L(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0405
        L_0x0479:
            r7 = 1
            goto L_0x0445
        L_0x047b:
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r0 = r7.A01
            X.Lh1 r0 = (X.C64724Lh1) r0
            X.8ME r0 = r0.A0N
            X.0qQ.A0A(r10)
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.8BA r0 = r0.A0y
            X.0eK r0 = r0.A1v
            java.lang.Object r3 = r0.get()
            X.8Wi r3 = (X.C357068Wi) r3
            if (r3 == 0) goto L_0x001f
            X.82p r0 = r3.A0E
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.7zv r2 = r0.A04()
            r2.getClass()
            java.lang.String r0 = r10.getAbsolutePath()
            X.0qQ.A0B(r0, r1)
            r2.A0k = r0
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.AnA r0 = new X.AnA
            r0.<init>(r3, r2)
            r1.post(r0)
            goto L_0x001f
        L_0x04ba:
            X.34S r10 = (X.AnonymousClass34S) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r1 = r7.A01
            X.JYD r1 = (X.JYD) r1
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A0B
            X.JYD.A04(r0, r10, r1)
            android.view.View r0 = r1.A09
            X.JYD.A04(r0, r10, r1)
            com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView r0 = r1.A0O
            X.JYD.A04(r0, r10, r1)
            goto L_0x001f
        L_0x04d5:
            java.lang.Object r6 = r7.A01
            X.7jY r6 = (X.C339407jY) r6
            X.7jz r5 = X.C339667jy.A03
            com.instagram.common.session.UserSession r4 = r6.A0K
            X.7jy r0 = r5.A00(r4)
            X.0xa r2 = r0.A01
            r0 = 4862(0x12fe, float:6.813E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1a(r2, r1)
            r3 = r0 ^ 1
            X.8aL r0 = X.C358088aL.A0Z
            X.C339407jY.A00(r0, r6, r3)
            X.7jy r0 = r5.A00(r4)
            X.0xa r0 = r0.A01
            X.DbX.A1V(r0, r1, r3)
            android.content.Context r2 = r6.A0F
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131963910(0x7f133006, float:1.9564587E38)
            if (r3 == 0) goto L_0x050b
            r0 = 2131963911(0x7f133007, float:1.9564589E38)
        L_0x050b:
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r2, r0)
            goto L_0x001f
        L_0x0514:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r10 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r10
            r5 = 0
            X.0qQ.A0B(r10, r5)
            java.lang.Object r7 = r7.A01
            X.7jY r7 = (X.C339407jY) r7
            X.0xi r6 = X.0tS.A4E
            X.0tS r0 = r6.A00()
            boolean r0 = r0.A0R()
            r4 = r0 ^ 1
            X.8aL r0 = X.C358088aL.A0h
            X.C339407jY.A00(r0, r7, r4)
            X.0tS r3 = r6.A00()
            X.0s0 r2 = r3.A1M
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 96
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r4)
            android.content.Context r3 = r7.A0F
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131963923(0x7f133013, float:1.9564613E38)
            if (r4 == 0) goto L_0x054a
            r0 = 2131963924(0x7f133014, float:1.9564615E38)
        L_0x054a:
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            X.C59689JTv.A03(r3, r0, r2, r5)
            X.0tS r0 = r6.A00()
            boolean r1 = r0.A0R()
            r0 = 2131238549(0x7f081e95, float:1.809338E38)
            if (r1 == 0) goto L_0x0562
            r0 = 2131238547(0x7f081e93, float:1.8093376E38)
        L_0x0562:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r10.A05 = r0
            r10.A06 = r2
            r10.invalidate()
            goto L_0x001f
        L_0x056f:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r10 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r10
            r6 = 0
            X.0qQ.A0B(r10, r6)
            java.lang.Object r3 = r7.A01
            X.7jY r3 = (X.C339407jY) r3
            X.0xi r7 = X.0tS.A4E
            X.0tS r1 = r7.A00()
            X.0s0 r0 = r1.A1N
            X.0YZ[] r5 = X.0tS.A4G
            r4 = 97
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r5, r4)
            r2 = r0 ^ 1
            X.8aL r0 = X.C358088aL.A0i
            X.C339407jY.A00(r0, r3, r2)
            X.0tS r1 = r7.A00()
            X.0s0 r0 = r1.A1N
            X.AnonymousClass7TF.A1J(r1, r0, r5, r4, r2)
            android.content.Context r3 = r3.A0F
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131963925(0x7f133015, float:1.9564617E38)
            if (r2 == 0) goto L_0x05a7
            r0 = 2131963926(0x7f133016, float:1.956462E38)
        L_0x05a7:
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            X.C59689JTv.A03(r3, r0, r2, r6)
            X.0tS r1 = r7.A00()
            X.0s0 r0 = r1.A1N
            boolean r1 = X.AnonymousClass7TG.A1a(r1, r0, r5, r4)
            r0 = 2131238980(0x7f082044, float:1.8094254E38)
            if (r1 == 0) goto L_0x05c1
            r0 = 2131238976(0x7f082040, float:1.8094246E38)
        L_0x05c1:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r10.A05 = r0
            r10.A06 = r2
            r10.invalidate()
            goto L_0x001f
        L_0x05ce:
            X.8Cl r10 = (X.C352218Cl) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r1 = r7.A01
            X.Ly5 r1 = (X.C65690Ly5) r1
            X.8W6 r0 = r1.A02
            r0.A05(r10)
            X.80W r2 = r1.A03
            X.8V0 r1 = X.AnonymousClass8V0.A00
            goto L_0x0699
        L_0x05e3:
            java.io.File r10 = (java.io.File) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r2 = r7.A01
            X.JiP r2 = (X.C60268JiP) r2
            r0 = 1
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r10, r0, r1)
            X.KL7 r0 = new X.KL7
            r0.<init>(r1)
            X.C60268JiP.A00(r0, r2)
            goto L_0x001f
        L_0x05fc:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8Wk r3 = X.JTT.A0O(r0)
            if (r3 == 0) goto L_0x001f
            X.8QA r0 = r3.A07
            r8 = 0
            r0.A0D(r8)
            X.8BA r0 = r3.A0A
            r0.A0a()
            r0.A0X()
            com.instagram.pendingmedia.model.UserStoryTarget r5 = com.instagram.pendingmedia.model.UserStoryTarget.A07
            java.lang.String r1 = "myWeek:"
            com.instagram.common.session.UserSession r0 = r3.A05
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = X.002.A0R(r1, r0)
            r6 = 0
            java.lang.String r1 = ""
            r0 = 1
            X.8VT r4 = X.C64133LPh.A01(r2, r6, r1, r0)
            r7 = r6
            X.C357088Wk.A05(r3, r4, r5, r6, r7, r8)
            goto L_0x001f
        L_0x0636:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8BA r0 = r0.A00
            X.8CY r0 = r0.A1F
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.8Ca r5 = (X.C352178Ca) r5
            X.05G r0 = r5.A03
            java.lang.Object r3 = r0.getValue()
            X.9Iw r3 = (X.C376669Iw) r3
            if (r3 != 0) goto L_0x0665
            X.Lm2 r0 = X.C65024Lm2.A00
        L_0x0654:
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 22
            X.MH1 r1 = new X.MH1
            r1.<init>(r0, r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            goto L_0x001f
        L_0x0665:
            java.lang.Object r2 = r3.A02
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r2 = X.DbT.A0z(r1, r2, r0)
            r1 = 58
            java.lang.String r0 = r3.A03
            java.lang.String r1 = X.002.A0T(r2, r0, r1)
            X.Lm0 r0 = new X.Lm0
            r0.<init>(r1)
            goto L_0x0654
        L_0x067e:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8Wk r0 = X.JTT.A0O(r0)
            if (r0 == 0) goto L_0x001f
            X.80U r0 = r0.A0I
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.8SL r1 = new X.8SL
            r1.<init>()
            r1.A00 = r0
        L_0x0699:
            r2.A04(r1)
            goto L_0x001f
        L_0x069e:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8Wk r3 = X.JTT.A0O(r0)
            if (r3 == 0) goto L_0x001f
            X.ADp r2 = X.C39891ADp.A00
            java.lang.String r1 = "sink"
            java.lang.String r0 = "opal"
            r2.A01(r1, r0)
            r2.A00()
            X.8BA r1 = r3.A0A
            r1.A0Z()
            X.8QA r0 = r3.A07
            r8 = 0
            r0.A0D(r8)
            r1.A0a()
            r1.A0X()
            com.instagram.pendingmedia.model.UserStoryTarget r5 = com.instagram.pendingmedia.model.UserStoryTarget.A08
            r4 = 0
            r6 = r4
            r7 = r4
            X.C357088Wk.A05(r3, r4, r5, r6, r7, r8)
            goto L_0x001f
        L_0x06d1:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r1 = r0.A0F
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x001f
            X.1q7 r0 = X.C318996ps.A00()
            X.FBp r2 = r0.A01()
            X.8BA r1 = r1.A00
            X.4DH r0 = r1.A0s
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r1.A0v
            X.0iw r4 = r1.A0u
            r7 = 1
            r0 = 4052(0xfd4, float:5.678E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r2.A03(r3, r4, r5, r6, r7)
            goto L_0x001f
        L_0x06fd:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            r1 = 0
            X.8Wk r0 = X.JTT.A0O(r0)
            if (r0 == 0) goto L_0x001f
            r0.A0F(r1)
            goto L_0x001f
        L_0x070f:
            java.lang.Object r1 = r7.A01
            X.7vS r1 = (X.C346607vS) r1
            X.8Be r0 = r1.A0F
            com.instagram.user.model.User r3 = r1.A0Q
            if (r3 == 0) goto L_0x0998
            X.8Wk r2 = X.JTT.A0O(r0)
            if (r2 == 0) goto L_0x001f
            X.8QA r0 = r2.A07
            r14 = 0
            r0.A0D(r14)
            X.8nd r0 = X.C357088Wk.A00(r2)
            int r1 = r0.ordinal()
            if (r1 == r14) goto L_0x0755
            r0 = 1
            if (r1 != r0) goto L_0x098d
            X.8LU r8 = r2.A0C
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r2.<init>((com.instagram.user.model.User) r3)
            com.instagram.pendingmedia.model.GroupProfileUserStoryTarget r1 = new com.instagram.pendingmedia.model.GroupProfileUserStoryTarget
            r1.<init>()
            java.lang.String r0 = "GROUP_PROFILE"
            r1.A01 = r0
            r1.A00 = r2
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            r10 = 0
            X.LD4 r9 = new X.LD4
            r9.<init>(r10, r1, r0)
            r12 = r10
            r13 = r10
            r8.A0P(r9, r10, r11, r12, r13, r14)
            goto L_0x001f
        L_0x0755:
            X.8K4 r4 = r2.A09
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r2.<init>((com.instagram.user.model.User) r3)
            com.instagram.pendingmedia.model.GroupProfileUserStoryTarget r1 = new com.instagram.pendingmedia.model.GroupProfileUserStoryTarget
            r1.<init>()
            java.lang.String r0 = "GROUP_PROFILE"
            r1.A01 = r0
            r1.A00 = r2
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            r5 = 0
            X.LD4 r6 = new X.LD4
            r6.<init>(r5, r1, r0)
            r7 = r5
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r15 = r14
            r4.A0J(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x001f
        L_0x077d:
            java.lang.Object r0 = r7.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8Wk r1 = X.JTT.A0O(r0)
            if (r1 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r5 = r1.A05
            X.81T r2 = r1.A0G
            X.LFo r0 = new X.LFo
            r0.<init>(r2, r5)
            X.KkX r2 = X.C62671KkX.DOWN_ARROW
            r0.A01(r2)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1A6 r13 = new X.1A6
            r13.<init>(r0)
            X.1A6 r14 = new X.1A6
            r14.<init>(r0)
            X.82p r11 = r1.A0E
            X.8QN r6 = r1.A08
            X.8K4 r7 = r1.A09
            X.8MC r9 = r1.A0D
            X.8L1 r8 = r1.A0B
            X.8BA r3 = r1.A0A
            java.lang.String r12 = r3.A0T()
            X.80D r0 = r1.A0F
            X.B1O r10 = r0.A0h
            boolean r15 = r3.A0p()
            X.34S r0 = X.C394559yJ.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r0.A00
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            X.KhK r0 = X.C62528KhK.SHARE_TO_STORY_BUTTON
            r4.put(r0, r3)
            X.KhK r0 = X.C62528KhK.CAN_SELECT_AUDIENCE_LISTS
            r3 = 0
            r4.put(r0, r3)
            X.KhK r0 = X.C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON
            r4.put(r0, r3)
            X.KhK r0 = X.C62528KhK.DELETE_OPTION_ENABLED
            r4.put(r0, r3)
            X.KhK r0 = X.C62528KhK.LOGGING_ENTRY_POINT
            r4.put(r0, r2)
            X.Ldv r0 = new X.Ldv
            r0.<init>(r1)
            android.app.Activity r2 = r1.A00
            X.AnonymousClass7TF.A1H(r5, r2)
            X.K8H r1 = X.C63110Krd.A00(r0, r5, r4)
            X.7Pr r0 = X.DbS.A0W(r5)
            r0.A0U = r1
            r0.A0T = r1
            r0.A0X = r3
            X.DbU.A0y(r2, r1, r0)
            goto L_0x001f
        L_0x07ff:
            X.HN3 r10 = (X.HN3) r10
            r5 = 0
            X.0qQ.A0B(r10, r5)
            java.lang.Object r0 = r7.A01
            X.K41 r0 = (X.K41) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.Jgw r0 = (X.C60177Jgw) r0
            X.05G r4 = r0.A03
        L_0x0813:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.Jw1 r0 = (X.C61063Jw1) r0
            java.lang.Object r2 = r0.A03
            X.62P r2 = (X.AnonymousClass62P) r2
            int r1 = r0.A01
            X.0qQ.A0B(r2, r5)
            X.Jw1 r0 = new X.Jw1
            r0.<init>((X.HN3) r10, (X.AnonymousClass62P) r2, (int) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0813
            goto L_0x001f
        L_0x0830:
            java.lang.String r1 = X.C41847B3o.A1E(r10)
            java.lang.Object r0 = r7.A01
            X.K4N r0 = (X.K4N) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.JhI r0 = (X.C60199JhI) r0
            r0.A00 = r1
            goto L_0x001f
        L_0x0844:
            X.KlG r10 = (X.C62716KlG) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r0 = r7.A01
            X.K7Z r0 = (X.K7Z) r0
            X.Lcw r3 = new X.Lcw
            r3.<init>(r0, r1)
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1
            X.6pg r1 = new X.6pg
            r1.<init>(r3, r2, r0)
            boolean r0 = r10 instanceof X.C61322K2j
            if (r0 == 0) goto L_0x086c
            X.K2j r10 = (X.C61322K2j) r10
            X.3HO r0 = r10.A00
            r1.A00(r0)
            goto L_0x001f
        L_0x086c:
            boolean r0 = r10 instanceof X.C61321K2i
            if (r0 == 0) goto L_0x099d
            X.K2i r10 = (X.C61321K2i) r10
            X.4dm r0 = r10.A00
            r1.onFail(r0)
            goto L_0x001f
        L_0x0879:
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0q(r10, r0)
            java.lang.Object r5 = r7.A01
            X.K5J r5 = (X.K5J) r5
            java.util.ArrayList r0 = r5.A03
            if (r0 != 0) goto L_0x0890
            java.lang.String r0 = "selectedMedia"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0890:
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)
        L_0x0894:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08b0
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            java.util.HashMap r1 = r5.A08
            int r0 = r2.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.AnonymousClass7TF.A1I(r2, r0, r4)
            goto L_0x0894
        L_0x08b0:
            X.L3v r2 = r5.A02
            if (r2 == 0) goto L_0x001f
            X.L0I r3 = r2.A01
            X.8hG r0 = r3.A00
            android.widget.ImageView r1 = r0.A0U
            r0 = 8
            r1.setVisibility(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r2.A00
            X.37D r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x001f
            r2.A0B()
            r1 = 3
            X.Lz5 r0 = new X.Lz5
            r0.<init>(r1, r10, r3, r4)
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0H = r0
            goto L_0x001f
        L_0x08d8:
            java.lang.String r3 = X.C41847B3o.A1E(r10)
            java.lang.Object r2 = r7.A01
            X.8ME r2 = (X.AnonymousClass8ME) r2
            X.6if r0 = r2.A1R
            java.lang.Object r0 = r0.get()
            X.Ljb r0 = (X.C64875Ljb) r0
            androidx.compose.ui.platform.ComposeView r0 = r0.A00
            X.AnonymousClass7TH.A0R(r0)
            X.KWF r0 = r2.A0A
            if (r0 == 0) goto L_0x0901
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A04
            if (r1 == 0) goto L_0x0901
            r1.A0B(r3)
            r0 = 29
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.Dn8(r1, r0)
        L_0x0901:
            X.80U r1 = r2.A1B
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.E3H(r0)
            goto L_0x001f
        L_0x090a:
            X.JtZ r10 = (X.C60915JtZ) r10
            if (r10 == 0) goto L_0x001f
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r7.A01
            X.8ME r1 = (X.AnonymousClass8ME) r1
            X.M6o r0 = new X.M6o
            r0.<init>(r10, r1)
            X.11Z.A02(r0)
            goto L_0x001f
        L_0x0920:
            boolean r2 = X.AnonymousClass7TE.A1a(r10)
            java.lang.Object r1 = r7.A01
            X.Lzf r1 = (X.C65787Lzf) r1
            X.4Co r0 = r1.A01
            X.C51970G9q.A1S(r0)
            X.Jj2 r1 = X.C65787Lzf.A00(r1)
            if (r2 == 0) goto L_0x093a
            X.KLV r0 = X.KLV.A00
        L_0x0935:
            X.C60303Jj2.A01(r0, r1)
            goto L_0x001f
        L_0x093a:
            X.KLW r0 = X.KLW.A00
            goto L_0x0935
        L_0x093d:
            X.JuW r10 = (X.C60974JuW) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            com.instagram.common.gallery.model.GalleryItem r0 = r10.A0B
            java.lang.String r2 = r0.A0A
            java.lang.Object r0 = r7.A01
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            java.lang.String r0 = r0.A0A
            goto L_0x0975
        L_0x094e:
            X.8rI r10 = (X.C367618rI) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.String r2 = r10.A08
            java.lang.Object r0 = r7.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.content.Context r1 = r0.A0F
            r0 = 2131975569(0x7f135d91, float:1.9588234E38)
            goto L_0x0971
        L_0x0960:
            X.8rI r10 = (X.C367618rI) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.String r2 = r10.A08
            java.lang.Object r0 = r7.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.content.Context r1 = r0.A0F
            r0 = 2131975592(0x7f135da8, float:1.958828E38)
        L_0x0971:
            java.lang.String r0 = r1.getString(r0)
        L_0x0975:
            boolean r0 = X.0qQ.A0K(r2, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x097e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0983:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0988:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x098d:
            r0 = 629(0x275, float:8.81E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0998:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x099d:
            java.lang.String r0 = ""
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66309MMs.invoke(java.lang.Object):java.lang.Object");
    }
}
