package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MG0 extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG0(AnonymousClass4D7 r2) {
        super(2, r2);
        this.A01 = 0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.MG0] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4D7, X.MG0] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        Object obj2;
        int i;
        switch (this.A01) {
            case 0:
                ? mg0 = new MG0(r5);
                mg0.A00 = obj;
                return mg0;
            case 1:
                obj2 = this.A00;
                i = 1;
                break;
            case 2:
                obj2 = this.A00;
                i = 2;
                break;
            case 3:
                obj2 = this.A00;
                i = 3;
                break;
            case 4:
                obj2 = this.A00;
                i = 4;
                break;
            case 5:
                obj2 = this.A00;
                i = 5;
                break;
            case 6:
                obj2 = this.A00;
                i = 6;
                break;
            case 7:
                obj2 = this.A00;
                i = 7;
                break;
            case 8:
                obj2 = this.A00;
                i = 8;
                break;
            case 9:
                obj2 = this.A00;
                i = 9;
                break;
            case 10:
                obj2 = this.A00;
                i = 10;
                break;
            case 11:
                obj2 = this.A00;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj2 = this.A00;
                i = 12;
                break;
            case 13:
                obj2 = this.A00;
                i = 13;
                break;
            case 14:
                obj2 = this.A00;
                i = 14;
                break;
            case 15:
                obj2 = this.A00;
                i = 15;
                break;
            case 16:
                obj2 = this.A00;
                i = 16;
                break;
            case 17:
                obj2 = this.A00;
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                obj2 = this.A00;
                i = 18;
                break;
            case 19:
                obj2 = this.A00;
                i = 19;
                break;
            case 20:
                obj2 = this.A00;
                i = 20;
                break;
            case 21:
                obj2 = this.A00;
                i = 21;
                break;
            case 22:
                obj2 = this.A00;
                i = 22;
                break;
            case 23:
                obj2 = this.A00;
                i = 23;
                break;
            case 24:
                obj2 = this.A00;
                i = 24;
                break;
            case 25:
                obj2 = this.A00;
                i = 25;
                break;
            case 26:
                obj2 = this.A00;
                i = 26;
                break;
            case 27:
                obj2 = this.A00;
                i = 27;
                break;
            case 28:
                obj2 = this.A00;
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                obj2 = this.A00;
                i = 29;
                break;
            case 30:
                obj2 = this.A00;
                i = 30;
                break;
            case 31:
                obj2 = this.A00;
                i = 31;
                break;
            case 32:
                obj2 = this.A00;
                i = 32;
                break;
            case 33:
                obj2 = this.A00;
                i = 33;
                break;
            case 34:
                obj2 = this.A00;
                i = 34;
                break;
            case 35:
                obj2 = this.A00;
                i = 35;
                break;
            case 36:
                obj2 = this.A00;
                i = 36;
                break;
            case 37:
                obj2 = this.A00;
                i = 37;
                break;
            case 38:
                obj2 = this.A00;
                i = 38;
                break;
            case 39:
                obj2 = this.A00;
                i = 39;
                break;
            case 40:
                obj2 = this.A00;
                i = 40;
                break;
            case Seq.NULL_REFNUM:
                obj2 = this.A00;
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET:
                obj2 = this.A00;
                i = 42;
                break;
            case 43:
                obj2 = this.A00;
                i = 43;
                break;
            case 44:
                obj2 = this.A00;
                i = 44;
                break;
            case 45:
                obj2 = this.A00;
                i = 45;
                break;
            case 46:
                obj2 = this.A00;
                i = 46;
                break;
            case 47:
                obj2 = this.A00;
                i = 47;
                break;
            case 48:
                obj2 = this.A00;
                i = 48;
                break;
            default:
                obj2 = this.A00;
                i = 49;
                break;
        }
        return new MG0(obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 r4;
        Object obj3;
        AnonymousClass4D7 create;
        switch (this.A01) {
            case 6:
            case 24:
                r4 = (AnonymousClass4D7) obj2;
                obj3 = Float.valueOf(AnonymousClass7TE.A04(obj));
                break;
            case 21:
                r4 = (AnonymousClass4D7) obj2;
                obj3 = Integer.valueOf(AnonymousClass7TE.A0M(obj));
                break;
            case 46:
                r4 = (AnonymousClass4D7) obj2;
                obj3 = Long.valueOf(AnonymousClass7TE.A0R(obj));
                break;
            default:
                create = AnonymousClass7TE.A1M(obj2, obj, this);
                break;
        }
        create = create(obj3, r4);
        return ((MG0) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r2v55, types: [X.LO1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04ee, code lost:
        r3 = r4.A11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0541, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r4.A0J), 36329066772709134L) != false) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0578, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x057f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x059f, code lost:
        r3 = "stackedTimelineViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05b5, code lost:
        if (r4 != X.C48153EZv.A05) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05d1, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0799, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07c5, code lost:
        X.AnonymousClass7TF.A1O(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03c0, code lost:
        r1 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A01
            r1 = r19
            switch(r0) {
                case 0: goto L_0x0815;
                case 1: goto L_0x07e9;
                case 2: goto L_0x07dc;
                case 3: goto L_0x07ca;
                case 4: goto L_0x07aa;
                case 5: goto L_0x0009;
                case 6: goto L_0x0766;
                case 7: goto L_0x0750;
                case 8: goto L_0x0741;
                case 9: goto L_0x06ec;
                case 10: goto L_0x06b3;
                case 11: goto L_0x06a8;
                case 12: goto L_0x0516;
                case 13: goto L_0x0509;
                case 14: goto L_0x04fe;
                case 15: goto L_0x0826;
                case 16: goto L_0x04de;
                case 17: goto L_0x04bf;
                case 18: goto L_0x04ae;
                case 19: goto L_0x045e;
                case 20: goto L_0x056c;
                case 21: goto L_0x041d;
                case 22: goto L_0x0412;
                case 23: goto L_0x0013;
                case 24: goto L_0x03f7;
                case 25: goto L_0x03ed;
                case 26: goto L_0x03c3;
                case 27: goto L_0x0009;
                case 28: goto L_0x0339;
                case 29: goto L_0x031f;
                case 30: goto L_0x02e4;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02b6;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x02a7;
                case 36: goto L_0x02a7;
                case 37: goto L_0x025b;
                case 38: goto L_0x022b;
                case 39: goto L_0x06a8;
                case 40: goto L_0x0220;
                case 41: goto L_0x0205;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01cf;
                case 44: goto L_0x01c4;
                case 45: goto L_0x01c4;
                case 46: goto L_0x012a;
                case 47: goto L_0x00e2;
                case 48: goto L_0x0025;
                case 49: goto L_0x0025;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = A00(r1, r2)
            X.DbS.A1U(r0)
        L_0x0010:
            X.0gF r0 = X.C60340gF.A00
        L_0x0012:
            return r0
        L_0x0013:
            java.lang.Object r0 = A00(r1, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.KMS r0 = r0.A0E
            if (r0 != 0) goto L_0x0021
            java.lang.String r3 = "videoTrackViewController"
            goto L_0x0578
        L_0x0021:
            r0.A0D()
            goto L_0x0010
        L_0x0025:
            java.lang.Object r3 = A00(r1, r2)
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r6 = r0.A05
            java.lang.Object r5 = r6.getValue()
            X.Jur r5 = (X.C60995Jur) r5
            X.0Ud r7 = r0.A04
            r7.getValue()
            X.EZv r4 = r5.A01
            X.5wF r1 = r5.A00
            if (r4 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00db
            X.5w9 r0 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r8 = r3.A0J
            X.5nZ r2 = X.JTT.A0S(r8)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x05a2
            if (r2 == 0) goto L_0x05a2
            X.C65229LpZ.A00(r3, r1)
            X.C65229LpZ.A02(r3, r1, r4)
            X.C65229LpZ.A01(r3, r1, r4)
            X.4DH r6 = r3.A0I
            android.content.Context r7 = r6.requireContext()
            r0 = 2131952006(0x7f130186, float:1.9540443E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r7, r0)
            r0 = 2131973685(0x7f135635, float:1.9584413E38)
            r17 = 1
            r14 = 0
            java.lang.String r1 = X.DbY.A0c(r7, r4, r0)
            android.view.View r5 = r3.A01
            if (r5 == 0) goto L_0x00d9
            r0 = 2131428209(0x7f0b0371, float:1.8478056E38)
            android.view.View r0 = r5.requireViewById(r0)
            if (r0 == 0) goto L_0x0080
            r0.setVisibility(r14)
        L_0x0080:
            android.view.View r5 = r3.A00
            if (r5 == 0) goto L_0x0087
            r5.setVisibility(r14)
        L_0x0087:
            r10 = 0
            r6.requireContext()
            X.AnonymousClass5w9.A00(r8)
            boolean r15 = X.C363558jv.A00(r8)
            boolean r6 = r2.A05
            X.5nY r5 = r2.A01
            java.lang.String r13 = r5.name()
            java.lang.String r9 = "default_privacy_instruction_view_impression"
            java.lang.String r12 = "share_sheet"
            r11 = r10
            r16 = r6
            X.C295105na.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00a4:
            com.instagram.igds.components.switchbutton.IgdsSwitch r5 = r3.A0B
            if (r5 == 0) goto L_0x00ab
            r5.setChecked(r14)
        L_0x00ab:
            com.instagram.igds.components.switchbutton.IgdsSwitch r5 = r3.A0B
            if (r5 == 0) goto L_0x00b2
            r5.setClickable(r14)
        L_0x00b2:
            android.view.View r6 = r3.A01
            if (r6 == 0) goto L_0x00bb
            r5 = 57
            X.LYG.A02(r6, r5, r3, r2)
        L_0x00bb:
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0010
            int r16 = X.DbV.A02(r7)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            r5 = 16
            X.04x r11 = new X.04x
            r11.<init>(r5, r1)
            X.K94 r10 = new X.K94
            r13 = r3
            r14 = r2
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.AnonymousClass7AV.A07(r10, r0, r4, r1)
            goto L_0x0010
        L_0x00d9:
            r0 = 0
            goto L_0x00a4
        L_0x00db:
            android.view.View r0 = r3.A01
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0010
        L_0x00e2:
            java.lang.Object r4 = A00(r1, r2)
            X.JjG r4 = (X.C60313JjG) r4
            X.LE1 r0 = r4.A02
            r0.A00()
            X.05G r3 = r4.A06
        L_0x00ef:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.JU0 r1 = (X.JU0) r1
            X.7wl r0 = r4.A04
            X.0Ud r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.7wn r0 = (X.C347427wn) r0
            if (r0 == 0) goto L_0x0128
            X.MXB r7 = r0.CGy()
        L_0x0106:
            boolean r9 = X.C60313JjG.A03(r4)
            int r0 = r1.A01
            int r8 = r0 + 1
            java.lang.Object r6 = r1.A03
            X.LE1 r6 = (X.LE1) r6
            boolean r10 = r1.A04
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.JU0 r5 = new X.JU0
            r5.<init>((X.LE1) r6, (X.MXB) r7, (int) r8, (boolean) r9, (boolean) r10)
            boolean r0 = r3.AIY(r2, r5)
            if (r0 == 0) goto L_0x00ef
            r4.A04()
            goto L_0x0010
        L_0x0128:
            r7 = 0
            goto L_0x0106
        L_0x012a:
            java.lang.Object r0 = A00(r1, r2)
            X.JjG r0 = (X.C60313JjG) r0
            X.EZv r1 = X.C48153EZv.A05
            com.instagram.common.session.UserSession r6 = r0.A01
            com.google.common.collect.ImmutableList r5 = X.C63418Kwe.A00(r6)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0175
            r4 = 0
            java.lang.Object r2 = r5.get(r4)
            X.EZv r1 = X.C48153EZv.A05
            if (r2 != r1) goto L_0x0175
            X.05G r3 = r0.A05
        L_0x0149:
            java.lang.Object r7 = r3.getValue()
            r2 = r7
            X.Jur r2 = (X.C60995Jur) r2
            java.lang.Object r1 = r5.get(r4)
            X.EZv r1 = (X.C48153EZv) r1
            boolean r13 = r1.A07(r6)
            java.lang.Object r10 = r5.get(r4)
            X.EZv r10 = (X.C48153EZv) r10
            boolean r12 = r2.A06
            X.5wF r9 = r2.A00
            java.lang.String r11 = r2.A02
            boolean r14 = r2.A03
            boolean r15 = r2.A05
            X.Jur r8 = new X.Jur
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r3.AIY(r7, r8)
            if (r1 == 0) goto L_0x0149
        L_0x0175:
            X.05G r1 = r0.A05
        L_0x0177:
            java.lang.Object r3 = r1.getValue()
            r2 = r3
            X.Jur r2 = (X.C60995Jur) r2
            r8 = 1
            boolean r9 = r2.A04
            X.5wF r5 = r2.A00
            java.lang.String r7 = r2.A02
            boolean r10 = r2.A03
            X.EZv r6 = r2.A01
            boolean r11 = r2.A05
            X.Jur r4 = new X.Jur
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r1.AIY(r3, r4)
            if (r2 == 0) goto L_0x0177
            X.8jd r3 = r0.A03
            com.facebook.common.callercontext.CallerContext r2 = r0.A00
            X.5wF r5 = r3.A00(r2)
        L_0x019e:
            java.lang.Object r3 = r1.getValue()
            r2 = r3
            X.Jur r2 = (X.C60995Jur) r2
            java.lang.String r7 = r5.A05
            boolean r8 = r2.A06
            boolean r9 = r2.A04
            boolean r10 = r2.A03
            X.EZv r6 = r2.A01
            boolean r11 = r2.A05
            X.Jur r4 = new X.Jur
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r1.AIY(r3, r4)
            if (r2 == 0) goto L_0x019e
            X.C60313JjG.A01(r0)
            r1.getValue()
            goto L_0x0010
        L_0x01c4:
            java.lang.Object r0 = A00(r1, r2)
            X.K66 r0 = (X.K66) r0
            X.K66.A0G(r0)
            goto L_0x0010
        L_0x01cf:
            java.lang.Object r2 = A00(r1, r2)
            X.JcV r2 = (X.C59962JcV) r2
            X.JcW r1 = X.C59962JcV.A01(r2)
            java.util.Map r5 = r2.A0W
            com.instagram.common.session.UserSession r3 = r1.A09
            X.82q r4 = r1.A0A
            r0 = 40
            X.MP4 r7 = new X.MP4
            r7.<init>(r1, r0)
            r0 = 36
            X.Jbg r6 = X.C59917Jbg.A00(r1, r0)
            X.C63197Kt4.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0010
        L_0x01f1:
            java.lang.Object r3 = A00(r1, r2)
            X.K6Q r3 = (X.K6Q) r3
            X.0eM r0 = r3.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.8sM r1 = X.C368278sM.VIEW
            r0 = 0
            X.K6Q.A00(r1, r2, r3, r0)
            goto L_0x0010
        L_0x0205:
            java.lang.Object r0 = A00(r1, r2)
            X.K7L r0 = (X.K7L) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.8sM r3 = X.C368278sM.VIEW
            X.818 r2 = X.AnonymousClass818.IG_FEED_COMPOSER_SHARE_BUTTON
            X.819 r1 = X.AnonymousClass819.BOTTOMSHEET_FEED_THREADS
            X.81A r0 = X.JTO.A0O()
            X.C368288sN.A00(r2, r3, r1, r0, r4)
            goto L_0x0010
        L_0x0220:
            java.lang.Object r0 = A00(r1, r2)
            X.GgQ r0 = (X.C52973GgQ) r0
            X.C52973GgQ.A05(r0)
            goto L_0x0010
        L_0x022b:
            java.lang.Object r0 = A00(r1, r2)
            X.GgF r0 = (X.C52962GgF) r0
            X.1Av r1 = r0.A04
            X.8hK r0 = r0.A03
            r4 = 0
            java.lang.String r2 = X.1Av.A00(r0)
            X.0xa r1 = r1.A01
            X.0xY r3 = r1.AR4()
            java.lang.String r0 = X.1Av.A00(r0)
            int r0 = r1.getInt(r0, r4)
            int r0 = r0 + 1
            r3.E5Z(r2, r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "preference_feed_picker_nux_last_seen_time"
            r3.E5c(r0, r1)
            r3.apply()
            goto L_0x0010
        L_0x025b:
            java.lang.Object r0 = A00(r1, r2)
            X.GgF r0 = (X.C52962GgF) r0
            X.I4e r0 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A01
            X.27r r4 = X.27p.A01(r0)
            r3 = 40
            X.0wc r1 = r4.A01
            java.lang.String r0 = "ig_camera_notification_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0010
            X.AnonymousClass7TH.A0W(r2, r4)
            X.283 r1 = r4.A04
            X.JTP.A1I(r2, r1)
            java.lang.String r0 = "entity_type"
            X.AnonymousClass7TE.A1W(r2, r0, r3)
            X.AnonymousClass7TH.A0U(r2)
            X.JTS.A19(r2, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = "interest_topic_pick_session_id"
            r2.AAJ(r0, r1)
            X.JTP.A1F(r2)
            X.DbY.A1C(r2)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "is_crosspost"
            r2.A7p(r0, r1)
            r2.Cgf()
            goto L_0x0010
        L_0x02a7:
            java.lang.Object r1 = A00(r1, r2)
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Float r0 = X.C51967G9n.A0h()
            r1.Epw(r0)
            goto L_0x0010
        L_0x02b6:
            java.lang.Object r2 = A00(r1, r2)
            com.instagram.creation.fragment.AlbumEditFragment r2 = (com.instagram.creation.fragment.AlbumEditFragment) r2
            X.0eM r0 = r2.A0f
            java.lang.Object r1 = r0.getValue()
            X.JjS r1 = (X.C60323JjS) r1
            java.util.Map r0 = r2.A0R
            r1.A04(r2, r0)
            goto L_0x0010
        L_0x02cb:
            java.lang.Object r0 = A00(r1, r2)
            X.Jil r0 = (X.C60289Jil) r0
            X.L0f r0 = r0.A04
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            r1 = 0
            X.LfY r0 = new X.LfY
            r0.<init>(r1)
            r2.A00(r0)
            goto L_0x0010
        L_0x02e4:
            java.lang.Object r2 = A00(r1, r2)
            X.Jie r2 = (X.C60283Jie) r2
            X.L9e r1 = r2.A03
            X.05G r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0010
            X.L0b r0 = r2.A01
            java.lang.String r3 = r1.A03
            X.L80 r1 = r0.A00
            X.0eM r0 = r1.A02
            java.lang.Object r2 = r0.getValue()
            X.0Ak r2 = (X.0Ak) r2
            if (r2 == 0) goto L_0x0010
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r0 = r0.A06
            long r0 = X.DbZ.A07(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_igid"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "media_type"
            r2.A0R(r0, r3)
            r2.Cgf()
            goto L_0x0010
        L_0x031f:
            java.lang.Object r0 = A00(r1, r2)
            X.Jie r0 = (X.C60283Jie) r0
            X.L0c r0 = r0.A04
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A7W
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 407(0x197, float:5.7E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            goto L_0x0010
        L_0x0339:
            java.lang.Object r2 = A00(r1, r2)
            X.Jie r2 = (X.C60283Jie) r2
            X.C60283Jie.A00(r2)
            X.L9e r5 = r2.A03
            X.0Ud r0 = r2.A07
            java.lang.String r1 = X.JTO.A11(r0)
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            if (r1 == 0) goto L_0x0359
            int r0 = r1.hashCode()
            switch(r0) {
                case -1033823679: goto L_0x03b6;
                case 1409410526: goto L_0x03ab;
                case 1999394194: goto L_0x03a0;
                case 2032871314: goto L_0x0395;
                default: goto L_0x0359;
            }
        L_0x0359:
            r1 = 0
        L_0x035a:
            java.lang.String r3 = r5.A03
            X.Lft r0 = new X.Lft
            r0.<init>(r1, r3)
            r4.A00(r0)
            X.05G r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0010
            X.L0b r0 = r2.A01
            X.L80 r1 = r0.A00
            X.0eM r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            X.0Ak r2 = (X.0Ak) r2
            if (r2 == 0) goto L_0x0010
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r0 = r0.A06
            long r0 = X.DbZ.A07(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_igid"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "media_type"
            r2.A0R(r0, r3)
            r2.Cgf()
            goto L_0x0010
        L_0x0395:
            java.lang.String r0 = "Instagram"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0359
            X.Khl r0 = X.C62555Khl.CTD
            goto L_0x03c0
        L_0x03a0:
            java.lang.String r0 = "WhatsApp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0359
            X.Khl r0 = X.C62555Khl.CTWA
            goto L_0x03c0
        L_0x03ab:
            java.lang.String r0 = "Request time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0359
            X.Khl r0 = X.C62555Khl.BOOK_APPOINTMENT
            goto L_0x03c0
        L_0x03b6:
            java.lang.String r0 = "Sell product"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0359
            X.Khl r0 = X.C62555Khl.SELL_PRODUCT
        L_0x03c0:
            java.lang.String r1 = r0.A00
            goto L_0x035a
        L_0x03c3:
            java.lang.Object r0 = A00(r1, r2)
            X.KMt r0 = (X.C61805KMt) r0
            X.2NQ r0 = r0.A07
            X.3oI r5 = r0.A00
            r5.assertNotSuspendingTransaction()
            X.1Vg r4 = r0.A01
            X.1WV r3 = r4.acquire()
            r1 = 50
            r0 = 1
            r3.ADa(r0, r1)
            r5.beginTransaction()     // Catch:{ all -> 0x083b }
            r3.ATQ()     // Catch:{ all -> 0x0836 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0836 }
            r5.endTransaction()     // Catch:{ all -> 0x083b }
            r4.release(r3)
            goto L_0x0010
        L_0x03ed:
            java.lang.Object r0 = A00(r1, r2)
            X.Jin r0 = (X.C60290Jin) r0
            X.05G r1 = r0.A08
            goto L_0x0799
        L_0x03f7:
            java.lang.Object r0 = A00(r1, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.Jfo r1 = r0.A0h
            if (r1 == 0) goto L_0x059f
            android.content.Context r2 = r0.requireContext()
            int r0 = r0.A00
            int r5 = r0 / 2
            r3 = 0
            r6 = 1
            r7 = 0
            r4 = r3
            r1.A0R(r2, r3, r4, r5, r6, r7)
            goto L_0x0010
        L_0x0412:
            java.lang.Object r0 = A00(r1, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0C(r0)
            goto L_0x0010
        L_0x041d:
            java.lang.Object r2 = A00(r1, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.LgY r0 = r2.A0N
            if (r0 == 0) goto L_0x0010
            java.lang.Integer r0 = r0.A08
            if (r0 == 0) goto L_0x0010
            int r6 = r0.intValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A0Z
            java.lang.String r3 = "clipsCreationViewModel"
            r1 = 0
            if (r0 == 0) goto L_0x0578
            int r0 = X.JTO.A07(r0)
            if (r6 <= r0) goto L_0x0010
            X.KMu r4 = r2.A0i
            if (r4 != 0) goto L_0x0444
            java.lang.String r3 = "timedElementsViewModel"
            goto L_0x0578
        L_0x0444:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A0Z
            if (r0 == 0) goto L_0x0578
            int r5 = X.JTO.A07(r0)
            int r5 = r5 - r6
            r7 = 0
            r8 = r7
            r9 = r7
            r4.A0V(r5, r6, r7, r8, r9)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A08(r2)
            X.LgY r0 = r2.A0N
            if (r0 == 0) goto L_0x0010
            r0.A08 = r1
            goto L_0x0010
        L_0x045e:
            java.lang.Object r6 = A00(r1, r2)
            X.8IA r6 = (X.AnonymousClass8IA) r6
            com.instagram.common.session.UserSession r2 = r6.A00
            r5 = 0
            r0 = 48
            X.Ay8 r1 = new X.Ay8
            r1.<init>(r2, r0)
            java.lang.Class<X.L3x> r0 = X.C63713L3x.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.L3x r0 = (X.C63713L3x) r0
            com.instagram.music.common.config.MusicAttributionConfig r4 = r0.A00
            if (r4 == 0) goto L_0x04a9
            com.instagram.music.common.model.MusicAssetModel r0 = r4.A02
            if (r0 == 0) goto L_0x04a9
            com.instagram.common.typedurl.ImageUrl r3 = r0.A03
            if (r3 == 0) goto L_0x04a9
            X.0xa r2 = X.AnonymousClass7TE.A0q(r2)
            r0 = 3491(0xda3, float:4.892E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            com.instagram.music.common.model.MusicAssetModel r1 = r4.A02
            if (r1 == 0) goto L_0x0497
            java.lang.String r0 = r1.A0E
        L_0x0497:
            boolean r0 = X.00p.A0j(r2, r0, r5)
            if (r0 != 0) goto L_0x04a9
            X.05G r1 = r6.A01
            X.9cq r0 = new X.9cq
            r0.<init>(r3, r4)
        L_0x04a4:
            r1.Epw(r0)
            goto L_0x0010
        L_0x04a9:
            X.05G r1 = r6.A01
            X.AbN r0 = X.C40390AbN.A00
            goto L_0x04a4
        L_0x04ae:
            java.lang.Object r1 = A00(r1, r2)
            X.8Hw r1 = (X.C353498Hw) r1
            r0 = 0
            X.C353498Hw.A1F(r1, r0, r0, r0)
            androidx.fragment.app.FragmentActivity r0 = r1.A15
            r0.finish()
            goto L_0x0010
        L_0x04bf:
            java.lang.Object r3 = A00(r1, r2)
            X.8Hw r3 = (X.C353498Hw) r3
            X.80U r1 = r3.A1W
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0010
            X.85M r2 = r3.A1d
            android.content.Context r1 = r3.A11
            X.4DH r0 = r3.A1B
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r2.A03(r1, r0)
            goto L_0x0010
        L_0x04de:
            java.lang.Object r4 = A00(r1, r2)
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.80U r1 = r4.A1B
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0010
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r3 = r4.A11
            X.6nz r2 = r3.A01
            if (r2 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r1 = r3.A00
            r0 = 0
            r4.Dn1(r1, r2, r0)
            r3.A01 = r0
            goto L_0x0010
        L_0x04fe:
            java.lang.Object r0 = A00(r1, r2)
            X.88Y r0 = (X.AnonymousClass88Y) r0
            X.AnonymousClass88Y.A03(r0)
            goto L_0x0010
        L_0x0509:
            java.lang.Object r1 = A00(r1, r2)
            android.graphics.drawable.TransitionDrawable r1 = (android.graphics.drawable.TransitionDrawable) r1
            r0 = 250(0xfa, float:3.5E-43)
            r1.reverseTransition(r0)
            goto L_0x0010
        L_0x0516:
            java.lang.Object r2 = A00(r1, r2)
            X.L3w r2 = (X.C63712L3w) r2
            X.Jy0 r0 = r2.A01
            java.lang.Integer r0 = r0.A00
            if (r0 != 0) goto L_0x054f
            r0 = -1
        L_0x0523:
            java.lang.String r5 = "shareToFBController"
            r10 = 1
            r1 = 0
            if (r0 == r1) goto L_0x0554
            if (r0 == r10) goto L_0x054c
            r1 = 2
            if (r0 != r1) goto L_0x0010
            X.K7n r4 = r2.A00
            X.0eM r0 = r4.A0J
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329066772709134(0x81111800023f0e, double:3.0379863402469106E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0010
        L_0x0543:
            X.8it r0 = r4.A05
            if (r0 == 0) goto L_0x05d1
            r0.A04(r10)
            goto L_0x0010
        L_0x054c:
            X.K7n r4 = r2.A00
            goto L_0x0543
        L_0x054f:
            int r0 = r0.intValue()
            goto L_0x0523
        L_0x0554:
            java.lang.String r9 = "after_new_fbc"
            X.8iu r6 = X.C363008it.A05
            X.K7n r0 = r2.A00
            com.instagram.common.session.UserSession r7 = X.JTP.A0R(r0)
            r8 = 0
            r11 = r10
            r6.A01(r7, r8, r9, r10, r11)
            X.8it r0 = r0.A05
            if (r0 == 0) goto L_0x05d1
            r0.A05(r10, r9)
            goto L_0x0010
        L_0x056c:
            java.lang.Object r1 = A00(r1, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0Z
            if (r0 != 0) goto L_0x0580
            java.lang.String r3 = "clipsCreationViewModel"
        L_0x0578:
            X.0qQ.A0F(r3)
        L_0x057b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0580:
            boolean r0 = r0.A0r()
            if (r0 != 0) goto L_0x0010
            X.KMu r0 = r1.A0i
            java.lang.String r5 = "timedElementsViewModel"
            if (r0 == 0) goto L_0x05d1
            r0.A0O()
            X.KMu r0 = r1.A0i
            if (r0 == 0) goto L_0x05d1
            r0.A0N()
            X.Jfo r0 = r1.A0h
            if (r0 == 0) goto L_0x059f
            r0.A0K()
            goto L_0x0010
        L_0x059f:
            java.lang.String r3 = "stackedTimelineViewModel"
            goto L_0x0578
        L_0x05a2:
            X.C65229LpZ.A00(r3, r1)
            X.C65229LpZ.A02(r3, r1, r4)
            X.C65229LpZ.A01(r3, r1, r4)
            boolean r10 = X.C363388je.A02(r1)
            r5 = 1
            if (r10 == 0) goto L_0x05b7
            X.EZv r1 = X.C48153EZv.A05
            r0 = 1
            if (r4 == r1) goto L_0x05b8
        L_0x05b7:
            r0 = 0
        L_0x05b8:
            X.EZv r9 = X.C48153EZv.A05
            if (r4 != r9) goto L_0x05dd
            if (r0 != 0) goto L_0x05dd
            X.LO1 r2 = new X.LO1
            r2.<init>()
            boolean r0 = X.C63419Kwf.A00(r8)
            if (r0 == 0) goto L_0x05dd
            r3.A0E = r5
            android.view.ViewGroup r1 = r3.A02
            if (r1 != 0) goto L_0x05d5
            java.lang.String r5 = "view"
        L_0x05d1:
            X.0qQ.A0F(r5)
            goto L_0x057b
        L_0x05d5:
            X.M7L r0 = new X.M7L
            r0.<init>(r3, r2)
            r1.post(r0)
        L_0x05dd:
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r3.A0B
            if (r2 == 0) goto L_0x05e9
            r1 = 5
            X.LsB r0 = new X.LsB
            r0.<init>(r1, r4, r3)
            r2.A07 = r0
        L_0x05e9:
            java.lang.Object r1 = r7.getValue()
            X.KmZ r1 = (X.C62797KmZ) r1
            boolean r0 = r1 instanceof X.KQ7
            if (r0 == 0) goto L_0x0679
            X.KQ7 r1 = (X.KQ7) r1
            java.lang.Integer r2 = r1.A00
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x0600
            r0 = 59
            X.LYG.A02(r1, r0, r3, r2)
        L_0x0600:
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x060a
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
        L_0x060a:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A0B
            r7 = 0
            if (r0 == 0) goto L_0x0612
            r0.setChecked(r7)
        L_0x0612:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A0B
            if (r0 == 0) goto L_0x0619
            r0.setClickable(r7)
        L_0x0619:
            X.5nZ r6 = X.JTT.A0S(r8)
            java.lang.String r5 = r4.A02(r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0676
            android.widget.TextView r8 = r3.A04
        L_0x0630:
            if (r4 != r9) goto L_0x0010
            if (r5 == 0) goto L_0x0010
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0010
            r1 = 0
            if (r8 == 0) goto L_0x0653
            java.lang.CharSequence r0 = r8.getText()
            if (r0 == 0) goto L_0x0653
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0653
            java.lang.CharSequence r0 = r8.getText()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0010
        L_0x0653:
            if (r10 != 0) goto L_0x0010
            if (r8 == 0) goto L_0x0010
            X.4DH r0 = r3.A0I
            android.content.Context r5 = r0.requireContext()
            r3 = 2131954369(0x7f130ac1, float:1.9545235E38)
            android.content.Context r2 = r0.requireContext()
            int r0 = r4.A01
            java.lang.String r0 = r2.getString(r0)
            if (r6 == 0) goto L_0x066e
            java.lang.String r1 = r6.A04
        L_0x066e:
            X.JTR.A18(r5, r8, r0, r1, r3)
            r8.setVisibility(r7)
            goto L_0x0010
        L_0x0676:
            android.widget.TextView r8 = r3.A03
            goto L_0x0630
        L_0x0679:
            boolean r0 = r1 instanceof X.KQ8
            if (r0 == 0) goto L_0x0010
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A0B
            if (r1 == 0) goto L_0x068c
            java.lang.Object r0 = r6.getValue()
            X.Jur r0 = (X.C60995Jur) r0
            boolean r0 = r0.A03
            r1.setChecked(r0)
        L_0x068c:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A0B
            if (r0 == 0) goto L_0x0693
            r0.setClickable(r5)
        L_0x0693:
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x069c
            r0 = 58
            X.LYG.A02(r1, r0, r3, r4)
        L_0x069c:
            android.view.View r0 = r3.A01
            X.JTT.A13(r0)
            android.view.View r0 = r3.A00
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0010
        L_0x06a8:
            java.lang.Object r0 = A00(r1, r2)
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            goto L_0x0010
        L_0x06b3:
            java.lang.Object r0 = A00(r1, r2)
            X.8hG r0 = (X.C362048hG) r0
            com.instagram.common.session.UserSession r2 = r0.A0c
            android.content.Context r4 = r0.A0O
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r0 = 9
            X.MM9 r1 = new X.MM9
            r1.<init>(r2, r0)
            java.lang.Class<X.KVR> r0 = X.KVR.class
            java.lang.Object r3 = r2.A01(r0, r1)
            X.FYW r3 = (X.FYW) r3
            java.lang.Integer r1 = X.JTS.A0e(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 1104(0x450, float:1.547E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r2)
            r3.A02(r4, r1)
            goto L_0x0010
        L_0x06ec:
            java.lang.Object r0 = A00(r1, r2)
            X.8GA r0 = (X.AnonymousClass8GA) r0
            X.8GB r5 = r0.A0G
            android.view.View r4 = r0.A0A
            android.view.Window r2 = X.AnonymousClass8GB.A00(r4)
            if (r2 == 0) goto L_0x0707
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.screenBrightness = r0
            r2.setAttributes(r1)
        L_0x0707:
            android.animation.ObjectAnimator r1 = r5.A00
            if (r1 == 0) goto L_0x0714
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x0714
            r1.cancel()
        L_0x0714:
            float[] r2 = X.C51965G9l.A1b()
            r1 = 0
            float r0 = r4.getAlpha()
            r2[r1] = r0
            r3 = 1
            r0 = 0
            r2[r3] = r0
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            r5.A00 = r2
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r1 = r5.A00
            X.LTd r0 = new X.LTd
            r0.<init>(r3, r4, r5)
            r1.addListener(r0)
            android.animation.ObjectAnimator r0 = r5.A00
            r0.start()
            goto L_0x0010
        L_0x0741:
            java.lang.Object r0 = A00(r1, r2)
            X.8GA r0 = (X.AnonymousClass8GA) r0
            X.8GB r1 = r0.A0G
            android.view.View r0 = r0.A0A
            r1.A01(r0)
            goto L_0x0010
        L_0x0750:
            java.lang.Object r0 = A00(r1, r2)
            X.Jgv r0 = (X.C60176Jgv) r0
            X.05G r2 = r0.A03
        L_0x0758:
            java.lang.Object r1 = r2.getValue()
            X.KJX r0 = X.KJX.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0758
            goto L_0x0010
        L_0x0766:
            java.lang.Object r5 = A00(r1, r2)
            X.GQw r5 = (X.C52397GQw) r5
            X.5Oz r0 = r5.A04
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x078d
            X.4gU r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            float r1 = X.AnonymousClass7TE.A04(r0)
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x079b
            X.4gU r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            X.DbS.A1U(r0)
        L_0x078d:
            r0 = 0
            X.5Oz r1 = r5.A05
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.Epw(r0)
            X.05G r1 = r5.A09
        L_0x0799:
            r0 = 0
            goto L_0x07c5
        L_0x079b:
            r4 = 0
            X.4Cq r3 = r5.A08
            r2 = 0
            r1 = 9
            X.JUx r0 = new X.JUx
            r0.<init>(r5, r2, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x078d
        L_0x07aa:
            X.0eS.A00(r1)
            X.I21 r1 = X.I21.A00
            java.lang.Object r0 = r2.A00
            X.GgO r0 = (X.C52971GgO) r0
            com.instagram.common.session.UserSession r2 = r0.A0E
            boolean r6 = X.C52971GgO.A07(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r1.A03(r2, r3, r4, r5, r6)
            X.05G r1 = r0.A0R
            r0 = 1
        L_0x07c5:
            X.AnonymousClass7TF.A1O(r1, r0)
            goto L_0x0010
        L_0x07ca:
            X.0eS.A00(r1)
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r2.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2dZ r0 = r1.A04(r0)
            r0.A0T()
            goto L_0x0010
        L_0x07dc:
            java.lang.Object r1 = A00(r1, r2)
            X.37D r1 = (X.AnonymousClass37D) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0T(r0)
            goto L_0x0010
        L_0x07e9:
            java.lang.Object r4 = A00(r1, r2)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            X.7aH r1 = X.C51968G9o.A0g(r4)
            r3 = 0
            X.0qQ.A0B(r1, r3)
            X.J1R r0 = X.J1R.A00
            java.util.ArrayList r0 = X.C335067cK.A0A(r1, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0801:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r2.next()
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r0.A0N
            r4.A0N(r1, r0, r3)
            goto L_0x0801
        L_0x0815:
            java.lang.Object r0 = A00(r1, r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0823
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0012
        L_0x0823:
            java.lang.String r0 = "null response"
            return r0
        L_0x0826:
            java.lang.Object r1 = A00(r1, r2)
            X.LBC r1 = (X.LBC) r1
            X.MB6 r0 = new X.MB6
            r0.<init>(r1)
            java.lang.String r0 = r0.call()
            return r0
        L_0x0836:
            r0 = move-exception
            r5.endTransaction()     // Catch:{ all -> 0x083b }
            throw r0     // Catch:{ all -> 0x083b }
        L_0x083b:
            r0 = move-exception
            r4.release(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MG0 mg0) {
        0eS.A00(obj);
        return mg0.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG0(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A00 = obj;
    }
}
