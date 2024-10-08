package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MGv  reason: case insensitive filesystem */
public final class C66184MGv extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    public static void A02(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C66184MGv(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66184MGv(C60292Jip jip, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = 46;
        this.A02 = jip;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MGv, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MGv, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.MGv, X.4D7] */
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
                ? mGv = new C66184MGv(obj2, r5, 19);
                mGv.A00 = AnonymousClass7TE.A0M(obj);
                return mGv;
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
                return new C66184MGv((C60292Jip) obj2, r5, this.A00);
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
        return new C66184MGv(obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (19 - this.A01 != 0) {
            create = AnonymousClass7TE.A1M(obj2, obj, this);
        } else {
            create = create(Integer.valueOf(AnonymousClass7TE.A0M(obj)), (AnonymousClass4D7) obj2);
        }
        return ((C66184MGv) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MGv, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x068f, code lost:
        if (r0.A0B != true) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0701, code lost:
        r10.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0703, code lost:
        r0 = r8.A00(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x07ad, code lost:
        r0 = r8.ELH(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x084b, code lost:
        X.0eS.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0866, code lost:
        if (r0 != r3) goto L_0x08b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0868, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x08b2, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0271 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x083d;
                case 1: goto L_0x0806;
                case 2: goto L_0x07b3;
                case 3: goto L_0x0793;
                case 4: goto L_0x0778;
                case 5: goto L_0x074c;
                case 6: goto L_0x0725;
                case 7: goto L_0x0709;
                case 8: goto L_0x06e9;
                case 9: goto L_0x06d0;
                case 10: goto L_0x06b7;
                case 11: goto L_0x0641;
                case 12: goto L_0x0610;
                case 13: goto L_0x05f1;
                case 14: goto L_0x05d5;
                case 15: goto L_0x05bb;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x058d;
                case 19: goto L_0x057c;
                case 20: goto L_0x055d;
                case 21: goto L_0x0541;
                case 22: goto L_0x0523;
                case 23: goto L_0x0509;
                case 24: goto L_0x04ef;
                case 25: goto L_0x04d5;
                case 26: goto L_0x0493;
                case 27: goto L_0x043c;
                case 28: goto L_0x03f0;
                case 29: goto L_0x03b3;
                case 30: goto L_0x0399;
                case 31: goto L_0x037f;
                case 32: goto L_0x0361;
                case 33: goto L_0x032e;
                case 34: goto L_0x0314;
                case 35: goto L_0x02fa;
                case 36: goto L_0x02e0;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02ac;
                case 39: goto L_0x0279;
                case 40: goto L_0x01b5;
                case 41: goto L_0x0132;
                case 42: goto L_0x0118;
                case 43: goto L_0x00f0;
                case 44: goto L_0x00d6;
                case 45: goto L_0x00bc;
                case 46: goto L_0x0021;
                case 47: goto L_0x0078;
                case 48: goto L_0x005e;
                case 49: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0013:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.3ju r8 = r0.A0B
            X.KdF r2 = X.C62281KdF.A00
            r10.A00 = r1
            goto L_0x07ad
        L_0x0021:
            java.lang.Object r0 = A01(r11, r10)
            X.Jip r0 = (X.C60292Jip) r0
            X.3ju r2 = r0.A0E
            int r1 = r10.A00
            X.Kdt r0 = new X.Kdt
            r0.<init>(r1)
            r2.FIG(r0)
            goto L_0x08b0
        L_0x0035:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r5) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0043:
            java.lang.Object r0 = A01(r11, r10)
            X.Kdb r0 = (X.C62303Kdb) r0
            X.JVe r4 = r0.A03
            java.util.Set r2 = r0.A03()
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            X.Kbz r0 = new X.Kbz
            r0.<init>(r1, r2)
            r10.A00 = r5
            java.lang.Object r0 = r4.A00(r0, r10)
            goto L_0x0866
        L_0x005e:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x006c
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x006c:
            java.lang.Object r0 = A01(r11, r10)
            X.Jip r0 = (X.C60292Jip) r0
            X.JVe r8 = r0.A0D
            X.KcT r4 = X.C62233KcT.A00
            goto L_0x0701
        L_0x0078:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0089
            if (r0 == r4) goto L_0x084b
            if (r0 == r5) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0089:
            java.lang.Object r1 = A01(r11, r10)
            X.Jip r1 = (X.C60292Jip) r1
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r0 = r1.A07
            X.0Ud r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 != 0) goto L_0x00ae
            X.JVe r2 = r1.A0D
            java.lang.String r1 = "ufi_action_sheet"
            X.Kbf r0 = new X.Kbf
            r0.<init>(r1)
            r10.A00 = r4
            java.lang.Object r0 = r2.A00(r0, r10)
            goto L_0x0866
        L_0x00ae:
            X.3ju r8 = r1.A0E
            r0 = 2131965124(0x7f1334c4, float:1.956705E38)
            X.Kds r2 = new X.Kds
            r2.<init>(r0)
            r10.A00 = r5
            goto L_0x07ad
        L_0x00bc:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x00ca
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ca:
            java.lang.Object r0 = A01(r11, r10)
            X.Jgd r0 = (X.C60158Jgd) r0
            X.JVe r8 = r0.A00
            X.KcH r4 = X.C62221KcH.A00
            goto L_0x0701
        L_0x00d6:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x00e4
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e4:
            java.lang.Object r0 = A01(r11, r10)
            X.Jgd r0 = (X.C60158Jgd) r0
            X.JVe r8 = r0.A00
            X.KcG r4 = X.C62220KcG.A00
            goto L_0x0701
        L_0x00f0:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 1
            if (r0 == 0) goto L_0x00fe
            if (r0 == r4) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fe:
            java.lang.Object r2 = A01(r11, r10)
            X.Ji6 r2 = (X.C60249Ji6) r2
            X.LES r0 = r2.A03
            X.0Ud r0 = r0.A0W
            java.lang.Object r1 = r0.getValue()
            X.Kj6 r0 = X.C62635Kj6.CONNECTED_WAITING_FOR_COUNTDOWN
            if (r1 != r0) goto L_0x08b0
            X.3ju r8 = r2.A05
            X.Kdo r2 = X.C62316Kdo.A00
            r10.A00 = r4
            goto L_0x07ad
        L_0x0118:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0126
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0126:
            java.lang.Object r0 = A01(r11, r10)
            X.Ji6 r0 = (X.C60249Ji6) r0
            X.JVe r8 = r0.A04
            X.KcA r4 = X.C62214KcA.A00
            goto L_0x0701
        L_0x0132:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 3
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L_0x018b
            if (r0 == r6) goto L_0x084b
            if (r0 == r4) goto L_0x0177
            if (r0 != r5) goto L_0x01b0
            X.0eS.A00(r11)
        L_0x0144:
            java.lang.Object r2 = r10.A02
            X.Ji6 r2 = (X.C60249Ji6) r2
            X.05G r8 = r2.A07
            java.lang.Object r0 = r8.getValue()
            long r6 = X.AnonymousClass7TE.A0R(r0)
            r0 = 1
            long r6 = r6 - r0
            java.lang.Long r0 = X.JTO.A0y(r6)
            r8.Epw(r0)
        L_0x015c:
            X.05G r1 = r2.A07
            java.lang.Object r0 = r1.getValue()
            long r8 = X.AnonymousClass7TE.A0R(r0)
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a1
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r10, r0)
            if (r0 != r3) goto L_0x017a
            return r3
        L_0x0177:
            X.0eS.A00(r11)
        L_0x017a:
            java.lang.Object r0 = r10.A02
            X.Ji6 r0 = (X.C60249Ji6) r0
            X.3ju r1 = r0.A05
            X.Kdm r0 = X.C62314Kdm.A00
            r10.A00 = r5
            java.lang.Object r0 = r1.ELH(r0, r10)
            if (r0 != r3) goto L_0x0144
            return r3
        L_0x018b:
            java.lang.Object r2 = A01(r11, r10)
            X.Ji6 r2 = (X.C60249Ji6) r2
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x015c
            X.3ju r1 = r2.A05
            X.Kdp r0 = X.C62317Kdp.A00
            r10.A00 = r6
            java.lang.Object r0 = r1.ELH(r0, r10)
            goto L_0x0866
        L_0x01a1:
            java.lang.Long r0 = X.JTO.A0y(r6)
            X.6oS r1 = X.JTP.A0K(r2, r0, r1)
            r0 = 43
            A02(r2, r1, r0)
            goto L_0x08b0
        L_0x01b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01b5:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0206
            if (r0 == r2) goto L_0x0219
            if (r0 != r5) goto L_0x0274
            X.0eS.A00(r11)
        L_0x01c4:
            java.lang.Object r1 = r10.A02
            X.JiE r1 = (X.C60257JiE) r1
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r1.A04
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x08b0
            X.KVj r4 = r1.A08
            java.lang.String r3 = r0.A09
            java.lang.String r2 = r0.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = "INSTAGRAM_USERPAY_BADGES"
            r4.A01(r1, r3, r2, r0)
            X.0wc r1 = r4.A00
            java.lang.String r0 = "ig_user_pay_live_broadcast_badges_ufi_tapped"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.LMi r2 = r4.A01
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "product_type"
            X.C64090LMi.A00(r3, r2, r0, r1)
            java.lang.String r0 = r2.A00
            long r0 = X.DbZ.A07(r0)
            X.JTQ.A10(r3, r0)
            java.lang.String r0 = r2.A02
            long r0 = X.JTR.A0M(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.JTQ.A13(r3, r0)
            goto L_0x08b0
        L_0x0206:
            java.lang.Object r0 = A01(r11, r10)
            X.JiE r0 = (X.C60257JiE) r0
            X.3ju r1 = r0.A09
            X.HGY r0 = X.HGY.A00
            r10.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r10)
            if (r0 != r3) goto L_0x021c
            return r3
        L_0x0219:
            X.0eS.A00(r11)
        L_0x021c:
            java.lang.Object r0 = r10.A02
            X.JiE r0 = (X.C60257JiE) r0
            X.JVe r6 = r0.A07
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r0.A05
            X.0Ud r1 = r0.A08
            java.lang.Object r0 = r1.getValue()
            X.Juh r0 = (X.C60985Juh) r0
            if (r0 == 0) goto L_0x0236
            X.L7F r0 = r0.A05
            if (r0 == 0) goto L_0x0236
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0238
        L_0x0236:
            java.lang.String r4 = "0"
        L_0x0238:
            java.lang.Object r0 = r1.getValue()
            X.Juh r0 = (X.C60985Juh) r0
            if (r0 == 0) goto L_0x0272
            X.L7F r0 = r0.A05
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0272
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0272
            int r2 = r0.intValue()
        L_0x0252:
            java.lang.Object r0 = r1.getValue()
            X.Juh r0 = (X.C60985Juh) r0
            if (r0 == 0) goto L_0x0262
            X.L7F r0 = r0.A05
            if (r0 == 0) goto L_0x0262
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x0264
        L_0x0262:
            java.lang.String r1 = "$0"
        L_0x0264:
            X.Kc3 r0 = new X.Kc3
            r0.<init>(r4, r2, r1)
            r10.A00 = r5
            java.lang.Object r0 = r6.A00(r0, r10)
            if (r0 != r3) goto L_0x01c4
            return r3
        L_0x0272:
            r2 = 0
            goto L_0x0252
        L_0x0274:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0279:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x028a
            if (r0 == r2) goto L_0x029d
            if (r0 == r4) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x028a:
            java.lang.Object r0 = A01(r11, r10)
            X.JiE r0 = (X.C60257JiE) r0
            X.3ju r1 = r0.A09
            X.HGZ r0 = X.HGZ.A00
            r10.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r10)
            if (r0 != r3) goto L_0x02a0
            return r3
        L_0x029d:
            X.0eS.A00(r11)
        L_0x02a0:
            java.lang.Object r0 = r10.A02
            X.JiE r0 = (X.C60257JiE) r0
            X.3ju r8 = r0.A09
            X.HGY r2 = X.HGY.A00
            r10.A00 = r4
            goto L_0x07ad
        L_0x02ac:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x02ba
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02ba:
            java.lang.Object r0 = A01(r11, r10)
            X.JiE r0 = (X.C60257JiE) r0
            X.JVe r8 = r0.A07
            X.KcN r4 = X.C62227KcN.A00
            goto L_0x0701
        L_0x02c6:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x02d4
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02d4:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhw r0 = (X.C60239Jhw) r0
            X.JVe r8 = r0.A04
            X.Kcb r4 = X.C62241Kcb.A00
            goto L_0x0701
        L_0x02e0:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x02ee
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02ee:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhw r0 = (X.C60239Jhw) r0
            X.JVe r8 = r0.A04
            X.KcO r4 = X.C62228KcO.A00
            goto L_0x0701
        L_0x02fa:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0308
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0308:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhw r0 = (X.C60239Jhw) r0
            X.JVe r8 = r0.A04
            X.KcJ r4 = X.C62223KcJ.A00
            goto L_0x0701
        L_0x0314:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0322
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0322:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhw r0 = (X.C60239Jhw) r0
            X.JVe r8 = r0.A04
            X.KcB r4 = X.C62215KcB.A00
            goto L_0x0701
        L_0x032e:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x033f
            if (r0 == r1) goto L_0x0350
            if (r0 == r2) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x033f:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhe r0 = (X.C60221Jhe) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r0 = r0.A08
            r10.A00 = r1
            java.lang.Object r0 = r0.A03(r10)
            if (r0 != r3) goto L_0x0353
            return r3
        L_0x0350:
            X.0eS.A00(r11)
        L_0x0353:
            java.lang.Object r0 = r10.A02
            X.Jhe r0 = (X.C60221Jhe) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r0 = r0.A08
            r10.A00 = r2
            java.lang.Object r0 = r0.A02(r10)
            goto L_0x0866
        L_0x0361:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x036f
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x036f:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhe r0 = (X.C60221Jhe) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r0 = r0.A08
            r10.A00 = r1
            java.lang.Object r0 = r0.A03(r10)
            goto L_0x0866
        L_0x037f:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x038d
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x038d:
            java.lang.Object r0 = A01(r11, r10)
            X.Jhb r0 = (X.C60218Jhb) r0
            X.JVe r8 = r0.A05
            X.KcZ r4 = X.C62239KcZ.A00
            goto L_0x0701
        L_0x0399:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x03a7
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03a7:
            java.lang.Object r0 = A01(r11, r10)
            X.Jio r0 = (X.C60291Jio) r0
            X.JVe r8 = r0.A0C
            X.KcO r4 = X.C62228KcO.A00
            goto L_0x0701
        L_0x03b3:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x03c1
            if (r0 == r5) goto L_0x03e8
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03c1:
            java.lang.Object r4 = A01(r11, r10)
            X.Jio r4 = (X.C60291Jio) r4
            X.JVe r0 = r4.A0C
            X.0pa r2 = r0.A00
            r1 = 0
            X.MGg r0 = new X.MGg
            r0.<init>(r4, r1, r5)
            X.JTS.A13(r4, r0, r2)
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r0 = r4.A07
            X.0pa r2 = r0.A0I
            r1 = 32
            X.IkU r0 = new X.IkU
            r0.<init>(r4, r1)
            r10.A00 = r5
            java.lang.Object r0 = r2.collect(r0, r10)
            if (r0 != r3) goto L_0x03eb
            return r3
        L_0x03e8:
            X.0eS.A00(r11)
        L_0x03eb:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x03f0:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0401
            if (r0 == r8) goto L_0x0427
            if (r0 == r7) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0401:
            java.lang.Object r0 = A01(r11, r10)
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r6 = r0.A0A
            X.Ki4 r5 = X.Ki4.MULTI_USER_JOINED
            r4 = 2131976229(0x7f136025, float:1.9589573E38)
            X.0t1 r0 = r0.A05
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.String r2 = r0.getUsername()
            r1 = 0
            X.KdZ r0 = new X.KdZ
            r0.<init>(r5, r1, r2, r4)
            r10.A00 = r8
            java.lang.Object r0 = r6.ELH(r0, r10)
            if (r0 != r3) goto L_0x042a
            return r3
        L_0x0427:
            X.0eS.A00(r11)
        L_0x042a:
            java.lang.Object r1 = r10.A02
            X.JiJ r1 = (X.C60262JiJ) r1
            boolean r0 = X.C61027JvR.A01(r1)
            if (r0 == 0) goto L_0x08b0
            X.3ju r8 = r1.A0B
            X.KdF r2 = X.C62281KdF.A00
            r10.A00 = r7
            goto L_0x07ad
        L_0x043c:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L_0x044d
            if (r0 == r8) goto L_0x047e
            if (r0 == r6) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x044d:
            java.lang.Object r7 = A01(r11, r10)
            X.KdN r7 = (X.C62289KdN) r7
            com.instagram.common.session.UserSession r4 = r7.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320867680330657(0x8109a3000523a1, double:3.032801201211667E-306)
            boolean r5 = X.182.A06(r2, r4, r0)
            X.3ju r4 = r7.A0A
            X.0t1 r0 = r7.A05
            com.instagram.user.model.User r2 = r0.A00()
            r1 = 2131965387(0x7f1335cb, float:1.9567582E38)
            if (r5 == 0) goto L_0x0470
            r1 = 2131965389(0x7f1335cd, float:1.9567587E38)
        L_0x0470:
            X.KdY r0 = new X.KdY
            r0.<init>(r2, r1)
            r10.A00 = r8
            java.lang.Object r0 = r4.ELH(r0, r10)
            if (r0 != r3) goto L_0x0481
            return r3
        L_0x047e:
            X.0eS.A00(r11)
        L_0x0481:
            java.lang.Object r1 = r10.A02
            X.JiJ r1 = (X.C60262JiJ) r1
            boolean r0 = X.C61027JvR.A01(r1)
            if (r0 == 0) goto L_0x08b0
            X.3ju r8 = r1.A0B
            X.KdF r2 = X.C62281KdF.A00
            r10.A00 = r6
            goto L_0x07ad
        L_0x0493:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x04a4
            if (r0 == r4) goto L_0x04c0
            if (r0 == r5) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04a4:
            java.lang.Object r0 = A01(r11, r10)
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r2 = r0.A0A
            X.0t1 r0 = r0.A05
            com.instagram.user.model.User r1 = r0.A00()
            X.KdU r0 = new X.KdU
            r0.<init>(r1)
            r10.A00 = r4
            java.lang.Object r0 = r2.ELH(r0, r10)
            if (r0 != r3) goto L_0x04c3
            return r3
        L_0x04c0:
            X.0eS.A00(r11)
        L_0x04c3:
            java.lang.Object r1 = r10.A02
            X.JiJ r1 = (X.C60262JiJ) r1
            boolean r0 = X.C61027JvR.A01(r1)
            if (r0 == 0) goto L_0x08b0
            X.3ju r8 = r1.A0B
            X.KdF r2 = X.C62281KdF.A00
            r10.A00 = r5
            goto L_0x07ad
        L_0x04d5:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x04e3
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04e3:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.JVe r8 = r0.A0A
            X.Kca r4 = X.C62240Kca.A00
            goto L_0x0701
        L_0x04ef:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x04fd
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04fd:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.JVe r8 = r0.A0A
            X.KcE r4 = X.C62218KcE.A00
            goto L_0x0701
        L_0x0509:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0517
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0517:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.JVe r8 = r0.A0A
            X.KcD r4 = X.C62217KcD.A00
            goto L_0x0701
        L_0x0523:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0531
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0531:
            java.lang.Object r0 = A01(r11, r10)
            X.KdH r0 = (X.C62283KdH) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r0 = r0.A08
            r10.A00 = r1
            X.1Hj r0 = r0.A0H(r10)
            goto L_0x0866
        L_0x0541:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x054f
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x054f:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.3ju r8 = r0.A0B
            X.KdF r2 = X.C62281KdF.A00
            r10.A00 = r1
            goto L_0x07ad
        L_0x055d:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x056b
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x056b:
            java.lang.Object r0 = A01(r11, r10)
            X.JiJ r0 = (X.C60262JiJ) r0
            X.JVe r8 = r0.A0A
            java.lang.String r0 = "comment"
            X.Kbf r4 = new X.Kbf
            r4.<init>(r0)
            goto L_0x0701
        L_0x057c:
            X.0eS.A00(r11)
            int r0 = r10.A00
            if (r0 != 0) goto L_0x08b0
            java.lang.Object r2 = r10.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r2
            long r0 = r2.A03
            r2.A04 = r0
            goto L_0x08b0
        L_0x058d:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x059e
            if (r0 == r2) goto L_0x05ac
            if (r0 == r4) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x059e:
            X.0eS.A00(r11)
            r0 = 200(0xc8, double:9.9E-322)
            r10.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r10, r0)
            if (r0 != r3) goto L_0x05af
            return r3
        L_0x05ac:
            X.0eS.A00(r11)
        L_0x05af:
            java.lang.Object r0 = r10.A02
            X.JiJ r0 = (X.C60262JiJ) r0
            X.3ju r8 = r0.A0B
            X.KdE r2 = X.C62280KdE.A00
            r10.A00 = r4
            goto L_0x07ad
        L_0x05bb:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x05c9
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c9:
            java.lang.Object r0 = A01(r11, r10)
            X.JiD r0 = (X.C60256JiD) r0
            X.JVe r8 = r0.A06
            X.Kc8 r4 = X.C62212Kc8.A00
            goto L_0x0701
        L_0x05d5:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x05e3
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05e3:
            java.lang.Object r0 = A01(r11, r10)
            X.Jgz r0 = (X.C60180Jgz) r0
            X.3ju r8 = r0.A02
            X.LLr r2 = X.C64073LLr.A00
            r10.A00 = r1
            goto L_0x07ad
        L_0x05f1:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x05ff
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05ff:
            java.lang.Object r0 = A01(r11, r10)
            X.Ji5 r0 = (X.C60248Ji5) r0
            X.3ju r8 = r0.A0C
            X.Kd2 r2 = new X.Kd2
            r2.<init>()
            r10.A00 = r1
            goto L_0x07ad
        L_0x0610:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 1
            if (r0 == 0) goto L_0x061e
            if (r0 == r4) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x061e:
            java.lang.Object r2 = A01(r11, r10)
            X.L5W r2 = (X.L5W) r2
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.JgP r0 = (X.C60144JgP) r0
            X.0Ud r0 = r0.A01
            X.0qC r1 = new X.0qC
            r1.<init>(r0)
            r0 = 61
            X.MCk r0 = X.MCk.A00(r2, r0)
            r10.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r10)
            goto L_0x0866
        L_0x0641:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 1
            if (r0 == 0) goto L_0x064f
            if (r0 == r6) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x064f:
            X.6gz r8 = A00(r11, r10)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r8.A01()
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x06b4
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x06b4
            java.lang.String r7 = r0.getUsername()
        L_0x0665:
            X.0eM r0 = r8.A0G
            java.lang.Object r0 = r0.getValue()
            X.L8Y r0 = (X.L8Y) r0
            X.0Ud r0 = r0.A03
            java.lang.Object r5 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r8.A01()
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x06b2
            boolean r0 = r0.A0M
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0683:
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r8.A04
            X.Juh r0 = X.JTP.A0e(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0691
            boolean r0 = r0.A0B
            r1 = 1
            if (r0 == r6) goto L_0x0692
        L_0x0691:
            r1 = 0
        L_0x0692:
            X.JVe r8 = r8.A03()
            if (r5 != 0) goto L_0x06a9
            boolean r0 = X.AnonymousClass7TF.A1Y(r4, r6)
        L_0x069c:
            if (r0 == 0) goto L_0x06a1
            if (r1 != 0) goto L_0x06a1
            r2 = 1
        L_0x06a1:
            X.9qk r4 = new X.9qk
            r4.<init>(r7, r2)
            r10.A00 = r6
            goto L_0x0703
        L_0x06a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = r5.equals(r0)
            goto L_0x069c
        L_0x06b2:
            r4 = 0
            goto L_0x0683
        L_0x06b4:
            java.lang.String r7 = ""
            goto L_0x0665
        L_0x06b7:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x06c5
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c5:
            X.6gz r0 = A00(r11, r10)
            X.JVe r8 = r0.A03()
            X.KcE r4 = X.C62218KcE.A00
            goto L_0x0701
        L_0x06d0:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x06de
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06de:
            X.6gz r0 = A00(r11, r10)
            X.JVe r8 = r0.A03()
            X.KcL r4 = X.C62225KcL.A00
            goto L_0x0701
        L_0x06e9:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x06f7
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06f7:
            X.6gz r0 = A00(r11, r10)
            X.JVe r8 = r0.A03()
            X.KcR r4 = X.C62231KcR.A00
        L_0x0701:
            r10.A00 = r1
        L_0x0703:
            java.lang.Object r0 = r8.A00(r4, r10)
            goto L_0x0866
        L_0x0709:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0717
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0717:
            java.lang.Object r0 = A01(r11, r10)
            X.4Co r0 = (X.C262204Co) r0
            r10.A00 = r1
            java.lang.Object r0 = r0.CfH(r10)
            goto L_0x0866
        L_0x0725:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0732
            if (r0 != r1) goto L_0x0745
            X.0eS.A00(r11)
        L_0x0731:
            return r11
        L_0x0732:
            java.lang.Object r0 = A01(r11, r10)
            X.8Cl r0 = (X.C352218Cl) r0
            X.2Q9 r0 = r0.A0u
            if (r0 == 0) goto L_0x074a
            r10.A00 = r1
            java.lang.Object r11 = X.JTO.A10(r0, r10)
            if (r11 != r3) goto L_0x0731
            return r3
        L_0x0745:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x074a:
            r11 = 0
            return r11
        L_0x074c:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x075b
            if (r0 != r1) goto L_0x076e
            X.0eS.A00(r11)
        L_0x0758:
            if (r11 == 0) goto L_0x0773
            return r11
        L_0x075b:
            java.lang.Object r0 = A01(r11, r10)
            X.8Cl r0 = (X.C352218Cl) r0
            X.2Q9 r0 = r0.A0u
            if (r0 == 0) goto L_0x0773
            r10.A00 = r1
            java.lang.Object r11 = X.JTO.A10(r0, r10)
            if (r11 != r3) goto L_0x0758
            return r3
        L_0x076e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0773:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0778:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x0786
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0786:
            java.lang.Object r0 = A01(r11, r10)
            X.Dky r0 = (X.C46771Dky) r0
            X.3ju r8 = r0.A04
            X.EUX r2 = X.EUX.A00
            r10.A00 = r1
            goto L_0x07ad
        L_0x0793:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 == 0) goto L_0x07a1
            if (r0 == r1) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07a1:
            java.lang.Object r0 = A01(r11, r10)
            X.Dky r0 = (X.C46771Dky) r0
            X.3ju r8 = r0.A04
            X.EUW r2 = X.EUW.A00
            r10.A00 = r1
        L_0x07ad:
            java.lang.Object r0 = r8.ELH(r2, r10)
            goto L_0x0866
        L_0x07b3:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 1
            if (r0 == 0) goto L_0x07db
            if (r0 != r6) goto L_0x0801
            X.0eS.A00(r11)
        L_0x07bf:
            X.3Ii r11 = (X.C239803Ii) r11
            java.lang.Object r1 = r10.A02
            X.K4s r1 = (X.C61374K4s) r1
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x07f8
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r0 = r11.A00
            X.Jtj r0 = (X.C60925Jtj) r0
            X.JlE r5 = r1.A00
            if (r5 != 0) goto L_0x0869
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07db:
            java.lang.Object r0 = A01(r11, r10)
            X.K4s r0 = (X.C61374K4s) r0
            com.instagram.userpay.api.UserPayApi r0 = r0.A01
            if (r0 != 0) goto L_0x07ef
            java.lang.String r0 = "userPayApi"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07ef:
            r10.A00 = r6
            java.lang.Object r11 = r0.A00(r10)
            if (r11 != r3) goto L_0x07bf
            return r3
        L_0x07f8:
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 != 0) goto L_0x08a1
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0801:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0806:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x0814
            if (r0 == r5) goto L_0x0830
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0814:
            java.lang.Object r4 = A01(r11, r10)
            X.Der r4 = (X.C46430Der) r4
            X.DkJ r0 = r4.A08
            if (r0 == 0) goto L_0x0838
            X.0Ud r2 = r0.A06
            r1 = 22
            X.FxN r0 = new X.FxN
            r0.<init>((java.lang.Object) r4, (int) r1)
            r10.A00 = r5
            java.lang.Object r0 = r2.collect(r0, r10)
            if (r0 != r3) goto L_0x0833
            return r3
        L_0x0830:
            X.0eS.A00(r11)
        L_0x0833:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0838:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x083d:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 1
            if (r0 == 0) goto L_0x084f
            if (r0 == r2) goto L_0x084b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x084b:
            X.0eS.A00(r11)
            goto L_0x08b0
        L_0x084f:
            java.lang.Object r0 = A01(r11, r10)
            X.JiB r0 = (X.C60254JiB) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.util.List r0 = r0.A02
            X.1OC r1 = X.C320126ro.A03(r1, r0)
            r10.A00 = r2
            r0 = 396274682(0x179eabfa, float:1.0253924E-24)
            java.lang.Object r0 = r1.A00(r0, r10)
        L_0x0866:
            if (r0 != r3) goto L_0x08b0
            return r3
        L_0x0869:
            java.util.List r4 = r0.A03
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A01
            java.lang.Integer r0 = r0.A00
            X.0qQ.A0B(r2, r6)
            r5.A02 = r2
            r5.A03 = r1
            if (r0 == 0) goto L_0x0890
            int r0 = r0.intValue()
            double r0 = (double) r0
            java.lang.String r0 = X.1G0.A01(r0)
            r5.A01 = r0
            long r2 = X.AnonymousClass7TG.A0I()
            double r0 = (double) r2
            java.lang.String r0 = X.1G0.A01(r0)
            r5.A00 = r0
        L_0x0890:
            java.util.List r0 = r5.A04
            r0.clear()
            if (r4 == 0) goto L_0x089a
            r0.addAll(r4)
        L_0x089a:
            r5.notifyDataSetChanged()
            X.3Ih r11 = X.C51967G9n.A0d()
        L_0x08a1:
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x08b0
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 == 0) goto L_0x08b3
            java.lang.String r1 = "User Pay Earnings Insights Endpoint"
            java.lang.String r0 = "User Pay Earnings Insights Endpoint failed to fetch a valid response "
            X.0wb.A03(r1, r0)
        L_0x08b0:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x08b3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66184MGv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C313776gz A00(Object obj, C66184MGv mGv) {
        0eS.A00(obj);
        C313786h0 r2 = C313776gz.A0K;
        C60437JlV jlV = (C60437JlV) mGv.A02;
        return r2.A00(jlV.A03, jlV.A04);
    }

    public static Object A01(Object obj, C66184MGv mGv) {
        0eS.A00(obj);
        return mGv.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66184MGv(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }
}
