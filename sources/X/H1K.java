package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class H1K extends AnonymousClass4DH implements AnonymousClass4DU, C289875eN, C320316sB {
    public static final String __redex_internal_original_name = "PivotPageDefaultClipsGridFragment";
    public TextView A00;
    public ShimmerFrameLayout A01;
    public ClipsViewerSource A02;
    public AnonymousClass2uE A03;
    public C320516sV A04;
    public 2el A05;
    public C249763kK A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new MMH(this, 45));
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D;

    public final void A00(AnonymousClass0Ud r6) {
        0qQ.A0B(r6, 0);
        C52991Ggi ggi = (C52991Ggi) this.A0D.getValue();
        AnonymousClass4D7 A0t = C51975G9x.A0t(ggi.A01);
        ggi.A01 = C51966G9m.A1L(new C66188MGz((Object) r6, (Object) ggi, A0t, 11), C318116oQ.A00(ggi));
    }

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final void D3i(User user) {
        0qQ.A0B(user, 0);
        ClipsViewerSource clipsViewerSource = this.A02;
        if (clipsViewerSource == null) {
            0qQ.A0F("clipsViewerSource");
            throw AnonymousClass00P.createAndThrow();
        } else if (clipsViewerSource.ordinal() == 100) {
            C52273GLp.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A0C), user.getId(), "clips_template_pivot_page", (String) null, ModalActivity.A08);
        }
    }

    public final void D46(C267324bN r12, int i) {
        String str;
        0qQ.A0B(r12, 0);
        AnonymousClass0eM r3 = this.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        1Xj r7 = r12.A02;
        if (r7 != null) {
            String id = r12.getId();
            C249763kK r8 = this.A06;
            if (r8 == null) {
                str = "pivotPageSessionProvider";
            } else {
                C52086GEg.A0Y(this, A0l, r7, r8, id, i);
                1Xj r1 = r12.A02;
                if (r1 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (r1.A5U()) {
                    IgFragmentFactoryImpl.A00();
                    String A30 = r1.A30();
                    if (A30 != null) {
                        F3W f3w = new F3W();
                        f3w.A0B = A30;
                        C309516Yo A0P = DbZ.A0P(this, r3);
                        A0P.A0D(f3w.A01());
                        A0P.A04();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else {
                    UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                    ClipsViewerSource clipsViewerSource = this.A02;
                    if (clipsViewerSource == null) {
                        str = "clipsViewerSource";
                    } else {
                        C270634h3 A0i = C51965G9l.A0i(clipsViewerSource, A0l2);
                        A0i.A1C = r12.getId();
                        String str2 = this.A08;
                        if (str2 == null) {
                            str = "gridKey";
                        } else {
                            A0i.A1F = str2;
                            A0i.A1c = false;
                            C250563lf.A0X(requireActivity(), A0i.A00(), AnonymousClass7TE.A0l(r3));
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final void DyE() {
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.clips_grid);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        C320516sV r0 = this.A04;
        String str = "clipsGridAdapter";
        if (r0 != null) {
            C51971G9r.A14(gridLayoutManager, r0);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.A15(new C3251871j(recyclerView.A0D, new ISY(this, 6), C3251771i.A06, false, false));
            C51972G9s.A13(this, recyclerView);
            C320516sV r02 = this.A04;
            if (r02 != null) {
                recyclerView.setAdapter(r02.A0I);
                0qQ.A07(requireViewById);
                2el r03 = this.A05;
                if (r03 == null) {
                    str = "viewpointManager";
                } else {
                    Dba.A0z(recyclerView, r03, this);
                    this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_grid_shimmer_container);
                    this.A00 = DbU.A0G(view, R.id.empty_grid_state_placeholder_text);
                    C51969G9p.A15(getViewLifecycleOwner(), ((C52991Ggi) this.A0D.getValue()).A02, C59097J6f.A01(this, 32), 22);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F("analyticsModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public H1K() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMH(new MMH(this, 46), 47));
        0Yh A0z = DbS.A0z(C52991Ggi.class);
        this.A0D = DbS.A0I(new MMH(A002, 48), C58690Ivz.A00(A002, this, 28), C58690Ivz.A00((Object) null, A002, 27), A0z);
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r5, int i) {
        AnonymousClass7TG.A1T(r5, view, motionEvent);
        1Xj r1 = r5.A02;
        if (r1 == null) {
            return false;
        }
        AnonymousClass2uE r0 = this.A03;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r1, i);
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1314249190);
        H1K.super.onCreate(bundle);
        this.A09 = C320236s2.A01(requireArguments(), "media_id");
        this.A08 = C320236s2.A01(requireArguments(), "grid_key");
        this.A02 = (ClipsViewerSource) C320236s2.A00(requireArguments(), ClipsViewerSource.class, "clips_viewer_source");
        String string = requireArguments().getString("analytics_module");
        if (string == null) {
            string = "pivot_page_default_clips_grid_fragment";
        }
        this.A07 = string;
        this.A0A = requireArguments().getBoolean("should_show_followed_users_profile_pictures", false);
        this.A05 = 2el.A00();
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        2el r4 = this.A05;
        if (r4 == null) {
            str = "viewpointManager";
        } else {
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                this.A04 = new C320516sV(requireContext, (C321686ua) null, new C320486sS(0.5625f, false, false), this, new C320496sT(A0l2, r4, this, str2), this, A0l, (C294875nB) null, (String) null, (String) null, false, this.A0A);
                C229352nF r1 = (C229352nF) this.A0B.getValue();
                String str3 = this.A08;
                if (str3 == null) {
                    str = "gridKey";
                } else {
                    r1.A02(str3);
                    this.A06 = 1L2.A00();
                    FragmentActivity requireActivity = requireActivity();
                    0hq parentFragmentManager = getParentFragmentManager();
                    UserSession A0l3 = AnonymousClass7TE.A0l(r3);
                    C249763kK r32 = this.A06;
                    if (r32 == null) {
                        str = "pivotPageSessionProvider";
                    } else {
                        C320516sV r12 = this.A04;
                        if (r12 == null) {
                            str = "clipsGridAdapter";
                        } else {
                            AnonymousClass2uE r16 = new AnonymousClass2uE(requireActivity, this, parentFragmentManager, A0l3, (AnonymousClass57N) null, this, r12, r32, true, true, false);
                            r16.A0B = this;
                            this.A03 = r16;
                            registerLifecycleListener(r16);
                            AnonymousClass0fD.A09(-516201960, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(304171192);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_grid_fragment, viewGroup, false);
        AnonymousClass0fD.A09(426404652, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-146182877);
        super.onDestroy();
        C229352nF r1 = (C229352nF) this.A0B.getValue();
        String str = this.A08;
        if (str == null) {
            0qQ.A0F("gridKey");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A07(str);
        AnonymousClass0fD.A09(1469383077, A022);
    }
}
