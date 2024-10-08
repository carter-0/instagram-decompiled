package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class K4E extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SmartGlassesDirectImportFragment";
    public View A00;
    public RecyclerView A01;
    public SpinnerImageView A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "direct_import_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K4E() {
        MM9 mm9 = new MM9(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MM9(new MM9(this, 14), 15));
        this.A04 = DbS.A0I(new MM9(A002, 16), mm9, new MJ9(22, (Object) null, A002), DbS.A0z(C60148JgT.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1430470273);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_gallery_smartglasses_direct_import, viewGroup, false);
        this.A00 = inflate;
        if (inflate != null) {
            this.A01 = DbZ.A0F(inflate, R.id.gallery_smartglasses_pendingmedia_hscroll_recycler_view);
            View view = this.A00;
            if (view != null) {
                this.A02 = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
                View view2 = this.A00;
                if (view2 != null) {
                    AnonymousClass0fD.A09(-510348580, A022);
                    return view2;
                }
            }
        }
        0qQ.A0F("viewContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-905148752);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-675286378, A022);
    }
}
