package X;

/* renamed from: X.Plq  reason: case insensitive filesystem */
public final class C73915Plq extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73915Plq(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static C73915Plq A00(Object obj, Object obj2, int i) {
        return new C73915Plq(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025d, code lost:
        r1 = X.0wj.A01.AEf("media_gallery_logging_step_with_no_flow_id", 817899801);
        r6 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a5, code lost:
        r1.ABQ("logging_step", r6);
        r1.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        X.P3E.A00(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        return X.AnonymousClass7TE.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        r1.setAlpha(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x03b8;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x03a0;
                case 8: goto L_0x038c;
                case 9: goto L_0x038c;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x0327;
                case 14: goto L_0x0305;
                case 15: goto L_0x02ee;
                case 16: goto L_0x02af;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0043;
                case 25: goto L_0x00fa;
                case 26: goto L_0x0007;
                case 27: goto L_0x0043;
                case 28: goto L_0x0043;
                case 29: goto L_0x026b;
                case 30: goto L_0x0242;
                case 31: goto L_0x013e;
                case 32: goto L_0x012d;
                case 33: goto L_0x0118;
                case 34: goto L_0x0105;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x00fa;
                case 39: goto L_0x00fa;
                case 40: goto L_0x00e9;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00b9;
                case 43: goto L_0x0084;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0026;
                case 48: goto L_0x006d;
                case 49: goto L_0x0059;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r4.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0056
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0056
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r5
        L_0x0026:
            java.lang.Object r0 = r4.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x003a
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x003a
            X.2YM r5 = r1.getDefaultViewModelProviderFactory()
            if (r5 != 0) goto L_0x0025
        L_0x003a:
            java.lang.Object r0 = r4.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r5 = r0.getDefaultViewModelProviderFactory()
            return r5
        L_0x0043:
            java.lang.Object r0 = r4.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x004f
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x004f:
            java.lang.Object r0 = r4.A02
            X.2YQ r5 = X.JTU.A08(r0)
            return r5
        L_0x0056:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x0059:
            java.lang.Object r3 = r4.A02
            X.P3E r3 = (X.P3E) r3
            com.instagram.common.session.UserSession r1 = r3.A0G
            java.lang.Object r2 = r4.A01
            X.N41 r2 = (X.N41) r2
            java.lang.String r0 = r2.A01()
            X.C71151OeJ.A0G(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0080
        L_0x006d:
            java.lang.Object r3 = r4.A02
            X.P3E r3 = (X.P3E) r3
            com.instagram.common.session.UserSession r1 = r3.A0G
            java.lang.Object r2 = r4.A01
            X.N41 r2 = (X.N41) r2
            java.lang.String r0 = r2.A01()
            X.C71151OeJ.A0F(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0080:
            X.P3E.A00(r2, r3, r0)
            goto L_0x00e4
        L_0x0084:
            java.lang.Object r2 = r4.A02
            X.NJz r2 = (X.C68482NJz) r2
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()
            if (r6 == 0) goto L_0x00a5
            X.GUi r5 = X.C63556Kz5.A01
            X.0eM r0 = r2.A0e
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r2.A0b
            r0 = 7
            X.LdB r7 = new X.LdB
            r7.<init>(r2, r0)
            java.lang.String r10 = "ig_direct_thread_star_tab"
            java.lang.String r11 = "https://www.instagram.com/avatar/edit/update"
            r5.A02(r6, r7, r8, r9, r10, r11)
        L_0x00a5:
            java.lang.Object r0 = r4.A01
            X.C51969G9p.A1M(r0)
            X.0eM r0 = r2.A0c
            java.lang.Object r1 = r0.getValue()
            X.6i2 r1 = (X.C314336i2) r1
            java.lang.String r0 = r2.A0b
            r1.A04(r0)
            goto L_0x03d5
        L_0x00b9:
            java.lang.Object r0 = r4.A02
            X.NJh r0 = (X.C68469NJh) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r4.A01
            X.N41 r0 = (X.N41) r0
            java.lang.String r0 = r0.A01()
            X.C71151OeJ.A0G(r1, r0)
            goto L_0x00e4
        L_0x00cf:
            java.lang.Object r0 = r4.A02
            X.NJh r0 = (X.C68469NJh) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r4.A01
            X.N41 r0 = (X.N41) r0
            java.lang.String r0 = r0.A01()
            X.C71151OeJ.A0F(r1, r0)
        L_0x00e4:
            java.lang.Boolean r5 = X.AnonymousClass7TE.A0v()
            return r5
        L_0x00e9:
            java.lang.Object r0 = r4.A02
            X.OIQ r0 = (X.OIQ) r0
            X.NKm r1 = r0.A06
            java.lang.Object r0 = r4.A01
            com.instagram.model.direct.messageid.MessageIdentifier r0 = (com.instagram.model.direct.messageid.MessageIdentifier) r0
            java.lang.String r0 = r0.A01
            r1.A0C(r0)
            goto L_0x03d5
        L_0x00fa:
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A02
            r1.invoke(r0)
            goto L_0x03d5
        L_0x0105:
            java.lang.Object r2 = r4.A02
            X.7H6 r2 = (X.AnonymousClass7H6) r2
            java.lang.Object r1 = r4.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r1
            r0 = 0
            X.AnonymousClass7H6.A0T(r2, r1, r0)
            android.view.View r1 = r2.A07
            if (r1 == 0) goto L_0x03d5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0128
        L_0x0118:
            java.lang.Object r1 = r4.A02
            X.7H6 r1 = (X.AnonymousClass7H6) r1
            java.lang.Object r0 = r4.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r0
            X.AnonymousClass7H6.A0S(r1, r0)
            android.view.View r1 = r1.A07
            if (r1 == 0) goto L_0x03d5
            r0 = 0
        L_0x0128:
            r1.setAlpha(r0)
            goto L_0x03d5
        L_0x012d:
            java.lang.Object r2 = r4.A02
            X.7H6 r2 = (X.AnonymousClass7H6) r2
            X.77B r1 = X.AnonymousClass7H6.A05(r2)
            java.lang.Object r0 = r4.A01
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r0
            X.AnonymousClass7H6.A0R(r2, r1, r0)
            goto L_0x03d5
        L_0x013e:
            java.lang.Object r5 = r4.A02
            X.OYk r5 = (X.C71012OYk) r5
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x025b
            java.lang.Object r13 = r4.A01
            java.util.List r13 = (java.util.List) r13
            long r2 = r0.longValue()
            java.util.Iterator r16 = r13.iterator()
            r12 = 0
            r11 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x0158:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r14 = r16.next()
            X.8pU r14 = (X.C366678pU) r14
            X.8lx r15 = r14.A02
            r1 = 0
            if (r15 == 0) goto L_0x016d
            X.8PW r10 = r15.A05
            if (r10 != 0) goto L_0x0173
        L_0x016d:
            X.8pV r0 = r14.A03
            if (r0 == 0) goto L_0x01f6
            X.8PW r10 = r0.A05
        L_0x0173:
            r1 = 1
            r4 = 57
            if (r12 != 0) goto L_0x0186
            if (r10 == 0) goto L_0x01f4
            X.8Nz r0 = r10.A06
            if (r0 == 0) goto L_0x01f4
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01f4
        L_0x0186:
            r12 = 1
        L_0x0187:
            if (r11 != 0) goto L_0x0191
            if (r10 == 0) goto L_0x01f2
            boolean r0 = r10.A00()
            if (r0 != r1) goto L_0x01f2
        L_0x0191:
            r11 = 1
        L_0x0192:
            if (r9 != 0) goto L_0x01a2
            if (r15 == 0) goto L_0x019a
            com.instagram.camera.effect.models.CameraAREffect r0 = r15.A01
            if (r0 != 0) goto L_0x01a2
        L_0x019a:
            X.8pV r0 = r14.A03
            if (r0 == 0) goto L_0x01f0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            if (r0 == 0) goto L_0x01f0
        L_0x01a2:
            r9 = 1
        L_0x01a3:
            if (r7 != 0) goto L_0x01ee
            if (r10 == 0) goto L_0x01b5
            java.util.List r1 = r10.A0C
            if (r1 == 0) goto L_0x01b5
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01d8
        L_0x01b5:
            r7 = 0
        L_0x01b6:
            if (r10 == 0) goto L_0x0158
            java.util.List r0 = r10.A0E
            if (r0 == 0) goto L_0x0158
            java.util.Iterator r1 = r0.iterator()
        L_0x01c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r1.next()
            X.3ui r0 = (X.C255783ui) r0
            X.3WT r0 = r0.A11
            int r0 = r0.ordinal()
            if (r0 != r4) goto L_0x01d6
            r6 = 1
            goto L_0x01c0
        L_0x01d6:
            r8 = 1
            goto L_0x01c0
        L_0x01d8:
            java.util.Iterator r7 = r1.iterator()
        L_0x01dc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r7.next()
            X.4nO r0 = (X.C273914nO) r0
            X.4nP r1 = r0.A01
            X.4nP r0 = X.C273924nP.ANIMATED_STICKERS
            if (r1 != r0) goto L_0x01dc
        L_0x01ee:
            r7 = 1
            goto L_0x01b6
        L_0x01f0:
            r9 = 0
            goto L_0x01a3
        L_0x01f2:
            r11 = 0
            goto L_0x0192
        L_0x01f4:
            r12 = 0
            goto L_0x0187
        L_0x01f6:
            r10 = r1
            goto L_0x0173
        L_0x01f9:
            com.facebook.quicklog.reliability.UserFlowLogger r4 = r5.A03
            X.NVU r0 = X.NVU.A00
            java.lang.String r0 = r0.A00
            com.facebook.quicklog.PointEditor r10 = r4.markPointWithEditor(r2, r0)
            int r1 = r13.size()
            java.lang.String r0 = "total_selected_items"
            com.facebook.quicklog.PointEditor r1 = r10.addPointData(r0, r1)
            java.lang.String r0 = "has_text_edits"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r12)
            java.lang.String r0 = "has_drawing_edits"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r11)
            java.lang.String r0 = "has_ar_effect"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r9)
            java.lang.String r0 = "has_story_stickers"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r8)
            java.lang.String r0 = "has_giphy_stickers"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r7)
            java.lang.String r0 = "has_avatar_sticker"
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r6)
            r0.markerEditingCompleted()
            r4.flowEndSuccess(r2)
            r0 = 0
            r5.A00 = r0
            r0 = 0
            r5.A02 = r0
            r0 = 1
            r5.A01 = r0
            goto L_0x03d5
        L_0x0242:
            java.lang.Object r1 = r4.A02
            X.OYk r1 = (X.C71012OYk) r1
            java.lang.Long r0 = r1.A00
            java.lang.Object r4 = r4.A01
            X.O6M r4 = (X.O6M) r4
            if (r0 == 0) goto L_0x025d
            long r2 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r1 = r1.A03
            java.lang.String r0 = r4.A00
            r1.flowMarkPoint(r2, r0)
            goto L_0x03d5
        L_0x025b:
            X.NVU r4 = X.NVU.A00
        L_0x025d:
            X.0wj r2 = X.0wj.A01
            r1 = 817899801(0x30c02919, float:1.3981519E-9)
            java.lang.String r0 = "media_gallery_logging_step_with_no_flow_id"
            X.0f9 r1 = r2.AEf(r0, r1)
            java.lang.String r6 = r4.A00
            goto L_0x02a5
        L_0x026b:
            java.lang.Object r5 = r4.A01
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = 1
            X.0qQ.A0B(r5, r0)
            java.lang.String r6 = "navigate_to_media_edit_multiple"
            java.lang.Object r3 = r4.A02
            X.OYk r3 = (X.C71012OYk) r3
            java.lang.Long r0 = r3.A00
            if (r0 == 0) goto L_0x029a
            long r1 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r0 = r3.A03
            com.facebook.quicklog.PointEditor r2 = r0.markPointWithEditor(r1, r6)
            java.lang.String r1 = ";"
            X.Po3 r0 = X.C74038Po3.A00
            java.lang.String r1 = X.DbT.A0z(r1, r5, r0)
            java.lang.String r0 = "media_aspect_ratios"
            com.facebook.quicklog.PointEditor r0 = r2.addPointData(r0, r1)
            r0.markerEditingCompleted()
            goto L_0x03d5
        L_0x029a:
            X.0wj r2 = X.0wj.A01
            r1 = 817899801(0x30c02919, float:1.3981519E-9)
            java.lang.String r0 = "media_gallery_logging_step_with_no_flow_id"
            X.0f9 r1 = r2.AEf(r0, r1)
        L_0x02a5:
            java.lang.String r0 = "logging_step"
            r1.ABQ(r0, r6)
            r1.report()
            goto L_0x03d5
        L_0x02af:
            java.lang.Object r8 = r4.A02
            X.NV6 r8 = (X.NV6) r8
            X.0eM r3 = r8.A0S
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r2 = r0.A06
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L_0x02e3
            java.lang.String r0 = "seed_message_sender_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x02c5:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x02e5
            X.F1M r7 = X.ENY.A02
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r5 = r8.requireContext()
            r3 = 1
            java.lang.Object r2 = r4.A01
            r1 = 0
            X.PIT r0 = new X.PIT
            r0.<init>(r1, r2, r8)
            r7.A00(r5, r6, r0, r3)
            goto L_0x03d5
        L_0x02e3:
            r0 = 0
            goto L_0x02c5
        L_0x02e5:
            java.lang.Object r0 = r4.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.NV6.A01(r0, r8)
            goto L_0x03d5
        L_0x02ee:
            java.lang.Object r1 = r4.A02
            X.MzC r1 = (X.C68045MzC) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3oV r0 = r1.A00
            r0.getView()
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r1, r0)
            return r5
        L_0x0305:
            java.lang.Object r5 = r4.A01
            X.NVH r5 = (X.NVH) r5
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = r5.A04
            if (r3 == 0) goto L_0x03d5
            java.lang.Object r2 = r4.A02
            X.NVC r2 = (X.NVC) r2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = r5.A06
            if (r0 == 0) goto L_0x03d5
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x03d5
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r2 = r2.A01
            boolean r1 = r5.A05
            X.NmR r0 = X.C69483NmR.CARD_STACK
            X.C71137Odf.A04(r0, r2, r3, r1)
            goto L_0x03d5
        L_0x0327:
            java.lang.Object r3 = r4.A02
            X.NV7 r3 = (X.NV7) r3
            X.MuF r2 = r3.A0E()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengesGalleryViewModel"
            X.0qQ.A0C(r2, r0)
            X.NVG r2 = (X.NVG) r2
            monitor-enter(r2)
            X.0Ud r0 = r2.A02     // Catch:{ all -> 0x0389 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0389 }
            X.N4R r0 = (X.N4R) r0     // Catch:{ all -> 0x0389 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0389 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0389 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0389 }
            if (r1 == r0) goto L_0x0350
            X.6oS r1 = X.C318116oQ.A00(r2)     // Catch:{ all -> 0x0389 }
            r0 = 38
            X.C66583MXo.A1O(r2, r1, r0)     // Catch:{ all -> 0x0389 }
        L_0x0350:
            monitor-exit(r2)
            X.0eM r0 = r3.A02
            X.OyR r5 = X.C66580MXl.A0T(r0)
            java.lang.String r7 = X.C66580MXl.A0w(r3)
            com.instagram.model.direct.DirectThreadKey r0 = r3.A0G()
            java.lang.String r8 = r0.A01
            java.lang.Integer r6 = X.C66583MXo.A0d(r3)
            java.lang.Object r1 = r4.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0384
            java.lang.String r0 = ","
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
            java.lang.String r0 = "challenge_winner_submission_ids"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r0, r1)
        L_0x0377:
            r4 = 0
            java.lang.String r9 = "challenge_winners_selected"
            java.lang.String r10 = "tap"
            java.lang.String r11 = "choose_winners_button"
            java.lang.String r12 = "challenge_submissions_sheet"
            X.C72202OyR.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03d5
        L_0x0384:
            X.0sm r13 = X.0Yt.A0E()
            goto L_0x0377
        L_0x0389:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x038c:
            java.lang.Object r3 = r4.A02
            X.PR9 r3 = (X.PR9) r3
            android.widget.CompoundButton$OnCheckedChangeListener r2 = r3.A08
            r0 = 0
            r3.A08 = r0
            java.lang.Object r1 = r4.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            r1.setChecked(r0)
            r3.A08 = r2
            goto L_0x03d5
        L_0x03a0:
            java.lang.Object r3 = r4.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r0 = "EncryptedBackupsStatusRepository"
            X.1aU r2 = X.OP5.A00(r3, r0)
            X.1aU r1 = X.OP5.A01(r3, r0)
            java.lang.Object r0 = r4.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.OyT r5 = new X.OyT
            r5.<init>(r2, r1, r3, r0)
            return r5
        L_0x03b8:
            java.lang.Object r5 = r4.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            X.68L r3 = X.C66581MXm.A0I(r5)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            r1 = 37
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r2)
            X.C66582MXn.A1E(r3, r0, r2)
            java.lang.Object r1 = r4.A02
            r0 = 38
            X.C71722Opg.A01(r2, r1, r0)
        L_0x03d5:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73915Plq.invoke():java.lang.Object");
    }
}
