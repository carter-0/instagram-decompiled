package X;

/* renamed from: X.MMi  reason: case insensitive filesystem */
public final class C66299MMi extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66299MMi(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C227862kA A00(Object obj, C62320sa r3, C62320sa r4, C62230ry r5, int i) {
        return new C227862kA(r3, new C66299MMi(obj, i), r4, r5);
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C66299MMi(obj, i));
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [X.HmS, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x036b, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0372, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0385, code lost:
        r2 = X.DbT.A0X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0389, code lost:
        X.0qQ.A0B(r2, 0);
        r1 = X.C66306MMp.A02(r2, 1);
        r0 = com.instagram.igtv.repository.series.IGTVSeriesRepository.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0398, code lost:
        return r2.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03f4, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c5, code lost:
        r2.Cgg(new com.facebook.iabeventlogging.model.IABUnifiedEvent(r4, X.AnonymousClass05K.A00, r6, (java.lang.String) null, r8, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0248, code lost:
        if (X.LPL.A02(r3) != false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x026e, code lost:
        if (X.LPL.A02(r3) == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a3, code lost:
        if (X.LPL.A02(r3) != false) goto L_0x02a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03eb;
                case 1: goto L_0x03e3;
                case 2: goto L_0x03bb;
                case 3: goto L_0x0007;
                case 4: goto L_0x03b4;
                case 5: goto L_0x03a5;
                case 6: goto L_0x0007;
                case 7: goto L_0x03b4;
                case 8: goto L_0x0399;
                case 9: goto L_0x0007;
                case 10: goto L_0x03b4;
                case 11: goto L_0x037f;
                case 12: goto L_0x0007;
                case 13: goto L_0x03b4;
                case 14: goto L_0x037f;
                case 15: goto L_0x032e;
                case 16: goto L_0x0007;
                case 17: goto L_0x03b4;
                case 18: goto L_0x0327;
                case 19: goto L_0x0007;
                case 20: goto L_0x03b4;
                case 21: goto L_0x0007;
                case 22: goto L_0x03b4;
                case 23: goto L_0x0317;
                case 24: goto L_0x0305;
                case 25: goto L_0x02f9;
                case 26: goto L_0x02f1;
                case 27: goto L_0x02d7;
                case 28: goto L_0x0224;
                case 29: goto L_0x0210;
                case 30: goto L_0x0175;
                case 31: goto L_0x014c;
                case 32: goto L_0x0135;
                case 33: goto L_0x012b;
                case 34: goto L_0x011b;
                case 35: goto L_0x00e2;
                case 36: goto L_0x009d;
                case 37: goto L_0x0092;
                case 38: goto L_0x0088;
                case 39: goto L_0x007e;
                case 40: goto L_0x0074;
                case 41: goto L_0x03fc;
                case 42: goto L_0x006d;
                case 43: goto L_0x0066;
                case 44: goto L_0x03f5;
                case 45: goto L_0x0054;
                case 46: goto L_0x0007;
                case 47: goto L_0x0049;
                case 48: goto L_0x000e;
                case 49: goto L_0x0018;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.07f r5 = X.C51971G9r.A0U(r0)
            return r5
        L_0x000e:
            java.lang.Object r1 = r1.A01
            X.4WK r1 = (X.AnonymousClass4WK) r1
            r0 = 1
            r1.FLi(r0, r0)
            goto L_0x03f2
        L_0x0018:
            java.lang.Object r8 = r1.A01
            X.H1C r8 = (X.H1C) r8
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r8.A06
            java.lang.String r1 = "promptStickerModel"
            if (r0 == 0) goto L_0x036b
            java.lang.String r11 = r0.A05()
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r8.A06
            if (r0 == 0) goto L_0x036b
            java.lang.String r12 = r0.A03
            android.content.Context r6 = r8.requireContext()
            X.0eM r0 = r8.A0E
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r8.A0C
            X.0gy r7 = X.AnonymousClass07i.A00(r8)
            X.AnonymousClass7TG.A1P(r12, r9)
            r0 = 5
            X.0qQ.A0B(r10, r0)
            X.H6o r5 = new X.H6o
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x0049:
            java.lang.Object r2 = r1.A01
            X.4WK r2 = (X.AnonymousClass4WK) r2
            r1 = 0
            r0 = 1
            r2.FLi(r1, r0)
            goto L_0x03f2
        L_0x0054:
            java.lang.Object r0 = r1.A01
            X.E4f r0 = (X.C47480E4f) r0
            android.content.Context r1 = r0.requireContext()
            com.instagram.common.session.UserSession r0 = r0.A05()
            X.KCq r5 = new X.KCq
            r5.<init>(r1, r0)
            return r5
        L_0x0066:
            java.lang.Object r0 = r1.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x006d:
            java.lang.Object r0 = r1.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x0074:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.incentiveplatform.api.IncentivePlatformApi r5 = new com.instagram.incentiveplatform.api.IncentivePlatformApi
            r5.<init>(r0)
            return r5
        L_0x007e:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYh r5 = new X.FYh
            r5.<init>(r0)
            return r5
        L_0x0088:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.SSz r5 = new X.SSz
            r5.<init>(r0)
            return r5
        L_0x0092:
            java.lang.Object r0 = r1.A01
            X.R8N r0 = (X.R8N) r0
            X.0eM r0 = r0.A0C
            X.1Av r5 = X.DbX.A0h(r0)
            return r5
        L_0x009d:
            java.lang.Object r2 = r1.A01
            X.R8N r2 = (X.R8N) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r3 = r2.A01
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r2.A00
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r3 = X.AnonymousClass7TF.A0i(r0, r1)
            r2.A01 = r3
        L_0x00c7:
            android.os.Bundle r2 = r2.requireArguments()
            r0 = 17
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 1
            boolean r1 = r2.getBoolean(r1, r0)
            r0 = 436(0x1b4, float:6.11E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.SHc r5 = new X.SHc
            r5.<init>(r4, r3, r0, r1)
            return r5
        L_0x00e2:
            java.lang.Object r1 = r1.A01
            X.R8N r1 = (X.R8N) r1
            X.0eM r0 = r1.A0C
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r1.A01
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            android.content.Context r6 = r1.requireContext()
            X.0eM r0 = r1.A0B
            java.lang.Object r9 = r0.getValue()
            X.SHc r9 = (X.C11242SHc) r9
            boolean r14 = r1.A05
            boolean r15 = r1.A04
            r0 = 25
            X.MIh r13 = new X.MIh
            r13.<init>(r1, r0)
            r0 = 4
            X.TTG r11 = new X.TTG
            r11.<init>(r1, r0)
            r0 = 5
            X.TTG r12 = new X.TTG
            r12.<init>(r1, r0)
            X.S3Q r5 = new X.S3Q
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x011b:
            java.lang.Object r0 = r1.A01
            X.R8N r0 = (X.R8N) r0
            android.content.Context r1 = r0.requireContext()
            boolean r0 = r0.A03
            X.R8h r5 = new X.R8h
            r5.<init>(r1, r0)
            return r5
        L_0x012b:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache r5 = new com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache
            r5.<init>(r0)
            return r5
        L_0x0135:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131441502(0x7f0b375e, float:1.8505017E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 0
            X.3M8 r5 = new X.3M8
            r5.<init>(r1, r0)
            return r5
        L_0x014c:
            java.lang.Object r2 = r1.A01
            X.PI3 r2 = (X.PI3) r2
            X.RGm r0 = r2.A06
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 != r0) goto L_0x03f2
            X.L6m r1 = r2.A07
            android.os.Bundle r0 = X.AQC.A04
            X.SRY r0 = X.SRY.A00()
            java.lang.String r6 = r1.A02
            X.AQC r2 = new X.AQC
            r2.<init>(r0, r6)
            android.os.Parcelable$Creator r0 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.currentTimeMillis()
            X.9su r4 = r1.A01
            goto L_0x01c5
        L_0x0175:
            java.lang.Object r4 = r1.A01
            X.PI3 r4 = (X.PI3) r4
            X.RGm r0 = r4.A06
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x01d2
            r0 = 3
            if (r1 != r0) goto L_0x03f2
            X.Jgm r0 = r4.A09
            X.05G r5 = r0.A04
            java.lang.Object r0 = r5.getValue()
            X.JvX r0 = (X.C61033JvX) r0
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01aa
        L_0x0199:
            java.lang.Object r3 = r5.getValue()
            r2 = r3
            X.JvX r2 = (X.C61033JvX) r2
            java.util.List r1 = r2.A08
            X.Lt1 r0 = X.C65421Lt1.A00
            boolean r0 = X.C61033JvX.A00(r2, r0, r3, r1, r5)
            if (r0 == 0) goto L_0x0199
        L_0x01aa:
            X.L6m r1 = r4.A07
            android.os.Bundle r0 = X.AQC.A04
            X.SRY r0 = X.SRY.A00()
            java.lang.String r6 = r1.A02
            X.AQC r2 = new X.AQC
            r2.<init>(r0, r6)
            android.os.Parcelable$Creator r0 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.currentTimeMillis()
            X.9su r4 = r1.A00
        L_0x01c5:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r7 = 0
            com.facebook.iabeventlogging.model.IABUnifiedEvent r3 = new com.facebook.iabeventlogging.model.IABUnifiedEvent
            r3.<init>(r4, r5, r6, r7, r8, r10)
            r2.Cgg(r3)
            goto L_0x03f2
        L_0x01d2:
            X.Jgm r0 = r4.A09
            X.05G r3 = r0.A04
        L_0x01d6:
            java.lang.Object r5 = r3.getValue()
            r6 = r5
            X.JvX r6 = (X.C61033JvX) r6
            java.util.List r1 = r6.A08
            java.util.List r2 = r6.A09
            X.Lsy r0 = new X.Lsy
            r0.<init>(r2)
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
            java.lang.Integer r11 = r6.A06
            java.lang.Integer r12 = r6.A05
            java.lang.String r14 = r6.A07
            com.instagram.common.typedurl.SimpleImageUrl r7 = r6.A00
            java.util.List r15 = r6.A0A
            java.lang.Boolean r8 = r6.A03
            java.lang.Boolean r9 = r6.A01
            java.lang.Integer r13 = r6.A04
            java.lang.Boolean r10 = r6.A02
            r0 = 6
            X.0qQ.A0B(r1, r0)
            X.JvX r6 = new X.JvX
            r17 = r2
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r3.AIY(r5, r6)
            if (r0 == 0) goto L_0x01d6
            goto L_0x01aa
        L_0x0210:
            X.HmS r2 = new X.HmS
            r2.<init>()
            java.lang.Object r1 = r1.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Hit r0 = new X.Hit
            r0.<init>(r1)
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r5 = new com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository
            r5.<init>(r1, r2, r0)
            return r5
        L_0x0224:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            boolean r1 = r0.A06()
            X.L1o r0 = r0.A0A
            com.instagram.common.session.UserSession r3 = r0.A00
            if (r1 == 0) goto L_0x0283
            r7 = 0
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r3)
            boolean r12 = r0.A05(r1)
            boolean r0 = X.AnonymousClass430.A00(r3)
            if (r0 == 0) goto L_0x024a
            boolean r0 = X.LPL.A02(r3)
            r5 = 1
            if (r0 == 0) goto L_0x024b
        L_0x024a:
            r5 = 0
        L_0x024b:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311315672728057(0x8100f3000001f9, double:3.026760473140935E-306)
            boolean r6 = X.182.A06(r2, r3, r0)
            r11 = 1
            X.LAR r4 = new X.LAR
            r8 = r7
            r9 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r14 = X.2R8.A00(r3)
        L_0x0263:
            boolean r0 = X.AnonymousClass430.A00(r3)
            if (r0 == 0) goto L_0x0270
            boolean r0 = X.LPL.A02(r3)
            r15 = 1
            if (r0 != 0) goto L_0x0271
        L_0x0270:
            r15 = 0
        L_0x0271:
            r0 = 2342156773019158761(0x2081032d001508e9, double:4.060298116273077E-152)
            boolean r16 = X.182.A06(r2, r3, r0)
            X.LAS r5 = new X.LAS
            r10 = r5
            r11 = r4
            r13 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r5
        L_0x0283:
            r11 = 0
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r3)
            boolean r12 = r0.A05(r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314893380488054(0x81043400000b76, double:3.02902302993463E-306)
            X.182.A06(r2, r3, r0)
            boolean r0 = X.AnonymousClass430.A00(r3)
            if (r0 == 0) goto L_0x02a5
            boolean r0 = X.LPL.A02(r3)
            r5 = 1
            if (r0 == 0) goto L_0x02a6
        L_0x02a5:
            r5 = 0
        L_0x02a6:
            r0 = 36311315672728057(0x8100f3000001f9, double:3.026760473140935E-306)
            boolean r6 = X.182.A06(r2, r3, r0)
            r0 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
            boolean r8 = X.182.A06(r2, r3, r0)
            boolean r0 = X.C46508DgB.A00(r3)
            r9 = r0 ^ 1
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.AnonymousClass5w9.A01(r3)
            r7 = 1
            X.LAR r4 = new X.LAR
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r14 = X.2R8.A00(r3)
            r0 = 36313342897293212(0x8102cb0000079c, double:3.028042498118917E-306)
            X.182.A06(r2, r3, r0)
            goto L_0x0263
        L_0x02d7:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            X.28D r0 = r0.A00
            int r1 = r0.ordinal()
            r0 = 172(0xac, float:2.41E-43)
            if (r1 != r0) goto L_0x02eb
            X.KTZ r5 = new X.KTZ
            r5.<init>()
            return r5
        L_0x02eb:
            X.LF4 r5 = new X.LF4
            r5.<init>()
            return r5
        L_0x02f1:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            com.instagram.common.session.UserSession r2 = r0.A06
            goto L_0x0389
        L_0x02f9:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.L1m r5 = new X.L1m
            r5.<init>(r0)
            return r5
        L_0x0305:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            X.L6h r0 = r0.A07
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A02
            X.L6i r5 = new X.L6i
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0317:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r0
            com.instagram.common.session.UserSession r2 = r0.A06
            r0 = 39
            X.MMJ r1 = new X.MMJ
            r1.<init>(r2, r0)
            java.lang.Class<com.instagram.igtv.draft.model.IGTVDraftsRepository> r0 = com.instagram.igtv.draft.model.IGTVDraftsRepository.class
            goto L_0x0394
        L_0x0327:
            java.lang.Object r0 = r1.A01
            X.K8C r0 = (X.K8C) r0
            X.0eM r0 = r0.A09
            goto L_0x0385
        L_0x032e:
            java.lang.Object r3 = r1.A01
            X.K6u r3 = (X.K6u) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x035b
            boolean r0 = r3 instanceof X.KTU
            if (r0 == 0) goto L_0x0345
            X.0xx r1 = X.DbV.A0J(r3)
            r0 = 48
            X.MG8.A01(r3, r1, r0)
            goto L_0x03f2
        L_0x0345:
            X.KTV r3 = (X.KTV) r3
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.JiN r0 = (X.C60266JiN) r0
            java.lang.String r2 = r0.A02
            X.0xx r1 = X.DbV.A0J(r3)
            r0 = 1
            X.DbX.A1W(r3, r2, r1, r0)
            goto L_0x03f2
        L_0x035b:
            java.lang.String r0 = r3.A01()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03f2
            com.instagram.igtv.widget.TitleDescriptionEditor r2 = r3.A03
            if (r2 != 0) goto L_0x0373
            java.lang.String r1 = "titleDescriptionEditor"
        L_0x036b:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0373:
            android.view.View r0 = r2.A0C
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.A0B
            r0.setVisibility(r1)
            goto L_0x03f2
        L_0x037f:
            java.lang.Object r0 = r1.A01
            X.K6u r0 = (X.K6u) r0
            X.0eM r0 = r0.A07
        L_0x0385:
            X.0lg r2 = X.DbT.A0X(r0)
        L_0x0389:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            X.MMp r1 = X.C66306MMp.A02(r2, r0)
            java.lang.Class<com.instagram.igtv.repository.series.IGTVSeriesRepository> r0 = com.instagram.igtv.repository.series.IGTVSeriesRepository.class
        L_0x0394:
            java.lang.Object r5 = r2.A01(r0, r1)
            return r5
        L_0x0399:
            java.lang.Object r0 = r1.A01
            X.L9r r0 = (X.C63862L9r) r0
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = r0.A03
            r1 = 0
            X.Lsu r0 = r0.A0M
            r0.A0S = r1
            goto L_0x03f2
        L_0x03a5:
            java.lang.Object r0 = r1.A01
            X.KSr r0 = (X.C61942KSr) r0
            X.0eM r0 = r0.A0W
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r5 = X.1Au.A00(r0)
            return r5
        L_0x03b4:
            java.lang.Object r0 = r1.A01
            X.2YM r5 = X.JTR.A0b(r0)
            return r5
        L_0x03bb:
            java.lang.Object r5 = r1.A01
            X.KSr r5 = (X.C61942KSr) r5
            X.0eM r0 = r5.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r4 = X.JTO.A0k(r0)
            r0 = 2131964051(0x7f133093, float:1.9564873E38)
            java.lang.String r3 = X.DbU.A0m(r5, r0)
            r0 = 2131964048(0x7f133090, float:1.9564867E38)
            java.lang.String r2 = X.DbU.A0m(r5, r0)
            r0 = 2131964049(0x7f133091, float:1.9564869E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            X.KTH r0 = new X.KTH
            r0.<init>(r3, r2, r1)
            r4.A04(r5, r0)
            goto L_0x03f2
        L_0x03e3:
            java.lang.Object r0 = r1.A01
            X.KSr r0 = (X.C61942KSr) r0
            X.C61942KSr.A0A(r0)
            goto L_0x03f2
        L_0x03eb:
            java.lang.Object r0 = r1.A01
            X.KSr r0 = (X.C61942KSr) r0
            X.C61942KSr.A07(r0)
        L_0x03f2:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x03f5:
            java.lang.Object r0 = r1.A01
            X.EN0 r0 = (X.EN0) r0
            X.2YM r5 = r0.A00
            return r5
        L_0x03fc:
            java.lang.Object r5 = r1.A01
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66299MMi.invoke():java.lang.Object");
    }
}
