package X;

import android.view.View;

public final class LXJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public LXJ(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c5, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03cc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d6, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006a, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x0370;
                case 2: goto L_0x0132;
                case 3: goto L_0x006e;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -669845775(0xffffffffd812f6f1, float:-6.4635721E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.KSr r5 = (X.C61942KSr) r5
            boolean r11 = r4.A02
            X.FEk r2 = X.C49912FEk.A01
            X.0eM r3 = r5.A0W
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            boolean r4 = r2.A01(r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.27r r12 = X.27p.A01(r1)
            X.JVj r13 = X.C59725JVj.WASLIVE_SHARE_SHEET
            java.lang.String r14 = "ig_video_sharing_settings"
            boolean r2 = r5.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            boolean r17 = X.C367288qV.A06(r1)
            java.lang.String r15 = "SHARE_TO_FACEBOOK"
            r16 = r2
            r12.A1V(r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.27r r1 = X.27p.A01(r1)
            X.Kka r2 = X.C62674Kka.A0I
            X.29Z r1 = r1.A0F
            r1.A0U(r2, r13, r14)
            android.content.Context r5 = r5.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r7 = X.C51967G9n.A0l(r4)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r10 = 0
            r12 = 0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r9 = X.AnonymousClass8PU.A00(r1)
            X.LPW.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 1250181922(0x4a844322, float:4333969.0)
        L_0x006a:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x006e:
            r0 = 1367121544(0x517c9e88, float:6.7811967E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A01
            X.K6N r1 = (X.K6N) r1
            X.0eM r6 = r1.A01
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r3 = X.JTT.A0p(r6)
            r12 = 0
            X.KkI r2 = X.C62656KkI.HOW_IT_WORKS
            X.KkO r1 = X.C62662KkO.A03
            X.LT4.A03(r1, r12, r2, r5, r3)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            boolean r1 = r4.A02
            r13 = 0
            X.0qQ.A0B(r3, r13)
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.LfZ r2 = new X.LfZ
            r2.<init>(r4)
            r5.A00(r2)
            X.2IV r7 = new X.2IV
            r7.<init>()
            r11 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)
            java.lang.String r2 = "copy_profile_pic"
            r7.A08(r2, r8)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "is_private"
            r7.A08(r2, r4)
            X.0sn r5 = X.0sn.A00
            r2 = 523(0x20b, float:7.33E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r7.A05(r2, r5)
            X.2IV r4 = new X.2IV
            r4.<init>()
            java.lang.String r2 = "follow_ids"
            r4.A05(r2, r5)
            java.lang.String r2 = "is_follow_list"
            r4.A08(r2, r8)
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r2 = "has_skipped_follower_import_screen"
            r6.A08(r2, r8)
            java.lang.String r2 = "profile_info"
            r6.A06(r7, r2)
            java.lang.String r2 = "follower_info"
            r6.A06(r4, r2)
            r2 = 325(0x145, float:4.55E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r6.A05(r2, r5)
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r2 = "data"
            X.1vR r6 = X.JTP.A0L(r6, r5, r2)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.BeJ> r10 = X.C42538BeJ.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "OnboardToTextPostAppFromInstagram"
            java.lang.String r15 = "xdt_set_text_post_app_onboarding"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r4 = "X-IG-App-ID"
            java.lang.String r2 = "871865944585275"
            r5.addAdditionalHttpHeader(r4, r2)
            X.1vn r4 = X.1vm.A01(r3)
            X.IHz r2 = new X.IHz
            r2.<init>(r13, r3, r1)
            r1 = 12
            X.C64394LbB.A00(r2, r5, r4, r3, r1)
            r1 = 623515303(0x252a16a7, float:1.4752824E-16)
            goto L_0x006a
        L_0x0132:
            r0 = -978089681(0xffffffffc5b3892f, float:-5745.148)
            int r0 = X.AnonymousClass0fD.A05(r0)
            boolean r1 = r19.isActivated()
            if (r1 != 0) goto L_0x0159
            X.LRJ r5 = X.LRJ.A02
            java.lang.Object r1 = r4.A01
            android.content.Context r3 = X.DbT.A08(r1)
            boolean r2 = r4.A02
            r1 = 2131955921(0x7f1310d1, float:1.9548383E38)
            if (r2 == 0) goto L_0x0151
            r1 = 2131955910(0x7f1310c6, float:1.954836E38)
        L_0x0151:
            r5.A01(r3, r1)
        L_0x0154:
            r1 = 413357683(0x18a35673, float:4.2221804E-24)
            goto L_0x006a
        L_0x0159:
            java.lang.Object r6 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r6
            X.8RF r1 = r6.A0d
            r5 = 0
            if (r1 != 0) goto L_0x0166
            java.lang.String r7 = "clipsTimelineEditorViewModel"
            goto L_0x03c5
        L_0x0166:
            X.8RH r4 = r1.A0E()
            boolean r1 = r4 instanceof X.C355748Rf
            if (r1 == 0) goto L_0x018a
            X.8Rf r4 = (X.C355748Rf) r4
            if (r4 == 0) goto L_0x018a
            X.KMt r3 = r6.A0f
            if (r3 != 0) goto L_0x017a
            java.lang.String r7 = "stackedTimelineAudioTrackViewModel"
            goto L_0x03c5
        L_0x017a:
            int r2 = r4.A01
            int r1 = r4.A00
            X.Jyn r1 = r3.A0M(r2, r1)
            if (r1 == 0) goto L_0x018a
            X.Jut r1 = r1.A08
            if (r1 == 0) goto L_0x018a
            java.lang.String r5 = r1.A08
        L_0x018a:
            X.8RL r4 = r6.A0c
            if (r4 != 0) goto L_0x0192
            java.lang.String r7 = "clipsTimelineButtonEventProvider"
            goto L_0x03c5
        L_0x0192:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r6.A0Z
            java.lang.String r7 = "clipsCreationViewModel"
            if (r1 == 0) goto L_0x03c5
            r2 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            int r3 = r1.A02(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r6.A0Z
            if (r1 == 0) goto L_0x03c5
            boolean r2 = r1.A0m()
            X.9cs r1 = new X.9cs
            r1.<init>(r5, r3, r2)
            r4.A0F(r1)
            goto L_0x0154
        L_0x01b0:
            r0 = 1090167124(0x40faa154, float:7.8321934)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.8RF r1 = r2.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            r9 = 0
            if (r1 == 0) goto L_0x0207
            X.8RH r6 = r1.A0E()
            boolean r1 = r6 instanceof X.C355748Rf
            r14 = 1
            java.lang.String r7 = "clipsCreationViewModel"
            if (r1 == 0) goto L_0x024a
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x020c
            X.LRJ r4 = X.LRJ.A02
            android.content.Context r3 = r2.requireContext()
            r1 = 2131955910(0x7f1310c6, float:1.954836E38)
            r4.A01(r3, r1)
        L_0x01dd:
            X.27r r6 = X.JTQ.A0I(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0Z
            if (r1 == 0) goto L_0x03c5
            r3 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            int r5 = r1.A02(r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0Z
            if (r1 == 0) goto L_0x03c5
            boolean r4 = r1.A0m()
            X.4yP r1 = r6.A0J()
            if (r1 == 0) goto L_0x0201
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            java.lang.String r1 = "TIMELINE_AUDIO_DELETE_TAP"
            X.27r.A06(r3, r6, r1, r5, r4)
        L_0x0201:
            X.8RL r2 = r2.A0c
            if (r2 != 0) goto L_0x0362
            java.lang.String r8 = "clipsTimelineButtonEventProvider"
        L_0x0207:
            X.0qQ.A0F(r8)
            goto L_0x03c8
        L_0x020c:
            X.KMt r4 = r2.A0f
            java.lang.String r5 = "stackedTimelineAudioTrackViewModel"
            if (r4 == 0) goto L_0x036c
            X.8Rf r6 = (X.C355748Rf) r6
            int r3 = r6.A01
            int r1 = r6.A00
            X.Jyn r4 = r4.A0M(r3, r1)
            if (r4 == 0) goto L_0x0225
            X.KMt r1 = r2.A0f
            if (r1 == 0) goto L_0x036c
            r1.A0K(r4)
        L_0x0225:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r2.A0Z
            if (r3 == 0) goto L_0x03c5
            if (r4 == 0) goto L_0x0231
            X.Jut r1 = r4.A08
            if (r1 == 0) goto L_0x0231
            java.lang.String r9 = r1.A08
        L_0x0231:
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r3.A0K
            com.instagram.music.common.model.AudioOverlayTrack r3 = r1.A03(r9)
            X.0eM r1 = r2.A14
            java.lang.Object r1 = r1.getValue()
            X.89Z r1 = (X.AnonymousClass89Z) r1
            r1.A04(r3)
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x0207
            X.JTR.A1M(r1)
            goto L_0x01dd
        L_0x024a:
            boolean r1 = r6 instanceof X.C355758Rg
            if (r1 == 0) goto L_0x02c7
            X.KMt r1 = r2.A0g
            java.lang.String r3 = "stackedTimelineVoiceoverViewModel"
            if (r1 == 0) goto L_0x04d6
            X.LTY r1 = r1.A01
            X.Jyn r4 = r1.A0F()
            if (r4 == 0) goto L_0x02be
            X.KMt r1 = r2.A0g
            if (r1 == 0) goto L_0x04d6
            r1.A0K(r4)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r2.A0Z
            if (r3 == 0) goto L_0x03c5
            java.lang.String r1 = r4.A0B
            r3.A0h(r1)
            X.27r r3 = X.JTQ.A0I(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0Z
            if (r1 == 0) goto L_0x03c5
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.05G r1 = r1.A0S
            java.lang.Object r1 = r1.getValue()
            int r6 = X.DbS.A05(r1)
            X.29R r3 = r3.A09
            X.1Ln r5 = X.JTO.A0N(r3)
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x02be
            java.lang.String r1 = "IG_CAMERA_CLIPS_VOICEOVER_DELETE_SEGMENT_TAP"
            r5.A0t(r1)
            java.lang.String r1 = "CLIPS_VOICEOVER_DELETE_SEGMENT_TAP"
            r5.A0r(r1)
            X.29R.A00(r5, r3)
            X.JTQ.A18(r5, r3)
            X.283 r4 = r3.A04
            int r1 = X.JTR.A0C(r4)
            r5.A0V(r1)
            java.lang.Long r3 = X.C51971G9r.A0m()
            java.lang.String r1 = "capture_format_index"
            r5.A0Q(r1, r3)
            X.JTQ.A1B(r5, r4)
            X.JTU.A14(r5, r6)
            java.lang.String r3 = r4.A0O
            java.lang.String r1 = "discovery_session_id"
            r5.A0R(r1, r3)
            X.JTS.A1E(r5)
        L_0x02be:
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x0207
            X.JTR.A1M(r1)
            goto L_0x0201
        L_0x02c7:
            boolean r1 = r6 instanceof X.AnonymousClass8Rc
            java.lang.String r7 = "timedElementsViewModel"
            if (r1 == 0) goto L_0x02fe
            X.KMu r1 = r2.A0i
            if (r1 == 0) goto L_0x03c5
            X.LTY r1 = r1.A01
            X.Jyn r1 = r1.A0F()
            if (r1 == 0) goto L_0x0201
            X.JwI r1 = r1.A06
            if (r1 == 0) goto L_0x0201
            java.lang.Object r1 = r1.A00
            X.5MI r1 = (X.AnonymousClass5MI) r1
            if (r1 == 0) goto L_0x0201
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0G(r2, r1)
            X.27r r8 = X.JTQ.A0I(r2)
            java.lang.String r12 = r1.getId()
            X.9tN r11 = X.C391619tN.A0C
            X.JVj r10 = X.C59725JVj.POST_CAPTURE
            r15 = 0
            r1 = 899(0x383, float:1.26E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r1)
            r8.A12(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0201
        L_0x02fe:
            boolean r1 = r6 instanceof X.C355778Ri
            if (r1 == 0) goto L_0x0338
            X.KMu r1 = r2.A0i
            if (r1 == 0) goto L_0x03c5
            X.Jym r1 = r1.A0M()
            if (r1 == 0) goto L_0x0201
            X.4ds r1 = r1.A00
            if (r1 == 0) goto L_0x0201
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0G(r2, r1)
            X.50v r1 = r1.BzV()
            if (r1 == 0) goto L_0x0201
            X.4nO r1 = r1.BkW()
            if (r1 == 0) goto L_0x0201
            X.27r r3 = X.JTQ.A0I(r2)
            java.lang.String r7 = r1.A00()
            X.JVj r5 = X.C59725JVj.POST_CAPTURE
            r10 = 0
            r1 = 899(0x383, float:1.26E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r1)
            r4 = r9
            r6 = r9
            r9 = r14
            r3.A12(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0201
        L_0x0338:
            boolean r1 = r6 instanceof X.C355868Rr
            if (r1 == 0) goto L_0x0201
            boolean r1 = r6 instanceof X.AnonymousClass8RS
            if (r1 == 0) goto L_0x0358
            X.8RS r6 = (X.AnonymousClass8RS) r6
            int r1 = r6.getSegmentIndex()
        L_0x0346:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0201
            int r3 = r1.intValue()
            X.KMS r1 = r2.A0E
            if (r1 != 0) goto L_0x035d
            java.lang.String r8 = "videoTrackViewController"
            goto L_0x0207
        L_0x0358:
            X.8Rr r6 = (X.C355868Rr) r6
            int r1 = r6.A00
            goto L_0x0346
        L_0x035d:
            r1.A0O(r3)
            goto L_0x0201
        L_0x0362:
            X.Ln5 r1 = X.C65085Ln5.A00
            r2.A0F(r1)
            r1 = -2095553237(0xffffffff8318652b, float:-4.478492E-37)
            goto L_0x006a
        L_0x036c:
            X.0qQ.A0F(r5)
            goto L_0x03c8
        L_0x0370:
            r0 = 1906018086(0x719b8726, float:1.540274E30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r19.isActivated()
            if (r0 != 0) goto L_0x0399
            X.LRJ r3 = X.LRJ.A02
            java.lang.Object r0 = r4.A01
            android.content.Context r2 = X.DbT.A08(r0)
            boolean r1 = r4.A02
            r0 = 2131955908(0x7f1310c4, float:1.9548357E38)
            if (r1 == 0) goto L_0x038f
            r0 = 2131955910(0x7f1310c6, float:1.954836E38)
        L_0x038f:
            r3.A01(r2, r0)
        L_0x0392:
            r0 = 977191652(0x3a3ec2e4, float:7.276966E-4)
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0399:
            java.lang.Object r6 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r6
            X.8RF r0 = r6.A0d
            java.lang.String r3 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x04d6
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355748Rf
            if (r0 == 0) goto L_0x0392
            X.8Rf r1 = (X.C355748Rf) r1
            if (r1 == 0) goto L_0x0392
            int r2 = r1.A00
            int r7 = r1.A01
            X.8RF r1 = r6.A0d
            if (r1 == 0) goto L_0x04d6
            X.8RY r0 = new X.8RY
            r0.<init>(r2, r7)
            r1.A0G(r0)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r8 = r6.A0F
            if (r8 != 0) goto L_0x03cd
            java.lang.String r7 = "viewController"
        L_0x03c5:
            X.0qQ.A0F(r7)
        L_0x03c8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03cd:
            boolean r0 = r6.A0q
            if (r0 == 0) goto L_0x03d8
            X.KMu r0 = r6.A0i
            if (r0 != 0) goto L_0x03da
            java.lang.String r7 = "timedElementsViewModel"
            goto L_0x03c5
        L_0x03d8:
            r4 = 0
            goto L_0x03e2
        L_0x03da:
            X.LTY r0 = r0.A01
            X.05G r0 = r0.A08
            int r4 = X.JTR.A0J(r0)
        L_0x03e2:
            int r4 = r4 + r7
            r3 = 0
            r8.A03 = r3
            X.4DH r2 = r8.A09
            android.content.Context r1 = r2.requireContext()
            r0 = 2130971216(0x7f040a50, float:1.7551164E38)
            java.lang.Integer r0 = X.2Yu.A0J(r1, r0)
            if (r0 == 0) goto L_0x040e
            int r1 = r0.intValue()
        L_0x03f9:
            int r0 = r4 + -1
            int r0 = r0 * r1
            int r1 = java.lang.Math.max(r3, r0)
            androidx.core.widget.NestedScrollView r0 = r8.nestedScrollView
            if (r0 == 0) goto L_0x0407
            r0.scrollTo(r3, r1)
        L_0x0407:
            X.LRi r4 = r6.A0B
            if (r4 != 0) goto L_0x0417
            java.lang.String r7 = "audioElementTracksManager"
            goto L_0x03c5
        L_0x040e:
            android.content.res.Resources r0 = X.DbV.A05(r2)
            int r1 = X.JTP.A05(r0)
            goto L_0x03f9
        L_0x0417:
            java.util.Iterator r11 = X.C64166LRi.A01(r4)
            r1 = 0
        L_0x041c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0476
            java.lang.Object r9 = r11.next()
            int r10 = r1 + 1
            if (r1 >= 0) goto L_0x042e
            X.0sr.A1T()
            goto L_0x03c8
        L_0x042e:
            X.KMU r9 = (X.KMU) r9
            if (r1 != r7) goto L_0x046a
            X.LEG r8 = r9.A0E
            monitor-enter(r8)
            X.KMU r0 = r8.A07     // Catch:{ all -> 0x04db }
            X.KMt r0 = r0.A0H     // Catch:{ all -> 0x04db }
            X.LTY r2 = r0.A01     // Catch:{ all -> 0x04db }
            X.Jyn r1 = r2.A0F()     // Catch:{ all -> 0x04db }
            r0 = 0
            if (r1 == 0) goto L_0x044b
            X.Jut r1 = r1.A08     // Catch:{ all -> 0x04db }
            if (r1 == 0) goto L_0x044b
            int r0 = r1.A04     // Catch:{ all -> 0x04db }
            if (r0 >= r3) goto L_0x044b
            r0 = 0
        L_0x044b:
            r8.A01 = r0     // Catch:{ all -> 0x04db }
            X.Jyn r0 = r2.A0F()     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x045c
            X.Jut r0 = r0.A08     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x045c
            float r0 = r0.A01     // Catch:{ all -> 0x04db }
        L_0x0459:
            r8.A00 = r0     // Catch:{ all -> 0x04db }
            goto L_0x045f
        L_0x045c:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0459
        L_0x045f:
            monitor-exit(r8)
            androidx.recyclerview.widget.RecyclerView r1 = r9.A08
            if (r1 == 0) goto L_0x0474
            X.Jm5 r0 = r8.A05
            r1.A15(r0)
            goto L_0x0474
        L_0x046a:
            com.instagram.common.ui.base.IgFrameLayout r1 = r9.A0A
            if (r1 == 0) goto L_0x0474
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r1.setAlpha(r0)
        L_0x0474:
            r1 = r10
            goto L_0x041c
        L_0x0476:
            java.util.Iterator r2 = X.C64166LRi.A00(r4)
        L_0x047a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x048f
            X.KMU r0 = X.JTO.A0d(r2)
            com.instagram.common.ui.base.IgFrameLayout r1 = r0.A0A
            if (r1 == 0) goto L_0x047a
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r1.setAlpha(r0)
            goto L_0x047a
        L_0x048f:
            X.KMS r0 = r6.A0E
            if (r0 != 0) goto L_0x0497
            java.lang.String r7 = "videoTrackViewController"
            goto L_0x03c5
        L_0x0497:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0A
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0.setAlpha(r1)
            X.LGg r0 = r6.A0D
            if (r0 != 0) goto L_0x04a7
            java.lang.String r7 = "timedElementTracksManager"
            goto L_0x03c5
        L_0x04a7:
            r0.A02(r1)
            X.Kh8 r0 = X.C62517Kh8.AUDIO_TRACK
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0F(r6, r0)
            X.27r r4 = X.JTQ.A0I(r6)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            java.lang.String r7 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x03c5
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            int r3 = r0.A02(r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            if (r0 == 0) goto L_0x03c5
            boolean r2 = r0.A0m()
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x0392
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "TIMELINE_AUDIO_ADJUST_TAP"
            X.27r.A06(r1, r4, r0, r3, r2)
            goto L_0x0392
        L_0x04d6:
            X.0qQ.A0F(r3)
            goto L_0x03c8
        L_0x04db:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LXJ.onClick(android.view.View):void");
    }
}
