package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4Gg  reason: invalid class name and case insensitive filesystem */
public final class C262854Gg implements C262864Gh {
    public final Fragment A00;
    public final C2355930l A01;
    public final AnonymousClass4DU A02;
    public final UserSession A03;
    public final C246793fF A04;
    public final C262844Gf A05;
    public final C262874Gi A06;
    public final User A07;
    public final C249763kK A08;
    public final String A09;

    public C262854Gg(Fragment fragment, C2355930l r3, UserSession userSession, 2el r5, C246793fF r6, AnonymousClass4DU r7, C262844Gf r8, User user, C249763kK r10, String str) {
        0qQ.A0B(r6, 3);
        0qQ.A0B(r10, 6);
        this.A03 = userSession;
        this.A00 = fragment;
        this.A04 = r6;
        this.A02 = r7;
        this.A09 = str;
        this.A08 = r10;
        this.A07 = user;
        this.A01 = r3;
        this.A05 = r8;
        this.A06 = new C262874Gi(userSession, r5, r7, str);
    }

    public final void D3j(View view, AnonymousClass5OC r11, AnonymousClass0iw r12, 1Xj r13, AnonymousClass3W1 r14) {
        0qQ.A0B(r11, 4);
        this.A04.A00(view, r11, C270644h4.A04, r12, r13, r14, (List) null, true);
    }

