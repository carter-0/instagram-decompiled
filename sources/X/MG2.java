package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MG2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    public static void A01(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG2(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG2(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MG2, X.4D7] */
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
        return new MG2(obj2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MG2, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0196 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r4 = r19
            int r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            r2 = r20
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006d;
                case 2: goto L_0x0086;
                case 3: goto L_0x009f;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00f3;
                case 7: goto L_0x010c;
                case 8: goto L_0x0125;
                case 9: goto L_0x013e;
                case 10: goto L_0x015f;
                case 11: goto L_0x0197;
                case 12: goto L_0x01b0;
                case 13: goto L_0x01c9;
                case 14: goto L_0x01dd;
                case 15: goto L_0x01f1;
                case 16: goto L_0x0205;
                case 17: goto L_0x0218;
                case 18: goto L_0x022b;
                case 19: goto L_0x023e;
                case 20: goto L_0x0251;
                case 21: goto L_0x026a;
                case 22: goto L_0x027d;
                case 23: goto L_0x0042;
                case 24: goto L_0x0293;
                case 25: goto L_0x02be;
                case 26: goto L_0x02d7;
                case 27: goto L_0x02f0;
                case 28: goto L_0x0309;
                case 29: goto L_0x0334;
                case 30: goto L_0x0334;
                case 31: goto L_0x034c;
                case 32: goto L_0x0364;
                case 33: goto L_0x034c;
                case 34: goto L_0x037c;
                case 35: goto L_0x0394;
                case 36: goto L_0x0394;
                case 37: goto L_0x03b3;
                case 38: goto L_0x03cb;
                case 39: goto L_0x03ea;
                case 40: goto L_0x0418;
                case 41: goto L_0x0435;
                case 42: goto L_0x0418;
                case 43: goto L_0x0476;
                case 44: goto L_0x04a5;
                case 45: goto L_0x0526;
                case 46: goto L_0x0542;
                case 47: goto L_0x0542;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r4.A00
            r7 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r7) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Gge r0 = (X.C52987Gge) r0
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r6 = r0.A00
            X.05G r5 = r0.A01
            java.lang.Object r0 = r5.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r2 = r0.A00
            java.lang.Object r0 = r5.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r1 = r0.A02
            java.lang.Object r0 = r5.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r0 = r0.A01
            r4.A00 = r7
            java.lang.Object r0 = r6.A07(r4, r2, r1, r0)
            goto L_0x0573
        L_0x0042:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r5) goto L_0x0068
            X.0eS.A00(r2)
        L_0x004c:
            java.lang.Object r0 = r4.A02
            X.JiC r0 = (X.C60255JiC) r0
            X.LES r0 = r0.A03
            r1 = 0
            X.05G r0 = r0.A0R
            X.AnonymousClass7TF.A1O(r0, r1)
            goto L_0x059b
        L_0x005a:
            X.0eS.A00(r2)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r4, r0)
            if (r0 != r3) goto L_0x004c
            return r3
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x006d:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0079:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhG r0 = (X.C60197JhG) r0
            X.3ju r2 = r0.A05
            X.Kf5 r0 = X.C62394Kf5.A00
            goto L_0x03ab
        L_0x0086:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0092
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0092:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhG r0 = (X.C60197JhG) r0
            X.3ju r2 = r0.A05
            X.Kf4 r0 = X.C62393Kf4.A00
            goto L_0x03ab
        L_0x009f:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x00ab
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ab:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jh3 r0 = (X.C60184Jh3) r0
            X.3ju r2 = r0.A00
            X.Kf6 r0 = X.C62395Kf6.A00
            goto L_0x03ab
        L_0x00b8:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x00c4
            if (r0 == r5) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c4:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jig r0 = (X.C60284Jig) r0
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r1 = r0.A09
            r0 = 0
            r4.A00 = r5
            X.1Hj r0 = r1.A01(r4, r0)
            goto L_0x0573
        L_0x00d6:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x00e2
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e2:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JjB r0 = (X.C60310JjB) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r0 = r0.A07
            r4.A00 = r1
            X.1Hj r0 = r0.A0H(r4)
            goto L_0x0573
        L_0x00f3:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x00ff
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ff:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JjB r0 = (X.C60310JjB) r0
            X.JVe r2 = r0.A0H
            X.KcC r7 = X.C62216KcC.A00
            goto L_0x03e2
        L_0x010c:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0118
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0118:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jgr r0 = (X.C60172Jgr) r0
            X.3ju r2 = r0.A01
            X.KfA r0 = X.C62399KfA.A00
            goto L_0x03ab
        L_0x0125:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0131
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0131:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jge r0 = (X.C60159Jge) r0
            X.3ju r2 = r0.A01
            X.KfE r0 = X.C62403KfE.A00
            goto L_0x03ab
        L_0x013e:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x014a
            if (r0 == r5) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014a:
            X.0eS.A00(r2)
            java.lang.Object r1 = r4.A02
            X.Jge r1 = (X.C60159Jge) r1
            X.JVe r2 = r1.A00
            X.KAw r0 = new X.KAw
            r0.<init>(r1, r5)
            X.Kbt r7 = new X.Kbt
            r7.<init>(r0)
            goto L_0x02b5
        L_0x015f:
            int r0 = r4.A00
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L_0x017c
            if (r0 != r7) goto L_0x017c
            X.0eS.A00(r2)
        L_0x016a:
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = r4.A02
            X.JhT r0 = (X.C60210JhT) r0
            long r0 = r0.A01
            long r5 = r5 / r0
            r4.A00 = r8
            java.lang.Object r0 = X.C241603Pv.A01(r4, r5)
            if (r0 != r3) goto L_0x017f
            return r3
        L_0x017c:
            X.0eS.A00(r2)
        L_0x017f:
            java.lang.Object r0 = r4.A02
            X.JhT r0 = (X.C60210JhT) r0
            X.3ju r6 = r0.A03
            android.graphics.Bitmap$Config r5 = r0.A02
            double r1 = r0.A00
            X.KfG r0 = new X.KfG
            r0.<init>(r5, r1)
            r4.A00 = r7
            java.lang.Object r0 = r6.ELH(r0, r4)
            if (r0 != r3) goto L_0x016a
            return r3
        L_0x0197:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x01a3
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a3:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhH r0 = (X.C60198JhH) r0
            X.3ju r2 = r0.A01
            X.KfK r0 = X.C62409KfK.A00
            goto L_0x03ab
        L_0x01b0:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x01bc
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01bc:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhH r0 = (X.C60198JhH) r0
            X.3ju r2 = r0.A01
            X.KfJ r0 = X.C62408KfJ.A00
            goto L_0x03ab
        L_0x01c9:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x01d5
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01d5:
            X.JVe r2 = A00(r2, r4)
            X.Kc9 r7 = X.C62213Kc9.A00
            goto L_0x028f
        L_0x01dd:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x01e9
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e9:
            X.JVe r2 = A00(r2, r4)
            X.Kc5 r7 = X.C62209Kc5.A00
            goto L_0x028f
        L_0x01f1:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x01fd
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01fd:
            X.JVe r2 = A00(r2, r4)
            X.KcK r7 = X.C62224KcK.A00
            goto L_0x028f
        L_0x0205:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0211
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0211:
            X.JVe r2 = A00(r2, r4)
            X.KcM r7 = X.C62226KcM.A00
            goto L_0x028f
        L_0x0218:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0224
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0224:
            X.JVe r2 = A00(r2, r4)
            X.KcO r7 = X.C62228KcO.A00
            goto L_0x028f
        L_0x022b:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0237
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0237:
            X.JVe r2 = A00(r2, r4)
            X.KcP r7 = X.C62229KcP.A00
            goto L_0x028f
        L_0x023e:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x024a
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024a:
            X.JVe r2 = A00(r2, r4)
            X.KcQ r7 = X.C62230KcQ.A00
            goto L_0x028f
        L_0x0251:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x025d
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x025d:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JiC r0 = (X.C60255JiC) r0
            X.3ju r2 = r0.A05
            X.KfN r0 = X.C62412KfN.A00
            goto L_0x03ab
        L_0x026a:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0276
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0276:
            X.JVe r2 = A00(r2, r4)
            X.KcS r7 = X.C62232KcS.A00
            goto L_0x028f
        L_0x027d:
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0289
            if (r1 == r0) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0289:
            X.JVe r2 = A00(r2, r4)
            X.KcU r7 = X.C62234KcU.A00
        L_0x028f:
            r4.A00 = r0
            goto L_0x03e4
        L_0x0293:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x029f
            if (r0 == r5) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x029f:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jgf r0 = (X.C60160Jgf) r0
            X.JVe r2 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x02b9
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x02b0:
            X.Kc4 r7 = new X.Kc4
            r7.<init>(r1, r0)
        L_0x02b5:
            r4.A00 = r5
            goto L_0x03e4
        L_0x02b9:
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x02b0
        L_0x02be:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x02ca
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02ca:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Jgf r0 = (X.C60160Jgf) r0
            X.JVe r2 = r0.A00
            X.KcY r7 = X.C62238KcY.A00
            goto L_0x03e2
        L_0x02d7:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x02e3
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e3:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.3ju r2 = r0.A04
            X.KfV r0 = X.C62420KfV.A00
            goto L_0x03ab
        L_0x02f0:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x02fc
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02fc:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.JVe r2 = r0.A03
            X.KcI r7 = X.C62222KcI.A00
            goto L_0x03e2
        L_0x0309:
            int r0 = r4.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0320
            if (r0 != r5) goto L_0x054e
            X.0eS.A00(r2)
        L_0x0314:
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.JVe r2 = r0.A03
            X.KcO r7 = X.C62228KcO.A00
            r4.A00 = r6
            goto L_0x03e4
        L_0x0320:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.3ju r1 = r0.A04
            X.KfT r0 = X.C62418KfT.A00
            r4.A00 = r5
            java.lang.Object r0 = r1.ELH(r0, r4)
            if (r0 != r3) goto L_0x0314
            return r3
        L_0x0334:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0340
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0340:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.3ju r2 = r0.A04
            X.KfT r0 = X.C62418KfT.A00
            goto L_0x03ab
        L_0x034c:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0358
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0358:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.3ju r2 = r0.A04
            X.KfU r0 = X.C62419KfU.A00
            goto L_0x03ab
        L_0x0364:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0370
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0370:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.JVe r2 = r0.A03
            X.Kc6 r7 = X.C62210Kc6.A00
            goto L_0x03e2
        L_0x037c:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0388
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0388:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.JVe r2 = r0.A03
            X.KcV r7 = X.C62235KcV.A00
            goto L_0x03e2
        L_0x0394:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x03a0
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03a0:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JhO r0 = (X.C60205JhO) r0
            X.3ju r2 = r0.A04
            X.KfS r0 = X.C62417KfS.A00
        L_0x03ab:
            r4.A00 = r1
            java.lang.Object r0 = r2.ELH(r0, r4)
            goto L_0x0573
        L_0x03b3:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x03bf
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03bf:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JVe r2 = X.M0Y.A00(r0)
            X.Kc7 r7 = X.C62211Kc7.A00
            goto L_0x03e2
        L_0x03cb:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x03d7
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03d7:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JVe r2 = X.M0Y.A00(r0)
            X.KcG r7 = X.C62220KcG.A00
        L_0x03e2:
            r4.A00 = r1
        L_0x03e4:
            java.lang.Object r0 = r2.A00(r7, r4)
            goto L_0x0573
        L_0x03ea:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x03f6
            if (r0 == r5) goto L_0x0410
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03f6:
            X.0eS.A00(r2)
            java.lang.Object r2 = r4.A02
            X.LGX r2 = (X.LGX) r2
            X.LES r0 = r2.A0H
            X.0Ud r1 = r0.A0n
            r0 = 70
            X.MCk r0 = X.MCk.A00(r2, r0)
            r4.A00 = r5
            java.lang.Object r0 = r1.collect(r0, r4)
            if (r0 != r3) goto L_0x0413
            return r3
        L_0x0410:
            X.0eS.A00(r2)
        L_0x0413:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0418:
            int r0 = r4.A00
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0425
            if (r0 == r6) goto L_0x0576
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0425:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.KfY r0 = (X.C62423KfY) r0
            X.LGO r2 = r0.A0Z
            X.XPM r0 = r0.A0D
            java.lang.String r1 = r0.A0C
            r4.A00 = r6
            goto L_0x0450
        L_0x0435:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0441
            if (r0 == r5) goto L_0x0576
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0441:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.KfY r0 = (X.C62423KfY) r0
            X.LGO r2 = r0.A0Z
            X.XPM r0 = r0.A0D
            java.lang.String r1 = r0.A0C
            r4.A00 = r5
        L_0x0450:
            com.instagram.common.session.UserSession r0 = r2.A06
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "live/%s/update_sup_attribution/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "sup_active"
            r2.A0H(r0, r5)
            X.1OC r1 = X.JTU.A0G(r2)
            r0 = 763341236(0x2d7fa9b4, float:1.45327535E-11)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 == r3) goto L_0x0473
            X.0gF r0 = X.C60340gF.A00
        L_0x0473:
            if (r0 != r3) goto L_0x0579
            return r3
        L_0x0476:
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0482
            if (r0 == r6) goto L_0x049d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0482:
            X.0eS.A00(r2)
            X.0Ud r5 = X.AnonymousClass3OC.A00()
            if (r5 == 0) goto L_0x059b
            java.lang.Object r2 = r4.A02
            r1 = 33
            X.IkU r0 = new X.IkU
            r0.<init>(r2, r1)
            r4.A00 = r6
            java.lang.Object r0 = r5.collect(r0, r4)
            if (r0 != r3) goto L_0x04a0
            return r3
        L_0x049d:
            X.0eS.A00(r2)
        L_0x04a0:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x04a5:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x04b1
            if (r0 == r5) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04b1:
            X.0eS.A00(r2)
            java.lang.Object r2 = r4.A02
            X.JVR r2 = (X.JVR) r2
            r16 = 0
            X.2IS r1 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r1.getParamsCopy()
            java.util.Map r11 = r0.getParamsCopy()
            java.lang.Class<X.9Rc> r12 = X.C378759Rc.class
            java.lang.String r0 = "ig_messaging_feature_limits_live_query"
            com.facebook.pando.PandoRealtimeInfoJNI r14 = com.facebook.pando.PandoRealtimeInfoJNI.forLiveQuery(r0)
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGDirectFeatureLimitExplicitLiveQuery"
            r13 = 0
            java.lang.String r17 = "messaging_feature_limits"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r9 = r2.A00
            X.1vn r6 = X.1vm.A01(r9)
            X.1Ef r7 = r7.setEnsureCacheWrite(r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36594753449756491(0x8202bc0004074b, double:3.2060076646460365E-306)
            long r0 = X.182.A01(r8, r9, r0)
            X.1Ef r7 = r7.setMaxToleratedCacheAgeMs(r0)
            r0 = 36594753449822028(0x8202bc0005074c, double:3.2060076646874824E-306)
            long r0 = X.182.A01(r8, r9, r0)
            X.1Ef r0 = r7.setFreshCacheAgeMs(r0)
            X.032 r7 = r6.A05(r0)
            X.MCJ r6 = new X.MCJ
            r6.<init>(r2, r13)
            r4.A00 = r5
            r1 = 43
            X.MCl r0 = new X.MCl
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r2)
            java.lang.Object r0 = r7.collect(r0, r4)
            if (r0 == r3) goto L_0x059d
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0573
        L_0x0526:
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0532
            if (r0 == r1) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0532:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.JgQ r0 = (X.C60145JgQ) r0
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r0 = r0.A02
            r4.A00 = r1
            java.lang.Object r0 = r0.A02(r4)
            goto L_0x0573
        L_0x0542:
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0552
            if (r0 == r6) goto L_0x054e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x054e:
            X.0eS.A00(r2)
            goto L_0x059b
        L_0x0552:
            X.0eS.A00(r2)
            java.lang.Object r0 = r4.A02
            X.Ggd r0 = (X.C52986Ggd) r0
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r5 = r0.A00
            X.05G r2 = r0.A01
            java.lang.Object r0 = r2.getValue()
            X.Jvg r0 = (X.C61042Jvg) r0
            boolean r1 = r0.A01
            java.lang.Object r0 = r2.getValue()
            X.Jvg r0 = (X.C61042Jvg) r0
            boolean r0 = r0.A00
            r4.A00 = r6
            java.lang.Object r0 = r5.A06(r4, r1, r0)
        L_0x0573:
            if (r0 != r3) goto L_0x059b
            return r3
        L_0x0576:
            X.0eS.A00(r2)
        L_0x0579:
            java.lang.Object r0 = r4.A02
            X.KfY r0 = (X.C62423KfY) r0
            X.M0X r4 = r0.A0a
            r6 = 1
            if (r5 == 0) goto L_0x059e
            r4.A04 = r6
        L_0x0585:
            java.lang.Integer r0 = X.AnonymousClass05K.A0S
            X.1Ln r2 = X.M0X.A02(r4, r0)
            if (r5 != 0) goto L_0x058f
            r6 = 0
        L_0x058f:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "sup_state"
            r2.A0Q(r0, r1)
            r2.Cgf()
        L_0x059b:
            X.0gF r3 = X.C60340gF.A00
        L_0x059d:
            return r3
        L_0x059e:
            long r2 = r4.A04
            int r1 = (int) r2
            r0 = 1
            if (r1 != r0) goto L_0x05a9
            r0 = 2
            r4.A04 = r0
            goto L_0x0585
        L_0x05a9:
            if (r1 == 0) goto L_0x059b
            goto L_0x0585
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C59720JVe A00(Object obj, MG2 mg2) {
        0eS.A00(obj);
        return ((C60255JiC) mg2.A02).A04;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MG2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
