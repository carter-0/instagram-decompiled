package X;

import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableSet;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.32L  reason: invalid class name */
public final class AnonymousClass32L extends AnonymousClass4DH implements C249763kK, C232682uF, AnonymousClass4DR, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT, C227292iy, AnonymousClass32M {
    public static final String __redex_internal_original_name = "ExploreFragment";
    public C46329Dbx A00;
    public C14358Tun A01;
    public C227762js A02;
    public C52544GWv A03;
    public C14227TsA A04;
    public GXJ A05;
    public C14074TpO A06;
    public X9Q A07;
    public GX8 A08;
    public GX7 A09;
    public C243453Yv A0A;
    public JSr A0B;
    public C52530GWh A0C;
    public C3723190i A0D;
    public GT0 A0E;
    public C14364Tut A0F;
    public C14360Tup A0G;
    public C14359Tuo A0H;
    public C52526GWd A0I;
    public GWY A0J;
    public GXK A0K;
    public C232692uG A0L;
    public C60111Jfs A0M;
    public C74486Pvg A0N;
    public AnonymousClass57H A0O;
    public C231002qi A0P;
    public C230882qT A0Q;
    public C233812wV A0R;
    public GX1 A0S;
    public C229122ms A0T;
    public C55972Hqd A0U;
    public String A0V;
    public String A0W;
    public C62320sa A0X;
    public boolean A0Y;
    public AnonymousClass3KG A0Z;
    public AnonymousClass3KQ A0a;
    public C297015r2 A0b;
    public C14394TvN A0c;
    public final long A0d;
    public final C267664bz A0e;
    public final C14005To7 A0f = new C14005To7();
    public final AnonymousClass7QE A0g;
    public final C20907X3y A0h;
    public final JO6 A0i;
    public final X41 A0j;
    public final C55918Hpf A0k;
    public final C55919Hpg A0l;
    public final C55489HiX A0m;
    public final C289875eN A0n;
    public final AnonymousClass32Q A0o = AnonymousClass32Q.A00;
    public final String A0p;
    public final AnonymousClass0eM A0q;
    public final AnonymousClass0eM A0r;
    public final AnonymousClass0eM A0s;
    public final AnonymousClass0eM A0t;
    public final AnonymousClass0eM A0u;
    public final AnonymousClass0eM A0v;
    public final AnonymousClass0eM A0w;
    public final AnonymousClass0eM A0x;
    public final AnonymousClass0eM A0y;
    public final AnonymousClass0eM A0z;
    public final AnonymousClass25J A10;
    public final 1wn A11;
    public final 1wn A12;
    public final 1wn A13;
    public final C252243on A14;
    public final C55488HiW A15;
    public final C229132mt A16;
    public final JPT A17;
    public final AnonymousClass1PB A18;
    public final C229122ms A19;
    public final AnonymousClass0eM A1A;

    public final boolean CbJ() {
        return true;
    }

