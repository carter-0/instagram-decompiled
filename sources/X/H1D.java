package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class H1D extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C289875eN, C320316sB {
    public static final String __redex_internal_original_name = "RemixPivotPageFragment";
    public View A00;
    public ViewGroup A01;
    public ComposeView A02;
    public C381809cM A03;
    public AppBarLayout A04;
    public C54190H2k A05;
    public 1Xj A06;
    public 1Xj A07;
    public C53086GiK A08;
    public View A09;
    public AnonymousClass2uE A0A;
    public C249763kK A0B;
    public C320516sV A0C;
    public final String A0D = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(C58712IwL.A01(this, 8));
    public final AnonymousClass0eM A0F = DbS.A0I(C58712IwL.A01(this, 11), C58712IwL.A01(this, 10), C58690Ivz.A00((Object) null, this, 32), DbS.A0z(C52998Ggp.class));
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final void D3i(User user) {
        0qQ.A0B(user, 0);
        C52273GLp.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A0G), user.getId(), "remix_pivot_page", (String) null, ModalActivity.A08);
    }

    public final void D46(C267324bN r12, int i) {
        0qQ.A0B(r12, 0);
        AnonymousClass0eM r3 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        1Xj r7 = r12.A02;
        if (r7 != null) {
            String id = r12.getId();
            C249763kK r8 = this.A0B;
            if (r8 == null) {
                0qQ.A0F("pivotPageSessionProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            C52086GEg.A0Y(this, A0l, r7, r8, id, i);
            1Xj r0 = r12.A02;
            if (r0 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (r0.A5U()) {
                IgFragmentFactoryImpl.A00();
                1Xj r02 = r12.A02;
                if (r02 != null) {
                    String A30 = r02.A30();
                    if (A30 != null) {
                        F3W f3w = new F3W();
                        f3w.A0B = A30;
                        C309516Yo A0P = DbZ.A0P(this, r3);
                        A0P.A0D(f3w.A01());
                        A0P.A04();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else {
                C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.REMIX_REEL, AnonymousClass7TE.A0l(r3));
                A0i.A1C = r12.getId();
                A0i.A1F = this.A0D;
                A0i.A1c = false;
                C250563lf.A0X(requireActivity(), A0i.A00(), AnonymousClass7TE.A0l(r3));
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final /* synthetic */ void DyE() {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eu5(C56801ICy.A00(this, 23), true);
        Context requireContext = requireContext();
        this.A0G.getValue();
        r3.setTitle(AnonymousClass7TE.A16(requireContext, 2131973123));
    }

    public final String getModuleName() {
        return "clips_remix_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbU.A0C(view, R.id.use_in_camera_button_scene_root);
        this.A04 = (AppBarLayout) view.requireViewById(R.id.app_bar_layout);
        View requireViewById = view.requireViewById(R.id.header);
        this.A09 = requireViewById;
        if (requireViewById == null) {
            str = "header";
        } else {
            requireViewById.setVisibility(8);
            View requireViewById2 = view.requireViewById(R.id.ghost_header);
            this.A00 = requireViewById2;
            if (requireViewById2 == null) {
                str = "ghostHeader";
            } else {
                requireViewById2.setVisibility(0);
                DbT.A1F(view, R.id.use_in_camera_button_scene_root, 8);
                ComposeView composeView = (ComposeView) view.requireViewById(R.id.reels_pivot_header_compose_view);
                this.A02 = composeView;
                if (composeView != null) {
                    composeView.setViewCompositionStrategy(GTZ.A00);
                }
                ComposeView composeView2 = this.A02;
                if (composeView2 != null) {
                    composeView2.setContent(AnonymousClass5PI.A03(new JGB(this, 15), -1457628273));
                }
                C51969G9p.A15(getViewLifecycleOwner(), ((C52998Ggp) this.A0F.getValue()).A00, C59097J6f.A01(this, 34), 24);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r5, int i) {
        AnonymousClass7TG.A1T(r5, view, motionEvent);
        1Xj r1 = r5.A02;
        if (r1 == null) {
            return false;
        }
        AnonymousClass2uE r0 = this.A0A;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r1, i);
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.H2k, X.6uZ, X.MYU] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(965018071);
        H1D.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id");
        if (string != null) {
            String string2 = requireArguments.getString("media_tap_token");
            if (string2 != null) {
                int i = requireArguments.getInt(AnonymousClass000.A00(1875));
                String string3 = requireArguments.getString("media_id");
                if (string3 != null) {
                    this.A03 = new C381809cM(string, string2, string3, i, 1);
                    AnonymousClass0eM r7 = this.A0G;
                    1E8 A0d = DbX.A0d(r7);
                    C381809cM r0 = this.A03;
                    String str = "arguments";
                    if (r0 != null) {
                        this.A07 = A0d.A02(r0.A04);
                        2el A002 = 2el.A00();
                        ? r1 = new C321676uZ(DbW.A0S(r7, 1), "remix_pivot_page", 31800132);
                        this.A05 = r1;
                        DbY.A0v(requireContext(), r1, this, r7);
                        C54190H2k h2k = this.A05;
                        String str2 = "remixPivotPagePerfLogger";
                        if (h2k != null) {
                            C381809cM r02 = this.A03;
                            if (r02 != null) {
                                h2k.A0U(r02.A02);
                                Context requireContext = requireContext();
                                UserSession A0l = AnonymousClass7TE.A0l(r7);
                                C54190H2k h2k2 = this.A05;
                                if (h2k2 != null) {
                                    UserSession A0l2 = AnonymousClass7TE.A0l(r7);
                                    C381809cM r03 = this.A03;
                                    if (r03 != null) {
                                        C320496sT r8 = new C320496sT(A0l2, A002, this, r03.A02);
                                        boolean A062 = 182.A06(0Tu.A05, DbT.A0X(r7), 36328229254020191L);
                                        this.A0C = new C320516sV(requireContext, h2k2, new C320486sS(0.5625f, false, false), this, r8, this, A0l, (C294875nB) null, (String) null, (String) null, false, A062);
                                        ((C229352nF) this.A0E.getValue()).A02(this.A0D);
                                        C227622jd r9 = new C227622jd();
                                        AnonymousClass0eM r82 = this.A0F;
                                        C52998Ggp ggp = (C52998Ggp) r82.getValue();
                                        C320516sV r12 = this.A0C;
                                        str = "clipsGridAdapter";
                                        if (r12 != null) {
                                            C53086GiK giK = new C53086GiK(this, A002, r12, ggp);
                                            r9.A0E(giK);
                                            this.A08 = giK;
                                            this.A0B = 1L2.A00();
                                            FragmentActivity requireActivity = requireActivity();
                                            0hq parentFragmentManager = getParentFragmentManager();
                                            UserSession A0l3 = AnonymousClass7TE.A0l(r7);
                                            C249763kK r72 = this.A0B;
                                            if (r72 == null) {
                                                str2 = "pivotPageSessionProvider";
                                            } else {
                                                C320516sV r13 = this.A0C;
                                                if (r13 != null) {
                                                    AnonymousClass2uE r132 = new AnonymousClass2uE(requireActivity, this, parentFragmentManager, A0l3, (AnonymousClass57N) null, this, r13, r72, true, true, false);
                                                    r132.A0B = this;
                                                    r9.A0E(r132);
                                                    this.A0A = r132;
                                                    registerLifecycleListenerSet(r9);
                                                    ((C52998Ggp) r82.getValue()).A03.A01.A04((Long) null, (String) null, 0sn.A00, false);
                                                    C54190H2k h2k3 = this.A05;
                                                    if (h2k3 != null) {
                                                        h2k3.A00.A08((String) null);
                                                        AnonymousClass0fD.A09(196341032, A022);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                throw AnonymousClass7TE.A0w("tapped media ID cannot be null");
            }
            throw AnonymousClass7TE.A0w("Media tap token cannot be null");
        }
        throw AnonymousClass7TE.A0w("Media ID cannot be null");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1219013444);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-454173503, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(788454014);
        super.onDestroy();
        C54190H2k h2k = this.A05;
        if (h2k == null) {
            0qQ.A0F("remixPivotPagePerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        h2k.A0K("has_user_interacted", true);
        h2k.A0J("interaction_type", "exit_pivot_page");
        ((C229352nF) this.A0E.getValue()).A07(this.A0D);
        AnonymousClass0fD.A09(-1871856834, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-587588544);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(-1100887909, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1659821969);
        super.onResume();
        if (this.A07 != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0G);
            1Xj r5 = this.A07;
            if (r5 != null) {
                C381809cM r1 = this.A03;
                if (r1 == null) {
                    0qQ.A0F("arguments");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str = r1.A03;
                int i = r1.A01;
                String str2 = r1.A02;
                C51972G9s.A1B(A0l, str);
                0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(this, A0l, str2, 6), "instagram_organic_clips_remix_page_impression");
                C51965G9l.A1M(A0e, "clips_remix_page");
                String A30 = r5.A30();
                if (A30 != null) {
                    G9t.A1J(A0e, A30);
                    C51965G9l.A1C((AnonymousClass0Ac) null, A0e);
                    C51965G9l.A1F(A0e, AnonymousClass7TE.A10(str2));
                    User A2A = r5.A2A(A0l);
                    if (A2A != null) {
                        A0e.AAE(C263944Ny.A00(A2A.getId()), "media_author_id");
                        C51970G9q.A19(A0e, (long) i);
                        C51965G9l.A1N(A0e, str);
                        C51974G9v.A0o(A0e, r5);
                        AnonymousClass7TH.A0V(A0e);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-509288311, A022);
                throw A0y;
            }
        }
        AnonymousClass0fD.A09(1438415607, A022);
    }
}