    public final void D45(1Xj r14) {
        long j;
        Long l;
        Long A0n;
        AnonymousClass0iw r6 = this.A00;
        AnonymousClass0iw r4 = r6;
        UserSession userSession = this.A03;
        String sessionId = this.A08.getSessionId();
        String A002 = AnonymousClass000.A00(5361);
        0qQ.A0B(r4, 0);
        0qQ.A0B(sessionId, 2);
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A003 = A012.A00(A012.A00, AnonymousClass000.A00(660));
        1Xj r10 = r14;
        if (A003.isSampled()) {
            A003.AAJ(AnonymousClass000.A00(727), A002);
            A003.AAJ(AnonymousClass000.A00(728), "feed_preview");
            A003.AAJ("containermodule", r4.getModuleName());
            A003.A8k("media_index", -1);
            A003.AAJ("viewer_session_id", sessionId);
            String A2n = r14.A2n();
            if (A2n == null || (A0n = 00y.A0n(10, A2n)) == null) {
                j = 0;
            } else {
                j = A0n.longValue();
            }
            A003.A9F("media_id", Long.valueOf(j));
            User CCd = r14.A0C.CCd();
            if (CCd != null) {
                l = 00y.A0n(10, CCd.getId());
            } else {
                l = null;
            }
            A003.A9F("media_author_id", l);
            A003.Cgf();
        }
        FragmentActivity activity = r6.getActivity();
        if (activity != null) {
            C55274Hf3.A00(activity, r6, 28D.A2l, (293) null, userSession, r10, (ArrayList) null, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DJK(View view, 1Xj r10, AnonymousClass3W1 r11, User user) {
        List AZX;
        C2801550j r0;
        String Bkc;
        List AZX2;
        C2801550j r02;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        User user2 = user;
        if (user != null) {
            C2801750l BDc = r10.A0C.BDc();
            String str = null;
            if (BDc == null || (AZX = BDc.AZX()) == null || (r0 = (C2801550j) 00k.A0O(AZX, 0)) == null || (Bkc = r0.Bkc()) == null || view == null) {
                0wb.A03("DefaultMediaTagIndicatorDelegateImpl#onHighlightIndicatorClick", "Reel id is null");
                return;
            }
            C262844Gf r1 = this.A05;
            if (r1 != null) {
                C2801750l BDc2 = r10.A0C.BDc();
                if (!(BDc2 == null || (AZX2 = BDc2.AZX()) == null || (r02 = (C2801550j) 00k.A0J(AZX2)) == null)) {
                    str = r02.getMediaId();
                }
                RectF rectF = 0nA.A01;
                RectF rectF2 = new RectF();
                0nA.A0L(rectF2, view);
                r1.A00(rectF2, new C55497Hif(r11), AnonymousClass3BQ.HIGHLIGHTS_INDICATOR, user2, Bkc, str);
            }
        }
    }

    public final void DWf(1Xj r11, AnonymousClass3W1 r12, C262944Gp r13) {
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            UserSession userSession = this.A03;
            AnonymousClass4DU r5 = this.A02;
            1Xj r4 = r11;
            if (C243193Xt.A01(r5, userSession, r11) == AnonymousClass3VA.PEOPLE || C243193Xt.A01(r5, userSession, r11) == AnonymousClass3VA.FB_USER) {
                LTZ.A09(fragment, userSession, r4, r5, r13, (String) null, false, false);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final void DvE(1Xj r20, AnonymousClass3W1 r21, C262944Gp r22, XCE xce) {
        UserSession userSession = this.A03;
        1Xj r12 = r20;
        UpcomingEvent A27 = r12.A27(userSession);
        if (A27 != null) {
            AnonymousClass4DU r1 = this.A02;
            new C310306am(r1, userSession, r1.getModuleName()).A04(A27, r12.getId(), AnonymousClass000.A00(4156), AnonymousClass000.A00(799));
        }
        AnonymousClass3W1 r14 = r21;
        C262944Gp r13 = r22;
        XCE xce2 = xce;
        if (r12.A4u()) {
            C249713kF.A00.A0s(this.A00.requireActivity(), userSession, r12, this.A02, r14, r13, xce2, this.A09, (String) null);
        } else if (r12.A4s()) {
            C331127Pr r2 = new C331127Pr(userSession);
            r2.A0X = r13;
            Fragment fragment = this.A00;
            r2.A0d = LTZ.A03(fragment.requireContext(), r12);
            r2.A00().A03(fragment.requireContext(), VI7.A00(userSession, r12, this.A02, r14.A0o, xce2, (String) null, (String) null));
        } else if (A27 != null) {
            1ZC A002 = C63468KxX.A00();
            Context requireContext = this.A00.requireContext();
            AnonymousClass4DU r7 = this.A02;
            A002.A01(requireContext, userSession, r7, xce2, A27, r12.A1e(userSession).getId(), r7.getModuleName(), AnonymousClass000.A00(799), false, false);
        }
    }

    public final void Dx7(View view, 1Xj r11, AnonymousClass4DU r12, AnonymousClass3W1 r13, C263274Jz r14) {
        1Xj r5 = r11;
        0qQ.A0B(r11, 0);
        AnonymousClass3W1 r6 = r13;
        0qQ.A0B(r13, 1);
        0qQ.A0B(r14, 2);
        if (r14 == C263274Jz.TAP_TO_WATCH_AND_BROWSE) {
            Integer num = AnonymousClass05K.A00;
            if (r13.A13 != num) {
                r13.A13 = num;
                AnonymousClass3W1.A00(r13, 50);
                return;
            }
            return;
        }
        View view2 = view;
        this.A04.A00(view2, AnonymousClass5OC.FEED_PREVIEW, C270644h4.A04, r12, r5, r6, (List) null, true);
    }

    public final void DzJ(1Xj r41, AnonymousClass3W1 r42) {
        C309516Yo A002;
        boolean z;
        int ordinal;
        1Xj r9 = r41;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r12 = r42;
        0qQ.A0B(r12, 1);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A03;
            String sessionId = this.A08.getSessionId();
            AnonymousClass4DU r7 = this.A02;
            0qQ.A0B(sessionId, 4);
            0wc A012 = AnonymousClass0kN.A01(r7, userSession);
            0Aj A003 = A012.A00(A012.A00, "ig_interest_pivot_click");
            if (A003.isSampled()) {
                A003.AAJ("module", r7.getModuleName());
                String BIl = r9.A0C.BIl();
                if (BIl == null) {
                    BIl = "";
                }
                A003.AAJ("inventory_source", BIl);
                A003.AAJ("ranking_info_token", r9.A0C.getLoggingInfoToken());
                A003.AAJ("feed_request_id", r9.A0R);
                A003.A9F("recs_ix", Long.valueOf((long) r12.A0W));
                A003.A9F("m_ix", Long.valueOf((long) r12.getPosition()));
                A003.AAJ("m_pk", r9.getId());
                A003.Cgf();
            }
            C51956G8z B5H = r9.A0C.B5H();
            if (B5H != null) {
                InterestPivotRedirect BkS = B5H.BkS();
                if (BkS == null || (ordinal = BkS.ordinal()) == 1 || ordinal != 2) {
                    A002 = C54974Ha7.A00(requireActivity, userSession);
                    String id = r9.getId();
                    if (id != null) {
                        String id2 = r9.getId();
                        if (id2 != null) {
                            String A042 = 1Xv.A04(id2);
                            0qQ.A0B(A042, 2);
                            C54664HMv hMv = C54664HMv.A05;
                            int i = r9.BR7().A00;
                            String B2y = r9.A0C.B2y();
                            Object[] objArr = {null, null, null};
                            0qQ.A0B(objArr, 0);
                            int size = 03t.A0I(objArr).size();
                            if (size == 0) {
                                z = false;
                            } else if (size == 3) {
                                z = true;
                            } else {
                                throw new IllegalArgumentException(AnonymousClass000.A00(4308));
                            }
                            DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, (Integer) null, id, A042, B2y, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, i, z);
                            String Bpv = B5H.Bpv();
                            if (Bpv == null) {
                                Bpv = requireActivity.getString(2131964429);
                                0qQ.A07(Bpv);
                            }
                            String moduleName = r7.getModuleName();
                            String A004 = AnonymousClass000.A00(3398);
                            0qQ.A0B(moduleName, 5);
                            String str = sessionId;
                            A002.A0B((Bundle) null, Ha1.A00(new DiscoveryChainingConfig((Bundle) null, discoveryChainingItem, (ExploreTopicCluster) null, (Integer) null, (Integer) null, Bpv, A004, str, moduleName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (HashMap) null, 0sl.A00, false, false, false, false, false, false, false, false, true, true, false)));
                            A002.A08();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    A002 = new C309516Yo(requireActivity, userSession);
                    C46649DiU A043 = C46649DiU.A04("com.instagram.feed.interest_pivot_grid_screen", 0Yt.A02(new 0eP[]{new 0eP("seed_media_pk", r9.A30())}));
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                    String Bpv2 = B5H.Bpv();
                    if (Bpv2 == null) {
                        Bpv2 = requireActivity.getString(2131964429);
                        0qQ.A07(Bpv2);
                    }
                    igBloksScreenConfig.A0U = Bpv2;
                    igBloksScreenConfig.A0l = true;
                    A002.A0D(C49891FBs.A02(igBloksScreenConfig, A043));
                }
                A002.A04();
            }
        }
    }

    public final void EBm(View view, 1Xj r8) {
        0qQ.A0B(r8, 0);
        if (C243193Xt.A01(this.A02, this.A03, r8) == AnonymousClass3VA.PRODUCTS) {
            C262874Gi r5 = this.A06;
            String A0R = 002.A0R("tags_list_entry_point_impression_", r8.getId());
            2el r3 = r5.A01;
            C60340gF r2 = C60340gF.A00;
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a(r8, r2, A0R);
            r1.A00(r5.A00);
            r3.A05(view, r1.A01());
        }
    }

    public final String CFD() {
        return this.A08.getSessionId();
    }

    public final void D4C(1Xj r11) {
        C2355930l r2 = this.A01;
        if (r2 != null) {
            Fragment fragment = this.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A03;
            new C63964LFp(requireActivity, r2, userSession).A02((DialogInterface.OnDismissListener) null, fragment, C62574Ki7.CLIPS_VIEWER, new C64556Ldx(userSession, r11), new C64558Ldz(this), this.A02);
        }
    }

    public final void DHH(AnonymousClass0iw r16, 1Xj r17) {
        String str;
        1Xj r2 = r17;
        String A2w = r2.A2w();
        if (A2w != null) {
            r2.A0C.B8b();
            UserSession userSession = this.A03;
            User A2A = r2.A2A(userSession);
            0wc A012 = AnonymousClass0kN.A01(this.A02, userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_cg_click_fundraiser_donate_pill");
            A002.A9F("fundraiser_id", 00y.A0n(10, A2w));
            A002.Cgf();
            C240063Jl.A01 = r2.getId();
            C240063Jl.A00 = A2w;
            Fragment fragment = this.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            String str2 = null;
            if (A2A != null) {
                str = A2A.getId();
            } else {
                str = null;
            }
            String A2n = r2.A2n();
            if (A2n != null) {
                LTV.A0A(requireActivity, userSession, A2w, "FEED_POST", str, A2n, true);
                Context applicationContext = fragment.requireActivity().getApplicationContext();
                0qQ.A07(applicationContext);
                if (A2A != null) {
                    str2 = A2A.getId();
                }
                String A2n2 = r2.A2n();
                if (A2n2 != null) {
                    LTV.A03(applicationContext, userSession, A2w, "FEED_POST", str2, A2n2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DJl(AnonymousClass0iw r5, 1Xj r6) {
        String iconicHorizonWorldDeeplink;
        JSO CGF = r6.A0C.CGF();
        if (CGF != null && (iconicHorizonWorldDeeplink = CGF.getIconicHorizonWorldDeeplink()) != null) {
            I6E.A00.A03(r5, this.A03, r6, AnonymousClass05K.A01);
            FH7.A03(this.A00.requireContext(), iconicHorizonWorldDeeplink);
        }
    }

    public final void DZv(1Xj r14, AnonymousClass3W1 r15, C262944Gp r16, User user, boolean z) {
        AnonymousClass4DH r2 = this.A00;
        FragmentActivity activity = r2.getActivity();
        if (activity != null) {
            AnonymousClass4DU r7 = this.A02;
            UserSession userSession = this.A03;
            String str = this.A09;
            W3r.A0C(userSession, r14, r7, str, z);
            C249713kF.A00.A0s(activity, userSession, r14, r7, r15, r16, (XCE) null, str, "shopping_indicator");
            try {
                C249713kF r1 = C249713kF.A00;
                0qQ.A0C(r2, C273654mx.A00(8));
                r1.A1G(r2, userSession, (String) null);
            } catch (ClassCastException e) {
                0wj r3 = 0wj.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("DefaultMediaTagIndicatorDelegateImpl#onProductTagsIndicatorClick ");
                sb.append(e);
                r3.AEf(sb.toString(), 817899586).report();
            }
            C17073VGv.A00(userSession).A00();
        }
    }
}
