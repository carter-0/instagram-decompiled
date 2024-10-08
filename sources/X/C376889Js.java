package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Js  reason: invalid class name and case insensitive filesystem */
public final class C376889Js extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376889Js(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9Js, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.9Js, X.4D7] */
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
                ? r2 = new C376889Js(obj2, r5, 21);
                r2.A00 = ((Number) obj).intValue();
                return r2;
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
        return new C376889Js(obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (21 - this.A01 != 0) {
            create = create(obj, (AnonymousClass4D7) obj2);
        } else {
            create = create(Integer.valueOf(((Number) obj).intValue()), (AnonymousClass4D7) obj2);
        }
        return ((C376889Js) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9Js, java.lang.Object, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0842  */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0859;
                case 1: goto L_0x0808;
                case 2: goto L_0x07e7;
                case 3: goto L_0x087f;
                case 4: goto L_0x07a9;
                case 5: goto L_0x077c;
                case 6: goto L_0x074c;
                case 7: goto L_0x071b;
                case 8: goto L_0x06de;
                case 9: goto L_0x068a;
                case 10: goto L_0x0666;
                case 11: goto L_0x0649;
                case 12: goto L_0x0616;
                case 13: goto L_0x05f6;
                case 14: goto L_0x05c8;
                case 15: goto L_0x059c;
                case 16: goto L_0x0570;
                case 17: goto L_0x053e;
                case 18: goto L_0x0509;
                case 19: goto L_0x04d5;
                case 20: goto L_0x04a1;
                case 21: goto L_0x0023;
                case 22: goto L_0x0483;
                case 23: goto L_0x0465;
                case 24: goto L_0x0447;
                case 25: goto L_0x0413;
                case 26: goto L_0x03df;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x03c1;
                case 31: goto L_0x038d;
                case 32: goto L_0x0358;
                case 33: goto L_0x0323;
                case 34: goto L_0x02f6;
                case 35: goto L_0x02c8;
                case 36: goto L_0x029a;
                case 37: goto L_0x0272;
                case 38: goto L_0x023e;
                case 39: goto L_0x020a;
                case 40: goto L_0x01d9;
                case 41: goto L_0x01a4;
                case 42: goto L_0x0169;
                case 43: goto L_0x014b;
                case 44: goto L_0x0118;
                case 45: goto L_0x00e4;
                case 46: goto L_0x00b5;
                case 47: goto L_0x0080;
                case 48: goto L_0x005a;
                case 49: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0016:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.8h7 r0 = (X.C361968h7) r0
            X.3ju r1 = r0.A0A
            X.9Vs r0 = X.C379889Vs.A00
            goto L_0x0682
        L_0x0023:
            X.0eS.A00(r9)
            int r1 = r8.A00
            java.lang.Object r0 = r8.A02
            X.85X r0 = (X.AnonymousClass85X) r0
            r0.A01 = r1
            X.AnonymousClass85X.A06(r0)
            X.AnonymousClass85X.A04(r0)
            goto L_0x08a1
        L_0x0036:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0047:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.8BN r0 = (X.AnonymousClass8BN) r0
            X.0V2 r1 = r0.A03
            X.9nq r0 = X.C388449nq.A00
            r8.A00 = r3
            java.lang.Object r0 = r1.emit(r0, r8)
            goto L_0x087c
        L_0x005a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.88V r0 = (X.AnonymousClass88V) r0
            X.3ju r1 = r0.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r8.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r8)
            goto L_0x087c
        L_0x0080:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0091
            if (r0 == r5) goto L_0x00ac
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0091:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.85x r4 = (X.C3507185x) r4
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r4.A01
            X.0Ud r3 = r0.A0W
            r1 = 22
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x00af
            return r2
        L_0x00ac:
            X.0eS.A00(r9)
        L_0x00af:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x00b5:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x00c6
            if (r0 == r5) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r4 = (com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore) r4
            X.0Ud r3 = r4.A0i
            r0 = 100
            X.0r6 r3 = X.AnonymousClass11F.A00(r3, r0)
            r1 = 21
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x00e4:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x00f5
            if (r0 == r5) goto L_0x010f
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00f5:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8I2 r4 = (X.AnonymousClass8I2) r4
            X.8IA r0 = r4.A02
            X.0Ud r3 = r0.A02
            r1 = 2
            X.Aus r0 = new X.Aus
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x0112
            return r2
        L_0x010f:
            X.0eS.A00(r9)
        L_0x0112:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x0118:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r4 = 1
            if (r0 == 0) goto L_0x0129
            if (r0 == r4) goto L_0x0142
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0129:
            X.0eS.A00(r9)
            java.lang.Object r3 = r8.A02
            X.8I2 r3 = (X.AnonymousClass8I2) r3
            X.8I6 r0 = r3.A03
            X.0Ud r1 = r0.A03
            X.8ID r0 = new X.8ID
            r0.<init>(r3)
            r8.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r2) goto L_0x0145
            return r2
        L_0x0142:
            X.0eS.A00(r9)
        L_0x0145:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x014b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x015c
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015c:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.8aj r0 = (X.C358328aj) r0
            X.3ju r1 = r0.A02
            X.9nO r0 = X.C388169nO.A00
            goto L_0x0682
        L_0x0169:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x017a
            if (r0 == r5) goto L_0x019b
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x017a:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8aa r4 = (X.C358238aa) r4
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            X.8aj r0 = (X.C358328aj) r0
            X.0pa r3 = r0.A05
            r1 = 9
            X.FxQ r0 = new X.FxQ
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x019e
            return r2
        L_0x019b:
            X.0eS.A00(r9)
        L_0x019e:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x01a4:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x01b5
            if (r0 == r5) goto L_0x01d0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x01b5:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.8Mv r0 = r4.A16
            X.0pa r3 = r0.A04
            r1 = 16
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x01d3
            return r2
        L_0x01d0:
            X.0eS.A00(r9)
        L_0x01d3:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x01d9:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x01ea
            if (r0 == r5) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01ea:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.7vg r4 = (X.C346747vg) r4
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.8Ce r0 = (X.AnonymousClass8Ce) r0
            X.0r6 r3 = r0.A01
            r1 = 15
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x020a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L_0x021b
            if (r0 == r7) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x021b:
            X.0eS.A00(r9)
            java.lang.Object r6 = r8.A02
            X.8CY r6 = (X.AnonymousClass8CY) r6
            java.lang.ref.WeakReference r0 = r6.A01
            java.lang.Object r5 = r0.get()
            androidx.core.app.ComponentActivity r5 = (androidx.core.app.ComponentActivity) r5
            if (r5 == 0) goto L_0x08a1
            X.07U r4 = X.07U.A04
            r3 = 0
            r1 = 12
            X.MGu r0 = new X.MGu
            r0.<init>(r6, r3, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r4, r5, r8, r0)
            goto L_0x087c
        L_0x023e:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L_0x024f
            if (r0 == r7) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x024f:
            X.0eS.A00(r9)
            java.lang.Object r6 = r8.A02
            X.8CY r6 = (X.AnonymousClass8CY) r6
            java.lang.ref.WeakReference r0 = r6.A01
            java.lang.Object r5 = r0.get()
            androidx.core.app.ComponentActivity r5 = (androidx.core.app.ComponentActivity) r5
            if (r5 == 0) goto L_0x08a1
            X.07U r4 = X.07U.A04
            r3 = 0
            r1 = 11
            X.MGu r0 = new X.MGu
            r0.<init>(r6, r3, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r4, r5, r8, r0)
            goto L_0x087c
        L_0x0272:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0283
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0283:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.7jY r0 = (X.C339407jY) r0
            com.instagram.common.session.UserSession r0 = r0.A0K
            com.instagram.monetization.repository.MonetizationRepository r1 = X.AnonymousClass2o3.A00(r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            r8.A00 = r3
            java.lang.Object r0 = r1.A00(r0, r8)
            goto L_0x087c
        L_0x029a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x02ab
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02ab:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A02
            X.8Cn r5 = (X.C352238Cn) r5
            X.4DH r0 = r5.A01
            X.07Z r4 = r0.getViewLifecycleOwner()
            r3 = 0
            r1 = 9
            X.MGu r0 = new X.MGu
            r0.<init>(r5, r3, r1)
            r8.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r4, r8, r0)
            goto L_0x087c
        L_0x02c8:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x02d9
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02d9:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A02
            X.8Cm r5 = (X.C352228Cm) r5
            X.4DH r0 = r5.A03
            X.07Z r4 = r0.getViewLifecycleOwner()
            r3 = 0
            r1 = 8
            X.MGu r0 = new X.MGu
            r0.<init>(r5, r3, r1)
            r8.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r4, r8, r0)
            goto L_0x087c
        L_0x02f6:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x0307
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0307:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A02
            X.8Cm r5 = (X.C352228Cm) r5
            X.4DH r0 = r5.A03
            X.07Z r4 = r0.getViewLifecycleOwner()
            r3 = 0
            r1 = 7
            X.MGu r0 = new X.MGu
            r0.<init>(r5, r3, r1)
            r8.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r4, r8, r0)
            goto L_0x087c
        L_0x0323:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0334
            if (r0 == r5) goto L_0x034f
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0334:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8W9 r4 = (X.AnonymousClass8W9) r4
            X.8WC r0 = r4.A04
            X.0Ud r3 = r0.A03
            r1 = 9
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x0352
            return r2
        L_0x034f:
            X.0eS.A00(r9)
        L_0x0352:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x0358:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0369
            if (r0 == r5) goto L_0x0384
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0369:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8no r4 = (X.C365868no) r4
            X.8WC r0 = r4.A03
            X.0pa r3 = r0.A02
            r1 = 8
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x0387
            return r2
        L_0x0384:
            X.0eS.A00(r9)
        L_0x0387:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x038d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x039e
            if (r0 == r5) goto L_0x03b8
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x039e:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8no r4 = (X.C365868no) r4
            X.8WC r0 = r4.A03
            X.0Ud r3 = r0.A03
            r1 = 7
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x03bb
            return r2
        L_0x03b8:
            X.0eS.A00(r9)
        L_0x03bb:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x03c1:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x03d2
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03d2:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.85O r0 = (X.AnonymousClass85O) r0
            X.3ju r1 = r0.A05
            X.9mi r0 = X.C387749mi.A00
            goto L_0x0682
        L_0x03df:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x03f0
            if (r0 == r5) goto L_0x040a
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x03f0:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8iN r4 = (X.C362718iN) r4
            X.8gT r0 = r4.A01
            X.0Ud r3 = r0.A06
            r1 = 6
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x040d
            return r2
        L_0x040a:
            X.0eS.A00(r9)
        L_0x040d:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x0413:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x0424
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0424:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A02
            X.88R r5 = (X.AnonymousClass88R) r5
            X.84s r4 = r5.A02
            r3 = 0
            r1 = 23
            X.9K3 r0 = new X.9K3
            r0.<init>(r4, r3, r1)
            X.032 r3 = X.AnonymousClass0Zq.A00(r0)
            r1 = 4
            X.9NG r0 = new X.9NG
            r0.<init>(r5, r1)
            r8.A00 = r6
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x0447:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0458
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0458:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.8o8 r0 = (X.C366068o8) r0
            X.3ju r1 = r0.A0H
            X.KKu r0 = X.C61755KKu.A00
            goto L_0x0682
        L_0x0465:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0476
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0476:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.8o8 r0 = (X.C366068o8) r0
            X.3ju r1 = r0.A0H
            X.KKt r0 = X.C61754KKt.A00
            goto L_0x0682
        L_0x0483:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0494
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0494:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.84v r0 = (X.C3504884v) r0
            X.3ju r1 = r0.A0V
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0682
        L_0x04a1:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x04b2
            if (r0 == r5) goto L_0x04cc
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x04b2:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8Fr r4 = (X.C352948Fr) r4
            X.80x r0 = r4.A09
            X.05G r3 = r0.A09
            r1 = 3
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x04cf
            return r2
        L_0x04cc:
            X.0eS.A00(r9)
        L_0x04cf:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x04d5:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x04e6
            if (r0 == r5) goto L_0x0500
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x04e6:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.8GA r4 = (X.AnonymousClass8GA) r4
            X.80x r0 = r4.A0H
            X.05G r3 = r0.A0A
            r1 = 2
            X.9NG r0 = new X.9NG
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x0503
            return r2
        L_0x0500:
            X.0eS.A00(r9)
        L_0x0503:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x0509:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x051a
            if (r0 == r5) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x051a:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            com.instagram.compose.ui.capturable.CapturableModifierNode r4 = (com.instagram.compose.ui.capturable.CapturableModifierNode) r4
            r8.A00 = r5
            X.05G r3 = r4.A00
            r1 = 0
            X.9K2 r0 = new X.9K2
            r0.<init>(r5, r1)
            X.02x r3 = X.10q.A02(r0, r3)
            r1 = 46
            X.MCj r0 = new X.MCj
            r0.<init>(r4, r1)
            java.lang.Object r0 = r3.collect(r0, r8)
            if (r0 != r2) goto L_0x0717
            goto L_0x087c
        L_0x053e:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x054f
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x054f:
            X.0eS.A00(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r4 = r8.A02
            X.5WL r4 = (X.AnonymousClass5WL) r4
            X.5aT r0 = r4.A04
            X.5aS r0 = (X.AnonymousClass5aS) r0
            X.0V2 r3 = r0.A00
            r1 = 10
            X.IkW r0 = new X.IkW
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r8.A00 = r6
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x0570:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0581
            if (r0 == r5) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0581:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.5WM r4 = (X.AnonymousClass5WM) r4
            X.5aT r0 = r4.A00
            X.5aS r0 = (X.AnonymousClass5aS) r0
            X.0V2 r3 = r0.A00
            r1 = 6
            X.IkV r0 = new X.IkV
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x059c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x05ad
            if (r0 == r5) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05ad:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A02
            X.5cS r4 = (X.C288775cS) r4
            X.5aU r0 = r4.A04
            X.5aS r0 = (X.AnonymousClass5aS) r0
            X.0V2 r3 = r0.A00
            r1 = 5
            X.IkV r0 = new X.IkV
            r0.<init>(r4, r1)
            r8.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r8)
            goto L_0x087c
        L_0x05c8:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x05d9
            if (r0 == r3) goto L_0x05ed
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x05d9:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            com.instagram.common.uigraph.UiGraph r0 = (com.instagram.common.uigraph.UiGraph) r0
            X.0V2 r1 = r0.A0A
            X.Av6 r0 = X.C41504Av6.A00
            r8.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r2) goto L_0x05f0
            return r2
        L_0x05ed:
            X.0eS.A00(r9)
        L_0x05f0:
            X.MCr r1 = new X.MCr
            r1.<init>()
            throw r1
        L_0x05f6:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L_0x0607
            if (r0 == r1) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0607:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.0sP r0 = (X.0sP) r0
            r8.A00 = r1
            java.lang.Object r0 = r0.invoke(r8)
            goto L_0x087c
        L_0x0616:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L_0x0627
            if (r0 == r7) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0627:
            X.0eS.A00(r9)
            java.lang.Object r6 = r8.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            X.05G r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            X.7aF r5 = r0.A02
            X.4HW r4 = r6.A08
            r3 = 0
            r1 = 3
            X.GPB r0 = new X.GPB
            r0.<init>(r6, r5, r3, r1)
            r8.A00 = r7
            java.lang.Object r0 = r4.A00(r5, r8, r0)
            goto L_0x087c
        L_0x0649:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x065a
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x065a:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.87z r0 = (X.C3512087z) r0
            X.3ju r1 = r0.A07
            X.9iP r0 = X.C385109iP.A00
            goto L_0x0682
        L_0x0666:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0677
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0677:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.87z r0 = (X.C3512087z) r0
            X.3ju r1 = r0.A07
            X.9iO r0 = X.C385099iO.A00
        L_0x0682:
            r8.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r8)
            goto L_0x087c
        L_0x068a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x069b
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x069b:
            X.0eS.A00(r9)
            java.lang.Object r7 = r8.A02
            X.87u r7 = (X.C3511587u) r7
            X.87w r5 = r7.A01
            X.05G r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x06bd
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r0 = 15
            X.MG7 r1 = new X.MG7
            r1.<init>(r5, r3, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r4)
        L_0x06bd:
            X.87z r5 = r7.A02
            X.6oS r4 = X.C318116oQ.A00(r5)
            r1 = 0
            r0 = 10
            X.9Js r3 = new X.9Js
            r3.<init>(r5, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r3, r4)
            X.3ju r1 = r7.A03
            X.9iM r0 = X.C385079iM.A00
            r8.A00 = r6
            java.lang.Object r0 = r1.ELH(r0, r8)
            goto L_0x087c
        L_0x06de:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L_0x06ef
            if (r0 == r1) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06ef:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02
            X.72N r0 = (X.AnonymousClass72N) r0
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r5 = r0.A06
            r8.A00 = r1
            java.util.HashSet r1 = r5.A07
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0717
            java.lang.String r0 = "-1"
            r1.add(r0)
            X.4Cq r4 = r5.A09
            r3 = 0
            r0 = 2
            X.9KS r1 = new X.9KS
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r4)
        L_0x0717:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x087c
        L_0x071b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x072c
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x072c:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A02
            r1 = 8
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.05E r4 = X.C3025664b.A02(r0)
            r3 = 0
            r1 = 27
            X.JVD r0 = new X.JVD
            r0.<init>(r5, r3, r1)
            r8.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A00(r8, r0, r4)
            goto L_0x087c
        L_0x074c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x075d
            if (r0 == r6) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x075d:
            X.0eS.A00(r9)
            X.12T r3 = X.AnonymousClass12T.A00
            r5 = 0
            r1 = 1600862899(0x5f6b3ab3, float:1.6950057E19)
            r0 = 3
            X.0nV r4 = r3.CO6(r1, r0)
            java.lang.Object r3 = r8.A02
            r1 = 15
            X.JVD r0 = new X.JVD
            r0.<init>(r3, r5, r1)
            r8.A00 = r6
            java.lang.Object r0 = X.1Eo.A00(r8, r4, r0)
            goto L_0x087c
        L_0x077c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0793
            if (r0 != r3) goto L_0x07a1
            X.0eS.A00(r9)
        L_0x0788:
            java.lang.Object r1 = r8.A02
            X.7QK r1 = (X.AnonymousClass7QK) r1
            X.7QM r0 = X.AnonymousClass7QM.STOP_TYPING
            r1.A01(r0)
            goto L_0x08a1
        L_0x0793:
            X.0eS.A00(r9)
            r0 = 2000(0x7d0, double:9.88E-321)
            r8.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r8, r0)
            if (r0 != r2) goto L_0x0788
            return r2
        L_0x07a1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07a9:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L_0x07bb
            if (r0 != r1) goto L_0x07b3
            goto L_0x07cb
        L_0x07b3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07bb:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x07db }
            androidx.work.CoroutineWorker r0 = (androidx.work.CoroutineWorker) r0     // Catch:{ all -> 0x07db }
            r8.A00 = r1     // Catch:{ all -> 0x07db }
            java.lang.Object r9 = r0.A03(r8)     // Catch:{ all -> 0x07db }
            if (r9 != r2) goto L_0x07ce
            return r2
        L_0x07cb:
            X.0eS.A00(r9)     // Catch:{ all -> 0x07db }
        L_0x07ce:
            X.5Fi r9 = (X.C282935Fi) r9     // Catch:{ all -> 0x07db }
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x07db }
            androidx.work.CoroutineWorker r0 = (androidx.work.CoroutineWorker) r0     // Catch:{ all -> 0x07db }
            X.39x r0 = r0.A00     // Catch:{ all -> 0x07db }
            r0.A07(r9)     // Catch:{ all -> 0x07db }
            goto L_0x08a1
        L_0x07db:
            r1 = move-exception
            java.lang.Object r0 = r8.A02
            androidx.work.CoroutineWorker r0 = (androidx.work.CoroutineWorker) r0
            X.39x r0 = r0.A00
            r0.A08(r1)
            goto L_0x08a1
        L_0x07e7:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x07f8
            if (r0 == r3) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07f8:
            X.0eS.A00(r9)
            java.lang.Object r1 = r8.A02
            X.6FP r1 = (X.AnonymousClass6FP) r1
            X.0sL r0 = r1.A04
            r8.A00 = r3
            java.lang.Object r0 = r0.invoke(r1, r8)
            goto L_0x087c
        L_0x0808:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x084d
            if (r0 == r1) goto L_0x0837
            if (r0 != r3) goto L_0x0851
            X.0eS.A00(r9)
        L_0x0817:
            java.lang.Object r0 = r8.A02
            X.5WT r0 = (X.AnonymousClass5WT) r0
            X.JNN r0 = r0.A06
            if (r0 == 0) goto L_0x0826
            X.IEb r0 = (X.C56830IEb) r0
            android.widget.Magnifier r0 = r0.A00
            r0.update()
        L_0x0826:
            java.lang.Object r0 = r8.A02
            X.5WT r0 = (X.AnonymousClass5WT) r0
            X.3ju r0 = r0.A0C
            if (r0 == 0) goto L_0x083a
            r8.A00 = r1
            java.lang.Object r0 = r0.E6v(r8)
            if (r0 != r2) goto L_0x083a
            return r2
        L_0x0837:
            X.0eS.A00(r9)
        L_0x083a:
            java.lang.Object r0 = r8.A02
            X.5WT r0 = (X.AnonymousClass5WT) r0
            X.JNN r0 = r0.A06
            if (r0 == 0) goto L_0x0826
            X.AyM r0 = X.C41669AyM.A00
            r8.A00 = r3
            java.lang.Object r0 = X.C3026564t.A00(r8, r0)
            if (r0 != r2) goto L_0x0817
            return r2
        L_0x084d:
            X.0eS.A00(r9)
            goto L_0x0826
        L_0x0851:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0859:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r8.A00
            r0 = 1
            if (r1 == 0) goto L_0x086e
            if (r1 == r0) goto L_0x086a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x086a:
            X.0eS.A00(r9)
            goto L_0x08a1
        L_0x086e:
            X.0eS.A00(r9)
            java.lang.Object r1 = r8.A02
            X.4cD r1 = (X.C267794cD) r1
            r8.A00 = r0
            r0 = 0
            java.lang.Object r0 = X.C62951Kp3.A00(r0, r1, r8)
        L_0x087c:
            if (r0 != r2) goto L_0x08a1
            return r2
        L_0x087f:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x08a4
            if (r0 != r3) goto L_0x08b2
            X.0eS.A00(r9)
        L_0x088b:
            java.lang.Object r2 = r8.A02
            X.2gC r2 = (X.AnonymousClass2gC) r2
            androidx.lifecycle.CoroutineLiveData r0 = r2.A02
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x08a1
            X.4Co r1 = r2.A01
            r0 = 0
            if (r1 == 0) goto L_0x089f
            r1.AG7(r0)
        L_0x089f:
            r2.A01 = r0
        L_0x08a1:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x08a4:
            X.0eS.A00(r9)
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r8, r0)
            if (r0 != r2) goto L_0x088b
            return r2
        L_0x08b2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376889Js.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
