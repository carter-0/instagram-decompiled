package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MG8 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    public static void A01(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG8(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG8(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MG8, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case Seq.NULL_REFNUM:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            case 46:
                i = 46;
                break;
            case 47:
                i = 47;
                break;
            case 48:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new MG8(obj2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MG8, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v10, types: [X.LsL, X.KSW] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x05d5: MOVE  (r1v123 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v122 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0445  */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            r56 = this;
            r0 = r56
            r3 = r57
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x1132;
                case 1: goto L_0x10c2;
                case 2: goto L_0x1078;
                case 3: goto L_0x0fe1;
                case 4: goto L_0x0faa;
                case 5: goto L_0x0f25;
                case 6: goto L_0x0f07;
                case 7: goto L_0x0ed6;
                case 8: goto L_0x0eb2;
                case 9: goto L_0x0e96;
                case 10: goto L_0x0e73;
                case 11: goto L_0x0e51;
                case 12: goto L_0x0e34;
                case 13: goto L_0x0e18;
                case 14: goto L_0x0ded;
                case 15: goto L_0x0dbd;
                case 16: goto L_0x0cdf;
                case 17: goto L_0x0009;
                case 18: goto L_0x0cc4;
                case 19: goto L_0x0009;
                case 20: goto L_0x0c80;
                case 21: goto L_0x0c53;
                case 22: goto L_0x0c2d;
                case 23: goto L_0x0bf3;
                case 24: goto L_0x0bc8;
                case 25: goto L_0x0b7f;
                case 26: goto L_0x0b52;
                case 27: goto L_0x1048;
                case 28: goto L_0x0b1b;
                case 29: goto L_0x0afb;
                case 30: goto L_0x0ac6;
                case 31: goto L_0x0aa6;
                case 32: goto L_0x0a80;
                case 33: goto L_0x0a3a;
                case 34: goto L_0x09b4;
                case 35: goto L_0x096b;
                case 36: goto L_0x08e4;
                case 37: goto L_0x0676;
                case 38: goto L_0x0870;
                case 39: goto L_0x080c;
                case 40: goto L_0x07b2;
                case 41: goto L_0x0736;
                case 42: goto L_0x061a;
                case 43: goto L_0x05af;
                case 44: goto L_0x02b8;
                case 45: goto L_0x0281;
                case 46: goto L_0x01ad;
                case 47: goto L_0x00f9;
                case 48: goto L_0x0083;
                case 49: goto L_0x0017;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x10a8
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 != r4) goto L_0x007e
            X.0eS.A00(r3)
        L_0x0024:
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r5 = r0.A02
            X.K4T r5 = (X.K4T) r5
            java.util.List r4 = r5.A04
            java.util.Iterator r2 = r4.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C64749LhR
            if (r0 == 0) goto L_0x0030
        L_0x003e:
            int r0 = r4.indexOf(r1)
            r4.addAll(r0, r3)
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            r1.A01(r4)
            X.2t9 r0 = r5.A00
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "immersiveItemAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005a:
            r1 = r6
            goto L_0x003e
        L_0x005c:
            java.lang.Object r2 = A00(r3, r0)
            X.K4T r2 = (X.K4T) r2
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r2 = r2.A01
            if (r2 != 0) goto L_0x0070
            java.lang.String r0 = "repository"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0070:
            r0.A00 = r4
            java.lang.Object r3 = r2.A04(r0)
            if (r3 != r1) goto L_0x0024
            return r1
        L_0x0079:
            r0.A05(r1)
            goto L_0x1184
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0083:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0092
            if (r2 != r5) goto L_0x008d
            goto L_0x00d3
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0092:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A02     // Catch:{ 3g0 -> 0x00df }
            X.KTU r4 = (X.KTU) r4     // Catch:{ 3g0 -> 0x00df }
            X.0eM r2 = r4.A03     // Catch:{ 3g0 -> 0x00df }
            java.lang.Object r3 = r2.getValue()     // Catch:{ 3g0 -> 0x00df }
            com.instagram.igtv.repository.series.IGTVSeriesRepository r3 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r3     // Catch:{ 3g0 -> 0x00df }
            java.lang.String r2 = r4.A02     // Catch:{ 3g0 -> 0x00df }
            if (r2 != 0) goto L_0x00af
            java.lang.String r1 = "seriesId"
            X.0qQ.A0F(r1)     // Catch:{ 3g0 -> 0x00df }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()     // Catch:{ 3g0 -> 0x00df }
            throw r1     // Catch:{ 3g0 -> 0x00df }
        L_0x00af:
            java.lang.String r6 = X.LQM.A02(r2)     // Catch:{ 3g0 -> 0x00df }
            X.0qQ.A07(r6)     // Catch:{ 3g0 -> 0x00df }
            X.0eM r2 = r4.A07     // Catch:{ 3g0 -> 0x00df }
            java.lang.String r7 = X.DbU.A0u(r2)     // Catch:{ 3g0 -> 0x00df }
            java.lang.String r8 = r4.A01()     // Catch:{ 3g0 -> 0x00df }
            java.lang.String r9 = r4.A00()     // Catch:{ 3g0 -> 0x00df }
            if (r9 != 0) goto L_0x00c8
            java.lang.String r9 = ""
        L_0x00c8:
            r0.A00 = r5     // Catch:{ 3g0 -> 0x00df }
            r5 = r3
            r10 = r0
            java.lang.Object r2 = r5.A03(r6, r7, r8, r9, r10)     // Catch:{ 3g0 -> 0x00df }
            if (r2 != r1) goto L_0x00d6
            return r1
        L_0x00d3:
            X.0eS.A00(r3)     // Catch:{ 3g0 -> 0x00df }
        L_0x00d6:
            java.lang.Object r1 = r0.A02     // Catch:{ 3g0 -> 0x00df }
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ 3g0 -> 0x00df }
            X.DbT.A1I(r1)     // Catch:{ 3g0 -> 0x00df }
            goto L_0x1184
        L_0x00df:
            r2 = move-exception
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "igtv_upload_edit_series_fragment"
            r2.A00(r0)
            android.content.Context r2 = r1.getContext()
            if (r2 == 0) goto L_0x1184
            java.lang.String r1 = "igtv_edit_series_error"
            r0 = 2131964026(0x7f13307a, float:1.9564822E38)
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x1184
        L_0x00f9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0108
            if (r2 != r5) goto L_0x0103
            goto L_0x0138
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0108:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A02     // Catch:{ 3g0 -> 0x018a }
            X.JVO r4 = (X.JVO) r4     // Catch:{ 3g0 -> 0x018a }
            r4.A01 = r5     // Catch:{ 3g0 -> 0x018a }
            X.L6l r2 = r4.A00     // Catch:{ 3g0 -> 0x018a }
            if (r2 == 0) goto L_0x011c
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ 3g0 -> 0x018a }
            X.K4V r2 = r2.A02     // Catch:{ 3g0 -> 0x018a }
            r2.A01(r3)     // Catch:{ 3g0 -> 0x018a }
        L_0x011c:
            X.0eM r2 = r4.A05     // Catch:{ 3g0 -> 0x018a }
            java.lang.Object r7 = r2.getValue()     // Catch:{ 3g0 -> 0x018a }
            com.instagram.igtv.repository.series.IGTVSeriesRepository r7 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r7     // Catch:{ 3g0 -> 0x018a }
            java.lang.String r6 = r4.A04     // Catch:{ 3g0 -> 0x018a }
            r0.A00 = r5     // Catch:{ 3g0 -> 0x018a }
            com.instagram.repository.common.MemoryCache r5 = r7.A01     // Catch:{ 3g0 -> 0x018a }
            r4 = 0
            r3 = 2
            X.MEF r2 = new X.MEF     // Catch:{ 3g0 -> 0x018a }
            r2.<init>(r7, r6, r4, r3)     // Catch:{ 3g0 -> 0x018a }
            java.lang.Object r3 = r5.A02(r6, r0, r2)     // Catch:{ 3g0 -> 0x018a }
            if (r3 != r1) goto L_0x013b
            return r1
        L_0x0138:
            X.0eS.A00(r3)     // Catch:{ 3g0 -> 0x018a }
        L_0x013b:
            X.K1C r3 = (X.K1C) r3     // Catch:{ 3g0 -> 0x018a }
            java.lang.Object r4 = r0.A02     // Catch:{ 3g0 -> 0x018a }
            X.JVO r4 = (X.JVO) r4     // Catch:{ 3g0 -> 0x018a }
            X.L6l r7 = r4.A00     // Catch:{ 3g0 -> 0x018a }
            if (r7 == 0) goto L_0x019f
            java.util.List r1 = r3.A00     // Catch:{ 3g0 -> 0x018a }
            int r1 = r1.size()     // Catch:{ 3g0 -> 0x018a }
            if (r1 != 0) goto L_0x0155
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ 3g0 -> 0x018a }
            X.K4V r1 = r7.A02     // Catch:{ 3g0 -> 0x018a }
            r1.A01(r2)     // Catch:{ 3g0 -> 0x018a }
            goto L_0x019f
        L_0x0155:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ 3g0 -> 0x018a }
            java.util.List r1 = r3.A00     // Catch:{ 3g0 -> 0x018a }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ 3g0 -> 0x018a }
        L_0x015f:
            boolean r1 = r5.hasNext()     // Catch:{ 3g0 -> 0x018a }
            if (r1 == 0) goto L_0x017b
            java.lang.Object r1 = r5.next()     // Catch:{ 3g0 -> 0x018a }
            X.K1d r1 = (X.C61292K1d) r1     // Catch:{ 3g0 -> 0x018a }
            java.lang.String r3 = r1.A03     // Catch:{ 3g0 -> 0x018a }
            X.0qQ.A07(r3)     // Catch:{ 3g0 -> 0x018a }
            java.lang.String r2 = r1.A08     // Catch:{ 3g0 -> 0x018a }
            X.0qQ.A07(r2)     // Catch:{ 3g0 -> 0x018a }
            r1 = 49
            X.JTP.A1T(r3, r2, r6, r1)     // Catch:{ 3g0 -> 0x018a }
            goto L_0x015f
        L_0x017b:
            X.K4V r2 = r7.A02     // Catch:{ 3g0 -> 0x018a }
            X.Jl4 r1 = r2.A07     // Catch:{ 3g0 -> 0x018a }
            r1.A02 = r6     // Catch:{ 3g0 -> 0x018a }
            r1.notifyDataSetChanged()     // Catch:{ 3g0 -> 0x018a }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ 3g0 -> 0x018a }
            r2.A01(r1)     // Catch:{ 3g0 -> 0x018a }
            goto L_0x019f
        L_0x018a:
            r2 = move-exception
            java.lang.String r1 = "igtv_series_selection_sheet_controller"
            r2.A00(r1)     // Catch:{ all -> 0x01a4 }
            java.lang.Object r4 = r0.A02     // Catch:{ all -> 0x01a4 }
            X.JVO r4 = (X.JVO) r4     // Catch:{ all -> 0x01a4 }
            X.L6l r1 = r4.A00     // Catch:{ all -> 0x01a4 }
            if (r1 == 0) goto L_0x019f
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01a4 }
            X.K4V r1 = r1.A02     // Catch:{ all -> 0x01a4 }
            r1.A01(r2)     // Catch:{ all -> 0x01a4 }
        L_0x019f:
            r0 = 0
            r4.A01 = r0
            goto L_0x1184
        L_0x01a4:
            r2 = move-exception
            java.lang.Object r1 = r0.A02
            X.JVO r1 = (X.JVO) r1
            r0 = 0
            r1.A01 = r0
            throw r2
        L_0x01ad:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0230
            if (r2 != r7) goto L_0x027c
            X.0eS.A00(r3)
        L_0x01b9:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r4 = r0.A02
            X.JhK r4 = (X.C60201JhK) r4
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0258
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r6 = r3.A00
            X.K1d r6 = (X.C61292K1d) r6
            java.lang.String r0 = r6.A06
            r4.A00 = r0
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x022e
            java.util.List r0 = r6.A0B
            java.util.List r0 = X.JTQ.A0j(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022e
        L_0x01dd:
            r4.A02 = r7
            java.util.List r0 = r6.A0B
            java.util.List r0 = X.JTQ.A0j(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x01e9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r5 = r7.next()
            X.4gL r5 = (X.C270194gL) r5
            X.K1d r3 = r4.A07
            com.instagram.common.session.UserSession r2 = r4.A04
            com.instagram.common.typedurl.ImageUrl r0 = r5.A02()
            if (r0 == 0) goto L_0x01e9
            java.util.Map r1 = r3.A0E
            java.lang.String r0 = r5.A0X
            r0.getClass()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x01e9
            java.util.List r0 = r3.A0B
            if (r0 != 0) goto L_0x0214
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x0214:
            r3.A0B = r0
            r0.add(r5)
            java.lang.String r0 = r5.A0X
            r0.getClass()
            r1.put(r0, r5)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            X.Lfj r0 = new X.Lfj
            r0.<init>(r3)
            r1.A05(r0)
            goto L_0x01e9
        L_0x022e:
            r7 = 0
            goto L_0x01dd
        L_0x0230:
            java.lang.Object r6 = A00(r3, r0)
            X.JhK r6 = (X.C60201JhK) r6
            X.2Fj r4 = r6.A03
            java.util.List r3 = r6.A01
            X.KSk r2 = new X.KSk
            r2.<init>(r3)
            r4.A0B(r2)
            com.instagram.igtv.live.model.IGTVLiveChannelRepository r5 = r6.A06
            X.L1c r4 = r6.A05
            X.K1d r2 = r6.A07
            java.lang.String r3 = r2.A03
            X.0qQ.A07(r3)
            java.lang.String r2 = r6.A00
            r0.A00 = r7
            java.lang.Object r3 = r5.A00(r4, r3, r2, r0)
            if (r3 != r1) goto L_0x01b9
            return r1
        L_0x0258:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0270
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0261:
            java.util.List r1 = r4.A01
            com.instagram.common.session.UserSession r0 = r4.A04
            java.util.ArrayList r0 = r6.A01(r0)
            r1.addAll(r0)
            X.3Ih r3 = X.C41845B3m.A0d(r1)
        L_0x0270:
            X.2Fj r1 = r4.A03
            X.KSj r0 = new X.KSj
            r0.<init>(r3)
            r1.A0B(r0)
            goto L_0x1184
        L_0x027c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0281:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x028f
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x028f:
            java.lang.Object r4 = A00(r3, r0)
            X.JWW r4 = (X.JWW) r4
            X.05G r3 = r4.A02
            X.JXC r2 = X.JXC.A00
            r3.Epw(r2)
            X.0eM r2 = r4.A01
            java.lang.Object r2 = r2.getValue()
            com.instagram.igtv.draft.model.IGTVDraftsRepository r2 = (com.instagram.igtv.draft.model.IGTVDraftsRepository) r2
            X.MVv r2 = r2.A01
            X.0r6 r3 = r2.Aaz()
            r2 = 44
            X.MCm r2 = X.MCm.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x10bf
        L_0x02b8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x02c6
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02c6:
            java.lang.Object r54 = A00(r3, r0)
            r2 = r54
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r2 = (com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker) r2
            r54 = r2
            r0.A00 = r5
            boolean r2 = r2.A06
            if (r2 != 0) goto L_0x0c29
            r2 = r54
            com.instagram.common.session.UserSession r2 = r2.A08
            r55 = r2
            X.2cc r2 = X.C71342cb.A00(r55)
            java.lang.String r8 = r2.A05
            if (r8 != 0) goto L_0x02e6
            java.lang.String r8 = "unknown"
        L_0x02e6:
            r2 = r54
            X.KSg r7 = r2.A0A
            X.MOK r9 = X.MOK.A00
            java.lang.String r6 = "on_app_start"
            X.0qQ.A0B(r9, r5)
            X.565 r4 = r7.A00
            if (r4 == 0) goto L_0x05a5
            r3 = 5
            X.MBK r2 = new X.MBK
            r2.<init>(r9, r3)
            r4.A02(r6, r2)
            r2 = r54
            r2.A06 = r5
            X.0sa r5 = r2.A0D
            long r3 = X.JTR.A0O(r5)
            r2.A01 = r3
            X.1QK r2 = X.1QK.A09
            boolean r2 = X.JTQ.A1Y(r2, r8)
            if (r2 != 0) goto L_0x0c29
            X.565 r3 = r7.A00
            if (r3 == 0) goto L_0x05a5
            X.0sP r2 = r3.A06
            java.lang.Object r8 = r2.invoke(r6)
            X.LT2 r8 = (X.LT2) r8
            r8.A00 = r3
            X.KSY r8 = (X.KSY) r8
            r2 = r54
            X.L4d r2 = r2.A0B
            long r6 = X.JTR.A0O(r5)
            r9 = 0
            X.0qQ.A0B(r8, r9)
            X.LsK r2 = r2.A00
            X.C65379LsK.A00(r2)
            java.util.List r14 = r2.A00
            if (r14 != 0) goto L_0x0339
            X.0sn r14 = X.0sn.A00
        L_0x0339:
            X.KSS r3 = r8.A0Q
            int r2 = r14.size()
            X.KSS.A00(r3, r2)
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.util.Calendar r10 = java.util.Calendar.getInstance(r4)
            long r2 = r10.getTimeInMillis()
            r4.getOffset(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r6)
            r10.setTime(r2)
            r2 = 7
            int r2 = r10.get(r2)
            double r4 = (double) r2
            r13 = 11
            int r2 = r10.get(r13)
            double r2 = (double) r2
            r12 = 12
            int r10 = r10.get(r12)
            double r10 = (double) r10
            X.KSS r15 = r8.A0T
            r15.A00 = r4
            X.KSS r15 = r8.A0R
            r15.A00 = r2
            X.KSS r15 = r8.A0S
            r16 = 4627448617123184640(0x4038000000000000, double:24.0)
            double r4 = r4 * r16
            r16 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r4 * r16
            double r2 = r2 * r16
            double r4 = r4 + r2
            double r4 = r4 + r10
            r15.A00 = r4
            java.lang.Object r10 = X.00k.A0L(r14)
            X.LDV r10 = (X.LDV) r10
            if (r10 == 0) goto L_0x03ac
            long r4 = r10.A00
            long r2 = r10.A02
            long r15 = r6 - r2
            long r2 = X.AnonymousClass7TE.A0P(r15)
            X.KSS r11 = r8.A03
            X.KSS.A02(r11, r4)
            X.KSS r4 = r8.A04
            X.KSS.A02(r4, r2)
            X.KSS r3 = r8.A02
            java.lang.Integer r2 = r10.A01
            int r2 = X.C63290KuZ.A00(r2)
            X.KSS.A00(r3, r2)
        L_0x03ac:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTimeInMillis(r6)
            r3.set(r13, r9)
            r3.set(r12, r9)
            r2 = 13
            r3.set(r2, r9)
            r2 = 14
            r3.set(r2, r9)
            long r52 = r3.getTimeInMillis()
            r50 = 86400000(0x5265c00, double:4.2687272E-316)
            long r48 = r52 - r50
            long r46 = r48 - r50
            long r44 = r46 - r50
            java.util.Iterator r43 = r14.iterator()
            r41 = 0
            r39 = 0
            r37 = 0
            r35 = 0
            r33 = 0
            r30 = 0
            r22 = 0
            r20 = 0
            r18 = 0
            r14 = 0
            r32 = 0
            r29 = 0
            r28 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
        L_0x03f9:
            boolean r2 = r43.hasNext()
            if (r2 == 0) goto L_0x04ca
            java.lang.Object r10 = r43.next()
            X.LDV r10 = (X.LDV) r10
            long r4 = r10.A02
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x03f9
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0465
            int r32 = r32 + 1
            int r29 = r29 + 1
            int r28 = r28 + 1
            int r13 = r13 + 1
            int r12 = r12 + 1
            int r11 = r11 + 1
            int r9 = r9 + 1
            long r2 = r10.A00
            long r41 = r41 + r2
        L_0x0426:
            long r2 = r10.A00
            long r39 = r39 + r2
        L_0x042a:
            long r2 = r10.A00
            long r37 = r37 + r2
        L_0x042e:
            long r2 = r10.A00
            long r35 = r35 + r2
        L_0x0432:
            long r2 = r10.A00
            long r33 = r33 + r2
        L_0x0436:
            long r2 = r10.A00
            long r30 = r30 + r2
        L_0x043a:
            int r2 = (r4 > r52 ? 1 : (r4 == r52 ? 0 : -1))
            if (r2 < 0) goto L_0x0445
            int r27 = r27 + 1
            long r2 = r10.A00
            long r22 = r22 + r2
            goto L_0x03f9
        L_0x0445:
            int r2 = (r4 > r48 ? 1 : (r4 == r48 ? 0 : -1))
            if (r2 < 0) goto L_0x0450
            int r26 = r26 + 1
            long r2 = r10.A00
            long r20 = r20 + r2
            goto L_0x03f9
        L_0x0450:
            int r2 = (r4 > r46 ? 1 : (r4 == r46 ? 0 : -1))
            if (r2 < 0) goto L_0x045b
            int r25 = r25 + 1
            long r2 = r10.A00
            long r18 = r18 + r2
            goto L_0x03f9
        L_0x045b:
            int r2 = (r4 > r44 ? 1 : (r4 == r44 ? 0 : -1))
            if (r2 < 0) goto L_0x03f9
            int r24 = r24 + 1
            long r2 = r10.A00
            long r14 = r14 + r2
            goto L_0x03f9
        L_0x0465:
            r2 = 7200000(0x6ddd00, double:3.5572727E-317)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x047b
            int r29 = r29 + 1
            int r28 = r28 + 1
            int r13 = r13 + 1
            int r12 = r12 + 1
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x0426
        L_0x047b:
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x048f
            int r28 = r28 + 1
            int r13 = r13 + 1
            int r12 = r12 + 1
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x042a
        L_0x048f:
            long r16 = r6 - r50
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x049e
            int r13 = r13 + 1
            int r12 = r12 + 1
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x042e
        L_0x049e:
            r2 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x04ae
            int r12 = r12 + 1
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x0432
        L_0x04ae:
            r2 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x04bd
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L_0x0436
        L_0x04bd:
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            long r16 = r6 - r2
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x03f9
            int r9 = r9 + 1
            goto L_0x043a
        L_0x04ca:
            X.KSS r3 = r8.A09
            r2 = r32
            X.KSS.A00(r3, r2)
            X.KSS r3 = r8.A06
            r2 = r29
            X.KSS.A00(r3, r2)
            X.KSS r3 = r8.A0B
            r2 = r28
            X.KSS.A00(r3, r2)
            X.KSS r2 = r8.A07
            X.KSS.A00(r2, r13)
            X.KSS r2 = r8.A08
            X.KSS.A00(r2, r12)
            X.KSS r2 = r8.A0A
            X.KSS.A00(r2, r11)
            X.KSS r2 = r8.A05
            X.KSS.A00(r2, r9)
            X.KSS r4 = r8.A0J
            r5 = 1000(0x3e8, double:4.94E-321)
            long r41 = r41 / r5
            r2 = r41
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0G
            long r39 = r39 / r5
            r2 = r39
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0L
            long r37 = r37 / r5
            r2 = r37
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0H
            long r35 = r35 / r5
            r2 = r35
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0I
            long r33 = r33 / r5
            r2 = r33
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0K
            long r30 = r30 / r5
            r2 = r30
            X.KSS.A02(r4, r2)
            X.KSS r3 = r8.A0C
            r2 = r27
            X.KSS.A00(r3, r2)
            X.KSS r3 = r8.A0D
            r2 = r26
            X.KSS.A00(r3, r2)
            X.KSS r3 = r8.A0E
            r2 = r25
            X.KSS.A00(r3, r2)
            X.KSS r3 = r8.A0F
            r2 = r24
            X.KSS.A00(r3, r2)
            X.KSS r4 = r8.A0M
            long r22 = r22 / r5
            r2 = r22
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0N
            long r20 = r20 / r5
            r2 = r20
            X.KSS.A02(r4, r2)
            X.KSS r4 = r8.A0O
            long r18 = r18 / r5
            r2 = r18
            X.KSS.A02(r4, r2)
            X.KSS r2 = r8.A0P
            long r14 = r14 / r5
            X.KSS.A02(r2, r14)
            long r14 = java.lang.System.currentTimeMillis()
            X.KSW r9 = r8.A01
            if (r9 != 0) goto L_0x0588
            java.lang.String r10 = r8.A02
            double r12 = r8.A01
            java.util.ArrayList r11 = X.LT2.A03(r8)
            r2 = 3
            X.0qQ.A0B(r11, r2)
            X.KSW r9 = new X.KSW
            r9.<init>(r10, r11, r12, r14)
            r8.A05(r9)
            r8.A00 = r9
            r8.A01 = r9
        L_0x0588:
            r2 = r54
            r2.A03 = r9
            X.0Tu r5 = X.0Tu.A05
            r3 = 36329895701463412(0x8111d900034174, double:3.038510558128944E-306)
            r2 = r55
            boolean r2 = X.182.A06(r5, r2, r3)
            if (r2 == 0) goto L_0x0c29
            X.MOL r3 = X.MOL.A00
            r2 = r54
            java.lang.Object r0 = r2.A00(r0, r3)
            goto L_0x0c25
        L_0x05a5:
            java.lang.String r0 = "productCore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05af:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x05e0
            if (r2 != r6) goto L_0x0615
            X.0eS.A00(r3)
        L_0x05bb:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x05fc
            java.lang.Object r3 = r0.A02
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131963269(0x7f132d85, float:1.9563287E38)
            java.lang.String r0 = "hall_pass_leave_success"
            X.C59689JTv.A0F(r2, r0, r1)
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x1184
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x1184
            X.7Pu r0 = r1.A02
            X.DbW.A1K(r0)
            goto L_0x1184
        L_0x05e0:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r5 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r4 = r0.A02
            X.E64 r4 = (X.E64) r4
            X.0eM r2 = r4.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x08da
            r0.A00 = r6
            java.lang.Object r3 = r5.A05(r3, r2, r0)
            if (r3 != r1) goto L_0x05bb
            return r1
        L_0x05fc:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0610
            java.lang.Object r0 = r0.A02
            android.content.Context r2 = X.DbT.A08(r0)
            r1 = 2131963277(0x7f132d8d, float:1.9563303E38)
            java.lang.String r0 = "hall_pass_member_list_error"
            X.C59689JTv.A0F(r2, r0, r1)
            goto L_0x1184
        L_0x0610:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0615:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x061a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x063e
            if (r2 != r5) goto L_0x0671
            X.0eS.A00(r3)
        L_0x0626:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0658
            java.lang.Object r1 = r0.A02
            X.E7T r1 = (X.E7T) r1
            X.0eM r0 = r1.A09
            java.lang.Object r3 = r0.getValue()
            X.Dl4 r3 = (X.C46777Dl4) r3
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r1.A0C()
            goto L_0x0892
        L_0x063e:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r4 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r2 = r0.A02
            X.E7T r2 = (X.E7T) r2
            com.instagram.common.session.UserSession r3 = r2.A0C()
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L_0x08da
            r0.A00 = r5
            java.lang.Object r3 = r4.A05(r3, r2, r0)
            if (r3 != r1) goto L_0x0626
            return r1
        L_0x0658:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x066c
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3 = 2131963277(0x7f132d8d, float:1.9563303E38)
            android.content.Context r2 = r0.requireContext()
            r1 = 0
            java.lang.String r0 = "hall_pass_member_list_error"
            goto L_0x08cb
        L_0x066c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0671:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0676:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            java.lang.String r6 = "currentCampfireName"
            if (r2 == 0) goto L_0x06c0
            if (r2 != r10) goto L_0x0729
            X.0eS.A00(r3)
        L_0x0684:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0716
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.MWE r1 = (X.MWE) r1
            X.JxH r1 = (X.C61105JxH) r1
            java.lang.String r8 = r1.A00
            java.lang.Object r1 = r0.A02
            X.KXf r1 = (X.KXf) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x06fc
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.content.Intent r2 = X.DbS.A09()
            r0 = 2758(0xac6, float:3.865E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r8)
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x072e
            r0 = 2759(0xac7, float:3.866E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r1)
            r0 = -1
            r3.setResult(r0, r2)
            goto L_0x0961
        L_0x06c0:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r11 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r5 = r0.A02
            X.KXf r5 = (X.KXf) r5
            X.0eM r2 = r5.A05
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r2)
            X.LRl r2 = r5.A03
            java.util.Set r2 = r2.A03
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x06df:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x06e9
            X.C61036Jva.A01(r4, r3)
            goto L_0x06df
        L_0x06e9:
            java.lang.String r2 = r5.A03
            if (r2 == 0) goto L_0x072e
            r0.A00 = r10
            java.lang.String r14 = ""
            r13 = r2
            r15 = r4
            r16 = r0
            java.lang.Object r3 = r11.A01(r12, r13, r14, r15, r16)
            if (r3 != r1) goto L_0x0684
            return r1
        L_0x06fc:
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x072e
            X.28D r6 = X.28D.A34
            r11 = r10
            X.C49957FGp.A01(r5, r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            goto L_0x0961
        L_0x0716:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0724
            java.lang.Object r4 = r0.A02
            X.KXf r4 = (X.KXf) r4
            r3 = 0
            r2 = 2131954684(0x7f130bfc, float:1.9545874E38)
            goto L_0x0906
        L_0x0724:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0729:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x072e:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0736:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0769
            if (r2 != r6) goto L_0x07ad
            X.0eS.A00(r3)
        L_0x0742:
            if (r3 != 0) goto L_0x0748
        L_0x0744:
            X.5sO r3 = X.DbU.A0f()
        L_0x0748:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0957
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x07a8
            java.lang.Object r2 = r0.A02
            X.KXe r2 = (X.C62042KXe) r2
            r1 = 0
            r0 = 2131963255(0x7f132d77, float:1.9563258E38)
            X.C62042KXe.A06(r2, r0, r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r2.A00
            if (r0 != 0) goto L_0x07a3
            java.lang.String r0 = "doneButton"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0769:
            java.lang.Object r3 = A00(r3, r0)
            X.KXe r3 = (X.C62042KXe) r3
            java.lang.String r5 = r3.A03
            if (r5 == 0) goto L_0x0744
            com.instagram.hallpass.util.HallPassApiUtil r7 = com.instagram.hallpass.util.HallPassApiUtil.A00
            X.0eM r2 = r3.A06
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.LRl r2 = r3.A03
            java.util.Set r2 = r2.A03
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x078b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0795
            X.C61036Jva.A01(r4, r3)
            goto L_0x078b
        L_0x0795:
            r0.A00 = r6
            X.0sn r11 = X.0sn.A00
            r9 = r5
            r10 = r4
            r12 = r0
            java.lang.Object r3 = r7.A02(r8, r9, r10, r11, r12)
            if (r3 != r1) goto L_0x0742
            return r1
        L_0x07a3:
            r0.setPrimaryActionIsLoading(r1)
            goto L_0x1184
        L_0x07a8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07b2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x07d7
            if (r2 != r5) goto L_0x0807
            X.0eS.A00(r3)
        L_0x07be:
            X.3Ii r3 = (X.C239803Ii) r3
            if (r3 != 0) goto L_0x07c6
        L_0x07c2:
            X.5sO r3 = X.DbU.A0f()
        L_0x07c6:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x07f2
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.MWF r1 = (X.MWF) r1
            X.Dsm r1 = (X.C47200Dsm) r1
            java.util.List r3 = r1.A02
            if (r3 == 0) goto L_0x1184
            goto L_0x0828
        L_0x07d7:
            java.lang.Object r2 = A00(r3, r0)
            X.KXe r2 = (X.C62042KXe) r2
            java.lang.String r4 = r2.A03
            if (r4 == 0) goto L_0x07c2
            com.instagram.hallpass.util.HallPassApiUtil r3 = com.instagram.hallpass.util.HallPassApiUtil.A00
            X.0eM r2 = r2.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            r0.A00 = r5
            java.lang.Object r3 = r3.A04(r2, r4, r0)
            if (r3 != r1) goto L_0x07be
            return r1
        L_0x07f2:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0802
            java.lang.Object r1 = r0.A02
            X.KXe r1 = (X.C62042KXe) r1
            r0 = 2131963271(0x7f132d87, float:1.956329E38)
            X.C62042KXe.A06(r1, r0, r5)
            goto L_0x1184
        L_0x0802:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0807:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x080c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x083e
            if (r2 != r4) goto L_0x086b
            X.0eS.A00(r3)
        L_0x0818:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0856
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.MWG r1 = (X.MWG) r1
            X.Dsp r1 = (X.C47203Dsp) r1
            java.util.List r3 = r1.A00
        L_0x0828:
            java.lang.Object r2 = r0.A02
            X.K6S r2 = (X.K6S) r2
            X.0sn r1 = X.0sn.A00
            X.LRl r0 = r2.A03
            r0.A07(r1)
            r0.A08(r3)
            X.LRl.A00(r2, r0)
            X.LRl.A01(r2, r0)
            goto L_0x1184
        L_0x083e:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r3 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r2 = r0.A02
            X.KXe r2 = (X.C62042KXe) r2
            X.0eM r2 = r2.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            r0.A00 = r4
            java.lang.Object r3 = r3.A07(r2, r0)
            if (r3 != r1) goto L_0x0818
            return r1
        L_0x0856:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0866
            java.lang.Object r1 = r0.A02
            X.KXe r1 = (X.C62042KXe) r1
            r0 = 2131963271(0x7f132d87, float:1.956329E38)
            X.C62042KXe.A06(r1, r0, r4)
            goto L_0x1184
        L_0x0866:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x086b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0870:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x089f
            if (r2 != r5) goto L_0x08d5
            X.0eS.A00(r3)
        L_0x087c:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x08b9
            java.lang.Object r1 = r0.A02
            X.E7S r1 = (X.E7S) r1
            X.0eM r0 = r1.A04
            java.lang.Object r3 = r0.getValue()
            X.Dl4 r3 = (X.C46777Dl4) r3
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r1.A0C()
        L_0x0892:
            com.instagram.user.model.User r0 = r2.A01(r0)
            java.lang.String r0 = r0.getId()
            r3.A01(r0)
            goto L_0x1184
        L_0x089f:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r4 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r2 = r0.A02
            X.E7S r2 = (X.E7S) r2
            com.instagram.common.session.UserSession r3 = r2.A0C()
            java.lang.String r2 = r2.A01
            if (r2 == 0) goto L_0x08da
            r0.A00 = r5
            java.lang.Object r3 = r4.A05(r3, r2, r0)
            if (r3 != r1) goto L_0x087c
            return r1
        L_0x08b9:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x08d0
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3 = 2131954716(0x7f130c1c, float:1.954594E38)
            android.content.Context r2 = r0.requireContext()
            r1 = 0
            java.lang.String r0 = "campfire_member_list_error"
        L_0x08cb:
            X.C59689JTv.A01(r2, r0, r3, r1)
            goto L_0x1184
        L_0x08d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08da:
            java.lang.String r0 = "hallPassId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x08e4:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0918
            if (r2 != r6) goto L_0x0966
            X.0eS.A00(r3)
        L_0x08f0:
            if (r3 != 0) goto L_0x08f6
        L_0x08f2:
            X.5sO r3 = X.DbU.A0f()
        L_0x08f6:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0957
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0952
            java.lang.Object r4 = r0.A02
            X.KXf r4 = (X.KXf) r4
            r3 = 0
            r2 = 2131954678(0x7f130bf6, float:1.9545862E38)
        L_0x0906:
            android.content.Context r1 = r4.requireContext()
            java.lang.String r0 = "campfire_audience_picker_fetch_error"
            X.C59689JTv.A0F(r1, r0, r2)
            com.instagram.igds.components.button.IgdsButton r0 = r4.A00
            if (r0 == 0) goto L_0x1184
            r0.setLoading(r3)
            goto L_0x1184
        L_0x0918:
            java.lang.Object r3 = A00(r3, r0)
            X.KXf r3 = (X.KXf) r3
            java.lang.String r5 = r3.A02
            if (r5 == 0) goto L_0x08f2
            com.instagram.hallpass.util.HallPassApiUtil r7 = com.instagram.hallpass.util.HallPassApiUtil.A00
            X.0eM r2 = r3.A05
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.LRl r2 = r3.A03
            java.util.Set r2 = r2.A03
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x093a:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0944
            X.C61036Jva.A01(r4, r3)
            goto L_0x093a
        L_0x0944:
            r0.A00 = r6
            X.0sn r11 = X.0sn.A00
            r9 = r5
            r10 = r4
            r12 = r0
            java.lang.Object r3 = r7.A02(r8, r9, r10, r11, r12)
            if (r3 != r1) goto L_0x08f0
            return r1
        L_0x0952:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0957:
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.FragmentActivity r3 = X.DbT.A0E(r0)
            r0 = -1
            r3.setResult(r0)
        L_0x0961:
            r3.finish()
            goto L_0x1184
        L_0x0966:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x096b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x098e
            if (r2 != r4) goto L_0x09af
            X.0eS.A00(r3)
        L_0x0977:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x09a6
            java.lang.Object r4 = r0.A02
            X.K6S r4 = (X.K6S) r4
            X.0sn r2 = X.0sn.A00
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.MWG r0 = (X.MWG) r0
            X.Dsp r0 = (X.C47203Dsp) r0
            java.util.List r1 = r0.A00
            goto L_0x09de
        L_0x098e:
            X.0eS.A00(r3)
            com.instagram.hallpass.util.HallPassApiUtil r3 = com.instagram.hallpass.util.HallPassApiUtil.A00
            java.lang.Object r2 = r0.A02
            X.KXf r2 = (X.KXf) r2
            X.0eM r2 = r2.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            r0.A00 = r4
            java.lang.Object r3 = r3.A07(r2, r0)
            if (r3 != r1) goto L_0x0977
            return r1
        L_0x09a6:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0a0f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x09af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09b4:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x09eb
            if (r2 != r5) goto L_0x0a35
            X.0eS.A00(r3)
        L_0x09c0:
            X.3Ii r3 = (X.C239803Ii) r3
            if (r3 != 0) goto L_0x09c8
        L_0x09c4:
            X.5sO r3 = X.DbU.A0f()
        L_0x09c8:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0a06
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.MWF r1 = (X.MWF) r1
            X.Dsm r1 = (X.C47200Dsm) r1
            java.util.List r1 = r1.A02
            if (r1 == 0) goto L_0x1184
            java.lang.Object r4 = r0.A02
            X.K6S r4 = (X.K6S) r4
            X.0sn r2 = X.0sn.A00
        L_0x09de:
            X.LRl r0 = r4.A03
            r0.A07(r2)
            r0.A08(r1)
            X.LRl.A00(r4, r0)
            goto L_0x1184
        L_0x09eb:
            java.lang.Object r2 = A00(r3, r0)
            X.KXf r2 = (X.KXf) r2
            java.lang.String r4 = r2.A02
            if (r4 == 0) goto L_0x09c4
            com.instagram.hallpass.util.HallPassApiUtil r3 = com.instagram.hallpass.util.HallPassApiUtil.A00
            X.0eM r2 = r2.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            r0.A00 = r5
            java.lang.Object r3 = r3.A04(r2, r4, r0)
            if (r3 != r1) goto L_0x09c0
            return r1
        L_0x0a06:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0a0f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a0f:
            java.lang.Object r5 = r0.A02
            X.K6S r5 = (X.K6S) r5
            r2 = 2131954708(0x7f130c14, float:1.9545923E38)
            android.content.Context r1 = r5.requireContext()
            java.lang.String r0 = "campfire_audience_picker_fetch_error"
            X.C59689JTv.A0F(r1, r0, r2)
            X.K9H r4 = r5.A09()
            android.content.Context r3 = r5.requireContext()
            X.6rr r2 = X.C320156rr.ERROR
            r1 = 63
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r5, (int) r1)
            r4.A04(r3, r0, r2)
            goto L_0x1184
        L_0x0a35:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a3a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0a61
            if (r2 != r4) goto L_0x0a7b
            X.0eS.A00(r3)
        L_0x0a47:
            java.lang.Object r2 = r0.A02
            X.2jD r2 = (X.C227402jD) r2
            com.instagram.common.session.UserSession r1 = r2.A02
            X.2jG r0 = new X.2jG
            r0.<init>(r1)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x1184
            r2.A06 = r4
            r0 = 0
            r2.A02(r0, r5, r5)
            goto L_0x1184
        L_0x0a61:
            java.lang.Object r2 = A00(r3, r0)
            X.2jD r2 = (X.C227402jD) r2
            r2.A06 = r5
            X.C227402jD.A00(r2)
            boolean r2 = r2.A06
            if (r2 != 0) goto L_0x1184
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0a47
            return r1
        L_0x0a7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a80:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0a8e
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a8e:
            java.lang.Object r4 = A00(r3, r0)
            X.AXg r4 = (X.C40242AXg) r4
            X.5Eb r2 = r4.A0G
            X.0V2 r3 = r2.A00
            int r2 = r4.A00
            java.lang.Integer r2 = X.JTO.A0w(r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x10bf
        L_0x0aa6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0ab4
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ab4:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager r2 = X.C299955wH.A00(r2)
            r0.A00 = r4
            java.lang.Object r0 = r2.A00(r0)
            goto L_0x10bf
        L_0x0ac6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0ad4
            if (r2 == r7) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ad4:
            java.lang.Object r6 = A00(r3, r0)
            X.NdD r6 = (X.C69028NdD) r6
            com.instagram.common.session.UserSession r2 = r6.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r2)
            X.64X r3 = new X.64X
            r3.<init>(r2)
            java.lang.Class<X.Osk> r2 = X.C71902Osk.class
            X.032 r5 = r3.A00(r2)
            r4 = 0
            r3 = 32
            X.Pfo r2 = new X.Pfo
            r2.<init>(r6, r4, r3)
            r0.A00 = r7
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x10bf
        L_0x0afb:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0b09
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b09:
            java.lang.Object r2 = A00(r3, r0)
            X.NdD r2 = (X.C69028NdD) r2
            com.instagram.friendmap.data.FriendMapRepository r3 = r2.A05
            X.4A5 r2 = X.AnonymousClass4A5.PRIVATE
            r0.A00 = r4
            java.lang.Object r0 = r3.A05(r2, r0)
            goto L_0x10bf
        L_0x0b1b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0b29
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b29:
            java.lang.Object r2 = A00(r3, r0)
            X.NdD r2 = (X.C69028NdD) r2
            com.instagram.friendmap.data.FriendMapRepository r6 = r2.A05
            r0.A00 = r4
            com.instagram.common.session.UserSession r2 = r6.A06
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r2)
            X.64X r3 = new X.64X
            r3.<init>(r2)
            java.lang.Class<X.Osv> r2 = X.C71913Osv.class
            X.032 r5 = r3.A00(r2)
            r4 = 0
            r3 = 18
            X.MH0 r2 = new X.MH0
            r2.<init>(r6, r4, r3)
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x0c25
        L_0x0b52:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0b60
            if (r2 == r7) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b60:
            java.lang.Object r6 = A00(r3, r0)
            X.NdA r6 = (X.NdA) r6
            com.instagram.friendmap.data.FriendMapRepository r2 = r6.A01
            X.0Ud r5 = r2.A0M
            r2 = 43
            X.MCm r4 = X.MCm.A00(r6, r2)
            r0.A00 = r7
            r3 = 10
            X.MCl r2 = new X.MCl
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6)
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x0c25
        L_0x0b7f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0bb2
            if (r2 != r4) goto L_0x0bc3
            X.0eS.A00(r3)
        L_0x0b8b:
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r4 = r0.A02
            X.MYL r4 = (X.MYL) r4
            if (r3 == 0) goto L_0x0ba1
            int r0 = r3.intValue()
            X.PGU r1 = new X.PGU
            r1.<init>(r0)
        L_0x0b9c:
            r4.A0P(r1)
            goto L_0x1184
        L_0x0ba1:
            r2 = 2131962768(0x7f132b90, float:1.956227E38)
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            com.instagram.friendmap.data.MapText$Res r0 = new com.instagram.friendmap.data.MapText$Res
            r0.<init>(r2, r1)
            X.PGV r1 = new X.PGV
            r1.<init>(r0)
            goto L_0x0b9c
        L_0x0bb2:
            java.lang.Object r2 = A00(r3, r0)
            X.HBO r2 = (X.HBO) r2
            com.instagram.friendmap.data.FriendMapAudienceListRepository r2 = r2.A01
            r0.A00 = r4
            java.lang.Object r3 = r2.A02(r0)
            if (r3 != r1) goto L_0x0b8b
            return r1
        L_0x0bc3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bc8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0bd6
            if (r2 == r6) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bd6:
            java.lang.Object r5 = A00(r3, r0)
            X.MYL r5 = (X.MYL) r5
            X.0Ud r4 = r5.A02
            r2 = 300(0x12c, double:1.48E-321)
            X.0r6 r4 = X.AnonymousClass11F.A00(r4, r2)
            r3 = 19
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x10bf
        L_0x0bf3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0c01
            if (r2 == r7) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c01:
            java.lang.Object r2 = A00(r3, r0)
            X.HBO r2 = (X.HBO) r2
            com.instagram.friendmap.data.FriendMapAudienceListRepository r6 = r2.A01
            r0.A00 = r7
            X.05G r2 = r6.A06
            java.lang.Object r2 = r2.getValue()
            X.Jve r2 = (X.C61040Jve) r2
            java.lang.String r5 = r2.A02
            if (r5 == 0) goto L_0x0c29
            X.4HW r4 = r6.A01
            r2 = 0
            X.MEF r3 = new X.MEF
            r3.<init>(r6, r5, r2, r7)
            X.0gF r2 = X.C60340gF.A00
            java.lang.Object r0 = r4.A00(r2, r0, r3)
        L_0x0c25:
            if (r0 != r1) goto L_0x0c29
            goto L_0x10bf
        L_0x0c29:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x10bf
        L_0x0c2d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0c3b
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c3b:
            java.lang.Object r4 = A00(r3, r0)
            X.HBO r4 = (X.HBO) r4
            com.instagram.friendmap.data.FriendMapAudienceListRepository r2 = r4.A01
            X.0r6 r3 = r2.A05
            r2 = 42
            X.MCm r2 = X.MCm.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x10bf
        L_0x0c53:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0c6a
            if (r2 != r4) goto L_0x0c7b
            X.0eS.A00(r3)
        L_0x0c5f:
            java.lang.Object r1 = r0.A02
            X.HBO r1 = (X.HBO) r1
            java.lang.String r0 = ""
            X.HBO.A00(r1, r0)
            goto L_0x1184
        L_0x0c6a:
            java.lang.Object r2 = A00(r3, r0)
            X.HBO r2 = (X.HBO) r2
            com.instagram.friendmap.data.FriendMapAudienceListRepository r2 = r2.A01
            r0.A00 = r4
            java.lang.Object r2 = r2.A01(r0)
            if (r2 != r1) goto L_0x0c5f
            return r1
        L_0x0c7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c80:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            r6 = 250(0xfa, double:1.235E-321)
            if (r2 == 0) goto L_0x0ca2
            if (r2 != r8) goto L_0x0cbf
            X.0eS.A00(r3)
        L_0x0c8e:
            java.lang.Object r2 = r0.A02
            X.NdZ r2 = (X.C69041NdZ) r2
            X.N4t r0 = r2.A0P
            X.Ncz r1 = new X.Ncz
            r1.<init>(r0)
            java.lang.Long r0 = X.JTO.A0y(r6)
            r2.A0M(r1, r0)
            goto L_0x1184
        L_0x0ca2:
            X.0eS.A00(r3)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r0.A02
            X.NdZ r2 = (X.C69041NdZ) r2
            long r2 = r2.A01
            long r4 = r4 - r2
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c8e
            long r2 = r6 - r4
            r0.A00 = r8
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0c8e
            return r1
        L_0x0cbf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cc4:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0cd2
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cd2:
            java.lang.Object r4 = A00(r3, r0)
            X.GZF r4 = (X.GZF) r4
            int r3 = r4.A03()
            int r3 = r3 - r5
            goto L_0x10b4
        L_0x0cdf:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            if (r2 == 0) goto L_0x0d9d
            if (r2 != r10) goto L_0x0db8
            X.0eS.A00(r3)
        L_0x0ceb:
            X.4A6 r3 = (X.AnonymousClass4A6) r3
            if (r3 == 0) goto L_0x1184
            java.lang.Object r12 = r0.A02
            com.instagram.friendmap.data.FriendMapRepository r12 = (com.instagram.friendmap.data.FriendMapRepository) r12
            java.util.List r0 = r3.A06
            int r0 = r0.size()
            r11 = 2
            if (r0 <= r11) goto L_0x0cfe
            r12.A02 = r3
        L_0x0cfe:
            X.05G r1 = r12.A0I
        L_0x0d00:
            boolean r0 = X.JTP.A1b(r3, r1)
            if (r0 == 0) goto L_0x0d00
            X.05G r9 = r12.A0H
        L_0x0d08:
            java.lang.Object r8 = r9.getValue()
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0d17:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0d90
            java.lang.Object r6 = r16.next()
            X.N3Q r6 = (X.N3Q) r6
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0d8c
            java.lang.String r5 = r6.A09
            java.lang.String r0 = r6.A08
            r36 = r0
            com.facebook.android.maps.model.LatLng r4 = r6.A02
            X.4AB r0 = r6.A03
            r23 = r0
            com.instagram.user.model.User r3 = r6.A04
            long r1 = r6.A01
            boolean r0 = r6.A0D
            r22 = r0
            boolean r0 = r6.A0E
            r21 = r0
            boolean r0 = r6.A0F
            r20 = r0
            boolean r0 = r6.A0A
            r19 = r0
            boolean r0 = r6.A0C
            r18 = r0
            int r0 = r6.A00
            r17 = r0
            java.lang.String r0 = r6.A07
            r24 = r0
            r15 = 0
            boolean r14 = r6.A0G
            java.lang.String r13 = r6.A06
            java.lang.Integer r0 = r6.A05
            X.0qQ.A0B(r5, r15)
            X.AnonymousClass7TF.A1D(r4, r11, r3)
            r6 = 16
            X.0qQ.A0B(r0, r6)
            X.N3Q r6 = new X.N3Q
            r25 = r13
            r26 = r17
            r27 = r1
            r29 = r22
            r30 = r21
            r31 = r20
            r32 = r19
            r33 = r18
            r34 = r15
            r35 = r14
            r17 = r6
            r18 = r4
            r19 = r23
            r20 = r3
            r21 = r0
            r22 = r5
            r23 = r36
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
        L_0x0d8c:
            r7.add(r6)
            goto L_0x0d17
        L_0x0d90:
            boolean r0 = r9.AIY(r8, r7)
            if (r0 == 0) goto L_0x0d08
            X.05G r0 = r12.A0J
            X.AnonymousClass7TF.A1O(r0, r10)
            goto L_0x1184
        L_0x0d9d:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.friendmap.data.FriendMapRepository r2 = (com.instagram.friendmap.data.FriendMapRepository) r2
            X.4A4 r4 = r2.A09
            X.05G r2 = r2.A0I
            java.lang.Object r3 = r2.getValue()
            X.4A6 r3 = (X.AnonymousClass4A6) r3
            r0.A00 = r10
            com.instagram.friendmap.data.FriendMapGraphQLImpl r2 = r4.A00
            java.lang.Object r3 = r2.A02(r3, r0, r10)
            if (r3 != r1) goto L_0x0ceb
            return r1
        L_0x0db8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dbd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0dcb
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dcb:
            java.lang.Object r4 = A00(r3, r0)
            com.instagram.friendmap.data.FriendMapRepository r4 = (com.instagram.friendmap.data.FriendMapRepository) r4
            X.05G r2 = r4.A0I
            java.lang.Object r2 = r2.getValue()
            X.4A6 r2 = (X.AnonymousClass4A6) r2
            X.4A5 r3 = r2.A04
            X.4A5 r2 = X.AnonymousClass4A5.UNSET
            boolean r2 = X.AnonymousClass7TF.A1W(r3, r2)
            if (r2 == 0) goto L_0x1184
            X.4A5 r2 = X.AnonymousClass4A5.PRIVATE
            r0.A00 = r5
            java.lang.Object r0 = r4.A05(r2, r0)
            goto L_0x10bf
        L_0x0ded:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0dfb
            if (r2 == r7) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dfb:
            java.lang.Object r6 = A00(r3, r0)
            com.instagram.friendmap.data.FriendMapRepository r6 = (com.instagram.friendmap.data.FriendMapRepository) r6
            X.05G r2 = r6.A0K
            X.0qC r5 = new X.0qC
            r5.<init>(r2)
            r4 = 0
            r3 = 17
            X.MH0 r2 = new X.MH0
            r2.<init>(r6, r4, r3)
            r0.A00 = r7
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x10bf
        L_0x0e18:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0e26
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e26:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            r0.A00 = r4
            java.lang.Object r0 = r2.A04(r0, r4)
            goto L_0x10bf
        L_0x0e34:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0e42
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e42:
            java.lang.Object r3 = A00(r3, r0)
            com.instagram.feed.tifu.TifuViewModel r3 = (com.instagram.feed.tifu.TifuViewModel) r3
            r2 = 0
            r0.A00 = r4
            java.lang.Object r0 = r3.A04(r0, r2)
            goto L_0x10bf
        L_0x0e51:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0e5f
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e5f:
            java.lang.Object r2 = A00(r3, r0)
            X.2uE r2 = (X.AnonymousClass2uE) r2
            X.57N r3 = r2.A0U
            X.1Xj r2 = r2.A07()
            r0.A00 = r4
            java.lang.Object r0 = r3.AJy(r2, r0)
            goto L_0x10bf
        L_0x0e73:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0e81
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e81:
            java.lang.Object r2 = A00(r3, r0)
            X.2uE r2 = (X.AnonymousClass2uE) r2
            X.57N r4 = r2.A0U
            X.1Xj r3 = r2.A07()
            r0.A00 = r5
            r2 = 0
            java.lang.Object r0 = r4.AJx(r3, r0, r2)
            goto L_0x10bf
        L_0x0e96:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0ea4
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ea4:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r2 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r2
            r0.A00 = r4
            java.lang.Object r0 = com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A05(r2, r0)
            goto L_0x10bf
        L_0x0eb2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0ec0
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ec0:
            java.lang.Object r2 = A00(r3, r0)
            X.JiU r2 = (X.C60273JiU) r2
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r3 = r2.A02
            com.instagram.common.session.UserSession r2 = r2.A00
            boolean r2 = X.AnonymousClass2o2.A02(r2)
            r0.A00 = r4
            java.lang.Object r0 = r3.A01(r0, r2)
            goto L_0x10bf
        L_0x0ed6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0eef
            if (r2 != r4) goto L_0x0f02
            X.0eS.A00(r3)
        L_0x0ee2:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x1184
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x1184
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0eef:
            java.lang.Object r2 = A00(r3, r0)
            X.JiU r2 = (X.C60273JiU) r2
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r2 = r2.A02
            r0.A00 = r4
            com.instagram.fanclub.api.FanClubApi r2 = r2.A00
            java.lang.Object r3 = r2.A0R(r0)
            if (r3 != r1) goto L_0x0ee2
            return r1
        L_0x0f02:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f07:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0f15
            if (r2 == r4) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f15:
            java.lang.Object r2 = A00(r3, r0)
            X.JiU r2 = (X.C60273JiU) r2
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r2 = r2.A02
            r0.A00 = r4
            java.lang.Object r0 = r2.A00(r0)
            goto L_0x10bf
        L_0x0f25:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0f78
            if (r2 != r5) goto L_0x0fa5
            X.0eS.A00(r3)
        L_0x0f31:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r4 = r0.A02
            X.EN2 r4 = (X.EN2) r4
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0f6f
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.C7k r0 = (X.C43740C7k) r0
            if (r0 == 0) goto L_0x0f5b
            X.C7j r0 = r0.A0E()
            if (r0 == 0) goto L_0x0f5b
            X.C7i r0 = r0.A0E()
            if (r0 == 0) goto L_0x0f5b
            X.C7h r2 = r0.A0E()
            if (r2 == 0) goto L_0x0f5b
            r1 = 3
            java.lang.String r0 = "sku"
            r2.getOptionalStringField(r1, r0)
        L_0x0f5b:
            X.EN2.A00(r4)
            X.3Ih r3 = X.C51967G9n.A0d()
        L_0x0f62:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x1184
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0fa0
            X.EN2.A00(r4)
            goto L_0x1184
        L_0x0f6f:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0f62
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0f78:
            java.lang.Object r4 = A00(r3, r0)
            X.E4f r4 = (X.C47480E4f) r4
            com.instagram.common.session.UserSession r2 = r4.A05()
            com.instagram.fanclub.api.FanClubApi r3 = new com.instagram.fanclub.api.FanClubApi
            r3.<init>(r2)
            com.instagram.common.session.UserSession r2 = r4.A05()
            java.lang.String r2 = r2.A06
            r0.A00 = r5
            r9 = 0
            r6 = r3
            r7 = r2
            r8 = r0
            r10 = r9
            r11 = r5
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            java.lang.Object r3 = r6.A0J(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r3 != r1) goto L_0x0f31
            return r1
        L_0x0fa0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0fa5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0faa:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0fb8
            if (r2 == r7) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fb8:
            java.lang.Object r6 = A00(r3, r0)
            X.DlK r6 = (X.C46790DlK) r6
            X.1Ng r2 = r6.A02
            X.64X r3 = new X.64X
            r3.<init>(r2)
            java.lang.Class<X.1qJ> r2 = X.1qJ.class
            X.032 r3 = r3.A00(r2)
            r2 = 4
            X.MC0 r5 = new X.MC0
            r5.<init>(r2, r6, r3)
            r4 = 0
            r3 = 18
            X.MGs r2 = new X.MGs
            r2.<init>(r6, r4, r3)
            r0.A00 = r7
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r5)
            goto L_0x10bf
        L_0x0fe1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x1019
            if (r2 != r6) goto L_0x1086
            X.0eS.A00(r3)
        L_0x0fee:
            X.3Ii r3 = (X.C239803Ii) r3
            if (r3 == 0) goto L_0x1184
            java.lang.Object r4 = r0.A02
            X.DlK r4 = (X.C46790DlK) r4
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x102a
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r5 = r3.A00
            X.05G r1 = r4.A0A
            int r0 = X.JTR.A0K(r1)
            int r0 = r0 - r6
            X.JTQ.A1N(r1, r0)
            X.05G r4 = r4.A0B
            long r2 = X.JTR.A0L()
            r1 = 7
            X.GnR r0 = new X.GnR
            r0.<init>(r2, r5, r1)
            r4.Epw(r0)
            goto L_0x1184
        L_0x1019:
            java.lang.Object r2 = A00(r3, r0)
            X.DlK r2 = (X.C46790DlK) r2
            com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r2 = r2.A05
            r0.A00 = r6
            java.lang.Object r3 = r2.A01(r0)
            if (r3 != r1) goto L_0x0fee
            return r1
        L_0x102a:
            boolean r2 = r3 instanceof X.C297815sO
            if (r2 == 0) goto L_0x1043
            X.05G r3 = r4.A0A
            int r2 = X.JTR.A0K(r3)
            int r2 = r2 - r6
            X.JTQ.A1N(r3, r2)
            X.3ju r3 = r4.A07
            X.KRl r2 = X.C61916KRl.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x10bf
        L_0x1043:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1048:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x1056
            if (r2 == r6) goto L_0x1070
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1056:
            java.lang.Object r5 = A00(r3, r0)
            X.NdC r5 = (X.NdC) r5
            com.instagram.friendmap.data.FriendMapRepository r2 = r5.A03
            X.0Ud r4 = r2.A0M
            r3 = 54
            X.PeL r2 = new X.PeL
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x1073
            return r1
        L_0x1070:
            X.0eS.A00(r3)
        L_0x1073:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x1078:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x108b
            if (r2 == r5) goto L_0x1086
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1086:
            X.0eS.A00(r3)
            goto L_0x1184
        L_0x108b:
            java.lang.Object r4 = A00(r3, r0)
            X.E4g r4 = (X.C47481E4g) r4
            X.0eM r2 = r4.A05
            java.lang.Object r2 = r2.getValue()
            X.DlK r2 = (X.C46790DlK) r2
            X.0r6 r3 = r2.A08
            r2 = 37
            X.MCm r2 = X.MCm.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x10bf
        L_0x10a8:
            java.lang.Object r4 = A00(r3, r0)
            X.GZF r4 = (X.GZF) r4
            int r2 = r4.A03()
            int r3 = r2 + 1
        L_0x10b4:
            r2 = 0
            r0.A00 = r5
            X.5b7 r2 = X.C51972G9s.A0J(r2)
            java.lang.Object r0 = r4.A06(r2, r0, r3)
        L_0x10bf:
            if (r0 != r1) goto L_0x1184
            return r1
        L_0x10c2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x1102
            if (r2 != r4) goto L_0x112d
            X.0eS.A00(r3)
        L_0x10ce:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r1 = r0.A02
            X.Lip r1 = (X.C64829Lip) r1
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x1113
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.MWC r0 = (X.MWC) r0
            X.05G r4 = r1.A03
            X.JxD r0 = (X.C61102JxD) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x10ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x111c
            java.lang.Object r0 = r2.next()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            goto L_0x10ec
        L_0x1102:
            java.lang.Object r2 = A00(r3, r0)
            X.Lip r2 = (X.C64829Lip) r2
            com.instagram.fanclub.api.FanClubApi r2 = r2.A00
            r0.A00 = r4
            java.lang.Object r3 = r2.A0P(r0)
            if (r3 != r1) goto L_0x10ce
            return r1
        L_0x1113:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x1120
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x111c:
            X.3Ih r3 = X.Dba.A0S(r3, r4)
        L_0x1120:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x1184
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x1184
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x112d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1132:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x1190
            if (r2 != r4) goto L_0x11b9
            X.0eS.A00(r3)
        L_0x113e:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r4 = r0.A02
            X.Jha r4 = (X.C60217Jha) r4
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x1187
            java.lang.Object r3 = X.C51972G9s.A0m(r3)
            X.0qQ.A07(r3)
            X.Jtb r3 = (X.C60917Jtb) r3
            X.05G r2 = r4.A0A
            java.util.Collection r1 = X.JTO.A13(r2)
            java.util.List r0 = r3.A01
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r2.Epw(r0)
            boolean r0 = r3.A02
            r4.A01 = r0
            java.lang.String r0 = r3.A00
            r4.A00 = r0
            X.05G r1 = r4.A09
            r0 = 0
            X.AnonymousClass7TF.A1O(r1, r0)
            r4.A02 = r0
            X.3Ih r3 = X.C51967G9n.A0d()
        L_0x1174:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x1184
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x11b4
            X.05G r1 = r4.A09
            r0 = 0
            X.AnonymousClass7TF.A1O(r1, r0)
            r4.A02 = r0
        L_0x1184:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x1187:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x1174
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1190:
            java.lang.Object r3 = A00(r3, r0)
            X.Jha r3 = (X.C60217Jha) r3
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x1184
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x1184
            X.05G r2 = r3.A09
            X.AnonymousClass7TF.A1O(r2, r4)
            r3.A02 = r4
            X.L4Y r2 = r3.A05
            java.lang.String r3 = r3.A00
            r0.A00 = r4
            com.instagram.fanclub.api.FanClubApi r2 = r2.A01
            java.lang.Object r3 = r2.A0A(r3, r0)
            if (r3 != r1) goto L_0x113e
            return r1
        L_0x11b4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x11b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MG8 mg8) {
        0eS.A00(obj);
        return mg8.A02;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MG8) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