    public final void DPz(1Xj r7, AnonymousClass3W1 r8, boolean z) {
        String str;
        0qQ.A0B(r7, 0);
        GXJ gxj = this.A05;
        if (gxj == null) {
            str = "clipsHeroDismissController";
        } else {
            C296925qs A002 = GXJ.A00(gxj);
            if (A002 != null && 0qQ.A0K(A002.BPf(), r7)) {
                C295825oy r4 = A002.A01;
                if (z) {
                    AnonymousClass3WA r0 = AnonymousClass3WA.CLIPS_VIEWER_REPORT_UNKNOWN;
                    0qQ.A0B(r0, 0);
                    r8.A0m = r0;
                }
                if (r4.A00 < r4.A02().size() - 1) {
                    r4.A00++;
                    gxj.A04.EyN(r7, "hide", true);
                    String str2 = r4.A0A;
                    C14074TpO tpO = gxj.A03;
                    tpO.A08(str2);
                    tpO.A0D.EHL();
                    return;
                }
                H33 h33 = gxj.A01;
                h33.A02(r4.A03);
                h33.A04((Long) null, (String) null, 0sn.A00, false);
            }
            X9Q x9q = this.A07;
            if (x9q == null) {
                str = "videoPlayerManager";
            } else {
                x9q.EyN(r7, "hide", true);
                C14074TpO tpO2 = this.A06;
                if (tpO2 == null) {
                    str = "grid";
                } else {
                    String id = r7.getId();
                    if (id != null) {
                        tpO2.A08(id);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r7) {
        0qQ.A0B(r7, 0);
        if (this.mView != null) {
            C14074TpO tpO = this.A06;
            String str = "grid";
            if (tpO != null) {
                C238133Ar r4 = tpO.A06;
                if (r4 != null) {
                    JSr jSr = this.A0B;
                    if (jSr != null) {
                        jSr.configureActionBar(r7);
                        JSr jSr2 = this.A0B;
                        if (jSr2 != null) {
                            C227762js r1 = this.A02;
                            if (r1 == null) {
                                str = "scrollableNavigationHelper";
                            } else {
                                C14074TpO tpO2 = this.A06;
                                if (tpO2 != null) {
                                    jSr2.AJ9(r1, tpO2.A0B, r4);
                                }
                            }
                        }
                    }
                    0qQ.A0F("headerController");
                    throw AnonymousClass00P.createAndThrow();
                }
                C74486Pvg pvg = this.A0N;
                if (pvg != null) {
                    JSr jSr3 = this.A0B;
                    if (jSr3 != null) {
                        float C8k = jSr3.C8k();
                        C14074TpO tpO3 = this.A06;
                        if (tpO3 != null) {
                            pvg.FKY(tpO3.A0B, C8k);
                            return;
                        }
                    }
                    0qQ.A0F("headerController");
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (Q23.A00(getSession()).A00) {
            ((GWW) this.A0q.getValue()).A05();
            GWY gwy = this.A0J;
            if (gwy == null) {
                str = "viewController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            GWY.A00(gwy, AnonymousClass05K.A00, true, true, false, false, false);
        }
        C14074TpO tpO = this.A06;
        str = "grid";
        if (tpO != null) {
            C229122ms r0 = this.A0T;
            if (r0 == null) {
                str = "loadMoreInterface";
            } else {
                tpO.A05(view, r0.isLoading());
                C52530GWh gWh = this.A0C;
                if (gWh != null) {
                    C14074TpO tpO2 = this.A06;
                    if (tpO2 != null) {
                        C238133Ar r1 = tpO2.A06;
                        gWh.A06 = r1;
                        gWh.A01 = view;
                        C52526GWd gWd = this.A0I;
                        if (gWd == null) {
                            str = "gridMediaLoadingTracker";
                        } else {
                            gWd.A00 = r1;
                            tpO2.A06(this.A16);
                            C14074TpO tpO3 = this.A06;
                            if (tpO3 != null) {
                                DiscoveryRecyclerView discoveryRecyclerView = tpO3.A04;
                                if (discoveryRecyclerView != null) {
                                    C3723190i r02 = this.A0D;
                                    if (r02 != null) {
                                        if (r02.A01 == 2) {
                                            discoveryRecyclerView.setClipToPadding(false);
                                            0nA.A0X(discoveryRecyclerView, requireContext().getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height));
                                        }
                                    }
                                    0qQ.A0F("exploreSurface");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                C14074TpO tpO4 = this.A06;
                                if (tpO4 != null) {
                                    DiscoveryRecyclerView discoveryRecyclerView2 = tpO4.A04;
                                    if (discoveryRecyclerView2 != null) {
                                        discoveryRecyclerView2.setItemAnimator((AnonymousClass3AS) null);
                                    }
                                    C14394TvN tvN = this.A0c;
                                    if (tvN == null) {
                                        str = "commonViewControl";
                                    } else {
                                        14i.A03(15Y.A04, tvN.A05);
                                        1xC r2 = 1xC.A01;
                                        r2.A02(tvN.A04, AnonymousClass3LC.class);
                                        r2.A02(tvN.A02, 1xG.class);
                                        AnonymousClass1Nd.A00(tvN.A06).A01(tvN.A03, FW5.class);
                                        C231002qi r03 = this.A0P;
                                        if (r03 == null) {
                                            str = "quickPromotionDelegate";
                                        } else {
                                            r03.Dh3();
                                            if (Cda()) {
                                                2dZ A032 = 2dZ.A0t.A03(requireActivity());
                                                A032.A0N.setBackground(GIZ.A00(requireContext(), GradientDrawable.Orientation.TOP_BOTTOM, 0.5d));
                                                C226112fe.A0B.A04(requireActivity(), new C14425Tvu(A032, this), true);
                                            }
                                            IgFragmentActivity requireActivity = requireActivity();
                                            if (requireActivity instanceof IgFragmentActivity) {
                                                requireActivity.registerOnActivityResultListener(this.A14);
                                            }
                                            C60111Jfs jfs = this.A0M;
                                            if (jfs != null) {
                                                C3723190i r12 = this.A0D;
                                                if (r12 != null) {
                                                    if (r12.A05) {
                                                        ExploreTopicCluster exploreTopicCluster = r12.A00;
                                                        if (exploreTopicCluster != null && exploreTopicCluster.A01 == C296865qm.SUGGESTED) {
                                                            ViewStub viewStub = (ViewStub) requireView().findViewById(R.id.nido_follow_topic_stub);
                                                            viewStub.setLayoutResource(R.layout.explore_parent_layout);
                                                            View inflate = viewStub.inflate();
                                                            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                                            ViewGroup viewGroup = (ViewGroup) inflate;
                                                            C52530GWh gWh2 = this.A0C;
                                                            if (gWh2 != null) {
                                                                VT1 vt1 = new VT1(gWh2, exploreTopicCluster);
                                                                getSession();
                                                                0qQ.A0B(viewGroup, 2);
                                                                View inflate2 = LayoutInflater.from(requireContext()).inflate(R.layout.explore_follow_button, viewGroup);
                                                                AnonymousClass0fU.A00(new C18855W9a(inflate2, vt1), inflate2.findViewById(R.id.follow_topic_btn));
                                                                return;
                                                            }
                                                        } else {
                                                            return;
                                                        }
                                                    } else if (r12.A03) {
                                                        ViewStub viewStub2 = (ViewStub) requireView().findViewById(R.id.nido_treatment_stub);
                                                        viewStub2.setLayoutResource(R.layout.explore_parent_layout);
                                                        View inflate3 = viewStub2.inflate();
                                                        0qQ.A0C(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
                                                        ViewGroup viewGroup2 = (ViewGroup) inflate3;
                                                        C74486Pvg pvg = this.A0N;
                                                        if (pvg != null) {
                                                            pvg.D71(viewGroup2, this, getSession());
                                                        }
                                                        AnonymousClass0xx A002 = AnonymousClass07a.A00(getViewLifecycleOwner());
                                                        AnonymousClass9KE r5 = new AnonymousClass9KE(viewGroup2, jfs, this, (AnonymousClass4D7) null, 1);
                                                        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r5, A002);
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                0qQ.A0F("exploreSurface");
                                                throw AnonymousClass00P.createAndThrow();
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("exploreGridDelegate");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(AnonymousClass32L r4) {
        GT0 gt0 = r4.A0E;
        String str = "dataStore";
        if (gt0 != null) {
            if (gt0.A02 != null) {
                AnonymousClass0eM r2 = r4.A0t;
                C52529GWg gWg = (C52529GWg) r2.getValue();
                GT0 gt02 = r4.A0E;
                if (gt02 != null) {
                    gWg.A00 = gt02.A02;
                    C52530GWh gWh = r4.A0C;
                    if (gWh == null) {
                        str = "exploreGridDelegate";
                    } else {
                        gWh.A02 = (C52529GWg) r2.getValue();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(AnonymousClass32L r2) {
        C229122ms r0 = r2.A0T;
        if (r0 == null) {
            0qQ.A0F("loadMoreInterface");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.CT5()) {
            0xI A002 = 0xI.A00(r2, "action_bar_feed_retry");
            AnonymousClass6WL.A03(r2.requireContext(), A002);
            C60510iO.A00(r2.getSession()).EFq(A002);
        }
    }

    /* renamed from: A03 */
    public final UserSession getSession() {
        return (UserSession) this.A1A.getValue();
    }

    public final C227762js BD0() {
        C227762js r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CUF() {
        C3723190i r0 = this.A0D;
        if (r0 == null) {
            0qQ.A0F("exploreSurface");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!r0.A05) {
            UserSession A032 = getSession();
            0qQ.A0B(A032, 0);
            if (!C249093j7.A00(A032).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean Cda() {
        C331037Pg r1;
        C14044Tol tol;
        C3723190i r0 = this.A0D;
        if (r0 == null) {
            0qQ.A0F("exploreSurface");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!r0.A05 && ((r1 = C293015jt.A00(getSession()).A00) == null || (!r1.A0D() && ((tol = r1.A06) == null || !tol.A01)))) {
            UserSession A032 = getSession();
            0qQ.A0B(A032, 0);
            if (!C249093j7.A00(A032).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final 0jB E4k() {
        String str;
        0jB r3 = new 0jB();
        if (this.A0B == null) {
            str = "headerController";
        } else {
            GT0 gt0 = this.A0E;
            if (gt0 == null) {
                str = "dataStore";
            } else {
                ExploreTopicCluster exploreTopicCluster = gt0.A02;
                0j9 r1 = C271774jZ.A9D;
                if (exploreTopicCluster != null) {
                    r3.A04(r1, exploreTopicCluster.A06);
                    r3.A04(C271774jZ.A9F, exploreTopicCluster.A0A);
                    r3.A04(C271774jZ.A9G, C296875qn.A00(exploreTopicCluster.A03));
                    r3.A04(C271774jZ.A9C, exploreTopicCluster.A05);
                    String str2 = this.A0V;
                    if (str2 == null) {
                        str = "exploreSessionId";
                    } else {
                        r3.A04(C271774jZ.A7x, str2);
                        return r3;
                    }
                } else {
                    r3.A04(r1, "explore_all:0");
                    return r3;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4x() {
        String str;
        GT0 gt0 = this.A0E;
        0jB r4 = null;
        if (gt0 == null) {
            str = "dataStore";
        } else {
            ExploreTopicCluster exploreTopicCluster = gt0.A02;
            if (exploreTopicCluster != null) {
                r4 = new 0jB();
                String str2 = this.A0V;
                str = "exploreSessionId";
                if (str2 != null) {
                    GXZ.A00(str2);
                    r4.A04(C271774jZ.A9D, exploreTopicCluster.A06);
                    r4.A04(C271774jZ.A9F, exploreTopicCluster.A0A);
                    r4.A04(C271774jZ.A9G, C296875qn.A00(exploreTopicCluster.A03));
                    r4.A04(C271774jZ.A9C, exploreTopicCluster.A05);
                    r4.A0A("topic_cluster_session_id", str2);
                    r4.A0A("topic_nav_order", String.valueOf(0));
                }
            }
            return r4;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        C14074TpO tpO = this.A06;
        String str = "grid";
        if (tpO != null) {
            tpO.A03();
            JSr jSr = this.A0B;
            if (jSr == null) {
                str = "headerController";
            } else {
                jSr.EKZ();
                UserSession A032 = getSession();
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, A032, 36317431708128399L)) {
                    GT0 gt0 = this.A0E;
                    if (gt0 == null) {
                        str = "dataStore";
                    } else {
                        Long l = gt0.A04;
                        if (l != null) {
                            if (System.currentTimeMillis() - l.longValue() > TimeUnit.SECONDS.toMillis(182.A01(r3, getSession(), 36598906684902712L))) {
                                C14074TpO tpO2 = this.A06;
                                if (tpO2 != null) {
                                    C238133Ar r1 = tpO2.A06;
                                    if (r1 != null && (r1 instanceof C238143As)) {
                                        C238143As r12 = (C238143As) r1;
                                        if (r12.CaA()) {
                                            r12.Ev6();
                                        }
                                    }
                                    if (182.A06(r3, getSession(), 36328323743235302L)) {
                                        C52530GWh gWh = this.A0C;
                                        if (gWh == null) {
                                            str = "exploreGridDelegate";
                                        } else {
                                            View view = gWh.A01;
                                            if (view != null) {
                                                view.performHapticFeedback(1);
                                            } else {
                                                str = "rootView";
                                            }
                                        }
                                    }
                                    GWY gwy = this.A0J;
                                    if (gwy == null) {
                                        str = "viewController";
                                    } else {
                                        gwy.A02(true);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getSessionId() {
        String str = this.A0V;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 808) {
            C3723190i r0 = this.A0D;
            if (r0 == null) {
                0qQ.A0F("exploreSurface");
                throw AnonymousClass00P.createAndThrow();
            } else if (r0.A04 && i2 == -1) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            }
        } else if (i == 15739) {
            VGG.A00(getSession()).A00(requireActivity());
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public AnonymousClass32L() {
        0eO r1 = 0eO.A02;
        this.A0y = AnonymousClass0eN.A00(r1, C67366Mmi.A00);
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A0p = obj;
        this.A0X = C46012DIq.A00;
        this.A0x = AnonymousClass0eN.A00(r1, C51776G1l.A00);
        this.A0q = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 28));
        this.A0z = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 37));
        this.A0d = 600000;
        this.A0u = AnonymousClass0eN.A01(C379689Ux.A00);
        this.A0v = AnonymousClass0eN.A01(C41623Axb.A00);
        this.A0w = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 32));
        this.A0s = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 30));
        this.A0r = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 29));
        this.A18 = C54446HEa.A00;
        this.A17 = new C52546GWx(this);
        this.A0t = AnonymousClass1YB.A00(new AnonymousClass9LI(this, 31));
        this.A14 = new C19229WQk(this);
        this.A1A = C227642jf.A02(this);
        this.A0h = new C52543GWu(this);
        this.A0j = new C52527GWe(this);
        this.A16 = new C52525GWc(this);
        this.A19 = new C52447GSz(this);
        this.A0i = new IRL(this);
        this.A0g = new IRB(this);
        this.A15 = new C55488HiW(this);
        this.A0n = new ITO(this);
        this.A0m = new C55489HiX(this);
        this.A0e = new ILC(this);
        this.A12 = new C57081INv(this);
        this.A13 = new C14136TqW(this);
        this.A11 = new T71(this);
        this.A10 = new C57000IKs(this);
        this.A0k = new C55918Hpf(this);
        this.A0l = new C55919Hpg(this);
    }

    private final void A00() {
        String str;
        UserSession A032 = getSession();
        String str2 = this.A0V;
        if (str2 == null) {
            str = "exploreSessionId";
        } else {
            GT0 gt0 = this.A0E;
            if (gt0 == null) {
                str = "dataStore";
            } else {
                GM7.A01(this, A032, gt0.A02, str2, "canceled");
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    public final String getModuleName() {
        Integer num;
        ExploreTopicCluster exploreTopicCluster;
        ExploreFragmentConfig exploreFragmentConfig = (ExploreFragmentConfig) requireArguments().getParcelable("ExploreFragment.ARGUMENT_CONFIG");
        if (exploreFragmentConfig == null || (exploreTopicCluster = exploreFragmentConfig.A02) == null) {
            num = null;
        } else {
            num = exploreTopicCluster.A03;
        }
        if (num == AnonymousClass05K.A1F) {
            return "explore_interest";
        }
        return "explore_popular";
    }

    public final boolean onBackPressed() {
        Integer num;
        if (C321536uL.A02(getSession())) {
            ImmutableSet A032 = ImmutableSet.A03(C321536uL.A01);
            Integer num2 = null;
            if (A032 != null) {
                num = Integer.valueOf(A032.size());
            } else {
                num = null;
            }
            0qQ.A0A(num);
            if (num.intValue() <= 0) {
                ImmutableSet A033 = ImmutableSet.A03(C321536uL.A02);
                if (A033 != null) {
                    num2 = Integer.valueOf(A033.size());
                }
                0qQ.A0A(num2);
                if (num2.intValue() <= 0) {
                    C321536uL.A00 = false;
                }
            }
            GX8 gx8 = this.A08;
            if (gx8 == null) {
                0qQ.A0F("exploreMultiHideLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            0wc r2 = gx8.A00;
            0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(591));
            A002.AAJ("action", "ig_explore_controls_multi_hide_unsaved_changes_shown");
            A002.AAJ("nudge_name", AnonymousClass000.A00(5072));
            A002.Cgf();
            C358248ab r22 = new C358248ab(requireContext());
            r22.A09(2131975992);
            r22.A08(2131975991);
            r22.A0H(W5F.A00, 2131968381);
            r22.A0I(new I89(this), 2131976948);
            AnonymousClass0fN.A00(r22.A02());
            return true;
        }
        UserSession A034 = getSession();
        0qQ.A0B(A034, 0);
        A034.A01(C55487HiV.class, new C58675Ivk(A034, 3));
        requireActivity();
        GM4.A00(getSession()).A00(requireActivity());
        C232692uG r0 = this.A0L;
        if (r0 == null || !r0.onBackPressed()) {
            FragmentActivity requireActivity = requireActivity();
            1OP r02 = 1OP.$redex_init_class;
            AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
            if (A042 == null || !A042.A0a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: X.2uF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: X.2uF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v3, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v12, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v10, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v13, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v14, resolved type: X.2iu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v15, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v10, resolved type: X.4DU} */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r46v0, types: [X.3kK, X.0iw] */
    /* JADX WARNING: type inference failed for: r30v3, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v44, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v182, types: [X.3kK, java.lang.Object, X.1L1] */
    /* JADX WARNING: type inference failed for: r2v92, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v105, types: [java.lang.Object, X.49a] */
    /* JADX WARNING: type inference failed for: r31v13, types: [X.V2H, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v33, types: [X.X9Q] */
    /* JADX WARNING: type inference failed for: r27v14, types: [X.TpQ] */
    /* JADX WARNING: type inference failed for: r27v15, types: [X.WWG] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x042e, code lost:
        if (X.182.A06(r4, r5, 36312879042266474L) == false) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0443, code lost:
        if (X.182.A06(r4, r5, 36312879042266474L) == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0bfc, code lost:
        if (r11.equals(r1) == false) goto L_0x0b97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0bfe, code lost:
        r1 = X.C14411Tvf.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0c07, code lost:
        if (r11.equals(r1) == false) goto L_0x0b97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0c09, code lost:
        r1 = X.C14411Tvf.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0c0b, code lost:
        r2 = new X.C14386TvF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0c16, code lost:
        if (r11.equals("MEDIA_GRID") == false) goto L_0x0c21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0c18, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0c19, code lost:
        if (r1 >= r13) goto L_0x0b97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0c1b, code lost:
        r9.add(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0c21, code lost:
        r9.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02d1, code lost:
        if (r2 == 4) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0419, code lost:
        if (X.182.A06(r4, r5, 36319772463603314L) == false) goto L_0x041b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x09b6  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x09c6  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0add  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0c3c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r67) {
        /*
            r66 = this;
            r0 = -65388470(0xfffffffffc1a404a, float:-3.2036706E36)
            int r26 = X.AnonymousClass0fD.A02(r0)
            r0 = r66
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.3Yv r1 = new X.3Yv
            r1.<init>(r3, r2)
            r0.A0A = r1
            android.content.Context r4 = r0.requireContext()
            java.lang.String r3 = r0.getModuleName()
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.5r2 r1 = new X.5r2
            r1.<init>(r2, r4, r3)
            r0.A0b = r1
            com.instagram.common.session.UserSession r4 = r0.getSession()
            r2 = 31784973(0x1e5000d, float:8.412139E-38)
            java.lang.String r1 = "feed"
            X.Dbx r3 = new X.Dbx
            r3.<init>(r4, r1, r2)
            r0.A00 = r3
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.2cc r1 = X.C71342cb.A00(r1)
            r3.A0R(r2, r1, r0)
            X.0wX r1 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r1)
            X.0eM r1 = r0.A0y
            java.lang.Object r1 = r1.getValue()
            X.Mnt r1 = (X.C67438Mnt) r1
            r2.A0S(r1)
            com.instagram.common.session.UserSession r3 = r0.getSession()
            java.lang.String r1 = r0.getModuleName()
            X.GWd r2 = new X.GWd
            r2.<init>(r3, r1)
            r0.A0I = r2
            r23 = 1
            r12 = 0
            r1 = r23
            r2.A05(r1, r12)
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            r0.getModuleName()
            android.content.Context r2 = r0.requireContext()
            X.57H r1 = new X.57H
            r1.<init>(r2)
            r0.A0O = r1
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.0qQ.A0B(r3, r12)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323586395811111(0x810c1c00172d27, double:3.0345205278288943E-306)
            boolean r3 = X.182.A06(r4, r3, r1)
            X.0eM r1 = r0.A0z
            r65 = r1
            java.lang.Object r2 = r65.getValue()
            X.2lJ r2 = (X.C228312lJ) r2
            if (r2 == 0) goto L_0x00a4
            X.JPT r1 = r0.A17
            r2.A04 = r1
        L_0x00a4:
            if (r3 != 0) goto L_0x00b0
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.GTq r1 = X.GM4.A00(r1)
            r1.A03 = r0
        L_0x00b0:
            r1 = r67
            X.AnonymousClass32L.super.onCreate(r1)
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "ExploreFragment.ARGUMENT_CONFIG"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            com.instagram.explore.intf.ExploreFragmentConfig r1 = (com.instagram.explore.intf.ExploreFragmentConfig) r1
            if (r1 == 0) goto L_0x0f1a
            java.lang.String r2 = r1.A04
            if (r2 != 0) goto L_0x00d1
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.GXh r2 = X.GX9.A00(r2)
            java.lang.String r2 = r2.A00
        L_0x00d1:
            r0.A0V = r2
            boolean r2 = r1.A06
            r64 = r2
            java.lang.String r6 = r1.A03
            r0.A0W = r6
            boolean r2 = r1.A05
            r0.A0Y = r2
            java.lang.String r17 = "exploreSessionId"
            r25 = 0
            if (r3 == 0) goto L_0x00f8
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.GTq r5 = X.GM4.A00(r2)
            java.lang.String r3 = r0.A0V
            if (r3 == 0) goto L_0x01d6
            X.Wg6 r2 = new X.Wg6
            r2.<init>(r3)
            r5.A03 = r2
        L_0x00f8:
            int r5 = r1.A01
            com.instagram.explore.topiccluster.ExploreTopicCluster r3 = r1.A02
            X.90i r2 = new X.90i
            r2.<init>(r3, r6, r5)
            r0.A0D = r2
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.0wc r22 = X.AnonymousClass0kN.A01(r0, r2)
            X.2ms r2 = r0.A19
            r0.A0T = r2
            com.instagram.common.session.UserSession r6 = r0.getSession()
            X.90i r2 = r0.A0D
            java.lang.String r16 = "exploreSurface"
            if (r2 == 0) goto L_0x04a8
            int r5 = r2.A01
            java.lang.String r3 = r0.A0V
            if (r3 == 0) goto L_0x01d6
            X.GX7 r2 = new X.GX7
            r2.<init>(r6, r0, r3, r5)
            r0.A09 = r2
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.GX8 r2 = new X.GX8
            r2.<init>(r0, r3)
            r0.A08 = r2
            android.content.Context r3 = r0.requireContext()
            r2 = r25
            X.2js r2 = X.C227752jr.A00(r3, r2, r12)
            r0.A02 = r2
            X.Tun r8 = new X.Tun
            r8.<init>()
            r0.A01 = r8
            android.content.Context r28 = r0.requireContext()
            com.instagram.common.session.UserSession r7 = r0.getSession()
            java.lang.String r6 = r0.A0V
            if (r6 == 0) goto L_0x01d6
            r2 = r23
            X.0qQ.A0B(r7, r2)
            X.TvM r5 = r8.A01
            if (r5 != 0) goto L_0x018f
            X.TpR r3 = r8.A00(r7)
            if (r3 != 0) goto L_0x0342
            android.content.Context r27 = r0.requireContext()
            com.instagram.common.session.UserSession r28 = r0.getSession()
            java.lang.String r5 = r0.A0V
            if (r5 == 0) goto L_0x01d6
            com.instagram.common.session.UserSession r6 = r0.getSession()
            r2 = 36310357895020572(0x8100140000001c, double:3.02615477066206E-306)
            boolean r33 = X.182.A06(r4, r6, r2)
            com.instagram.common.session.UserSession r6 = r0.getSession()
            r2 = 36598820783525158(0x82066f00000d26, double:3.20857986289918E-306)
            long r31 = X.182.A01(r4, r6, r2)
            r29 = r0
            r30 = r5
            r34 = r23
            X.X9Q r5 = X.C16942VBu.A00(r27, r28, r29, r30, r31, r33, r34)
        L_0x018f:
            r0.A07 = r5
            X.TpP r21 = new X.TpP
            r21.<init>()
            X.2ej r3 = X.C71682ef.A00()
            r2 = r25
            X.2el r20 = X.C71682ef.A01(r2, r3)
            r2 = r20
            X.0qQ.A0B(r2, r12)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            X.C245843dZ.A00 = r3
            X.Tuo r2 = new X.Tuo
            r2.<init>()
            r0.A0H = r2
            X.Tup r2 = new X.Tup
            r2.<init>()
            r0.A0G = r2
            X.1YN r10 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r9 = r0.getSession()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.EXPLORE_GRID_1X2
            X.2qQ r2 = new X.2qQ
            r2.<init>()
            X.0eP r8 = new X.0eP
            r8.<init>(r3, r2)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r3 = com.instagram.quickpromotion.intf.QPTooltipAnchor.EXPLORE_POPULAR_REELS_PILL
            X.Tuo r2 = r0.A0H
            if (r2 != 0) goto L_0x01de
            java.lang.String r17 = "quickPromotionPillTooltipDelegate"
        L_0x01d6:
            X.0qQ.A0F(r17)
        L_0x01d9:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x01de:
            X.0eP r7 = new X.0eP
            r7.<init>(r3, r2)
            r5 = 2
            com.instagram.quickpromotion.intf.QPTooltipAnchor r6 = com.instagram.quickpromotion.intf.QPTooltipAnchor.EXPLORE_SEARCH_BAR_META_AI_BUTTON
            X.Tup r3 = r0.A0G
            if (r3 != 0) goto L_0x01ed
            java.lang.String r17 = "quickPromotionMetaAiSearchTooltipDelegate"
            goto L_0x01d6
        L_0x01ed:
            X.0eP r2 = new X.0eP
            r2.<init>(r6, r3)
            X.0eP[] r2 = new X.0eP[]{r8, r7, r2}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r2)
            X.2qT r2 = r10.A04(r9, r2)
            r0.A0Q = r2
            X.1YN r40 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r43 = r0.getSession()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r45 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0R
            X.AnonymousClass2bO.A00()
            X.GXA r8 = new X.GXA
            r8.<init>(r0)
            X.2qT r7 = r0.A0Q
            if (r7 != 0) goto L_0x0219
            java.lang.String r17 = "quickPromotionTooltipsController"
            goto L_0x01d6
        L_0x0219:
            X.Tuq r6 = new X.Tuq
            r6.<init>(r0)
            X.Tur r3 = new X.Tur
            r3.<init>(r0)
            X.Mmj r2 = new X.Mmj
            r2.<init>(r0)
            r27 = r2
            r28 = r25
            r29 = r25
            r30 = r25
            r31 = r6
            r32 = r25
            r33 = r25
            r34 = r25
            r35 = r8
            r36 = r3
            r37 = r7
            r38 = r25
            r39 = r25
            X.2bW r44 = X.2bV.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r41 = r0
            r42 = r0
            X.2qi r2 = r40.A01(r41, r42, r43, r44, r45)
            r0.A0P = r2
            androidx.fragment.app.FragmentActivity r28 = r0.requireActivity()
            com.instagram.common.session.UserSession r30 = r0.getSession()
            X.Tus r6 = new X.Tus
            r6.<init>(r0)
            int r2 = r1.A00
            X.Tut r3 = new X.Tut
            r27 = r3
            r29 = r0
            r31 = r6
            r32 = r2
            r27.<init>(r28, r29, r30, r31, r32)
            r0.A0F = r3
            X.Hpf r3 = r0.A0k
            r54 = r3
            com.instagram.common.session.UserSession r40 = r0.getSession()
            X.GX7 r3 = r0.A09
            java.lang.String r19 = "topicDestinationLogger"
            if (r3 == 0) goto L_0x0282
            java.lang.String r6 = r0.A0V
            if (r6 != 0) goto L_0x0287
            r19 = r17
        L_0x0282:
            X.0qQ.A0F(r19)
            goto L_0x01d9
        L_0x0287:
            X.4bz r6 = r0.A0e
            r53 = r6
            X.GXB r38 = new X.GXB
            r39 = r6
            r41 = r3
            r42 = r54
            r43 = r0
            r38.<init>(r39, r40, r41, r42, r43)
            X.90i r6 = r0.A0D
            r9 = r16
            if (r6 == 0) goto L_0x0318
            boolean r3 = r6.A03
            if (r3 != 0) goto L_0x02c8
            boolean r3 = r6.A04
            if (r3 != 0) goto L_0x02c8
            com.instagram.explore.topiccluster.ExploreTopicCluster r6 = r6.A00
            if (r6 == 0) goto L_0x0f0a
            android.content.Context r28 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r29 = r0.requireActivity()
            r3 = 36
            X.9LI r1 = new X.9LI
            r1.<init>(r0, r3)
            X.WWG r3 = new X.WWG
            r27 = r3
            r30 = r0
            r31 = r6
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32)
            goto L_0x06be
        L_0x02c8:
            r3 = r23
            if (r2 == r3) goto L_0x02d3
            if (r2 == r5) goto L_0x02d3
            r3 = 4
            r44 = 0
            if (r2 != r3) goto L_0x02d5
        L_0x02d3:
            r44 = 1
        L_0x02d5:
            android.content.Context r28 = r0.requireContext()
            com.instagram.common.session.UserSession r33 = r0.getSession()
            androidx.fragment.app.FragmentActivity r30 = r0.requireActivity()
            X.2qT r13 = r0.A0Q
            java.lang.String r9 = "quickPromotionTooltipsController"
            if (r13 == 0) goto L_0x0318
            X.2qi r11 = r0.A0P
            java.lang.String r18 = "quickPromotionDelegate"
            if (r11 == 0) goto L_0x069e
            X.Tuo r10 = r0.A0H
            if (r10 != 0) goto L_0x02f4
            java.lang.String r19 = "quickPromotionPillTooltipDelegate"
            goto L_0x0282
        L_0x02f4:
            android.content.Context r46 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            r3 = 7
            java.lang.String r3 = X.C66579MXk.A00(r3)
            X.0qQ.A0C(r8, r3)
            com.instagram.base.activity.BaseFragmentActivity r8 = (com.instagram.base.activity.BaseFragmentActivity) r8
            com.instagram.common.session.UserSession r49 = r0.getSession()
            X.2qT r7 = r0.A0Q
            if (r7 == 0) goto L_0x0318
            X.2qi r6 = r0.A0P
            if (r6 == 0) goto L_0x069e
            X.Tup r3 = r0.A0G
            if (r3 != 0) goto L_0x031d
            java.lang.String r9 = "quickPromotionMetaAiSearchTooltipDelegate"
        L_0x0318:
            X.0qQ.A0F(r9)
            goto L_0x01d9
        L_0x031d:
            X.TvH r9 = new X.TvH
            r45 = r9
            r47 = r8
            r48 = r0
            r50 = r3
            r51 = r6
            r52 = r7
            r45.<init>(r46, r47, r48, r49, r50, r51, r52)
            r6 = 35
            X.9LI r3 = new X.9LI
            r3.<init>(r9, r6)
            r0.A0X = r3
            X.GX7 r8 = r0.A09
            if (r8 == 0) goto L_0x0282
            X.GX8 r7 = r0.A08
            if (r7 != 0) goto L_0x068e
            java.lang.String r9 = "exploreMultiHideLogger"
            goto L_0x0318
        L_0x0342:
            X.TuJ r2 = r3.A01
            X.TvM r5 = new X.TvM
            r27 = r5
            r29 = r3
            r30 = r2
            r31 = r7
            r32 = r0
            r33 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r8.A01 = r5
            goto L_0x018f
        L_0x0359:
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.0qQ.A0B(r1, r12)
            X.GXR r3 = r6.A00
            if (r3 != 0) goto L_0x036b
            X.TpR r2 = r6.A00(r1)
            if (r2 != 0) goto L_0x0eff
            r3 = 0
        L_0x036b:
            X.Jfs r1 = r0.A0M
            X.GT0 r6 = new X.GT0
            r27 = r6
            r30 = r3
            r32 = r11
            r33 = r8
            r34 = r10
            r35 = r1
            r36 = r5
            r39 = r9
            r40 = r13
            r41 = r64
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.GWv r11 = r0.A03
            java.lang.Object r1 = r14.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x049a
            if (r11 == 0) goto L_0x049a
            if (r7 == 0) goto L_0x049a
            com.instagram.common.session.UserSession r5 = r0.getSession()
            java.lang.Object r3 = r61.getValue()
            X.GWW r3 = (X.GWW) r3
            X.GXK r13 = r0.A0K
            if (r13 == 0) goto L_0x0efb
            java.lang.String r14 = r0.getSessionId()
            X.0qQ.A0B(r5, r12)
            r1 = r23
            X.0qQ.A0B(r3, r1)
            X.HEa r8 = X.C54446HEa.A00
            X.0qQ.A0B(r8, r12)
            java.util.Set r2 = X.C14410Tve.A01
            boolean r1 = r2.contains(r8)
            if (r1 != 0) goto L_0x03cd
            X.GXn r1 = new X.GXn
            r1.<init>()
            X.1PG.A01(r1, r8)
            r2.add(r8)
        L_0x03cd:
            X.1PG r1 = X.1PG.A00(r5)
            X.0qQ.A07(r1)
            X.3kU r9 = r1.A06(r8)
            X.0qQ.A07(r9)
            X.GWw r8 = new X.GWw
            r8.<init>(r5, r3, r6)
            X.GXo r2 = new X.GXo
            r2.<init>()
            X.GXU r1 = new X.GXU
            r1.<init>(r5, r3, r6)
            X.2w4 r10 = X.C233632w4.A05
            X.2w5 r3 = new X.2w5
            r3.<init>(r10)
            r3.A0L = r9
            r3.A0H = r8
            r3.A0G = r11
            X.4jj r10 = new X.4jj
            r10.<init>(r5, r2, r9)
            r3.A0N = r10
            r3.A0K = r7
            r3.A0E = r2
            r10 = r23
            r3.A0p = r10
            X.1PJ r36 = X.C14410Tve.A00
            boolean r10 = X.C233832wY.A01(r5)
            if (r10 == 0) goto L_0x041b
            r10 = 36319772463603314(0x8108a400041e72, double:3.032108581743211E-306)
            boolean r10 = X.182.A06(r4, r5, r10)
            r37 = 1
            if (r10 != 0) goto L_0x041d
        L_0x041b:
            r37 = 0
        L_0x041d:
            boolean r10 = X.C228342lQ.A03(r5)
            if (r10 == 0) goto L_0x0430
            r10 = 36312879042266474(0x81025f0016056a, double:3.027749154332214E-306)
            boolean r10 = X.182.A06(r4, r5, r10)
            r38 = 1
            if (r10 != 0) goto L_0x0432
        L_0x0430:
            r38 = 0
        L_0x0432:
            boolean r10 = X.C228342lQ.A05(r5)
            if (r10 == 0) goto L_0x0445
            r10 = 36312879042266474(0x81025f0016056a, double:3.027749154332214E-306)
            boolean r10 = X.182.A06(r4, r5, r10)
            r39 = 1
            if (r10 != 0) goto L_0x0447
        L_0x0445:
            r39 = 0
        L_0x0447:
            X.4jd r10 = new X.4jd
            r30 = r10
            r31 = r5
            r32 = r2
            r33 = r8
            r34 = r7
            r35 = r9
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r3.A0J = r10
            r3.A0I = r1
            r3.A03 = r5
            r1 = 36320111765757921(0x8108f300001fe1, double:3.032323157792045E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            r3.A0n = r1
            r1 = 36318595642628412(0x8107920005193c, double:3.0313643554200055E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            r3.A0o = r1
            r1 = 36315902699966127(0x81051f00210eaf, double:3.029661327636767E-306)
            boolean r7 = X.182.A06(r4, r5, r1)
            if (r7 == 0) goto L_0x0ef2
            r3.A0P = r13
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x0eeb
            X.IYj r1 = new X.IYj
            r1.<init>(r0, r14)
            X.2pc r2 = X.C230432pc.EXPLORE_GRID
            X.2y6 r1 = X.AnonymousClass2y5.A00(r5, r1, r2)
        L_0x0492:
            r3.A0R = r1
        L_0x0494:
            X.2wV r1 = r3.A00()
            r0.A0R = r1
        L_0x049a:
            android.content.Context r28 = r0.requireContext()
            com.instagram.common.session.UserSession r31 = r0.getSession()
            java.lang.String r10 = r0.A0V
            if (r10 != 0) goto L_0x04ad
            r16 = r17
        L_0x04a8:
            X.0qQ.A0F(r16)
            goto L_0x01d9
        L_0x04ad:
            X.Dbx r9 = r0.A00
            if (r9 != 0) goto L_0x04b4
            java.lang.String r16 = "navigationPerfLogger"
            goto L_0x04a8
        L_0x04b4:
            java.lang.String r13 = r0.A0W
            X.GX7 r8 = r0.A09
            if (r8 != 0) goto L_0x04bd
            r16 = r19
            goto L_0x04a8
        L_0x04bd:
            X.GXK r7 = r0.A0K
            if (r7 == 0) goto L_0x0efb
            X.90i r5 = r0.A0D
            if (r5 == 0) goto L_0x04a8
            java.lang.Object r3 = r65.getValue()
            X.2lJ r3 = (X.C228312lJ) r3
            X.GWv r11 = r0.A03
            X.GWd r2 = r0.A0I
            if (r2 != 0) goto L_0x04d4
            java.lang.String r16 = "gridMediaLoadingTracker"
            goto L_0x04a8
        L_0x04d4:
            X.GWY r1 = new X.GWY
            r27 = r1
            r30 = r9
            r32 = r11
            r33 = r8
            r34 = r5
            r35 = r6
            r36 = r2
            r37 = r7
            r38 = r0
            r39 = r3
            r40 = r10
            r41 = r13
            r42 = r64
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.JSr r3 = r0.A0B
            java.lang.String r2 = "headerController"
            if (r3 != 0) goto L_0x04fe
            X.0qQ.A0F(r2)
            goto L_0x01d9
        L_0x04fe:
            boolean r2 = r3 instanceof X.C14076TpQ
            if (r2 == 0) goto L_0x050b
            X.TpQ r3 = (X.C14076TpQ) r3
            X.GXQ r2 = new X.GXQ
            r2.<init>(r0, r1)
            r3.A0B = r2
        L_0x050b:
            X.GXO r2 = r1.A0B
            r6.A03 = r2
            r2 = r63
            r1.A00 = r2
            r0.A0E = r6
            r0.A0J = r1
            X.GWh r5 = r0.A0C
            if (r5 == 0) goto L_0x069e
            java.lang.String r18 = "viewController"
            r5.A04 = r1
            r5.A03 = r6
            X.2uG r1 = r0.A0L
            r5.A05 = r1
            com.instagram.common.session.UserSession r3 = r0.getSession()
            r1 = -1
            X.328 r2 = new X.328
            r2.<init>(r0, r1)
            X.32A r1 = new X.32A
            r1.<init>(r0, r3, r2)
            r5.A07 = r1
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.INg> r2 = X.C57066INg.class
            X.1wn r1 = r0.A12
            r3.A01(r1, r2)
            java.lang.Class<X.36g> r2 = X.C2370836g.class
            X.1wn r1 = r0.A13
            r3.A01(r1, r2)
            java.lang.Class<X.377> r2 = X.AnonymousClass377.class
            X.1wn r1 = r0.A11
            r3.A01(r1, r2)
            android.content.Context r28 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r29 = r0.requireActivity()
            com.instagram.common.session.UserSession r30 = r0.getSession()
            java.lang.String r32 = r0.getModuleName()
            X.GX7 r3 = r0.A09
            if (r3 != 0) goto L_0x056b
            r18 = r19
            goto L_0x069e
        L_0x056b:
            r1 = 33
            X.9LI r5 = new X.9LI
            r5.<init>(r0, r1)
            r1 = 34
            X.9LI r2 = new X.9LI
            r2.<init>(r0, r1)
            X.TvN r1 = new X.TvN
            r27 = r1
            r31 = r3
            r33 = r5
            r34 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r0.A0c = r1
            com.instagram.common.session.UserSession r3 = r1.A06
            X.0iw r7 = r1.A01
            java.lang.String r1 = r7.getModuleName()
            X.34L r6 = new X.34L
            r6.<init>(r3, r1)
            java.lang.String r2 = r7.getModuleName()
            X.34R r5 = new X.34R
            r1 = r25
            r5.<init>(r3, r1, r2)
            X.1wY r3 = X.1wY.A00(r3)
            java.lang.String r2 = r7.getModuleName()
            java.lang.Integer r1 = X.1wY.A0F
            X.0qQ.A08(r1)
            r3.A07(r6, r5, r2)
            X.GWY r1 = r0.A0J
            if (r1 == 0) goto L_0x069e
            X.GT0 r6 = r1.A09
            X.90i r5 = r6.A0H
            java.lang.String r9 = X.C3723090h.A01(r5)
            X.GXl r8 = r6.A0D
            X.GXm r1 = r8.A03
            java.util.concurrent.ConcurrentMap r1 = r1.A00
            java.lang.Object r7 = r1.get(r9)
            java.util.List r7 = (java.util.List) r7
            android.content.Context r14 = r6.A09
            com.instagram.common.session.UserSession r3 = r6.A0C
            X.07i r15 = r6.A0A
            X.6z9 r2 = new X.6z9
            r2.<init>(r14, r15, r3)
            X.GXP r1 = new X.GXP
            r1.<init>(r3, r2)
            r6.A01 = r1
            if (r7 == 0) goto L_0x0656
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0656
            X.GXm r1 = r8.A01
            java.util.concurrent.ConcurrentMap r1 = r1.A00
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r6.A05 = r1
            X.GXm r1 = r8.A02
            java.util.concurrent.ConcurrentMap r1 = r1.A00
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r6.A06 = r1
            java.lang.String r2 = r6.A05
            X.GXm r1 = r8.A00
            java.util.concurrent.ConcurrentMap r1 = r1.A00
            java.lang.Object r1 = r1.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0653
            boolean r18 = r1.booleanValue()
        L_0x060c:
            X.6z9 r13 = new X.6z9
            r16 = r3
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            X.GXP r1 = new X.GXP
            r1.<init>(r3, r13)
            r6.A00 = r1
            java.lang.String r1 = r6.A05
            r6.A01(r7, r1)
            X.GXO r1 = r6.A03
            if (r1 == 0) goto L_0x062e
            X.GWY r1 = r1.A00
            X.Dbx r1 = r1.A05
            X.34p r1 = r1.A00
            r1.A02()
        L_0x062e:
            boolean r1 = r5.A03
            if (r1 == 0) goto L_0x063b
            X.GXh r1 = X.GX9.A00(r3)
            java.util.List r1 = r1.A01
            r6.A02(r1, r12)
        L_0x063b:
            A01(r0)
            com.instagram.common.session.UserSession r2 = r0.getSession()
            r0 = 36321443205621119(0x810a290000257f, double:3.033165165722809E-306)
            X.182.A06(r4, r2, r0)
            r1 = 176021921(0xa7de1a1, float:1.2223943E-32)
            r0 = r26
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0653:
            r18 = 0
            goto L_0x060c
        L_0x0656:
            X.6z9 r2 = new X.6z9
            r2.<init>(r14, r15, r3)
            X.GXP r1 = new X.GXP
            r1.<init>(r3, r2)
            r6.A00 = r1
            java.lang.String r8 = r6.A0Q
            java.lang.String r7 = r6.A0R
            boolean r3 = r6.A0V
            java.lang.String r2 = r6.A0S
            r48 = 64192(0xfac0, float:8.9952E-41)
            X.90k r1 = new X.90k
            r41 = r1
            r42 = r5
            r44 = r8
            r45 = r7
            r46 = r25
            r47 = r2
            r49 = r12
            r50 = r23
            r51 = r12
            r52 = r12
            r53 = r3
            r54 = r12
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r6.A00(r1)
            goto L_0x063b
        L_0x068e:
            r0.getSession()
            X.V2H r31 = new X.V2H
            r31.<init>()
            X.Hpg r14 = r0.A0l
            X.Tut r6 = r0.A0F
            if (r6 != 0) goto L_0x06a3
            java.lang.String r18 = "shareableGridController"
        L_0x069e:
            X.0qQ.A0F(r18)
            goto L_0x01d9
        L_0x06a3:
            X.TpQ r3 = new X.TpQ
            r27 = r3
            r32 = r0
            r34 = r7
            r35 = r8
            r36 = r9
            r37 = r14
            r39 = r1
            r40 = r6
            r41 = r10
            r42 = r11
            r43 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x06be:
            X.JSr r3 = (X.JSr) r3
            r0.A0B = r3
            java.lang.String r1 = r0.A0p
            r47 = r1
            com.instagram.common.session.UserSession r9 = r0.getSession()
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            X.HiW r1 = r0.A15
            X.GXC r24 = new X.GXC
            r6 = r24
            r7 = r0
            r10 = r1
            r11 = r47
            r6.<init>(r7, r8, r9, r10, r11)
            X.90i r3 = r0.A0D
            if (r3 == 0) goto L_0x04a8
            boolean r1 = r3.A03
            if (r1 != 0) goto L_0x06e7
            boolean r1 = r3.A05
            if (r1 == 0) goto L_0x070f
        L_0x06e7:
            com.instagram.common.session.UserSession r1 = r0.getSession()
            r3 = r23
            X.0qQ.A0B(r1, r3)
            r6 = 36327078203111577(0x810f4900063899, double:3.0367287608260885E-306)
            boolean r3 = X.182.A06(r4, r1, r6)
            if (r3 == 0) goto L_0x0729
            X.Dgv r3 = new X.Dgv
            r3.<init>(r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r3, r0)
            java.lang.Class<com.instagram.nido.impl.explore.NidoExploreViewModel> r3 = com.instagram.nido.impl.explore.NidoExploreViewModel.class
            X.2YL r1 = r1.A00(r3)
            X.Jfs r1 = (X.C60111Jfs) r1
        L_0x070d:
            r0.A0M = r1
        L_0x070f:
            r50 = 0
            if (r2 != r5) goto L_0x0715
            r50 = 1
        L_0x0715:
            X.Hpg r1 = r0.A0l
            r63 = r1
            com.instagram.common.session.UserSession r31 = r0.getSession()
            X.To7 r1 = r0.A0f
            r18 = r1
            X.JSr r13 = r0.A0B
            if (r13 != 0) goto L_0x072b
            java.lang.String r18 = "headerController"
            goto L_0x069e
        L_0x0729:
            r1 = 0
            goto L_0x070d
        L_0x072b:
            X.32Q r1 = r0.A0o
            r62 = r1
            java.lang.String r15 = r0.A0W
            boolean r14 = r0.A0Y
            X.2qi r11 = r0.A0P
            if (r11 == 0) goto L_0x0ee7
            X.2qT r10 = r0.A0Q
            if (r10 == 0) goto L_0x0ee3
            X.0eM r1 = r0.A0q
            r61 = r1
            java.lang.Object r9 = r61.getValue()
            X.GWW r9 = (X.GWW) r9
            X.90i r8 = r0.A0D
            if (r8 == 0) goto L_0x0edf
            X.X9Q r7 = r0.A07
            if (r7 == 0) goto L_0x0edb
            X.2js r6 = r0.A02
            if (r6 == 0) goto L_0x0ed7
            X.GWd r3 = r0.A0I
            if (r3 != 0) goto L_0x0759
            java.lang.String r18 = "gridMediaLoadingTracker"
            goto L_0x069e
        L_0x0759:
            X.Jfs r2 = r0.A0M
            X.GWh r1 = new X.GWh
            r27 = r1
            r28 = r53
            r29 = r6
            r30 = r22
            r32 = r18
            r33 = r24
            r34 = r9
            r35 = r7
            r36 = r13
            r37 = r54
            r38 = r63
            r39 = r8
            r40 = r3
            r41 = r0
            r42 = r2
            r43 = r11
            r44 = r10
            r45 = r62
            r46 = r0
            r48 = r15
            r49 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r0.A0C = r1
            android.content.Context r2 = r0.requireContext()
            r1.A00 = r2
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            boolean r1 = r1.A03
            java.lang.String r18 = "exploreGridDelegate"
            if (r1 == 0) goto L_0x07c5
            X.Jfs r1 = r0.A0M
            if (r1 == 0) goto L_0x087e
            com.instagram.nido.impl.explore.NidoExploreViewModel r1 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r1
            X.0eM r1 = r1.A06
            java.lang.Object r1 = r1.getValue()
            X.0Ud r1 = (X.AnonymousClass0Ud) r1
            if (r1 == 0) goto L_0x087e
            java.lang.Object r6 = r1.getValue()
            X.Pvg r6 = (X.C74486Pvg) r6
        L_0x07b2:
            r0.A0N = r6
            X.Jfs r3 = r0.A0M
            if (r3 == 0) goto L_0x07c5
            if (r6 == 0) goto L_0x07c5
            X.GWh r2 = r0.A0C
            if (r2 == 0) goto L_0x069e
            com.instagram.common.session.UserSession r1 = r0.getSession()
            r6.D6Z(r1, r2, r3)
        L_0x07c5:
            com.instagram.common.session.UserSession r3 = r0.getSession()
            r1 = 36315902698720933(0x81051f000e0ea5, double:3.029661326849301E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x087c
            com.instagram.common.session.UserSession r6 = r0.getSession()
            X.0qQ.A0B(r6, r12)
            java.lang.Class<X.49d> r3 = X.C2613249d.class
            r2 = 27
            X.Ivv r1 = new X.Ivv
            r1.<init>(r6, r2)
            java.lang.Object r7 = r6.A01(r3, r1)
            X.49d r7 = (X.C2613249d) r7
            X.0lg r1 = r7.A00
            r2 = r23
            X.0qQ.A0B(r1, r2)
            java.lang.String r6 = r0.getModuleName()
            X.49Z r3 = new X.49Z
            r3.<init>(r1)
            X.49a r2 = new X.49a
            r2.<init>()
            X.49b r1 = new X.49b
            r1.<init>(r2, r3, r6)
            java.util.List r3 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r3)
            X.49c r2 = new X.49c
            r1 = r23
            r2.<init>(r3, r1)
            X.0JR r1 = X.C39610A2a.A00
            X.AwK r3 = new X.AwK
            r3.<init>(r1)
            X.Hqd r1 = new X.Hqd
            r1.<init>(r2, r7, r3)
        L_0x081e:
            r0.A0U = r1
            com.instagram.common.session.UserSession r2 = r0.getSession()
            android.content.Context r1 = r0.requireContext()
            X.3KG r1 = X.AnonymousClass3KF.A00(r1, r2)
            r0.A0Z = r1
            com.instagram.common.session.UserSession r8 = r0.getSession()
            X.X9Q r7 = r0.A07
            if (r7 == 0) goto L_0x0edb
            X.GWh r6 = r0.A0C
            if (r6 == 0) goto L_0x069e
            X.X41 r15 = r0.A0j
            java.lang.Object r3 = r61.getValue()
            X.GX4 r3 = (X.GX4) r3
            java.lang.String r38 = r0.getSessionId()
            X.0eM r1 = r0.A0r
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r39 = r1.booleanValue()
            X.Hqd r1 = r0.A0U
            r37 = r1
            X.0qQ.A0B(r8, r5)
            r1 = 6
            X.0qQ.A0B(r15, r1)
            r1 = 8
            X.0qQ.A0B(r3, r1)
            android.content.Context r27 = r0.requireContext()
            X.2s4 r30 = new X.2s4
            r30.<init>()
            com.instagram.common.session.UserSession r53 = r0.getSession()
            java.lang.Integer r43 = X.AnonymousClass05K.A00
            X.57H r5 = r0.A0O
            if (r5 != 0) goto L_0x0881
            java.lang.String r18 = "tailFetchPerfLogger"
            goto L_0x069e
        L_0x087c:
            r1 = 0
            goto L_0x081e
        L_0x087e:
            r6 = 0
            goto L_0x07b2
        L_0x0881:
            java.lang.Object r2 = r65.getValue()
            X.2lJ r2 = (X.C228312lJ) r2
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x0edf
            boolean r9 = r1.A03
            java.lang.String r59 = r0.getModuleName()
            X.GWy r1 = new X.GWy
            r1.<init>(r0)
            X.GAC r52 = new X.GAC
            r54 = r20
            r55 = r5
            r56 = r1
            r57 = r2
            r58 = r43
            r60 = r9
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60)
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.Tuy r14 = new X.Tuy
            r1 = r20
            r14.<init>(r2, r1)
            com.instagram.common.session.UserSession r5 = r0.getSession()
            r1 = 36330539946361518(0x81126f000042ae, double:3.0389179811966724E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x08db
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.Hnl r1 = new X.Hnl
            r1.<init>(r2, r0)
            X.2tR r13 = new X.2tR
            r13.<init>(r1)
        L_0x08cf:
            android.content.Context r45 = r0.requireContext()
            X.2ms r11 = r0.A0T
            if (r11 != 0) goto L_0x08de
            java.lang.String r18 = "loadMoreInterface"
            goto L_0x069e
        L_0x08db:
            r13 = r25
            goto L_0x08cf
        L_0x08de:
            java.lang.Object r1 = r61.getValue()
            X.GX4 r1 = (X.GX4) r1
            com.instagram.common.session.UserSession r48 = r0.getSession()
            X.2qi r10 = r0.A0P
            if (r10 == 0) goto L_0x0ee7
            r28 = r0
            r29 = r8
            r31 = r21
            r32 = r6
            r33 = r3
            r34 = r15
            r35 = r7
            r36 = r0
            r40 = r12
            X.2tC r9 = X.C14370Tuz.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.Mmq r2 = new X.Mmq
            r2.<init>()
            r9.A01(r2)
            com.instagram.common.session.UserSession r29 = r0.getSession()
            java.lang.Object r5 = r61.getValue()
            X.GX4 r5 = (X.GX4) r5
            com.instagram.common.session.UserSession r34 = r0.getSession()
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r36 = r2.toString()
            X.0qQ.A07(r36)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r37 = r2.toString()
            X.0qQ.A07(r37)
            X.Tv8 r32 = new X.Tv8
            r33 = r0
            r35 = r25
            r32.<init>(r33, r34, r35, r36, r37)
            X.GXG r8 = new X.GXG
            r8.<init>(r0)
            X.GXH r7 = new X.GXH
            r7.<init>(r0)
            X.9Lf r6 = new X.9Lf
            r6.<init>(r0, r12)
            android.content.Context r3 = r0.requireContext()
            r2 = 2131961860(0x7f132804, float:1.9560429E38)
            java.lang.String r33 = r3.getString(r2)
            X.0qQ.A07(r33)
            r3 = 24
            X.9LZ r2 = new X.9LZ
            r2.<init>(r0, r3)
            r27 = r0
            r28 = r9
            r30 = r5
            r31 = r15
            r34 = r8
            r35 = r2
            r36 = r7
            r37 = r6
            X.C67368Mmk.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.TsA r2 = new X.TsA
            r44 = r2
            r47 = r9
            r49 = r1
            r50 = r13
            r51 = r14
            r53 = r10
            r54 = r11
            r55 = r23
            r56 = r12
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r0.A04 = r2
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0c40
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.0qQ.A0B(r3, r12)
            r1 = 36312930580432427(0x81026b0000062b, double:3.02778174727589E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x0c40
            X.GWz r3 = new X.GWz
            r3.<init>(r0)
        L_0x09a6:
            X.71m r3 = (X.C3252171m) r3
        L_0x09a8:
            X.0eM r1 = r0.A0u
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0c3c
            X.ISZ r5 = new X.ISZ
            r5.<init>(r0)
        L_0x09bb:
            X.GXI r10 = new X.GXI
            r1 = r22
            r10.<init>(r1, r0)
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0c38
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.GXi r1 = X.C52531GWi.A00(r1)
            com.instagram.common.session.UserSession r6 = r1.A02
            r1 = 36313068019386060(0x81028b000006cc, double:3.02786866422359E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x0c38
            com.instagram.common.session.UserSession r2 = r0.getSession()
            r6 = 42
            X.PmD r1 = new X.PmD
            r1.<init>(r0, r6)
            X.ISb r8 = new X.ISb
            r8.<init>(r1, r2)
        L_0x09ef:
            com.instagram.common.session.UserSession r6 = r0.getSession()
            r1 = 36319282837134434(0x81083200011c62, double:3.031798939992724E-306)
            boolean r6 = X.182.A06(r4, r6, r1)
            if (r6 == 0) goto L_0x0c34
            com.instagram.common.session.UserSession r6 = r0.getSession()
            boolean r6 = X.182.A06(r4, r6, r1)
            com.instagram.common.session.UserSession r7 = r0.getSession()
            r1 = 36319282837199971(0x81083200021c63, double:3.03179894003417E-306)
            boolean r9 = X.182.A06(r4, r7, r1)
            com.instagram.common.session.UserSession r7 = r0.getSession()
            r1 = 36600757813972966(0x82083200030fe6, double:3.2098048487541693E-306)
            long r1 = X.182.A01(r4, r7, r1)
            int r11 = (int) r1
            com.instagram.common.session.UserSession r7 = r0.getSession()
            r1 = 2342162292050762849(0x2081083200001c61, double:4.064977786907031E-152)
            boolean r1 = X.182.A06(r4, r7, r1)
            com.facebook.video.heroplayer.ipc.HeroScrollSetting r7 = new com.facebook.video.heroplayer.ipc.HeroScrollSetting
            r7.<init>(r11, r6, r9, r1)
        L_0x0a33:
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.TvE r6 = new X.TvE
            r6.<init>(r1)
            X.X3y r1 = r0.A0h
            r6.A01(r1)
            X.TsA r1 = r0.A04
            if (r1 != 0) goto L_0x0a4c
            java.lang.String r15 = "adapter"
        L_0x0a47:
            X.0qQ.A0F(r15)
            goto L_0x01d9
        L_0x0a4c:
            r6.A06 = r1
            java.lang.Object r1 = r61.getValue()
            X.GX4 r1 = (X.GX4) r1
            X.0qQ.A0B(r1, r12)
            r6.A08 = r1
            X.X9Q r1 = r0.A07
            java.lang.String r15 = "videoPlayerManager"
            if (r1 == 0) goto L_0x0a47
            r6.A0A = r1
            r6.A04 = r0
            r1 = r62
            r6.A02(r1)
            r1 = r20
            r6.A00(r1)
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            int r2 = r1.A01
            X.0eM r1 = r0.A0s
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0aeb
            r1 = r23
            X.Uiv[] r1 = new X.C15812Uiv[r1]
            X.Tvf r9 = X.C14411Tvf.THREE_BY_FOUR_GRID
        L_0x0a8a:
            X.TvF r2 = new X.TvF
            r2.<init>(r9)
            r1[r12] = r2
        L_0x0a91:
            r6.A0P = r1
            r6.A0D = r3
            r6.A0C = r5
            com.instagram.common.session.UserSession r5 = r0.getSession()
            X.0Tu r3 = X.0Tu.A06
            r1 = 36313544760756311(0x8102fa00000857, double:3.02817015738582E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            r6.A0K = r1
            com.instagram.common.session.UserSession r5 = r0.getSession()
            r1 = 36313544761018456(0x8102fa00040858, double:3.0281701575516015E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            r6.A0M = r1
            com.instagram.common.session.UserSession r5 = r0.getSession()
            r1 = 36313544761083993(0x8102fa00050859, double:3.0281701575930474E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            r6.A0L = r1
            r6.A09 = r10
            r6.A0E = r8
            com.instagram.common.session.UserSession r5 = r0.getSession()
            r1 = 37161856636616880(0x840683000500b0, double:3.56464600355779E-306)
            double r1 = X.182.A00(r4, r5, r1)
            r6.A00 = r1
            X.X9Q r1 = r0.A07
            if (r1 == 0) goto L_0x0a47
            boolean r1 = r1 instanceof X.WWE
            r6.A0J = r1
            r6.A02 = r7
            X.Tun r1 = r0.A01
            if (r1 != 0) goto L_0x0c2a
            java.lang.String r15 = "autoplayManagerConnector"
            goto L_0x0a47
        L_0x0aeb:
            if (r2 == 0) goto L_0x0af4
            r1 = r23
            X.Uiv[] r1 = new X.C15812Uiv[r1]
            X.Tvf r9 = X.C14411Tvf.ONE_BY_ONE
            goto L_0x0a8a
        L_0x0af4:
            X.01N r9 = X.0jo.A1H()
            com.instagram.common.session.UserSession r11 = r0.getSession()
            r1 = 36313544760756311(0x8102fa00000857, double:3.02817015738582E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 != 0) goto L_0x0b1e
            com.instagram.common.session.UserSession r11 = r0.getSession()
            r1 = 36321275701896418(0x810a02000024e2, double:3.033059235692825E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 != 0) goto L_0x0b1e
            X.UlI r1 = new X.UlI
            r1.<init>()
            r9.add(r1)
        L_0x0b1e:
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.2gm r1 = X.C226412gl.A00(r1)
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "default"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0b48
            X.Tvf r2 = X.C14411Tvf.THREE_BY_FOUR
        L_0x0b32:
            X.TvF r1 = new X.TvF
            r1.<init>(r2)
            r9.add(r1)
        L_0x0b3a:
            X.01N r2 = X.0jo.A1I(r9)
            X.Uiv[] r1 = new X.C15812Uiv[r12]
            java.lang.Object[] r1 = r2.toArray(r1)
            X.Uiv[] r1 = (X.C15812Uiv[]) r1
            goto L_0x0a91
        L_0x0b48:
            com.instagram.common.session.UserSession r11 = r0.getSession()
            r1 = 36317509015573704(0x810695000014c8, double:3.030677168095112E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 == 0) goto L_0x0c26
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.1Av r11 = X.1Au.A00(r1)
            X.0s0 r2 = r11.A18
            X.0YZ[] r13 = X.1Av.A8a
            r1 = 245(0xf5, float:3.43E-43)
            r1 = r13[r1]
            java.lang.Object r11 = r2.CDM(r11, r1)
            java.lang.String r11 = (java.lang.String) r11
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.1Av r1 = X.1Au.A00(r1)
            X.0xa r2 = r1.A01
            java.lang.String r1 = "explore_shimmer_media_grid_rows"
            int r13 = r2.getInt(r1, r12)
            X.Q22 r1 = new X.Q22
            r1.<init>()
            java.lang.reflect.Type r2 = r1.type
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.Object r1 = r1.A09(r11, r2)
            java.util.List r1 = (java.util.List) r1
            if (r11 == 0) goto L_0x0c26
            if (r1 == 0) goto L_0x0c26
            java.util.Iterator r14 = r1.iterator()
        L_0x0b97:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0b3a
            java.lang.Object r11 = r14.next()
            java.lang.String r11 = (java.lang.String) r11
            int r1 = r11.hashCode()
            switch(r1) {
                case -1840840991: goto L_0x0bab;
                case -1565001559: goto L_0x0bb6;
                case -1543854381: goto L_0x0bc1;
                case -1511300209: goto L_0x0bc4;
                case -1264747110: goto L_0x0bc7;
                case -1181136307: goto L_0x0bd2;
                case -1158856488: goto L_0x0bdd;
                case 399994740: goto L_0x0be8;
                case 429736678: goto L_0x0beb;
                case 780743447: goto L_0x0bf6;
                case 1922838692: goto L_0x0c01;
                default: goto L_0x0baa;
            }
        L_0x0baa:
            goto L_0x0b97
        L_0x0bab:
            java.lang.String r1 = "MEDIA_GRID"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_MEDIA_GRID
            goto L_0x0c0b
        L_0x0bb6:
            java.lang.String r1 = "ONE_BY_TWO_LEFT"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_ONE_BY_TWO_LEFT
            goto L_0x0c0b
        L_0x0bc1:
            java.lang.String r1 = "TWO_BY_TWO_PLAYLIST_RIGHT_WITH_FALLBACK"
            goto L_0x0c03
        L_0x0bc4:
            java.lang.String r1 = "TWO_BY_TWO_LEFT"
            goto L_0x0bf8
        L_0x0bc7:
            java.lang.String r1 = "ONE_BY_TWO_RIGHT"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_ONE_BY_TWO_RIGHT
            goto L_0x0c0b
        L_0x0bd2:
            java.lang.String r1 = "THREE_BY_FOUR"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_THREE_BY_FOUR
            goto L_0x0c0b
        L_0x0bdd:
            java.lang.String r1 = "ONE_BY_TWO_ROW"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_ONE_BY_TWO_ROW
            goto L_0x0c0b
        L_0x0be8:
            java.lang.String r1 = "TWO_BY_TWO_RIGHT"
            goto L_0x0c03
        L_0x0beb:
            java.lang.String r1 = "ONE_BY_TWO_LEFT_RIGHT"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_ONE_BY_TWO_LEFT_RIGHT
            goto L_0x0c0b
        L_0x0bf6:
            java.lang.String r1 = "TWO_BY_TWO_AD_LEFT_WITH_FALLBACK"
        L_0x0bf8:
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_TWO_BY_TWO_LEFT
            goto L_0x0c0b
        L_0x0c01:
            java.lang.String r1 = "TWO_BY_TWO_AD_RIGHT_WITH_FALLBACK"
        L_0x0c03:
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0b97
            X.Tvf r1 = X.C14411Tvf.MEMORY_GRID_TWO_BY_TWO_RIGHT
        L_0x0c0b:
            X.TvF r2 = new X.TvF
            r2.<init>(r1)
            java.lang.String r1 = "MEDIA_GRID"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0c21
            r1 = 0
        L_0x0c19:
            if (r1 >= r13) goto L_0x0b97
            r9.add(r2)
            int r1 = r1 + 1
            goto L_0x0c19
        L_0x0c21:
            r9.add(r2)
            goto L_0x0b97
        L_0x0c26:
            X.Tvf r2 = X.C14411Tvf.ONE_BY_TWO
            goto L_0x0b32
        L_0x0c2a:
            r6.A03 = r1
            X.GWd r1 = r0.A0I
            if (r1 != 0) goto L_0x0c83
            java.lang.String r15 = "gridMediaLoadingTracker"
            goto L_0x0a47
        L_0x0c34:
            r7 = r25
            goto L_0x0a33
        L_0x0c38:
            r8 = r25
            goto L_0x09ef
        L_0x0c3c:
            r5 = r25
            goto L_0x09bb
        L_0x0c40:
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0c7f
            com.instagram.common.session.UserSession r3 = r0.getSession()
            r1 = 36598906683460918(0x82068300090d36, double:3.208634186364446E-306)
            long r2 = X.182.A01(r4, r3, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5 = 0
            if (r1 == 0) goto L_0x0c61
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0c7f
        L_0x0c61:
            com.instagram.common.session.UserSession r3 = r0.getSession()
            r1 = 36598906683526455(0x820683000a0d37, double:3.208634186405892E-306)
            long r2 = X.182.A01(r4, r3, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            if (r1 == 0) goto L_0x0c78
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0c7f
        L_0x0c78:
            X.ISa r3 = new X.ISa
            r3.<init>(r0)
            goto L_0x09a6
        L_0x0c7f:
            r3 = r25
            goto L_0x09a8
        L_0x0c83:
            r6.A0B = r1
            X.TpO r1 = new X.TpO
            r1.<init>(r6)
            r0.A06 = r1
            java.lang.String r1 = r0.A0W
            r5 = 0
            if (r1 != 0) goto L_0x0cc3
            androidx.fragment.app.FragmentActivity r28 = r0.requireActivity()
            X.0hq r2 = r0.mFragmentManager
            if (r2 == 0) goto L_0x0f12
            com.instagram.common.session.UserSession r31 = r0.getSession()
            X.TpO r1 = r0.A06
            if (r1 != 0) goto L_0x0ca8
            java.lang.String r0 = "grid"
            X.0qQ.A0F(r0)
            goto L_0x01d9
        L_0x0ca8:
            X.TsA r1 = r1.A0E
            X.2uE r5 = new X.2uE
            r27 = r5
            r29 = r0
            r30 = r2
            r32 = r25
            r33 = r0
            r34 = r1
            r35 = r0
            r36 = r12
            r37 = r23
            r38 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0cc3:
            com.instagram.common.session.UserSession r6 = r0.getSession()
            r1 = 36315649294863818(0x8104e400020dca, double:3.029501073229686E-306)
            boolean r1 = X.182.A06(r3, r6, r1)
            if (r1 == 0) goto L_0x0cd8
            if (r5 == 0) goto L_0x0cd8
            X.HiX r1 = r0.A0m
            r5.A08 = r1
        L_0x0cd8:
            r0.A0L = r5
            if (r5 == 0) goto L_0x0ce1
            X.5eN r1 = r0.A0n
            r5.EU9(r1)
        L_0x0ce1:
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r0.getSession()
            r1 = 23592967(0x1680007, float:4.261169E-38)
            X.2nK r5 = new X.2nK
            r5.<init>(r3, r0, r2, r1)
            X.0gy r29 = X.AnonymousClass07i.A00(r0)
            android.content.Context r28 = r0.requireContext()
            com.instagram.common.session.UserSession r31 = r0.getSession()
            java.lang.Object r6 = r61.getValue()
            X.GX4 r6 = (X.GX4) r6
            X.TpO r3 = r0.A06
            java.lang.String r11 = "grid"
            if (r3 == 0) goto L_0x0d0e
            X.X9Q r2 = r0.A07
            if (r2 != 0) goto L_0x0d13
            r11 = r15
        L_0x0d0e:
            X.0qQ.A0F(r11)
            goto L_0x01d9
        L_0x0d13:
            X.GXJ r1 = new X.GXJ
            r27 = r1
            r30 = r0
            r32 = r3
            r33 = r6
            r34 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r0.A05 = r1
            r1 = r24
            r0.registerLifecycleListener(r1)
            android.content.Context r31 = r0.requireContext()
            com.instagram.common.session.UserSession r35 = r0.getSession()
            androidx.fragment.app.FragmentActivity r33 = r0.requireActivity()
            X.7QE r2 = r0.A0g
            X.7N7 r1 = new X.7N7
            r30 = r1
            r32 = r0
            r34 = r0
            r36 = r2
            r37 = r0
            r38 = r25
            r39 = r43
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.2jd r3 = new X.2jd
            r3.<init>()
            r3.A0E(r5)
            X.2uG r2 = r0.A0L
            if (r2 == 0) goto L_0x0d59
            r3.A0E(r2)
        L_0x0d59:
            X.2qT r2 = r0.A0Q
            if (r2 == 0) goto L_0x0ee3
            r3.A0E(r2)
            r2 = r21
            r3.A0E(r2)
            r3.A0E(r1)
            X.GXJ r1 = r0.A05
            if (r1 != 0) goto L_0x0d70
            java.lang.String r18 = "clipsHeroDismissController"
            goto L_0x069e
        L_0x0d70:
            r3.A0E(r1)
            java.lang.Object r1 = r65.getValue()
            X.2lJ r1 = (X.C228312lJ) r1
            if (r1 == 0) goto L_0x0d7e
            r3.A0E(r1)
        L_0x0d7e:
            X.TpO r1 = r0.A06
            if (r1 != 0) goto L_0x0d86
            r18 = r11
            goto L_0x069e
        L_0x0d86:
            r0.registerLifecycleListenerSet(r3)
            X.TpO r1 = r0.A06
            if (r1 == 0) goto L_0x0d0e
            X.JQy r10 = r1.A0D
            com.instagram.common.session.UserSession r9 = r0.getSession()
            java.lang.String r8 = r0.A0V
            if (r8 == 0) goto L_0x01d6
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            com.instagram.explore.topiccluster.ExploreTopicCluster r7 = r1.A00
            boolean r6 = r1.A03
            X.2qi r3 = r0.A0P
            if (r3 != 0) goto L_0x0da7
            java.lang.String r11 = "quickPromotionDelegate"
            goto L_0x0d0e
        L_0x0da7:
            X.GWd r2 = r0.A0I
            if (r2 != 0) goto L_0x0daf
            java.lang.String r11 = "gridMediaLoadingTracker"
            goto L_0x0d0e
        L_0x0daf:
            r1 = r23
            X.0qQ.A0B(r9, r1)
            X.GXK r1 = new X.GXK
            r30 = r1
            r31 = r22
            r32 = r9
            r33 = r20
            r34 = r10
            r35 = r7
            r36 = r2
            r38 = r3
            r39 = r8
            r40 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A0K = r1
            X.TpO r2 = r0.A06
            if (r2 == 0) goto L_0x0d0e
            X.2js r1 = r0.A02
            if (r1 == 0) goto L_0x0ed7
            X.3jg[] r1 = new X.C249403jg[]{r5, r1}
            r2.A09(r1)
            X.TpO r2 = r0.A06
            if (r2 == 0) goto L_0x0d0e
            X.57H r1 = r0.A0O
            if (r1 != 0) goto L_0x0dea
            java.lang.String r11 = "tailFetchPerfLogger"
            goto L_0x0d0e
        L_0x0dea:
            X.3jg[] r1 = new X.C249403jg[]{r1}
            r2.A09(r1)
            java.lang.Object r1 = r65.getValue()
            if (r1 == 0) goto L_0x0e04
            X.TpO r2 = r0.A06
            if (r2 == 0) goto L_0x0d0e
            X.3jg r1 = (X.C249403jg) r1
            X.3jg[] r1 = new X.C249403jg[]{r1}
            r2.A09(r1)
        L_0x0e04:
            X.90i r1 = r0.A0D
            if (r1 == 0) goto L_0x04a8
            X.0eM r14 = r0.A0w
            java.lang.Object r1 = r14.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0ed4
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.1PG r5 = X.1PG.A00(r1)
            X.0qQ.A07(r5)
            X.GXS r3 = X.GXS.A00
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.1PB r1 = r0.A18
            X.2vA r1 = r5.A03(r1)
            X.2vG r7 = r3.A00(r2, r1, r0, r0)
            com.instagram.common.session.UserSession r2 = r0.getSession()
            X.0qQ.A0B(r2, r12)
            X.GWv r1 = new X.GWv
            r1.<init>(r2, r7)
            r0.A03 = r1
        L_0x0e42:
            com.instagram.common.session.UserSession r5 = r0.getSession()
            java.lang.String r2 = r0.getSessionId()
            X.0qQ.A0B(r5, r12)
            X.1L1 r1 = new X.1L1
            r1.<init>()
            r1.A00 = r2
            X.1L5 r3 = X.1L0.A01(r5, r1)
            r1 = 36318140376487834(0x810728000b179a, double:3.0310764432794943E-306)
            boolean r50 = X.182.A06(r4, r5, r1)
            r1 = 36318140377012128(0x810728001317a0, double:3.03107644361106E-306)
            boolean r6 = X.182.A06(r4, r5, r1)
            r1 = 2342161149591230375(0x20810728001b17a7, double:4.064009078135615E-152)
            boolean r52 = X.182.A06(r4, r5, r1)
            r1 = 22
            X.Inz r8 = new X.Inz
            r8.<init>(r1, r0, r5, r3)
            r1 = 47
            X.Phg r2 = new X.Phg
            r2.<init>(r1, r3, r5)
            r9 = 13
            X.GL3 r1 = new X.GL3
            r1.<init>(r9, r3, r5, r6)
            X.GWs r37 = new X.GWs
            r44 = r37
            r45 = r0
            r46 = r3
            r47 = r8
            r48 = r2
            r49 = r1
            r51 = r6
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52)
            android.content.Context r28 = r0.requireContext()
            com.instagram.common.session.UserSession r31 = r0.getSession()
            X.90i r10 = r0.A0D
            if (r10 == 0) goto L_0x04a8
            java.lang.String r38 = r0.getModuleName()
            java.lang.String r13 = r0.A0W
            java.lang.String r9 = r0.A0V
            if (r9 == 0) goto L_0x01d6
            java.lang.Object r8 = r61.getValue()
            X.GWW r8 = (X.GWW) r8
            java.lang.Object r5 = r65.getValue()
            X.2lJ r5 = (X.C228312lJ) r5
            java.lang.Object r1 = r14.getValue()
            X.0qQ.A07(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r42 = r1.booleanValue()
            X.GWv r11 = r0.A03
            X.Tun r6 = r0.A01
            if (r6 != 0) goto L_0x0359
            java.lang.String r11 = "autoplayManagerConnector"
            goto L_0x0d0e
        L_0x0ed4:
            r7 = 0
            goto L_0x0e42
        L_0x0ed7:
            java.lang.String r18 = "scrollableNavigationHelper"
            goto L_0x069e
        L_0x0edb:
            java.lang.String r18 = "videoPlayerManager"
            goto L_0x069e
        L_0x0edf:
            r18 = r16
            goto L_0x069e
        L_0x0ee3:
            java.lang.String r18 = "quickPromotionTooltipsController"
            goto L_0x069e
        L_0x0ee7:
            java.lang.String r18 = "quickPromotionDelegate"
            goto L_0x069e
        L_0x0eeb:
            X.2wB r1 = new X.2wB
            r1.<init>()
            goto L_0x0492
        L_0x0ef2:
            X.GXV r1 = new X.GXV
            r1.<init>()
            r3.A0P = r1
            goto L_0x0494
        L_0x0efb:
            java.lang.String r16 = "exploreHomeViewpointHelper"
            goto L_0x04a8
        L_0x0eff:
            X.TuJ r1 = r2.A01
            X.GXR r3 = new X.GXR
            r3.<init>(r2, r1)
            r6.A00 = r3
            goto L_0x036b
        L_0x0f0a:
            java.lang.String r0 = "Cannot set HeaderController without a topicCluster"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0f12:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0f1a:
            java.lang.String r0 = "ExploreFragment.ARGUMENT_CONFIG is required in ExploreFragment"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            r1 = -1320582646(0xffffffffb149820a, float:-2.9323268E-9)
            r0 = r26
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32L.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate;
        int A022 = AnonymousClass0fD.A02(-1436834244);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 0);
        JSr jSr = this.A0B;
        if (jSr == null) {
            str = "headerController";
        } else {
            ViewGroup viewGroup2 = viewGroup;
            jSr.D6y(layoutInflater, viewGroup);
            str = "grid";
            if (getActivity() == null || viewGroup == null) {
                if (this.A06 != null) {
                    inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
                }
            } else if (this.A06 != null) {
                inflate = 2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.layout_grid_recyclerview_wrapper, false, true);
            }
            AnonymousClass0fD.A09(-1178653587, A022);
            return inflate;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-566555920);
        super.onDestroy();
        C52464GTq A002 = GM4.A00(getSession());
        Long l = A002.A05;
        if (l != null) {
            A002.A01 += A002.A08.now() - l.longValue();
        }
        A002.A03 = null;
        C14394TvN tvN = this.A0c;
        if (tvN == null) {
            0qQ.A0F("commonViewControl");
            throw AnonymousClass00P.createAndThrow();
        }
        1wY.A00(tvN.A06).A08(tvN.A01.getModuleName());
        1Ng A003 = AnonymousClass1Nd.A00(getSession());
        A003.A02(this.A12, C57066INg.class);
        A003.A02(this.A13, C2370836g.class);
        A003.A02(this.A11, AnonymousClass377.class);
        C233812wV r0 = this.A0R;
        if (r0 != null) {
            r0.A0B();
        }
        AnonymousClass0fD.A09(389133246, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1239787221);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof IgFragmentActivity) {
            requireActivity.unregisterOnActivityResultListener(this.A14);
        }
        A00();
        super.onDestroyView();
        GX1 gx1 = this.A0S;
        String str = "grid";
        if (gx1 != null) {
            C14074TpO tpO = this.A06;
            if (tpO != null) {
                C249403jg r1 = new C249403jg[]{gx1}[0];
                C228172ku r0 = tpO.A0G;
                0qQ.A0B(r1, 0);
                r0.A01.remove(r1);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        2dZ.A0t.A03(requireActivity()).A0N.setVisibility(8);
        C14074TpO tpO2 = this.A06;
        if (tpO2 != null) {
            tpO2.A01();
            JSr jSr = this.A0B;
            if (jSr == null) {
                str = "headerController";
            } else {
                jSr.onDestroyView();
                C14394TvN tvN = this.A0c;
                if (tvN == null) {
                    str = "commonViewControl";
                } else {
                    14i.A06(tvN.A05);
                    1xC r2 = 1xC.A01;
                    r2.A03(tvN.A04, AnonymousClass3LC.class);
                    r2.A03(tvN.A02, 1xG.class);
                    AnonymousClass1Nd.A00(tvN.A06).A02(tvN.A03, FW5.class);
                    C55972Hqd hqd = this.A0U;
                    if (hqd != null) {
                        synchronized (hqd) {
                            Set<View> set = hqd.A02;
                            for (View EEi : set) {
                                hqd.A01.EEi(EEi);
                            }
                            set.clear();
                        }
                    }
                    C74486Pvg pvg = this.A0N;
                    if (pvg != null) {
                        pvg.onDestroyView();
                    }
                    C60111Jfs jfs = this.A0M;
                    if (jfs != null) {
                        C318136oS A002 = C318116oQ.A00(jfs);
                        C51645Fy4 fy4 = new C51645Fy4(jfs, (AnonymousClass4D7) null, 44);
                        1Eo.A03(AnonymousClass05K.A00, 19B.A00, fy4, A002);
                    }
                    AnonymousClass0fD.A09(-816058742, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-561029359);
        C14074TpO tpO = this.A06;
        String str = "grid";
        if (tpO != null) {
            tpO.A0D.AGS();
            X9Q x9q = this.A07;
            if (x9q == null) {
                str = "videoPlayerManager";
            } else {
                x9q.ECU();
                AnonymousClass32L.super.onPause();
                A00();
                JSr jSr = this.A0B;
                if (jSr == null) {
                    str = "headerController";
                } else {
                    jSr.onPause();
                    C14394TvN tvN = this.A0c;
                    if (tvN == null) {
                        str = "commonViewControl";
                    } else {
                        UserSession userSession = tvN.A06;
                        1wY.A00(userSession);
                        11Z.A00();
                        11Z.A00();
                        FragmentActivity fragmentActivity = tvN.A00;
                        1OP r0 = 1OP.$redex_init_class;
                        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(fragmentActivity);
                        if (A042 != null) {
                            A042.A0S();
                        }
                        1Bk r02 = ((AnonymousClass4X2) userSession.A01(AnonymousClass4X2.class, new MMF(userSession, 35))).A00;
                        if (r02 != null) {
                            r02.A09();
                        }
                        C227762js r2 = this.A02;
                        if (r2 == null) {
                            str = "scrollableNavigationHelper";
                        } else {
                            C14074TpO tpO2 = this.A06;
                            if (tpO2 != null) {
                                C238133Ar r1 = tpO2.A06;
                                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                r2.A09(r1);
                                AnonymousClass1Qz.A00(getSession()).EEn(this.A10);
                                C52464GTq A002 = GM4.A00(getSession());
                                Long l = A002.A05;
                                if (l != null) {
                                    A002.A01 += A002.A08.now() - l.longValue();
                                }
                                AnonymousClass584.A00(getSession()).A01(new AnonymousClass58F((Map) null, new 0eP(AnonymousClass589.EXPLORE, AnonymousClass58B.USER_DID_NAVIGATE)));
                                AnonymousClass3KG r12 = this.A0Z;
                                str = "screenshotDetector";
                                if (r12 != null) {
                                    r12.A06(this.A0a);
                                    AnonymousClass3KG r03 = this.A0Z;
                                    if (r03 != null) {
                                        r03.A04();
                                        this.A0a = null;
                                        AnonymousClass0fD.A09(-1118671192, A022);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        String str2;
        List list;
        int A022 = AnonymousClass0fD.A02(1866034560);
        super.onResume();
        C243453Yv r0 = this.A0A;
        if (r0 == null) {
            str = "exploreQuickPromotionHelper";
        } else {
            r0.A00((C62320sa) null);
            C319996rZ.A00(getSession()).A01(requireActivity());
            JSr jSr = this.A0B;
            str = "headerController";
            if (jSr != null) {
                jSr.onResume();
                JSr jSr2 = this.A0B;
                if (jSr2 != null) {
                    C227762js r1 = this.A02;
                    if (r1 == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        jSr2.AJA(r1, new C14325Tu3(this));
                        C14074TpO tpO = this.A06;
                        str = "grid";
                        if (tpO != null) {
                            tpO.A0D.EHL();
                            C14394TvN tvN = this.A0c;
                            if (tvN == null) {
                                str = "commonViewControl";
                            } else {
                                UserSession userSession = tvN.A06;
                                AnonymousClass3K8 A002 = AnonymousClass3K7.A00(userSession);
                                AnonymousClass0iw r4 = tvN.A01;
                                A002.A00(r4);
                                1wY.A00(userSession);
                                11Z.A00();
                                11Z.A00();
                                FragmentActivity fragmentActivity = tvN.A00;
                                1OP r02 = 1OP.$redex_init_class;
                                AnonymousClass3K2 A042 = AnonymousClass3K2.A04(fragmentActivity);
                                if (A042 != null && A042.A0Z()) {
                                    A042.A0W((RectF) null, (RectF) null, r4, (C51914G7i) null);
                                }
                                C52464GTq A003 = GM4.A00(getSession());
                                A003.A05 = Long.valueOf(A003.A08.now());
                                AnonymousClass1Qz.A00(getSession()).AAX(this.A10);
                                C14227TsA tsA = this.A04;
                                if (tsA == null) {
                                    str = "adapter";
                                } else {
                                    tsA.A04 = true;
                                    if (Q23.A00(getSession()).A00) {
                                        C14074TpO tpO2 = this.A06;
                                        if (tpO2 != null) {
                                            tpO2.A02();
                                            Q23.A00(getSession()).A00 = false;
                                        }
                                    }
                                    C52529GWg gWg = (C52529GWg) this.A0t.getValue();
                                    if (gWg.A04()) {
                                        gWg.A09.clear();
                                        gWg.A08.clear();
                                        Object value = gWg.A0C.getValue();
                                        0qQ.A07(value);
                                        if (((Boolean) value).booleanValue() && (str2 = gWg.A01) != null) {
                                            UserSession userSession2 = gWg.A04;
                                            if (C52550GXb.A00(userSession2).A00.containsKey(str2) && (list = (List) C52550GXb.A00(userSession2).A00.get(str2)) != null) {
                                                ArrayList<AnonymousClass3OA> arrayList = new ArrayList<>();
                                                for (Object next : list) {
                                                    if (next instanceof AnonymousClass3OA) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                                ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
                                                for (AnonymousClass3OA r03 : arrayList) {
                                                    arrayList2.add(r03.A0K.getId());
                                                }
                                                for (Map.Entry entry : 0Yt.A0B(gWg.A0A).entrySet()) {
                                                    C52551GXc A004 = C52550GXb.A00(userSession2);
                                                    Object key = entry.getKey();
                                                    0qQ.A0B(key, 0);
                                                    List list2 = (List) A004.A00.get(key);
                                                    Boolean bool = null;
                                                    if (list2 != null) {
                                                        ArrayList<AnonymousClass3OA> arrayList3 = new ArrayList<>();
                                                        for (Object next2 : list2) {
                                                            if (next2 instanceof AnonymousClass3OA) {
                                                                arrayList3.add(next2);
                                                            }
                                                        }
                                                        ArrayList arrayList4 = new ArrayList(0Yv.A1E(arrayList3, 10));
                                                        for (AnonymousClass3OA r04 : arrayList3) {
                                                            arrayList4.add(r04.A0K.getId());
                                                        }
                                                        bool = Boolean.valueOf(00k.A0t(00k.A0l(arrayList4, arrayList2)));
                                                    }
                                                    if (0qQ.A0K(bool, true)) {
                                                        entry.getKey();
                                                        C52529GWg.A01(gWg, (String) entry.getKey());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    AnonymousClass3KG r42 = this.A0Z;
                                    str = "screenshotDetector";
                                    if (r42 != null) {
                                        AnonymousClass3KQ A005 = AnonymousClass3KG.A00(new GXY(this));
                                        r42.A03();
                                        AnonymousClass3KG r05 = this.A0Z;
                                        if (r05 != null) {
                                            r05.A05(A005);
                                            this.A0a = A005;
                                            C14358Tun tun = this.A01;
                                            if (tun == null) {
                                                str = "autoplayManagerConnector";
                                            } else {
                                                UserSession A032 = getSession();
                                                0qQ.A0B(A032, 0);
                                                C14077TpR A006 = tun.A00(A032);
                                                if (A006 != null) {
                                                    A006.A00();
                                                }
                                                View view = this.mView;
                                                if (view != null) {
                                                    view.post(new C67379Mmv(this));
                                                }
                                                AnonymousClass0fD.A09(1591652767, A022);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1568314126);
        AnonymousClass32L.super.onStart();
        C638918c.A01(C61170le.A00).A0S((C67438Mnt) this.A0y.getValue());
        AnonymousClass0fD.A09(175455069, A022);
    }
}
