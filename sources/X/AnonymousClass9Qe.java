package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.9Qe  reason: invalid class name */
public final class AnonymousClass9Qe implements C2365734g {
    public static final AnonymousClass9Qe A00 = new AnonymousClass9Qe();

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        View findViewById = view.findViewById(R.id.processing_video_spinner);
        0qQ.A0C(findViewById, "null cannot be cast to non-null type com.instagram.music.common.ui.LoadingSpinnerView");
        ((LoadingSpinnerView) findViewById).setLoadingStatus(JY5.LOADING);
    }
}
