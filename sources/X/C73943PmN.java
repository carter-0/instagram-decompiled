package X;

/* renamed from: X.PmN  reason: case insensitive filesystem */
public final class C73943PmN extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73943PmN(String str, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, X.NI1] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x055b, code lost:
        if (r2.isEmpty() != false) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013e, code lost:
        if (r2.endsWith(" ") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c9, code lost:
        r4.postDelayed(r3, 500);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0210, code lost:
        if (r2 != 61) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0258, code lost:
        if (r2 != 61) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r4 = r18
            r3 = r17
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0548;
                case 1: goto L_0x0548;
                case 2: goto L_0x035d;
                case 3: goto L_0x0514;
                case 4: goto L_0x04b6;
                case 5: goto L_0x04a5;
                case 6: goto L_0x0725;
                case 7: goto L_0x047b;
                case 8: goto L_0x045a;
                case 9: goto L_0x041f;
                case 10: goto L_0x03fe;
                case 11: goto L_0x035d;
                case 12: goto L_0x06f3;
                case 13: goto L_0x03f3;
                case 14: goto L_0x03de;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03c4;
                case 17: goto L_0x03c4;
                case 18: goto L_0x03b9;
                case 19: goto L_0x03ae;
                case 20: goto L_0x039f;
                case 21: goto L_0x0390;
                case 22: goto L_0x06e9;
                case 23: goto L_0x0374;
                case 24: goto L_0x0365;
                case 25: goto L_0x06bd;
                case 26: goto L_0x0670;
                case 27: goto L_0x035d;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x02f6;
                case 33: goto L_0x02e5;
                case 34: goto L_0x060f;
                case 35: goto L_0x0290;
                case 36: goto L_0x01d0;
                case 37: goto L_0x01a6;
                case 38: goto L_0x0182;
                case 39: goto L_0x0126;
                case 40: goto L_0x0108;
                case 41: goto L_0x00f8;
                case 42: goto L_0x0604;
                case 43: goto L_0x00e3;
                case 44: goto L_0x0097;
                case 45: goto L_0x05e9;
                case 46: goto L_0x0061;
                case 47: goto L_0x0592;
                case 48: goto L_0x0049;
                case 49: goto L_0x0030;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A01
            X.4JK r0 = (X.AnonymousClass4JK) r0
            java.lang.String r5 = r3.A02
            X.05G r3 = r0.A04
        L_0x0011:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            X.0Ym r0 = new X.0Ym
            r0.<init>()
            r0.putAll(r1)
            r0.put(r5, r4)
            X.0Ym r0 = X.0se.A0N(r0)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0011
        L_0x002d:
            X.0gF r4 = X.C60340gF.A00
        L_0x002f:
            return r4
        L_0x0030:
            X.NCZ r4 = (X.NCZ) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.NDr r0 = r4.A06
            java.lang.String r2 = r3.A02
            java.lang.Object r1 = r3.A01
            java.util.Map r1 = (java.util.Map) r1
            X.AnonymousClass7TF.A1H(r2, r1)
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r0 = r0.A00
            if (r0 == 0) goto L_0x002d
            r0.updateParticipants(r2, r1)
            goto L_0x002d
        L_0x0049:
            X.5SW r4 = (X.AnonymousClass5SW) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 5
            X.C285645Sc.A02(r4, r0)
            java.lang.Object r0 = r3.A01
            X.Glx r0 = (X.C53311Glx) r0
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r3.A02
        L_0x005d:
            X.C285645Sc.A03(r4, r0)
            goto L_0x002d
        L_0x0061:
            X.DdY r4 = (X.DdY) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.List r0 = r4.A0F
            java.lang.String r5 = r3.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r0 = r0.A09
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x006f
        L_0x0084:
            X.5Gi r2 = (X.C283155Gi) r2
            if (r2 == 0) goto L_0x002f
            java.lang.Object r0 = r3.A01
            X.INm r0 = (X.C57072INm) r0
            X.3gp r0 = r0.A00
            java.lang.String r1 = r0.A0G
            X.5Gj r0 = r2.A04
            r0.A06 = r1
            return r4
        L_0x0095:
            r2 = 0
            goto L_0x0084
        L_0x0097:
            java.lang.Object r2 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            X.5v9 r4 = r2.A06
            java.lang.String r5 = r3.A02
            X.4oe r0 = r2.A09
            java.lang.String r6 = r0.A06
            java.lang.String r7 = r0.A07
            X.0Ud r3 = r2.A0G
            java.lang.Object r0 = r3.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r0 = r0.A06
            java.util.Iterator r1 = r0.iterator()
            r9 = 0
        L_0x00b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x00cc
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00cb:
            r9 = -1
        L_0x00cc:
            java.lang.Object r0 = r3.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r0 = r0.A06
            int r10 = r0.size()
            java.lang.Integer r0 = r2.A0E
            java.lang.String r8 = X.C292845jc.A00(r0)
            r4.EGl(r5, r6, r7, r8, r9, r10)
            goto L_0x002d
        L_0x00e3:
            X.Bjb r4 = (X.C42829Bjb) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.IHg r0 = (X.C56911IHg) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            com.instagram.common.session.UserSession r1 = r0.A0A
            java.lang.String r0 = r3.A02
            X.C48896Elw.A00(r2, r1, r4, r0)
            goto L_0x002d
        L_0x00f8:
            java.lang.Object r2 = r3.A01
            X.7UH r2 = (X.AnonymousClass7UH) r2
            java.lang.String r1 = r3.A02
            r0 = 0
            r2.A05(r1, r0)
            r0 = 1
            r2.A04(r1, r0)
            goto L_0x002d
        L_0x0108:
            java.lang.Object r0 = r3.A01
            X.Mot r0 = (X.C67499Mot) r0
            X.0eM r4 = r0.A02
            java.lang.Object r1 = r4.getValue()
            X.7UH r1 = (X.AnonymousClass7UH) r1
            java.lang.String r2 = r3.A02
            r0 = 0
            r1.A05(r2, r0)
            java.lang.Object r1 = r4.getValue()
            X.7UH r1 = (X.AnonymousClass7UH) r1
            r0 = 1
            r1.A04(r2, r0)
            goto L_0x002d
        L_0x0126:
            java.lang.String r2 = X.C41847B3o.A1E(r4)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x0134
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0142
        L_0x0134:
            java.lang.String r1 = " "
            r0 = 1
            X.0qQ.A0B(r1, r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 == 0) goto L_0x0142
            goto L_0x002d
        L_0x0142:
            java.lang.Object r1 = r3.A01
            X.OJf r1 = (X.OJf) r1
            r0 = 100
            java.lang.String r8 = X.00R.A03(r2, r0)
            X.NIZ r0 = r1.A00
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.GhI r3 = (X.C53027GhI) r3
            X.05G r2 = r3.A06
        L_0x0158:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.GnO r4 = (X.C53391GnO) r4
            r5 = 0
            java.lang.String r0 = r3.A05
            boolean r0 = r8.equals(r0)
            r11 = 1
            if (r0 != 0) goto L_0x0180
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x0180
        L_0x016f:
            r10 = 207(0xcf, float:2.9E-43)
            r6 = r5
            r7 = r5
            r9 = r5
            X.GnO r0 = X.C53391GnO.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0158
            goto L_0x002d
        L_0x0180:
            r11 = 0
            goto L_0x016f
        L_0x0182:
            X.7Rt r4 = (X.C331637Rt) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.9H7 r0 = (X.AnonymousClass9H7) r0
            X.4DH r0 = r0.A0u
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            if (r2 == 0) goto L_0x002d
            java.lang.String r1 = r3.A02
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.7Li r0 = r4.A01
            if (r0 == 0) goto L_0x002d
            android.widget.TextView r4 = r0.A07
            X.PaM r3 = new X.PaM
            r3.<init>(r2, r0, r1)
            goto L_0x01c9
        L_0x01a6:
            X.7Rt r4 = (X.C331637Rt) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r3.A01
            X.9H7 r0 = (X.AnonymousClass9H7) r0
            X.4DH r0 = r0.A0u
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            if (r2 == 0) goto L_0x002d
            java.lang.String r1 = r3.A02
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.7Li r0 = r4.A01
            if (r0 == 0) goto L_0x002d
            android.view.View r4 = r0.A03
            X.PaL r3 = new X.PaL
            r3.<init>(r2, r0, r1)
        L_0x01c9:
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r3, r0)
            goto L_0x002d
        L_0x01d0:
            X.2Ep r4 = (X.AnonymousClass2Ep) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0232
            java.lang.String r0 = "XMA"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0232
            java.lang.String r0 = "BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r3.A01
            X.Mtz r0 = (X.C67746Mtz) r0
            X.0eM r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.7IQ r3 = (X.AnonymousClass7IQ) r3
            java.lang.String r5 = r4.C6C()
            java.lang.String r6 = r4.C6k()
            int r2 = r4.C6a()
            int r1 = r4.AdN()
            r0 = 28
            if (r2 == r0) goto L_0x022b
            r0 = 29
            if (r2 == r0) goto L_0x0214
            r0 = 61
            if (r2 == r0) goto L_0x022b
            goto L_0x002d
        L_0x0214:
            X.OyG r3 = X.C66583MXo.A0Q(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "questions"
            java.lang.String r0 = "prompt_type"
            java.util.Map r10 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r7 = "direct_open_response_tab"
            java.lang.String r8 = "impression"
            java.lang.String r9 = "add_response_button_grid_view"
            goto L_0x0272
        L_0x022b:
            X.OyH r4 = X.C66583MXo.A0R(r3)
            X.EZp r2 = X.C48147EZp.ADD_RESPONSE_BUTTON_GRID_VIEW
            goto L_0x027d
        L_0x0232:
            java.lang.Object r0 = r3.A01
            X.Mtz r0 = (X.C67746Mtz) r0
            X.0eM r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.7IQ r3 = (X.AnonymousClass7IQ) r3
            java.lang.String r5 = r4.C6C()
            java.lang.String r6 = r4.C6k()
            int r2 = r4.C6a()
            int r1 = r4.AdN()
            r0 = 28
            if (r2 == r0) goto L_0x0277
            r0 = 29
            if (r2 == r0) goto L_0x025c
            r0 = 61
            if (r2 == r0) goto L_0x0277
            goto L_0x002d
        L_0x025c:
            X.OyG r3 = X.C66583MXo.A0Q(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "questions"
            java.lang.String r0 = "prompt_type"
            java.util.Map r10 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r7 = "direct_open_response_tab"
            java.lang.String r8 = "impression"
            java.lang.String r9 = "add_response_xma_cta"
        L_0x0272:
            X.C72195OyG.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002d
        L_0x0277:
            X.OyH r4 = X.C66583MXo.A0R(r3)
            X.EZp r2 = X.C48147EZp.ADD_RESPONSE_XMA_CTA
        L_0x027d:
            X.EZo r3 = X.C48146EZo.THREAD_VIEW
            java.lang.String r1 = "questions"
            java.lang.String r0 = "prompt_type"
            java.util.Map r7 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r5 = "direct_open_response_tab"
            java.lang.String r6 = "impression"
            X.C72196OyH.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x002d
        L_0x0290:
            X.3lr r4 = (X.C250663lr) r4
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.lang.String r0 = "primary_family_device_id"
            java.lang.String r8 = r4.getOptionalStringField(r1, r0)
            java.lang.Object r0 = r3.A01
            X.MuD r0 = (X.C67758MuD) r0
            X.05G r4 = r0.A0L
            java.lang.String r7 = r3.A02
            r6 = 0
            r10 = 10
            X.JwB r5 = new X.JwB
            r9 = r6
            r5.<init>((java.lang.Object) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)
            r4.FIA(r5)
            if (r8 == 0) goto L_0x002d
            boolean r3 = r8.equalsIgnoreCase(r7)
            X.NUL r2 = r0.A06
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x02cf
            if (r3 == 0) goto L_0x02e2
            java.lang.String r1 = "YES"
        L_0x02c2:
            java.lang.String r0 = "PRIMARY_DEVICE"
            r2.A0D(r0, r1)
            java.lang.String r0 = "DATA_RETRIEVAL_SUCCESS"
            r2.A0B(r0)
            r2.A08()
        L_0x02cf:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            X.JwB r11 = new X.JwB
            r13 = r7
            r14 = r8
            r15 = r6
            r16 = r10
            r11.<init>((java.lang.Object) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (int) r16)
            r4.FIA(r11)
            goto L_0x002d
        L_0x02e2:
            java.lang.String r1 = "NO"
            goto L_0x02c2
        L_0x02e5:
            X.QWO r4 = (X.QWO) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r1 = r3.A01
            X.OZG r1 = (X.OZG) r1
            java.lang.String r0 = r3.A02
            X.OZG.A00(r1, r4, r0)
            goto L_0x002d
        L_0x02f6:
            java.lang.String r4 = (java.lang.String) r4
            r7 = 0
            X.0qQ.A0B(r4, r7)
            java.lang.Object r5 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl) r5
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl.A02(r5)
            if (r0 == 0) goto L_0x002d
            X.4DH r0 = r5.A00
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L_0x002d
            java.lang.String r2 = r3.A02
            java.lang.String r0 = " / "
            java.lang.String r1 = X.002.A0R(r0, r4)
            int r6 = X.DbV.A01(r6)
            java.util.regex.Pattern r0 = X.0mp.A06
            int r4 = X.DbX.A05(r2)
            int r3 = X.DbX.A05(r1)
            java.lang.String r0 = X.002.A0R(r2, r1)
            android.text.SpannableString r2 = X.C66580MXl.A0D(r0)
            android.widget.TextView r0 = r5.A03()
            int r0 = r0.getCurrentTextColor()
            android.text.style.ForegroundColorSpan r0 = X.C66580MXl.A0E(r0)
            r1 = 33
            r2.setSpan(r0, r7, r4, r1)
            android.text.style.ForegroundColorSpan r0 = X.C66580MXl.A0E(r6)
            int r3 = r3 + r4
            r2.setSpan(r0, r4, r3, r1)
            android.widget.TextView r0 = r5.A03()
            r0.setText(r2)
            android.widget.TextView r0 = r5.A03()
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl.A01(r5, r0)
            goto L_0x002d
        L_0x035d:
            java.lang.Object r5 = r3.A01
            X.0sP r5 = (X.0sP) r5
            java.lang.String r3 = r3.A02
            goto L_0x052d
        L_0x0365:
            X.0xY r4 = (X.0xY) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = "ig_professional_identity_cache_id"
            java.lang.String r0 = r3.A02
            r4.E5g(r1, r0)
            goto L_0x002d
        L_0x0374:
            com.facebook.quicklog.PointEditor r4 = (com.facebook.quicklog.PointEditor) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "file_name"
            r4.addPointData(r0, r1)
            java.lang.Object r0 = r3.A01
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r0 = (com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource) r0
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "source"
            r4.addPointData(r0, r1)
            goto L_0x002d
        L_0x0390:
            java.lang.String r2 = X.C41847B3o.A1E(r4)
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.E19(r0, r2)
            goto L_0x002d
        L_0x039f:
            java.lang.String r2 = X.C41847B3o.A1E(r4)
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DKy(r0, r2)
            goto L_0x002d
        L_0x03ae:
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DHe(r0)
            goto L_0x002d
        L_0x03b9:
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DHd(r0)
            goto L_0x002d
        L_0x03c4:
            java.lang.String r2 = X.C41847B3o.A1E(r4)
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DKz(r0, r2)
            goto L_0x002d
        L_0x03d3:
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DL0(r0)
            goto L_0x002d
        L_0x03de:
            java.lang.String r2 = X.C41847B3o.A1E(r4)
            java.lang.String r4 = "timely_topics"
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r3 = r3.A02
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r1.Dhy(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x002d
        L_0x03f3:
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DbO(r0)
            goto L_0x002d
        L_0x03fe:
            boolean r1 = X.AnonymousClass7TE.A1a(r4)
            X.Sto r5 = X.C51965G9l.A0g()
            java.lang.Object r0 = r3.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r4 = r0.A1P
            java.lang.String r2 = r3.A02
            X.QDH r0 = r0.A1Q
            X.SEB r0 = r0.A03()
            java.util.LinkedHashMap r1 = X.C66583MXo.A0m(r0, r1)
            java.lang.String r0 = "selected_shipping_option"
            r5.A0R(r4, r2, r0, r1)
            goto L_0x002d
        L_0x041f:
            boolean r2 = X.AnonymousClass7TE.A1a(r4)
            X.Sto r1 = X.C51965G9l.A0g()
            java.lang.Object r0 = r3.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r4 = r0.A1P
            java.lang.String r6 = r3.A02
            X.QDH r0 = r0.A1Q
            X.SEB r0 = r0.A03()
            java.util.LinkedHashMap r5 = X.C66583MXo.A0m(r0, r2)
            java.lang.String r7 = "selected_fulfillment_option"
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_fulfillmentoption_success"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            r1 = 78
            X.1Ln r0 = new X.1Ln
            r0.<init>(r2, r1)
            r8 = 8
            X.PqY r3 = new X.PqY
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8)
            X.C12411Sto.A03(r0, r4, r3)
            goto L_0x002d
        L_0x045a:
            boolean r6 = X.AnonymousClass7TE.A1a(r4)
            X.Sto r5 = X.C51965G9l.A0g()
            java.lang.Object r0 = r3.A01
            X.QDM r0 = (X.QDM) r0
            com.facebookpay.logging.LoggingContext r4 = r0.A0R
            java.lang.String r2 = r3.A02
            X.QDH r0 = r0.A0S
            boolean r1 = r0.A03
            X.SEB r0 = r0.A03()
            java.util.LinkedHashMap r0 = X.C66583MXo.A0m(r0, r6)
            r5.A0f(r4, r2, r0, r1)
            goto L_0x002d
        L_0x047b:
            X.RQM r4 = (X.RQM) r4
            X.63X r0 = r4.A00
            X.PxC r0 = (X.C74563PxC) r0
            X.Or3 r0 = (X.C71802Or3) r0
            com.google.android.gms.safetynet.zza r0 = r0.A00
            if (r0 != 0) goto L_0x04a2
            r0 = 0
        L_0x0488:
            X.0qQ.A07(r0)
            java.lang.String r4 = r3.A02
            X.0qQ.A0A(r4)
            r1 = 1
            X.0qQ.A0B(r4, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.1xC r2 = X.1xC.A01
            X.FVs r1 = new X.FVs
            r1.<init>(r0, r3, r4)
            r2.A00(r1)
            goto L_0x002d
        L_0x04a2:
            java.lang.String r0 = r0.A00
            goto L_0x0488
        L_0x04a5:
            X.Tbr r4 = (X.C13522Tbr) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r1 = r3.A01
            X.SGo r1 = (X.C11230SGo) r1
            java.lang.String r0 = r3.A02
            r4.D5u(r1, r0)
            goto L_0x002d
        L_0x04b6:
            X.Kl0 r4 = (X.C62700Kl0) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4 instanceof X.N1W
            if (r0 == 0) goto L_0x04d9
            java.lang.Object r2 = r3.A01
            X.UIE r2 = (X.UIE) r2
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002d
            X.N1W r4 = (X.N1W) r4
            com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder r0 = r4.A00
            r2.A01 = r0
            X.UIE.A01(r2)
            goto L_0x002d
        L_0x04d9:
            boolean r0 = r4 instanceof X.C60801JrW
            java.lang.String r5 = "CdlLiveEditingPlayer"
            if (r0 == 0) goto L_0x050d
            java.lang.String r3 = "[Color Ramp Generation][error]:,  "
            X.JrW r4 = (X.C60801JrW) r4
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x050a
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x04fd;
                case 2: goto L_0x0500;
                case 3: goto L_0x0503;
                default: goto L_0x04ee;
            }
        L_0x04ee:
            java.lang.String r2 = "TASK_CANCELLED"
        L_0x04f0:
            r1 = 58
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.002.A0i(r3, r2, r0, r1)
            X.0KC.A0C(r5, r0)
            goto L_0x002d
        L_0x04fd:
            java.lang.String r2 = "CDL_ERROR"
            goto L_0x04f0
        L_0x0500:
            java.lang.String r2 = "CDL_LIBRARY_NOT_AVAILABLE"
            goto L_0x04f0
        L_0x0503:
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            goto L_0x04f0
        L_0x050a:
            java.lang.String r2 = "null"
            goto L_0x04f0
        L_0x050d:
            java.lang.String r0 = "[Color Ramp Generation][unexpected else condition]"
            X.0KC.A0D(r5, r0)
            goto L_0x002d
        L_0x0514:
            X.Kkz r4 = (X.C62699Kkz) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4 instanceof X.C60796JrR
            if (r0 == 0) goto L_0x0532
            java.lang.Object r5 = r3.A01
            X.0sP r5 = (X.0sP) r5
            java.lang.String r1 = r3.A02
            X.JrR r4 = (X.C60796JrR) r4
            com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder r0 = r4.A00
            X.N1W r3 = new X.N1W
            r3.<init>(r0, r1)
        L_0x052d:
            r5.invoke(r3)
            goto L_0x002d
        L_0x0532:
            boolean r0 = r4 instanceof X.C60797JrS
            if (r0 == 0) goto L_0x002d
            java.lang.Object r5 = r3.A01
            X.0sP r5 = (X.0sP) r5
            java.lang.String r2 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.JrS r4 = (X.C60797JrS) r4
            java.lang.String r0 = r4.A00
            X.JrW r3 = new X.JrW
            r3.<init>(r2, r1, r0)
            goto L_0x052d
        L_0x0548:
            java.lang.Object r0 = r3.A01
            X.6Rd r0 = (X.C307706Rd) r0
            java.lang.String r3 = r3.A02
            java.util.Map r0 = r0.A01
            java.util.List r2 = X.C66580MXl.A13(r3, r0)
            if (r2 == 0) goto L_0x055d
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x055e
        L_0x055d:
            r0 = 1
        L_0x055e:
            java.lang.String r1 = "MediaStoreDataModule"
            if (r0 == 0) goto L_0x056d
            java.lang.String r0 = "Failed to publish update: no observers bound to "
            java.lang.String r0 = X.002.A0R(r0, r3)
            X.1Kn.A02(r1, r0)
            goto L_0x002d
        L_0x056d:
            java.util.Iterator r2 = r2.iterator()
        L_0x0571:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r2.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            X.6Qd r1 = (X.C307446Qd) r1
            if (r1 != 0) goto L_0x0589
            r2.remove()
            goto L_0x0571
        L_0x0589:
            X.Q4K r0 = new X.Q4K
            r0.<init>(r1, r4, r3)
            X.C307446Qd.A03(r0)
            goto L_0x0571
        L_0x0592:
            X.DdY r4 = (X.DdY) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.List r0 = r4.A0F
            java.lang.String r5 = r3.A02
            java.lang.Object r6 = r3.A01
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r6
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x05a8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x071e
            java.lang.Object r2 = r7.next()
            X.5Gi r2 = (X.C283155Gi) r2
            X.5Gj r0 = r2.A04
            java.lang.String r0 = r0.A0b
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x05e5
            com.instagram.common.session.UserSession r0 = r6.A04
            com.instagram.user.model.User r1 = X.F6W.A00(r0, r2)
            X.D9g r0 = X.C65211bM.A00
            X.DDf r0 = r0.A00()
            r0.A0r = r5
            r0.A09 = r1
            X.1bK r0 = r0.A02()
            X.3gp r1 = new X.3gp
            r1.<init>(r0)
            X.GqN r0 = new X.GqN
            r0.<init>(r1)
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.A01(r0, r6)
            com.instagram.api.schemas.PrivateReplyStatus r1 = com.instagram.api.schemas.PrivateReplyStatus.A06
            X.5Gj r0 = r2.A04
            r0.A00 = r1
        L_0x05e5:
            r3.add(r2)
            goto L_0x05a8
        L_0x05e9:
            r5 = 0
            X.0qQ.A0B(r4, r5)
            java.lang.String r2 = r3.A02
            int r0 = r2.length()
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r5)
            X.N8o r5 = new X.N8o
            r5.<init>(r2, r0, r1)
            return r5
        L_0x0604:
            int r1 = X.AnonymousClass7TE.A0M(r4)
            java.lang.String r0 = r3.A02
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r1, r0)
            return r5
        L_0x060f:
            X.Nnw r4 = (X.C69552Nnw) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4 instanceof X.N0I
            if (r0 == 0) goto L_0x0660
            java.lang.Object r1 = r3.A01
            X.OHi r1 = (X.C70713OHi) r1
            X.N0I r4 = (X.N0I) r4
            java.lang.Object r6 = r4.A00
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = r3.A02
            X.NI1 r5 = new X.NI1
            r5.<init>()
            r5.A00 = r0
            X.Evg r4 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A03
            X.NiB r2 = X.C69249NiB.A03
            java.lang.Class r1 = r2.A02
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x065d
            X.0tM r0 = r2.A01
            java.lang.Object r0 = r0.A01(r3)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x065d
            X.Ptu r0 = r2.A00
            java.lang.String r2 = r0.FHB(r5)
            java.lang.String r1 = ":"
            java.lang.String r0 = "encrypted_backups_key"
            java.lang.String r1 = X.002.A0g(r6, r1, r0)
            X.0xa r0 = r4.A00
            X.DbX.A1U(r0, r1, r2)
        L_0x065d:
            X.NTj r5 = X.C68697NTj.A00
            return r5
        L_0x0660:
            boolean r0 = r4 instanceof X.N0J
            if (r0 == 0) goto L_0x066e
            X.N0J r4 = (X.N0J) r4
            java.lang.Exception r0 = r4.A00
        L_0x0668:
            X.NTk r5 = new X.NTk
            r5.<init>(r0)
            return r5
        L_0x066e:
            r0 = 0
            goto L_0x0668
        L_0x0670:
            X.9IV r4 = (X.AnonymousClass9IV) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r7 = r4.A00
            X.9Ib r7 = (X.C376459Ib) r7
            java.lang.String r6 = r3.A02
            java.lang.Object r5 = r3.A01
            X.0sP r5 = (X.0sP) r5
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x068c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06a8
            java.lang.Object r1 = r2.next()
            X.7dj r1 = (X.C335907dj) r1
            java.lang.String r0 = r1.A0K
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x06a4
            java.lang.Object r1 = r5.invoke(r1)
        L_0x06a4:
            r3.add(r1)
            goto L_0x068c
        L_0x06a8:
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r7.A00
            X.7dk r0 = (X.C335917dk) r0
            X.9Ib r1 = X.C376459Ib.A00(r0, r1, r3)
            java.lang.Object r0 = r4.A01
            X.7dj r0 = (X.C335907dj) r0
            X.9IV r5 = X.AnonymousClass9IV.A00(r1, r0)
            return r5
        L_0x06bd:
            X.7dj r4 = (X.C335907dj) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r1 = r3.A01
            X.7aK r1 = (X.C333897aK) r1
            X.7aK r0 = X.C333897aK.SHOW_TRANSLATION
            if (r1 != r0) goto L_0x06e1
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x06da
            int r0 = r1.length()
            if (r0 == 0) goto L_0x06da
            X.7dj r5 = X.C335907dj.A00((X.C335867df) null, r4, (X.C337227fv) null, (X.C335857de) null, X.C333897aK.SHOW_TRANSLATION, (X.C337207ft) null, (X.C337217fu) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, r1, (java.util.List) null, -67108897, 65535, false, false, false, false, false, false, false, false)
            return r5
        L_0x06da:
            java.lang.String r0 = r4.A0J
            X.7dj r5 = X.C335907dj.A00((X.C335867df) null, r4, (X.C337227fv) null, (X.C335857de) null, X.C333897aK.SHOW_TRANSLATION, (X.C337207ft) null, (X.C337217fu) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, r0, (java.util.List) null, -67108897, 65535, false, false, false, false, false, false, false, false)
            return r5
        L_0x06e1:
            r0 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            X.7dj r5 = X.C335907dj.A00((X.C335867df) null, r4, (X.C337227fv) null, (X.C335857de) null, r1, (X.C337207ft) null, (X.C337217fu) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r0, 65535, false, false, false, false, false, false, false, false)
            return r5
        L_0x06e9:
            java.lang.Object r1 = r3.A01
            r0 = 15
            X.GP2 r5 = new X.GP2
            r5.<init>(r1, r0)
            return r5
        L_0x06f3:
            X.SUj r4 = (X.SUj) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0723
            java.lang.String r3 = r3.A02
            r5 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x0706:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0722
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r0 = r0.A08
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0706
            return r1
        L_0x071e:
            X.DdY r5 = X.DdY.A00((X.C376619Ir) null, (X.JV5) null, (X.C53380GnA) null, (X.C61008Jv7) null, r4, (java.lang.Integer) null, r3, (java.util.List) null, (java.util.List) null, 131069)
        L_0x0722:
            return r5
        L_0x0723:
            r5 = 0
            return r5
        L_0x0725:
            r2 = 0
            X.0qQ.A0B(r4, r2)
            java.lang.String r1 = r3.A02
            java.lang.Object r0 = r3.A01
            X.JGo r5 = new X.JGo
            r5.<init>(r4, r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73943PmN.invoke(java.lang.Object):java.lang.Object");
    }
}
