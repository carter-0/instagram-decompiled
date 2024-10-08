package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

public final class E1G extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ArchiveQuickSnapFragment";
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C362428hs A04;
    public AnonymousClass6ST A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C51765G0h(this, 10));
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass3NG r2 = new AnonymousClass3NG(AnonymousClass7TF.A0G(view, R.id.quick_snap_empty_archive_qs_camera));
        r2.A06 = false;
        r2.A04 = new C47794EHf(this, 4);
        r2.A00();
        this.A01 = view.requireViewById(R.id.quick_snap_empty_archive);
        View requireViewById = view.requireViewById(R.id.quick_snap_recap_button);
        0qQ.A0A(requireViewById);
        requireViewById.setVisibility(8);
        FPC.A01(requireViewById, 65, this);
        this.A02 = requireViewById;
        AnonymousClass2tC A0S = DbV.A0S(this);
        AnonymousClass0eM r4 = this.A06;
        A0S.A01(new EH9(this, (QuickSnapArchiveViewModel) r4.getValue()));
        A0S.A08 = true;
        A0S.A06 = AnonymousClass000.A00(465);
        this.A04 = new C362428hs(A0S.A00());
        RecyclerView A0I = DbT.A0I(view, R.id.quick_snap_archive_recycler_view);
        C362428hs r0 = this.A04;
        if (r0 != null) {
            A0I.setAdapter(r0.A01);
            GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getActivity(), 3, 1, false);
            C362428hs r02 = this.A04;
            if (r02 != null) {
                gridLayoutManager.A01 = new C362638iF(r02.A01, 3);
                A0I.setLayoutManager(gridLayoutManager);
                this.A03 = A0I;
                this.A00 = view.requireViewById(R.id.quick_snap_archive_spinner);
                ((QuickSnapArchiveViewModel) r4.getValue()).A05();
                ((QuickSnapArchiveViewModel) r4.getValue()).A04();
                07U r7 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MH5(r7, this, viewLifecycleOwner, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F("archiveAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public E1G() {
        C51765G0h g0h = new C51765G0h(this, 9);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51765G0h(new C51765G0h(this, 11), 12));
        this.A06 = DbS.A0I(new C51765G0h(A002, 13), g0h, new MJ8(4, (Object) null, A002), DbS.A0z(QuickSnapArchiveViewModel.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(506612346);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_grid, false);
        AnonymousClass0fD.A09(-1364955977, A022);
        return A0D;
    }
}
