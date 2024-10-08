package X;

public final class IVI implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IVI(C53151GjN gjN, C53081GiF giF, int i) {
        this.A00 = i;
        if (6 - i != 0) {
            this.A02 = giF;
            this.A01 = gjN;
        } else {
            this.A01 = gjN;
            this.A02 = giF;
        }
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [X.07Z, X.K57, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bf, code lost:
        r1.invoke(r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        r2.A08.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c8, code lost:
        r0.A0J(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03a6, code lost:
        r4.A0r(r3);
        X.DbT.A1V(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0231;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00b7;
                case 3: goto L_0x0250;
                case 4: goto L_0x02fc;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00e7;
                case 7: goto L_0x0318;
                case 8: goto L_0x036c;
                case 9: goto L_0x014f;
                case 10: goto L_0x01b7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A02
            X.GiF r5 = (X.C53081GiF) r5
            X.K57 r4 = r5.A09
            java.lang.Object r2 = r11.A01
            X.GjN r2 = (X.C53151GjN) r2
            X.8vc r3 = r2.A00
            com.instagram.common.session.UserSession r0 = r5.A07
            boolean r1 = X.1KU.A0C(r0)
            X.HJZ r5 = (X.HJZ) r5
            boolean r0 = r5.A0H
            r6 = 0
            X.IQB r8 = new X.IQB
            r8.<init>(r3, r4)
            if (r1 == 0) goto L_0x0055
            android.content.Context r0 = r4.requireContext()
            r5 = 1
            X.8ab r4 = X.DbS.A0Y(r0)
            r0 = 2131955753(0x7f131029, float:1.9548042E38)
            r4.A09(r0)
            r0 = 2131955752(0x7f131028, float:1.954804E38)
            r4.A08(r0)
            r0 = 5
            X.I8z r0 = X.C56719I8z.A00(r8, r0)
            r4.A0F(r0)
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.8ae r1 = X.C358278ae.DEFAULT
            r0 = 0
            r4.A0O(r0, r1, r3)
            r4.A0r(r5)
            X.DbT.A1V(r4)
        L_0x004f:
            X.8Ov r0 = r2.A08
            r0.dismiss()
        L_0x0054:
            return
        L_0x0055:
            r3 = 1
            if (r0 == 0) goto L_0x00aa
            android.content.Context r5 = r4.getThemedContext()
            com.instagram.common.session.UserSession r0 = r4.A05()
            boolean r7 = r4.A04
            X.0qQ.A0B(r5, r6)
            X.0qQ.A0B(r0, r3)
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r5, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131820976(0x7f1101b0, float:1.9274682E38)
            java.lang.String r0 = r1.getQuantityString(r0, r3)
            r4.A08(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131974404(0x7f135904, float:1.9585871E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            r1 = 24
            X.ICx r0 = new X.ICx
            r0.<init>(r8, r1)
            r4.A0A(r3, r0)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.ICo r0 = X.C56791ICo.A00
            r4.A04(r0, r1)
            if (r7 == 0) goto L_0x00a1
            X.2k4 r0 = X.AnonymousClass2k4.NIGHT
            X.0qQ.A0B(r0, r6)
            r4.A02 = r0
        L_0x00a1:
            X.FFy r0 = new X.FFy
            r0.<init>(r4)
            r0.A05(r5)
            goto L_0x004f
        L_0x00aa:
            android.content.Context r0 = r4.requireContext()
            X.C54908HXq.A00(r0, r8, r3)
            goto L_0x004f
        L_0x00b2:
            java.lang.Object r1 = r11.A02
            X.0sP r1 = (X.0sP) r1
            goto L_0x00bf
        L_0x00b7:
            java.lang.Object r0 = r11.A02
            com.instagram.creation.album.AlbumPostCapCropToggleButton r0 = (com.instagram.creation.album.AlbumPostCapCropToggleButton) r0
            X.0sP r1 = r0.A01
            if (r1 == 0) goto L_0x0054
        L_0x00bf:
            java.lang.Object r0 = r11.A01
            r1.invoke(r0)
            return
        L_0x00c5:
            java.lang.Object r1 = r11.A01
            X.OsD r1 = (X.C71870OsD) r1
            X.Pvv r4 = r1.A0E
            if (r4 == 0) goto L_0x0054
            X.C71870OsD.A03(r1)
            java.lang.Object r3 = r11.A02
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r3
            r0 = 735(0x2df, float:1.03E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C71870OsD.A02(r3, r1, r0)
            java.lang.Integer r2 = r3.A03
            boolean r1 = r1.A0a
            java.lang.String r0 = r3.A05
            r4.CI7(r2, r0, r1)
            return
        L_0x00e7:
            java.lang.Object r2 = r11.A01
            X.GjN r2 = (X.C53151GjN) r2
            X.8vc r0 = r2.A00
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r11.A02
            X.GiF r0 = (X.C53081GiF) r0
            com.instagram.common.session.UserSession r5 = r0.A07
            X.27r r1 = X.27p.A01(r5)
            X.8vc r0 = r2.A00
            java.lang.String r4 = r0.A09
            X.29O r3 = r1.A06
            X.0wc r0 = r3.A01
            X.1Ln r1 = X.1Ln.A07(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "DUPLICATE_CLICK"
            X.1Ln r1 = X.C51975G9x.A0T(r1, r3, r0, r4)
            java.lang.String r0 = "IG_CAMERA_DRAFT_DUPLICATE_CLICK"
            r1.A0t(r0)
            r1.Cgf()
        L_0x011d:
            X.8A2 r5 = X.AnonymousClass8A1.A01(r5)
            X.29E r1 = r5.A0K
            long r3 = r5.A03
            r0 = 42152557(0x283326d, float:1.9277663E-37)
            long r0 = r1.A02(r0, r3)
            r5.A03 = r0
        L_0x012e:
            java.lang.Object r0 = r11.A02
            X.GiF r0 = (X.C53081GiF) r0
            X.K57 r4 = r0.A09
            X.8vc r0 = r2.A00
            java.lang.String r5 = r0.A09
            java.lang.String r6 = r0.A0D
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r7 = 0
            r8 = 22
            X.MFe r3 = new X.MFe
            r3.<init>((java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r8)
            X.AnonymousClass7TE.A1Z(r3, r0)
            goto L_0x004f
        L_0x014f:
            java.lang.Object r1 = r11.A02
            X.GiF r1 = (X.C53081GiF) r1
            X.Dc2 r0 = r1.A02
            if (r0 == 0) goto L_0x015d
            X.DbX.A1R(r0)
            r0 = 0
            r1.A02 = r0
        L_0x015d:
            X.K57 r5 = r1.A09
            java.lang.Object r2 = r11.A01
            X.GjN r2 = (X.C53151GjN) r2
            X.8vc r9 = r2.A00
            java.lang.String r4 = r9.A09
            boolean r6 = r9.A0G
            com.instagram.common.session.UserSession r0 = r5.A05()
            X.27r r0 = X.27p.A01(r0)
            X.29O r3 = r0.A06
            X.0wc r0 = r3.A01
            X.1Ln r1 = X.1Ln.A07(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r6 == 0) goto L_0x01b2
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "UNPIN_CLICK"
        L_0x0183:
            X.1Ln r0 = X.C51975G9x.A0T(r1, r3, r0, r4)
            r0.Cgf()
        L_0x018a:
            X.0eM r0 = r5.A0E
            X.2YL r7 = X.DbS.A0H(r0)
            r0 = 9
            X.Iwl r8 = new X.Iwl
            r8.<init>(r4, r5, r0)
            X.6oS r4 = X.C318116oQ.A00(r7)
            X.12T r3 = X.AnonymousClass12T.A00
            r6 = 0
            r1 = 603422383(0x23f77eaf, float:2.6833446E-17)
            r0 = 3
            X.0nV r0 = r3.CO6(r1, r0)
            r10 = 30
            X.MHG r5 = new X.MHG
            r5.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            X.1Eo.A05(r0, r5, r4)
            goto L_0x004f
        L_0x01b2:
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "PIN_CLICK"
            goto L_0x0183
        L_0x01b7:
            java.lang.Object r1 = r11.A02
            X.GiF r1 = (X.C53081GiF) r1
            X.Dc2 r0 = r1.A02
            if (r0 == 0) goto L_0x01c5
            X.DbX.A1R(r0)
            r0 = 0
            r1.A02 = r0
        L_0x01c5:
            X.K57 r6 = r1.A09
            java.lang.Object r2 = r11.A01
            X.GjN r2 = (X.C53151GjN) r2
            X.8vc r4 = r2.A00
            r5 = 0
            java.lang.String r7 = r4.A0B
            boolean r3 = r6.A04
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 1105(0x451, float:1.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r7)
            r0 = 40
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putBoolean(r0, r3)
            X.K4Z r3 = new X.K4Z
            r3.<init>()
            r3.setArguments(r1)
            X.ILt r0 = new X.ILt
            r0.<init>(r4, r6)
            r3.A00 = r0
            com.instagram.common.session.UserSession r0 = r6.A05()
            X.7Pr r1 = X.DbS.A0W(r0)
            X.2k4 r0 = r6.dayNightMode
            X.0qQ.A0B(r0, r5)
            r1.A0O = r0
            X.DbY.A13(r6, r3, r1)
            com.instagram.common.session.UserSession r0 = r6.A05()
            X.27r r0 = X.27p.A01(r0)
            java.lang.String r4 = r4.A09
            X.29O r3 = r0.A06
            X.0wc r0 = r3.A01
            X.1Ln r1 = X.1Ln.A07(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "RENAME_CLICK"
            X.1Ln r1 = X.C51975G9x.A0T(r1, r3, r0, r4)
            java.lang.String r0 = "IG_CAMERA_DRAFT_RENAME_CLICK"
            r1.A0t(r0)
            r1.Cgf()
            goto L_0x004f
        L_0x0231:
            java.lang.Object r4 = r11.A01
            X.HN2 r4 = (X.HN2) r4
            X.7aA r3 = r4.A01
            X.7aA r2 = X.C333797aA.NOT_SET
            java.lang.Object r0 = r11.A02
            X.Gsa r0 = (X.C53683Gsa) r0
            X.GgO r1 = r0.A01
            if (r3 == r2) goto L_0x0247
            java.lang.Integer r0 = r4.A02
            r1.A0S(r3, r0)
            return
        L_0x0247:
            java.lang.Integer r5 = r4.A02
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r1.A0A
            goto L_0x02c8
        L_0x0250:
            java.lang.Object r0 = r11.A02
            X.Gsd r0 = (X.C53686Gsd) r0
            X.JjH r4 = r0.A02
            java.lang.Object r0 = r11.A01
            X.HN2 r0 = (X.HN2) r0
            java.lang.Integer r5 = r0.A02
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.2ww r10 = r4.A02
            X.7a5 r0 = r4.A06
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0290
            X.1Xj r8 = r0.BPf()
        L_0x026c:
            r0 = 98
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r8 == 0) goto L_0x02c6
            r1 = 95
            java.lang.String r0 = X.C333837aE.A00(r5)
            java.lang.String r7 = X.002.A0T(r2, r0, r1)
            com.instagram.common.session.UserSession r0 = r10.A03
            com.instagram.user.model.User r9 = r8.A2A(r0)
            int r0 = r5.intValue()
            switch(r0) {
                case 0: goto L_0x0292;
                case 1: goto L_0x0295;
                case 2: goto L_0x0298;
                case 3: goto L_0x029b;
                case 4: goto L_0x02a2;
                case 5: goto L_0x02a9;
                case 6: goto L_0x02ac;
                default: goto L_0x028b;
            }
        L_0x028b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0290:
            r8 = 0
            goto L_0x026c
        L_0x0292:
            java.lang.String r6 = "popular"
            goto L_0x02ad
        L_0x0295:
            java.lang.String r6 = "recent"
            goto L_0x02ad
        L_0x0298:
            java.lang.String r6 = "meta_verified"
            goto L_0x02ad
        L_0x029b:
            r0 = 320(0x140, float:4.48E-43)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            goto L_0x02ad
        L_0x02a2:
            r0 = 152(0x98, float:2.13E-43)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            goto L_0x02ad
        L_0x02a9:
            java.lang.String r6 = "questions"
            goto L_0x02ad
        L_0x02ac:
            r6 = 0
        L_0x02ad:
            java.lang.String r3 = "Media Id"
            r2 = 817896325(0x30c01b85, float:1.397766E-9)
            if (r9 != 0) goto L_0x02cc
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "COMMENTS_LOGGER: Media Author Id is null."
        L_0x02b8:
            X.0f9 r1 = r1.AEf(r0, r2)
            java.lang.String r0 = r8.getId()
            r1.ABQ(r3, r0)
            r1.report()
        L_0x02c6:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r4.A05
        L_0x02c8:
            r0.A0J(r5)
            return
        L_0x02cc:
            if (r6 != 0) goto L_0x02d3
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "COMMENTS_LOGGER: SortOrder is null."
            goto L_0x02b8
        L_0x02d3:
            X.0wc r1 = r10.A02
            java.lang.String r0 = "ig_comments_context_menu_toggle"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r8.A2n()
            if (r0 == 0) goto L_0x02f7
            X.G9t.A1J(r1, r0)
            java.lang.String r0 = r9.getId()
            X.G9t.A1K(r1, r0)
            java.lang.String r0 = "sort_order"
            r1.AAJ(r0, r6)
            X.C51965G9l.A1M(r1, r7)
            r1.Cgf()
            goto L_0x02c6
        L_0x02f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02fc:
            java.lang.Object r2 = r11.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.requireContext()
            java.lang.Object r0 = r11.A01
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A1q
            X.0nC.A00(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            r0 = 2131956742(0x7f131406, float:1.9550048E38)
            X.C59689JTv.A07(r1, r0)
            return
        L_0x0318:
            java.lang.Object r3 = r11.A02
            X.GiF r3 = (X.C53081GiF) r3
            X.Dc2 r0 = r3.A02
            if (r0 == 0) goto L_0x0326
            X.DbX.A1R(r0)
            r0 = 0
            r3.A02 = r0
        L_0x0326:
            java.lang.Object r0 = r11.A01
            X.GjN r0 = (X.C53151GjN) r0
            X.8vc r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r3.A07
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_seen_share_to_direct_dialog_from_draft"
            boolean r0 = X.DbT.A1a(r1, r0)
            if (r0 != 0) goto L_0x0366
            android.content.Context r0 = r3.A04
            X.8ab r4 = X.DbS.A0Y(r0)
            r0 = 2131955755(0x7f13102b, float:1.9548046E38)
            r4.A09(r0)
            r0 = 2131955754(0x7f13102a, float:1.9548044E38)
            r4.A08(r0)
            r1 = 12
            X.I8y r0 = new X.I8y
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r3)
            r4.A0E(r0)
            X.I8s r0 = X.C56712I8s.A00
            r4.A0C(r0)
            r1 = 7
            X.I9B r0 = new X.I9B
            r0.<init>(r3, r1)
            r4.A0f(r0)
            r3 = 1
            goto L_0x03a6
        L_0x0366:
            X.K57 r0 = r3.A09
            r0.A06(r2)
            return
        L_0x036c:
            java.lang.Object r7 = r11.A02
            X.GiF r7 = (X.C53081GiF) r7
            java.lang.Object r0 = r11.A01
            X.GjN r0 = (X.C53151GjN) r0
            X.8vc r6 = r0.A00
            com.instagram.common.session.UserSession r5 = r7.A07
            boolean r0 = X.C319116q4.A06(r5)
            r4 = 0
            if (r0 == 0) goto L_0x03ad
            int r3 = r7.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597317545233176(0x82051100040b18, double:3.207629208950276E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            if (r3 < r0) goto L_0x03ad
            android.content.Context r2 = r7.A04
            X.8ab r4 = X.DbS.A0Y(r2)
            r1 = 2131956669(0x7f1313bd, float:1.95499E38)
            r3 = 1
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.DbY.A0w(r2, r4, r0, r1)
            X.I8r r0 = X.C56711I8r.A00
            r4.A0E(r0)
        L_0x03a6:
            r4.A0r(r3)
            X.DbT.A1V(r4)
            return
        L_0x03ad:
            X.0eM r0 = r7.A0C
            java.lang.Object r1 = r0.getValue()
            X.LPH r1 = (X.LPH) r1
            X.JVg r0 = X.C59722JVg.DRAFT_FOLDER
            r1.A02(r0)
            android.content.Context r0 = r7.A04
            X.GcX r1 = new X.GcX
            r1.<init>(r0)
            r1.setCancelable(r4)
            X.AnonymousClass0fN.A00(r1)
            r0 = 19
            X.JG0 r5 = new X.JG0
            r5.<init>(r0, r1, r7)
            X.K57 r0 = r7.A09
            X.0xx r0 = X.G9t.A0t(r0)
            r8 = 0
            r9 = 3
            X.ImT r4 = new X.ImT
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IVI.onClick():void");
    }

    public IVI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
