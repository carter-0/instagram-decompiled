package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Kt  reason: invalid class name and case insensitive filesystem */
public final class C377159Kt extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377159Kt(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [X.2s5, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass33Z r0 = (AnonymousClass33Z) this.A01;
                UserSession userSession = r0.A00;
                0Pl r10 = r0.A03;
                C249763kK r11 = r0.A04;
                1NK A002 = 1NK.A00();
                0qQ.A07(A002);
                return new C262714Fq(A002, userSession, new C262704Fp(userSession), (C245813dW) r0.A0a.getValue(), r10, r11);
            case 1:
                AnonymousClass33Z r4 = (AnonymousClass33Z) this.A01;
                C243273Yc A003 = r4.A00();
                C243323Yh r7 = (C243323Yh) r4.A09.getValue();
                UserSession userSession2 = r4.A00;
                boolean z = r4.A0l;
                boolean z2 = r4.A0m;
                AnonymousClass310 r9 = r4.A01;
                boolean z3 = r4.A0k;
                return new C243333Yi(userSession2, r7, (C243283Yd) r4.A0S.getValue(), r9, A003, (C243293Ye) r4.A0W.getValue(), r4.A03, (C2364033p) r4.A0Q.getValue(), C231512rn.A00(userSession2), r4.A04, z, z2, z3);
            case 2:
                AnonymousClass33Z r1 = (AnonymousClass33Z) this.A01;
                C242983Wy r72 = (C242983Wy) r1.A0M.getValue();
                UserSession userSession3 = r1.A00;
                return new C242993Wz(userSession3, r72, r1.A01(), (C242943Wu) r1.A0Z.getValue(), C231512rn.A00(userSession3));
            case 3:
                AnonymousClass33Z r42 = (AnonymousClass33Z) this.A01;
                return new C39722A6n(r42.A00, (C243333Yi) r42.A0C.getValue(), (C242993Wz) r42.A0D.getValue(), (C245813dW) r42.A0a.getValue());
            case 4:
                return new I6D(((AnonymousClass33Z) this.A01).A00);
            case 5:
                return new C55985Hqq(((AnonymousClass33Z) this.A01).A00);
            case 6:
                return new C39765A8f(((AnonymousClass33Z) this.A01).A00);
            case 7:
                return new C55493Hib(((AnonymousClass33Z) this.A01).A01.AqY());
            case 8:
                AnonymousClass33Z r12 = (AnonymousClass33Z) this.A01;
                return new C55986Hqr(r12.A02, r12.A00, new C55495Hid(r12.A03), r12.A01.B54());
            case 9:
                AnonymousClass33Z r13 = (AnonymousClass33Z) this.A01;
                UserSession userSession4 = r13.A00;
                C252593pM B5F = r13.A01.B5F();
                C249763kK r102 = r13.A04;
                return new AnonymousClass4U7(userSession4, B5F, (C245813dW) r13.A0a.getValue(), r13.A03, r102);
            case 10:
                AnonymousClass33Z r02 = (AnonymousClass33Z) this.A01;
                return new C247703gm(r02.A00, r02.A01.B5G());
            case 11:
                AnonymousClass33Z r2 = (AnonymousClass33Z) this.A01;
                return new C242983Wy(r2.A00, r2.A01.BwU());
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass33Z r03 = (AnonymousClass33Z) this.A01;
                return new C248083hO(r03.A00, r03.A03);
            case 13:
                return new C17270VOx(((AnonymousClass33Z) this.A01).A01.BF4());
            case 14:
                AnonymousClass33Z r3 = (AnonymousClass33Z) this.A01;
                return new C247723go(r3.A00, r3.A03, (C2364033p) r3.A0Q.getValue());
            case 15:
                C2364133q r22 = C2364033p.A02;
                AnonymousClass33Z r04 = (AnonymousClass33Z) this.A01;
                return r22.A00(r04.A00, r04.A02);
            case 16:
                AnonymousClass33Z r05 = (AnonymousClass33Z) this.A01;
                return new C282785Es(r05.A00, r05.A01.BRK());
            case 17:
                AnonymousClass33Z r06 = (AnonymousClass33Z) this.A01;
                return new C243283Yd(r06.A00, r06.A03);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C55921Hpi(((AnonymousClass33Z) this.A01).A00);
            case 19:
                return new C55502Hik(((AnonymousClass33Z) this.A01).A01.BQC());
            case 20:
                AnonymousClass33Z r43 = (AnonymousClass33Z) this.A01;
                return new C242923Ws(r43.A00, r43.A01.BQE(), r43.A03, false);
            case 21:
                return new GV6(((AnonymousClass33Z) this.A01).A00);
            case 22:
                return new C243293Ye(((AnonymousClass33Z) this.A01).A00);
            case 23:
                return new C45440CwN(((AnonymousClass33Z) this.A01).A00);
            case 24:
                return new C39764A8e(((AnonymousClass33Z) this.A01).A00);
            case 25:
                AnonymousClass33Z r07 = (AnonymousClass33Z) this.A01;
                UserSession userSession5 = r07.A00;
                C249763kK r23 = r07.A04;
                AnonymousClass310 r08 = r07.A01;
                return new C242943Wu(userSession5, r08.BD7(), r08.BQE(), r23);
            case 26:
                AnonymousClass33Z r09 = (AnonymousClass33Z) this.A01;
                return new C243273Yc(r09.A00, r09.A01.BRB());
            case 27:
                AnonymousClass33Z r14 = (AnonymousClass33Z) this.A01;
                return new C245813dW(r14.A00, new Object(), r14.A01.BRM(), r14.A03, r14.A04);
            case 28:
                AnonymousClass33Z r010 = (AnonymousClass33Z) this.A01;
                return new C56531I0c(r010.A00, r010.A01.BeO());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                AnonymousClass33Z r011 = (AnonymousClass33Z) this.A01;
                return new C246943fU(r011.A00, r011.A04);
            case 30:
                return new A4C(((AnonymousClass33Z) this.A01).A00);
            case 31:
                AnonymousClass310 r012 = ((AnonymousClass33Z) this.A01).A01;
                JOB BRC = r012.BRC();
                C256163vK BRA = r012.BRA();
                AnonymousClass41G BRE = r012.BRE();
                C242813Wa BQE = r012.BQE();
                C246343eR BRD = r012.BRD();
                AnonymousClass4DV BqC = r012.BqC();
                JRM C41 = r012.C41();
                return new C55873Hou(r012.Br7(), r012.C3Y(), BRA, BRC, BRD, BRE, BQE, BqC, C41);
            case 32:
                AnonymousClass33Z r013 = (AnonymousClass33Z) this.A01;
                return new C248023hI(r013.A00, r013.A04);
            case 33:
                AnonymousClass33Z r014 = (AnonymousClass33Z) this.A01;
                return new I4I(r014.A00, r014.A01.C87());
            case 34:
                return new AnonymousClass3YK(((AnonymousClass33Z) this.A01).A01.CBR());
            case 35:
                return new C252903pt(((AnonymousClass33Z) this.A01).A00);
            case 36:
                return Boolean.valueOf(((C248613iH) this.A01).A00.A05);
            case 37:
                return new AnonymousClass3D1((int) 182.A01(0Tu.A05, (0lg) this.A01, 36608626194519781L));
            case 38:
                return AnonymousClass941.A00(((C2360832j) this.A01).A01);
            case 39:
                return C258393yw.A00(((C258343yr) this.A01).A01);
            case 40:
                AnonymousClass3T9 r15 = (AnonymousClass3T9) this.A01;
                C231332rR r44 = r15.A03;
                if (r44 instanceof C231282rM) {
                    2el r24 = r15.A02;
                    UserSession userSession6 = r15.A01;
                    0qQ.A0C(r44, "null cannot be cast to non-null type com.instagram.feed.ui.adapter.MediaListProviderAdapter");
                    return new GV5(userSession6, r15.A00, r24, (C231282rM) r44);
                }
                throw new IllegalArgumentException("To Support comment lazy loading, implement MediaListProviderAdapter for your adapter");
            case Seq.NULL_REFNUM:
                C2357230y r92 = (C2357230y) this.A01;
                UserSession userSession7 = r92.A0A;
                AnonymousClass4DU r112 = r92.A0K;
                return new C2363133g(r92.A02, r92.A03, userSession7, r92, (C2363033f) r92.A1N.getValue(), r112, r92.A0M, r92.A0O, (C249763kK) r92.A2E.getValue());
            case Seq.RefTracker.REF_OFFSET:
                C2357230y r015 = (C2357230y) this.A01;
                UserSession userSession8 = r015.A0A;
                Fragment fragment = r015.A02;
                String str = r015.A0s;
                return new C258343yr(fragment, userSession8, r015.A0K, r015.A0W, r015.A0m, str);
            case 43:
                C2357230y r016 = (C2357230y) this.A01;
                return new GUF(r016.A02, r016.A0A);
            case 44:
                C2357230y r017 = (C2357230y) this.A01;
                return new C50435Fbi(r017.A02, r017.A0A, r017.A0K);
            case 45:
                return new C243303Yf((AnonymousClass3WZ) ((C2357230y) this.A01).A1i.getValue());
            case 46:
                C2357230y r018 = (C2357230y) this.A01;
                return new C246883fO(r018.A02, r018.A0A);
            case 47:
                C2357230y r019 = (C2357230y) this.A01;
                UserSession userSession9 = r019.A0A;
                return new C72692PFw(r019.A02, r019.AbT(), userSession9, r019.A0K);
            case 48:
                C2357230y r8 = (C2357230y) this.A01;
                return new C274104ni(r8.A02, r8.A0A, r8, (C246733f9) r8.A1L.getValue(), r8.A0N);
            default:
                C2357230y r32 = (C2357230y) this.A01;
                return new C274174np(r32.A02, r32.A0A, r32, (C253843rV) r32.A1M.getValue());
        }
    }
}
