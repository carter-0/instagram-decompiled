package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Kn  reason: invalid class name and case insensitive filesystem */
public final class C377099Kn extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377099Kn(C2357230y r2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        C2357230y r2 = (C2357230y) this.A01;
        switch (i) {
            case 0:
                return new AnonymousClass4GH(r2.A0A, r2, (C253843rV) r2.A1M.getValue());
            case 1:
                UserSession userSession = r2.A0A;
                Fragment fragment = r2.A02;
                AnonymousClass4DU r6 = r2.A0K;
                C231332rR r5 = r2.A0O;
                C2355030c r4 = r2.A0H;
                C228232l0 r3 = r2.A0n;
                return new AnonymousClass3T9(fragment, userSession, r2.A0B, r4, r2, r6, r5, r2.A0X, r3);
            case 2:
                C234422xq r9 = r2.A0b;
                if (r9 == null) {
                    return new C234422xq(r2.A02.requireContext(), r2.A0A, r2.A0K, C234242xR.A00());
                }
                return r9;
            case 3:
                return new AnonymousClass4GM(r2.A02, r2, (C246733f9) r2.A1L.getValue(), (C253843rV) r2.A1M.getValue(), r2.A0o);
            case 4:
                return new C57167IRg(r2, (C253843rV) r2.A1M.getValue());
            case 5:
                return new C279124y7(r2.A02, r2.A0A, r2, (C253843rV) r2.A1M.getValue());
            case 6:
                return new AnonymousClass4GC(r2.A02, r2.A0A, r2, (C246733f9) r2.A1L.getValue(), r2.A0N, r2.A0W);
            case 7:
                return new C57227ITo(r2.A02, r2.A0A, r2.A0K);
            case 8:
                return new C57172IRl(r2.A0A, r2, (C253843rV) r2.A1M.getValue(), r2.A0K, r2.A0o);
            case 9:
                UserSession userSession2 = r2.A0A;
                AnonymousClass4DU r52 = r2.A0K;
                return new C14213Trs(r2.A02, userSession2, r52, r2.A0O, r2.A0k, r2.A0w);
            case 10:
                UserSession userSession3 = r2.A0A;
                return new C57174IRn(r2.A02, userSession3, r2, r2.A0K, r2.A0w, r2.A0s);
            case 11:
                return new GUC(r2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AnonymousClass4G0(r2.A02.requireActivity(), r2.A0A, r2.A0f);
            case 13:
                UserSession userSession4 = r2.A0A;
                Fragment fragment2 = r2.A02;
                boolean z = r2.A2S;
                return new C246793fF(fragment2, userSession4, r2.A0W, r2.A0g, z);
            case 14:
                return new C246733f9(r2.A0A, r2.A0W);
            case 15:
                UserSession userSession5 = r2.A0A;
                Fragment fragment3 = r2.A02;
                AnonymousClass4DU r10 = r2.A0K;
                AnonymousClass2xS r8 = r2.A0W;
                C228232l0 r7 = r2.A0n;
                boolean z2 = r2.A2T;
                String str = r2.A0w;
                return new C253843rV(fragment3, userSession5, r2, r10, r2.A0L, r2.A0Q, r8, r2.A0a, r7, (C249763kK) r2.A2E.getValue(), str, z2);
            case 16:
                UserSession userSession6 = r2.A0A;
                Fragment fragment4 = r2.A02;
                1Ux r42 = r2.A0a;
                C231332rR r32 = r2.A0O;
                return new C2363033f(fragment4, userSession6, r2, r2.A0K, r32, r42, r2.A0w);
            case 17:
                UserSession userSession7 = r2.A0A;
                Fragment fragment5 = r2.A02;
                1Ng r72 = r2.A08;
                AnonymousClass4DU r53 = r2.A0K;
                String str2 = r2.A0t;
                SearchContext searchContext = r2.A0g;
                return new C246803fG(fragment5, r72, userSession7, r2, r53, r2.A0L, searchContext, (C249763kK) r2.A2E.getValue(), str2, String.valueOf(r2.A0r), r2.A0x);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                UserSession userSession8 = r2.A0A;
                Fragment fragment6 = r2.A02;
                AnonymousClass4DU r43 = r2.A0K;
                AnonymousClass4DV BqC = r2.BqC();
                C227762js r1 = r2.A04;
                return new AnonymousClass338(fragment6, r1, userSession8, r43, r2.A0W, BqC, (C249763kK) r2.A2E.getValue(), AnonymousClass337.FEED_WATCH_AND_BROWSE);
            case 19:
                return new AnonymousClass33J(r2.A0A, r2.A0h, r2.A0i);
            case 20:
                return new C65315LrE(r2.A02, r2.A0A, r2, r2.A0K);
            case 21:
                UserSession userSession9 = r2.A0A;
                AnonymousClass4D6 r54 = r2.A02;
                C231332rR r33 = r2.A0O;
                return new AnonymousClass415(r54, r2.A07, userSession9, r54, r2.A0K, r33);
            case 22:
                return new C252583pL(r2.A02, r2, r2, r2.A0K, r2.A0V);
            case 23:
                Fragment fragment7 = r2.A02;
                UserSession userSession10 = r2.A0A;
                C231332rR r82 = r2.A0O;
                AnonymousClass2xS r73 = r2.A0W;
                return new C246823fI(fragment7, userSession10, r2, (C246793fF) r2.A1K.getValue(), (C246803fG) r2.A1O.getValue(), r82, r2.A0V, r73, r2.A0j, r2.A0m, (C249763kK) r2.A2E.getValue());
            case 24:
                UserSession userSession11 = r2.A0A;
                return new C57239IUa(r2.A02, userSession11, r2, (C2363033f) r2.A1N.getValue(), r2.A0O);
            case 25:
                return new GU5(r2.A02, r2.AbT(), r2.A0A);
            case 26:
                UserSession userSession12 = r2.A0A;
                AnonymousClass2xS r62 = r2.A0W;
                AnonymousClass4DV r55 = r2.A02;
                return new C2360632h(r55, r2.A08, userSession12, r2, r2.A0K, r2.A0O, r62, r55);
            case 27:
                UserSession userSession13 = r2.A0A;
                Fragment fragment8 = r2.A02;
                AnonymousClass32D r34 = new AnonymousClass32D();
                r34.A07 = true;
                return new C262844Gf(fragment8, r2.AbT(), userSession13, new ReelViewerConfig(r34));
            case 28:
                return new ISC(r2.A02, r2.A0K, r2.A0A);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new C50965Fls(r2.A02, r2.A0A);
            case 30:
                return new GU1(r2.A02, r2.AbT(), r2.A0A);
            case 31:
                return new C55632Hkr(r2.A02, r2.A0A);
            case 32:
                UserSession userSession14 = r2.A0A;
                return new C253853rW(r2.A02, userSession14, r2, (C253843rV) r2.A1M.getValue(), r2.A0K);
            case 33:
                UserSession userSession15 = r2.A0A;
                return new C248523i8(r2.A02, r2.A03, userSession15, r2, r2.A0K);
            case 34:
                return new A5U(r2.A02, r2.A0W);
            case 35:
                return new C57235ITw(r2.A0o);
            case 36:
                return new C57238ITz(r2);
            case 37:
                return new IU1(r2, (C253843rV) r2.A1M.getValue());
            case 38:
                Fragment fragment9 = r2.A02;
                C2355930l r14 = r2.A06;
                AnonymousClass4DU r13 = r2.A0K;
                0hq r12 = r2.A03;
                C228232l0 r11 = r2.A0n;
                String str3 = r2.A0w;
                AnonymousClass32A r74 = r2.A0e;
                String str4 = r2.A0v;
                C231332rR r56 = r2.A0O;
                AnonymousClass57T r44 = r2.A0I;
                return new AnonymousClass3WZ(fragment9, r12, r14, r2.A0A, r2.A0G, r44, r2, r13, r56, r2.A0W, r2.A0Z, r74, r11, (C249763kK) r2.A2E.getValue(), str3, str4);
            case 39:
                UserSession userSession16 = r2.A0A;
                Fragment fragment10 = r2.A02;
                return new AnonymousClass4JW(fragment10.getContext(), fragment10, userSession16, r2, (C253843rV) r2.A1M.getValue(), r2.A0K, r2.A0w);
            case 40:
                UserSession userSession17 = r2.A0A;
                AnonymousClass4DU r63 = r2.A0K;
                Fragment fragment11 = r2.A02;
                User user = r2.A0p;
                C2356230o r35 = r2.A0S;
                return new AnonymousClass41I(fragment11, r2.A03, userSession17, r2.A0B, r63, r35, user);
            case Seq.NULL_REFNUM:
                Fragment fragment12 = r2.A02;
                UserSession userSession18 = r2.A0A;
                0hq r17 = r2.A03;
                AnonymousClass4DU r25 = r2.A0K;
                0Pl r16 = r2.A0T;
                C2360832j r15 = r2.A0J;
                String str5 = r2.A0w;
                C228232l0 r122 = r2.A0n;
                AnonymousClass324 r112 = r2.A0f;
                AnonymousClass57N r102 = r2.A0F;
                boolean z3 = r2.A2U;
                AnonymousClass57U r75 = r2.A0c;
                C270394gf r64 = r2.A0q;
                1Ng r57 = r2.A08;
                boolean z4 = r2.A2R;
                String str6 = r2.A0u;
                return new C246323eP(fragment12, r17, r2.A05, r57, userSession18, r2.A0E, r102, r15, r2, r25, r16, r2.A0Z, r75, r112, r122, (C249763kK) r2.A2E.getValue(), r64, str5, str6, z3, z4);
            case Seq.RefTracker.REF_OFFSET:
                UserSession userSession19 = r2.A0A;
                AnonymousClass4DU r58 = r2.A0K;
                return new C246433eb(r2.A02, userSession19, r2, r58, r2.A0O, r2.A0U, r2.A0p);
            case 43:
                UserSession userSession20 = r2.A0A;
                AnonymousClass4DU r36 = r2.A0K;
                return new C57178IRr(r2.A02, userSession20, r2, r36, r2.A0U);
            case 44:
                UserSession userSession21 = r2.A0A;
                AnonymousClass4DU r45 = r2.A0K;
                AnonymousClass324 r37 = r2.A0f;
                return new IXG(userSession21, r2, r45, r2.A0L, r37, r2.A0n);
            case 45:
                return new C246863fM(r2.A02, r2.A0W);
            case 46:
                UserSession userSession22 = r2.A0A;
                Fragment fragment13 = r2.A02;
                AnonymousClass4DU r76 = r2.A0K;
                String str7 = r2.A0w;
                User user2 = r2.A0p;
                return new C262854Gg(fragment13, r2.A06, userSession22, r2.A0B, (C246793fF) r2.A1K.getValue(), r76, (C262844Gf) r2.A1Y.getValue(), user2, (C249763kK) r2.A2E.getValue(), str7);
            case 47:
                return new AnonymousClass47N(r2.A0A, r2.A0K, r2.A0w);
            case 48:
                AnonymousClass2xI r38 = r2.A0R;
                AnonymousClass4DV r18 = r2.A02;
                return new C242893Wp(r18, r2, r38, r18);
            default:
                UserSession userSession23 = r2.A0A;
                User user3 = r2.A0p;
                Fragment fragment14 = r2.A02;
                0hq r83 = r2.A03;
                AnonymousClass4DU r77 = r2.A0K;
                C228232l0 r65 = r2.A0n;
                return new C256153vJ(fragment14, r83, userSession23, r2, r77, r2.A0L, r2.A0P, r65, user3, (C249763kK) r2.A2E.getValue(), r2.A0r, r2.A0x);
        }
    }
}
