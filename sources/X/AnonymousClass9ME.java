package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Arrays;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9ME  reason: invalid class name */
public final class AnonymousClass9ME extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9ME(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: type inference failed for: r1v81, types: [X.3YT, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        1Ng r5;
        1Xj r4;
        AnonymousClass3W1 r3;
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                return ((C247703gm) ((AnonymousClass33Z) this.A03).A0L.getValue()).A00((1Xj) this.A01, (AnonymousClass3W1) this.A02);
            case 1:
                return ((C55920Hph) ((AnonymousClass33Z) this.A03).A06.getValue()).A00((1Xj) this.A01, (AnonymousClass3W1) this.A02);
            case 2:
                AnonymousClass33W r2 = (AnonymousClass33W) this.A03;
                return ((I6D) ((AnonymousClass33Z) this.A02).A0F.getValue()).A04((1Xj) this.A01, r2.A03.AoY(), new C55501Hij(r2.A00));
            case 3:
                ((C247703gm) this.A03).A01.DKl((1Xj) this.A01, (AnonymousClass3W1) this.A02);
                break;
            case 4:
                r4 = (1Xj) this.A01;
                r3 = (AnonymousClass3W1) this.A02;
                r5 = AnonymousClass1Nd.A00(((C252903pt) this.A03).A00);
                z = false;
                z2 = false;
                break;
            case 5:
                r5 = AnonymousClass1Nd.A00(((C252903pt) this.A03).A00);
                r4 = (1Xj) this.A01;
                r3 = (AnonymousClass3W1) this.A02;
                z = false;
                z2 = true;
                break;
            case 6:
                AnonymousClass334 r0 = (AnonymousClass334) this.A03;
                C229382nI r1 = r0.A01;
                return new C232492to((Context) this.A01, r0.A00, r1, (UserSession) this.A02);
            case 7:
                return new C54477HFf((Context) this.A01, ((AnonymousClass334) this.A03).A00, (UserSession) this.A02);
            case 8:
                return new GUE((Context) this.A01, (UserSession) this.A03, ((C2358831o) this.A02).Aot());
            case 9:
                return new GUA((Context) this.A01, ((AnonymousClass334) this.A03).A04, (UserSession) this.A02);
            case 10:
                return new C252613pO((Activity) this.A02, (C249453jo) this.A01, (UserSession) this.A03);
            case 11:
                return new C54475HFd((Context) this.A01, ((AnonymousClass334) this.A03).A00, (UserSession) this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass334 r12 = (AnonymousClass334) this.A03;
                return new C54478HFg((Context) this.A01, r12.A00, (UserSession) this.A02, r12.A04);
            case 13:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                AnonymousClass4DU r13 = ((AnonymousClass334) this.A03).A04;
                0qQ.A0B(context, 0);
                0qQ.A0B(userSession, 1);
                return new C55725HmM(context, r13, userSession);
            case 14:
                return new C275634qf((Context) this.A01, ((AnonymousClass334) this.A03).A00, (UserSession) this.A02);
            case 15:
                return new GUB((Context) this.A01, ((AnonymousClass310) this.A02).AbT(), (UserSession) this.A03);
            case 16:
                ((C246833fJ) this.A01).D2S((1Xj) this.A02, (AnonymousClass3W1) this.A03);
                break;
            case 17:
                ((C246833fJ) this.A01).DN6((1Xj) this.A02, (AnonymousClass3W1) this.A03);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return Boolean.valueOf(C243183Xs.A00(((C243173Xr) this.A03).A00, (1Xj) this.A02, ((AnonymousClass0iw) this.A01).getModuleName()));
            case 19:
                ((IgProgressImageView) this.A01).setUrl(((C246953fX) this.A03).A02, (AnonymousClass0iw) this.A02);
                break;
            case 20:
            case 37:
                C2362933e r42 = (C2362933e) this.A03;
                return Integer.valueOf(((AnonymousClass4U7) r42.A05.A0K.getValue()).A00((1Xj) this.A01, r42.A06, (AnonymousClass3W1) this.A02));
            case 21:
            case Seq.RefTracker.REF_OFFSET:
                C2362933e r22 = (C2362933e) this.A03;
                C39722A6n a6n = (C39722A6n) r22.A05.A0E.getValue();
                Context context2 = r22.A00;
                1Xj r52 = (1Xj) this.A01;
                AnonymousClass3W1 r43 = (AnonymousClass3W1) this.A02;
                AnonymousClass4DU r32 = r22.A06;
                0qQ.A0B(r52, 1);
                0qQ.A0B(r43, 2);
                C242993Wz r02 = a6n.A02;
                UserSession userSession2 = a6n.A00;
                return Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(r02.A00(userSession2, r52, r43)), Integer.valueOf(C243163Xq.A00(userSession2, r52, r32, r43)), Integer.valueOf(a6n.A01.A00(context2, r52, r43))}));
            case 22:
            case 46:
                C2362933e r33 = (C2362933e) this.A03;
                AnonymousClass33Z r23 = r33.A05;
                Context context3 = r33.A00;
                1Xj r6 = (1Xj) this.A01;
                AnonymousClass3W1 r9 = (AnonymousClass3W1) this.A02;
                AnonymousClass4DU r7 = r33.A06;
                return r23.A01().A05(context3, r6, r7, ((AnonymousClass4U7) r23.A0K.getValue()).A02(context3, r6, r7, r9, ((C265524Vc) r33.A07.A0Y.getValue()).A02), r9, r33.A0B, true);
            case 23:
            case 44:
                C2362933e r44 = (C2362933e) this.A03;
                return Integer.valueOf(((C242993Wz) r44.A05.A0D.getValue()).A00(r44.A02, (1Xj) this.A01, (AnonymousClass3W1) this.A02));
            case 24:
            case 47:
                C2362933e r45 = (C2362933e) this.A03;
                return Integer.valueOf(((C243333Yi) r45.A05.A0C.getValue()).A00(r45.A00, (1Xj) this.A01, (AnonymousClass3W1) this.A02));
            case 25:
            case 48:
                C2362933e r24 = (C2362933e) this.A03;
                AnonymousClass4DU r62 = r24.A06;
                return ((C243333Yi) r24.A05.A0C.getValue()).A01(r24.A00, (1Xj) this.A01, r62, (AnonymousClass3W1) this.A02, r24.A09, r24.A0E);
            case 26:
                C2362933e r25 = (C2362933e) this.A03;
                C243273Yc A002 = r25.A05.A00();
                Context context4 = r25.A00;
                AnonymousClass4DU r72 = r25.A06;
                return A002.A02(context4, new C246963fY(context4), (1Xj) this.A01, r72, (AnonymousClass3W1) this.A02);
            case 27:
            case 34:
                C2362933e r53 = (C2362933e) this.A03;
                return ((C282785Es) r53.A05.A0R.getValue()).A00(new Object(), (1Xj) this.A01, r53.A06, (AnonymousClass3W1) this.A02);
            case 28:
            case 49:
                ((C2362933e) this.A03).A05.A0d.getValue();
                return Integer.valueOf(C246943fU.A00((1Xj) this.A01, (AnonymousClass3W1) this.A02));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C2362933e r46 = (C2362933e) this.A03;
                return ((C246943fU) r46.A05.A0d.getValue()).A01((1Xj) this.A01, r46.A06, (AnonymousClass3W1) this.A02);
            case 32:
            case 36:
                C2362933e r26 = (C2362933e) this.A03;
                C242923Ws A012 = r26.A05.A01();
                1Xj r54 = (1Xj) this.A01;
                AnonymousClass3W1 r8 = (AnonymousClass3W1) this.A02;
                return A012.A04(r26.A00, r54, r26.A06, (AnonymousClass3YB) r26.A0D.invoke(r54, r8), r8, r26.A0B);
            case 33:
            case 40:
                C2362933e r03 = (C2362933e) this.A03;
                return Integer.valueOf(C243163Xq.A00(r03.A02, (1Xj) this.A01, r03.A06, (AnonymousClass3W1) this.A02));
            case 39:
                C2362933e r27 = (C2362933e) this.A03;
                Context context5 = r27.A00;
                AnonymousClass2xS r82 = r27.A08;
                return ((AnonymousClass4U7) r27.A05.A0K.getValue()).A01(context5, (1Xj) this.A01, r27.A06, (AnonymousClass3W1) this.A02, r82);
            case Seq.NULL_REFNUM:
                C2362933e r28 = (C2362933e) this.A03;
                AnonymousClass2xS r83 = r28.A08;
                return ((C245813dW) r28.A05.A0a.getValue()).A00(r28.A00, (1Xj) this.A01, r28.A06, (AnonymousClass3W1) this.A02, r83);
            case 43:
                C2362933e r47 = (C2362933e) this.A03;
                C39722A6n a6n2 = (C39722A6n) r47.A05.A0E.getValue();
                1Xj r92 = (1Xj) this.A01;
                AnonymousClass3W1 r122 = (AnonymousClass3W1) this.A02;
                AnonymousClass3YB r11 = (AnonymousClass3YB) r47.A0D.invoke(r92, r122);
                AnonymousClass2xS r29 = r47.A08;
                Context context6 = r47.A00;
                AnonymousClass4DU r10 = r47.A06;
                Integer num = r47.A0A;
                AnonymousClass57L r84 = r47.A03;
                0xF r73 = r47.A01;
                String str = r47.A0B;
                boolean z3 = r47.A0E;
                C249763kK r04 = r47.A09;
                AnonymousClass7TG.A1T(r92, r122, r11);
                return new C61084JwM(41, (Object) a6n2.A01.A01(context6, r92, r10, r122, r04, z3), (Object) a6n2.A02.A01(context6, r73, r84, r92, r10, r11, r122, num, str), (Object) a6n2.A03.A00(context6, r92, r10, r122, r29));
            case 45:
                C2362933e r210 = (C2362933e) this.A03;
                1Xj r74 = (1Xj) this.A01;
                AnonymousClass3W1 r102 = (AnonymousClass3W1) this.A02;
                Context context7 = r210.A00;
                AnonymousClass4DU r85 = r210.A06;
                Integer num2 = r210.A0A;
                AnonymousClass57L r63 = r210.A03;
                return ((C242993Wz) r210.A05.A0D.getValue()).A01(context7, r210.A01, r63, r74, r85, (AnonymousClass3YB) r210.A0D.invoke(r74, r102), r102, num2, r210.A0B);
            default:
                C2362933e r48 = (C2362933e) this.A03;
                return Integer.valueOf(r48.A05.A01().A02(r48.A02, (1Xj) this.A01, (AnonymousClass3W1) this.A02));
        }
        r5.A00(new C240263Kf(r4, r3, z, z2));
        return C60340gF.A00;
    }
}
