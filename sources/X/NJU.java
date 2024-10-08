package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public final class NJU extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C74320Psw {
    public static final 0bY A0H = DbW.A0G();
    public static final String __redex_internal_original_name = "DirectThreadSharedPostsFragment";
    public RecyclerView A00;
    public C74449Pv4 A01;
    public C67816MvK A02;
    public N4P A03;
    public C68989NcK A04;
    public IgdsEmptyState A05;
    public C254793t3 A06;
    public boolean A07;
    public boolean A08;
    public GridLayoutManager A09;
    public Capabilities A0A;
    public boolean A0B;
    public final 1a8 A0C = C66580MXl.A0O();
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final C249403jg A0E = new C67837Mvh(this, 7);
    public final Ot0 A0F = new Ot0(this, 6);
    public final String A0G = "direct_thread_shared_posts";

    public final void DPu(View view, List list, int i) {
        String str;
        N3S n3s;
        String str2;
        String str3;
        List list2 = list;
        boolean A1U = AnonymousClass7TF.A1U(0, list2, view);
        Context requireContext = requireContext();
        AnonymousClass0eM r1 = this.A0D;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        FragmentActivity requireActivity = requireActivity();
        0bY r8 = A0H;
        C254793t3 r3 = this.A06;
        if (r3 == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        N4P n4p = this.A03;
        if (n4p != null) {
            str = n4p.A0Q;
        } else {
            str = null;
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(r1);
        N4P n4p2 = this.A03;
        0qQ.A0B(A0l2, 0);
        if (n4p2 != null && n4p2.A09 == 29) {
            n4p2.A0S.contains(A0l2.A06);
        }
        AnonymousClass7TF.A1C(A0l, A1U ? 1 : 0, r8);
        C71039Oa5 oa5 = (C71039Oa5) list2.get(i);
        1Xj A022 = oa5.A02();
        if (A022 != null) {
            if (182.A06(0Tu.A05, A0l, 36326275044030122L)) {
                String id = A022.getId();
                if (id != null) {
                    C52477GUf A002 = C54961HZr.A00(requireContext, A0l, A022.BR7(), (Integer) null, id, 1Xv.A04(id), str);
                    C309516Yo A0Q = DbU.A0Q(requireActivity, A0l);
                    A0Q.A0B((Bundle) null, A002);
                    A0Q.A04();
                }
            } else {
                String id2 = A022.getId();
                if (id2 != null) {
                    F3W A032 = IgFragmentFactoryImpl.A00().A03(id2);
                    if (A022.A1u() == 1sw.A04) {
                        A032.A0L = A1U;
                    }
                    C309516Yo A0Q2 = DbU.A0Q(requireActivity, A0l);
                    A0Q2.A0B((Bundle) null, A032.A01());
                    A0Q2.A04();
                }
            }
            0wc A012 = AnonymousClass0kN.A01(this, A0l);
            String A072 = C300965yF.A07(r3);
            String id3 = A022.getId();
            1iA BR7 = A022.BR7();
            int ordinal = BR7.ordinal();
            if (ordinal == 0) {
                str3 = "photo";
            } else if (ordinal == A1U) {
                str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
            } else if (ordinal != 4) {
                0wb.A03("DirectThreadSharedPostsUtil", AnonymousClass7TG.A0m(BR7, "Unsupported media type clicked here ", AnonymousClass7TE.A1A()));
                str3 = BR7.toString();
            } else {
                str3 = "carousel";
            }
            Boolean A0l3 = C66581MXm.A0l(r3);
            0qQ.A0B(A072, A1U);
            0Aj A0e = AnonymousClass7TE.A0e(A012, "direct_thread_details_reshared_media_tap");
            if (A0e.isSampled()) {
                C66580MXl.A1J(A0e, A072);
                A0e.AAJ("media_id", id3);
                A0e.AAJ("media_type", str3);
                DbS.A1N(A0e, (String) null);
                A0e.A7p("is_e2ee", A0l3);
                A0e.A7p("media_sent_pre_cutover", (Boolean) null);
                A0e.Cgf();
            }
        } else if (oa5.A06() != null) {
            Object obj = oa5.A00;
            if (obj instanceof N3S) {
                n3s = (N3S) obj;
            } else {
                n3s = null;
            }
            boolean z = false;
            if (n3s != null && n3s.A0D == A1U) {
                z = true;
            }
            if (!z || n3s == null || (str2 = n3s.A0C) == null) {
                String A062 = oa5.A06();
                if (A062 != null) {
                    Uri A013 = 0cp.A01(r8, A062);
                    if (A013 != null) {
                        Intent flags = new Intent("android.intent.action.VIEW", A013).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", A1U).putExtra(AnonymousClass000.A00(227), A1U).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
                        0qQ.A07(flags);
                        flags.setPackage(AnonymousClass000.A00(74));
                        0kR.A0A(requireContext, flags);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            C332807Wl r11 = (C332807Wl) A0l.A00(C332807Wl.class);
            if (r11 != null) {
                r11.Cqp((View) null, (ImageUrl) null, (C68168N3i) null, C66580MXl.A0i(n3s.A08, (String) null), (GradientSpinner) null, (Long) null, (Long) null, str2, n3s.A0B, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, A1U ? 1 : 0, false);
            }
        }
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131959027));
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        C254793t3 r7 = this.A06;
        if (r7 == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = new C67816MvK(requireContext, this, A0l, this, r7);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        this.A09 = gridLayoutManager;
        C67816MvK mvK = this.A02;
        if (mvK != null) {
            gridLayoutManager.A01 = new C67773MuX(mvK);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    int width = rootActivity.getWindowManager().getDefaultDisplay().getWidth();
                    C67816MvK mvK2 = this.A02;
                    if (mvK2 != null) {
                        C67816MvK.A00(mvK2, width);
                    }
                    recyclerView.setAdapter(this.A02);
                    recyclerView.setLayoutManager(this.A09);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0I(view, R.id.shared_media_list);
        this.A09 = new GridLayoutManager(requireContext(), 3);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        C254793t3 r7 = this.A06;
        if (r7 == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        C67816MvK mvK = new C67816MvK(requireContext, this, A0l, this, r7);
        this.A02 = mvK;
        GridLayoutManager gridLayoutManager = this.A09;
        if (gridLayoutManager != null) {
            gridLayoutManager.A01 = new C67773MuX(mvK);
        }
        if (this.A00 == null) {
            DbT.A1Q(0wj.A01, "DirectThreadSharedPostsFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.A09);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A02);
        }
        this.A05 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline);
    }

    public static final void A00(NJU nju) {
        GridLayoutManager gridLayoutManager = nju.A09;
        C67816MvK mvK = nju.A02;
        if (!nju.A08 && mvK != null && gridLayoutManager != null) {
            if ((mvK.getItemCount() - 1) - gridLayoutManager.A1b() <= 15) {
                nju.A08 = true;
                mvK.A04.A01(00k.A0T(C72360P2z.A00, mvK.A02), (Runnable) null);
                AnonymousClass7TH.A0R(nju.A05);
                C68989NcK ncK = nju.A04;
                if (ncK != null) {
                    C254793t3 r0 = nju.A06;
                    if (r0 == null) {
                        C66580MXl.A18();
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        ncK.A0B(C300965yF.A05(r0), (Integer) null);
                    }
                }
            }
        }
    }

    public final String getModuleName() {
        return this.A0G;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C68989NcK ncK;
        String str;
        int A022 = AnonymousClass0fD.A02(679074652);
        NJU.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            this.A06 = A002;
            O0J o0j = C68989NcK.A00;
            AnonymousClass0eM r5 = this.A0D;
            0lg A0X = DbT.A0X(r5);
            synchronized (o0j) {
                0qQ.A0B(A0X, 0);
                ncK = (C68989NcK) A0X.A01(C68989NcK.class, new C73907Pli(A0X, 30));
            }
            this.A04 = ncK;
            Parcelable parcelable = requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (parcelable != null) {
                this.A0A = (Capabilities) parcelable;
                Context requireContext = requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                C254793t3 r1 = this.A06;
                if (r1 == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities = this.A0A;
                    if (capabilities == null) {
                        str = "threadCapabilities";
                    } else {
                        this.A01 = C330397Mp.A01(requireContext, A0l, capabilities, r1);
                        this.A07 = true;
                        this.A0B = 182.A06(0Tu.A05, DbT.A0X(r5), 36315881222966926L);
                        AnonymousClass0fD.A09(399400208, A022);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1348131387;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1508548465;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-542387310);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_thread_detail_shared_photos_and_videos, viewGroup, false);
        AnonymousClass0fD.A09(739179415, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1294116334);
        this.A0C.A00.dispose();
        this.A04 = null;
        super.onDestroy();
        AnonymousClass0fD.A09(-1886246498, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2000101370);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        this.A02 = null;
        this.A00 = null;
        this.A09 = null;
        this.A0C.A01();
        this.A05 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1220713886, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(160790390);
        NJU.super.onPause();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A16(this.A0E);
        }
        DbX.A0R(this.A0D).A02(this.A0F, 2Kb.class);
        this.A0C.A01();
        C74449Pv4 pv4 = this.A01;
        if (pv4 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        pv4.BNa().stop();
        AnonymousClass0fD.A09(-354371972, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-55286156);
        super.onResume();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A0E);
        }
        DbX.A0R(this.A0D).A01(this.A0F, 2Kb.class);
        C74449Pv4 pv4 = this.A01;
        String str = "clientInfra";
        if (pv4 != null) {
            C74550Pwj.A01(pv4);
            if (this.A0B) {
                1a8 r2 = this.A0C;
                C74449Pv4 pv42 = this.A01;
                if (pv42 != null) {
                    PU8.A00(pv42.BNa().APA(), r2, this, 41);
                    C74449Pv4 pv43 = this.A01;
                    if (pv43 != null) {
                        C74550Pwj.A00(pv43);
                    }
                }
            }
            C254793t3 r0 = this.A06;
            if (r0 == null) {
                str = "threadId";
            } else {
                C254743sy A052 = C300965yF.A05(r0);
                C68989NcK ncK = this.A04;
                if (ncK != null) {
                    PU8.A00(ncK.A0A(A052, (C254743sy) null), this.A0C, this, 40);
                }
                AnonymousClass0fD.A09(-960184410, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
