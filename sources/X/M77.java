package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class M77 implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C63877LAg A01;

    public M77(RecyclerView recyclerView, C63877LAg lAg) {
        this.A01 = lAg;
        this.A00 = recyclerView;
    }

    public final void run() {
        C63877LAg lAg = this.A01;
        LFL lfl = (LFL) lAg.A04.getValue();
        if (!AnonymousClass1GD.A03() && !JWB.A01(lAg.A01)) {
            lfl.A01.requireActivity().getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
        C63926LDj lDj = (C63926LDj) lAg.A06.getValue();
        RecyclerView recyclerView = this.A00;
        DbV.A1A(recyclerView.getContext(), recyclerView);
        if (recyclerView.A12.size() == 0) {
            AnonymousClass4DH r2 = lDj.A00;
            JTP.A1D(recyclerView, AnonymousClass7TG.A02(r2.requireContext()), DbY.A01(r2.requireContext()));
        }
    }
}
