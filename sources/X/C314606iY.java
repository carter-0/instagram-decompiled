package X;

import android.media.AudioManager;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.6iY  reason: invalid class name and case insensitive filesystem */
public final class C314606iY implements C314616iZ {
    public final UserSession A00;
    public final C310016aI A01;
    public final C273384mU A02;
    public final C309896a0 A03;
    public final C309906a1 A04;
    public final C309736Zk A05;
    public final C309676Ze A06;
    public final C310206ab A07;
    public final C310196aa A08;
    public final WeakReference A09;
    public final AnonymousClass4DU A0A;
    public final C317766nn A0B;
    public final C317116mk A0C;
    public final C270414gh A0D;
    public final C310076aO A0E;
    public final C310096aQ A0F;
    public final C309796Zq A0G;
    public final C310056aM A0H;
    public final C310186aZ A0I;
    public final C310226ad A0J;
    public final String A0K;

    public final void DNg(View view, C255783ui r11) {
        Fragment fragment = (Fragment) this.A09.get();
        if (fragment != null && fragment.getActivity() != null) {
            C273384mU r1 = this.A02;
            r1.EHS(false);
            C250973mM AuO = r1.AuO(r11.A1d);
            AuO.getClass();
            C255773uh A082 = AuO.A08(this.A00);
            A00(view, fragment, A082, AuO, r11, this.A0D.Bz3(A082));
        }
    }

