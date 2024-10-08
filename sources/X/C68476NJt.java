package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.NJt  reason: case insensitive filesystem */
public final class C68476NJt extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C74320Psw {
    public static final String __redex_internal_original_name = "DirectThreadSharedMediaFragment";
    public RecyclerView A00;
    public C67816MvK A01;
    public IgdsEmptyState A02;
    public boolean A03;
    public boolean A04;
    public GridLayoutManager A05;
    public AnonymousClass7H6 A06;
    public C68988NcJ A07;
    public DirectShareTarget A08;
    public C254743sy A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final C249403jg A0B = new C67837Mvh(this, 6);
    public final 1a8 A0C = C66580MXl.A0O();

    private final C254793t3 A00(C254743sy r7) {
        if (C66647MaG.A0F(r7)) {
            C254793t3 A082 = C66647MaG.A08(C66647MaG.A03(r7));
            if (A082 == null) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(C66647MaG.A03(r7).getClass());
                AnonymousClass7TG.A1I(0wj.A01, 002.A0T(__redex_internal_original_name, "toThreadTarget", '.'), AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(C273654mx.A00(1026), A1A)), 20134884);
            }
            return A082;
        } else if (r7 instanceof MsysThreadId) {
            return C66647MaG.A06(r7);
        } else {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append(C273654mx.A00(1412));
            A1A2.append(r7.getClass());
            A1A2.append(' ');
            AnonymousClass7TG.A1I(0wj.A01, 002.A0T(__redex_internal_original_name, "toThreadTarget", '.'), AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r7, A1A2)), 20134884);
            return null;
        }
    }

    public final void DPu(View view, List list, int i) {
        C71039Oa5 oa5;
        View view2 = view;
        AnonymousClass7TG.A1N(list, view);
        AnonymousClass0eM r4 = this.A0A;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        FragmentActivity requireActivity = requireActivity();
        C254743sy r0 = this.A09;
        String str = "threadKey";
        String str2 = null;
        if (r0 != null) {
            if (C69874Ntc.A00(requireActivity, A0l, r0)) {
                MediaViewerReplyBarEligibilityChecker mediaViewerReplyBarEligibilityChecker = (MediaViewerReplyBarEligibilityChecker) requireArguments().getSerializable("DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER");
                if (mediaViewerReplyBarEligibilityChecker == null) {
                    mediaViewerReplyBarEligibilityChecker = new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false);
                }
                if (i < list.size() && (oa5 = (C71039Oa5) 00k.A0O(list, i)) != null) {
                    str2 = oa5.A05();
                }
                Context requireContext = requireContext();
                UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                C254743sy r10 = this.A09;
                if (r10 != null) {
                    DirectShareTarget directShareTarget = this.A08;
                    AnonymousClass7H6 r8 = this.A06;
                    if (r8 == null) {
                        str = "directAggregatedMediaViewerController";
                    } else {
                        OM2 om2 = new OM2(requireContext, view2, A0l2, r8, directShareTarget, r10);
                        om2.A06 = list;
                        om2.A01 = i;
                        om2.A03 = AnonymousClass05K.A01;
                        om2.A05 = str2;
                        om2.A02 = mediaViewerReplyBarEligibilityChecker;
                        om2.A04 = AnonymousClass05K.A00;
                        om2.A00();
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

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131959023));
    }

    public final String getModuleName() {
        return "direct_thread_shared_media";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        String str;
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
        C254743sy r0 = this.A09;
        if (r0 == null) {
            str = "threadKey";
        } else {
            C67816MvK mvK = new C67816MvK(requireContext, this, A0l, this, A00(r0));
            this.A01 = mvK;
            GridLayoutManager gridLayoutManager = this.A05;
            if (gridLayoutManager == null) {
                str = "gridLayoutManager";
            } else {
                gridLayoutManager.A01 = new C67773MuX(mvK);
                Activity rootActivity = getRootActivity();
                0qQ.A0A(rootActivity);
                int width = rootActivity.getWindowManager().getDefaultDisplay().getWidth();
                C67816MvK mvK2 = this.A01;
                if (mvK2 != null) {
                    C67816MvK.A00(mvK2, width);
                }
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.A01);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0I(view, R.id.shared_media_list);
        this.A05 = new GridLayoutManager(requireContext(), 3);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
        C254743sy r0 = this.A09;
        if (r0 == null) {
            str = "threadKey";
        } else {
            C67816MvK mvK = new C67816MvK(requireContext, this, A0l, this, A00(r0));
            this.A01 = mvK;
            GridLayoutManager gridLayoutManager = this.A05;
            str = "gridLayoutManager";
            if (gridLayoutManager != null) {
                gridLayoutManager.A01 = new C67773MuX(mvK);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.A11(new C361648gZ(false, 0, DbV.A05(this).getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top), Dbb.A07(this, R.dimen.afi_indicator_arrow_margin_top), 0));
                    GridLayoutManager gridLayoutManager2 = this.A05;
                    if (gridLayoutManager2 != null) {
                        recyclerView.setLayoutManager(gridLayoutManager2);
                        recyclerView.setAdapter(this.A01);
                    }
                }
                this.A02 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C68476NJt nJt) {
        String str;
        if (!nJt.A04 && nJt.A01 != null) {
            GridLayoutManager gridLayoutManager = nJt.A05;
            if (gridLayoutManager == null) {
                str = "gridLayoutManager";
            } else {
                int A1b = gridLayoutManager.A1b();
                C67816MvK mvK = nJt.A01;
                if (mvK != null && (mvK.getItemCount() - 1) - A1b <= 15) {
                    nJt.A04 = true;
                    mvK.A04.A01(00k.A0T(C72360P2z.A00, mvK.A02), (Runnable) null);
                    AnonymousClass7TH.A0R(nJt.A02);
                    C68988NcJ ncJ = nJt.A07;
                    if (ncJ == null) {
                        str = "permanentDirectThreadMediaStore";
                    } else {
                        C254743sy r0 = nJt.A09;
                        if (r0 == null) {
                            str = "threadKey";
                        } else {
                            ncJ.A0B(r0, (Integer) null);
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
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        AnonymousClass7H6 r0 = this.A06;
        if (r0 == null) {
            return false;
        }
        return r0.A0h();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(416279579);
        C68476NJt.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        boolean z = requireArguments.getBoolean(AnonymousClass000.A00(60), false);
        C254743sy A002 = C67002Mga.A00(requireArguments, "DirectThreadSharedMediaFragment.DIRECT_THREAD_KEY");
        if (A002 != null) {
            this.A09 = A002;
            this.A08 = (DirectShareTarget) requireArguments.getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
            OIz oIz = C68988NcJ.A00;
            AnonymousClass0eM r1 = this.A0A;
            this.A07 = oIz.A00(AnonymousClass7TE.A0l(r1));
            AnonymousClass7H6 r3 = new AnonymousClass7H6(requireActivity(), AnonymousClass7TE.A0l(r1), (AnonymousClass3E6) null, 104, false, z);
            this.A06 = r3;
            registerLifecycleListener(r3);
            this.A03 = true;
            AnonymousClass0fD.A09(1360537509, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(2080165008, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(235375319);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_thread_detail_shared_photos_and_videos, viewGroup, false);
        AnonymousClass0fD.A09(1370598604, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1230778330);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A01);
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1488114324, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(509991219);
        C68476NJt.super.onPause();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A16(this.A0B);
        }
        this.A0C.A01();
        AnonymousClass0fD.A09(77515461, A022);
    }

    public final void onResume() {
        Integer num;
        int A022 = AnonymousClass0fD.A02(528194101);
        super.onResume();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A0B);
        }
        C68988NcJ ncJ = this.A07;
        String str = "permanentDirectThreadMediaStore";
        if (ncJ != null) {
            C67816MvK mvK = this.A01;
            if (mvK != null) {
                num = Integer.valueOf(mvK.A00);
            } else {
                num = null;
            }
            ncJ.A00 = num;
            1a8 r2 = this.A0C;
            C254743sy r0 = this.A09;
            if (r0 == null) {
                str = "threadKey";
            } else {
                PU8.A00(ncJ.A0A(r0, (C254743sy) null), r2, this, 39);
                AnonymousClass0fD.A09(-1520518240, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
