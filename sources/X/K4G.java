package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import java.io.Serializable;
import java.util.List;

public final class K4G extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFilteredBottomSheetFragment";
    public AnonymousClass2t9 A00;
    public C16512UwG A01;
    public final AnonymousClass3PN A02 = new C65588LwO(this, 0);
    public final List A03 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.K4G, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass2tC A0S = DbV.A0S(this);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r4 = this.A04;
        r4.getValue();
        this.A00 = DbU.A0U(A0S, new KGY(requireActivity));
        RecyclerView A0F = DbZ.A0F(view, R.id.filtered_bottom_sheet_recycler_view);
        A0F.setLayoutManager(new GridLayoutManager(A0F.getContext(), 2));
        AnonymousClass2t9 r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("itemAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0F.setAdapter(r0);
        ImmersiveCatchUpRepository A002 = C63303Kum.A00(AnonymousClass7TE.A0l(r4));
        AnonymousClass7TE.A1Z(new C66170MGh(this, A002, (AnonymousClass4D7) null, 1), DbW.A0E(this));
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        C16512UwG uwG;
        int A022 = AnonymousClass0fD.A02(-1167723030);
        K4G.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable(AnonymousClass000.A00(1452));
        if (serializable instanceof C16512UwG) {
            uwG = (C16512UwG) serializable;
        } else {
            uwG = null;
        }
        this.A01 = uwG;
        AnonymousClass0fD.A09(1064250511, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1126383383);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.immersive_catch_up_filter_bottom_sheet_layout, false);
        AnonymousClass0fD.A09(-1728149072, A022);
        return A0D;
    }
}
