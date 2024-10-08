package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

public final class H1G extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, X7t {
    public static final String __redex_internal_original_name = "SavedAudioListFragment";
    public C52960GgD A00;
    public C234502xy A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final C320506sU A04 = new C320506sU(AnonymousClass8ZN.SAVED_AUDIO_COLLECTION, AnonymousClass7TG.A0j());

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        if (this.A02 == null) {
            r5.Eu4(true);
            r5.Eom(2131953269);
        }
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A03, 0), 36328401053039948L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_arrow_up_right_pano_outline_24;
            A0K.A05 = 2131975524;
            DbX.A19(C56802ICz.A00(this, 51), A0K, r5);
        }
    }

    public final String getModuleName() {
        return "saved_audio_list";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r0 = this.A03;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        C234502xy r11 = this.A01;
        if (r11 != null) {
            C320506sU r8 = this.A04;
            if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r0, 0), 36328555671731627L)) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A00;
            }
            Long l = null;
            U94 u94 = new U94(requireContext(), r8, this, A0l, r11, this, num, J4S.A00, false, false, false, false);
            EmptyStateView emptyStateView = (EmptyStateView) view2.findViewById(R.id.empty);
            C56802ICz A002 = C56802ICz.A00(u94, 52);
            emptyStateView.A0R(C320156rr.EMPTY, R.drawable.empty_state_save);
            C320156rr r02 = C320156rr.ERROR;
            emptyStateView.A0R(r02, R.drawable.loadmore_icon_refresh_compound);
            emptyStateView.A0N(A002, r02);
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view2.findViewById(R.id.refreshable_container);
            refreshableNestedScrollingParent.A07 = new C19764Wf5(u94, 0);
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
            DbY.A16(this, recyclerView);
            recyclerView.setAdapter(u94);
            07U r18 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new JVZ(viewLifecycleOwner, r18, this, u94, emptyStateView, recyclerView, refreshableNestedScrollingParent, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
            Bundle requireArguments = requireArguments();
            C52960GgD ggD = this.A00;
            Long l2 = null;
            if (ggD == null) {
                C51965G9l.A15();
                throw AnonymousClass00P.createAndThrow();
            }
            C55521Hj3 hj3 = ggD.A02;
            String A012 = C320236s2.A01(requireArguments, "prior_module");
            if (requireArguments.containsKey("source_audio_id")) {
                l = Long.valueOf(requireArguments.getLong("source_audio_id"));
            }
            if (requireArguments.containsKey("source_media_id")) {
                l2 = Long.valueOf(requireArguments.getLong("source_media_id"));
            }
            String string = requireArguments.getString(AnonymousClass000.A00(371));
            0qQ.A0B(A012, 0);
            0Aj A0e = AnonymousClass7TE.A0e(hj3.A00, "instagram_organic_view_saved_audio_list");
            if (A0e.isSampled()) {
                C51965G9l.A1M(A0e, A012);
                C51965G9l.A1F(A0e, l);
                C51965G9l.A1E(A0e, l2);
                C51965G9l.A1N(A0e, string);
                A0e.Cgf();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D05(C16181Uq6 uq6) {
        AudioPageMetadata audioPageMetadata = uq6.A00;
        AnonymousClass0eM r3 = this.A03;
        r3.getValue();
        C56044Hrt A0C = C250563lf.A0C(28D.A1Q);
        A0C.A08 = audioPageMetadata.A04;
        A0C.A0G = audioPageMetadata.A09;
        A0C.A0H = audioPageMetadata.A0D;
        A0C.A0I = audioPageMetadata.A0I;
        A0C.A0X = audioPageMetadata.A0F;
        C320506sU r1 = this.A04;
        A0C.A00 = r1.A02;
        A0C.A0Z = r1.getSessionId();
        A0C.A01(C363138jC.A00);
        Bundle A002 = A0C.A00();
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(requireActivity(), A002, DbT.A0X(r3), TransparentModalActivity.class, "clips_camera");
        Dbc.A0y(A022);
        A022.A0D(this, 9587);
    }

    public final void DLx(C16181Uq6 uq6) {
        C52960GgD ggD = this.A00;
        if (ggD == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7TE.A1Z(new C66168MGf((Object) uq6, (Object) ggD, (AnonymousClass4D7) null, 13), C318116oQ.A00(ggD));
    }

    public final void Dgd(C16181Uq6 uq6) {
        throw new C318126oR(002.A0R(AnonymousClass000.A00(418), "Not yet implemented - T150620514"));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.H1G, X.07g, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1047717315);
        H1G.super.onCreate(bundle);
        this.A02 = requireArguments().getString("audio_tab_type");
        Context requireContext = requireContext();
        AnonymousClass0eM r2 = this.A03;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        this.A01 = C234472xv.A00(requireContext, A0l, this, new C234462xu(requireContext(), AnonymousClass7TE.A0l(r2)), __redex_internal_original_name, C234472xv.A02(A0l));
        C52960GgD A002 = new 2YN(new H6N(DbY.A05(this), AnonymousClass7TE.A0l(r2), this.A02), this).A00(C52960GgD.class);
        this.A00 = A002;
        if (A002 == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession = A002.A01;
        if (182.A06(0Tu.A06, userSession, 36328401052777801L)) {
            C44633CiB.A00(new C58141In7(A002, 11), userSession);
        }
        AnonymousClass0fD.A09(1016353624, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(13103047);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.saved_audio_collection, viewGroup, false);
        AnonymousClass0fD.A09(-1998333522, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-996259913);
        super.onDestroy();
        C234502xy r0 = this.A01;
        if (r0 != null) {
            r0.release();
        }
        this.A01 = null;
        AnonymousClass0fD.A09(-82605182, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-478238562);
        H1G.super.onPause();
        C234502xy r1 = this.A01;
        if (r1 != null) {
            r1.EHu(false);
        }
        AnonymousClass0fD.A09(-2005331185, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        C234502xy r1;
        super.onSetUserVisibleHint(z, z2);
        if (!z && (r1 = this.A01) != null) {
            r1.EHu(false);
        }
    }
}
