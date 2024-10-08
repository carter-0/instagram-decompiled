package X;

public final class MMB extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMB(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MMB A00(Object obj, int i) {
        return new MMB(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.KMS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.KMT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: X.KMU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: X.KMS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: X.KMS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: X.KMS} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0258, code lost:
        r1 = "clipsCreationViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026c, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0273, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b5, code lost:
        r1 = "viewController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a7, code lost:
        return java.lang.Integer.valueOf((int) (((double) ((int) (((float) X.AnonymousClass7TG.A06(r2)) / X.JTS.A01(r2, X.LQO.A00)))) * 0.5d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03bd, code lost:
        return java.lang.Integer.valueOf((int) (((float) r0.A00) / X.JTS.A01(r2, X.LQO.A00)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ec, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
        r1 = "clipsTransformViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        r1 = "clipsAudioVolumeViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b8, code lost:
        r1 = "clipsTimelineEditorViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ff, code lost:
        r1 = "stackedTimelineViewModel";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x001c;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x000e;
                case 5: goto L_0x0037;
                case 6: goto L_0x0007;
                case 7: goto L_0x003e;
                case 8: goto L_0x0047;
                case 9: goto L_0x007d;
                case 10: goto L_0x0094;
                case 11: goto L_0x00aa;
                case 12: goto L_0x00b2;
                case 13: goto L_0x010c;
                case 14: goto L_0x0139;
                case 15: goto L_0x015b;
                case 16: goto L_0x00ba;
                case 17: goto L_0x016f;
                case 18: goto L_0x01bc;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01ea;
                case 21: goto L_0x01ea;
                case 22: goto L_0x0202;
                case 23: goto L_0x025b;
                case 24: goto L_0x0030;
                case 25: goto L_0x0219;
                case 26: goto L_0x0030;
                case 27: goto L_0x000e;
                case 28: goto L_0x0037;
                case 29: goto L_0x0007;
                case 30: goto L_0x000e;
                case 31: goto L_0x0037;
                case 32: goto L_0x0007;
                case 33: goto L_0x0220;
                case 34: goto L_0x0247;
                case 35: goto L_0x02e0;
                case 36: goto L_0x02f0;
                case 37: goto L_0x02f9;
                case 38: goto L_0x032e;
                case 39: goto L_0x0345;
                case 40: goto L_0x034c;
                case 41: goto L_0x0353;
                case 42: goto L_0x038b;
                case 43: goto L_0x03a8;
                case 44: goto L_0x03be;
                case 45: goto L_0x03ca;
                case 46: goto L_0x000e;
                case 47: goto L_0x0037;
                case 48: goto L_0x0007;
                case 49: goto L_0x03dc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x000e:
            java.lang.Object r4 = r1.A01
            return r4
        L_0x0011:
            java.lang.Object r1 = r1.A01
            X.K6M r1 = (X.K6M) r1
            X.0eM r0 = r1.A06
            X.8IG r4 = X.JTU.A0M(r1, r0)
            return r4
        L_0x001c:
            java.lang.Object r2 = r1.A01
            X.K6M r2 = (X.K6M) r2
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.82v r4 = new X.82v
            r4.<init>(r1, r0)
            return r4
        L_0x0030:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0037:
            java.lang.Object r0 = r1.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x003e:
            java.lang.Object r0 = r1.A01
            X.KMU r0 = (X.KMU) r0
            X.KMU.A01(r0)
            goto L_0x03ea
        L_0x0047:
            java.lang.Object r5 = r1.A01
            X.KMU r5 = (X.KMU) r5
            X.JlQ r4 = r5.A0D
            X.KMt r6 = r5.A0H
            X.LTY r0 = r6.A01
            int r3 = X.JTS.A03(r0)
            X.LRe r0 = r5.A0B
            java.lang.Integer[] r2 = r0.A02
            r0 = 0
            int r1 = X.JTO.A0A(r2, r0)
            r0 = 1
            int r0 = X.JTO.A0A(r2, r0)
            r4.A01(r3, r1, r0)
            int r7 = r5.A05
            r0 = 0
            int r8 = X.JTO.A0A(r2, r0)
            r10 = 1
            int r9 = X.JTO.A0A(r2, r10)
            r11 = r10
            r12 = r10
            boolean r0 = r6.A0U(r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007d:
            java.lang.Object r3 = r1.A01
            X.KMU r3 = (X.KMU) r3
            X.LRe r0 = r3.A0B
            java.lang.Integer[] r2 = r0.A02
            r0 = 0
            int r1 = X.JTO.A0A(r2, r0)
            r0 = 1
            int r0 = X.JTO.A0A(r2, r0)
            X.KMU.A04(r3, r1, r0)
            goto L_0x03ea
        L_0x0094:
            java.lang.Object r0 = r1.A01
            X.KMU r0 = (X.KMU) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A08
            r1 = 1
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.A1E()
            if (r0 != r1) goto L_0x00a8
        L_0x00a3:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L_0x00a8:
            r1 = 0
            goto L_0x00a3
        L_0x00aa:
            java.lang.Object r0 = r1.A01
            X.KMU r0 = (X.KMU) r0
            android.content.Context r2 = r0.A06
            goto L_0x0391
        L_0x00b2:
            java.lang.Object r0 = r1.A01
            X.KMU r0 = (X.KMU) r0
            android.content.Context r2 = r0.A06
            goto L_0x03ae
        L_0x00ba:
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            android.app.Application r5 = X.DbY.A05(r1)
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.Jfo r14 = r1.A0h
            if (r14 == 0) goto L_0x01ff
            X.8RF r12 = r1.A0d
            if (r12 == 0) goto L_0x01b8
            X.8Lv r10 = r1.A0Y
            if (r10 != 0) goto L_0x00d8
            java.lang.String r1 = "clipsColorFilterViewModel"
            goto L_0x026c
        L_0x00d8:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r1.A0Z
            if (r11 == 0) goto L_0x0258
            X.89w r0 = r1.A0l
            if (r0 != 0) goto L_0x00e4
            java.lang.String r1 = "bitmapTimelineViewModel"
            goto L_0x026c
        L_0x00e4:
            X.85x r9 = r1.A0X
            if (r9 == 0) goto L_0x0157
            X.KMu r15 = r1.A0i
            if (r15 != 0) goto L_0x00f0
            java.lang.String r1 = "timedElementsViewModel"
            goto L_0x026c
        L_0x00f0:
            X.8M1 r13 = r1.A0e
            if (r13 == 0) goto L_0x0135
            X.8II r7 = r1.A0A
            if (r7 != 0) goto L_0x00fc
            java.lang.String r1 = "audioFilterViewModel"
            goto L_0x026c
        L_0x00fc:
            X.Jff r8 = r1.A0W
            if (r8 != 0) goto L_0x0104
            java.lang.String r1 = "clipsAudioVoiceEffectsViewModel"
            goto L_0x026c
        L_0x0104:
            X.KEf r4 = new X.KEf
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r4
        L_0x010c:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.KiB r0 = X.C62578KiB.PEEK
            java.util.List r7 = X.AnonymousClass7TE.A1I(r0)
            X.8M1 r1 = r2.A0e
            if (r1 == 0) goto L_0x0135
            r0 = 66
            X.MIW r8 = new X.MIW
            r8.<init>(r1, r0)
            r0 = 14
            X.MP5 r9 = X.MP5.A00(r2, r0)
            X.Kg7 r6 = X.C62457Kg7.LIST
            X.Lms r4 = new X.Lms
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0135:
            java.lang.String r1 = "clipsTransformViewModel"
            goto L_0x026c
        L_0x0139:
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 == 0) goto L_0x0258
            java.lang.String r1 = r0.A0S
            X.85x r0 = r4.A0X
            if (r0 == 0) goto L_0x0157
            X.KDr r4 = new X.KDr
            r4.<init>(r2, r3, r0, r1)
            return r4
        L_0x0157:
            java.lang.String r1 = "clipsAudioVolumeViewModel"
            goto L_0x026c
        L_0x015b:
            java.lang.Object r2 = r1.A01
            X.K5U r2 = (X.K5U) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.8IG r4 = new X.8IG
            r4.<init>(r1, r0)
            return r4
        L_0x016f:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r2.A0F
            if (r1 == 0) goto L_0x02b5
            X.MXL r0 = r1.A0B
            r0.ATc()
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0O()
            X.LTA.A02(r0)
            r0 = 1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0I(r2, r0)
            X.8RF r0 = r2.A0d
            if (r0 == 0) goto L_0x01b8
            X.JTR.A1M(r0)
            X.861 r0 = r2.A0j
            if (r0 != 0) goto L_0x0196
            java.lang.String r1 = "videoPlaybackViewModel"
            goto L_0x026c
        L_0x0196:
            X.863 r0 = X.JTP.A0Z(r0)
            if (r0 == 0) goto L_0x01a3
            int r0 = r0.CEG()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0D(r2, r0)
        L_0x01a3:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r0 = r2.A0G
            if (r0 != 0) goto L_0x01ab
            java.lang.String r1 = "actionBarViewController"
            goto L_0x026c
        L_0x01ab:
            X.L3z r1 = r0.A00
            if (r1 != 0) goto L_0x01b3
            java.lang.String r1 = "buttonDebouncer"
            goto L_0x026c
        L_0x01b3:
            r0 = 0
            r1.A01 = r0
            goto L_0x03ea
        L_0x01b8:
            java.lang.String r1 = "clipsTimelineEditorViewModel"
            goto L_0x026c
        L_0x01bc:
            java.lang.Object r0 = r1.A01
            X.K5U r0 = (X.K5U) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318161850734546(0x81072d000217d2, double:3.031090023679585E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x01d2:
            java.lang.Object r0 = r1.A01
            X.K5U r0 = (X.K5U) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36322169055094764(0x810ad2000027ec, double:3.0336241958527035E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x01ea:
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            boolean r0 = r1.A0t
            if (r0 == 0) goto L_0x01fd
            X.Jfo r0 = r1.A0h
            if (r0 == 0) goto L_0x01ff
            int r0 = r0.A03
        L_0x01f8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x01fd:
            r0 = 0
            goto L_0x01f8
        L_0x01ff:
            java.lang.String r1 = "stackedTimelineViewModel"
            goto L_0x026c
        L_0x0202:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.KMS r3 = r0.A0E
            if (r3 != 0) goto L_0x020d
            java.lang.String r1 = "videoTrackViewController"
            goto L_0x026c
        L_0x020d:
            r2 = 1
            X.8Qm r1 = r3.A09
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0A
            r1.A0A(r0)
            r3.A03 = r2
            goto L_0x03ea
        L_0x0219:
            java.lang.Object r0 = r1.A01
            X.2YM r4 = X.JTR.A0b(r0)
            return r4
        L_0x0220:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.Lmv r0 = r2.A08
            if (r0 == 0) goto L_0x022b
            r0.A01()
        L_0x022b:
            X.Lmv r0 = r2.A08
            if (r0 == 0) goto L_0x023a
            X.0hq r1 = r0.A07
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0x(r0)
        L_0x023a:
            X.0eM r0 = r2.A15
            java.lang.Object r0 = r0.getValue()
            X.Jfl r0 = (X.C60105Jfl) r0
            r0.A0E()
            goto L_0x03ea
        L_0x0247:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A0Z
            if (r0 == 0) goto L_0x0258
            int r0 = X.JTO.A07(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0258:
            java.lang.String r1 = "clipsCreationViewModel"
            goto L_0x026c
        L_0x025b:
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r4.A0F
            if (r0 == 0) goto L_0x02b5
            r0.A0E()
            X.LRi r2 = r4.A0B
            if (r2 != 0) goto L_0x0274
            java.lang.String r1 = "audioElementTracksManager"
        L_0x026c:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0274:
            java.util.Iterator r1 = X.C64166LRi.A01(r2)
        L_0x0278:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0286
            X.LPJ r0 = X.JTO.A0e(r1)
            r0.A0E()
            goto L_0x0278
        L_0x0286:
            java.util.Iterator r1 = X.C64166LRi.A00(r2)
        L_0x028a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0298
            X.LPJ r0 = X.JTO.A0e(r1)
            r0.A0E()
            goto L_0x028a
        L_0x0298:
            X.KMS r0 = r4.A0E
            java.lang.String r1 = "videoTrackViewController"
            if (r0 == 0) goto L_0x026c
            r0.A0E()
            X.KMS r3 = r4.A0E
            if (r3 == 0) goto L_0x026c
            r2 = 0
            X.8Qm r1 = r3.A09
            r0 = 0
            r1.A0A(r0)
            r3.A03 = r2
            X.LGg r2 = r4.A0D
            if (r2 != 0) goto L_0x02b8
            java.lang.String r1 = "timedElementTracksManager"
            goto L_0x026c
        L_0x02b5:
            java.lang.String r1 = "viewController"
            goto L_0x026c
        L_0x02b8:
            java.util.ArrayList r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x02be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02cc
            X.LPJ r0 = X.JTO.A0e(r1)
            r0.A0E()
            goto L_0x02be
        L_0x02cc:
            java.util.ArrayList r0 = r2.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x02d2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ea
            X.LPJ r0 = X.JTO.A0e(r1)
            r0.A0E()
            goto L_0x02d2
        L_0x02e0:
            java.lang.Object r0 = r1.A01
            X.JlR r0 = (X.C60434JlR) r0
            android.content.Context r0 = r0.A0B
            android.os.Looper r0 = r0.getMainLooper()
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r0)
            return r4
        L_0x02f0:
            java.lang.Object r0 = r1.A01
            X.KMT r0 = (X.KMT) r0
            X.KMT.A00(r0)
            goto L_0x03ea
        L_0x02f9:
            java.lang.Object r5 = r1.A01
            X.KMT r5 = (X.KMT) r5
            X.JlR r4 = r5.A0C
            X.KMu r6 = r5.A0J
            X.LTY r0 = r6.A01
            int r3 = X.JTS.A03(r0)
            X.LRe r0 = r5.A0B
            java.lang.Integer[] r2 = r0.A02
            r0 = 0
            int r1 = X.JTO.A0A(r2, r0)
            r0 = 1
            int r0 = X.JTO.A0A(r2, r0)
            r4.A01(r3, r1, r0)
            int r7 = r5.A01
            r0 = 0
            int r8 = X.JTO.A0A(r2, r0)
            r10 = 1
            int r9 = X.JTO.A0A(r2, r10)
            r11 = r10
            boolean r0 = r6.A0Y(r7, r8, r9, r10, r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x032e:
            java.lang.Object r3 = r1.A01
            X.KMT r3 = (X.KMT) r3
            X.LRe r0 = r3.A0B
            java.lang.Integer[] r2 = r0.A02
            r0 = 0
            int r1 = X.JTO.A0A(r2, r0)
            r0 = 1
            int r0 = X.JTO.A0A(r2, r0)
            X.KMT.A03(r3, r1, r0)
            goto L_0x03ea
        L_0x0345:
            java.lang.Object r0 = r1.A01
            X.KMT r0 = (X.KMT) r0
            android.content.Context r2 = r0.A07
            goto L_0x0391
        L_0x034c:
            java.lang.Object r0 = r1.A01
            X.KMT r0 = (X.KMT) r0
            android.content.Context r2 = r0.A07
            goto L_0x03ae
        L_0x0353:
            java.lang.Object r0 = r1.A01
            X.KMS r0 = (X.KMS) r0
            X.Jfo r4 = r0.A0K
            android.content.Context r3 = r0.A07
            int r2 = r0.A00
            r1 = 0
            boolean r0 = r4.A0a()
            if (r0 != 0) goto L_0x03ea
            X.8RF r0 = r4.A0F
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RU
            if (r0 != 0) goto L_0x03ea
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0375
            r4.A0A = r1
            goto L_0x03ea
        L_0x0375:
            float r1 = (float) r2
            float r0 = X.LQO.A00
            float r0 = X.JTS.A01(r3, r0)
            float r1 = r1 / r0
            int r1 = (int) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0E
            int r0 = X.JTO.A07(r0)
            if (r1 <= r0) goto L_0x0387
            r1 = r0
        L_0x0387:
            r4.A0N(r1)
            goto L_0x03ea
        L_0x038b:
            java.lang.Object r0 = r1.A01
            X.KMS r0 = (X.KMS) r0
            android.content.Context r2 = r0.A07
        L_0x0391:
            int r0 = X.AnonymousClass7TG.A06(r2)
            float r1 = (float) r0
            float r0 = X.LQO.A00
            float r0 = X.JTS.A01(r2, r0)
            float r1 = r1 / r0
            int r0 = (int) r1
            double r2 = (double) r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r0
            int r0 = (int) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x03a8:
            java.lang.Object r0 = r1.A01
            X.KMS r0 = (X.KMS) r0
            android.content.Context r2 = r0.A07
        L_0x03ae:
            int r0 = r0.A00
            float r1 = (float) r0
            float r0 = X.LQO.A00
            float r0 = X.JTS.A01(r2, r0)
            float r1 = r1 / r0
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x03be:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController) r0
            X.MXL r1 = r0.A0B
            int r0 = r0.A00
            r1.Dsw(r0)
            goto L_0x03ea
        L_0x03ca:
            java.lang.Object r2 = r1.A01
            X.Lms r2 = (X.C65072Lms) r2
            com.instagram.common.session.UserSession r1 = r2.A02
            X.Kg7 r0 = r2.A03
            X.Jl7 r4 = new X.Jl7
            r4.<init>(r1, r0)
            X.0sP r0 = r2.A05
            r4.A01 = r0
            return r4
        L_0x03dc:
            java.lang.Object r0 = r1.A01
            X.Lgk r0 = (X.C64711Lgk) r0
            X.Jkr r1 = r0.A0M
            X.KM0 r1 = (X.KM0) r1
            if (r1 == 0) goto L_0x03ea
            r0 = 0
            r1.A06(r0)
        L_0x03ea:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMB.invoke():java.lang.Object");
    }
}
