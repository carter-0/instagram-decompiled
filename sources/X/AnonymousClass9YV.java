package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.9YV  reason: invalid class name */
public final class AnonymousClass9YV extends C249703kE {
    public final LoadingSpinnerView A00;

    public AnonymousClass9YV(View view) {
        super(view);
        LoadingSpinnerView loadingSpinnerView = (LoadingSpinnerView) AnonymousClass7TE.A0b(view, R.id.loading_spinner);
        this.A00 = loadingSpinnerView;
        loadingSpinnerView.setLoadingStatus(JY5.LOADING);
    }
}
