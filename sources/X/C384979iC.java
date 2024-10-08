package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;

/* renamed from: X.9iC  reason: invalid class name and case insensitive filesystem */
public final class C384979iC extends C273374mT implements AnonymousClass8MO {
    public static final String __redex_internal_original_name = "CanvasCountdownBottomSheetFragment";
    public A3i A00;
    public WWM A01;

    public final String getModuleName() {
        return "canvas_countdown_bottom_sheet_fragment";
    }

    public final void D6Q(C19476WaO waO) {
        A3i a3i = this.A00;
        if (a3i != null) {
            C387559mP.A00(AnonymousClass57C.CREATE_MODE_VIEW_ALL_SELECTION, a3i.A00, waO);
        }
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(getContext());
        if (A02 != null) {
            A02.A0B();
        }
    }

    public final void D6e() {
        A3i a3i = this.A00;
        if (a3i != null) {
            AnonymousClass87H r0 = a3i.A00.A06;
            C317876nz r2 = C317876nz.A0f;
            AnonymousClass8BA r1 = r0.A00.A01.A03;
            if (r2.equals(r2)) {
                AnonymousClass7TF.A0M(r1).D6e();
            } else {
                0kD.A01("QuickCaptureEditController", "Unsupported sticker editor for canvas mode..");
            }
        }
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(getContext());
        if (A02 != null) {
            A02.A0B();
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.9iC, X.07Z, androidx.fragment.app.Fragment, X.4mT, X.8MO] */
    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1550788243);
        C384979iC.super.onCreate(bundle);
        WWM wwm = new WWM(requireActivity(), AnonymousClass07i.A00(this), getSession(), this, "canvas_countdown_bottom_sheet_fragment");
        this.A01 = wwm;
        wwm.A04.A00(true);
        AnonymousClass0fD.A09(-911164971, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1020377397);
        View inflate = layoutInflater.inflate(R.layout.countdown_sticker_home, viewGroup, false);
        AnonymousClass0fD.A09(-173601231, A02);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.countdown_sticker_list);
        this.A01.A00(nestableRecyclerView);
        nestableRecyclerView.setPassThroughEdge(1);
    }
}
