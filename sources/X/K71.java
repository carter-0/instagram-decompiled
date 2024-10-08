package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.List;

public final class K71 extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass723, C230222pE {
    public static final String __redex_internal_original_name = "ProfileEffectsTabFragment";
    public RecyclerView A00;
    public C55592HkC A01;
    public C55593HkD A02;
    public C60429JlM A03;
    public UserDetailTabController A04;
    public C230252pH A05;
    public AnonymousClass32A A06;
    public String A07;
    public String A08;
    public List A09;
    public 2el A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final AnonymousClass0eM A0C;
    public final ViewGroup A0D = this.A00;
    public final String A0E = AnonymousClass000.A00(3857);

    public final String BhI() {
        return C273654mx.A00(90);
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
        0qQ.A0B(userDetailTabController, 0);
        if (this.A04 == null) {
            this.A04 = userDetailTabController;
            C60271JiS.A00((C60271JiS) this.A0C.getValue());
        }
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void DqG(boolean z) {
    }

    public final void DqM() {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0I(view, R.id.camera_effect_preview_video_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        C60429JlM jlM = this.A03;
        String str = "adapter";
        if (jlM != null) {
            gridLayoutManager.A01 = new C60366JkE(jlM, 4);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                C60429JlM jlM2 = this.A03;
                if (jlM2 != null) {
                    recyclerView.A11(jlM2.A02);
                }
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(gridLayoutManager);
            }
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                C60429JlM jlM3 = this.A03;
                if (jlM3 != null) {
                    recyclerView3.setAdapter(jlM3);
                }
            }
            C60429JlM jlM4 = this.A03;
            if (jlM4 != null) {
                boolean A1b = DbT.A1b(jlM4.A05);
                RecyclerView recyclerView4 = this.A00;
                if (!A1b) {
                    AnonymousClass7TH.A0R(recyclerView4);
                } else if (recyclerView4 != null) {
                    recyclerView4.setVisibility(0);
                }
                2el r3 = this.A0A;
                if (r3 == null) {
                    str = "gridViewpointManager";
                } else {
                    r3.A08(this.A00, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
                    AnonymousClass0eM r5 = this.A0C;
                    Dba.A16(getViewLifecycleOwner(), ((C60271JiS) r5.getValue()).A01, new MP6(this, 38), 40);
                    DbZ.A1C(this, new MGZ(this, (AnonymousClass4D7) null, 8), ((C60271JiS) r5.getValue()).A06);
                    Dba.A16(getViewLifecycleOwner(), ((C60271JiS) r5.getValue()).A00, new MP6(this, 39), 40);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Fragment ACU() {
        return this;
    }

    public final ViewGroup BqB() {
        return this.A0D;
    }

    public final void DqL(boolean z) {
        AnonymousClass7TF.A16(this.A00);
        C60271JiS jiS = (C60271JiS) this.A0C.getValue();
        List list = (List) jiS.A01.A02();
        if (list == null || !AnonymousClass7TE.A1b(list)) {
            C60271JiS.A00(jiS);
        }
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public K71() {
        MMI mmi = new MMI(this, 41);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 38), 39));
        this.A0C = DbS.A0I(new MMI(A002, 40), mmi, new MMZ(38, (Object) null, (Object) A002), DbS.A0z(C60271JiS.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1622023857);
        K71.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = AnonymousClass7TF.A0b();
        String string = requireArguments.getString("profile_effect_previews_target_effect_id_count_key");
        if (string != null) {
            this.A08 = string;
            AnonymousClass0eM r3 = this.A0B;
            this.A06 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r3), new AnonymousClass328(this));
            this.A05 = 1OP.A02(this, AnonymousClass7TE.A0l(r3), (String) null);
            String str = C51971G9r.A0g(r3).A04.A0L;
            this.A0A = 2el.A00();
            UserSession A0l = AnonymousClass7TE.A0l(r3);
            2el r7 = this.A0A;
            if (r7 != null) {
                String str2 = this.A07;
                if (str2 != null) {
                    this.A02 = new C55593HkD(this, A0l, r7, this, str2, str);
                    UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                    2el r72 = this.A0A;
                    if (r72 != null) {
                        String str3 = this.A07;
                        if (str3 != null) {
                            this.A01 = new C55592HkC(this, A0l2, r72, this, str3);
                            FragmentActivity requireActivity = requireActivity();
                            UserSession A0l3 = AnonymousClass7TE.A0l(r3);
                            String str4 = this.A07;
                            if (str4 != null) {
                                this.A03 = new C60429JlM(requireActivity, this, this, this, A0l3, str4);
                                AnonymousClass0fD.A09(-1368961042, A022);
                                return;
                            }
                        }
                    }
                }
                0qQ.A0F("profileTabSessionId");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("gridViewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1293994846, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-205424851);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.camera_effect_preview_videos_layout, false);
        AnonymousClass0fD.A09(-1211598647, A022);
        return A0D2;
    }
}
