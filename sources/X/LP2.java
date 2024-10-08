package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public abstract class LP2 {
    public final C66576MXh A02() {
        C66576MXh mXh;
        if (this instanceof C61823KNm) {
            mXh = ((C61823KNm) this).A00;
        } else {
            mXh = ((C61822KNl) this).A06;
        }
        if (mXh != null) {
            return mXh;
        }
        0qQ.A0F("publishScreenDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62950Kp2 A03() {
        C62950Kp2 kp2;
        if (this instanceof C61823KNm) {
            kp2 = ((C61823KNm) this).A02;
        } else {
            kp2 = ((C61822KNl) this).A08;
        }
        if (kp2 != null) {
            return kp2;
        }
        0qQ.A0F("rowItemFactory");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C60102Jfi A04() {
        C60102Jfi jfi;
        if (this instanceof C61822KNl) {
            jfi = ((C61822KNl) this).A09;
        } else {
            jfi = ((C61823KNm) this).A03;
        }
        if (jfi != null) {
            return jfi;
        }
        0qQ.A0F("publishScreenViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r24v2, types: [X.L15, java.lang.Object] */
    public final void A05() {
        String str;
        String str2;
        AnonymousClass0eM r11;
        AnonymousClass0iw r31;
        String str3;
        28D r4;
        PendingRecipient pendingRecipient;
        if (this instanceof C61823KNm) {
            C61823KNm kNm = (C61823KNm) this;
            if (kNm.A09 == null) {
                boolean z = kNm.A05.getBoolean("ClipsConstants.ARG_CLIPS_IS_FROM_DIRECT_TO_SHARE", false);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID is null; shareSheetMode = ");
                A1A.append(kNm.A0R.getValue());
                A1A.append(", isClipsFromDraft = ");
                A1A.append(z);
                A1A.append(", isPostEntryPoint = ");
                A1A.append(kNm.A0b);
                0wb.A03(K66.__redex_internal_original_name, A1A.toString());
            }
            AnonymousClass4DH r55 = kNm.A06;
            FragmentActivity requireActivity = r55.requireActivity();
            Application A05 = DbY.A05(r55);
            CallerContext callerContext = C61823KNm.A0c;
            ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) kNm.A0S.getValue();
            C60187Jh6 jh6 = (C60187Jh6) kNm.A0X.getValue();
            AnonymousClass0eM r54 = kNm.A0O;
            C60288Jik jik = (C60288Jik) r54.getValue();
            C60164Jgj jgj = (C60164Jgj) kNm.A0W.getValue();
            C60112Jft jft = (C60112Jft) kNm.A0P.getValue();
            AnonymousClass0eM r53 = kNm.A0D;
            C60259JiG A0P = JTT.A0P(r53);
            AnonymousClass0eM r52 = kNm.A0G;
            C60264JiL jiL = (C60264JiL) r52.getValue();
            AnonymousClass0eM r51 = kNm.A0M;
            C60119Jg0 jg0 = (C60119Jg0) r51.getValue();
            AnonymousClass0eM r50 = kNm.A0Q;
            C60132JgD jgD = (C60132JgD) r50.getValue();
            UserSession userSession = kNm.A08;
            AnonymousClass89T A00 = C347157wM.A00(userSession);
            A00.A00(K66.__redex_internal_original_name);
            FragmentActivity requireActivity2 = r55.requireActivity();
            LO3 lo3 = (LO3) kNm.A0E.getValue();
            LFG lfg = (LFG) kNm.A0H.getValue();
            AnonymousClass0eM r49 = kNm.A0N;
            C65173Loc loc = (C65173Loc) r49.getValue();
            AnonymousClass0iw r25 = kNm.A07;
            Bundle bundle = kNm.A05;
            String string = bundle.getString(AnonymousClass000.A00(2162));
            String string2 = bundle.getString(AnonymousClass000.A00(2161));
            String str4 = kNm.A0A;
            boolean z2 = kNm.A0b;
            boolean z3 = kNm.A0Y;
            boolean z4 = kNm.A0Z;
            boolean z5 = kNm.A0a;
            boolean z6 = bundle.getBoolean(AnonymousClass000.A00(2151));
            boolean z7 = bundle.getBoolean(C66579MXk.A00(88));
            boolean z8 = bundle.getBoolean(AnonymousClass000.A00(2149), false);
            Parcelable parcelable = bundle.getParcelable(AnonymousClass000.A00(57));
            if (parcelable instanceof PendingRecipient) {
                pendingRecipient = (PendingRecipient) parcelable;
            } else {
                pendingRecipient = null;
            }
            C60132JgD jgD2 = jgD;
            C61829KNs A002 = JTO.A0L(new C61607KEi(A05, requireActivity2, callerContext, jgD2, jft, jg0, r25, userSession, clipsSharingDraftViewModel, A0P, lo3, lfg, jiL, loc, jik, jgj, jh6, A00, pendingRecipient, string, string2, str4, z2, z3, z4, z5, z6, z7, z8, bundle.getBoolean(AnonymousClass000.A00(2146))), requireActivity).A00(C61829KNs.class);
            0qQ.A0B(A002, 0);
            kNm.A04 = A002;
            kNm.A03 = A002;
            FragmentActivity requireActivity3 = r55.requireActivity();
            C61829KNs kNs = kNm.A04;
            if (kNs != null) {
                C60259JiG A0P2 = JTT.A0P(r53);
                AnonymousClass0eM r1 = kNm.A0K;
                kNm.A00 = new C65170LoZ(requireActivity3, (C60132JgD) r50.getValue(), r25, userSession, (L4G) kNm.A0I.getValue(), A0P2, (LMT) r1.getValue(), kNs, (C17990VjS) kNm.A0T.getValue());
                C61829KNs kNs2 = kNm.A04;
                if (kNs2 != null) {
                    C60259JiG A0P3 = JTT.A0P(r53);
                    kNm.A02 = new C61826KNp((C60130JgB) kNm.A0V.getValue(), r55, (C60132JgD) r50.getValue(), (C60119Jg0) r51.getValue(), (C53024GhF) kNm.A0U.getValue(), (C60253JiA) kNm.A0B.getValue(), r25, userSession, A0P3, kNm.A02(), (C65173Loc) r49.getValue(), (C65175Loe) kNm.A0J.getValue(), (LMT) r1.getValue(), (C60264JiL) r52.getValue(), kNs2, (C60288Jik) r54.getValue());
                    return;
                }
            }
            str = "clipsPublishScreenViewModel";
        } else {
            C61822KNl kNl = (C61822KNl) this;
            Fragment fragment = kNl.A0G;
            Context requireContext = fragment.requireContext();
            0qQ.A0C(requireContext, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
            C3499582p Ajn = ((C267844cJ) requireContext).Ajn();
            0qQ.A0B(Ajn, 0);
            kNl.A00 = Ajn;
            kNl.A01 = Ajn.A00();
            C249713kF r2 = C249713kF.A00;
            UserSession userSession2 = kNl.A0I;
            KB3 A0X = r2.A0X(userSession2);
            kNl.A0D = A0X;
            A0X.A01 = AnonymousClass6SR.A01().A0D;
            fragment.registerLifecycleListener(A0X);
            if (C64191LSy.A00(kNl.A06(), true) <= 3) {
                str2 = "base_64_img";
            } else {
                str2 = "upload_id";
            }
            kNl.A0B = new L9K(userSession2, str2, C64191LSy.A00(kNl.A06(), true));
            C60259JiG A003 = JTO.A0L(new C61553KCg(userSession2, AnonymousClass05K.A00), fragment.requireActivity()).A00(C60259JiG.class);
            0qQ.A0B(A003, 0);
            kNl.A05 = A003;
            C60304Jj3 A004 = JTO.A0L(new KDN(userSession2, new C62030KWg(), true), fragment.requireActivity()).A00(C60304Jj3.class);
            boolean A06 = 182.A06(0Tu.A05, userSession2, 36323504790252750L);
            FragmentActivity requireActivity4 = fragment.requireActivity();
            if (A06) {
                Application A052 = DbY.A05(fragment);
                C3499682q A062 = kNl.A06();
                KO3 ko3 = new KO3(fragment.requireActivity(), userSession2, kNl.A06());
                r11 = kNl.A0N;
                C65172Lob lob = (C65172Lob) r11.getValue();
                r31 = kNl.A0H;
                str3 = kNl.A0M;
                r4 = kNl.A0F;
                FragmentActivity requireActivity5 = fragment.requireActivity();
                FragmentActivity requireActivity6 = fragment.requireActivity();
                C60259JiG jiG = kNl.A05;
                if (jiG != null) {
                    C60102Jfi A005 = JTO.A0L(new C61606KEh(A052, requireActivity6, requireActivity5, r4, r31, userSession2, A062, A004, ko3, lob, jiG, str3), requireActivity4).A00(C61828KNr.class);
                    0qQ.A0B(A005, 0);
                    kNl.A09 = A005;
                    C60102Jfi A04 = kNl.A04();
                    0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                    kNl.A03 = ((C61828KNr) A04).A03;
                    KO3 A07 = kNl.A07();
                    A07.A03.EBv(new C65890M3f(A07));
                }
                str = "clipsAudienceControlViewModel";
            } else {
                kNl.A03 = new KO3(requireActivity4, userSession2, kNl.A06());
                FragmentActivity requireActivity7 = fragment.requireActivity();
                Application A053 = DbY.A05(fragment);
                C3499682q A063 = kNl.A06();
                KO3 A072 = kNl.A07();
                r11 = kNl.A0N;
                C65172Lob lob2 = (C65172Lob) r11.getValue();
                r31 = kNl.A0H;
                str3 = kNl.A0M;
                r4 = kNl.A0F;
                FragmentActivity requireActivity8 = fragment.requireActivity();
                FragmentActivity requireActivity9 = fragment.requireActivity();
                C60259JiG jiG2 = kNl.A05;
                if (jiG2 != null) {
                    C60102Jfi A006 = JTO.A0L(new C61606KEh(A053, requireActivity9, requireActivity8, r4, r31, userSession2, A063, A004, A072, lob2, jiG2, str3), requireActivity7).A00(C61828KNr.class);
                    0qQ.A0B(A006, 0);
                    kNl.A09 = A006;
                }
                str = "clipsAudienceControlViewModel";
            }
            C65140Lo2 lo2 = new C65140Lo2(kNl);
            C3499582p r7 = kNl.A00;
            if (r7 != null) {
                KO3 A073 = kNl.A07();
                C60102Jfi A042 = kNl.A04();
                0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                UserSession userSession3 = userSession2;
                kNl.A02 = new C63877LAg(fragment, userSession3, r7, lo2, A073, JTO.A1C(A042, 49));
                C249713kF r24 = C249713kF.A00;
                Context requireContext2 = fragment.requireContext();
                C3499582p r8 = kNl.A00;
                if (r8 != null) {
                    0gy A007 = AnonymousClass07i.A00(fragment);
                    Context requireContext3 = fragment.requireContext();
                    C59899JbO jbO = kNl.A0J;
                    C3499682q A064 = kNl.A06();
                    0sP mp4 = new MP4(kNl, 4);
                    kNl.A0C = r24.A09(requireContext2, A007, userSession2, r8, new LE2(requireContext3, userSession3, A064, jbO, new C66218MIz(kNl, 16), new C66218MIz(kNl, 17), mp4));
                    Fragment fragment2 = fragment;
                    kNl.A04 = new C64584LeQ(fragment2, userSession3, kNl.A06(), kNl.A07(), kNl.A08(), str3);
                    C60102Jfi A043 = kNl.A04();
                    0qQ.A0C(A043, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                    C61828KNr kNr = (C61828KNr) A043;
                    C60259JiG jiG3 = kNl.A05;
                    if (jiG3 != null) {
                        MVR mvr = kNl.A07;
                        0qQ.A0C(mvr, "null cannot be cast to non-null type com.instagram.creation.fragment.followersshare.FeedShareSheetQPManager");
                        kNl.A06 = new C65171Loa(r4, fragment, userSession2, kNl, (C65174Lod) mvr, kNr, jiG3, new Object());
                        kNl.A0A = new C65627Lx4(kNl, 1);
                        C66576MXh A02 = kNl.A02();
                        C60102Jfi A044 = kNl.A04();
                        0qQ.A0C(A044, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                        C61828KNr kNr2 = (C61828KNr) A044;
                        C65172Lob lob3 = (C65172Lob) r11.getValue();
                        LO1 lo1 = kNl.A0K;
                        C3499682q A065 = kNl.A06();
                        C3499582p r82 = kNl.A00;
                        if (r82 != null) {
                            C63877LAg lAg = kNl.A02;
                            if (lAg != null) {
                                LP7 A08 = kNl.A08();
                                KB3 kb3 = kNl.A0D;
                                if (kb3 != null) {
                                    C64584LeQ leQ = kNl.A04;
                                    if (leQ != null) {
                                        L9K l9k = kNl.A0B;
                                        if (l9k != null) {
                                            boolean z9 = kNl.A0E.getBoolean("IS_FACEBOOK_SHARING_DISABLED");
                                            String str5 = str3;
                                            C3499582p r15 = r82;
                                            C60304Jj3 jj3 = A004;
                                            C63877LAg lAg2 = lAg;
                                            C64584LeQ leQ2 = leQ;
                                            C61828KNr kNr3 = kNr2;
                                            Fragment fragment3 = fragment;
                                            AnonymousClass0iw r13 = r31;
                                            UserSession userSession4 = userSession2;
                                            kNl.A08 = new C61827KNq(fragment3, r13, userSession4, r15, A065, jj3, lAg2, leQ2, kNr3, A02, lob3, new LMT(fragment.requireActivity(), userSession2), lo1, kNl.A0L, l9k, A08, kb3, str5, z9);
                                            C60102Jfi A045 = kNl.A04();
                                            0qQ.A0C(A045, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                                            ((C61828KNr) A045).A0F(new M3G(kNl));
                                            return;
                                        }
                                        str = "shopNetPerfLogger";
                                    } else {
                                        str = "tagProductsRowNavigator";
                                    }
                                } else {
                                    str = "tagProductsTooltipController";
                                }
                            } else {
                                str = "addMusicRowViewController";
                            }
                        }
                    }
                    str = "clipsAudienceControlViewModel";
                }
            }
            str = "cameraSession";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static C61828KNr A00(LP2 lp2) {
        C60102Jfi A04 = lp2.A04();
        0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        return (C61828KNr) A04;
    }

    public static AnonymousClass3Q2 A01(C61822KNl kNl) {
        return kNl.A07().A04();
    }
}
