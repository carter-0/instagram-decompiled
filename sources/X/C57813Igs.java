package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Igs  reason: case insensitive filesystem */
public final class C57813Igs implements Runnable {
    public final /* synthetic */ C15295Ua1 A00;
    public final /* synthetic */ C17918Vi9 A01;

    public C57813Igs(C15295Ua1 ua1, C17918Vi9 vi9) {
        this.A00 = ua1;
        this.A01 = vi9;
    }

    public final void run() {
        C15295Ua1 ua1 = this.A00;
        FragmentActivity activity = ua1.getActivity();
        if (activity != null) {
            C59689JTv.A0F(activity, "could_not_load_canvas", 2131956757);
        }
        SpinnerImageView spinnerImageView = ua1.A05;
        if (spinnerImageView == null) {
            0qQ.A0F("spinnerImageView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            spinnerImageView.setLoadingStatus(C255943uy.FAILED);
        }
    }
}
