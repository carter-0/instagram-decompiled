package X;

/* renamed from: X.MMm  reason: case insensitive filesystem */
public final class C66303MMm extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66303MMm(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C66303MMm(obj, i));
    }

    public static C66303MMm A01(Object obj, int i) {
        return new C66303MMm(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03bd, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r6 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0231, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0026;
                case 2: goto L_0x0032;
                case 3: goto L_0x004e;
                case 4: goto L_0x0060;
                case 5: goto L_0x0070;
                case 6: goto L_0x0082;
                case 7: goto L_0x009f;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00c3;
                case 10: goto L_0x00cf;
                case 11: goto L_0x00f6;
                case 12: goto L_0x0112;
                case 13: goto L_0x0005;
                case 14: goto L_0x012f;
                case 15: goto L_0x0005;
                case 16: goto L_0x012f;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x012f;
                case 27: goto L_0x0005;
                case 28: goto L_0x012f;
                case 29: goto L_0x0136;
                case 30: goto L_0x0142;
                case 31: goto L_0x014e;
                case 32: goto L_0x0191;
                case 33: goto L_0x01a1;
                case 34: goto L_0x02b1;
                case 35: goto L_0x02ba;
                case 36: goto L_0x02cb;
                case 37: goto L_0x02d4;
                case 38: goto L_0x02ea;
                case 39: goto L_0x036a;
                case 40: goto L_0x0005;
                case 41: goto L_0x012f;
                case 42: goto L_0x0005;
                case 43: goto L_0x01c2;
                case 44: goto L_0x0013;
                case 45: goto L_0x0372;
                case 46: goto L_0x0005;
                case 47: goto L_0x037c;
                case 48: goto L_0x038e;
                case 49: goto L_0x03a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.07f r6 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r6
        L_0x000c:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            java.lang.String r6 = r0.A09
            goto L_0x0021
        L_0x0013:
            java.lang.Object r0 = r8.A01
            X.KNp r0 = (X.C61826KNp) r0
            X.KNs r0 = r0.A0D
            X.5kq r0 = X.C61829KNs.A01(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.String r6 = r0.A0d
        L_0x0021:
            if (r6 != 0) goto L_0x000b
        L_0x0023:
            java.lang.String r6 = ""
            return r6
        L_0x0026:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.KBj r6 = new X.KBj
            r6.<init>(r0)
            return r6
        L_0x0032:
            java.lang.Object r2 = r8.A01
            X.KNm r2 = (X.C61823KNm) r2
            X.0eM r0 = r2.A0R
            java.lang.Object r1 = r0.getValue()
            X.KgX r0 = X.C62482KgX.CAPTURE_SESSION
            if (r1 != r0) goto L_0x012d
            com.instagram.common.session.UserSession r1 = r2.A08
            X.4DH r0 = r2.A06
            android.content.Context r0 = r0.requireContext()
            X.LFG r6 = new X.LFG
            r6.<init>(r1, r0)
            return r6
        L_0x004e:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r1 = r0.A08
            X.4DH r0 = r0.A06
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.L4G r6 = new X.L4G
            r6.<init>(r1, r0)
            return r6
        L_0x0060:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            X.4DH r2 = r0.A06
            com.instagram.common.session.UserSession r1 = r0.A08
            X.0iw r0 = r0.A07
            X.Loe r6 = new X.Loe
            r6.<init>(r2, r0, r1)
            return r6
        L_0x0070:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r1 = r0.A08
            X.4DH r0 = r0.A06
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.LMT r6 = new X.LMT
            r6.<init>(r0, r1)
            return r6
        L_0x0082:
            java.lang.Object r3 = r8.A01
            X.KNm r3 = (X.C61823KNm) r3
            com.instagram.common.session.UserSession r2 = r3.A08
            X.27r r0 = X.27p.A01(r2)
            X.283 r0 = r0.A04
            X.28D r0 = r0.A09
            X.0qQ.A07(r0)
            X.JVg r1 = X.C63094KrN.A00(r0)
            X.0iw r0 = r3.A07
            X.LPH r6 = new X.LPH
            r6.<init>(r1, r0, r2)
            return r6
        L_0x009f:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r2 = r0.A08
            X.0iw r1 = r0.A07
            X.0eM r0 = r0.A0L
            java.lang.Object r0 = r0.getValue()
            X.LPH r0 = (X.LPH) r0
            X.Loc r6 = new X.Loc
            r6.<init>(r0, r1, r2)
            return r6
        L_0x00b5:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r1 = r0.A08
            boolean r0 = r0.A0b
            X.KCi r6 = new X.KCi
            r6.<init>(r1, r0)
            return r6
        L_0x00c3:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.KBY r6 = new X.KBY
            r6.<init>(r0)
            return r6
        L_0x00cf:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            android.os.Bundle r1 = r0.A05
            r0 = 212(0xd4, float:2.97E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00e4
            X.KgX r6 = X.C62482KgX.DIRECT_TO_SHARE
            return r6
        L_0x00e4:
            r0 = 2155(0x86b, float:3.02E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00f3
            X.KgX r6 = X.C62482KgX.DRAFT_FROM_POST_CAP
            return r6
        L_0x00f3:
            X.KgX r6 = X.C62482KgX.CAPTURE_SESSION
            return r6
        L_0x00f6:
            java.lang.Object r4 = r8.A01
            X.KNm r4 = (X.C61823KNm) r4
            X.4DH r0 = r4.A06
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r4.A08
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r4.A0F
            java.lang.String r0 = X.DbS.A0t(r0)
            X.JfT r6 = new X.JfT
            r6.<init>(r1, r3, r2, r0)
            return r6
        L_0x0112:
            X.3kF r4 = X.C249713kF.A00
            if (r4 == 0) goto L_0x012d
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0iw r2 = r0.A07
            java.lang.String r1 = r0.A0A
            X.27r r0 = X.27p.A01(r3)
            X.283 r0 = r0.A04
            X.28D r0 = r0.A09
            X.VjS r6 = r4.A04(r0, r2, r3, r1)
            return r6
        L_0x012d:
            r6 = 0
            return r6
        L_0x012f:
            java.lang.Object r0 = r8.A01
            X.2YM r6 = X.JTR.A0b(r0)
            return r6
        L_0x0136:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.KBQ r6 = new X.KBQ
            r6.<init>(r0)
            return r6
        L_0x0142:
            java.lang.Object r0 = r8.A01
            X.KNm r0 = (X.C61823KNm) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.KBm r6 = new X.KBm
            r6.<init>(r0)
            return r6
        L_0x014e:
            java.lang.Object r1 = r8.A01
            X.KNm r1 = (X.C61823KNm) r1
            com.instagram.common.session.UserSession r5 = r1.A08
            X.0eM r0 = r1.A0C
            java.lang.Object r4 = r0.getValue()
            com.instagram.share.facebook.upsell.data.CLNoticeRepository r4 = (com.instagram.share.facebook.upsell.data.CLNoticeRepository) r4
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x018e
            X.8sW r3 = X.C368378sW.IG_REELS_PANAVISION_COMPOSER
        L_0x0162:
            X.0eM r2 = r1.A0S
            java.lang.Object r0 = r2.getValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r0
            boolean r1 = r0.A07()
            r0 = 0
            if (r1 == 0) goto L_0x0185
            java.lang.Object r1 = r2.getValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.5kq r1 = r1.A03()
            com.instagram.music.common.model.AudioOverlayTrack r1 = r1.A0N
            if (r1 == 0) goto L_0x0185
            java.lang.String r0 = r1.A0E
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = "original"
        L_0x0185:
            X.KDt r6 = new X.KDt
            r6.<init>(r5, r3, r4, r0)
            return r6
        L_0x018b:
            java.lang.String r0 = "song"
            goto L_0x0185
        L_0x018e:
            X.8sW r3 = X.C368378sW.IG_REELS_COMPOSER
            goto L_0x0162
        L_0x0191:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            X.0eM r0 = r0.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBk r6 = new X.KBk
            r6.<init>(r0)
            return r6
        L_0x01a1:
            java.lang.Object r3 = r8.A01
            X.K66 r3 = (X.K66) r3
            X.LBG r0 = r3.A06
            java.lang.String r2 = "viewHolder"
            if (r0 == 0) goto L_0x022a
            X.LAv r0 = r0.A08
            android.view.View r1 = r0.A00
            r0 = 0
            r1.setVisibility(r0)
            X.LBG r0 = r3.A06
            if (r0 == 0) goto L_0x022a
            X.L97 r0 = r0.A07
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x03bb
        L_0x01c2:
            java.lang.Object r4 = r8.A01
            X.K66 r4 = (X.K66) r4
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            r7 = 1
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x01d8
            X.0eM r0 = r4.A0R
            X.AnonymousClass7TF.A1N(r0)
        L_0x01d8:
            X.0eM r0 = r4.A0S
            java.lang.Object r0 = r0.getValue()
            X.4MS r0 = (X.AnonymousClass4MS) r0
            r0.A01()
            X.0rm r2 = X.C51965G9l.A11()
            boolean r0 = X.K66.A0R(r4)
            if (r0 == 0) goto L_0x01fe
            android.content.Intent r3 = X.DbS.A09()
            r2.A00 = r3
            X.50r r1 = X.C2801950r.FEED_POST
            r0 = 2158(0x86e, float:3.024E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r1)
        L_0x01fe:
            X.3Q2 r0 = X.C61829KNs.A02(r4)
            r1 = 0
            if (r0 == 0) goto L_0x020b
            X.8J0 r0 = r0.A12
            if (r0 == 0) goto L_0x020b
            X.8JI r1 = r0.A03
        L_0x020b:
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            if (r1 != r0) goto L_0x0224
            java.lang.Object r1 = r2.A00
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L_0x0219
            android.content.Intent r1 = X.DbS.A09()
        L_0x0219:
            r2.A00 = r1
            r0 = 2164(0x874, float:3.032E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putExtra(r0, r7)
        L_0x0224:
            X.8ZP r6 = r4.A02
            if (r6 != 0) goto L_0x0232
            java.lang.String r2 = "autoCreatedReelFlowsPerfLogger"
        L_0x022a:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0232:
            X.1QP r5 = r6.A02
            long r0 = r6.A01
            r3 = 2416(0x970, float:3.386E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5.flowMarkPoint(r0, r3)
            long r0 = r6.A01
            r5.flowEndSuccess(r0)
            r0 = 0
            r6.A01 = r0
            boolean r0 = X.K66.A0R(r4)
            if (r0 != 0) goto L_0x02a6
            X.0eM r1 = r4.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.1KU.A0C(r0)
            if (r0 == 0) goto L_0x02a6
            r4.APc()
            java.lang.Object r6 = r2.A00
            android.content.Intent r6 = (android.content.Intent) r6
            r0 = 18
            X.MMY r5 = X.MMY.A00(r4, r2, r0)
            X.1as r0 = X.1as.A04
            X.1ap r3 = r0.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.2FW r1 = X.2FW.A0V
            java.lang.String r0 = r4.getModuleName()
            X.F3w r2 = r3.A08(r2, r1, r0)
            X.LqR r0 = new X.LqR
            r0.<init>(r4, r5)
            r2.A02 = r0
            android.os.Bundle r1 = r2.A07
            r0 = 2231(0x8b7, float:3.126E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r7)
            r2.A01()
            X.Ew1 r0 = new X.Ew1
            r0.<init>(r6, r4)
            r2.A00 = r0
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = r2.A00()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = X.DbV.A0g(r4, r0)
            if (r0 == 0) goto L_0x03bb
            r0.A0J(r1)
            goto L_0x03bb
        L_0x02a6:
            r1 = 9685(0x25d5, float:1.3572E-41)
            java.lang.Object r0 = r2.A00
            android.content.Intent r0 = (android.content.Intent) r0
            X.K66.A0A(r0, r4, r1)
            goto L_0x03bb
        L_0x02b1:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            X.K66.A0I(r0)
            goto L_0x03bb
        L_0x02ba:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            X.27r r2 = X.JTP.A0X(r0)
            X.80P r1 = X.AnonymousClass80P.CONTENT_BASED_HASHTAG_SUGGESTION
            X.4yP r0 = X.C279294yP.CLIPS
            r2.A15(r0, r1)
            goto L_0x03bb
        L_0x02cb:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            r0.onBackPressed()
            goto L_0x03bb
        L_0x02d4:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            android.content.Context r3 = r0.requireContext()
            X.0eM r0 = r0.A0T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            android.app.Dialog r6 = X.C64170LRv.A00(r3, r2, r1, r0)
            return r6
        L_0x02ea:
            java.lang.Object r6 = r8.A01
            X.K66 r6 = (X.K66) r6
            X.0eM r5 = r6.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "COVER_PHOTO_ENTERED"
            r3.flowMarkPoint(r1, r0)
            X.27r r2 = X.JTP.A0X(r6)
            X.80P r1 = X.AnonymousClass80P.COVER_PHOTO_ADD
            X.Kka r0 = X.C62674Kka.A0B
            r2.A1B(r0, r1)
            X.3Q2 r0 = X.C61829KNs.A02(r6)
            if (r0 == 0) goto L_0x0366
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A02(r6)
            if (r0 == 0) goto L_0x0366
            X.3Q2 r7 = X.C61829KNs.A02(r6)
            if (r7 == 0) goto L_0x03bb
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r6)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r4 = r0.A0B
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r6)
            java.lang.String r2 = r0.A0T
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r3)
            java.lang.String r0 = r7.A35
            r1.A0D(r7, r0)
            android.os.Bundle r3 = X.DbY.A09(r3)
            java.lang.String r1 = r7.A35
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"
            r3.putString(r0, r1)
            if (r2 == 0) goto L_0x034d
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID"
            r3.putString(r0, r2)
        L_0x034d:
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO"
            r3.putParcelable(r0, r4)
            X.KNd r2 = new X.KNd
            r2.<init>()
            r2.setArguments(r3)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.Dbb.A11(r2, r1, r0)
            goto L_0x03bb
        L_0x0366:
            X.K66.A0J(r6)
            goto L_0x03bb
        L_0x036a:
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            X.K66.A0F(r0)
            goto L_0x03bb
        L_0x0372:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L4H r6 = new X.L4H
            r6.<init>(r0)
            return r6
        L_0x037c:
            java.lang.Object r0 = r8.A01
            X.K7V r0 = (X.K7V) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.KCg r6 = new X.KCg
            r6.<init>(r1, r0)
            return r6
        L_0x038e:
            java.lang.Object r0 = r8.A01
            X.KCg r0 = (X.C61553KCg) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A4d
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 196(0xc4, float:2.75E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            java.lang.Boolean r6 = X.DbT.A0l(r0)
            return r6
        L_0x03a7:
            java.lang.Object r0 = r8.A01
            X.KCg r0 = (X.C61553KCg) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A4d
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 196(0xc4, float:2.75E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
        L_0x03bb:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66303MMm.invoke():java.lang.Object");
    }
}
