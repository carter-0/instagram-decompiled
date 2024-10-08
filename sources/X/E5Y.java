package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

public final class E5Y extends AnonymousClass4DH implements C74423Pud {
    public static final String __redex_internal_original_name = "QuickSnapArchivePreviewFragment";
    public AnonymousClass6ST A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = I7E.A05(this, C74118PpL.A00, R.id.quick_snap_archive_preview_image_view);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new C51765G0h(this, 16));
    public final AnonymousClass0eM A0I = AnonymousClass1YB.A00(new C51765G0h(this, 20));
    public final AnonymousClass0eM A0J;

    public final boolean Dq0() {
        return false;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass0eM r42 = this.A0E;
        int i = 0;
        DbV.A1A(requireContext(), (RecyclerView) r42.getValue());
        ((RecyclerView) r42.getValue()).setAdapter((2Rw) AnonymousClass7TE.A14(this.A0B));
        ((RecyclerView) r42.getValue()).A11(new C46855DmX(requireContext()));
        I7E.A06(AnonymousClass7TE.A0c(this.A07), DbX.A07(this.A08));
        FPC.A01(AnonymousClass7TE.A0c(this.A02), 69, this);
        FPC.A01(AnonymousClass7TE.A0c(this.A03), 70, this);
        AnonymousClass0eM r1 = this.A01;
        FP2.A00(AnonymousClass7TE.A0c(r1), 0, this);
        View A0c = AnonymousClass7TE.A0c(r1);
        if (!AnonymousClass7TF.A1Z(this.A0H)) {
            i = 8;
        }
        A0c.setVisibility(i);
        view.setOnTouchListener(new C71439Oke(this.A0I.getValue(), 12));
    }

    public final boolean Dpr() {
        C60274JiV.A00(new Fk8(false), (C60274JiV) this.A0J.getValue());
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public E5Y() {
        C51765G0h g0h = new C51765G0h(this, 21);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51765G0h(new C51765G0h(this, 17), 18));
        this.A0J = DbS.A0I(new C51765G0h(A002, 19), g0h, new MJ8(5, (Object) null, A002), DbS.A0z(C60274JiV.class));
        C51832G3q g3q = C51832G3q.A00;
        this.A04 = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_header);
        this.A06 = I7E.A05(this, new G4S(this, 39), R.id.quick_snap_archive_preview_title_stacked_avatar);
        this.A05 = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_title_single_avatar);
        this.A0A = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_title);
        this.A09 = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_timestamp);
        this.A0F = I7E.A05(this, g3q, R.id.quick_snap_reactions_title);
        this.A0D = I7E.A05(this, g3q, R.id.quick_snap_reactions_empty_text);
        this.A0E = I7E.A05(this, g3q, R.id.quick_snap_reactions_recycler_view);
        this.A0C = I7E.A05(this, g3q, R.id.quick_snap_reactions_emitter);
        this.A02 = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_exit);
        this.A03 = I7E.A05(this, g3q, R.id.quick_snap_archive_preview_more);
        this.A01 = I7E.A05(this, g3q, R.id.quick_snap_preview_camera);
        this.A08 = AnonymousClass1YB.A00(new C51765G0h(this, 14));
        this.A0G = C227642jf.A02(this);
        this.A0B = AnonymousClass1YB.A00(new C51765G0h(this, 15));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1807587460);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_preview, false);
        AnonymousClass0fD.A09(71360630, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-452102481);
        super.onDestroyView();
        ((QuickSnapReactionEmitterView) this.A0C.getValue()).A01();
        AnonymousClass0fD.A09(774622068, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(873250323);
        super.onResume();
        C317756nm.A03(requireActivity(), (Fragment) null, AnonymousClass7TE.A0l(this.A0G), false, false);
        AnonymousClass0fD.A09(2105888291, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1043380559);
        E5Y.super.onStop();
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A0G), false, false);
        AnonymousClass0fD.A09(2102092046, A022);
    }
}
