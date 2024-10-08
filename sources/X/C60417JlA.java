package X;

import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JlA  reason: case insensitive filesystem */
public final class C60417JlA extends 2Rw {
    public final UserSession A00;
    public final C62950Kp2 A01;
    public final C62462KgC A02;
    public final List A03 = AnonymousClass7TE.A1C();

    public C60417JlA(UserSession userSession, C62950Kp2 kp2, C62462KgC kgC) {
        0qQ.A0B(userSession, 2);
        this.A01 = kp2;
        this.A00 = userSession;
        this.A02 = kgC;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C279294yP r2;
        C65179Loi loi;
        C65220LpQ lpQ;
        C60595Jo4 jo4 = (C60595Jo4) r8;
        0qQ.A0B(jo4, 0);
        C62779KmH kmH = (C62779KmH) this.A03.get(i);
        if (kmH instanceof C61834KNy) {
            MVS mvs = jo4.A00;
            if ((mvs instanceof C65220LpQ) && (lpQ = (C65220LpQ) mvs) != null) {
                lpQ.A00(((C61834KNy) kmH).A00);
            }
        } else if (kmH instanceof C61832KNv) {
            MVS mvs2 = jo4.A00;
            if ((mvs2 instanceof C65179Loi) && (loi = (C65179Loi) mvs2) != null) {
                PublishScreenCategoryType publishScreenCategoryType = ((C61832KNv) kmH).A00;
                0qQ.A0B(publishScreenCategoryType, 0);
                loi.A00 = publishScreenCategoryType;
                C60076JfA A022 = loi.A02();
                AnonymousClass4DH r3 = loi.A02;
                A022.setTitle(DbV.A05(r3).getString(LIh.A01(publishScreenCategoryType)));
                loi.A02().setIcon(r3.requireContext().getDrawable(LIh.A00(publishScreenCategoryType)));
                LYG.A02(loi.A02(), 50, loi, publishScreenCategoryType);
            }
        } else if (kmH instanceof C61833KNw) {
            MVS mvs3 = jo4.A00;
            mvs3.ADm();
            int ordinal = this.A02.ordinal();
            if (ordinal == 0) {
                r2 = C279294yP.CLIPS;
            } else if (ordinal == 1) {
                r2 = C279294yP.FEED;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            27p.A01(this.A00).A15(r2, mvs3.BHl());
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(78265341);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(24171618, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d1, code lost:
        r0 = -307039048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = 1482827877(0x58622865, float:9.9465248E14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.util.List r0 = r3.A03
            java.lang.Object r1 = r0.get(r4)
            X.KmH r1 = (X.C62779KmH) r1
            boolean r0 = r1 instanceof X.C61832KNv
            if (r0 == 0) goto L_0x001c
            r1 = 41
            r0 = -1818932689(0xffffffff93954a2f, float:-3.768604E-27)
        L_0x0018:
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        L_0x001c:
            boolean r0 = r1 instanceof X.C61834KNy
            if (r0 == 0) goto L_0x0025
            r1 = 1
            r0 = -841449518(0xffffffffcdd87fd2, float:-4.54031936E8)
            goto L_0x0018
        L_0x0025:
            boolean r0 = r1 instanceof X.KNx
            if (r0 == 0) goto L_0x002e
            r1 = 2
            r0 = -109789592(0xfffffffff974be68, float:-7.9423896E34)
            goto L_0x0018
        L_0x002e:
            boolean r0 = r1 instanceof X.C61833KNw
            if (r0 == 0) goto L_0x0048
            X.KNw r1 = (X.C61833KNw) r1
            java.lang.Integer r0 = r1.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cd;
                case 2: goto L_0x006b;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00bf;
                case 9: goto L_0x0080;
                case 10: goto L_0x00bc;
                case 11: goto L_0x00b9;
                case 12: goto L_0x0068;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00b3;
                case 15: goto L_0x0074;
                case 16: goto L_0x00b0;
                case 17: goto L_0x006e;
                case 18: goto L_0x00ad;
                case 19: goto L_0x00aa;
                case 20: goto L_0x00a7;
                case 21: goto L_0x00a4;
                case 22: goto L_0x00a1;
                case 23: goto L_0x009e;
                case 24: goto L_0x009b;
                case 25: goto L_0x0098;
                case 26: goto L_0x0095;
                case 27: goto L_0x0071;
                case 28: goto L_0x0065;
                case 29: goto L_0x0092;
                case 30: goto L_0x008f;
                case 31: goto L_0x008c;
                case 32: goto L_0x0089;
                case 33: goto L_0x007d;
                case 34: goto L_0x007a;
                case 35: goto L_0x0077;
                case 36: goto L_0x0086;
                case 37: goto L_0x0083;
                case 38: goto L_0x0062;
                case 39: goto L_0x005f;
                case 40: goto L_0x005c;
                case 41: goto L_0x0059;
                case 42: goto L_0x0056;
                case 43: goto L_0x0053;
                case 44: goto L_0x0050;
                default: goto L_0x003d;
            }
        L_0x003d:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = -2018190864(0xffffffff87b4d9f0, float:-2.7211482E-34)
        L_0x0044:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x0048:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = 1453384946(0x56a0e4f2, float:8.8452587E13)
            goto L_0x0044
        L_0x0050:
            r1 = 51
            goto L_0x00d1
        L_0x0053:
            r1 = 49
            goto L_0x00d1
        L_0x0056:
            r1 = 48
            goto L_0x00d1
        L_0x0059:
            r1 = 47
            goto L_0x00d1
        L_0x005c:
            r1 = 45
            goto L_0x00d1
        L_0x005f:
            r1 = 44
            goto L_0x00d1
        L_0x0062:
            r1 = 43
            goto L_0x00d1
        L_0x0065:
            r1 = 40
            goto L_0x00d1
        L_0x0068:
            r1 = 39
            goto L_0x00d1
        L_0x006b:
            r1 = 38
            goto L_0x00d1
        L_0x006e:
            r1 = 37
            goto L_0x00d1
        L_0x0071:
            r1 = 36
            goto L_0x00d1
        L_0x0074:
            r1 = 35
            goto L_0x00d1
        L_0x0077:
            r1 = 34
            goto L_0x00d1
        L_0x007a:
            r1 = 33
            goto L_0x00d1
        L_0x007d:
            r1 = 32
            goto L_0x00d1
        L_0x0080:
            r1 = 31
            goto L_0x00d1
        L_0x0083:
            r1 = 30
            goto L_0x00d1
        L_0x0086:
            r1 = 29
            goto L_0x00d1
        L_0x0089:
            r1 = 28
            goto L_0x00d1
        L_0x008c:
            r1 = 27
            goto L_0x00d1
        L_0x008f:
            r1 = 26
            goto L_0x00d1
        L_0x0092:
            r1 = 24
            goto L_0x00d1
        L_0x0095:
            r1 = 22
            goto L_0x00d1
        L_0x0098:
            r1 = 21
            goto L_0x00d1
        L_0x009b:
            r1 = 20
            goto L_0x00d1
        L_0x009e:
            r1 = 19
            goto L_0x00d1
        L_0x00a1:
            r1 = 18
            goto L_0x00d1
        L_0x00a4:
            r1 = 17
            goto L_0x00d1
        L_0x00a7:
            r1 = 16
            goto L_0x00d1
        L_0x00aa:
            r1 = 15
            goto L_0x00d1
        L_0x00ad:
            r1 = 14
            goto L_0x00d1
        L_0x00b0:
            r1 = 13
            goto L_0x00d1
        L_0x00b3:
            r1 = 12
            goto L_0x00d1
        L_0x00b6:
            r1 = 11
            goto L_0x00d1
        L_0x00b9:
            r1 = 10
            goto L_0x00d1
        L_0x00bc:
            r1 = 9
            goto L_0x00d1
        L_0x00bf:
            r1 = 8
            goto L_0x00d1
        L_0x00c2:
            r1 = 7
            goto L_0x00d1
        L_0x00c4:
            r1 = 6
            goto L_0x00d1
        L_0x00c6:
            r1 = 5
            goto L_0x00d1
        L_0x00c8:
            r1 = 4
            goto L_0x00d1
        L_0x00ca:
            r1 = 50
            goto L_0x00d1
        L_0x00cd:
            r1 = 42
            goto L_0x00d1
        L_0x00d0:
            r1 = 3
        L_0x00d1:
            r0 = -307039048(0xffffffffedb2f4b8, float:-6.9230223E27)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60417JlA.getItemViewType(int):int");
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C62950Kp2 kp2;
        C62779KmH kmH;
        Integer num;
        switch (i) {
            case 1:
                kp2 = this.A01;
                kmH = new C61834KNy((Integer) null);
                break;
            case 2:
                kp2 = this.A01;
                kmH = KNx.A00;
                break;
            case 3:
                num = AnonymousClass05K.A00;
                break;
            case 4:
                num = AnonymousClass05K.A0Y;
                break;
            case 5:
                num = AnonymousClass05K.A0j;
                break;
            case 6:
                num = AnonymousClass05K.A0u;
                break;
            case 7:
                num = AnonymousClass05K.A15;
                break;
            case 8:
                num = AnonymousClass05K.A1F;
                break;
            case 9:
                num = AnonymousClass05K.A02;
                break;
            case 10:
                num = AnonymousClass05K.A03;
                break;
            case 11:
                num = AnonymousClass05K.A05;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                num = AnonymousClass05K.A06;
                break;
            case 13:
                num = AnonymousClass05K.A08;
                break;
            case 14:
                num = AnonymousClass05K.A0A;
                break;
            case 15:
                num = AnonymousClass05K.A0B;
                break;
            case 16:
                num = AnonymousClass05K.A0D;
                break;
            case 17:
                num = AnonymousClass05K.A0E;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                num = AnonymousClass05K.A0F;
                break;
            case 19:
                num = AnonymousClass05K.A0G;
                break;
            case 20:
                num = AnonymousClass05K.A0H;
                break;
            case 21:
                num = AnonymousClass05K.A0I;
                break;
            case 22:
                num = AnonymousClass05K.A0J;
                break;
            case 24:
                num = AnonymousClass05K.A0M;
                break;
            case 26:
                num = AnonymousClass05K.A0O;
                break;
            case 27:
                num = AnonymousClass05K.A0P;
                break;
            case 28:
                num = AnonymousClass05K.A0Q;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                num = AnonymousClass05K.A0U;
                break;
            case 30:
                num = AnonymousClass05K.A0V;
                break;
            case 31:
                num = AnonymousClass05K.A1I;
                break;
            case 32:
                num = AnonymousClass05K.A0R;
                break;
            case 33:
                num = AnonymousClass05K.A0S;
                break;
            case 34:
                num = AnonymousClass05K.A0T;
                break;
            case 35:
                num = AnonymousClass05K.A07;
                break;
            case 36:
                num = AnonymousClass05K.A0K;
                break;
            case 37:
                num = AnonymousClass05K.A09;
                break;
            case 38:
                num = AnonymousClass05K.A0C;
                break;
            case 39:
                num = AnonymousClass05K.A04;
                break;
            case 40:
                num = AnonymousClass05K.A0L;
                break;
            case Seq.NULL_REFNUM:
                kp2 = this.A01;
                kmH = new C61832KNv(PublishScreenCategoryType.MAIN);
                break;
            case Seq.RefTracker.REF_OFFSET:
                num = AnonymousClass05K.A01;
                break;
            case 43:
                num = AnonymousClass05K.A0W;
                break;
            case 44:
                num = AnonymousClass05K.A0X;
                break;
            case 45:
                num = AnonymousClass05K.A0Z;
                break;
            case 47:
                num = AnonymousClass05K.A0a;
                break;
            case 48:
                num = AnonymousClass05K.A0b;
                break;
            case 49:
                num = AnonymousClass05K.A0c;
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                num = AnonymousClass05K.A0N;
                break;
            case 51:
                num = AnonymousClass05K.A0d;
                break;
            default:
                throw DbW.A0a(AnonymousClass000.A00(235), i);
        }
        kp2 = this.A01;
        kmH = new C61833KNw(num);
        MVS A05 = kp2.A05(kmH);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60595Jo4(A05.ANH(), this, A05);
    }
}