    public final /* synthetic */ void DcH(C255783ui r1, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [X.0SC, java.lang.Object] */
    private void A00(View view, Fragment fragment, C255773uh r23, C250973mM r24, C255783ui r25, C309426Yf r26) {
        StoryLinkInfoDict storyLinkInfoDict;
        Boolean bool;
        long j;
        String str;
        String id;
        Long A0n;
        C310016aI r10 = this.A01;
        C250973mM r14 = r24;
        Reel reel = r14.A0H;
        AnonymousClass6MT A082 = r25.A08();
        A082.getClass();
        String A002 = A082.A00();
        C255773uh r13 = r23;
        0qQ.A0B(r13, 1);
        0qQ.A0B(A002, 2);
        1Xj r1 = r13.A0b;
        try {
            UserSession userSession = r10.A06;
            C310026aJ r0 = r10.A0A;
            r0.A00 = reel;
            0wc A012 = AnonymousClass0kN.A01(r0, userSession);
            1Ln r8 = new 1Ln(A012.A00(A012.A00, "instagram_organic_story_link"), 304);
            if (r8.A00.isSampled()) {
                1Ns r02 = reel.A0W;
                long j2 = 0;
                if (r02 == null || (id = r02.getId()) == null || (A0n = 00y.A0n(10, id)) == null) {
                    j = 0;
                } else {
                    j = A0n.longValue();
                }
                r8.A0Q("author_id", Long.valueOf(j));
                if (r1 == null || (str = r1.getId()) == null) {
                    str = "";
                }
                r8.A0R("media_id", str);
                if (r1 != null) {
                    j2 = (long) r1.BR7().A00;
                }
                r8.A0Q("media_type", Long.valueOf(j2));
                r8.A0R("reel_id", reel.getId());
                r8.A0R("tray_session_id", r10.A0H);
                r8.A0R("viewer_session_id", r10.A0E.getSessionId());
                r8.A0R("tapped_link_type", "link_web");
                r8.A00.AAE(new Object().A03(0cp.A03(A002), (0bq) null), "link_url");
                r8.Cgf();
            }
        } catch (Exception e) {
            0wb.A06("ReelViewerLogger#reportLinkStickerOpenLink", "Failed to log link sticker tooltip tap", e);
        }
        String str2 = null;
        Fragment fragment2 = fragment;
        if (reel.A1e) {
            C238833Dp.A00(this.A00).A07(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[]{r13.A0k}, 1);
            C310076aO r11 = this.A0E;
            2EG r18 = 2EG.A3B;
            if (r1 != null) {
                str2 = r1.getId();
            }
            r11.A00(fragment2, r13, r14, (C273384mU) null, r26, new VWL((C297795sM) null, (Integer) null, str2), r18, (C17519VYx) null);
        } else if (r25.A08() == null || (storyLinkInfoDict = r25.A08().A00) == null || (bool = storyLinkInfoDict.A01) == null || !bool.booleanValue()) {
            FragmentActivity requireActivity = fragment2.requireActivity();
            UserSession userSession2 = this.A00;
            String A003 = r25.A08().A00();
            if (r1 != null) {
                str2 = r1.getId();
            }
            2EG r7 = 2EG.A3B;
            String moduleName = this.A0A.getModuleName();
            0qQ.A0B(userSession2, 1);
            0qQ.A0B(A003, 2);
            0qQ.A0B(moduleName, 5);
            FH7.A09(requireActivity, userSession2, r7, A003, moduleName, str2, (String) null);
        } else {
            FH7.A03(fragment2.requireActivity(), r25.A08().A00());
        }
    }

    public final View AqN() {
        C316026kz Aui = this.A02.Aui();
        if (Aui == null) {
            return null;
        }
        return Aui.BQU();
    }

    public final View AuD() {
        return this.A02.AuD();
    }

    public final void CHz(User user, String str) {
        this.A0F.A03(user, str);
    }

    public final boolean CQz() {
        1Xj r0;
        C273384mU r1 = this.A02;
        if (r1.Au5() == null || (r0 = r1.Au5().A0b) == null || !0qQ.A0K(r0.A0C.CXs(), true)) {
            return false;
        }
        return true;
    }

    public final void Ck1(C255783ui r4, int i, int i2) {
        this.A0H.A00(r4, i, i2);
        C250973mM AuO = this.A02.AuO(r4.A1d);
        AuO.getClass();
        C309426Yf Bz3 = this.A0D.Bz3(AuO.A08(this.A00));
        if (r4.A11 == AnonymousClass3WT.SUBSCRIPTIONS) {
            Bz3.A0L++;
        }
    }

    public final boolean Cml(C255783ui r8, int i, int i2) {
        int i3;
        C317766nn r2;
        Fragment fragment;
        C273384mU r6 = this.A02;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r6;
        C250973mM r3 = reelViewerFragment.A0a;
        if (r3 != null && (r2 = this.A0B) != null && r2.A0Q(r3, r8) && (fragment = (Fragment) this.A09.get()) != null && fragment.getActivity() != null) {
            this.A0H.A00(r8, i, i2);
            r2.A0K(fragment.getActivity(), r3, r8);
            return true;
        } else if (r8.A11.ordinal() != 47) {
            return false;
        } else {
            C313416gP r4 = (C313416gP) reelViewerFragment.mVideoPlayer;
            r4.A15.set(true);
            AudioManager audioManager = r4.A0r;
            int i4 = 0;
            if (audioManager != null) {
                i3 = audioManager.getStreamVolume(3);
                i4 = audioManager.getStreamMaxVolume(3);
            } else {
                i3 = 0;
            }
            C313416gP.A0C(r4, i3, i4, 0);
            r6.EHd();
            return true;
        }
    }

    public final void Ct6() {
        Fragment fragment = (Fragment) this.A09.get();
        if (fragment != null && fragment.getActivity() != null) {
            this.A02.EHY("tapped");
            this.A0C.Ct7();
        }
    }

    public final void CxO(C255783ui r2) {
        this.A0C.CxO(r2);
    }

    public final void D43(C255783ui r10) {
        Fragment fragment = (Fragment) this.A09.get();
        if (fragment != null && fragment.getActivity() != null) {
            C273384mU r2 = this.A02;
            r2.EHS(false);
            C250973mM AuO = r2.AuO(r10.A1d);
            C310016aI r0 = this.A01;
            AuO.getClass();
            r0.A0E(AuO, r10);
            UserSession userSession = this.A00;
            FragmentActivity activity = fragment.getActivity();
            String moduleName = this.A0A.getModuleName();
            String str = r10.A1Z;
            if (str == null) {
                str = r10.A1a;
            }
            AEG.A00(activity, AnonymousClass5OC.WATCH_REELS_CTA, userSession, moduleName, str, ((ReelViewerFragment) r2).mVideoPlayer.getCurrentPositionMs());
        }
    }

    public final void DEu(C255783ui r12) {
        String str;
        String str2 = r12.A1S;
        Fragment fragment = (Fragment) this.A09.get();
        if (str2 != null && fragment != null && fragment.getContext() != null) {
            User user = r12.A1B;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            String str3 = r12.A1a;
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A00;
            AnonymousClass4DU r6 = this.A0A;
            0qQ.A0B(userSession, 1);
            if (182.A06(0Tu.A05, userSession, 36315507560811778L)) {
                AnonymousClass6ST r7 = new AnonymousClass6ST(requireActivity, true);
                r7.A00(requireActivity.getString(2131965491));
                AnonymousClass0fN.A00(r7);
                1NY r2 = new 1NY(userSession, -2);
                r2.A05();
                r2.A0K("fundraiser/%s/linked_ig_fundraiser_info/", new Object[]{str2});
                r2.A9m("fb_fundraiser_id", str2);
                r2.A0Q(C43842CFi.class, C45726D2z.class);
                1OC A0M = r2.A0M();
                A0M.A00 = new ECE(requireActivity, userSession, r6, r7, str, str3, str2);
                1ES.A03(A0M);
                return;
            }
            C49233Erc.A00(requireActivity, userSession, r6, str2);
        }
    }

    public final void DEy() {
        AnonymousClass4DH r3 = (AnonymousClass4DH) this.A09.get();
        if (r3 != null) {
            UserSession userSession = this.A00;
            FCT.A02(userSession, "sticker", "two_factor_authentication_entered");
            CallerContext callerContext = C46508DgB.A00;
            if (182.A06(0Tu.A05, userSession, 36313871178533136L)) {
                C49955FGk.A02(r3, userSession, "ig_two_factor_phase_1", "two_factor");
                return;
            }
            C47435E2h A022 = FFR.A01().A00().A02(AnonymousClass05K.A0C, false, false);
            C309516Yo r32 = new C309516Yo(r3.requireActivity(), userSession);
            r32.A0A = C46346Dcp.A01(10, 24, 85);
            r32.A0E(A022);
            r32.A0F = true;
            r32.A04();
        }
    }

    public final void DRp() {
        this.A0C.DRo(this.A02.Au5(), false);
    }

    public final void DUk() {
        C255773uh Au5;
        1Xj r0;
        User CCd;
        Fragment fragment = (Fragment) this.A09.get();
        if (fragment != null && fragment.getActivity() != null && fragment.getContext() != null && (Au5 = this.A02.Au5()) != null && (r0 = Au5.A0b) != null && (CCd = r0.A0C.CCd()) != null) {
            C19681Wdj wdj = new C19681Wdj(this);
            UserSession userSession = this.A00;
            C54894HXc.A00(fragment.requireContext(), fragment.requireActivity(), userSession, wdj, CCd, new C20410Wqu(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0874, code lost:
        X.WNN.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0877, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x093c, code lost:
        r2.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x093f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0c5b, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0c5e, code lost:
        r2.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0171, code lost:
        r4.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0174, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYC(android.view.View r39, X.C255783ui r40) {
        /*
            r38 = this;
            r1 = r38
            java.lang.ref.WeakReference r13 = r1.A09
            java.lang.Object r17 = r13.get()
            r0 = r17
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r17 = r0
            if (r0 == 0) goto L_0x0c61
            androidx.fragment.app.FragmentActivity r0 = r17.getActivity()
            if (r0 == 0) goto L_0x0c61
            X.4mU r3 = r1.A02
            r8 = 0
            r3.EHS(r8)
            r0 = r40
            java.lang.String r2 = r0.A1d
            X.3mM r2 = r3.AuO(r2)
            r2.getClass()
            com.instagram.common.session.UserSession r7 = r1.A00
            X.3uh r12 = r2.A08(r7)
            X.4gh r4 = r1.A0D
            X.6Yf r11 = r4.Bz3(r12)
            X.3WT r14 = r0.A11
            int r15 = r14.ordinal()
            java.lang.String r6 = ""
            r10 = r6
            r9 = 0
            r4 = 1
            r5 = r39
            switch(r15) {
                case 4: goto L_0x0080;
                case 5: goto L_0x0382;
                case 7: goto L_0x04ba;
                case 10: goto L_0x0964;
                case 11: goto L_0x03a0;
                case 12: goto L_0x0a3d;
                case 15: goto L_0x02c3;
                case 18: goto L_0x091e;
                case 19: goto L_0x0880;
                case 21: goto L_0x054b;
                case 23: goto L_0x0306;
                case 24: goto L_0x0306;
                case 26: goto L_0x0396;
                case 27: goto L_0x092a;
                case 28: goto L_0x092a;
                case 30: goto L_0x06e7;
                case 32: goto L_0x0382;
                case 33: goto L_0x038c;
                case 37: goto L_0x0175;
                case 38: goto L_0x05a2;
                case 43: goto L_0x0940;
                case 44: goto L_0x014f;
                case 48: goto L_0x00a3;
                case 50: goto L_0x054b;
                case 52: goto L_0x0526;
                case 58: goto L_0x0c09;
                case 59: goto L_0x0ac8;
                case 63: goto L_0x0329;
                case 66: goto L_0x01f3;
                case 70: goto L_0x0a5d;
                case 73: goto L_0x0053;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.String r1 = "Unknown interactive type: "
            java.lang.String r0 = r14.toString()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0053:
            X.BG5 r0 = r0.A0M
            if (r0 == 0) goto L_0x0c61
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x0c61
            androidx.fragment.app.FragmentActivity r0 = r17.requireActivity()
            X.6Yo r2 = new X.6Yo
            r2.<init>(r0, r7)
            X.C55115HcO.A00()
            java.lang.String r4 = r7.A05
            X.4DU r0 = r1.A0A
            java.lang.String r3 = r0.getModuleName()
            X.0qQ.A0B(r4, r8)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.HMH r1 = X.HMH.COLLECTION_FEED
            X.HMw r0 = X.C54665HMw.MEDIA
            X.H15 r0 = X.C56344Hwv.A01(r1, r0, r4, r5, r3)
            goto L_0x0c5b
        L_0x0080:
            X.DDv r3 = r0.A1F
            if (r3 == 0) goto L_0x0c61
            java.lang.String r0 = r3.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0c61
            java.lang.String r2 = r3.A06
            java.util.HashMap r0 = r3.A0A
            r1.EJZ(r2, r0)
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x0c61
            X.1Av r2 = X.1Au.A00(r7)
            java.lang.String r1 = r3.A09
            int r0 = r3.A00
            r2.A10(r1, r0)
            return
        L_0x00a3:
            X.BIn r4 = r0.A0r
            r4.getClass()
            java.lang.String r2 = X.C44945Cnf.A00(r4)
            java.lang.String r0 = "storefront_reshare_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r2 = "storefront_sticker"
        L_0x00b6:
            com.instagram.user.model.User r4 = r4.A00
            r4.getClass()
            X.3kF r10 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r11 = r17.requireActivity()
            X.4DU r0 = r1.A0A
            java.lang.String r16 = r0.getModuleName()
            java.lang.String r18 = r4.getId()
            java.lang.String r19 = r4.getUsername()
            com.instagram.api.schemas.SellerShoppableFeedType r12 = r4.A0B()
            java.lang.String r17 = "storefront_sticker"
            r13 = r7
            r14 = r0
            r15 = r9
            X.W2P r4 = r10.A0N(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.3uh r0 = r3.Au5()
            if (r0 == 0) goto L_0x00e8
            X.3uh r0 = r3.Au5()
            X.1Xj r9 = r0.A0b
        L_0x00e8:
            r4.A03 = r9
            r4.A0G = r2
            X.VQC r5 = new X.VQC
            r5.<init>(r1)
            com.instagram.common.session.UserSession r6 = r4.A0Q
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r4.A0T
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0171
            X.1Xj r0 = r4.A03
            if (r0 == 0) goto L_0x0145
            com.instagram.user.model.User r0 = r0.A2A(r6)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.getId()
        L_0x010b:
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0171
            androidx.fragment.app.FragmentActivity r3 = r4.A0P
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r3, r6)
            java.lang.String r0 = r4.A0U
            if (r0 == 0) goto L_0x0147
            r2.A08(r0)
            r1 = 2131976671(0x7f1361df, float:1.959047E38)
            X.W9B r0 = new X.W9B
            r0.<init>(r4)
            r2.A04(r0, r1)
            r1 = 2131973769(0x7f135689, float:1.9584583E38)
            X.W9f r0 = new X.W9f
            r0.<init>(r4, r5)
            r2.A02(r0, r1)
            X.WXl r0 = new X.WXl
            r0.<init>(r5)
            r2.A03 = r0
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            r0.A03(r3)
            return
        L_0x0145:
            r0 = 0
            goto L_0x010b
        L_0x0147:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x014f:
            java.lang.String r3 = r0.A1c
            if (r3 == 0) goto L_0x0c61
            X.3kF r4 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r5 = r17.requireActivity()
            X.4DU r2 = r1.A0A
            java.lang.String r10 = r2.getModuleName()
            com.instagram.api.schemas.SellerShoppableFeedType r6 = com.instagram.api.schemas.SellerShoppableFeedType.A05
            java.lang.String r1 = "stories_reshare_view_shop_cta"
            r8 = r2
            r11 = r1
            r12 = r3
            r13 = r9
            X.W2P r4 = r4.A0N(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4.A0G = r1
            java.util.List r0 = r0.A1o
            r4.A0I = r0
        L_0x0171:
            r4.A05()
            return
        L_0x0175:
            X.BIk r8 = r0.A0o
            r8.getClass()
            java.lang.String r0 = X.C44933CnT.A00(r8)
            java.lang.String r2 = "seller_collection_reshare_sticker"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0188
            java.lang.String r0 = "product_collection_sticker"
        L_0x0188:
            com.instagram.user.model.ProductCollection r3 = r8.A02
            r3.getClass()
            com.instagram.api.schemas.ProductCollectionV2Type r5 = r3.Aou()
            X.17i r11 = X.17h.A00(r7)
            java.lang.String r2 = r8.A05
            r8 = r2
            if (r2 != 0) goto L_0x019b
            r8 = r6
        L_0x019b:
            com.instagram.user.model.User r11 = r11.A02(r8)
            X.3kF r12 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r13 = r17.requireActivity()
            java.lang.String r8 = r1.A0K
            X.4DU r1 = r1.A0A
            java.lang.String r17 = r1.getModuleName()
            X.UzB r15 = X.C16675UzB.PRODUCT_COLLECTION
            r14 = r7
            r16 = r8
            X.Vk1 r1 = r12.A0J(r13, r14, r15, r16, r17)
            r1.A0A = r0
            java.lang.String r0 = r3.Aoi()
            if (r0 == 0) goto L_0x01c2
            java.lang.String r6 = r3.Aoi()
        L_0x01c2:
            if (r5 == 0) goto L_0x01c6
            java.lang.String r9 = r5.A00
        L_0x01c6:
            X.57K r0 = X.C17025VEz.A00(r9)
            r1.A01(r0, r6)
            if (r2 != 0) goto L_0x01d0
            r2 = r10
        L_0x01d0:
            r1.A08 = r2
            r1.A0E = r4
            if (r11 == 0) goto L_0x01e0
            java.lang.String r10 = r11.getUsername()
        L_0x01da:
            r1.A0D = r10
            r1.A00()
            return
        L_0x01e0:
            java.util.List r0 = r3.CD6()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x01da
            java.lang.String r10 = r0.getUsername()
            goto L_0x01da
        L_0x01f3:
            X.BEf r0 = r0.A0G
            if (r0 == 0) goto L_0x0c61
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0c61
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0c61
            com.instagram.user.model.User r3 = r12.A0i
            if (r3 == 0) goto L_0x0218
            android.content.res.Resources r6 = r5.getResources()
            r5 = 2131961878(0x7f132816, float:1.9560465E38)
            java.lang.String r3 = r3.getUsername()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = r6.getString(r5, r3)
        L_0x0218:
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r10 = r3.A01(r7)
            X.6aI r5 = r1.A01
            com.instagram.model.reels.Reel r1 = r2.A0H
            X.6aJ r2 = X.C310016aI.A01(r1, r5)
            com.instagram.common.session.UserSession r1 = r5.A06
            X.0wc r3 = X.AnonymousClass0kN.A01(r2, r1)
            java.lang.String r2 = "instagram_explore_shareable_grid_interact_detail"
            X.0kJ r1 = r3.A00
            X.0Aj r3 = r3.A00(r1, r2)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0248
            X.6aJ r1 = r5.A0A
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "containermodule"
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x0248:
            java.lang.String r22 = "feed_contextual_explore_shareable_grid"
            java.lang.String r18 = "Static"
            java.lang.Object r3 = r0.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.To7 r2 = new X.To7
            r2.<init>()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            r2.A01(r12)
            java.lang.String r25 = r10.getId()
            java.lang.String r26 = r10.getUsername()
            java.lang.String r24 = "0"
            com.instagram.feed.intf.ContextualFeedNetworkConfig r15 = new com.instagram.feed.intf.ContextualFeedNetworkConfig
            r23 = r15
            r27 = r9
            r28 = r9
            r29 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.lang.Object r10 = r0.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            androidx.fragment.app.FragmentActivity r0 = r17.requireActivity()
            X.6Yo r2 = new X.6Yo
            r2.<init>(r0, r7)
            instagram.features.feed.fragment.ContextualFeedFragment r5 = new instagram.features.feed.fragment.ContextualFeedFragment
            r5.<init>()
            r13 = r9
            r14 = r9
            r16 = r9
            r17 = r9
            r19 = r6
            r20 = r9
            r21 = r3
            r23 = r9
            r24 = r10
            r25 = r9
            r26 = r9
            r28 = r1
            r30 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r36 = r8
            r37 = r4
            android.os.Bundle r0 = X.C46424Del.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r5.setArguments(r0)
            r2.A0E(r5)
            r2.A0F = r4
            goto L_0x0c5e
        L_0x02c3:
            com.instagram.model.hashtag.HashtagImpl r5 = r0.A0k
            r5.getClass()
            java.lang.String r7 = r5.A0C
            if (r7 != 0) goto L_0x02d1
            java.lang.String r7 = r5.A0D
            r7.getClass()
        L_0x02d1:
            java.util.Map r6 = r11.A1F
            boolean r4 = r6.containsKey(r7)
            r3 = 1
            if (r4 == 0) goto L_0x02e6
            java.lang.Object r3 = r6.get(r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + 1
        L_0x02e6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.put(r7, r3)
            X.6aI r6 = r1.A01
            java.lang.String r3 = r5.A0D
            r3.getClass()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            java.lang.String r10 = "hashtag"
            r7 = r2
            r8 = r0
            r11 = r3
            r6.A0H(r7, r8, r9, r10, r11)
            X.6mk r0 = r1.A0C
            r0.DIc(r5)
            return
        L_0x0306:
            com.instagram.user.model.User r3 = r0.A1B
            r3.getClass()
            java.lang.String r3 = r3.getId()
            r11.A06(r3)
            X.6aI r4 = r1.A01
            r9 = -1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            java.lang.String r8 = "tag"
            r5 = r2
            r6 = r0
            r10 = r9
            r4.A0G(r5, r6, r7, r8, r9, r10)
            X.6aQ r2 = r1.A0F
            com.instagram.user.model.User r1 = r0.A1B
            java.lang.String r0 = "reel_viewer_mention_popup"
            goto L_0x093c
        L_0x0329:
            androidx.fragment.app.FragmentActivity r15 = r17.getActivity()
            X.BHu r3 = r0.A0f
            if (r15 == 0) goto L_0x0c61
            boolean r0 = r15.isDestroyed()
            if (r0 != 0) goto L_0x0c61
            if (r3 == 0) goto L_0x0c61
            X.BHt r0 = r3.A02
            if (r0 == 0) goto L_0x0c61
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x0c61
            X.6aI r5 = r1.A01
            com.instagram.common.session.UserSession r10 = r5.A06
            X.3uh r4 = r2.A08(r10)
            boolean r0 = r4.CWu()
            r13 = 0
            if (r0 == 0) goto L_0x0370
            X.1Xj r11 = r4.A0b
            r11.getClass()
            com.instagram.model.reels.Reel r0 = r2.A0H
            X.6aJ r9 = X.C310016aI.A01(r0, r5)
            com.instagram.user.model.User r0 = r11.A2A(r10)
            if (r0 == 0) goto L_0x0365
            java.lang.String r13 = r0.getId()
        L_0x0365:
            android.content.Context r0 = r5.A04
            boolean r14 = X.0oI.A0A(r0)
            java.lang.String r12 = "story_sticker"
            X.C321406u6.A02(r9, r10, r11, r12, r13, r14)
        L_0x0370:
            X.4DU r0 = r1.A0A
            java.lang.String r17 = r0.getModuleName()
            java.lang.String r19 = "story_sticker"
            r16 = r7
            r18 = r3
            r20 = r8
            X.C49965FGy.A05(r15, r16, r17, r18, r19, r20)
            return
        L_0x0382:
            X.6mk r1 = r1.A0C
            X.3uh r0 = r3.Au5()
            r1.D1P(r0)
            return
        L_0x038c:
            X.6mk r1 = r1.A0C
            X.3uh r0 = r3.Au5()
            r1.DMe(r0)
            return
        L_0x0396:
            X.6mk r1 = r1.A0C
            X.3uh r0 = r3.Au5()
            r1.DRo(r0, r8)
            return
        L_0x03a0:
            X.3Dp r10 = X.C238833Dp.A00(r7)
            X.3Ds r8 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            java.lang.String r6 = r12.A0k
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r10.A07(r5, r8, r6, r4)
            boolean r4 = X.C297785sK.A0m(r2)
            if (r4 == 0) goto L_0x03bc
            X.6aI r5 = r1.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r5.A0C(r12, r2, r4)
        L_0x03bc:
            boolean r4 = r12.A19()
            if (r4 == 0) goto L_0x0450
            X.6aI r6 = r1.A01
            r4 = 2
            X.0qQ.A0B(r7, r4)
            com.instagram.model.reels.Reel r2 = r2.A0H
            X.6aJ r2 = X.C310016aI.A01(r2, r6)
            X.0wc r8 = X.AnonymousClass0kN.A01(r2, r7)
            X.1Xj r10 = r12.A0b
            X.3OA r2 = r12.A0g
            r11 = 0
            if (r2 == 0) goto L_0x03db
            java.lang.String r9 = r2.A0S
        L_0x03db:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r2 = X.C231122qu.A00(r7, r10)
            if (r2 == 0) goto L_0x03e9
            long r4 = X.C16947VBz.A00(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
        L_0x03e9:
            java.lang.String r4 = "whatsapp_sticker_tooltip_click"
            X.0kJ r2 = r8.A00
            X.0Aj r5 = r8.A00(r2, r4)
            boolean r2 = r5.isSampled()
            if (r2 == 0) goto L_0x0450
            r13 = 0
            if (r9 == 0) goto L_0x0488
            r2 = 10
            java.lang.Long r2 = X.00y.A0n(r2, r9)
            if (r2 == 0) goto L_0x0488
            long r8 = r2.longValue()
        L_0x0407:
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r2 = "ad_id"
            r5.A9F(r2, r4)
            if (r11 == 0) goto L_0x0416
            long r13 = r11.longValue()
        L_0x0416:
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            java.lang.String r2 = "page_id"
            r5.A9F(r2, r4)
            java.lang.String r4 = X.C231122qu.A06(r7, r10)
            if (r4 != 0) goto L_0x042d
            if (r10 == 0) goto L_0x0486
            X.1Xy r2 = r10.A0C
            java.lang.String r4 = r2.getOrganicTrackingToken()
        L_0x042d:
            java.lang.String r2 = "client_token"
            r5.AAJ(r2, r4)
            X.3kK r2 = r6.A0E
            java.lang.String r4 = r2.getSessionId()
            java.lang.String r2 = X.C46346Dcp.A00()
            r5.AAJ(r2, r4)
            X.XSH r4 = X.XSH.PAGE_INSTAGRAM_STORY
            java.lang.String r2 = "on_feed_messaging_surface"
            r5.A8M(r4, r2)
            java.lang.String r4 = "WHATSAPP"
            java.lang.String r2 = "message_destination"
            r5.AAJ(r2, r4)
            r5.Cgf()
        L_0x0450:
            X.2EG r5 = X.2EG.A3q
            boolean r2 = r12.A1I()
            if (r2 != 0) goto L_0x045e
            boolean r2 = r12.A1M()
            if (r2 == 0) goto L_0x0460
        L_0x045e:
            X.2EG r5 = X.2EG.A3y
        L_0x0460:
            java.lang.String r4 = r0.A1f
            java.lang.String r2 = "sticker_generic_card_interactive_tooltip"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x047b
            X.6a0 r4 = r1.A03
        L_0x046c:
            X.3uh r2 = r3.Au5()
            r2.getClass()
            float r1 = r0.A03
            float r0 = r0.A04
            r4.DL8(r2, r5, r1, r0)
            return
        L_0x047b:
            java.lang.String r2 = "sticker_lead_gen_card_interactive_tooltip"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x048c
            X.6a1 r4 = r1.A04
            goto L_0x046c
        L_0x0486:
            r4 = 0
            goto L_0x042d
        L_0x0488:
            r8 = 0
            goto L_0x0407
        L_0x048c:
            java.lang.String r2 = "interactive_media_tooltip_from_tap"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x04ad
            java.lang.String r2 = "interactive_media_tooltip_from_tap_and_hold"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x04ad
            X.6Zk r4 = r1.A05
            X.3uh r2 = r3.Au5()
            r2.getClass()
            float r1 = r0.A03
            float r0 = r0.A04
            r4.D7M(r2, r5, r1, r0)
            return
        L_0x04ad:
            X.6Ze r2 = r1.A06
            X.3uh r1 = r3.Au5()
            r1.getClass()
            r2.DL7(r1, r0, r5)
            return
        L_0x04ba:
            X.3uh r2 = r3.Au5()
            if (r2 == 0) goto L_0x0c61
            X.1Xj r13 = r2.A0b
            if (r13 == 0) goto L_0x0c61
            androidx.fragment.app.FragmentActivity r6 = r17.getActivity()
            if (r6 == 0) goto L_0x0c61
            X.3Ds r11 = X.C238863Ds.COLLECTION_PRODUCT_TILE
            r6 = r9
            int r8 = r0.A05
            int r12 = r8 + 1
            X.1Xy r8 = r13.A0C
            java.util.List r10 = r8.Aok()
            if (r10 == 0) goto L_0x04eb
            int r8 = r10.size()
            if (r8 <= r12) goto L_0x04eb
            java.lang.Object r8 = r10.get(r12)
            X.1Xj r8 = (X.1Xj) r8
            if (r8 == 0) goto L_0x04eb
            java.lang.String r6 = r8.getId()
        L_0x04eb:
            X.3Dp r8 = X.C238833Dp.A00(r7)
            X.3Dt r7 = new X.3Dt
            r7.<init>(r9, r11, r6, r9)
            java.lang.String r6 = r2.A0k
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r8.A09(r5, r7, r6, r4)
            X.6Zq r11 = r1.A0G
            int r4 = r0.A05
            androidx.fragment.app.FragmentActivity r12 = r17.getActivity()
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3
            X.4gh r0 = r3.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r2)
            boolean r1 = r0.A0o
            X.4gh r0 = r3.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r2)
            java.lang.Integer r14 = r0.A0X
            r15 = r4
            r16 = r1
            r11.Dqi(r12, r13, r14, r15, r16)
            return
        L_0x0526:
            X.3uh r0 = r3.Au5()
            if (r0 == 0) goto L_0x0549
            X.3uh r0 = r3.Au5()
            X.1Xj r0 = r0.A0b
        L_0x0532:
            X.1ZB r1 = X.C48953Emr.A00()
            androidx.fragment.app.FragmentActivity r2 = r17.getActivity()
            X.EWI r4 = X.EWI.STORY_SHARE
            if (r0 == 0) goto L_0x0541
            r0.A2n()
        L_0x0541:
            r3 = r7
            r5 = r9
            r6 = r9
            r7 = r9
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x0549:
            r0 = r9
            goto L_0x0532
        L_0x054b:
            X.6aI r5 = r1.A01
            r5.A0E(r2, r0)
            com.instagram.model.mediatype.ProductType r6 = r0.A0m
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.IGTV
            if (r6 != r2) goto L_0x0563
            X.6aZ r2 = r1.A0I
            X.4DU r1 = r1.A0A
            java.lang.String r0 = r0.A1a
            r0.getClass()
            r2.A01(r0, r1)
            return
        L_0x0563:
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r6 == r2) goto L_0x0583
            X.1iA r5 = r12.A0C()
            X.0qQ.A0B(r7, r8)
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.AD
            if (r6 != r2) goto L_0x0c39
            X.1iA r2 = X.1iA.A0a
            if (r5 != r2) goto L_0x0c39
            X.0Tu r2 = X.0Tu.A05
            r5 = 36328551376502184(0x8110a000003da8, double:3.0376604016103014E-306)
            boolean r2 = X.182.A06(r2, r7, r5)
            if (r2 == 0) goto L_0x0c39
        L_0x0583:
            androidx.fragment.app.FragmentActivity r5 = r17.getActivity()
            X.4DU r1 = r1.A0A
            java.lang.String r8 = r1.getModuleName()
            java.lang.String r1 = r0.A1Z
            if (r1 != 0) goto L_0x0593
            java.lang.String r1 = r0.A1a
        L_0x0593:
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3
            X.6gQ r0 = r3.mVideoPlayer
            int r10 = r0.getCurrentPositionMs()
            X.5OC r6 = X.AnonymousClass5OC.TOOLTIP
            r9 = r1
            X.AEG.A00(r5, r6, r7, r8, r9, r10)
            return
        L_0x05a2:
            com.instagram.user.model.Product r10 = r0.A0J()
            r10.getClass()
            java.lang.String r15 = r10.A0H
            java.util.Map r11 = r11.A1I
            boolean r6 = r11.containsKey(r15)
            r5 = 1
            if (r6 == 0) goto L_0x05c0
            java.lang.Object r5 = r11.get(r15)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r5 = r5 + 1
        L_0x05c0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.put(r15, r5)
            X.6aI r14 = r1.A01
            com.instagram.common.session.UserSession r13 = r14.A06
            X.3uh r6 = r2.A08(r13)
            boolean r5 = r6.CWu()
            if (r5 == 0) goto L_0x0692
            X.1Xj r12 = r6.A0b
            if (r12 == 0) goto L_0x0692
            X.ULx r11 = X.C294165ly.A03(r13, r10)
            long r5 = r11.A00
            r26 = r5
            X.4Ny r5 = r11.A01
            r25 = r5
            java.lang.Boolean r5 = r11.A04
            r24 = r5
            java.lang.Long r5 = r11.A06
            r23 = r5
            java.lang.Boolean r5 = r11.A03
            r22 = r5
            X.5lz r6 = X.C294165ly.A04(r12)
            java.util.List r11 = r6.A03
            java.util.Map r5 = r6.A08
            r21 = r5
            java.util.List r5 = r6.A02
            r20 = r5
            java.util.List r5 = r6.A05
            r16 = r5
            X.Jw8 r5 = X.C294165ly.A02(r12, r15)
            java.lang.Object r15 = r5.A01
            java.util.List r15 = (java.util.List) r15
            com.instagram.model.reels.Reel r2 = r2.A0H
            X.6aJ r2 = X.C310016aI.A01(r2, r14)
            X.0wc r6 = X.AnonymousClass0kN.A01(r2, r13)
            java.lang.String r5 = "instagram_organic_tap_product_share_sticker_details"
            X.0kJ r2 = r6.A00
            X.0Aj r5 = r6.A00(r2, r5)
            r2 = 307(0x133, float:4.3E-43)
            X.1Ln r13 = new X.1Ln
            r13.<init>(r5, r2)
            X.0Aj r2 = r13.A00
            boolean r2 = r2.isSampled()
            if (r2 == 0) goto L_0x0692
            X.1iA r2 = r12.BR7()
            int r2 = r2.A00
            long r5 = (long) r2
            r18 = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r18)
            java.lang.String r2 = "m_t"
            r13.A0Q(r2, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r26)
            java.lang.String r2 = "product_id"
            r13.A0Q(r2, r5)
            java.lang.String r2 = r12.getId()
            java.lang.String r6 = "Required value was null."
            if (r2 == 0) goto L_0x06e1
            r13.A0m(r2)
            java.lang.String r12 = "merchant_id"
            X.0Aj r5 = r13.A00
            r2 = r25
            r5.AAE(r2, r12)
            if (r11 == 0) goto L_0x06db
            java.lang.String r2 = "product_ids"
            r13.A0S(r2, r11)
            r2 = r21
            r13.A0y(r2)
            java.lang.String r2 = "shared_product_ids"
            r13.A0S(r2, r15)
            java.lang.String r5 = "tagged_user_ids"
            r2 = r16
            r13.A0S(r5, r2)
            java.lang.String r5 = "drops_launch_date"
            r2 = r23
            r13.A0Q(r5, r2)
            java.lang.String r5 = "has_drops_launched"
            r2 = r22
            r13.A0O(r5, r2)
            java.lang.String r5 = "drops_product_ids"
            r2 = r20
            r13.A0S(r5, r2)
            java.lang.String r5 = "is_checkout_enabled"
            r2 = r24
            r13.A0O(r5, r2)
            r13.Cgf()
        L_0x0692:
            X.0qQ.A0B(r7, r8)
            X.W3U r2 = X.W3U.A00
            X.0xa r2 = X.W3U.A02(r7, r2)
            X.0xY r5 = r2.AR4()
            java.lang.String r2 = "has_entered_pdp_via_product_sticker"
            r5.E5T(r2, r4)
            r5.apply()
            X.3kF r11 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r12 = r17.requireActivity()
            X.4DU r4 = r1.A0A
            java.lang.String r2 = r1.A0K
            java.lang.String r16 = "product_share_sticker"
            r13 = r7
            r14 = r4
            r15 = r10
            r17 = r2
            X.WNN r5 = r11.A0L(r12, r13, r14, r15, r16, r17)
            instagram.features.stories.fragment.ReelViewerFragment r3 = (instagram.features.stories.fragment.ReelViewerFragment) r3
            X.3mM r2 = r3.A0a
            r2.getClass()
            X.3uh r2 = r2.A08(r7)
            X.1Xj r2 = r2.A0b
            r5.A02(r2, r9)
            X.W5Z r2 = new X.W5Z
            r2.<init>(r1)
            r5.A02 = r2
            X.6ab r1 = r1.A07
            r5.A07 = r1
            r5.A06 = r0
            goto L_0x0874
        L_0x06db:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x06e1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x06e7:
            com.instagram.user.model.Product r16 = r0.A0I()
            r3 = r16
            java.lang.String r6 = r3.A0H
            if (r6 == 0) goto L_0x0c61
            X.1Xj r10 = r12.A0b
            if (r10 == 0) goto L_0x0c61
            java.util.Map r11 = r11.A1I
            boolean r5 = r11.containsKey(r6)
            r3 = 1
            if (r5 == 0) goto L_0x070a
            java.lang.Object r3 = r11.get(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + 1
        L_0x070a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r6, r3)
            X.6aI r13 = r1.A01
            com.instagram.common.session.UserSession r12 = r13.A06
            X.3uh r5 = r2.A08(r12)
            boolean r3 = r5.CWu()
            if (r3 == 0) goto L_0x081a
            X.1Xj r11 = r5.A0b
            if (r11 == 0) goto L_0x081a
            boolean r3 = r11.A5v()
            if (r3 == 0) goto L_0x081a
            com.instagram.user.model.Product r14 = r0.A0I()
            X.ULx r15 = X.C294165ly.A03(r12, r14)
            long r5 = r15.A00
            r26 = r5
            X.4Ny r3 = r15.A01
            r25 = r3
            java.lang.Boolean r3 = r15.A04
            r24 = r3
            java.lang.Long r3 = r15.A07
            r23 = r3
            java.lang.Long r3 = r15.A06
            r22 = r3
            java.lang.Boolean r3 = r15.A03
            r21 = r3
            X.5lz r5 = X.C294165ly.A04(r11)
            java.util.List r3 = r5.A03
            r20 = r3
            java.util.Map r3 = r5.A08
            r19 = r3
            java.util.List r3 = r5.A02
            r18 = r3
            java.util.List r3 = r5.A04
            r15 = r3
            java.lang.String r3 = r14.A0H
            X.Jw8 r3 = X.C294165ly.A02(r11, r3)
            java.lang.String r14 = r3.A03
            java.lang.Object r6 = r3.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r3.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r3 = r3.A00
            java.util.Map r3 = (java.util.Map) r3
            com.instagram.model.reels.Reel r2 = r2.A0H
            X.6aJ r2 = X.C310016aI.A01(r2, r13)
            X.0wc r13 = X.AnonymousClass0kN.A01(r2, r12)
            java.lang.String r12 = "instagram_organic_tap_product_sticker_details"
            X.0kJ r2 = r13.A00
            X.0Aj r12 = r13.A00(r2, r12)
            r2 = 309(0x135, float:4.33E-43)
            X.1Ln r13 = new X.1Ln
            r13.<init>(r12, r2)
            X.0Aj r2 = r13.A00
            boolean r2 = r2.isSampled()
            if (r2 == 0) goto L_0x081a
            java.lang.String r2 = r11.getId()
            if (r2 == 0) goto L_0x0878
            r13.A0m(r2)
            X.1iA r2 = r11.BR7()
            int r2 = r2.A00
            long r11 = (long) r2
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r2 = "m_t"
            r13.A0Q(r2, r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r26)
            java.lang.String r2 = "product_id"
            r13.A0Q(r2, r11)
            X.327 r12 = new X.327
            r12.<init>()
            X.1QJ r2 = X.AnonymousClass1QI.A00
            X.1QM r2 = r2.A02
            java.lang.String r11 = r2.A00
            java.lang.String r2 = "nav_chain"
            r12.A06(r2, r11)
            java.lang.String r2 = "navigation_info"
            r13.A0N(r12, r2)
            r2 = r25
            r13.A0e(r2)
            java.lang.String r11 = "drops_launch_date"
            r2 = r22
            r13.A0Q(r11, r2)
            java.lang.String r11 = "has_drops_launched"
            r2 = r21
            r13.A0O(r11, r2)
            java.lang.String r11 = "is_checkout_enabled"
            r2 = r24
            r13.A0O(r11, r2)
            java.lang.String r11 = "product_inventory"
            r2 = r23
            r13.A0Q(r11, r2)
            java.lang.String r11 = "tagged_user_ids"
            r13.A0S(r11, r15)
            java.lang.String r11 = "drops_product_ids"
            r2 = r18
            r13.A0S(r11, r2)
            java.lang.String r11 = "product_ids"
            r2 = r20
            r13.A0S(r11, r2)
            r2 = r19
            r13.A0y(r2)
            java.lang.String r2 = "shared_product_ids"
            r13.A0S(r2, r5)
            java.lang.String r2 = "product_sticker_id"
            r13.A0R(r2, r14)
            java.lang.String r5 = "profile_shop_link"
            X.0Aj r2 = r13.A00
            r2.A9H(r5, r3)
            java.lang.String r2 = "sticker_styles"
            r13.A0S(r2, r6)
            r13.Cgf()
        L_0x081a:
            X.0qQ.A0B(r7, r8)
            X.W3U r2 = X.W3U.A00
            X.0xa r2 = X.W3U.A02(r7, r2)
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "has_entered_pdp_via_product_sticker"
            r3.E5T(r2, r4)
            r3.apply()
            X.3kF r18 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r19 = r17.getActivity()
            r19.getClass()
            X.4DU r3 = r1.A0A
            java.lang.String r2 = r1.A0K
            java.lang.String r23 = "product_sticker"
            r20 = r7
            r21 = r3
            r22 = r16
            r24 = r2
            X.WNN r5 = r18.A0L(r19, r20, r21, r22, r23, r24)
            r5.A02(r10, r9)
            X.W5Y r2 = new X.W5Y
            r2.<init>(r1)
            r5.A02 = r2
            X.6ab r2 = r1.A07
            r5.A07 = r2
            r5.A06 = r0
            r5.A0Z = r4
            com.instagram.user.model.User r0 = r10.A2A(r7)
            r0.getClass()
            java.lang.String r0 = r0.getId()
            r5.A0F = r0
            X.Wd1 r2 = new X.Wd1
            r0 = r17
            r2.<init>(r0, r1)
            r5.A0b = r4
            r5.A08 = r2
        L_0x0874:
            X.WNN.A01(r5)
            return
        L_0x0878:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0880:
            com.instagram.model.venue.Venue r3 = r0.A09()
            r3.getClass()
            java.lang.String r5 = r3.A05()
            if (r5 != 0) goto L_0x0895
            java.lang.String r1 = "ReelInteractiveControllerDelegate"
            java.lang.String r0 = "reportLocationAction: locationId is null"
            X.0wb.A03(r1, r0)
            return
        L_0x0895:
            java.util.Map r11 = r11.A1G
            boolean r10 = r11.containsKey(r5)
            r3 = 1
            if (r10 == 0) goto L_0x08aa
            java.lang.Object r3 = r11.get(r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + 1
        L_0x08aa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r5, r3)
            X.6aI r10 = r1.A01
            java.lang.String r1 = r0.A1f
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            java.lang.String r13 = "location"
            r11 = r2
            r14 = r5
            r15 = r1
            r10.A0N(r11, r12, r13, r14, r15)
            com.instagram.model.venue.Venue r10 = r0.A09()
            r10.getClass()
            androidx.fragment.app.FragmentActivity r11 = r17.getActivity()
            java.lang.String r1 = r10.A05()
            com.instagram.model.venue.Venue r0 = new com.instagram.model.venue.Venue
            r0.<init>()
            r0.A06(r1)
            com.instagram.model.venue.LocationDictIntf r0 = r10.A00
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x08e6
            com.instagram.model.venue.LocationDictIntf r0 = r10.A00
            java.lang.String r6 = r0.getName()
        L_0x08e6:
            r0 = 2
            double[] r5 = new double[r0]
            java.lang.Double r0 = r10.A00()
            r2 = 0
            if (r0 != 0) goto L_0x0915
            r0 = 0
        L_0x08f3:
            r5[r8] = r0
            java.lang.Double r0 = r10.A01()
            if (r0 == 0) goto L_0x0903
            java.lang.Double r0 = r10.A01()
            double r2 = r0.doubleValue()
        L_0x0903:
            r5[r4] = r2
            r12 = r9
            r13 = r9
            r14 = r7
            r15 = r10
            r16 = r9
            r17 = r6
            r18 = r5
            r19 = r8
            X.C16923VBa.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0915:
            java.lang.Double r0 = r10.A00()
            double r0 = r0.doubleValue()
            goto L_0x08f3
        L_0x091e:
            r3 = r1
            r4 = r5
            r5 = r17
            r6 = r12
            r7 = r2
            r8 = r0
            r9 = r11
            r3.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x092a:
            X.6aQ r2 = r1.A0F
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A0u
            r0.getClass()
            com.instagram.user.model.User r1 = r0.A05
            r1.getClass()
            r0 = 361(0x169, float:5.06E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x093c:
            r2.A03(r1, r0)
            return
        L_0x0940:
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A0K
            if (r0 == 0) goto L_0x0c61
            java.lang.String r5 = r0.A07
            if (r5 != 0) goto L_0x0949
            r5 = 0
        L_0x0949:
            java.lang.String r3 = r0.A04
            if (r3 != 0) goto L_0x094e
            r3 = 0
        L_0x094e:
            if (r5 == 0) goto L_0x0c61
            if (r3 == 0) goto L_0x0c61
            X.ISs r2 = new X.ISs
            r0 = r17
            r2.<init>(r0, r1, r3)
            X.0qQ.A0B(r7, r4)
            X.1ET r0 = X.1ES.A01()
            X.C48898Ely.A00(r7, r0, r2, r5)
            return
        L_0x0964:
            X.6kz r6 = r3.Aui()
            if (r6 != 0) goto L_0x0a37
            r6 = 0
        L_0x096b:
            X.C297785sK.A07(r6, r7, r12, r2, r0)
            X.3Dp r11 = X.C238833Dp.A00(r7)
            X.3Ds r10 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            java.lang.String r8 = r12.A0k
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r11.A07(r5, r10, r8, r4)
            X.2EG r10 = X.2EG.A3q
            X.1Xj r8 = r12.A0b
            if (r8 == 0) goto L_0x098b
            boolean r4 = r8.A66()
            if (r4 == 0) goto L_0x0a15
            X.2EG r10 = X.2EG.A3t
        L_0x098b:
            X.3uh r4 = r3.Au5()
            if (r4 == 0) goto L_0x09ac
            X.3uh r5 = r3.Au5()
            r4 = r3
            instagram.features.stories.fragment.ReelViewerFragment r4 = (instagram.features.stories.fragment.ReelViewerFragment) r4
            X.4gh r4 = r4.A1E
            X.6Yf r11 = r4.Bz3(r5)
            boolean r4 = r11.A0o
            if (r4 == 0) goto L_0x0a01
            if (r8 == 0) goto L_0x09e3
            boolean r4 = r8.A5X()
            if (r4 == 0) goto L_0x09da
            X.2EG r10 = X.2EG.A3n
        L_0x09ac:
            r5 = 0
            java.lang.String r11 = r0.A1a
            if (r8 == 0) goto L_0x09c5
            boolean r4 = r8.A5J()
            if (r4 != 0) goto L_0x09c5
            boolean r4 = r8.A65()
            if (r4 == 0) goto L_0x09c5
            int r0 = X.C297785sK.A02(r7, r12, r2, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x09c5:
            X.6mk r4 = r1.A0C
            X.VWL r1 = new X.VWL
            r1.<init>(r9, r5, r11)
            X.3uh r0 = r3.Au5()
            r0.getClass()
            r4.CI6(r9, r0, r1, r10)
            X.C297785sK.A07(r6, r7, r12, r2, r9)
            return
        L_0x09da:
            boolean r4 = r8.A6C()
            if (r4 == 0) goto L_0x09e3
            X.2EG r10 = X.2EG.A3z
            goto L_0x09ac
        L_0x09e3:
            java.lang.Integer r5 = r11.A0X
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r5 != r4) goto L_0x09f3
            boolean r4 = r11.A0p
            if (r4 == 0) goto L_0x09f0
            X.2EG r10 = X.2EG.A3g
            goto L_0x09ac
        L_0x09f0:
            X.2EG r10 = X.2EG.A3f
            goto L_0x09ac
        L_0x09f3:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 != r4) goto L_0x09ac
            boolean r4 = r11.A0p
            if (r4 == 0) goto L_0x09fe
            X.2EG r10 = X.2EG.A3i
            goto L_0x09ac
        L_0x09fe:
            X.2EG r10 = X.2EG.A3h
            goto L_0x09ac
        L_0x0a01:
            if (r8 == 0) goto L_0x09ac
            boolean r4 = r8.A5X()
            if (r4 == 0) goto L_0x0a0c
            X.2EG r10 = X.2EG.A3o
            goto L_0x09ac
        L_0x0a0c:
            boolean r4 = r8.A6C()
            if (r4 == 0) goto L_0x09ac
            X.2EG r10 = X.2EG.A40
            goto L_0x09ac
        L_0x0a15:
            boolean r4 = r8.A65()
            if (r4 == 0) goto L_0x098b
            X.2EG r10 = X.2EG.A3s
            X.1Xy r4 = r8.A0C
            com.instagram.model.showreel.IgShowreelComposition r4 = r4.BwC()
            if (r4 == 0) goto L_0x0a35
            java.lang.String r5 = r4.C4b()
        L_0x0a29:
            java.lang.String r4 = "ig_stories_carousel_media_showcase"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x098b
            X.2EG r10 = X.2EG.A3w
            goto L_0x098b
        L_0x0a35:
            r5 = 0
            goto L_0x0a29
        L_0x0a37:
            android.view.ViewGroup r6 = r6.Bki()
            goto L_0x096b
        L_0x0a3d:
            int r2 = r11.A0F
            int r2 = r2 + 1
            r11.A0F = r2
            androidx.fragment.app.FragmentActivity r4 = r17.getActivity()
            X.BIZ r0 = r0.A0j
            r0.getClass()
            java.lang.String r3 = r0.A01
            r3.getClass()
            X.2EG r2 = X.2EG.A1c
            X.4DU r0 = r1.A0A
            java.lang.String r0 = r0.getModuleName()
            X.FH7.A08(r4, r7, r2, r3, r0)
            return
        L_0x0a5d:
            java.lang.Object r4 = r13.get()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            if (r4 == 0) goto L_0x0c61
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x0c61
            java.lang.String r10 = r0.A1a
            if (r10 == 0) goto L_0x0c61
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "media_id"
            X.0Df r2 = r1.A02()
            X.0Df.A00(r2, r10, r0)
            java.lang.String r1 = "data"
            X.2IV r0 = r6.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r2, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r11 = X.AnonymousClass1vS.A00()
            java.util.Map r13 = r6.getParamsCopy()
            java.util.Map r14 = r3.getParamsCopy()
            java.lang.Class<X.BtD> r15 = X.C43127BtD.class
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.lang.String r12 = "WhatsAppStickerDeepLink"
            java.lang.String r20 = "xfb_whatsapp_sticker_deep_link_query"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r10 = r3
            r16 = r8
            r17 = r9
            r18 = r8
            r19 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1vn r2 = X.1vm.A01(r7)
            X.FSF r1 = new X.FSF
            r1.<init>(r5, r4)
            X.DEo r0 = new X.DEo
            r0.<init>()
            r2.ATL(r0, r1, r3)
            return
        L_0x0ac8:
            X.BGp r1 = r0.A0T
            if (r1 == 0) goto L_0x0c61
            java.lang.String r1 = r1.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0c61
            X.BGp r1 = r0.A0T
            if (r1 != 0) goto L_0x0c03
            r1 = 0
        L_0x0ad9:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0c61
            X.BGp r1 = r0.A0T
            if (r1 != 0) goto L_0x0bff
            r2 = 0
        L_0x0ae4:
            java.lang.String r1 = r0.A1d
            X.0qQ.A0B(r7, r8)
            java.lang.String r4 = r7.A06
            java.lang.String r11 = "ig_story_tooltip_clicked"
            r3 = 0
            r10 = r7
            r12 = r4
            r13 = r2
            r14 = r1
            r15 = r9
            X.C9761RgJ.A00(r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.FragmentActivity r2 = r17.requireActivity()
            X.BGp r1 = r0.A0T
            if (r1 == 0) goto L_0x0b00
            java.lang.String r3 = r1.A02
        L_0x0b00:
            if (r1 != 0) goto L_0x0bfb
            r11 = 0
        L_0x0b03:
            if (r1 == 0) goto L_0x0b07
            java.lang.String r9 = r1.A03
        L_0x0b07:
            java.lang.String r5 = r0.A1d
            if (r3 == 0) goto L_0x0be0
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x0be0
            if (r11 == 0) goto L_0x0be0
            boolean r0 = X.00l.A0W(r11)
            if (r0 != 0) goto L_0x0be0
            if (r9 == 0) goto L_0x0be0
            boolean r0 = X.00l.A0W(r9)
            if (r0 != 0) goto L_0x0be0
            java.lang.String r0 = "people"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0b80
            X.FEf r0 = X.C49907FEf.A00
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0b80
            java.lang.String r1 = X.C10065Rm2.A01
            java.lang.String r0 = "profile/%s?ref=xav_fb_story_to_ig_mentions"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r11)
            X.0qQ.A07(r0)
            android.net.Uri r8 = X.0cp.A03(r0)
            X.0qQ.A07(r8)
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r6 = "com.facebook.wakizashi"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r6)
            if (r0 != 0) goto L_0x0b55
            java.lang.String r6 = "com.facebook.katana"
        L_0x0b55:
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.Intent r0 = r0.setData(r8)
            android.content.Intent r0 = r0.setPackage(r6)
            X.0qQ.A07(r0)
            X.0kR.A0A(r2, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = "opened_in"
            java.lang.String r0 = "fb_app"
            r2.put(r1, r0)
            java.lang.String r8 = "profile_open_trigger"
        L_0x0b78:
            r9 = r4
            r10 = r3
            r11 = r5
            r12 = r2
            X.C9761RgJ.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x0b80:
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            android.content.Context r10 = X.C334957c9.A00(r2, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            androidx.fragment.app.FragmentActivity r10 = (androidx.fragment.app.FragmentActivity) r10     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            if (r10 == 0) goto L_0x0bbc
            X.0Tu r12 = X.0Tu.A05     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            r0 = 36325420345471947(0x810dc7000233cb, double:3.0356803249791296E-306)
            boolean r0 = X.182.A06(r12, r7, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            if (r0 == 0) goto L_0x0bbc
            java.lang.Integer r12 = X.AnonymousClass05K.A01     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.lang.String r1 = X.C10065Rm2.A01     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.lang.String r0 = "profile/%s?ref=xav_fb_story_to_ig_mentions"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r11)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            X.0qQ.A07(r1)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            X.TTY r0 = new X.TTY     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            r13 = r0
            r14 = r2
            r15 = r7
            r16 = r9
            r17 = r3
            r18 = r5
            r19 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            X.C48917EmH.A00(r10, r12, r1, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            goto L_0x0c07
        L_0x0bbc:
            android.net.Uri r0 = X.0cp.A03(r9)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            X.0kR.A0F(r2, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.lang.String r1 = "opened_in"
            java.lang.String r0 = "external_browser"
            r2.put(r1, r0)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            java.lang.String r11 = "profile_open_trigger"
            r10 = r7
            r12 = r4
            r13 = r3
            r14 = r5
            r15 = r2
            X.C9761RgJ.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ NullPointerException -> 0x0bdd, SecurityException -> 0x0be3 }
            goto L_0x0c08
        L_0x0bdd:
            java.lang.String r1 = "Error parsing fbentityUrl"
            goto L_0x0be5
        L_0x0be0:
            java.lang.String r1 = "Null tagType, fbId or fbentityUrl"
            goto L_0x0be5
        L_0x0be3:
            java.lang.String r1 = "Security Error parsing fbentityUrl"
        L_0x0be5:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "reason"
            r2.put(r0, r1)
            if (r9 != 0) goto L_0x0bf2
            r9 = r6
        L_0x0bf2:
            java.lang.String r0 = "entityUrl"
            r2.put(r0, r9)
            java.lang.String r8 = "profile_open_error"
            goto L_0x0b78
        L_0x0bfb:
            java.lang.String r11 = r1.A00
            goto L_0x0b03
        L_0x0bff:
            java.lang.String r2 = r1.A02
            goto L_0x0ae4
        L_0x0c03:
            java.lang.String r1 = r1.A03
            goto L_0x0ad9
        L_0x0c07:
            return
        L_0x0c08:
            return
        L_0x0c09:
            X.BGm r2 = r0.A0S
            if (r2 == 0) goto L_0x0c61
            java.lang.String r2 = r2.A04
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0c61
            androidx.fragment.app.FragmentActivity r10 = r17.getActivity()
            X.4DU r2 = r1.A0A
            X.BGm r0 = r0.A0S
            if (r0 != 0) goto L_0x0c36
            r1 = 0
        L_0x0c20:
            if (r0 != 0) goto L_0x0c33
            r0 = 0
        L_0x0c23:
            java.lang.String r13 = "ig_story"
            r11 = r2
            r12 = r7
            r14 = r1
            r15 = r0
            r16 = r9
            r17 = r9
            r18 = r4
            X.FFi.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0c33:
            java.lang.String r0 = r0.A04
            goto L_0x0c23
        L_0x0c36:
            java.lang.String r1 = r0.A04
            goto L_0x0c20
        L_0x0c39:
            androidx.fragment.app.FragmentActivity r1 = r17.getActivity()
            X.6Yo r2 = new X.6Yo
            r2.<init>(r1, r7)
            r2.A0F = r4
            com.instagram.util.fragment.IgFragmentFactoryImpl r1 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r0 = r0.A1a
            r0.getClass()
            X.F3W r1 = r1.A03(r0)
            java.lang.String r0 = "story_sticker"
            r1.A0E = r0
            r1.A0O = r8
            X.32F r0 = r1.A01()
        L_0x0c5b:
            r2.A0E(r0)
        L_0x0c5e:
            r2.A04()
        L_0x0c61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314606iY.DYC(android.view.View, X.3ui):void");
    }

    public final void DcF() {
        this.A02.EHd();
    }

    public final void DcG(C255783ui r11) {
        C273384mU r2 = this.A02;
        r2.EHd();
        if (r11.A11.equals(AnonymousClass3WT.COLLECTION_AD_THUMBNAIL)) {
            C255773uh Au5 = r2.Au5();
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r2;
            C250973mM r4 = reelViewerFragment.A0a;
            if (Au5 != null && r4 != null) {
                this.A01.A0K(r4, ((C310566bG) reelViewerFragment.A1E).A0B.Bz3(Au5), (Float) null, "collection_thumbnail_tap_close", r11.A03, r11.A04);
            }
        }
    }

    public final void EJZ(String str, Map map) {
        this.A0J.A00((C255773uh) null, str, map);
    }

    public final boolean Es9(C255783ui r11) {
        boolean A062;
        Boolean bool;
        StoryLinkInfoDict storyLinkInfoDict = r11.A0W;
        if (storyLinkInfoDict == null || (bool = storyLinkInfoDict.A03) == null || !bool.booleanValue()) {
            A062 = 182.A06(0Tu.A05, this.A00, 36322130400454617L);
        } else {
            Boolean bool2 = storyLinkInfoDict.A00;
            if (bool2 != null) {
                A062 = bool2.booleanValue();
            } else {
                A062 = false;
            }
        }
        if (!A062) {
            return false;
        }
        C250973mM AuO = this.A02.AuO(r11.A1d);
        AuO.getClass();
        UserSession userSession = this.A00;
        C309426Yf Bz3 = this.A0D.Bz3(AuO.A08(userSession));
        if (((double) Bz3.A0O) <= 0.0d) {
            return false;
        }
        if (Bz3.A0n || ((double) (SystemClock.uptimeMillis() - Bz3.A0P)) >= ((double) Long.valueOf(182.A01(0Tu.A06, userSession, 36603605377291203L)).intValue())) {
            return true;
        }
        return false;
    }

    public C314606iY(UserSession userSession, AnonymousClass4DU r3, C310016aI r4, C317766nn r5, C273384mU r6, C317116mk r7, C270414gh r8, C310076aO r9, C310096aQ r10, C309896a0 r11, C309906a1 r12, C309796Zq r13, C309736Zk r14, C309676Ze r15, C310206ab r16, C310056aM r17, C310186aZ r18, C310226ad r19, C310196aa r20, String str, WeakReference weakReference) {
        this.A00 = userSession;
        this.A0D = r8;
        this.A01 = r4;
        this.A0H = r17;
        this.A0F = r10;
        this.A0J = r19;
        this.A0I = r18;
        this.A02 = r6;
        this.A07 = r16;
        this.A08 = r20;
        this.A09 = weakReference;
        this.A0C = r7;
        this.A0B = r5;
        this.A0A = r3;
        this.A0K = str;
        this.A05 = r14;
        this.A03 = r11;
        this.A04 = r12;
        this.A0G = r13;
        this.A06 = r15;
        this.A0E = r9;
    }
}
