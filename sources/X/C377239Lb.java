package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Lb  reason: invalid class name and case insensitive filesystem */
public final class C377239Lb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377239Lb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v33, types: [java.lang.Object, X.GKK] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new C243253Ya((C2357230y) this.A01);
            case 1:
                C2357230y r1 = (C2357230y) this.A01;
                UserSession userSession = r1.A0A;
                AnonymousClass2xI r8 = r1.A0Q;
                C270394gf r13 = r1.A0q;
                return new ISR(r1.A02, userSession, r1.A0K, r8, r1.A0a, r1.A0g, r1.A0n, (C249763kK) r1.A2E.getValue(), r13, r1.A0r, r1.A0x);
            case 2:
                C2357230y r12 = (C2357230y) this.A01;
                1Ng r6 = r12.A08;
                C2356230o r10 = r12.A0S;
                return new C246333eQ(r12.A02, r6, r12.A0A, r12.A0B, (C246323eP) r12.A1l.getValue(), r10);
            case 3:
                C2357230y r7 = (C2357230y) this.A01;
                UserSession userSession2 = r7.A0A;
                Fragment fragment = r7.A02;
                AnonymousClass4DU r102 = r7.A0K;
                C228232l0 r132 = r7.A0n;
                return new AnonymousClass41F(fragment, userSession2, r7, r7, (C246803fG) r7.A1O.getValue(), r102, r7.A0U, r7.A0d, r132);
            case 4:
                C2357230y r3 = (C2357230y) this.A01;
                return new ISV(r3.A02.requireActivity(), r3.A0A, r3.A0K);
            case 5:
                return new C247203fw(((C2357230y) this.A01).A0W);
            case 6:
                C2357230y r2 = (C2357230y) this.A01;
                return new C243023Xc(r2, r2.A0W, r2.A0Y);
            case 7:
                C2357230y r14 = (C2357230y) this.A01;
                UserSession userSession3 = r14.A0A;
                Fragment fragment2 = r14.A02;
                AnonymousClass2xS r103 = r14.A0W;
                return new C246743fA(fragment2, userSession3, (C246733f9) r14.A1L.getValue(), r14.A0N, r14.A0O, r103);
            case 8:
                return new AnonymousClass3WU(((C2357230y) this.A01).A0X);
            case 9:
                C2357230y r32 = (C2357230y) this.A01;
                return new AnonymousClass33A(r32.A02.requireActivity(), r32.A0K, r32.A0A);
            case 10:
                C2357230y r0 = (C2357230y) this.A01;
                return new AnonymousClass4H5(r0.A02, r0.A0A);
            case 11:
                C2357230y r02 = (C2357230y) this.A01;
                return new GU7(r02.A02, r02.A0A);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C2357230y r03 = (C2357230y) this.A01;
                return new C262984Gt(r03.A02, r03.A08, r03.A0A, r03.A0K);
            case 13:
                C2357230y r04 = (C2357230y) this.A01;
                return new GU9(r04.A02, r04.A0A);
            case 14:
                C2357230y r22 = (C2357230y) this.A01;
                return new C65318LrH(r22.A02.requireActivity(), r22.A0A);
            case 15:
                C2357230y r72 = (C2357230y) this.A01;
                UserSession userSession4 = r72.A0A;
                AnonymousClass4DU r82 = r72.A0K;
                String str = r72.A0w;
                return new C19654WdI(r72.A02, userSession4, r72, r82, r72.A0O, r72.A0l, (C249763kK) r72.A2E.getValue(), str);
            case 16:
                C2357230y r73 = (C2357230y) this.A01;
                UserSession userSession5 = r73.A0A;
                AnonymousClass4DU r83 = r73.A0K;
                return new C19656WdK(r73.A02, userSession5, r73, r83, r73.A0l, r73.A0w);
            case 17:
                C2357230y r05 = (C2357230y) this.A01;
                UserSession userSession6 = r05.A0A;
                return new GU6(r05.A02, r05.A08, userSession6, r05.A0C, r05.A0D);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new AnonymousClass336(((C2357230y) this.A01).A02);
            case 19:
                return new C246783fE(((C2357230y) this.A01).A0W);
            case 20:
                Object obj = this.A01;
                if (obj == null) {
                    return new C19826Wg7(1);
                }
                return obj;
            case 21:
                C2357230y r06 = (C2357230y) this.A01;
                UserSession userSession7 = r06.A0A;
                AnonymousClass4DU r74 = r06.A0K;
                return new C14214Trt(r06.A02, userSession7, r74, r06.A0O, r06.A0k, r06.A0w);
            case 22:
                C2357230y r07 = (C2357230y) this.A01;
                return new C242953Wv(r07.A02, r07.A03, r07.A0A, r07.A0K);
            case 23:
                C2357230y r33 = (C2357230y) this.A01;
                return new ISL(r33.A02, r33, (C253843rV) r33.A1M.getValue(), r33.A0o);
            case 24:
                return new C40513AdM((C253843rV) ((C2357230y) this.A01).A1M.getValue());
            case 25:
                C2357230y r9 = (C2357230y) this.A01;
                UserSession userSession8 = r9.A0A;
                String str2 = r9.A0w;
                AnonymousClass4DU r104 = r9.A0K;
                AnonymousClass0iw r5 = r9.A02;
                String str3 = r9.A0s;
                return new C57434Iae(r5, r9.A03, r5, userSession8, r9, r104, r9.A0W, (C249763kK) r9.A2E.getValue(), str2, str3);
            case 26:
                C2357230y r08 = (C2357230y) this.A01;
                return new C2361032l(r08.A0A, r08.A0M, r08.A0O);
            case 27:
                C2357230y r84 = (C2357230y) this.A01;
                UserSession userSession9 = r84.A0A;
                AnonymousClass4DU r105 = r84.A0K;
                return new C2363133g(r84.A02, r84.A03, userSession9, r84, (C2363033f) r84.A1N.getValue(), r105, r84.A0M, r84.A0O, (C249763kK) r84.A2E.getValue());
            case 28:
                return new AnonymousClass3YI(((C2357230y) this.A01).A0B);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C2357230y r09 = (C2357230y) this.A01;
                return new IXZ(r09.A02, r09.A0A, r09.A0f);
            case 30:
                C2357230y r15 = (C2357230y) this.A01;
                return new C14192TrX(r15.A02.requireActivity(), r15.A0A, r15.A0K, r15.A0s, r15.A0w);
            case 31:
                C2357230y r34 = (C2357230y) this.A01;
                return new C14215Tru(r34.A02, r34.A0k, (C14192TrX) r34.A2O.getValue());
            case 32:
                C2357230y r35 = (C2357230y) this.A01;
                return new GU4(r35.A02, r35.A0k, (C14192TrX) r35.A2O.getValue());
            case 33:
                AnonymousClass3WZ r010 = (AnonymousClass3WZ) this.A01;
                return new C313716gt(r010.A00, r010.A03);
            case 34:
                AnonymousClass33A r011 = (AnonymousClass33A) this.A01;
                GKH gkh = new GKH(r011.A01, r011.A02);
                ? obj2 = new Object();
                obj2.EbG(new J6H(gkh, 47));
                return obj2;
            case 35:
                return C247323g9.A00(((AnonymousClass33A) this.A01).A02);
            case 36:
                return new C55471HiF(((AnonymousClass33A) this.A01).A02);
            case 37:
                return new 2AK((UserSession) this.A01);
            case 38:
                02m r012 = (02m) this.A01;
                0qQ.A0A(r012);
                return new C228362lW(r012);
            case 39:
                return new AnonymousClass3VT((UserSession) this.A01);
            case 40:
                UserSession userSession10 = (UserSession) this.A01;
                return new 1se(1Al.A01(userSession10).A04(1An.A1a, 1se.class), userSession10);
            case Seq.NULL_REFNUM:
                UserSession userSession11 = (UserSession) this.A01;
                return new 1E5(userSession11, 1E7.A00(userSession11), 17h.A00(userSession11));
            case Seq.RefTracker.REF_OFFSET:
                return 1Dm.A01.A00((UserSession) this.A01).A00().consistencyService;
            case 43:
                return new 1E8((UserSession) this.A01);
            case 44:
                UserSession userSession12 = (UserSession) this.A01;
                return new AnonymousClass942(1Al.A01(userSession12).A04(1An.A2d, 1se.class), userSession12);
            case 45:
                return new C252263op((UserSession) this.A01);
            case 46:
                return new FlashMediaRepository((UserSession) this.A01);
            case 47:
                return new FlashMediaCacheImpl((UserSession) this.A01);
            case 48:
                return new AnonymousClass93L((UserSession) this.A01);
            default:
                C2614749s r013 = (C2614749s) this.A01;
                return new C2615049v(r013.A06, r013.A05.getModuleName());
        }
    }
}
